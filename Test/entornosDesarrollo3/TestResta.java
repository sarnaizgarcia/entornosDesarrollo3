/**
 * @author Elena
 */
package entornosDesarrollo3;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import principal.Resta;

public class TestResta {

	private Resta r1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		//Creamos un objeto nuevo antes de cada clase test para empezar con objeto limpio
		r1 = new Resta();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Nuevo test");
	}
	
	@Test
	private void restaRealesIguales() {
		//Esperamos que salgan iguales
		System.out.println("Test 1 Resta Reales");
		r1.restaReales(18, 7);
		double resultado = r1.restaReales(18, 7);
		assertEquals(11, resultado);
	}
				
	
	@Test
	private void restaRealesNoIguales() {
		//Esperamos que no salgan iguales
		System.out.println("Test 2 Resta Reales");
		r1.restaReales(7, 18);
		double resultado = r1.restaReales(7, 18);
		assertNotEquals(3, resultado);
	}

	@Test
	private void restaRealesNotNull() {
		//Esperamos que salga que no es vacío
		System.out.println("Test 3 Resta Reales");
		r1.restaReales(27, 18);
		double resultado = r1.restaReales(27, 18);
		assertNotNull(resultado);
	}

}
