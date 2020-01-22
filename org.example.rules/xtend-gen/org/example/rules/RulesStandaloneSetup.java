package org.example.rules;

import org.example.rules.RulesStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RulesStandaloneSetup extends RulesStandaloneSetupGenerated {
  public static void doSetup() {
    new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
