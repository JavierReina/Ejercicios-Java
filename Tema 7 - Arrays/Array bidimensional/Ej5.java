/**
 *
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros 
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). 
 * A continuación, el programa deberá dar la posición tanto del máximo como del mínimo
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 5 Tema 7 parte 2
 */

public class Ej5 {

  public static void main(String[] args) {
    
    int[][] num = new int[6][10];
    int posFilaMax = 0;
    int posColumMax = 0;
    int posFilaMin = 0;
    int posColumMin = 0;
    int max = -1;
    int min = 1001;
    
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        num[i][j] = (int)(Math.random() * 1001);
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
