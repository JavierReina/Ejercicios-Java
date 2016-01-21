/**
 *
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas 
 * podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, 
 * el alfil se mueve siempre en diagonal. 
 * El tablero cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la “h” 
 * y las filas se indican del 1 al 8
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 8 Tema 7 parte 2
 */

public class Ej8 {
    static final int VACIO = 0;
    static final int ALFIL = 1;
    static final int MOVER = 2;
  public static void main(String[] args) {
    
    int[][] tablero = new int[8][8];
    int x = 0;
    int y = 0;
    
    //pintamos el tablero
    System.out.println("  a b c d e f g h");
    for (int i = 0; i < 8; i++) {
      System.out.print(i + 1 + "|");
      for (int j = 0; j < 8; j++) {
        switch (tablero[i][j]) {
          case VACIO:
            System.out.print(" |");//se pinta un espacio en el tablero
            break;
          case ALFIL:
            System.out.print("♗|");//como aun no se le a dado valores al "tablero" no se pinta aun, es para más tarde
            break;
          case MOVER:
            System.out.print("+|");
            break;
          default:
        }
      }
      System.out.println();
    }
    //pedimos los datos de alfil
    System.out.println("Para el tablero anterior, introduzca la posición en la que desea el Alfil");
    System.out.println("el programa le dirá las posiciones en la que podrá moverse");
    System.out.print("(la posición se da de esta forma 3f) ");
    String posicion = System.console().readLine();
    x = (int)(posicion.charAt(0)) - 48;
    y = (int)(posicion.charAt(1)) - 96;
    //una vez tenemos la posición del alfil, lo metemos en el tablero
    tablero[x - 1][y - 1] = 1;
    //ahora calculamos las posiciones a las que se puede mover
    //los iremos calculando por lineas
    int posicionX = x - 1;
    int posicionY = y - 1;
    do {//diagonal izquierda-arriba
      posicionX--;
      posicionY--;
      if (posicionX >= 0 && posicionY >= 0) {
        tablero[posicionX][posicionY] = 2;
      } else {
      }
    } while (posicionX >= 0 || posicionY >= 0);
    
    posicionX = x - 1;
    posicionY = y - 1;
    do {//diagonal izquierda-abajo
      posicionX++;
      posicionY--;
      if (posicionX < 8 && posicionY >= 0) {
        tablero[posicionX][posicionY] = 2;
      } else {
      }
    } while (posicionX < 8 || posicionY >= 0);
    
    posicionX = x - 1;
    posicionY = y - 1;
    do {//diagonal derecha-arriba
      posicionX--;
      posicionY++;
      if (posicionX >= 0 && posicionY < 8) {
        tablero[posicionX][posicionY] = 2;
      } else {
      }
    } while (posicionX >= 0 || posicionY < 8);
    
    posicionX = x - 1;
    posicionY = y - 1;
    do {//diagonal derecha-abajo
      posicionX++;
      posicionY++;
      if (posicionX < 8 && posicionY < 8) {
        tablero[posicionX][posicionY] = 2;
      } else {
      }
    } while (posicionX < 8 || posicionY < 8);
    
    //finalmente mostramos el resultado
    System.out.println("  a b c d e f g h");
    for (int i = 0; i < 8; i++) {
      System.out.print(i + 1 + "|");
      for (int j = 0; j < 8; j++) {
        switch (tablero[i][j]) {
          case VACIO:
            System.out.print(" |");//se pinta un espacio en el tablero
            break;
          case ALFIL:
            System.out.print("♗|");
            break;
          case MOVER:
            System.out.print("+|");
            break;
          default:
        }
      }
      System.out.println();
    }
  }
}
