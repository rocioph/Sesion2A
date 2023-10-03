package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.calculadora;

class calculadoraTest {
	//quiero que se inicializen antes de cada prueba 
	private int value1;
	private int value2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll //borrar datos de prueba
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach //ejecutar despues de cada prueba 
	void setUp() throws Exception {
		System.out.println("Before each");
		value1=5;
		value2=3;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSuma() {
		int expected=8;
		int actual=calculadora.suma(value1, value2);
		assertEquals(expected,actual);
	}

	@Test
	void testMultiplicar() {
		int expected=15;
		int actual=calculadora.multiplicar(value1, value2);
		assertEquals(expected,actual);
	}

	@Test
	void testResta() {
		int expected=2;
		int actual=calculadora.resta(value1, value2);
		assertEquals(expected,actual);
	}

	@Test
	void testDividir() {
		int expected=1;
		int actual=calculadora.dividir(value1, value2);
		assertEquals(expected,actual);
	}
	@Test
	void testDividirPor0() {
		int expected=-1;
		value2=0;
		int actual=calculadora.dividir(value1, 0);
		assertEquals(expected,actual);
	}
}
