/**
 *
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
 * El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, 
 * por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 
 * El número n se debe introducir por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 12 Tema 5
 */

public class Ej12 {

  public static void main(String[] args) {
    
    System.out.println("Este programa mostrará los n primeros números de Fibonacci");
    
    int fibo1 = 0;
    int fibo2 = 1;
    int fiboAux = 0;
    
    System.out.print("Indique cuántos números desea que se muestren ");
    int n = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        System.out.print(fibo1 + ", ");
      } else if (i == 2) {
        System.out.print(fibo2 + ", ");
      } else {
        System.out.print((fibo1 + fibo2) + ", ");
        fiboAux = fibo2;
        fibo2 += fibo1;
        fibo1 = fiboAux;
      }
    }
  }
}
