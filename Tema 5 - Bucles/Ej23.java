/**
 *
 * Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su suma 
 * no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado, 
 * el contador de los números introducidos y la media
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 23 Tema 5
 */

public class Ej23 {

  public static void main(String[] args) {
    
    int num = 0;
    int total = 0;
    int cuenta = 0;
    do {
      System.out.print("Introduzca un número: ");
      num = Integer.parseInt(System.console().readLine());
      cuenta++;
      total += num;
    } while (total < 10000);
    System.out.println("----------------------------------------");
    System.out.println("| Total                | " + total);
    System.out.println("----------------------------------------");
    System.out.println("| Números introducidos | " + cuenta);
    System.out.println("----------------------------------------");
    System.out.println("| Media                | " + (total / cuenta));
    System.out.println("----------------------------------------");
    
  }
}
