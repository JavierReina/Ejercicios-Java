/**
 *
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna 
 * los valores según la siguiente tabla. 
 * Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 1 Tema 7 parte 2
 */

public class Ej1 {

  public static void main(String[] args) {
    
    //los valores no inicializados se quedarán a cero
    int[][] num = new int[3][6];
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.print(num[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
