/**
 *
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas 
 * por 5 columnas. El programa mostrará las sumas parciales de filas y 
 * columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 2 Tema 7 parte 2
 */

public class Ej2 {

  public static void main(String[] args) {
    
    int[][] num = new int[5][6];//los espacios restantes los usaremos para los resultados
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String blanco = "\033[37m";
    
    System.out.println("Introduzca 20 números por teclado");
    
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        num[i][j] = Integer.parseInt(System.console().readLine());
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
