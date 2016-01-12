/**
 *
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, 
 * la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 8 Tema 6
 */

public class Ej8 {

  public static void main(String[] args) {
    
    int apuestaNum = 0;
    String apuesta = "";
    
    System.out.println("-----------------------------");
    for (int i = 1; i < 15; i++) {
      apuestaNum = (int)(Math.random() * 6);
      
      switch (apuestaNum) {
        case 0:
        case 1:
          apuesta = "\t| |X| |";
          break;
        case 2:
        case 3:
        case 4:
          apuesta = "\t|1| | |";
          break;
        case 5:
          apuesta = "\t| | |2|";
          break;
      }
      System.out.println("Partido " + i + ": " + apuesta);
    }
    apuestaNum = (int)(Math.random() * 6);
      
      switch (apuestaNum) {
        case 0:
        case 1:
          apuesta = "\t| |X| |";
          break;
        case 2:
        case 3:
        case 4:
          apuesta = "\t|1| | |";
          break;
        case 5:
          apuesta = "\t| | |2|";
          break;
      }
    System.out.println("-----------------------------");
    System.out.println("Pleno al 15: " + apuesta);
  }
}
