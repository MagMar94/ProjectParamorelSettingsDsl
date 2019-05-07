package org.xtext.projectparamorel.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.projectparamorel.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'I'", "'want'", "'my'", "'preferences'", "'to'", "'by'", "'a'", "'weight'", "'of'", "'.'", "'reward'", "'punish'", "'deletion'", "'shorterSequencesOfActions'", "'longerSequencesOfActions'", "'repairingLowerInTheContextHierarchies'", "'repairingHigherInTheContextHierarchies'", "'modificationOfTheOriginalModel'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Experience";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExperience"
    // InternalDsl.g:64:1: entryRuleExperience returns [EObject current=null] : iv_ruleExperience= ruleExperience EOF ;
    public final EObject entryRuleExperience() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperience = null;


        try {
            // InternalDsl.g:64:51: (iv_ruleExperience= ruleExperience EOF )
            // InternalDsl.g:65:2: iv_ruleExperience= ruleExperience EOF
            {
             newCompositeNode(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperience=ruleExperience();

            state._fsp--;

             current =iv_ruleExperience; 
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
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalDsl.g:71:1: ruleExperience returns [EObject current=null] : ( (lv_entries_0_0= ruleEntry ) )* ;
    public final EObject ruleExperience() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_entries_0_0= ruleEntry ) )* )
            // InternalDsl.g:78:2: ( (lv_entries_0_0= ruleEntry ) )*
            {
            // InternalDsl.g:78:2: ( (lv_entries_0_0= ruleEntry ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:79:3: (lv_entries_0_0= ruleEntry )
            	    {
            	    // InternalDsl.g:79:3: (lv_entries_0_0= ruleEntry )
            	    // InternalDsl.g:80:4: lv_entries_0_0= ruleEntry
            	    {

            	    				newCompositeNode(grammarAccess.getExperienceAccess().getEntriesEntryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entries_0_0=ruleEntry();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getExperienceRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entries",
            	    					lv_entries_0_0,
            	    					"org.xtext.projectparamorel.dsl.Dsl.Entry");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleExperience"


    // $ANTLR start "entryRuleEntry"
    // InternalDsl.g:100:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalDsl.g:100:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalDsl.g:101:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalDsl.g:107:1: ruleEntry returns [EObject current=null] : this_Metric_0= ruleMetric ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        EObject this_Metric_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: (this_Metric_0= ruleMetric )
            // InternalDsl.g:114:2: this_Metric_0= ruleMetric
            {

            		newCompositeNode(grammarAccess.getEntryAccess().getMetricParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Metric_0=ruleMetric();

            state._fsp--;


            		current = this_Metric_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleMetric"
    // InternalDsl.g:125:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalDsl.g:125:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalDsl.g:126:2: iv_ruleMetric= ruleMetric EOF
            {
             newCompositeNode(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetric=ruleMetric();

            state._fsp--;

             current =iv_ruleMetric; 
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
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalDsl.g:132:1: ruleMetric returns [EObject current=null] : (otherlv_0= 'I' otherlv_1= 'want' otherlv_2= 'my' otherlv_3= 'preferences' otherlv_4= 'to' ( (lv_state_5_0= ruleStateOption ) ) ( (lv_name_6_0= ruleQualifiedName ) ) otherlv_7= 'by' otherlv_8= 'a' otherlv_9= 'weight' otherlv_10= 'of' ( (lv_weight_11_0= RULE_INT ) ) otherlv_12= '.' ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_weight_11_0=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_state_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:138:2: ( (otherlv_0= 'I' otherlv_1= 'want' otherlv_2= 'my' otherlv_3= 'preferences' otherlv_4= 'to' ( (lv_state_5_0= ruleStateOption ) ) ( (lv_name_6_0= ruleQualifiedName ) ) otherlv_7= 'by' otherlv_8= 'a' otherlv_9= 'weight' otherlv_10= 'of' ( (lv_weight_11_0= RULE_INT ) ) otherlv_12= '.' ) )
            // InternalDsl.g:139:2: (otherlv_0= 'I' otherlv_1= 'want' otherlv_2= 'my' otherlv_3= 'preferences' otherlv_4= 'to' ( (lv_state_5_0= ruleStateOption ) ) ( (lv_name_6_0= ruleQualifiedName ) ) otherlv_7= 'by' otherlv_8= 'a' otherlv_9= 'weight' otherlv_10= 'of' ( (lv_weight_11_0= RULE_INT ) ) otherlv_12= '.' )
            {
            // InternalDsl.g:139:2: (otherlv_0= 'I' otherlv_1= 'want' otherlv_2= 'my' otherlv_3= 'preferences' otherlv_4= 'to' ( (lv_state_5_0= ruleStateOption ) ) ( (lv_name_6_0= ruleQualifiedName ) ) otherlv_7= 'by' otherlv_8= 'a' otherlv_9= 'weight' otherlv_10= 'of' ( (lv_weight_11_0= RULE_INT ) ) otherlv_12= '.' )
            // InternalDsl.g:140:3: otherlv_0= 'I' otherlv_1= 'want' otherlv_2= 'my' otherlv_3= 'preferences' otherlv_4= 'to' ( (lv_state_5_0= ruleStateOption ) ) ( (lv_name_6_0= ruleQualifiedName ) ) otherlv_7= 'by' otherlv_8= 'a' otherlv_9= 'weight' otherlv_10= 'of' ( (lv_weight_11_0= RULE_INT ) ) otherlv_12= '.'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricAccess().getIKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMetricAccess().getWantKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getMyKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMetricAccess().getPreferencesKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMetricAccess().getToKeyword_4());
            		
            // InternalDsl.g:160:3: ( (lv_state_5_0= ruleStateOption ) )
            // InternalDsl.g:161:4: (lv_state_5_0= ruleStateOption )
            {
            // InternalDsl.g:161:4: (lv_state_5_0= ruleStateOption )
            // InternalDsl.g:162:5: lv_state_5_0= ruleStateOption
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getStateStateOptionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_state_5_0=ruleStateOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_5_0,
            						"org.xtext.projectparamorel.dsl.Dsl.StateOption");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:179:3: ( (lv_name_6_0= ruleQualifiedName ) )
            // InternalDsl.g:180:4: (lv_name_6_0= ruleQualifiedName )
            {
            // InternalDsl.g:180:4: (lv_name_6_0= ruleQualifiedName )
            // InternalDsl.g:181:5: lv_name_6_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getNameQualifiedNameParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_6_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.projectparamorel.dsl.Dsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getMetricAccess().getByKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getMetricAccess().getAKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getMetricAccess().getWeightKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getMetricAccess().getOfKeyword_10());
            		
            // InternalDsl.g:214:3: ( (lv_weight_11_0= RULE_INT ) )
            // InternalDsl.g:215:4: (lv_weight_11_0= RULE_INT )
            {
            // InternalDsl.g:215:4: (lv_weight_11_0= RULE_INT )
            // InternalDsl.g:216:5: lv_weight_11_0= RULE_INT
            {
            lv_weight_11_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_weight_11_0, grammarAccess.getMetricAccess().getWeightINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetricRule());
            					}
            					setWithLastConsumed(
            						current,
            						"weight",
            						lv_weight_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMetricAccess().getFullStopKeyword_12());
            		

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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleStateOption"
    // InternalDsl.g:240:1: entryRuleStateOption returns [String current=null] : iv_ruleStateOption= ruleStateOption EOF ;
    public final String entryRuleStateOption() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStateOption = null;


        try {
            // InternalDsl.g:240:51: (iv_ruleStateOption= ruleStateOption EOF )
            // InternalDsl.g:241:2: iv_ruleStateOption= ruleStateOption EOF
            {
             newCompositeNode(grammarAccess.getStateOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateOption=ruleStateOption();

            state._fsp--;

             current =iv_ruleStateOption.getText(); 
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
    // $ANTLR end "entryRuleStateOption"


    // $ANTLR start "ruleStateOption"
    // InternalDsl.g:247:1: ruleStateOption returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'reward' | kw= 'punish' ) ;
    public final AntlrDatatypeRuleToken ruleStateOption() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:253:2: ( (kw= 'reward' | kw= 'punish' ) )
            // InternalDsl.g:254:2: (kw= 'reward' | kw= 'punish' )
            {
            // InternalDsl.g:254:2: (kw= 'reward' | kw= 'punish' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:255:3: kw= 'reward'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateOptionAccess().getRewardKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:261:3: kw= 'punish'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateOptionAccess().getPunishKeyword_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleStateOption"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDsl.g:270:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDsl.g:270:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDsl.g:271:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDsl.g:277:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'deletion' | kw= 'shorterSequencesOfActions' | kw= 'longerSequencesOfActions' | kw= 'repairingLowerInTheContextHierarchies' | kw= 'repairingHigherInTheContextHierarchies' | kw= 'modificationOfTheOriginalModel' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:283:2: ( (kw= 'deletion' | kw= 'shorterSequencesOfActions' | kw= 'longerSequencesOfActions' | kw= 'repairingLowerInTheContextHierarchies' | kw= 'repairingHigherInTheContextHierarchies' | kw= 'modificationOfTheOriginalModel' ) )
            // InternalDsl.g:284:2: (kw= 'deletion' | kw= 'shorterSequencesOfActions' | kw= 'longerSequencesOfActions' | kw= 'repairingLowerInTheContextHierarchies' | kw= 'repairingHigherInTheContextHierarchies' | kw= 'modificationOfTheOriginalModel' )
            {
            // InternalDsl.g:284:2: (kw= 'deletion' | kw= 'shorterSequencesOfActions' | kw= 'longerSequencesOfActions' | kw= 'repairingLowerInTheContextHierarchies' | kw= 'repairingHigherInTheContextHierarchies' | kw= 'modificationOfTheOriginalModel' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case 27:
                {
                alt3=5;
                }
                break;
            case 28:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:285:3: kw= 'deletion'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getDeletionKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:291:3: kw= 'shorterSequencesOfActions'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getShorterSequencesOfActionsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:297:3: kw= 'longerSequencesOfActions'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getLongerSequencesOfActionsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:303:3: kw= 'repairingLowerInTheContextHierarchies'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getRepairingLowerInTheContextHierarchiesKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:309:3: kw= 'repairingHigherInTheContextHierarchies'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getRepairingHigherInTheContextHierarchiesKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:315:3: kw= 'modificationOfTheOriginalModel'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getModificationOfTheOriginalModelKeyword_5());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});

}