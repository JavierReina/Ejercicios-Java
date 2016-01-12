/**
 *
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 14 Tema 5
 */

public class Ej14 {

  public static void main(String[] args) {
    
    System.out.println("Este programa calculará una potencia");
    
    System.out.print("\nIndique la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique el exponente: ");
    int exp = Integer.parseInt(System.console().readLine());
    
    int total = 0;
    
    if (exp == 0) {
      total = 1;
    } else if ((exp == 1) || (exp == -1)) {
      total = base;
    } else if (exp > 1) {
      for (int i = 2; i <= exp; i++) {
        if (i == 2) {
          total = base;
        } else {
          total *= base;
        }
      }//for
    } else {
      for (int i = -2; i >= exp; i--) {
        if (i == -2) {
          total = base;
        } else {
          total *= base;
        }
      }//for
    }//termina if
    if (exp >= 0) {
      System.out.println("El resultado de la potencia es: " + total);
    } else {
      System.out.println("El resultado de la potencia es: " + "1/" + total);
    }
  }
}
