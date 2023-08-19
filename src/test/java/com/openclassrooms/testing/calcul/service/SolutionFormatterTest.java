package com.openclassrooms.testing.calcul.service;

import org.junit.jupiter.api.BeforeEach;

public class SolutionFormatterTest {

	private SolutionFormatter solutionFormatter;

	@BeforeEach
	public void initFormatter() {
		solutionFormatter = new SolutionFormatterImpl();
	}

	/*
	 * @Test public void format_shouldFormatAnyBigNumber() { // GIVEN final int
	 * number = 1234567890;
	 * 
	 * // WHEN final String result = solutionFormatter.format(number);
	 * 
	 * // THEN assertThat(result).isEqualTo("1 234 567 890"); }
	 */

}
