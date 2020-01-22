package org.example.rules.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.example.rules.model.Action
import org.example.rules.model.ActionRef
import org.example.rules.model.Filter
import org.example.rules.model.Model
import org.example.rules.model.Rule
import org.example.rules.services.RulesGrammarAccess

import static org.example.rules.model.ModelPackage.Literals.*

class RulesFormatter extends AbstractFormatter2 {

	@Inject extension RulesGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		for (action : model.actions) {
			action.format
		}
		for (rule : model.rules) {
			rule.format
		}
	}

	def dispatch void format(Action action, extension IFormattableDocument document) {
		action.regionFor.keyword(actionAccess.actionKeyword_0).prepend[noSpace].append[oneSpace]
		action.regionFor.feature(ACTION__NAME).prepend[oneSpace].append[noSpace]
		action.append[setNewLines(2)]
	}

	def dispatch void format(Rule rule, extension IFormattableDocument document) {
		interior(
			rule.regionFor.keyword(ruleAccess.leftCurlyBracketKeyword_2).append[newLine],
			rule.regionFor.keyword(ruleAccess.rightCurlyBracketKeyword_11),
			[indent]
		)
		interior(
			rule.regionFor.keyword(ruleAccess.leftCurlyBracketKeyword_4).append[newLine],
			rule.regionFor.keyword(ruleAccess.rightCurlyBracketKeyword_6).append[newLine],
			[indent]
		)
		interior(
			rule.regionFor.keyword(ruleAccess.leftCurlyBracketKeyword_8).append[newLine],
			rule.regionFor.keyword(ruleAccess.rightCurlyBracketKeyword_10).append[newLine],
			[indent]
		)
		for (filter : rule.filters) {
			filter.format
		}
		for (actionRef : rule.actions) {
			actionRef.format
		}
		rule.append[setNewLines(2)]
	}

	def dispatch void format(Filter filter, extension IFormattableDocument document) {
		filter.regionFor.keyword(filterAccess.isKeyword_1).surround[oneSpace]
		filter.append[newLine]
	}

	def dispatch void format(ActionRef actionRef, extension IFormattableDocument document) {
		actionRef.append[newLine]
	}
}
