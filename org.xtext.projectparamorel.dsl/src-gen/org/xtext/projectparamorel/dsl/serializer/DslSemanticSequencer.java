/*
 * generated by Xtext 2.16.0
 */
package org.xtext.projectparamorel.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.projectparamorel.dsl.dsl.DslPackage;
import org.xtext.projectparamorel.dsl.dsl.Experience;
import org.xtext.projectparamorel.dsl.dsl.Metric;
import org.xtext.projectparamorel.dsl.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DslPackage.EXPERIENCE:
				sequence_Experience(context, (Experience) semanticObject); 
				return; 
			case DslPackage.METRIC:
				sequence_Metric(context, (Metric) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Experience returns Experience
	 *
	 * Constraint:
	 *     entries+=Entry+
	 */
	protected void sequence_Experience(ISerializationContext context, Experience semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entry returns Metric
	 *     Metric returns Metric
	 *
	 * Constraint:
	 *     (state=StateOption name=QualifiedName weight=INT)
	 */
	protected void sequence_Metric(ISerializationContext context, Metric semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.METRIC__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.METRIC__STATE));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.METRIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.METRIC__NAME));
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.METRIC__WEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.METRIC__WEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMetricAccess().getStateStateOptionParserRuleCall_5_0(), semanticObject.getState());
		feeder.accept(grammarAccess.getMetricAccess().getNameQualifiedNameParserRuleCall_6_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMetricAccess().getWeightINTTerminalRuleCall_11_0(), semanticObject.getWeight());
		feeder.finish();
	}
	
	
}
