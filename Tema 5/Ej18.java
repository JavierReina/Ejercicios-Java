/**
 *
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado 
 * y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir 
 * incrementando de 7 en 7
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 18 Tema 5
 */

public class Ej18 {

  public static void main(String[] args) {
    
    System.out.println("Este programa dirá los números que hay entre 2 números introducidos");
    
    System.out.print("Introduzca el mínimo: ");
    int min = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el máximo: ");
    int max = Integer.parseInt(System.console().readLine());
    
    int muestra = min;
    
    do {
      muestra += 7;
      if (muestra <= max) {
        System.out.print(muestra + ", ");
      } else {
      }
    } while (muestra < max);
  }
}
