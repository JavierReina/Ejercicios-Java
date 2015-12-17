/**
 *
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año 
 * y que muestre a continuación un diagrama de barras horizontales con esos datos. 
 * Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 8 Tema 7
 */

public class Ej8 {

  public static void main(String[] args) {
    
    String car = "■";
    int[] temAño = new int[12];
    
    //pedimos las temperaturas por teclado
    for (int i = 0; i < 12; i++) {
      temAño[i] = Integer.parseInt(System.console().readLine());
    }
    
    //hacemos un bucle para dibujar las barras horizontales
    for (int i = 0; i < 12; i++) {
      //ponemos otro bucle para dibujar cada caracter
      for (int u = 0; u < temAño[i]; u++) {
        System.out.print(car);
      }
      System.out.println();
    }
  }
}
