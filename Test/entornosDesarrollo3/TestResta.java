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
	
	//Test método restaReales
	@Test
	public void restaRealesIguales() {
		//Esperamos que salgan iguales
		System.out.println("Test 1 Resta Reales");
		double resultado = r1.restaReales(654.58,312.54);
		assertEquals(342.04, resultado);
	}
				
	@Test
	public void restaRealesNoIguales() {
		//Esperamos que no salgan iguales
		System.out.println("Test 2 Resta Reales");
		double resultado = r1.restaReales(751.5, 1854.65);
		assertNotEquals(-1703.15, resultado);
	}

	@Test
	public void restaRealesNotNull() {
		//Esperamos que salga que no es vacío
		System.out.println("Test 3 Resta Reales");
		double resultado = r1.restaReales(654.58,312.54);
		assertNotNull(resultado);
	}
	
	@Test
    public void restaRealesTrue() {
        //Esperamos que nos de true
        System.out.println("Test 4 Resta Reales");
        double resultado = r1.restaReales(564, 354);
        assertTrue(resultado==210);
    }
	
	//Test método restaEnteros
	@Test
	public void restaEnterosIguales() {
		//Esperamos que salgan iguales
		System.out.println("Test 1 Resta Enteros");
		int resultado = r1.restaEnteros(18, 7);
		assertEquals(11, resultado);
	}
				
	@Test
	public void restaEnterosNoIguales() {
		//Esperamos que no salgan iguales
		System.out.println("Test 2 Resta Enteros");
		int resultado = r1.restaEnteros(7, 18);
		assertNotEquals(3, resultado);
	}

	@Test
	public void restaEnterosNotNull() {
		//Esperamos que salga que no es vacío
		System.out.println("Test 3 Resta Enteros");
		int resultado = r1.restaEnteros(27, 18);
		assertNotNull(resultado);
	}
	
	@Test
    public void restaEnterosTrue() {
        //Esperamos que nos de true
        System.out.println("Test 4 Resta Enteros");
        int resultado = r1.restaEnteros(3, 6);
        assertTrue(resultado==-3);
    }
	
	//Test método Resta Tres Reales
	@Test
	public void restaTresRealesIguales() {
		//Esperamos que salgan iguales
		System.out.println("Test 1 Resta Tres Reales");
		double resultado = r1.restaTresReales(654.58,312.54,546.3);
		assertEquals(-204.25999999999993, resultado);
	}
				
	@Test
	public void restaTresRealesNoIguales() {
		//Esperamos que no salgan iguales
		System.out.println("Test 2 Resta Tres Reales");
		double resultado = r1.restaTresReales(751.5,1854.65,654.54);
		assertNotEquals(-0.69, resultado);
	}

	@Test
	public void restaTresRealesNotNull() {
		//Esperamos que salga que no es vacío
		System.out.println("Test 3 Resta Tres Reales");
		double resultado = r1.restaTresReales(654.58,312.54,654.3);
		assertNotNull(resultado);
	}
	
	@Test
    public void restaTresRealesTrue() {
        //Esperamos que nos de true
        System.out.println("Test 4 Resta Tres Reales");
        double resultado = r1.restaTresReales(564,354,8546);
        assertTrue(resultado==-8336);
    }
	
	//Test método acumulado
	@Test
	public void acumuladoIguales() {
		//Esperamos que salgan iguales
		System.out.println("Test 1 Acumulado");
		double resultado = r1.acumulado(51);
		assertEquals(-51, resultado);
	}
				
	@Test
	public void acumuladoNoIguales() {
		//Esperamos que no salgan iguales
		System.out.println("Test 2 Acumulado");
		double resultado = r1.acumulado(87);
		assertNotEquals(179, resultado);
	}

	@Test
	public void acumuladoNotNull() {
		//Esperamos que salga que no es vacío
		System.out.println("Test 3 Acumulado");
		double resultado = r1.acumulado(18);
		assertNotNull(resultado);
	}
	
	@Test
    public void acumuladoTrue() {
        //Esperamos que nos de true
        System.out.println("Test 4 Acumulado");
        double resultado = r1.acumulado(564);
        assertTrue(resultado==-564);
    }

}
