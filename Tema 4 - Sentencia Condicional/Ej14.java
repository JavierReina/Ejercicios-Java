/**
 *
 * Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 14 Tema 4
 */
 
public class Ej14 {

	public static void main(String[] args) {
				
		System.out.print("Por favor, introduzca un número entero: ");
		int n = Integer.parseInt(System.console().readLine());

		if ((n % 2) == 0)
				System.out.print("El número introducido es par");
			else
				System.out.print("El número introducido es impar");

		if ((n % 5) == 0)
				System.out.println(" y divisible entre 5.");
			else
				System.out.println(" y no es divisible entre 5."); 
	}
}
