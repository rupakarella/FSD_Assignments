package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {

		Calculator cal = new Calculator();

		int actual = cal.add(4, 5);
		assertEquals(9, actual);
	}


	@Test
	void testSub() {
		Calculator cal = new Calculator();

		int actual = cal.sub(5, 5);
		assertEquals(0, actual);
	}

	@Test
	
	void testMultiply() {
		Calculator cal = new Calculator();

		int actual = cal.multiply(5, 5);
		assertEquals(25, actual);
	}

	@Test
	void testDivision() {
		Calculator cal = new Calculator();

		int actual = cal.div(5, 5);
		assertEquals(1, actual);
	}

}