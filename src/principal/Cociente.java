package principal;

import java.lang.Math;


/**
 * Esta clase implementa los métodos relacionados con 
 * la <b>división</b> de la clase Calculadora.
 * 
 * @author sarnaizgarcia. 
 */

public class Cociente {
	
	/**
	 * El método cocienteReales divide dos <b>números enteros</b>.
	 * 
	 * @param f1 
	 * 		Dividendo real.
	 * @param f2 
	 * 		Divisor real.
	 * 
	 * @return result 
	 * 		División de f1/f2 con un máximo de dos decimales redondeando 
	 * 		hacia arriba. 
	 * 
	 * @throws ArithmeticException 
	 * 		Se lanza una excepción si f2 (el divisor) es igual a 0.
	 * @throws InvalidParameterException 
	 * 		Se lanza una excepción si f1 o f2 < 0.
	 * @throws NumberFormatException
	 * 		Se lanza una excepción si f1 o f2 tiene formato de string 
	 *              y no se puede convertir a un tipo numérico.  
	 */

	public double cocienteReales(double f1, double f2) {
		double result = f1 / f2;
		return result;
	}
	
	/**
	 * El método cocienteEnteros divide dos <em>números reales</em>
	 * 
	 * @param n1 
	 * 		Dividendo entero.
	 * @param n2 
	 * 		Divisor entero.
	 * 
	 * @return result 
	 * 		División de n1/n2, redondeando hacia arriba.
	 * 
	 * @throws ArithmeticException 
	 * 		Se lanza una excepción si f2 (el divisor) es igual a 0.
	 * @throws InvalidParameterException 
	 * 		Se lanza una excepción si f1 < 0 o f2 < 0.
	 * @throws NumberFormatException
	 * 		Se lanza una excepción si f1 o f2 tiene formato de string 
	 *              y no se puede convertir a un tipo numérico.
	 */
	
	public int cocienteEnteros(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
	
	/**
	 * El método inverso calcula el <u>inverso</u> de un número.
	 * 
	 * @param x 
	 * 		Número real.
	 * 
	 * @return result 
	 * 		Inverso de x, redondeado a dos decimales.
	 * 
	 * @throws ArithmeticException 
	 * 		Se lanza una excepción si x es igual a 0.
	 * @throws InvalidParameterException 
	 * 		Se lanza una excepción si f1 o f2 < 0.
	 * @throws NumberFormatException
	 * 		Se lanza una excepción si f1 o f2 tiene formato de string 
	 *              y no se puede convertir a un tipo numérico.
	 */
	
	public double inverso(double x) {
		double result = 1 / x;
		return result;	
	}
	
	/**
	 * El método raiz calcula la raíz cuadrada de un número entero.
	 * 
	 * @param y 
	 * 		Número entero.
	 * 
	 * @return result 
	 * 		Raiz cuadrada de y, redondeando a dos decimales.
	 * 
	 * @throws ArithmeticException 
	 * 		Se lanza una excepción si x es igual a 0.
	 * @throws InvalidParameterException 
	 * 		Se lanza una excepción si f1 o f2 < 0.
	 * @throws NumberFormatException
	 * 		Se lanza una excepción si f1 o f2 tiene formato de string 
	 *              y no se puede convertir a un tipo numérico.
	 */
	
	public double raiz(int y) {
		double result = (double)(Math.sqrt(y));
		return result;
	}

}