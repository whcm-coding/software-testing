package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator = new Calculator();
	@BeforeAll
	static void beforeAll() {
		System.out.println("beforeAll");
	}
	
	@BeforeEach
	void beforeEach() {
		calculator.clear();
		System.out.println("beforeEach");
	}

	@Test
	void testAdd() {
		calculator.add(3);
		assertEquals(calculator.getResult(), 3);
	}
	@Test
	void testAdd2() {
		calculator.add(1);
		assertEquals(calculator.getResult(), 1);
	}
	@AfterEach
	void afterEach( ) {
		System.out.println("afterEach");
	}
	@AfterAll
	static void afterAll( ) {
		System.out.println("afterAll");
	}
}
