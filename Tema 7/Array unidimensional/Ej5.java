/**
 *
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos 
 * junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 5 Tema 7
 */

public class Ej5 {

  public static void main(String[] args) {
    
    int[] num = new int[10];
    int max = 0;
    int min = 9999999;
    
    System.out.println("Introduzca 10 números");
    for (int i = 0; i < 10; i++) {
      System.out.print((i + 1) + ": ");
      num[i] = Integer.parseInt(System.console().readLine());
      
      if (num[i] > max) {
        max = num[i];
      }
      
      if (num[i] < min) {
        min = num[i];
      }
    }
    
    System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.print(num[i]);
      
      if (num[i] == max) {
        System.out.println(" Máximo");
      } else if (num[i] == min) {
        System.out.println(" Mínimo");
      } else {
        System.out.println();
      }
    }
  }
}
