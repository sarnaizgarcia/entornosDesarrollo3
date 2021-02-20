/**
 * 
 */
package entornosDesarrollo3;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import principal.Producto;


/**
 * @author Mery
 *
 */
class TestProducto {
	
private Producto p1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		//Creamos un objeto nuevo antes de cada clase test para empezar con objeto limpio
		p1 = new Producto();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Nuevo test");
	}
	
	@Test
	public void multiplicar1Iguales() {
		//Esperamos que salgan iguales
		System.out.println("Test 1 Multiplicacion1");
		int resultado = p1.multiplicar1(5, 16);
		assertEquals(80, resultado);
	}
			
	@Test
	public void multiplicar1NoIguales() {
		//Esperamos que no salgan iguales
		System.out.println("Test 2 Multiplicacion1");
		int resultado = p1.multiplicar1(5, 5);
		assertNotEquals(3, resultado);
	}

	@Test
	public void multiplicar1NotNull() {
		//Esperamos que salga que no es null
		System.out.println("Test 3 Multiplicacion1");
		int resultado = p1.multiplicar1(27, 18);
		assertNotNull(resultado);
	}
	
	@Test
	public void multiplicar1EsTrue() {
		//Esperamos que el resultado nos de true
		System.out.println("Test 4 Multiplicacion1");
		int resultado = p1.multiplicar1(3, 6);
		assertTrue(resultado==18);
	}
	
	@Test
	public void multiplicar2Iguales() {
		//Esperamos que salgan iguales
		System.out.println("Test 1 Multiplicacion2");
		float resultado = p1.multiplicar2(2.1F, 3.3F);
		assertEquals(6.9299994F, resultado);
	}
			
	@Test
	public void multiplicar2NoIguales() {
		//Esperamos que no salgan iguales
		System.out.println("Test 2 Multiplicacion2");
		float resultado = p1.multiplicar2(5.8F, 8.9F);
		assertNotEquals(5F, resultado);
	}

	@Test
	public void multiplicar2NotNull() {
		//Esperamos que salga que no es null
		System.out.println("Test 3 Multiplicacion2");
		float resultado = p1.multiplicar2(2.3F, 18.1F);
		assertNotNull(resultado);
	}
	
	@Test
	public void multiplicar2EsTrue() {
		//Esperamos que el resultado nos de true
		System.out.println("Test 4 Multiplicacion2");
		float resultado = p1.multiplicar2(1.1F, 1.1F);
		assertTrue(resultado==1.21F);
	}
	
	@Test
	public void multiplicar3Iguales() {
		//Esperamos que salgan iguales
		System.out.println("Test 1 Multiplicacion3");
		int resultado = p1.multiplicar3(2, 4, 6);
		assertEquals(48, resultado);
	}
			
	@Test
	public void multiplicar3NoIguales() {
		//Esperamos que no salgan iguales
		System.out.println("Test 2 Multiplicacion3");
		int resultado = p1.multiplicar3(5, 7, 10);
		assertNotEquals(6, resultado);
	}

	@Test
	public void multiplicar3NotNull() {
		//Esperamos que salga que no es null
		System.out.println("Test 3 Multiplicacion3");
		int resultado = p1.multiplicar3(12, 56, 4);
		assertNotNull(resultado);
	}
	
	@Test
	public void multiplicar3EsTrue() {
		//Esperamos que el resultado nos de true
		System.out.println("Test 4 Multiplicacion3");
		int resultado = p1.multiplicar3(4, 4, 6);
		assertTrue(resultado==96);
	}
	
	@Test
	public void multiplicar4Iguales() {
		//Esperamos que salgan iguales
		System.out.println("Test 1 Multiplicacion2");
		double resultado = p1.multiplicar4(2, 4);
		assertEquals(16, resultado);
	}
			
	@Test
	public void multiplicar4NoIguales() {
		//Esperamos que no salgan iguales
		System.out.println("Test 2 Multiplicacion2");
		double resultado = p1.multiplicar4(5, 7);
		assertNotEquals(8, resultado);
	}

	@Test
	public void multiplicar4NotNull() {
		//Esperamos que salga que no es null
		System.out.println("Test 3 Multiplicacion2");
		double resultado = p1.multiplicar4(12, 5);
		assertNotNull(resultado);
	}
	
	@Test
	public void multiplicar4EsTrue() {
		//Esperamos que el resultado nos de true
		System.out.println("Test 4 Multiplicacion2");
		double resultado = p1.multiplicar4(4, 4);
		assertTrue(resultado==256);
	}

}
