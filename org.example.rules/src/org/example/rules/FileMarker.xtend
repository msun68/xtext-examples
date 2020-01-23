package org.example.rules

import org.example.rules.IFileMarker
import com.google.inject.Singleton

@Singleton
class FileMarker implements IFileMarker {

	val m = <String, Boolean>newHashMap

	override mark(String fileName) {
		m.put(fileName, true)
	}

	override hasMark(String fileName) {
		m.containsKey(fileName) && m.get(fileName)
	}

	override clear() {
		m.clear
	}

}
