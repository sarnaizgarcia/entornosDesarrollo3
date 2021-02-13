package principal;
import java.util.*;

/**
 * Esta clase implementa los metodos relacionados con la <b>resta</b> de la clase Calculadora
 * 
 * @author MerySagra
 * @version 1.0
 * @since 22/01/2021
 * 
 */

public class Resta{
	
	private double minuendo;
	private double sustraendo;
	private double sustraendo2;
	private double resultado;
	
	public Resta(){
		
	}
	
	/**
	 * Este metodo resta dos <b>numeros reales</b>
	 * 
	 * @param minuendoR
	 * 		Valor del minuendo.
	 * @param sustraendoR
	 * 		Valor del sustraendo.
	 * @param resultado1
	 *		Valor del resultado.
	 * @return resultado1
	 * 		Resultado de la operacion.
	 * @throws NumberFormatException
	 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
	 * 
	 */
	
	public double restaReales(double minuendo, double sustraendo) {
		this.minuendo=minuendo;
		this.sustraendo=sustraendo;
		return (minuendo-sustraendo);
	}
	
	/**
	 * Este metodo resta dos <em>numeros enteros</em>
	 * 
	 * @param minuendoE
	 * 		Valor del minuendo.
	 * @param sustraendoE
	 * 		Valor del sustraendo.
	 * @param resultado2
	 *		Valor del resultado.
	 * @return resultado2
	 * 		Resultado de la operacion.
	 * @throws NumberFormatException
	 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
	 * 
	 */
	
	public int restaEnteros(int minuendo, int sustraendo) {
		this.minuendo=minuendo;
		this.sustraendo=sustraendo;
		return (minuendo-sustraendo);
	}
	
	/**
	 * Este metodo calcula la resta de <u>tres numeros reales</u>
	 * 
	 * @param minuendoTres
	 * 		Valor del minuendo.
	 * @param sustraendoTres
	 * 		Valor del sustraendo.
	 * @param sustraendoDosTres
	 * 		Valor del sustraendo dos.
	 * @param resultado3
	 *		Valor del resultado.
	 * @return resultado3
	 * 		Resultado de la operacion.
	 * @throws NumberFormatException
	 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
	 * 
	 */
	
	public double restaTresReales(double minuendo, double sustraendo, double sustraendo2) {
		this.minuendo=minuendo;
		this.sustraendo=sustraendo;
		this.sustraendo2=sustraendo2;
		return (minuendo-sustraendo-sustraendo2);
	}
	
	/**
	 * Este metodo calcula la resta de un valor acumulado
	 * 
	 * @param valor
	 * 		Valor del numero guardado
	 * @param resultado4
	 *		Valor del resultado.
	 * @return resultado4
	 * 		Resultado de la operación.
	 * @throws NumberFormatException
	 * 		Excepcion si se introduce un valor no valido. {@link NumberFormatException#getLocalizedMessage()}
	 * 
	 */
	
	public double acumulado(double sustraendo) {
		this.sustraendo=sustraendo;
		this.resultado=this.resultado-sustraendo;
		return resultado;
	}

}
