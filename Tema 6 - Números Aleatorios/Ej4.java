/**
 *
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 4 Tema 6
 */

public class Ej4 {

  public static void main(String[] args) {
    
    System.out.println("Este programa mostrará 20 números aleatorios");
    System.out.print("Pulse INTRO para continuar");
    System.console().readLine();
    
    int num = 0;
    for (int i = 0; i < 20; i++) {
      num = (int)(Math.random() *11);
      System.out.print(num + " ");
    }
  }
}
