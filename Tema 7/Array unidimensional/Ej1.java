/**
 *
 * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a continuación. 
 * Muestra el contenido de todos los elementos del array. 
 * ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 1 Tema 7
 */

public class Ej1 {

  public static void main(String[] args) {
    
    //los valores no inicializados se quedarán a cero
    int[] num = new int[12];
    num[0] = 39;
    num[1] = -2;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    for (int i = 0; i < 12; i++) {
      System.out.print(num[i] + " ");
    }
  }
}
