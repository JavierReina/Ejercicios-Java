/**
 *
 * Escribe un programa que calcule el factorial de un número entero leído por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 28 Tema 5
 */

public class Ej28 {

  public static void main(String[] args) {
    
    System.out.println("Este programa calculará el factorial del número introducido");
    
    int num = 0;
    long factorial = 1;
    do {
    System.out.print("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());
    if (num < 0) {
      System.out.println("Que el número sea mayor o igual a 0\n");
    } else {
      //nada
    }
    } while (num < 0); 
    
    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }
    System.out.println("El factorial del número es: " + factorial);
  }
}
