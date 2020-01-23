package org.example.rules.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.example.rules.ui.AbstractRulesUiModule;
import org.example.rules.ui.RulesBuilderParticipant;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class RulesUiModule extends AbstractRulesUiModule {
  @Override
  public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
    return RulesBuilderParticipant.class;
  }
  
  public RulesUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
