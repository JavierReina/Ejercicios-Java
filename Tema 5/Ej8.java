/**
 *
 * Muestra la tabla de multiplicar de un número introducido por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 8 Tema 5
 */

public class Ej8 {

  public static void main(String[] args) {
    
    System.out.println("Este programa mostrará la tabla de multiplicar de un número");
    
    System.out.print("Indique un número: ");
    int num = Integer.parseInt(System.console().readLine());
    
    System.out.println("\n------------------");
    
    for (int i = 0; i < 11; i++) {
      System.out.println("|" + num + " * " + i + "\t | " + (num * i) + "\t|");
    }
    System.out.println("------------------");
  }
}
