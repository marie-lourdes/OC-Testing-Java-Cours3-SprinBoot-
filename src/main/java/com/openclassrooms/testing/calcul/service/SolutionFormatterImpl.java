package com.openclassrooms.testing.calcul.service;

import java.util.Locale;

//@Named utlisé pour permettre  l injection de dependance avec @inject 
//ou pour le test avec  @Mockbean SolutionFormatter injecté dans le constructor de CalculatorServiceImpl par Spring 
//lors du test du test de CalculatorControler qui utilise l instance CalculatorServiceImpl pour effectuer les calcul( avec les classe solutionFormatter et Calculator
public class SolutionFormatterImpl implements SolutionFormatter {

	@Override
	public String format(int solution) {
		return String.format(Locale.FRENCH, "%,d", solution);
	}
}
