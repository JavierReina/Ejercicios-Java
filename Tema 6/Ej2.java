/**
 *
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. 
 * Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. 
 * Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 
 * 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). 
 * Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n)
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 2 Tema 6
 */

public class Ej2 {

  public static void main(String[] args) {
    
    System.out.println("Este programa mostrará una carta aleatoriamente");
    System.out.print("Pulse INTRO para continuar");
    System.console().readLine();
    
    int paloNum = (int)(Math.random() * 4);
    String palo = "";
    
    switch (paloNum) {
      case 0:
        palo = "♥";
        break;
      case 1:
        palo = "♠";
        break;
      case 2:
        palo = "♦";
        break;
      case 3:
        palo = "♣";
        break;
    }
    
    int figuraNum = (int)(Math.random() * 13) + 1;
    String figura = "";
    
    switch (figuraNum) {
      case 1:
        figura = "As";
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        figura = String.valueOf(figuraNum);
        break;
      case 11:
        figura = "J";
        break;
      case 12:
        figura = "Q";
        break;
      case 13:
        figura = "K";
        break;
    }
    System.out.println("\nLa carta resultante es " + figura + " de " + palo);
  }
}
