package org.example.rules.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.builder.IXtextBuilderParticipant

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class RulesUiModule extends AbstractRulesUiModule {

	override Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
		RulesBuilderParticipant
	}

}
