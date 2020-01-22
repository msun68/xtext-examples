/*
 * generated by Xtext 2.20.0
 */
package org.example.rules.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RulesGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.rules.Rules.Model");
		private final UnorderedGroup cUnorderedGroup = (UnorderedGroup)rule.eContents().get(1);
		private final Assignment cActionsAssignment_0 = (Assignment)cUnorderedGroup.eContents().get(0);
		private final RuleCall cActionsActionParserRuleCall_0_0 = (RuleCall)cActionsAssignment_0.eContents().get(0);
		private final Assignment cRulesAssignment_1 = (Assignment)cUnorderedGroup.eContents().get(1);
		private final RuleCall cRulesRuleParserRuleCall_1_0 = (RuleCall)cRulesAssignment_1.eContents().get(0);
		
		//Model:
		//	actions+=Action* & rules+=Rule*;
		@Override public ParserRule getRule() { return rule; }
		
		//actions+=Action* & rules+=Rule*
		public UnorderedGroup getUnorderedGroup() { return cUnorderedGroup; }
		
		//actions+=Action*
		public Assignment getActionsAssignment_0() { return cActionsAssignment_0; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_0_0() { return cActionsActionParserRuleCall_0_0; }
		
		//rules+=Rule*
		public Assignment getRulesAssignment_1() { return cRulesAssignment_1; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_1_0() { return cRulesRuleParserRuleCall_1_0; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.rules.Rules.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Action:
		//	'action' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'action' name=ID
		public Group getGroup() { return cGroup; }
		
		//'action'
		public Keyword getActionKeyword_0() { return cActionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ActionRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.rules.Rules.ActionRef");
		private final Assignment cNodeAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cNodeActionCrossReference_0 = (CrossReference)cNodeAssignment.eContents().get(0);
		private final RuleCall cNodeActionIDTerminalRuleCall_0_1 = (RuleCall)cNodeActionCrossReference_0.eContents().get(1);
		
		//ActionRef:
		//	node=[Action];
		@Override public ParserRule getRule() { return rule; }
		
		//node=[Action]
		public Assignment getNodeAssignment() { return cNodeAssignment; }
		
		//[Action]
		public CrossReference getNodeActionCrossReference_0() { return cNodeActionCrossReference_0; }
		
		//ID
		public RuleCall getNodeActionIDTerminalRuleCall_0_1() { return cNodeActionIDTerminalRuleCall_0_1; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.rules.Rules.Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cElementAlternatives_0_0 = (Alternatives)cElementAssignment_0.eContents().get(0);
		private final Keyword cElementFromKeyword_0_0_0 = (Keyword)cElementAlternatives_0_0.eContents().get(0);
		private final Keyword cElementToKeyword_0_0_1 = (Keyword)cElementAlternatives_0_0.eContents().get(1);
		private final Keyword cElementSubjectKeyword_0_0_2 = (Keyword)cElementAlternatives_0_0.eContents().get(2);
		private final Keyword cIsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Filter:
		//	element=('from' | 'to' | 'subject') 'is' value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//element=('from' | 'to' | 'subject') 'is' value=STRING
		public Group getGroup() { return cGroup; }
		
		//element=('from' | 'to' | 'subject')
		public Assignment getElementAssignment_0() { return cElementAssignment_0; }
		
		//('from' | 'to' | 'subject')
		public Alternatives getElementAlternatives_0_0() { return cElementAlternatives_0_0; }
		
		//'from'
		public Keyword getElementFromKeyword_0_0_0() { return cElementFromKeyword_0_0_0; }
		
		//'to'
		public Keyword getElementToKeyword_0_0_1() { return cElementToKeyword_0_0_1; }
		
		//'subject'
		public Keyword getElementSubjectKeyword_0_0_2() { return cElementSubjectKeyword_0_0_2; }
		
		//'is'
		public Keyword getIsKeyword_1() { return cIsKeyword_1; }
		
		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.rules.Rules.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFiltersKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cFiltersAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFiltersFilterParserRuleCall_5_0 = (RuleCall)cFiltersAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cActionsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cLeftCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cActionsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cActionsActionRefParserRuleCall_9_0 = (RuleCall)cActionsAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Rule:
		//	'rule' name=ID '{'
		//	'filters' '{'
		//	filters+=Filter+
		//	'}'
		//	'actions' '{'
		//	actions+=ActionRef+
		//	'}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'rule' name=ID '{' 'filters' '{' filters+=Filter+ '}' 'actions' '{' actions+=ActionRef+ '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'rule'
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'filters'
		public Keyword getFiltersKeyword_3() { return cFiltersKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//filters+=Filter+
		public Assignment getFiltersAssignment_5() { return cFiltersAssignment_5; }
		
		//Filter
		public RuleCall getFiltersFilterParserRuleCall_5_0() { return cFiltersFilterParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'actions'
		public Keyword getActionsKeyword_7() { return cActionsKeyword_7; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_8() { return cLeftCurlyBracketKeyword_8; }
		
		//actions+=ActionRef+
		public Assignment getActionsAssignment_9() { return cActionsAssignment_9; }
		
		//ActionRef
		public RuleCall getActionsActionRefParserRuleCall_9_0() { return cActionsActionRefParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}
	
	
	private final ModelElements pModel;
	private final ActionElements pAction;
	private final ActionRefElements pActionRef;
	private final FilterElements pFilter;
	private final RuleElements pRule;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RulesGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAction = new ActionElements();
		this.pActionRef = new ActionRefElements();
		this.pFilter = new FilterElements();
		this.pRule = new RuleElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.example.rules.Rules".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	actions+=Action* & rules+=Rule*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Action:
	//	'action' name=ID;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//ActionRef:
	//	node=[Action];
	public ActionRefElements getActionRefAccess() {
		return pActionRef;
	}
	
	public ParserRule getActionRefRule() {
		return getActionRefAccess().getRule();
	}
	
	//Filter:
	//	element=('from' | 'to' | 'subject') 'is' value=STRING;
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//Rule:
	//	'rule' name=ID '{'
	//	'filters' '{'
	//	filters+=Filter+
	//	'}'
	//	'actions' '{'
	//	actions+=ActionRef+
	//	'}'
	//	'}';
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}