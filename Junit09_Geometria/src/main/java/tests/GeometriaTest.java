package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

public class GeometriaTest {

	
	@Test
	public void testAreaCuadrado() {
		int resultado = Geometria.areaCuadrado(2);
		int esperado = 4;
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = Geometria.areaCirculo(2);
		double esperado = 12.5664;
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaTriangulo() {
		int resultado = Geometria.areaTriangulo(2, 5);
		int esperado = 5;
		
		
		assertEquals(esperado, resultado);
	}
}
