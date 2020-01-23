package org.example.rules;

import org.example.rules.AbstractRulesRuntimeModule;
import org.example.rules.FileMarker;
import org.example.rules.IFileMarker;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class RulesRuntimeModule extends AbstractRulesRuntimeModule {
  public Class<? extends IFileMarker> bindIFileMarker() {
    return FileMarker.class;
  }
}
