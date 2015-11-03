/**
 *
 * Escribe un programa que muestre la tirada de tres dados. 
 * Se debe mostrar también la suma total (los puntos que suman entre los tres dados)
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 1 Tema 6
 */

public class Ej1 {

  public static void main(String[] args) {
    
    System.out.println("Este programa tirará 3 dados aleatoriamente");
    System.out.print("Pulse INTRO para tirar los dados");
    System.console().readLine();
    System.out.println("\n");
    int dado = 0;
    int total = 0;
    
    for (int i = 1; i < 4; i++) {
      dado = (int)(Math.random() * 6) + 1;
      total += dado;
      System.out.println("Dado " + i + ": " + dado);
    }
    System.out.println("El total de la tirada es: " + total);
  }
}
