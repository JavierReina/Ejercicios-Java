/**
 *
 * Modifica el programa anterior de tal forma que los números que se introducen en el array 
 * se generen de forma aleatoria (valores entre 100 y 999)
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 3 Tema 7 parte 2
 */

public class Ej3 {

  public static void main(String[] args) {
    
    int[][] num = new int[5][6];//los espacios restantes los usaremos para los resultados
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String blanco = "\033[37m";
    
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        num[i][j] = (int)((Math.random() * 900) + 100);
      }
    }
    
    //cuando tenemos los números, solo tenemos que calcularlos
    //empezaremos sumando fila por fila
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        num[i][5] += num[i][j];
      }
    }
    
    //ahora sumamos las columnas
    for (int j = 0; j < 5; j++) {
      for (int i = 0; i < 4; i++) {
        num[4][j] += num[i][j];
      }
    }
    
    //solo queda calcular el total de todo
    for (int i = 0; i < 4; i++) {
      num[4][5] += num[i][5];
    }
    for (int j = 0; j < 5; j++) {
      num[4][5] += num[4][j];
    }
    
    //por ultimo mostramos el array, le cambiaré el color a los resultados para que destaque más
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        if (i == 4 && j == 5) {
          System.out.print(rojo + num[i][j]);
        } else if (i == 4 || j == 5) {
          System.out.print(verde + num[i][j] + "\t");
        } else {
          System.out.print(blanco + num[i][j] + "\t");
        }
      }
      System.out.println();
    }
  }
}
