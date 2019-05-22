/*
 * generated by Xtext 2.16.0
 */
package org.xtext.projectparamorel.dsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.projectparamorel.dsl.dsl.DslPackage
import org.xtext.projectparamorel.dsl.dsl.Score

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DslValidator extends AbstractDslValidator {

	@Check
	def void checkWeightsAreLessThanElleven(Score score) {
		if (score.value > 10) {
			error("The weight can not be larger than 10", DslPackage.Literals.SCORE__VALUE)
		}
	}

	@Check
	def void checkWeightsAreMoreThanZero(Score score) {
		if (score.value < 0) {
			error("The weight can not be less than 1", DslPackage.Literals.SCORE__VALUE)
		}
	}

	@Check
	def void checkCanNotPunishShorterSequencesOfActions(Score score) {
		if(score.category == "Punish" && score.feature == "shorterSequencesOfActions"){
			error("It is not possible to punish shorter sequences of actions. Did you mean to reward longer sequences of actions?", DslPackage.Literals.SCORE__CATEGORY)
		}
	}
	
	@Check
	def void checkCanNotPunishLongerSequencesOfActions(Score score) {
		if(score.category == "Punish" && score.feature == "longerSequencesOfActions"){
			error("It is not possible to punish longer sequences of actions. Did you mean to reward shorter sequences of actions?", DslPackage.Literals.SCORE__CATEGORY)
		}
	}
	
	@Check
	def void checkCanNotPunishRepairingLowerInTheContextHierarchies(Score score) {
		if(score.category == "Punish" && score.feature == "repairingLowerInTheContextHierarchies"){
			error("It is not possible to punish repairing lower in the context hierarchies. Did you mean to reward reward repairing higher in the context hierarchies?", DslPackage.Literals.SCORE__CATEGORY)
		}
	}
	
	@Check
	def void checkCanNotPunishRepairingHigherInTheContextHierarchies(Score score) {
		if(score.category == "Punish" && score.feature == "repairingHigherInTheContextHierarchies"){
			error("It is not possible to punish repairing higher in the context hierarchies. Did you mean to reward reward repairing lower in the context hierarchies?", DslPackage.Literals.SCORE__CATEGORY)
		}
	}
	
	@Check
	def void checkCanNotRewardDeletion(Score score) {
		if(score.category == "Reward" && score.feature == "deletion"){
			error("It is not possible to reward deletion.", DslPackage.Literals.SCORE__CATEGORY)
		}
	}
	
	/**
	 * TODO: Check that we do not reward oposites, like repairingHigherInTheContextHierarchies and repairingLowerInTheContextHierarchies at the same time.
	 */
}
