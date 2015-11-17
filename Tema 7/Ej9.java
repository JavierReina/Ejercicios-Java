/**
 *
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto 
 * con la palabra “par” o “impar” según proceda
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 9 Tema 7
 */

public class Ej9 {

  public static void main(String[] args) {
    
    int[] num = new int[8];
    boolean esPar = false;
    
    System.out.println("Introduzca 8 números");
    for (int i = 0; i < 8; i++) {
      System.out.print((i + 1) + ": ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    for (int i = 0; i < 8; i++) {
      esPar = false;
      if ((num[i] % 2) == 0) {
        esPar = true;
      } else {
        esPar = false;
      }
      
      System.out.print(num[i]);
      if (esPar == true) {
        System.out.print(" Par");
      } else {
        System.out.print(" Impar");
      }
      System.out.println();
    }
  }
}
