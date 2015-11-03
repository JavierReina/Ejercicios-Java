/**
 *
 * Igual que el ejercicio anterior pero con la baraja española. 
 * Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 3 Tema 6
 */

public class Ej3 {

  public static void main(String[] args) {
    
    System.out.println("Este programa mostrará una carta aleatoriamente");
    System.out.print("Pulse INTRO para continuar");
    System.console().readLine();
    
    int paloNum = (int)(Math.random() * 4);
    String palo = "";
    
    switch (paloNum) {
      case 0:
        palo = "Espadas";
        break;
      case 1:
        palo = "Copas";
        break;
      case 2:
        palo = "Oros";
        break;
      case 3:
        palo = "Bastos";
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
        figura = String.valueOf(figuraNum);
        break;
      case 10:
        figura = "Sota";
        break;
      case 11:
        figura = "Caballo";
        break;
      case 12:
        figura = "Rey";
        break;
    }
    System.out.println("\nLa carta resultante es " + figura + " de " + palo);
  }
}
