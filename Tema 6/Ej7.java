/**
 *
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos 
 * y el pleno al quince (15 filas)
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 7 Tema 6
 */

public class Ej7 {

  public static void main(String[] args) {
    
    int apuestaNum = 0;
    String apuesta = "";
    
    System.out.println("-----------------------------");
    for (int i = 1; i < 15; i++) {
      apuestaNum = (int)(Math.random() * 3);
      
      switch (apuestaNum) {
        case 0:
          apuesta = "\t| |X| |";
          break;
        case 1:
          apuesta = "\t|1| | |";
          break;
        case 2:
          apuesta = "\t| | |2|";
          break;
      }
      System.out.println("Partido " + i + ": " + apuesta);
    }
    apuestaNum = (int)(Math.random() * 3);
      
      switch (apuestaNum) {
        case 0:
          apuesta = "\t| |X| |";
          break;
        case 1:
          apuesta = "\t|1| | |";
          break;
        case 2:
          apuesta = "\t| | |2|";
          break;
      }
    System.out.println("-----------------------------");
    System.out.println("Pleno al 15: " + apuesta);
  }
}
