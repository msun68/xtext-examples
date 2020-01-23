package org.example.rules.ui;

import com.google.inject.Inject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.example.rules.FileMarker;

@SuppressWarnings("all")
public class RulesBuilderParticipant extends BuilderParticipant {
  @Inject
  private FileMarker marker;
  
  @Override
  public void build(final IXtextBuilderParticipant.IBuildContext context, final IProgressMonitor monitor) throws CoreException {
    this.marker.clear();
    super.build(context, monitor);
  }
}
