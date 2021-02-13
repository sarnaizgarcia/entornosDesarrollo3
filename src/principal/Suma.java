package principal;
/**
	 * Esta clase realiza la operación básicas de sumar
	 * 
	 * @author Elena Vega
	 * @since 22/01/2021
	 * @version 1.0
	 *
	 */

public class Suma {
	
		/**
		 * Este metodo suma dos numeros reales
		 * 
		 * @param num1 representa el primer numero a sumar. Sólo permite la entrada de parámetros numéricos, por ejemplo (0,2.5,-3,4.5...).
		 * @param num2 representa el segundo numero a sumar. Sólo permite la entrada de parámetros numéricos, por ejemplo (0,2.5,-3,4.5...).
		 * @param result guarda el resultado real de la operación.
		 * @return devuelve el valor del resultado
		 * @throws NumberFormatException: lanza excepción si se introduce un caracter no numérico.
		 */
		public float sumaDosReales(float num1, float num2) {
			float result=num1 + num2;
			return result;
		}
		
		/**
		 * Este metodo suma dos numeros enteros
		 * 
		 * @param num1 representa el primer numero a sumar. Sólo permite la entrada de parámetros numéricos enteros, por ejemplo (0,1,2,3...).
		 * @param num2 representa el segundo numero a sumar. Sólo permite la entrada de parámetros numéricos enteros, por ejemplo (0,1,2,3...).
		 * @param result guarda el resultado real de la operación.
		 * @return devuelve el valor del resultado
		 * @throws NumberFormatException: lanza excepción si se introduce un caracter no numérico.
		 */
		
		public int sumaDosEnteros(int num1, int num2) {
			int result=num1 + num2;
			return result;
		}
		
		/**
		 * Este metodo suma tres numeros reales
		 * 
		 * @param num1 representa el primer numero a sumar. Sólo permite la entrada de parámetros numéricos, por ejemplo (0,2.5,-3,4.5...).
		 * @param num2 representa el segundo numero a sumar. Sólo permite la entrada de parámetros numéricos, por ejemplo (0,2.5,-3,4.5...).
		 * @param num3 representa el primer numero a sumar. Sólo permite la entrada de parámetros numéricos, por ejemplo (0,2.5,-3,4.5...).
		 * @param result guarda el resultado real de la operación.
		 * @return devuelve el valor del resultado
		 * @throws NumberFormatException: lanza excepción si se introduce un caracter no numérico.
		 */
		public float sumarTresReales(float num1, float num2, float num3) {
			float result=num1 + num2 + num3;
			return result;
		}
		
		/**
		 * Este metodo suma dos numeros, el acumulado y uno nuevo
		 * 
		 * @param num1 representa el primer numero a sumar. Sólo permite la entrada de parámetros numéricos enteros, por ejemplo (0,1,2,3...).
		 * @param result representa el resultado de la operación y actúa como acumulador.
		 * @param result guarda el resultado real de la operación.
		 * @return devuelve el valor del resultado
		 * @throws NumberFormatException: lanza excepción si se introduce un caracter no numérico.
		 */
		public int sumaAcumulado(int num1) {
			
			int result=0;
			result=num1 + result;
			return result;
		}
}



