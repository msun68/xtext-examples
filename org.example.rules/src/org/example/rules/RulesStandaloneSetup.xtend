package org.example.rules


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RulesStandaloneSetup extends RulesStandaloneSetupGenerated {

	def static void doSetup() {
		new RulesStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
