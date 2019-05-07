/**
 * generated by Xtext 2.16.0
 */
package org.xtext.projectparamorel.dsl.validation;

import com.google.common.base.Objects;
import org.eclipse.xtext.validation.Check;
import org.xtext.projectparamorel.dsl.dsl.DslPackage;
import org.xtext.projectparamorel.dsl.dsl.Metric;
import org.xtext.projectparamorel.dsl.validation.AbstractDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  @Check
  public void checkWeightsAreLessThanElleven(final Metric metric) {
    int _weight = metric.getWeight();
    boolean _greaterThan = (_weight > 10);
    if (_greaterThan) {
      this.error("The weight can not be larger than 10", DslPackage.Literals.METRIC__WEIGHT);
    }
  }
  
  @Check
  public void checkWeightsAreMoreThanZero(final Metric metric) {
    int _weight = metric.getWeight();
    boolean _lessThan = (_weight < 0);
    if (_lessThan) {
      this.error("The weight can not be less than 1", DslPackage.Literals.METRIC__WEIGHT);
    }
  }
  
  @Check
  public void checkCanNotPunishShorterSequencesOfActions(final Metric metric) {
    if ((Objects.equal(metric.getState(), "punish") && Objects.equal(metric.getName(), "shorterSequencesOfActions"))) {
      this.error("It is not possible to punish shorter sequences of actions. Did you mean to reward longer sequences of actions?", DslPackage.Literals.METRIC__STATE);
    }
  }
  
  @Check
  public void checkCanNotPunishLongerSequencesOfActions(final Metric metric) {
    if ((Objects.equal(metric.getState(), "punish") && Objects.equal(metric.getName(), "longerSequencesOfActions"))) {
      this.error("It is not possible to punish longer sequences of actions. Did you mean to reward shorter sequences of actions?", DslPackage.Literals.METRIC__STATE);
    }
  }
  
  @Check
  public void checkCanNotPunishRepairingLowerInTheContextHierarchies(final Metric metric) {
    if ((Objects.equal(metric.getState(), "punish") && Objects.equal(metric.getName(), "repairingLowerInTheContextHierarchies"))) {
      this.error("It is not possible to punish repairing lower in the context hierarchies. Did you mean to reward reward repairing higher in the context hierarchies?", DslPackage.Literals.METRIC__STATE);
    }
  }
  
  @Check
  public void checkCanNotPunishRepairingHigherInTheContextHierarchies(final Metric metric) {
    if ((Objects.equal(metric.getState(), "punish") && Objects.equal(metric.getName(), "repairingHigherInTheContextHierarchies"))) {
      this.error("It is not possible to punish repairing higher in the context hierarchies. Did you mean to reward reward repairing lower in the context hierarchies?", DslPackage.Literals.METRIC__STATE);
    }
  }
  
  @Check
  public void checkCanNotRewardDeletion(final Metric metric) {
    if ((Objects.equal(metric.getState(), "reward") && Objects.equal(metric.getName(), "deletion"))) {
      this.error("It is not possible to reward deletion.", DslPackage.Literals.METRIC__STATE);
    }
  }
}
