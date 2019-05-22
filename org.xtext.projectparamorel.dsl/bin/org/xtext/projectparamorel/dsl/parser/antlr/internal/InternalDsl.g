/*
 * generated by Xtext 2.16.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.projectparamorel.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePreference
entryRulePreference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPreferenceRule()); }
	iv_rulePreference=rulePreference
	{ $current=$iv_rulePreference.current; }
	EOF;

// Rule Preference
rulePreference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getPreferenceAccess().getScoresScoreParserRuleCall_0());
			}
			lv_scores_0_0=ruleScore
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getPreferenceRule());
				}
				add(
					$current,
					"scores",
					lv_scores_0_0,
					"org.xtext.projectparamorel.dsl.Dsl.Score");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleScore
entryRuleScore returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScoreRule()); }
	iv_ruleScore=ruleScore
	{ $current=$iv_ruleScore.current; }
	EOF;

// Rule Score
ruleScore returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getScoreAccess().getCategoryStateOptionParserRuleCall_0_0());
				}
				lv_category_0_0=ruleStateOption
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScoreRule());
					}
					set(
						$current,
						"category",
						lv_category_0_0,
						"org.xtext.projectparamorel.dsl.Dsl.StateOption");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScoreAccess().getFeatureQualifiedNameParserRuleCall_1_0());
				}
				lv_feature_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScoreRule());
					}
					set(
						$current,
						"feature",
						lv_feature_1_0,
						"org.xtext.projectparamorel.dsl.Dsl.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='by'
		{
			newLeafNode(otherlv_2, grammarAccess.getScoreAccess().getByKeyword_2());
		}
		otherlv_3='weight'
		{
			newLeafNode(otherlv_3, grammarAccess.getScoreAccess().getWeightKeyword_3());
		}
		(
			(
				lv_value_4_0=RULE_INT
				{
					newLeafNode(lv_value_4_0, grammarAccess.getScoreAccess().getValueINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScoreRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='.'
		{
			newLeafNode(otherlv_5, grammarAccess.getScoreAccess().getFullStopKeyword_5());
		}
	)
;

// Entry rule entryRuleStateOption
entryRuleStateOption returns [String current=null]:
	{ newCompositeNode(grammarAccess.getStateOptionRule()); }
	iv_ruleStateOption=ruleStateOption
	{ $current=$iv_ruleStateOption.current.getText(); }
	EOF;

// Rule StateOption
ruleStateOption returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Reward'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getStateOptionAccess().getRewardKeyword_0());
		}
		    |
		kw='Punish'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getStateOptionAccess().getPunishKeyword_1());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='deletion'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getDeletionKeyword_0());
		}
		    |
		kw='shorterSequencesOfActions'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getShorterSequencesOfActionsKeyword_1());
		}
		    |
		kw='longerSequencesOfActions'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getLongerSequencesOfActionsKeyword_2());
		}
		    |
		kw='repairingLowerInTheContextHierarchies'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getRepairingLowerInTheContextHierarchiesKeyword_3());
		}
		    |
		kw='repairingHigherInTheContextHierarchies'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getRepairingHigherInTheContextHierarchiesKeyword_4());
		}
		    |
		kw='modificationOfTheOriginalModel'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getModificationOfTheOriginalModelKeyword_5());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
