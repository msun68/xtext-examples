package org.example.rules.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.example.rules.model.Model
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(RulesInjectorProvider)
class RulesParsingTest {
	@Inject
	ParseHelper<Model> parseHelper

	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			action delete
			
			rule A {
				filters {
					from is "A"
				}
				actions {
					delete
				}
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
