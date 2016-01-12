/**
 *
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. 
 * Carga el array numero con valores aleatorios entre 0 y 100. 
 * En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero. 
 * En el array cubo se deben almacenar los cubos de los valores que hay en numero. 
 * A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 4 Tema 7
 */

public class Ej4 {

  public static void main(String[] args) {
    
    int[] num = new int[20];
    int[] cua = new int[20];
    int[] cub = new int[20];
    
    for (int i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 101);
    }
    
    for (int i = 0; i < 20; i++) {
      cua[i] = num[i] * num[i];
    }
    
    for (int i = 0; i < 20; i++) {
      cub[i] = num[i] * num[i] * num[i];
    }
    
    System.out.println("Número\tCuadrado\tCubo");
    for (int i = 0; i < 20; i++) {
      System.out.println(num[i] + "\t" + cua[i] + "\t\t" + cub[i]);
    }
  }
}
