/**
 *
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga 
 * cuantos números se han introducido, la media de los impares y el mayor de los pares. 
 * El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 21 Tema 5
 */

public class Ej21 {

  public static void main(String[] args) {
    
    boolean sale = false;
    int num = 0;
    int cantidad = 0;
    int cantImp = 0;
    int maxPar = 0;
    double medImp = 0;
    
    do {
      System.out.print("Introduzca un número: ");
      num = Integer.parseInt(System.console().readLine());
      if (num < 0) {
        sale = true;
      } else {
        cantidad++;
        if ((num % 2) == 0) {
          if (num > maxPar) {
            maxPar = num;
          } else {
            //nada
          }
        } else {
          medImp += num;
          cantImp++;
        }
      }
    } while (sale == false);
    
    medImp = medImp / cantImp;
    
    System.out.println("----------------------------------------");
    System.out.println("| Cantidad introducida | " + cantidad);
    System.out.println("----------------------------------------");
    System.out.printf("| Media de los impares | %.2f\n", medImp);
    System.out.println("----------------------------------------");
    System.out.println("| Maximo númeor par    | " + maxPar);
    System.out.println("----------------------------------------");
  }
}
