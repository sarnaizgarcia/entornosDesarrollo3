package entornosDesarrollo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import principal.Suma;

class TestSuma {
	
	private Suma suma;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("=======Tests de la clase Suma=======");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("=======Fin de los tests de la clase Suma=======");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("=======Nuevo test=======");
		suma = new Suma();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("=======Fin del test=======");
	}
	
	@Test
	void testSumaDosReales() {
		System.out.println("=======Ejecutando test 1=======");
		float resultado = suma.sumaDosReales(25F, 15F);
		assertEquals(resultado, 40F);
	}
	
	@Test
	void testSumaDoEnteros() {
		System.out.println("=======Ejecutando test 2=======");
		int resultado = suma.sumaDosEnteros(25, 15);
		assertEquals(resultado, 40);
	}

}
// Tipo de dato
// Que devuelve el número que queremos
// Suma de dos enteros => entero
// Suma de dos reales => real
// 