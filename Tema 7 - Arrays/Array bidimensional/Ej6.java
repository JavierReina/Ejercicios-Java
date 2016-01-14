/**
 *
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 6 Tema 7 parte 2
 */

public class Ej6 {

  public static void main(String[] args) {
    
    int comprobar = 0;
    int[][] num = new int[6][10];
    int posFilaMax = 0;
    int posColumMax = 0;
    int posFilaMin = 0;
    int posColumMin = 0;
    int max = -1;
    int min = 1001;
    boolean sale = false;
    boolean repite = false;
    
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        sale = false;
        do {
          num[i][j] = (int)(Math.random() * 1001);
          comprobar = num[i][j];
          if (i == 0 && j == 0) {
            //la primera hacemos que la meta en el array
            if (num[i][j] < min) { //comprobamos el mínimo
              posFilaMin = i;
              posColumMin = j;
              min = num[i][j];
            }
            
            if (num[i][j] > max) { //comprobamos el máximo
              posFilaMax = i;
              posColumMax = j;
              max = num[i][j];
            }
            sale = true;
          } else {//desde aqui el programa deberá comprobar que no se repita
          
            //comprobamos que no se repita, según en la posición en la que se encuentre
            repite = false;
            for (int x = 0; x < i; x++) {
              for (int y = 0; y < j; y++) {
                if (comprobar == num[x][y]) {
                  repite = true;
                }
              }
            }
            
            if (repite == false) {
              sale = true;
              if (num[i][j] < min) { //comprobamos el mínimo
                posFilaMin = i;
                posColumMin = j;
                min = num[i][j];
              }
              
              if (num[i][j] > max) { //comprobamos el máximo
                posFilaMax = i;
                posColumMax = j;
                max = num[i][j];
              }
            } else {
            }
          }
        } while (sale == false);
      } //bucle para columnas
    } //bucle para filas
    
    //mostramos el array
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(num[i][j] + "\t");
      }
      System.out.println();
    }
    
    //como ya sabemos el máximo y mínimo los mostramos
    System.out.println("\nEl mínimo es: " + min + ", está posicionado en fila " + (posFilaMin + 1) + " y en columna " + (posColumMin + 1));
    System.out.println("El máxmio es: " + max + ", está posicionado en fila " + (posFilaMax + 1) + " y en columna " + (posColumMax + 1));
    //la suma a las posiciones es para mayor conprensión a la hora de comprobar
  }
}
