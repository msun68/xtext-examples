package org.example.rules;

@SuppressWarnings("all")
public interface IFileMarker {
  public abstract void mark(final String fileName);
  
  public abstract boolean hasMark(final String fileName);
  
  public abstract void clear();
}
