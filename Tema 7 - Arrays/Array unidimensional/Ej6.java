/**
 *
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. 
 * Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, 
 * el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. 
 * Finalmente, muestra el contenido del array
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 6 Tema 7
 */

public class Ej6 {

  public static void main(String[] args) {
    
    int[] num = new int[15];
    int aux = 0;
    int aux2 = 0;
    
    System.out.println("Introduzca 15 números");
    for (int i = 0; i < 15; i++) {
      System.out.print((i + 1) + ": ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    //rotamos el array
    for (int i = 0; i < 15; i++) {
      if (i == 0) {
        aux2 = num[i];
      } else {
        aux = aux2;
        aux2 = num[i];
        num[i] = aux;
      }
    }
    
    //queda la primera posicion por poner
    num[0] = aux2;
    
    //finalmente mostramos el array rotado
    for (int i = 0; i < 15; i++) {
      System.out.print(num[i] + " ");
    }
  }
}
