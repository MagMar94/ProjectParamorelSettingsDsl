/*
 * generated by Xtext 2.16.0
 */
package org.xtext.projectparamorel.dsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.projectparamorel.dsl.dsl.Metric
import org.xtext.projectparamorel.dsl.dsl.DslPackage

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DslValidator extends AbstractDslValidator {

	@Check
	def void checkWeightsAreLessThanElleven(Metric metric) {
		if (metric.weight > 10) {
			error("The weight can not be larger than 10", DslPackage.Literals.METRIC__WEIGHT)
		}
	}

	@Check
	def void checkWeightsAreMoreThanZero(Metric metric) {
		if (metric.weight < 0) {
			error("The weight can not be less than 1", DslPackage.Literals.METRIC__WEIGHT)
		}
	}

	@Check
	def void checkCanNotPunishShorterSequencesOfActions(Metric metric) {
		if(metric.state == "punish" && metric.name == "shorterSequencesOfActions"){
			error("It is not possible to punish shorter sequences of actions. Did you mean to reward longer sequences of actions?", DslPackage.Literals.METRIC__STATE)
		}
	}
	
	@Check
	def void checkCanNotPunishLongerSequencesOfActions(Metric metric) {
		if(metric.state == "punish" && metric.name == "longerSequencesOfActions"){
			error("It is not possible to punish longer sequences of actions. Did you mean to reward shorter sequences of actions?", DslPackage.Literals.METRIC__STATE)
		}
	}
	
	@Check
	def void checkCanNotPunishRepairingLowerInTheContextHierarchies(Metric metric) {
		if(metric.state == "punish" && metric.name == "repairingLowerInTheContextHierarchies"){
			error("It is not possible to punish repairing lower in the context hierarchies. Did you mean to reward reward repairing higher in the context hierarchies?", DslPackage.Literals.METRIC__STATE)
		}
	}
	
	@Check
	def void checkCanNotPunishRepairingHigherInTheContextHierarchies(Metric metric) {
		if(metric.state == "punish" && metric.name == "repairingHigherInTheContextHierarchies"){
			error("It is not possible to punish repairing higher in the context hierarchies. Did you mean to reward reward repairing lower in the context hierarchies?", DslPackage.Literals.METRIC__STATE)
		}
	}
	
	@Check
	def void checkCanNotRewardDeletion(Metric metric) {
		if(metric.state == "reward" && metric.name == "deletion"){
			error("It is not possible to reward deletion.", DslPackage.Literals.METRIC__STATE)
		}
	}
	
	/**
	 * TODO: Check that we do not reward oposites, like repairingHigherInTheContextHierarchies and repairingLowerInTheContextHierarchies at the same time.
	 */
}