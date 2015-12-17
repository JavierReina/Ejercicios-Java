/**
 *
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, 
 * es decir, el primero que se introduce es el último en mostrarse y viceversa
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 3 Tema 7
 */

public class Ej3 {

  public static void main(String[] args) {
    
    //cuando no se inicializan caracteres se inicializan con espacios
    int[] num = new int[10];
    
    System.out.println("Introduzca 10 números");
    for (int i = 0; i < 10; i++) {
      System.out.print((i + 1) + ": ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 9; i >= 0; i--) {
      System.out.print(num[i] + " ");
    }
  }
}
