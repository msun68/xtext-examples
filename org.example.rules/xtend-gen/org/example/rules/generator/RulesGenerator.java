package org.example.rules.generator;

import com.google.inject.Inject;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.rules.IFileMarker;
import org.example.rules.model.ModelPackage;
import org.example.rules.model.Rule;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RulesGenerator extends AbstractGenerator {
  private static final Logger LOGGER = Logger.getLogger(RulesGenerator.class);
  
  @Inject
  private IFileMarker marker;
  
  @Inject
  private IResourceDescriptionsProvider index;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    boolean _hasMark = this.marker.hasMark("rules.txt");
    boolean _not = (!_hasMark);
    if (_not) {
      this.marker.mark("rules.txt");
      final Iterable<Rule> rules = this.<Rule>getExportedObjectsByType(resource, ModelPackage.Literals.RULE);
      final Function1<Rule, String> _function = (Rule it) -> {
        return it.getName();
      };
      fsa.generateFile("rules.txt", IterableExtensions.join(IterableExtensions.<String>sort(IterableExtensions.<Rule, String>map(rules, _function)), ", "));
      RulesGenerator.LOGGER.error("rules.txt");
    }
  }
  
  public <T extends Object> Iterable<T> getExportedObjectsByType(final Resource resource, final EClass type) {
    final Function1<IEObjectDescription, T> _function = (IEObjectDescription it) -> {
      EObject _resolve = EcoreUtil2.resolve(it.getEObjectOrProxy(), resource.getResourceSet());
      return ((T) _resolve);
    };
    return IterableExtensions.<IEObjectDescription, T>map(this.index.getResourceDescriptions(resource.getResourceSet()).getExportedObjectsByType(type), _function);
  }
}
