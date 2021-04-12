package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreeTest {

	@Test
	public void testTriangolo() {
		int a = 5;
		int b = 2;
		int valoreAtteso = 5;
		int valoreCalcolato = Aree.triangolo(a, b);
		assertEquals(valoreAtteso, valoreCalcolato);

	}

	@Test
	public void testQuadrato() {
		int a = 10;
		int valoreAtteso = 99;
		int valoreCalcolato = Aree.quadrato(a);
		assertEquals(valoreAtteso, valoreCalcolato);
	}

	@Test
	public void testRombo() {
		int a = 6;
		int b = 5;
		int valoreAtteso = 15;
		int valoreCalcolato = Aree.rombo(a, b);
		assertEquals(valoreAtteso, valoreCalcolato);
	}
	
	public void testTrapezio() {
		int a = 2;
		int b = 3;
		int c = 4;
		int valoreAtteso = 10;
		int valoreCalcolato = Aree.trapezio(a, b, c);
		assertEquals(valoreAtteso, valoreCalcolato);
	}

}
