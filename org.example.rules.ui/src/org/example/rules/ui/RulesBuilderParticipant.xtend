package org.example.rules.ui

import com.google.inject.Inject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.xtext.builder.BuilderParticipant
import org.example.rules.FileMarker

class RulesBuilderParticipant extends BuilderParticipant {

	@Inject FileMarker marker

	override void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		marker.clear()
		super.build(context, monitor)
	}

}
