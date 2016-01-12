/**
 *
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 17 Tema 4
 */

public class Ej17 {

	public static void main(String[] args) {
		
		System.out.print("Por favor, introduzca un número entero: ");
		int n = Integer.parseInt(System.console().readLine());
		System.out.println("La última cifra del número introducido es el " + (n % 10));
	}
}
