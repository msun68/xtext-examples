package org.example.rules

interface IFileMarker {
	def void mark(String fileName)
	def boolean hasMark(String fileName)
	def void clear()
}
