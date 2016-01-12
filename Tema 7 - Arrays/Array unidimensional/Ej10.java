/**
 *
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. 
 * El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) 
 * y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 10 Tema 7
 */

public class Ej10 {

  public static void main(String[] args) {
    
    int[] num = new int[20];
    int cuentaArray = 0;
    int[] resultado = new int[20];
    
    System.out.println("Números generados");
    //primero generamos los números, los metemos en el array y los mostramos
    for (int i = 0; i < 20; i++) {
     num[i] = (int)(Math.random() * 101); 
     System.out.print(num[i] + " ");
    }
    
    System.out.println();
    //ahora meteremos en otro array solo los pares
    for (int i = 0; i < 20; i++) {
      if ((num[i] % 2) == 0) {
        resultado[cuentaArray] = num[i];
        cuentaArray++;
      } else {
        //nada
      }
    }
    
    //posteriormente metemos los que quedan
    for (int i = 0; i < 20; i++) {
      if ((num[i] % 2) != 0) {
        resultado[cuentaArray] = num[i];
        cuentaArray++;
      } else {
        //nada
      }
    }
    
    System.out.println("\nNúmeros ordenados");
    //por último mostramos el resultado
    for (int i = 0; i < 20; i++) {
      System.out.print(resultado[i] + " ");
    }
  }
}
