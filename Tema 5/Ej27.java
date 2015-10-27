/**
 *
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 27 Tema 5
 */

public class Ej27 {

  public static void main(String[] args) {
    
    System.out.println("Este programa calculará los multiplos de 3 hasta el número que se introduce");
    
    int num = 0;
    do {
    System.out.print("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());
    if (num < 3) {
      System.out.println("Que el número sea mayor o igual a 3\n");
    } else {
      //nada
    }
    } while (num < 3); 
    
    for (int i = 1; (i * 3) <= num; i++) {
      if (i <= num) {
        System.out.println(i + "º) " + (i * 3));
      } else {
      }
    }
  }
}
