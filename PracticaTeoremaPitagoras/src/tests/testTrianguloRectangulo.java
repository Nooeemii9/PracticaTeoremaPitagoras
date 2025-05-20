package tests;

import clases.TrianguloRectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testTrianguloRectangulo {


	static TrianguloRectangulo tr1;
	static TrianguloRectangulo tr2;
	
	@BeforeAll 
	static void setup() { 
		tr1 = new TrianguloRectangulo(); 
		tr2 = new TrianguloRectangulo(2,3);
		}

	@Test
	void testAreaDefecto() {
		double areaObtenido = Math.round(tr1.area() * 100) / 100;
	       double areaEsperado =  Math.round( 0.5 * 100) / 100;
	       assertEquals(areaEsperado, areaObtenido);
	}

	@Test
	void testHipotenusaDefecto() {
		double areaObtenida = tr1.hipotenusa();
	       double areaEsperada = Math.round(1.4142135623730951 * 100) / 100;
	       assertEquals(areaEsperada, areaObtenida);

	}

	@Test
	void testPerimetroDefecto() {
		 double perimetroObtenido = Math.round(tr1.perimetro() * 100) / 100;
	        double perimetroEsperado = Math.round(3.414213562373095 * 100) / 100;
	        assertEquals(perimetroEsperado, perimetroObtenido);
	}

	@Test
	void testArea() {
		 double areaObtenido = Math.round(tr2.area() * 100) / 100;
	       double areaEsperado = Math.round(3 * 100) / 100;
	       assertEquals(areaEsperado, areaObtenido);

	}

	@Test
	void testHipotenusa() {
		double areaObtenida = tr2.hipotenusa();
	       double areaEsperada = Math.round(3.61 * 100) / 100;
	       assertEquals(areaEsperada, areaObtenida);

	}

	@Test
	void testPerimetro() {
		 double perimetroObtenido = Math.round( tr2.perimetro() * 100) / 100 ;
	        double perimetroEsperado =  Math.round(8 * 100) / 100;
	        assertEquals(perimetroEsperado, perimetroObtenido);
	}

	@Test
	void testExcepcion() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new TrianguloRectangulo(-1, 0));
		String mensajeEsperado = "Un numero menor o igual que 0 no es valido";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}

}
