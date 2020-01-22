package org.example.rules.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.rules.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'action'", "'from'", "'to'", "'subject'", "'is'", "'rule'", "'{'", "'filters'", "'}'", "'actions'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRules.g"; }



     	private RulesGrammarAccess grammarAccess;

        public InternalRulesParser(TokenStream input, RulesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RulesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRules.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRules.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRules.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRules.g:71:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )* ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_0 = null;

        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalRules.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )* ) ) ) )
            // InternalRules.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )* ) ) )
            {
            // InternalRules.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )* ) ) )
            // InternalRules.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )* ) )
            {
            // InternalRules.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )* ) )
            // InternalRules.g:80:4: ( ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalRules.g:83:4: ( ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )* )
            // InternalRules.g:84:5: ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )*
            {
            // InternalRules.g:84:5: ( ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRules.g:85:3: ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) )
            	    {
            	    // InternalRules.g:85:3: ({...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ ) )
            	    // InternalRules.g:86:4: {...}? => ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRules.g:86:99: ( ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+ )
            	    // InternalRules.g:87:5: ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRules.g:90:8: ({...}? => ( (lv_actions_1_0= ruleAction ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==11) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalRules.g:90:9: {...}? => ( (lv_actions_1_0= ruleAction ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalRules.g:90:18: ( (lv_actions_1_0= ruleAction ) )
            	    	    // InternalRules.g:90:19: (lv_actions_1_0= ruleAction )
            	    	    {
            	    	    // InternalRules.g:90:19: (lv_actions_1_0= ruleAction )
            	    	    // InternalRules.g:91:9: lv_actions_1_0= ruleAction
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getActionsActionParserRuleCall_0_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_actions_1_0=ruleAction();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"actions",
            	    	    										lv_actions_1_0,
            	    	    										"org.example.rules.Rules.Action");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRules.g:113:3: ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) )
            	    {
            	    // InternalRules.g:113:3: ({...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ ) )
            	    // InternalRules.g:114:4: {...}? => ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRules.g:114:99: ( ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+ )
            	    // InternalRules.g:115:5: ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRules.g:118:8: ({...}? => ( (lv_rules_2_0= ruleRule ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==16) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalRules.g:118:9: {...}? => ( (lv_rules_2_0= ruleRule ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalRules.g:118:18: ( (lv_rules_2_0= ruleRule ) )
            	    	    // InternalRules.g:118:19: (lv_rules_2_0= ruleRule )
            	    	    {
            	    	    // InternalRules.g:118:19: (lv_rules_2_0= ruleRule )
            	    	    // InternalRules.g:119:9: lv_rules_2_0= ruleRule
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_rules_2_0=ruleRule();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"rules",
            	    	    										lv_rules_2_0,
            	    	    										"org.example.rules.Rules.Rule");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAction"
    // InternalRules.g:151:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRules.g:151:47: (iv_ruleAction= ruleAction EOF )
            // InternalRules.g:152:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRules.g:158:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRules.g:164:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRules.g:165:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRules.g:165:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRules.g:166:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalRules.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionRef"
    // InternalRules.g:192:1: entryRuleActionRef returns [EObject current=null] : iv_ruleActionRef= ruleActionRef EOF ;
    public final EObject entryRuleActionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionRef = null;


        try {
            // InternalRules.g:192:50: (iv_ruleActionRef= ruleActionRef EOF )
            // InternalRules.g:193:2: iv_ruleActionRef= ruleActionRef EOF
            {
             newCompositeNode(grammarAccess.getActionRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionRef=ruleActionRef();

            state._fsp--;

             current =iv_ruleActionRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionRef"


    // $ANTLR start "ruleActionRef"
    // InternalRules.g:199:1: ruleActionRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleActionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRules.g:205:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRules.g:206:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRules.g:206:2: ( (otherlv_0= RULE_ID ) )
            // InternalRules.g:207:3: (otherlv_0= RULE_ID )
            {
            // InternalRules.g:207:3: (otherlv_0= RULE_ID )
            // InternalRules.g:208:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getActionRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getActionRefAccess().getNodeActionCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionRef"


    // $ANTLR start "entryRuleFilter"
    // InternalRules.g:222:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalRules.g:222:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalRules.g:223:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalRules.g:229:1: ruleFilter returns [EObject current=null] : ( ( ( (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' ) ) ) otherlv_1= 'is' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token lv_element_0_1=null;
        Token lv_element_0_2=null;
        Token lv_element_0_3=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalRules.g:235:2: ( ( ( ( (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' ) ) ) otherlv_1= 'is' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalRules.g:236:2: ( ( ( (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' ) ) ) otherlv_1= 'is' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalRules.g:236:2: ( ( ( (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' ) ) ) otherlv_1= 'is' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalRules.g:237:3: ( ( (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' ) ) ) otherlv_1= 'is' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalRules.g:237:3: ( ( (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' ) ) )
            // InternalRules.g:238:4: ( (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' ) )
            {
            // InternalRules.g:238:4: ( (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' ) )
            // InternalRules.g:239:5: (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' )
            {
            // InternalRules.g:239:5: (lv_element_0_1= 'from' | lv_element_0_2= 'to' | lv_element_0_3= 'subject' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRules.g:240:6: lv_element_0_1= 'from'
                    {
                    lv_element_0_1=(Token)match(input,12,FOLLOW_5); 

                    						newLeafNode(lv_element_0_1, grammarAccess.getFilterAccess().getElementFromKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    						setWithLastConsumed(current, "element", lv_element_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRules.g:251:6: lv_element_0_2= 'to'
                    {
                    lv_element_0_2=(Token)match(input,13,FOLLOW_5); 

                    						newLeafNode(lv_element_0_2, grammarAccess.getFilterAccess().getElementToKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    						setWithLastConsumed(current, "element", lv_element_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRules.g:262:6: lv_element_0_3= 'subject'
                    {
                    lv_element_0_3=(Token)match(input,14,FOLLOW_5); 

                    						newLeafNode(lv_element_0_3, grammarAccess.getFilterAccess().getElementSubjectKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    						setWithLastConsumed(current, "element", lv_element_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterAccess().getIsKeyword_1());
            		
            // InternalRules.g:279:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalRules.g:280:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalRules.g:280:4: (lv_value_2_0= RULE_STRING )
            // InternalRules.g:281:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getFilterAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleRule"
    // InternalRules.g:301:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRules.g:301:45: (iv_ruleRule= ruleRule EOF )
            // InternalRules.g:302:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRules.g:308:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filters' otherlv_4= '{' ( (lv_filters_5_0= ruleFilter ) )+ otherlv_6= '}' otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleActionRef ) )+ otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_filters_5_0 = null;

        EObject lv_actions_9_0 = null;



        	enterRule();

        try {
            // InternalRules.g:314:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filters' otherlv_4= '{' ( (lv_filters_5_0= ruleFilter ) )+ otherlv_6= '}' otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleActionRef ) )+ otherlv_10= '}' otherlv_11= '}' ) )
            // InternalRules.g:315:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filters' otherlv_4= '{' ( (lv_filters_5_0= ruleFilter ) )+ otherlv_6= '}' otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleActionRef ) )+ otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalRules.g:315:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filters' otherlv_4= '{' ( (lv_filters_5_0= ruleFilter ) )+ otherlv_6= '}' otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleActionRef ) )+ otherlv_10= '}' otherlv_11= '}' )
            // InternalRules.g:316:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filters' otherlv_4= '{' ( (lv_filters_5_0= ruleFilter ) )+ otherlv_6= '}' otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleActionRef ) )+ otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalRules.g:320:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:321:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:321:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:322:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getFiltersKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRules.g:350:3: ( (lv_filters_5_0= ruleFilter ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=12 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRules.g:351:4: (lv_filters_5_0= ruleFilter )
            	    {
            	    // InternalRules.g:351:4: (lv_filters_5_0= ruleFilter )
            	    // InternalRules.g:352:5: lv_filters_5_0= ruleFilter
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getFiltersFilterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_filters_5_0=ruleFilter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"filters",
            	    						lv_filters_5_0,
            	    						"org.example.rules.Rules.Filter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getActionsKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalRules.g:381:3: ( (lv_actions_9_0= ruleActionRef ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRules.g:382:4: (lv_actions_9_0= ruleActionRef )
            	    {
            	    // InternalRules.g:382:4: (lv_actions_9_0= ruleActionRef )
            	    // InternalRules.g:383:5: lv_actions_9_0= ruleActionRef
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getActionsActionRefParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_actions_9_0=ruleActionRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_9_0,
            	    						"org.example.rules.Rules.ActionRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000087000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});

}
