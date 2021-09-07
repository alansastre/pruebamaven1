package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

	@Test
	public void sumaNegativa() {
		
		int resultado = Calculadora.suma(-5, -5);
		assertEquals(-10, resultado);
		
	}
	
	@Test
	public void sumaCero() {
		
		int resultado = Calculadora.suma(0, 0);
		assertEquals(0, resultado);
		
	}
}
