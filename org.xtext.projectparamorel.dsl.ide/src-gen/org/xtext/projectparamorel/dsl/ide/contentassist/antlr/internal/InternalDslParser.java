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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'reward'", "'punish'", "'deletion'", "'shorterSequencesOfActions'", "'longerSequencesOfActions'", "'repairingLowerInTheContextHierarchies'", "'repairingHigherInTheContextHierarchies'", "'modificationOfTheOriginalModel'", "'I'", "'want'", "'my'", "'preferences'", "'to'", "'by'", "'a'", "'weight'", "'of'", "'.'"
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



    // $ANTLR start "entryRuleExperience"
    // InternalDsl.g:53:1: entryRuleExperience : ruleExperience EOF ;
    public final void entryRuleExperience() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleExperience EOF )
            // InternalDsl.g:55:1: ruleExperience EOF
            {
             before(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            ruleExperience();

            state._fsp--;

             after(grammarAccess.getExperienceRule()); 
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
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalDsl.g:62:1: ruleExperience : ( ( rule__Experience__EntriesAssignment )* ) ;
    public final void ruleExperience() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Experience__EntriesAssignment )* ) )
            // InternalDsl.g:67:2: ( ( rule__Experience__EntriesAssignment )* )
            {
            // InternalDsl.g:67:2: ( ( rule__Experience__EntriesAssignment )* )
            // InternalDsl.g:68:3: ( rule__Experience__EntriesAssignment )*
            {
             before(grammarAccess.getExperienceAccess().getEntriesAssignment()); 
            // InternalDsl.g:69:3: ( rule__Experience__EntriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:69:4: rule__Experience__EntriesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Experience__EntriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExperienceAccess().getEntriesAssignment()); 

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
    // $ANTLR end "ruleExperience"


    // $ANTLR start "entryRuleEntry"
    // InternalDsl.g:78:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleEntry EOF )
            // InternalDsl.g:80:1: ruleEntry EOF
            {
             before(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getEntryRule()); 
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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalDsl.g:87:1: ruleEntry : ( ruleMetric ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ruleMetric ) )
            // InternalDsl.g:92:2: ( ruleMetric )
            {
            // InternalDsl.g:92:2: ( ruleMetric )
            // InternalDsl.g:93:3: ruleMetric
            {
             before(grammarAccess.getEntryAccess().getMetricParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleMetric();

            state._fsp--;

             after(grammarAccess.getEntryAccess().getMetricParserRuleCall()); 

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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleMetric"
    // InternalDsl.g:103:1: entryRuleMetric : ruleMetric EOF ;
    public final void entryRuleMetric() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleMetric EOF )
            // InternalDsl.g:105:1: ruleMetric EOF
            {
             before(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            ruleMetric();

            state._fsp--;

             after(grammarAccess.getMetricRule()); 
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
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalDsl.g:112:1: ruleMetric : ( ( rule__Metric__Group__0 ) ) ;
    public final void ruleMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Metric__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Metric__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Metric__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Metric__Group__0 )
            {
             before(grammarAccess.getMetricAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Metric__Group__0 )
            // InternalDsl.g:119:4: rule__Metric__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricAccess().getGroup()); 

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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleStateOption"
    // InternalDsl.g:128:1: entryRuleStateOption : ruleStateOption EOF ;
    public final void entryRuleStateOption() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleStateOption EOF )
            // InternalDsl.g:130:1: ruleStateOption EOF
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
    // InternalDsl.g:137:1: ruleStateOption : ( ( rule__StateOption__Alternatives ) ) ;
    public final void ruleStateOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__StateOption__Alternatives ) ) )
            // InternalDsl.g:142:2: ( ( rule__StateOption__Alternatives ) )
            {
            // InternalDsl.g:142:2: ( ( rule__StateOption__Alternatives ) )
            // InternalDsl.g:143:3: ( rule__StateOption__Alternatives )
            {
             before(grammarAccess.getStateOptionAccess().getAlternatives()); 
            // InternalDsl.g:144:3: ( rule__StateOption__Alternatives )
            // InternalDsl.g:144:4: rule__StateOption__Alternatives
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
    // InternalDsl.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleQualifiedName EOF )
            // InternalDsl.g:155:1: ruleQualifiedName EOF
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
    // InternalDsl.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Alternatives ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__QualifiedName__Alternatives ) ) )
            // InternalDsl.g:167:2: ( ( rule__QualifiedName__Alternatives ) )
            {
            // InternalDsl.g:167:2: ( ( rule__QualifiedName__Alternatives ) )
            // InternalDsl.g:168:3: ( rule__QualifiedName__Alternatives )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives()); 
            // InternalDsl.g:169:3: ( rule__QualifiedName__Alternatives )
            // InternalDsl.g:169:4: rule__QualifiedName__Alternatives
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
    // InternalDsl.g:177:1: rule__StateOption__Alternatives : ( ( 'reward' ) | ( 'punish' ) );
    public final void rule__StateOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:181:1: ( ( 'reward' ) | ( 'punish' ) )
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
                    // InternalDsl.g:182:2: ( 'reward' )
                    {
                    // InternalDsl.g:182:2: ( 'reward' )
                    // InternalDsl.g:183:3: 'reward'
                    {
                     before(grammarAccess.getStateOptionAccess().getRewardKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStateOptionAccess().getRewardKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:188:2: ( 'punish' )
                    {
                    // InternalDsl.g:188:2: ( 'punish' )
                    // InternalDsl.g:189:3: 'punish'
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
    // InternalDsl.g:198:1: rule__QualifiedName__Alternatives : ( ( 'deletion' ) | ( 'shorterSequencesOfActions' ) | ( 'longerSequencesOfActions' ) | ( 'repairingLowerInTheContextHierarchies' ) | ( 'repairingHigherInTheContextHierarchies' ) | ( 'modificationOfTheOriginalModel' ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:202:1: ( ( 'deletion' ) | ( 'shorterSequencesOfActions' ) | ( 'longerSequencesOfActions' ) | ( 'repairingLowerInTheContextHierarchies' ) | ( 'repairingHigherInTheContextHierarchies' ) | ( 'modificationOfTheOriginalModel' ) )
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
                    // InternalDsl.g:203:2: ( 'deletion' )
                    {
                    // InternalDsl.g:203:2: ( 'deletion' )
                    // InternalDsl.g:204:3: 'deletion'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getDeletionKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getDeletionKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:209:2: ( 'shorterSequencesOfActions' )
                    {
                    // InternalDsl.g:209:2: ( 'shorterSequencesOfActions' )
                    // InternalDsl.g:210:3: 'shorterSequencesOfActions'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getShorterSequencesOfActionsKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getShorterSequencesOfActionsKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:215:2: ( 'longerSequencesOfActions' )
                    {
                    // InternalDsl.g:215:2: ( 'longerSequencesOfActions' )
                    // InternalDsl.g:216:3: 'longerSequencesOfActions'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getLongerSequencesOfActionsKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getLongerSequencesOfActionsKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:221:2: ( 'repairingLowerInTheContextHierarchies' )
                    {
                    // InternalDsl.g:221:2: ( 'repairingLowerInTheContextHierarchies' )
                    // InternalDsl.g:222:3: 'repairingLowerInTheContextHierarchies'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getRepairingLowerInTheContextHierarchiesKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getRepairingLowerInTheContextHierarchiesKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:227:2: ( 'repairingHigherInTheContextHierarchies' )
                    {
                    // InternalDsl.g:227:2: ( 'repairingHigherInTheContextHierarchies' )
                    // InternalDsl.g:228:3: 'repairingHigherInTheContextHierarchies'
                    {
                     before(grammarAccess.getQualifiedNameAccess().getRepairingHigherInTheContextHierarchiesKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getRepairingHigherInTheContextHierarchiesKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:233:2: ( 'modificationOfTheOriginalModel' )
                    {
                    // InternalDsl.g:233:2: ( 'modificationOfTheOriginalModel' )
                    // InternalDsl.g:234:3: 'modificationOfTheOriginalModel'
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


    // $ANTLR start "rule__Metric__Group__0"
    // InternalDsl.g:243:1: rule__Metric__Group__0 : rule__Metric__Group__0__Impl rule__Metric__Group__1 ;
    public final void rule__Metric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:247:1: ( rule__Metric__Group__0__Impl rule__Metric__Group__1 )
            // InternalDsl.g:248:2: rule__Metric__Group__0__Impl rule__Metric__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Metric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__1();

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
    // $ANTLR end "rule__Metric__Group__0"


    // $ANTLR start "rule__Metric__Group__0__Impl"
    // InternalDsl.g:255:1: rule__Metric__Group__0__Impl : ( 'I' ) ;
    public final void rule__Metric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:259:1: ( ( 'I' ) )
            // InternalDsl.g:260:1: ( 'I' )
            {
            // InternalDsl.g:260:1: ( 'I' )
            // InternalDsl.g:261:2: 'I'
            {
             before(grammarAccess.getMetricAccess().getIKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getIKeyword_0()); 

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
    // $ANTLR end "rule__Metric__Group__0__Impl"


    // $ANTLR start "rule__Metric__Group__1"
    // InternalDsl.g:270:1: rule__Metric__Group__1 : rule__Metric__Group__1__Impl rule__Metric__Group__2 ;
    public final void rule__Metric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:274:1: ( rule__Metric__Group__1__Impl rule__Metric__Group__2 )
            // InternalDsl.g:275:2: rule__Metric__Group__1__Impl rule__Metric__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Metric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__2();

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
    // $ANTLR end "rule__Metric__Group__1"


    // $ANTLR start "rule__Metric__Group__1__Impl"
    // InternalDsl.g:282:1: rule__Metric__Group__1__Impl : ( 'want' ) ;
    public final void rule__Metric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:286:1: ( ( 'want' ) )
            // InternalDsl.g:287:1: ( 'want' )
            {
            // InternalDsl.g:287:1: ( 'want' )
            // InternalDsl.g:288:2: 'want'
            {
             before(grammarAccess.getMetricAccess().getWantKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getWantKeyword_1()); 

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
    // $ANTLR end "rule__Metric__Group__1__Impl"


    // $ANTLR start "rule__Metric__Group__2"
    // InternalDsl.g:297:1: rule__Metric__Group__2 : rule__Metric__Group__2__Impl rule__Metric__Group__3 ;
    public final void rule__Metric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:301:1: ( rule__Metric__Group__2__Impl rule__Metric__Group__3 )
            // InternalDsl.g:302:2: rule__Metric__Group__2__Impl rule__Metric__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Metric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__3();

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
    // $ANTLR end "rule__Metric__Group__2"


    // $ANTLR start "rule__Metric__Group__2__Impl"
    // InternalDsl.g:309:1: rule__Metric__Group__2__Impl : ( 'my' ) ;
    public final void rule__Metric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:313:1: ( ( 'my' ) )
            // InternalDsl.g:314:1: ( 'my' )
            {
            // InternalDsl.g:314:1: ( 'my' )
            // InternalDsl.g:315:2: 'my'
            {
             before(grammarAccess.getMetricAccess().getMyKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getMyKeyword_2()); 

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
    // $ANTLR end "rule__Metric__Group__2__Impl"


    // $ANTLR start "rule__Metric__Group__3"
    // InternalDsl.g:324:1: rule__Metric__Group__3 : rule__Metric__Group__3__Impl rule__Metric__Group__4 ;
    public final void rule__Metric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:328:1: ( rule__Metric__Group__3__Impl rule__Metric__Group__4 )
            // InternalDsl.g:329:2: rule__Metric__Group__3__Impl rule__Metric__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Metric__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__4();

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
    // $ANTLR end "rule__Metric__Group__3"


    // $ANTLR start "rule__Metric__Group__3__Impl"
    // InternalDsl.g:336:1: rule__Metric__Group__3__Impl : ( 'preferences' ) ;
    public final void rule__Metric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:340:1: ( ( 'preferences' ) )
            // InternalDsl.g:341:1: ( 'preferences' )
            {
            // InternalDsl.g:341:1: ( 'preferences' )
            // InternalDsl.g:342:2: 'preferences'
            {
             before(grammarAccess.getMetricAccess().getPreferencesKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getPreferencesKeyword_3()); 

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
    // $ANTLR end "rule__Metric__Group__3__Impl"


    // $ANTLR start "rule__Metric__Group__4"
    // InternalDsl.g:351:1: rule__Metric__Group__4 : rule__Metric__Group__4__Impl rule__Metric__Group__5 ;
    public final void rule__Metric__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:355:1: ( rule__Metric__Group__4__Impl rule__Metric__Group__5 )
            // InternalDsl.g:356:2: rule__Metric__Group__4__Impl rule__Metric__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Metric__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__5();

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
    // $ANTLR end "rule__Metric__Group__4"


    // $ANTLR start "rule__Metric__Group__4__Impl"
    // InternalDsl.g:363:1: rule__Metric__Group__4__Impl : ( 'to' ) ;
    public final void rule__Metric__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:367:1: ( ( 'to' ) )
            // InternalDsl.g:368:1: ( 'to' )
            {
            // InternalDsl.g:368:1: ( 'to' )
            // InternalDsl.g:369:2: 'to'
            {
             before(grammarAccess.getMetricAccess().getToKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__Metric__Group__4__Impl"


    // $ANTLR start "rule__Metric__Group__5"
    // InternalDsl.g:378:1: rule__Metric__Group__5 : rule__Metric__Group__5__Impl rule__Metric__Group__6 ;
    public final void rule__Metric__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:382:1: ( rule__Metric__Group__5__Impl rule__Metric__Group__6 )
            // InternalDsl.g:383:2: rule__Metric__Group__5__Impl rule__Metric__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Metric__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__6();

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
    // $ANTLR end "rule__Metric__Group__5"


    // $ANTLR start "rule__Metric__Group__5__Impl"
    // InternalDsl.g:390:1: rule__Metric__Group__5__Impl : ( ( rule__Metric__StateAssignment_5 ) ) ;
    public final void rule__Metric__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:394:1: ( ( ( rule__Metric__StateAssignment_5 ) ) )
            // InternalDsl.g:395:1: ( ( rule__Metric__StateAssignment_5 ) )
            {
            // InternalDsl.g:395:1: ( ( rule__Metric__StateAssignment_5 ) )
            // InternalDsl.g:396:2: ( rule__Metric__StateAssignment_5 )
            {
             before(grammarAccess.getMetricAccess().getStateAssignment_5()); 
            // InternalDsl.g:397:2: ( rule__Metric__StateAssignment_5 )
            // InternalDsl.g:397:3: rule__Metric__StateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Metric__StateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMetricAccess().getStateAssignment_5()); 

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
    // $ANTLR end "rule__Metric__Group__5__Impl"


    // $ANTLR start "rule__Metric__Group__6"
    // InternalDsl.g:405:1: rule__Metric__Group__6 : rule__Metric__Group__6__Impl rule__Metric__Group__7 ;
    public final void rule__Metric__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:409:1: ( rule__Metric__Group__6__Impl rule__Metric__Group__7 )
            // InternalDsl.g:410:2: rule__Metric__Group__6__Impl rule__Metric__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Metric__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__7();

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
    // $ANTLR end "rule__Metric__Group__6"


    // $ANTLR start "rule__Metric__Group__6__Impl"
    // InternalDsl.g:417:1: rule__Metric__Group__6__Impl : ( ( rule__Metric__NameAssignment_6 ) ) ;
    public final void rule__Metric__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:421:1: ( ( ( rule__Metric__NameAssignment_6 ) ) )
            // InternalDsl.g:422:1: ( ( rule__Metric__NameAssignment_6 ) )
            {
            // InternalDsl.g:422:1: ( ( rule__Metric__NameAssignment_6 ) )
            // InternalDsl.g:423:2: ( rule__Metric__NameAssignment_6 )
            {
             before(grammarAccess.getMetricAccess().getNameAssignment_6()); 
            // InternalDsl.g:424:2: ( rule__Metric__NameAssignment_6 )
            // InternalDsl.g:424:3: rule__Metric__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Metric__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMetricAccess().getNameAssignment_6()); 

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
    // $ANTLR end "rule__Metric__Group__6__Impl"


    // $ANTLR start "rule__Metric__Group__7"
    // InternalDsl.g:432:1: rule__Metric__Group__7 : rule__Metric__Group__7__Impl rule__Metric__Group__8 ;
    public final void rule__Metric__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:436:1: ( rule__Metric__Group__7__Impl rule__Metric__Group__8 )
            // InternalDsl.g:437:2: rule__Metric__Group__7__Impl rule__Metric__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Metric__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__8();

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
    // $ANTLR end "rule__Metric__Group__7"


    // $ANTLR start "rule__Metric__Group__7__Impl"
    // InternalDsl.g:444:1: rule__Metric__Group__7__Impl : ( 'by' ) ;
    public final void rule__Metric__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:448:1: ( ( 'by' ) )
            // InternalDsl.g:449:1: ( 'by' )
            {
            // InternalDsl.g:449:1: ( 'by' )
            // InternalDsl.g:450:2: 'by'
            {
             before(grammarAccess.getMetricAccess().getByKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getByKeyword_7()); 

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
    // $ANTLR end "rule__Metric__Group__7__Impl"


    // $ANTLR start "rule__Metric__Group__8"
    // InternalDsl.g:459:1: rule__Metric__Group__8 : rule__Metric__Group__8__Impl rule__Metric__Group__9 ;
    public final void rule__Metric__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:463:1: ( rule__Metric__Group__8__Impl rule__Metric__Group__9 )
            // InternalDsl.g:464:2: rule__Metric__Group__8__Impl rule__Metric__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Metric__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__9();

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
    // $ANTLR end "rule__Metric__Group__8"


    // $ANTLR start "rule__Metric__Group__8__Impl"
    // InternalDsl.g:471:1: rule__Metric__Group__8__Impl : ( 'a' ) ;
    public final void rule__Metric__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:475:1: ( ( 'a' ) )
            // InternalDsl.g:476:1: ( 'a' )
            {
            // InternalDsl.g:476:1: ( 'a' )
            // InternalDsl.g:477:2: 'a'
            {
             before(grammarAccess.getMetricAccess().getAKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getAKeyword_8()); 

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
    // $ANTLR end "rule__Metric__Group__8__Impl"


    // $ANTLR start "rule__Metric__Group__9"
    // InternalDsl.g:486:1: rule__Metric__Group__9 : rule__Metric__Group__9__Impl rule__Metric__Group__10 ;
    public final void rule__Metric__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:490:1: ( rule__Metric__Group__9__Impl rule__Metric__Group__10 )
            // InternalDsl.g:491:2: rule__Metric__Group__9__Impl rule__Metric__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Metric__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__10();

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
    // $ANTLR end "rule__Metric__Group__9"


    // $ANTLR start "rule__Metric__Group__9__Impl"
    // InternalDsl.g:498:1: rule__Metric__Group__9__Impl : ( 'weight' ) ;
    public final void rule__Metric__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:502:1: ( ( 'weight' ) )
            // InternalDsl.g:503:1: ( 'weight' )
            {
            // InternalDsl.g:503:1: ( 'weight' )
            // InternalDsl.g:504:2: 'weight'
            {
             before(grammarAccess.getMetricAccess().getWeightKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getWeightKeyword_9()); 

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
    // $ANTLR end "rule__Metric__Group__9__Impl"


    // $ANTLR start "rule__Metric__Group__10"
    // InternalDsl.g:513:1: rule__Metric__Group__10 : rule__Metric__Group__10__Impl rule__Metric__Group__11 ;
    public final void rule__Metric__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:517:1: ( rule__Metric__Group__10__Impl rule__Metric__Group__11 )
            // InternalDsl.g:518:2: rule__Metric__Group__10__Impl rule__Metric__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Metric__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__11();

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
    // $ANTLR end "rule__Metric__Group__10"


    // $ANTLR start "rule__Metric__Group__10__Impl"
    // InternalDsl.g:525:1: rule__Metric__Group__10__Impl : ( 'of' ) ;
    public final void rule__Metric__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:529:1: ( ( 'of' ) )
            // InternalDsl.g:530:1: ( 'of' )
            {
            // InternalDsl.g:530:1: ( 'of' )
            // InternalDsl.g:531:2: 'of'
            {
             before(grammarAccess.getMetricAccess().getOfKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getOfKeyword_10()); 

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
    // $ANTLR end "rule__Metric__Group__10__Impl"


    // $ANTLR start "rule__Metric__Group__11"
    // InternalDsl.g:540:1: rule__Metric__Group__11 : rule__Metric__Group__11__Impl rule__Metric__Group__12 ;
    public final void rule__Metric__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:544:1: ( rule__Metric__Group__11__Impl rule__Metric__Group__12 )
            // InternalDsl.g:545:2: rule__Metric__Group__11__Impl rule__Metric__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__Metric__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__12();

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
    // $ANTLR end "rule__Metric__Group__11"


    // $ANTLR start "rule__Metric__Group__11__Impl"
    // InternalDsl.g:552:1: rule__Metric__Group__11__Impl : ( ( rule__Metric__WeightAssignment_11 ) ) ;
    public final void rule__Metric__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:556:1: ( ( ( rule__Metric__WeightAssignment_11 ) ) )
            // InternalDsl.g:557:1: ( ( rule__Metric__WeightAssignment_11 ) )
            {
            // InternalDsl.g:557:1: ( ( rule__Metric__WeightAssignment_11 ) )
            // InternalDsl.g:558:2: ( rule__Metric__WeightAssignment_11 )
            {
             before(grammarAccess.getMetricAccess().getWeightAssignment_11()); 
            // InternalDsl.g:559:2: ( rule__Metric__WeightAssignment_11 )
            // InternalDsl.g:559:3: rule__Metric__WeightAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Metric__WeightAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMetricAccess().getWeightAssignment_11()); 

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
    // $ANTLR end "rule__Metric__Group__11__Impl"


    // $ANTLR start "rule__Metric__Group__12"
    // InternalDsl.g:567:1: rule__Metric__Group__12 : rule__Metric__Group__12__Impl ;
    public final void rule__Metric__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:571:1: ( rule__Metric__Group__12__Impl )
            // InternalDsl.g:572:2: rule__Metric__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metric__Group__12__Impl();

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
    // $ANTLR end "rule__Metric__Group__12"


    // $ANTLR start "rule__Metric__Group__12__Impl"
    // InternalDsl.g:578:1: rule__Metric__Group__12__Impl : ( '.' ) ;
    public final void rule__Metric__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:582:1: ( ( '.' ) )
            // InternalDsl.g:583:1: ( '.' )
            {
            // InternalDsl.g:583:1: ( '.' )
            // InternalDsl.g:584:2: '.'
            {
             before(grammarAccess.getMetricAccess().getFullStopKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getFullStopKeyword_12()); 

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
    // $ANTLR end "rule__Metric__Group__12__Impl"


    // $ANTLR start "rule__Experience__EntriesAssignment"
    // InternalDsl.g:594:1: rule__Experience__EntriesAssignment : ( ruleEntry ) ;
    public final void rule__Experience__EntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:598:1: ( ( ruleEntry ) )
            // InternalDsl.g:599:2: ( ruleEntry )
            {
            // InternalDsl.g:599:2: ( ruleEntry )
            // InternalDsl.g:600:3: ruleEntry
            {
             before(grammarAccess.getExperienceAccess().getEntriesEntryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getExperienceAccess().getEntriesEntryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Experience__EntriesAssignment"


    // $ANTLR start "rule__Metric__StateAssignment_5"
    // InternalDsl.g:609:1: rule__Metric__StateAssignment_5 : ( ruleStateOption ) ;
    public final void rule__Metric__StateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:613:1: ( ( ruleStateOption ) )
            // InternalDsl.g:614:2: ( ruleStateOption )
            {
            // InternalDsl.g:614:2: ( ruleStateOption )
            // InternalDsl.g:615:3: ruleStateOption
            {
             before(grammarAccess.getMetricAccess().getStateStateOptionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStateOption();

            state._fsp--;

             after(grammarAccess.getMetricAccess().getStateStateOptionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Metric__StateAssignment_5"


    // $ANTLR start "rule__Metric__NameAssignment_6"
    // InternalDsl.g:624:1: rule__Metric__NameAssignment_6 : ( ruleQualifiedName ) ;
    public final void rule__Metric__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:628:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:629:2: ( ruleQualifiedName )
            {
            // InternalDsl.g:629:2: ( ruleQualifiedName )
            // InternalDsl.g:630:3: ruleQualifiedName
            {
             before(grammarAccess.getMetricAccess().getNameQualifiedNameParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMetricAccess().getNameQualifiedNameParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Metric__NameAssignment_6"


    // $ANTLR start "rule__Metric__WeightAssignment_11"
    // InternalDsl.g:639:1: rule__Metric__WeightAssignment_11 : ( RULE_INT ) ;
    public final void rule__Metric__WeightAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:643:1: ( ( RULE_INT ) )
            // InternalDsl.g:644:2: ( RULE_INT )
            {
            // InternalDsl.g:644:2: ( RULE_INT )
            // InternalDsl.g:645:3: RULE_INT
            {
             before(grammarAccess.getMetricAccess().getWeightINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getWeightINTTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Metric__WeightAssignment_11"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});

}