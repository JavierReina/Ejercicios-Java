/**
 *
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. 
 * Muestra también el máximo, el mínimo y la media de esos números
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 5 Tema 6
 */

public class Ej5 {

  public static void main(String[] args) {
    
    int num = 0;
    int max = 0;
    int min = 999;
    for (int i = 0; i < 50; i++) {
      num = (int)(Math.random() *100) + 100;
      System.out.print(num + " ");
      
      if (num > max) {
        max = num;
      } else if (num < min) {
        min = num;
      } else {
        //nada
      }
    }
    System.out.println("\n----------------------------------");
    System.out.println("| Máximo     | " + max);
    System.out.println("| Mínimo     | " + min);
    System.out.println("----------------------------------");
    System.out.println("| Media      | " + ((max + min) / 2));
    System.out.println("----------------------------------");
  }
}
