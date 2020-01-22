package org.example.rules.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.example.rules.RulesRuntimeModule
import org.example.rules.RulesStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RulesIdeSetup extends RulesStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RulesRuntimeModule, new RulesIdeModule))
	}
	
}
