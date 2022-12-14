package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

public class GeometriaTest {

	Geometria geometria = new Geometria();
	Geometria g = new Geometria(1); 
	
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
	
	@Test
	public void testAreaRectangulo() {
		int resultado = Geometria.areaRectangulo(2, 3);
		int esperado = 6;
		
		
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaPentagono() {
		int resultado = Geometria.areaPentagono(5, 2);
		int esperado = 5;
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRombo() {
		int resultado = Geometria.areaRombo(1, 2);
		int esperado = 1;
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRomboide() {
		int resultado = Geometria.areaRomboide(4, 4);
		int esperado = 16;
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaTrapecio() {
		int resultado = Geometria.areaTrapecio(2, 2, 2);
		int esperado = 4;
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testfigura1() {
		String resultado = Geometria.figura(1);
		String esperado = "Cuadrado";
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testfigura2() {
		String resultado = Geometria.figura(2);
		String esperado = "Circulo";
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testfigura3() {
		String resultado = Geometria.figura(3);
		String esperado = "Triangulo";
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testfigura4() {
		String resultado = Geometria.figura(4);
		String esperado = "Rectangulo";
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testfigura5() {
		String resultado = Geometria.figura(5);
		String esperado = "Pentagono";
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testfigura6() {
		String resultado = Geometria.figura(6);
		String esperado = "Rombo";
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testfigura7() {
		String resultado = Geometria.figura(7);
		String esperado = "Romboide";
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testfigura8() {
		String resultado = Geometria.figura(8);
		String esperado = "Trapecio";
		
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testfiguradef() {
		String resultado = Geometria.figura(12);
		String esperado = "Default";
		
		
		assertEquals(esperado, resultado);
	}

	@Test
	public void testtoString() {
		
		String s = "Geometria [id=9, nom=Default, area=0.0]";
		
		assertEquals(s, geometria.toString());
	}
	
	@Test
	public void testGetId() {
		int resultado = geometria.getId();
		int esperado = geometria.getId();
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSetId() {
		geometria.setId(8);
		int resultado = geometria.getId();
		int esperado =8;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testGetNom() {
		String resultado = geometria.getNom();
		String esperado = geometria.getNom();
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSetNom() {
		geometria.setNom("Trapecio");
		String resultado = geometria.getNom();
		String esperado = "Trapecio";
		assertEquals(esperado, resultado);
	}

	@Test
	public void testGetArea() {
		double resultado = geometria.getArea();
		double esperado = geometria.getArea();
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSetArea() {
		geometria.setArea(200.91);
		double resultado = geometria.getArea();
		double esperado =200.91;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void constructorTest() {
	
		
		assertEquals(1, g.getId());
		assertEquals("Cuadrado", g.getNom());
	} 
}

