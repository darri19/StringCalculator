package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber1() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testOneNumber2() {
		assertEquals(2, Calculator.add("2"));
	}

	@Test
	public void testTwoNumbers1() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testTwoNumbers2() {
		assertEquals(5, Calculator.add("2,3"));
	}

	@Test
	public void testThreeNumbers1() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testThreeNumbers2() {
		assertEquals(35, Calculator.add("10,2,23"));
	}

	@Test
	public void testNewLine() {
		assertEquals(5, Calculator.add("2\n3"));
	}

}
