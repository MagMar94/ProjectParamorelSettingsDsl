package org.xtext.projectparamorel.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.projectparamorel.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Reward'", "'Punish'", "'deletion'", "'shorterSequencesOfActions'", "'longerSequencesOfActions'", "'repairingLowerInTheContextHierarchies'", "'repairingHigherInTheContextHierarchies'", "'modificationOfTheOriginalModel'", "'by'", "'weight'", "'.'"
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePreference"
    // InternalDsl.g:53:1: entryRulePreference : rulePreference EOF ;
    public final void entryRulePreference() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( rulePreference EOF )
            // InternalDsl.g:55:1: rulePreference EOF
            {
             before(grammarAccess.getPreferenceRule()); 
            pushFollow(FOLLOW_1);
            rulePreference();

            state._fsp--;

             after(grammarAccess.getPreferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // InternalDsl.g:62:1: rulePreference : ( ( rule__Preference__ScoresAssignment )* ) ;
    public final void rulePreference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Preference__ScoresAssignment )* ) )
            // InternalDsl.g:67:2: ( ( rule__Preference__ScoresAssignment )* )
            {
            // InternalDsl.g:67:2: ( ( rule__Preference__ScoresAssignment )* )
            // InternalDsl.g:68:3: ( rule__Preference__ScoresAssignment )*
            {
             before(grammarAccess.getPreferenceAccess().getScoresAssignment()); 
            // InternalDsl.g:69:3: ( rule__Preference__ScoresAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:69:4: rule__Preference__ScoresAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Preference__ScoresAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPreferenceAccess().getScoresAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRuleScore"
    // InternalDsl.g:78:1: entryRuleScore : ruleScore EOF ;
    public final void entryRuleScore() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleScore EOF )
            // InternalDsl.g:80:1: ruleScore EOF
            {
             before(grammarAccess.getScoreRule()); 
            pushFollow(FOLLOW_1);
            ruleScore();

            state._fsp--;

             after(grammarAccess.getScoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScore"


    // $ANTLR start "ruleScore"
    // InternalDsl.g:87:1: ruleScore : ( ( rule__Score__Group__0 ) ) ;
    public final void ruleScore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Score__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Score__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Score__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Score__Group__0 )
            {
             before(grammarAccess.getScoreAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Score__Group__0 )
            // InternalDsl.g:94:4: rule__Score__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScore"


    // $ANTLR start "entryRuleStateOption"
    // InternalDsl.g:103:1: entryRuleStateOption : ruleStateOption EOF ;
    public final void entryRuleStateOption() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleStateOption EOF )
            // InternalDsl.g:105:1: ruleStateOption EOF
            {
             before(grammarAccess.getStateOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleStateOption();

            state._fsp--;

             after(grammarAccess.getStateOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateOption"


    // $ANTLR start "ruleStateOption"
    // InternalDsl.g:112:1: ruleStateOption : ( ( rule__StateOption__Alternatives ) ) ;
    public final void ruleStateOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__StateOption__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__StateOption__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__StateOption__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__StateOption__Alternatives )
            {
             before(grammarAccess.getStateOptionAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__StateOption__Alternatives )
            // InternalDsl.g:119:4: rule__StateOption__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StateOption__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateOptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateOption"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDsl.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleQualifiedName EOF )
            // InternalDsl.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDsl.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Alternatives ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__QualifiedName__Alternatives ) ) )
            // InternalDsl.g:142:2: ( ( rule__QualifiedName__Alternatives ) )
            {
            // InternalDsl.g:142:2: ( ( rule__QualifiedName__Alternatives ) )
            // InternalDsl.g:143:3: ( rule__QualifiedName__Alternatives )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives()); 
            // InternalDsl.g:144:3: ( rule__QualifiedName__Alternatives )
            // InternalDsl.g:144:4: rule__QualifiedName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__StateOption__Alternatives"
    // InternalDsl.g:152:1: rule__StateOption__Alternatives : ( ( 'Reward' ) | ( 'Punish' ) );
    public final void rule__StateOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:156:1: ( ( 'Reward' ) | ( 'Punish' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:157:2: ( 'Reward' )
                    {
                    // InternalDsl.g:157:2: ( 'Reward' )
                    // InternalDsl.g:158:3: 'Reward'
                    {
                     before(grammarAccess.getStateOptionAccess().getRewardKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStateOptionAccess().getRewardKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:163:2: ( 'Punish' )
                    {
                    // InternalDsl.g:163:2: ( 'Punish' )
                    // InternalDsl.g:164:3: 'Punish'
                    {
                     before(grammarAccess.getStateOptionAccess().getPunishKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStateOptionAccess().getPunishKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateOption__Alternatives"


    // $ANTLR start "rule__QualifiedName__Alternatives"
    // InternalDsl.g:173:1: rule__QualifiedName__Alternatives : ( ( 'deletion' ) | ( 'shorterSequencesOfActions' ) | ( 'longerSequencesOfActions' ) | ( 'repairingLowerInTheContextHierarchies' ) | ( 'repairingHigherInTheContextHierarchies' ) | ( 'modificationOfTheOriginalModel' ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:177:1: ( ( 'deletion' ) | ( 'shorterSequencesOfActions' ) | ( 'longerSequencesOfActions' ) | ( 'repairingLowerInTheContextHierarchies' ) | ( 'repairingHigherInTheContextHierarchies' ) | ( 'modificationOfTheOriginalModel' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
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
                    // InternalDsl.g:178:2: ( 'deletion' )
                    {
                    // InternalDsl.g:178:2: ( 'deletion' )
                    // InternalDsl.g:179:3: 'deletion'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getDeletionKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getDeletionKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:184:2: ( 'shorterSequencesOfActions' )
                    {
                    // InternalDsl.g:184:2: ( 'shorterSequencesOfActions' )
                    // InternalDsl.g:185:3: 'shorterSequencesOfActions'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getShorterSequencesOfActionsKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getShorterSequencesOfActionsKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:190:2: ( 'longerSequencesOfActions' )
                    {
                    // InternalDsl.g:190:2: ( 'longerSequencesOfActions' )
                    // InternalDsl.g:191:3: 'longerSequencesOfActions'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getLongerSequencesOfActionsKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getLongerSequencesOfActionsKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:196:2: ( 'repairingLowerInTheContextHierarchies' )
                    {
                    // InternalDsl.g:196:2: ( 'repairingLowerInTheContextHierarchies' )
                    // InternalDsl.g:197:3: 'repairingLowerInTheContextHierarchies'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getRepairingLowerInTheContextHierarchiesKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getRepairingLowerInTheContextHierarchiesKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:202:2: ( 'repairingHigherInTheContextHierarchies' )
                    {
                    // InternalDsl.g:202:2: ( 'repairingHigherInTheContextHierarchies' )
                    // InternalDsl.g:203:3: 'repairingHigherInTheContextHierarchies'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getRepairingHigherInTheContextHierarchiesKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getRepairingHigherInTheContextHierarchiesKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:208:2: ( 'modificationOfTheOriginalModel' )
                    {
                    // InternalDsl.g:208:2: ( 'modificationOfTheOriginalModel' )
                    // InternalDsl.g:209:3: 'modificationOfTheOriginalModel'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getModificationOfTheOriginalModelKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getModificationOfTheOriginalModelKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Alternatives"


    // $ANTLR start "rule__Score__Group__0"
    // InternalDsl.g:218:1: rule__Score__Group__0 : rule__Score__Group__0__Impl rule__Score__Group__1 ;
    public final void rule__Score__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:222:1: ( rule__Score__Group__0__Impl rule__Score__Group__1 )
            // InternalDsl.g:223:2: rule__Score__Group__0__Impl rule__Score__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Score__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__0"


    // $ANTLR start "rule__Score__Group__0__Impl"
    // InternalDsl.g:230:1: rule__Score__Group__0__Impl : ( ( rule__Score__CategoryAssignment_0 ) ) ;
    public final void rule__Score__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:234:1: ( ( ( rule__Score__CategoryAssignment_0 ) ) )
            // InternalDsl.g:235:1: ( ( rule__Score__CategoryAssignment_0 ) )
            {
            // InternalDsl.g:235:1: ( ( rule__Score__CategoryAssignment_0 ) )
            // InternalDsl.g:236:2: ( rule__Score__CategoryAssignment_0 )
            {
             before(grammarAccess.getScoreAccess().getCategoryAssignment_0()); 
            // InternalDsl.g:237:2: ( rule__Score__CategoryAssignment_0 )
            // InternalDsl.g:237:3: rule__Score__CategoryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Score__CategoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getCategoryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__0__Impl"


    // $ANTLR start "rule__Score__Group__1"
    // InternalDsl.g:245:1: rule__Score__Group__1 : rule__Score__Group__1__Impl rule__Score__Group__2 ;
    public final void rule__Score__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:249:1: ( rule__Score__Group__1__Impl rule__Score__Group__2 )
            // InternalDsl.g:250:2: rule__Score__Group__1__Impl rule__Score__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Score__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__1"


    // $ANTLR start "rule__Score__Group__1__Impl"
    // InternalDsl.g:257:1: rule__Score__Group__1__Impl : ( ( rule__Score__FeatureAssignment_1 ) ) ;
    public final void rule__Score__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:261:1: ( ( ( rule__Score__FeatureAssignment_1 ) ) )
            // InternalDsl.g:262:1: ( ( rule__Score__FeatureAssignment_1 ) )
            {
            // InternalDsl.g:262:1: ( ( rule__Score__FeatureAssignment_1 ) )
            // InternalDsl.g:263:2: ( rule__Score__FeatureAssignment_1 )
            {
             before(grammarAccess.getScoreAccess().getFeatureAssignment_1()); 
            // InternalDsl.g:264:2: ( rule__Score__FeatureAssignment_1 )
            // InternalDsl.g:264:3: rule__Score__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Score__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__1__Impl"


    // $ANTLR start "rule__Score__Group__2"
    // InternalDsl.g:272:1: rule__Score__Group__2 : rule__Score__Group__2__Impl rule__Score__Group__3 ;
    public final void rule__Score__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:276:1: ( rule__Score__Group__2__Impl rule__Score__Group__3 )
            // InternalDsl.g:277:2: rule__Score__Group__2__Impl rule__Score__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Score__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__2"


    // $ANTLR start "rule__Score__Group__2__Impl"
    // InternalDsl.g:284:1: rule__Score__Group__2__Impl : ( 'by' ) ;
    public final void rule__Score__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:288:1: ( ( 'by' ) )
            // InternalDsl.g:289:1: ( 'by' )
            {
            // InternalDsl.g:289:1: ( 'by' )
            // InternalDsl.g:290:2: 'by'
            {
             before(grammarAccess.getScoreAccess().getByKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__2__Impl"


    // $ANTLR start "rule__Score__Group__3"
    // InternalDsl.g:299:1: rule__Score__Group__3 : rule__Score__Group__3__Impl rule__Score__Group__4 ;
    public final void rule__Score__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:303:1: ( rule__Score__Group__3__Impl rule__Score__Group__4 )
            // InternalDsl.g:304:2: rule__Score__Group__3__Impl rule__Score__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Score__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__3"


    // $ANTLR start "rule__Score__Group__3__Impl"
    // InternalDsl.g:311:1: rule__Score__Group__3__Impl : ( 'weight' ) ;
    public final void rule__Score__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:315:1: ( ( 'weight' ) )
            // InternalDsl.g:316:1: ( 'weight' )
            {
            // InternalDsl.g:316:1: ( 'weight' )
            // InternalDsl.g:317:2: 'weight'
            {
             before(grammarAccess.getScoreAccess().getWeightKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getWeightKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__3__Impl"


    // $ANTLR start "rule__Score__Group__4"
    // InternalDsl.g:326:1: rule__Score__Group__4 : rule__Score__Group__4__Impl rule__Score__Group__5 ;
    public final void rule__Score__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:330:1: ( rule__Score__Group__4__Impl rule__Score__Group__5 )
            // InternalDsl.g:331:2: rule__Score__Group__4__Impl rule__Score__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Score__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__4"


    // $ANTLR start "rule__Score__Group__4__Impl"
    // InternalDsl.g:338:1: rule__Score__Group__4__Impl : ( ( rule__Score__ValueAssignment_4 ) ) ;
    public final void rule__Score__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:342:1: ( ( ( rule__Score__ValueAssignment_4 ) ) )
            // InternalDsl.g:343:1: ( ( rule__Score__ValueAssignment_4 ) )
            {
            // InternalDsl.g:343:1: ( ( rule__Score__ValueAssignment_4 ) )
            // InternalDsl.g:344:2: ( rule__Score__ValueAssignment_4 )
            {
             before(grammarAccess.getScoreAccess().getValueAssignment_4()); 
            // InternalDsl.g:345:2: ( rule__Score__ValueAssignment_4 )
            // InternalDsl.g:345:3: rule__Score__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Score__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__4__Impl"


    // $ANTLR start "rule__Score__Group__5"
    // InternalDsl.g:353:1: rule__Score__Group__5 : rule__Score__Group__5__Impl ;
    public final void rule__Score__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:357:1: ( rule__Score__Group__5__Impl )
            // InternalDsl.g:358:2: rule__Score__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__5"


    // $ANTLR start "rule__Score__Group__5__Impl"
    // InternalDsl.g:364:1: rule__Score__Group__5__Impl : ( '.' ) ;
    public final void rule__Score__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:368:1: ( ( '.' ) )
            // InternalDsl.g:369:1: ( '.' )
            {
            // InternalDsl.g:369:1: ( '.' )
            // InternalDsl.g:370:2: '.'
            {
             before(grammarAccess.getScoreAccess().getFullStopKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__5__Impl"


    // $ANTLR start "rule__Preference__ScoresAssignment"
    // InternalDsl.g:380:1: rule__Preference__ScoresAssignment : ( ruleScore ) ;
    public final void rule__Preference__ScoresAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:384:1: ( ( ruleScore ) )
            // InternalDsl.g:385:2: ( ruleScore )
            {
            // InternalDsl.g:385:2: ( ruleScore )
            // InternalDsl.g:386:3: ruleScore
            {
             before(grammarAccess.getPreferenceAccess().getScoresScoreParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleScore();

            state._fsp--;

             after(grammarAccess.getPreferenceAccess().getScoresScoreParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__ScoresAssignment"


    // $ANTLR start "rule__Score__CategoryAssignment_0"
    // InternalDsl.g:395:1: rule__Score__CategoryAssignment_0 : ( ruleStateOption ) ;
    public final void rule__Score__CategoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:399:1: ( ( ruleStateOption ) )
            // InternalDsl.g:400:2: ( ruleStateOption )
            {
            // InternalDsl.g:400:2: ( ruleStateOption )
            // InternalDsl.g:401:3: ruleStateOption
            {
             before(grammarAccess.getScoreAccess().getCategoryStateOptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateOption();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getCategoryStateOptionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__CategoryAssignment_0"


    // $ANTLR start "rule__Score__FeatureAssignment_1"
    // InternalDsl.g:410:1: rule__Score__FeatureAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Score__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:414:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:415:2: ( ruleQualifiedName )
            {
            // InternalDsl.g:415:2: ( ruleQualifiedName )
            // InternalDsl.g:416:3: ruleQualifiedName
            {
             before(grammarAccess.getScoreAccess().getFeatureQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getFeatureQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__FeatureAssignment_1"


    // $ANTLR start "rule__Score__ValueAssignment_4"
    // InternalDsl.g:425:1: rule__Score__ValueAssignment_4 : ( RULE_INT ) ;
    public final void rule__Score__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:429:1: ( ( RULE_INT ) )
            // InternalDsl.g:430:2: ( RULE_INT )
            {
            // InternalDsl.g:430:2: ( RULE_INT )
            // InternalDsl.g:431:3: RULE_INT
            {
             before(grammarAccess.getScoreAccess().getValueINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getValueINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__ValueAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});

}