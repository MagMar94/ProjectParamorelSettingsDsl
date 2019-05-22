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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'by'", "'weight'", "'.'", "'Reward'", "'Punish'", "'deletion'", "'shorterSequencesOfActions'", "'longerSequencesOfActions'", "'repairingLowerInTheContextHierarchies'", "'repairingHigherInTheContextHierarchies'", "'modificationOfTheOriginalModel'"
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
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;
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
        	return "Preference";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePreference"
    // InternalDsl.g:64:1: entryRulePreference returns [EObject current=null] : iv_rulePreference= rulePreference EOF ;
    public final EObject entryRulePreference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreference = null;


        try {
            // InternalDsl.g:64:51: (iv_rulePreference= rulePreference EOF )
            // InternalDsl.g:65:2: iv_rulePreference= rulePreference EOF
            {
             newCompositeNode(grammarAccess.getPreferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreference=rulePreference();

            state._fsp--;

             current =iv_rulePreference; 
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
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // InternalDsl.g:71:1: rulePreference returns [EObject current=null] : ( (lv_scores_0_0= ruleScore ) )* ;
    public final EObject rulePreference() throws RecognitionException {
        EObject current = null;

        EObject lv_scores_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_scores_0_0= ruleScore ) )* )
            // InternalDsl.g:78:2: ( (lv_scores_0_0= ruleScore ) )*
            {
            // InternalDsl.g:78:2: ( (lv_scores_0_0= ruleScore ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:79:3: (lv_scores_0_0= ruleScore )
            	    {
            	    // InternalDsl.g:79:3: (lv_scores_0_0= ruleScore )
            	    // InternalDsl.g:80:4: lv_scores_0_0= ruleScore
            	    {

            	    				newCompositeNode(grammarAccess.getPreferenceAccess().getScoresScoreParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_scores_0_0=ruleScore();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPreferenceRule());
            	    				}
            	    				add(
            	    					current,
            	    					"scores",
            	    					lv_scores_0_0,
            	    					"org.xtext.projectparamorel.dsl.Dsl.Score");
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
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRuleScore"
    // InternalDsl.g:100:1: entryRuleScore returns [EObject current=null] : iv_ruleScore= ruleScore EOF ;
    public final EObject entryRuleScore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScore = null;


        try {
            // InternalDsl.g:100:46: (iv_ruleScore= ruleScore EOF )
            // InternalDsl.g:101:2: iv_ruleScore= ruleScore EOF
            {
             newCompositeNode(grammarAccess.getScoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScore=ruleScore();

            state._fsp--;

             current =iv_ruleScore; 
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
    // $ANTLR end "entryRuleScore"


    // $ANTLR start "ruleScore"
    // InternalDsl.g:107:1: ruleScore returns [EObject current=null] : ( ( (lv_category_0_0= ruleStateOption ) ) ( (lv_feature_1_0= ruleQualifiedName ) ) otherlv_2= 'by' otherlv_3= 'weight' ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '.' ) ;
    public final EObject ruleScore() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_category_0_0 = null;

        AntlrDatatypeRuleToken lv_feature_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: ( ( ( (lv_category_0_0= ruleStateOption ) ) ( (lv_feature_1_0= ruleQualifiedName ) ) otherlv_2= 'by' otherlv_3= 'weight' ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '.' ) )
            // InternalDsl.g:114:2: ( ( (lv_category_0_0= ruleStateOption ) ) ( (lv_feature_1_0= ruleQualifiedName ) ) otherlv_2= 'by' otherlv_3= 'weight' ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '.' )
            {
            // InternalDsl.g:114:2: ( ( (lv_category_0_0= ruleStateOption ) ) ( (lv_feature_1_0= ruleQualifiedName ) ) otherlv_2= 'by' otherlv_3= 'weight' ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '.' )
            // InternalDsl.g:115:3: ( (lv_category_0_0= ruleStateOption ) ) ( (lv_feature_1_0= ruleQualifiedName ) ) otherlv_2= 'by' otherlv_3= 'weight' ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '.'
            {
            // InternalDsl.g:115:3: ( (lv_category_0_0= ruleStateOption ) )
            // InternalDsl.g:116:4: (lv_category_0_0= ruleStateOption )
            {
            // InternalDsl.g:116:4: (lv_category_0_0= ruleStateOption )
            // InternalDsl.g:117:5: lv_category_0_0= ruleStateOption
            {

            					newCompositeNode(grammarAccess.getScoreAccess().getCategoryStateOptionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_category_0_0=ruleStateOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreRule());
            					}
            					set(
            						current,
            						"category",
            						lv_category_0_0,
            						"org.xtext.projectparamorel.dsl.Dsl.StateOption");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:134:3: ( (lv_feature_1_0= ruleQualifiedName ) )
            // InternalDsl.g:135:4: (lv_feature_1_0= ruleQualifiedName )
            {
            // InternalDsl.g:135:4: (lv_feature_1_0= ruleQualifiedName )
            // InternalDsl.g:136:5: lv_feature_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getScoreAccess().getFeatureQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_feature_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreRule());
            					}
            					set(
            						current,
            						"feature",
            						lv_feature_1_0,
            						"org.xtext.projectparamorel.dsl.Dsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getScoreAccess().getByKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getScoreAccess().getWeightKeyword_3());
            		
            // InternalDsl.g:161:3: ( (lv_value_4_0= RULE_INT ) )
            // InternalDsl.g:162:4: (lv_value_4_0= RULE_INT )
            {
            // InternalDsl.g:162:4: (lv_value_4_0= RULE_INT )
            // InternalDsl.g:163:5: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_value_4_0, grammarAccess.getScoreAccess().getValueINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScoreAccess().getFullStopKeyword_5());
            		

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
    // $ANTLR end "ruleScore"


    // $ANTLR start "entryRuleStateOption"
    // InternalDsl.g:187:1: entryRuleStateOption returns [String current=null] : iv_ruleStateOption= ruleStateOption EOF ;
    public final String entryRuleStateOption() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStateOption = null;


        try {
            // InternalDsl.g:187:51: (iv_ruleStateOption= ruleStateOption EOF )
            // InternalDsl.g:188:2: iv_ruleStateOption= ruleStateOption EOF
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
    // InternalDsl.g:194:1: ruleStateOption returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Reward' | kw= 'Punish' ) ;
    public final AntlrDatatypeRuleToken ruleStateOption() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:200:2: ( (kw= 'Reward' | kw= 'Punish' ) )
            // InternalDsl.g:201:2: (kw= 'Reward' | kw= 'Punish' )
            {
            // InternalDsl.g:201:2: (kw= 'Reward' | kw= 'Punish' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:202:3: kw= 'Reward'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateOptionAccess().getRewardKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:208:3: kw= 'Punish'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

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
    // InternalDsl.g:217:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDsl.g:217:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDsl.g:218:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDsl.g:224:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'deletion' | kw= 'shorterSequencesOfActions' | kw= 'longerSequencesOfActions' | kw= 'repairingLowerInTheContextHierarchies' | kw= 'repairingHigherInTheContextHierarchies' | kw= 'modificationOfTheOriginalModel' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:230:2: ( (kw= 'deletion' | kw= 'shorterSequencesOfActions' | kw= 'longerSequencesOfActions' | kw= 'repairingLowerInTheContextHierarchies' | kw= 'repairingHigherInTheContextHierarchies' | kw= 'modificationOfTheOriginalModel' ) )
            // InternalDsl.g:231:2: (kw= 'deletion' | kw= 'shorterSequencesOfActions' | kw= 'longerSequencesOfActions' | kw= 'repairingLowerInTheContextHierarchies' | kw= 'repairingHigherInTheContextHierarchies' | kw= 'modificationOfTheOriginalModel' )
            {
            // InternalDsl.g:231:2: (kw= 'deletion' | kw= 'shorterSequencesOfActions' | kw= 'longerSequencesOfActions' | kw= 'repairingLowerInTheContextHierarchies' | kw= 'repairingHigherInTheContextHierarchies' | kw= 'modificationOfTheOriginalModel' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
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
                    // InternalDsl.g:232:3: kw= 'deletion'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getDeletionKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:238:3: kw= 'shorterSequencesOfActions'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getShorterSequencesOfActionsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:244:3: kw= 'longerSequencesOfActions'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getLongerSequencesOfActionsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:250:3: kw= 'repairingLowerInTheContextHierarchies'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getRepairingLowerInTheContextHierarchiesKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:256:3: kw= 'repairingHigherInTheContextHierarchies'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getRepairingHigherInTheContextHierarchiesKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDsl.g:262:3: kw= 'modificationOfTheOriginalModel'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});

}