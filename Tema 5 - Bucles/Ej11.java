/**
 *
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros 
 * números enteros a partir de uno que se introduce por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 11 Tema 5
 */

public class Ej11 {

  public static void main(String[] args) {
    
    System.out.println("Este programa calculará el cuadrado y cubo de un número y sus 4 consecutivos");
    
    System.out.print("Indique un número: ");
    int num = Integer.parseInt(System.console().readLine());
    
    System.out.println("-------------------------");
    System.out.println("| Cuadrado\t| Cubo");
    System.out.println("-------------------------");
    for (int i = num; i < (num + 5); i++) {
      System.out.println("| " + (i * i) + "\t\t| " + (i * i * i));
    }
    System.out.println("-------------------------");
  }
}
