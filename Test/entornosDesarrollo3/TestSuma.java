package entornosDesarrollo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import principal.Suma;

public class TestSuma {
	
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
	public void testSumaDosRealesIguales() {
		System.out.println("=======Ejecutando test 1 de sumaDosReales()=======");
		float resultado = suma.sumaDosReales(25F, 15F);
		assertEquals(resultado, 40F);
	}
	
	@Test
	public void testSumaDosRealesNoIguales() {
		System.out.println("=======Ejecutando test 2 de sumaDosReales()=======");
		float resultado = suma.sumaDosReales(25F, 15F);
		assertNotEquals(resultado, 0);
	}
	
	@Test
	public void testSumaDosRealesNoNulos() {
		System.out.println("=======Ejecutando test 3 de sumaDosReales()=======");
		float resultado = suma.sumaDosReales(25F, 15F);
		assertNotNull(resultado);
	}
	
	@Test
	public void testSumaDosRealesTrue() {
		System.out.println("=======Ejecutando test 4 de sumaDosReales()=======");
		float resultado = suma.sumaDosReales(25F, 15F);
		assertTrue(resultado == 40F);
	}
	
	@Test
	public void testSumaDosEnterosIguales() {
		System.out.println("=======Ejecutando test 1 de sumaDosEnteros()=======");
		int resultado = suma.sumaDosEnteros(25, 15);
		assertEquals(resultado, 40);
	}
	
	@Test
	public void testSumaDosEnterosNoIguales() {
		System.out.println("=======Ejecutando test 2 de sumaDosEnteros()=======");
		int resultado = suma.sumaDosEnteros(25, 15);
		assertNotEquals(resultado, 0);
	}
	
	@Test
	public void testSumaDosEnterosNoNulos() {
		System.out.println("=======Ejecutando test 3 de sumaDosEnteros()=======");
		int resultado = suma.sumaDosEnteros(25, 15);
		assertNotNull(resultado);
	}
	
	@Test
	public void testSumaDosEnterosTrue() {
		System.out.println("=======Ejecutando test 4 de sumaDosEnteros()=======");
		int resultado = suma.sumaDosEnteros(25, 15);
		assertTrue(resultado == 40);
	}
	
	@Test
	public void testSumarTresRealesIguales() {
		System.out.println("=======Ejecutando test 1 de sumarTresReales()=======");
		float resultado = suma.sumarTresReales(25F, 15F, 5F);
		assertEquals(resultado, 45F);
	}
	
	@Test
	public void testSumarTresRealesNoIguales() {
		System.out.println("=======Ejecutando test 2 de sumarTresReales()=======");
		float resultado = suma.sumarTresReales(25F, 15F, 5F);
		assertNotEquals(resultado, 0);
	}
	
	@Test
	public void testSumarTresRealesNoNulos() {
		System.out.println("=======Ejecutando test 3 de sumarTresReales()=======");
		float resultado = suma.sumarTresReales(25F, 15F, 5F);
		assertNotNull(resultado);
	}
	
	@Test
	public void testSumarTrue() {
		System.out.println("=======Ejecutando test 4 de sumarTresReales()=======");
		float resultado = suma.sumarTresReales(25F, 15F, 5F);
		assertTrue(resultado == 45F);
	}
	
	@Test
	public void testSumaAcumuladoIguales() {
		System.out.println("=======Ejecutando test 1 de sumaAcumulado()=======");
		int resultado = suma.sumaAcumulado(25);
		assertEquals(resultado, 25);
	}
	
	@Test
	public void testSumaAcumuladoNoIguales() {
		System.out.println("=======Ejecutando test 2 de sumaAcumulado()=======");
		int resultado = suma.sumaAcumulado(25);
		assertNotEquals(resultado, 0);
	}
	
	@Test
	public void testSumaAcumuladoNoNulos() {
		System.out.println("=======Ejecutando test 3 de sumaAcumulado()=======");
		int resultado = suma.sumaAcumulado(25);
		assertNotNull(resultado);
	}
	
	@Test
	public void testSumaAcumuladoTrue() {
		System.out.println("=======Ejecutando test 4 de sumaAcumulado()=======");
		int resultado = suma.sumaAcumulado(25);
		assertTrue(resultado == 25);
	}

}
