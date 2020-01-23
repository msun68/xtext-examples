package org.example.rules;

import com.google.inject.Singleton;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.example.rules.IFileMarker;

@Singleton
@SuppressWarnings("all")
public class FileMarker implements IFileMarker {
  private final HashMap<String, Boolean> m = CollectionLiterals.<String, Boolean>newHashMap();
  
  @Override
  public void mark(final String fileName) {
    this.m.put(fileName, Boolean.valueOf(true));
  }
  
  @Override
  public boolean hasMark(final String fileName) {
    return (this.m.containsKey(fileName) && (this.m.get(fileName)).booleanValue());
  }
  
  @Override
  public void clear() {
    this.m.clear();
  }
}
