package org.example.rules.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.IResourceDescriptionsProvider
import org.example.rules.model.ModelPackage
import org.example.rules.model.Rule
import org.example.rules.IFileMarker
import org.apache.log4j.Logger

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RulesGenerator extends AbstractGenerator {

	val static LOGGER = Logger.getLogger(RulesGenerator)

	@Inject IFileMarker marker
	@Inject IResourceDescriptionsProvider index

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (!marker.hasMark('rules.txt')) {
			marker.mark('rules.txt')
			val rules = resource.<Rule>getExportedObjectsByType(ModelPackage.Literals.RULE)
			fsa.generateFile('rules.txt', rules.map[name].sort.join(', '))
			LOGGER.error('rules.txt')
		}
	}

	def <T> Iterable<T> getExportedObjectsByType(Resource resource, EClass type) {
		index.getResourceDescriptions(resource.resourceSet).getExportedObjectsByType(type).map[
			EcoreUtil2.resolve(EObjectOrProxy, resource.resourceSet) as T
		]
	}
}
