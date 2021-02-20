
package entornosDesarrollo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Guardi
 *
 */

	import static org.junit.Assert.assertNotNull;
	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

	import principal.Cociente;

	public class TestCociente {

		private Cociente c1;
		
		@BeforeAll
		static void setUpBeforeClass() throws Exception {
		}

		@AfterAll
		static void tearDownAfterClass() throws Exception {
		}
		
		@BeforeEach
		void setUp() throws Exception {
			//Creamos un objeto nuevo antes de cada clase test para empezar con objeto limpio
			c1 = new Cociente();
		}
		
		@AfterEach
		void tearDown() throws Exception {
			System.out.println("Nuevo test");
		}
		
		@Test
		public void CocienteRealesIguales() {
			//Esperamos que los numeros salgan iguales
			System.out.println("Test 1 Cocientes Reales");
			double resultado = c1.cocienteReales(10, 2);
			assertEquals(5, resultado);
		}
					
		
		@Test
		public void CocienteRealesNoIguales() {
			//Esperamos que los numeros no salgan iguales
			System.out.println("Test 2 Cocientes Reales");
			double resultado = c1.cocienteReales(10, 2);
			assertNotEquals(9, resultado);
		}

		@Test
		public void CocienteRealesNotNull() {
			//Esperamos que los numeros nos salgan que no es vacío
			System.out.println("Test 3 Cocientes Reales");
			c1.cocienteReales(20, 5);
			double resultado = c1.cocienteReales(20, 5);
			assertNotNull(resultado);
		}
		@Test
	    public void CocientesRealesEsTrue() {
	        //Esperamos que nos de true
	        System.out.println("Test 4 Cocientes Reales");
	        double resultado = c1.cocienteReales(10, 2);
	        assertTrue(resultado==5);
	    }
		
		@Test
		public void CocienteEnterosIguales() {
			//Esperamos que los numeros salgan iguales
			System.out.println("Test 1 Cocientes Enteros");
			double resultado = c1.cocienteEnteros(14, 2);
			assertEquals(7, resultado);
		}
					
		
		@Test
		public void CocienteEnterosNoIguales() {
			//Esperamos que los numeros no salgan iguales
			System.out.println("Test 2 Cocientes Enteros");
			double resultado = c1.cocienteEnteros(30, 2);
			assertNotEquals(9, resultado);
		}

		@Test
		public void CocienteEnterosNotNull() {
			//Esperamos que los numeros nos salgan que no es vacío
			System.out.println("Test 3 Cocientes Enteros");
			c1.cocienteEnteros(20, 5);
			double resultado = c1.cocienteEnteros(20, 5);
			assertNotNull(resultado);
		}
		@Test
	    public void CocientesEnterosEsTrue() {
	        //Esperamos que nos de true
	        System.out.println("Test 4 Cocientes Enteros");
	        double resultado = c1.cocienteEnteros(20, 2);
	        assertTrue(resultado==10);
		}
		
		@Test
		public void Inversoiguales() {
			//Esperamos que los numeros salgan iguales
			System.out.println("Test 1 Inverso");
			double resultado = c1.inverso(14);
			assertEquals(0.07142857142857142, resultado);
		}
					
		
		@Test
		public void InversoNoIguales() {
			//Esperamos que los numeros no salgan iguales
			System.out.println("Test 2 Inverso");
			double resultado = c1.inverso(30);
			assertNotEquals(9, resultado);
		}

		@Test
		public void InversoNotNull() {
			//Esperamos que los numeros nos salgan que no es vacío
			System.out.println("Test 3  Inverso");
			double resultado = c1.inverso(5);
			assertNotNull(resultado);
		}
		@Test
	    public void InversoEsTrue() {
	        //Esperamos que nos de true
	        System.out.println("Test 4 Inverso");
	        double resultado = c1.inverso(2);
	        System.out.println(resultado);
	        assertTrue(resultado==0.5);
		}
		
		
		
	
	}