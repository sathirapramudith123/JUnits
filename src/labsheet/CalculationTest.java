package labsheet;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculationTest {
	
	/*
	 This annotation can be used to execute some statement(s) such as
preconditions before each test case.
	 */
	@Before
	public void beforeAnnotation() {
		System.out.println("Before");
	}

	/*
	 * This annotation can be used to execute some statement(s) before all the test
cases
	 */
	@BeforeClass
	public static void beforeclassAnnotation() {
		System.out.println("Before class");
	}
	
	//This annotation can be used to execute some statement(s) after each test case.
	@After
	public void afterAnnotation() {
		System.out.println("After");
	}

	//This annotation can be used to execute some statement(s) after all test cases.
	@AfterClass
	public static void afterclassAnnotation() {
		System.out.println("After class");
	}
	
	
	/*
	 * This annotation can be used to ignore some statement(s) during test execution.
	 */
	@Ignore("not implemented yet")
	@Test
	public void ignoresTest() {
		fail("this test is ignored");
	}
	
	@Test(timeout = 500)
	public void testSubtraction1() {
		int result = Calculation.subtraction(20, 5);
		assertEquals(15, result);
	}
	
	/*This annotation indicates that public void method to which it is attached can
	be executed as a test case.
	*/
	@Test
	public void testAddition() {
		int a = 15;
		int b = 20;
		int expectedResult = 35;
		int result = Calculation.addition(a, b);
		assertEquals(expectedResult, result);
	}

	/*This annotation indicates that public void method to which it is attached can
	be executed as a test case.
	*/
	@Test
	public void testSubtraction() {
		int x= 40;
		int y = 20;
		int expectedResult = 20;
		int result = Calculation.subtraction(x, y);
		assertEquals(expectedResult, result);
	}
	
	/*This annotation indicates that public void method to which it is attached can
	be executed as a test case.
	*/
	@Test
	public void testMultiplication() {
		int p= 5;
		int q = 2;
		int expectedResult = 10;
		int result = Calculation.multiplication(p, q);
		assertEquals(expectedResult, result);
	}
	
	/*This annotation indicates that public void method to which it is attached can
	be executed as a test case.
	*/
	@Test
	public void testDivition() {
		int s= 50;
		int k = 2;
		int expectedResult = 25;
		int result = Calculation.divition(s, k);
		assertEquals(expectedResult, result);
	}

}
