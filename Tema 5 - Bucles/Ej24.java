/**
 *
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
 *    1
 *   121 
 *  12321
 * 1234321
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 24 Tema 5
 */

public class Ej24 {

  public static void main(String[] args) {
    
    System.out.println("Este programa pintará una pirámide de números");
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    int cantidad = 1;//esta variable es la cantidad de variables que se dibujaran
    int espacios = 0;//el numero de espacios que necesitaremos
    int muestra = 0;//es la variable que utilizaremos para mostrar la piramide
    
    //averiguamos los espacios que necesitamos en la primera linea
    for (int i = 0; i < altura; i++) {
      espacios++;
    }
    
    System.out.println();
    
    for (int i = 0; i < altura; i++) {
      //dibujamos los espacios sin saltar de linea
      for (int n = 0; n < espacios; n++) {
        System.out.print(" ");
      }
      espacios--;
      muestra = 1;
      //una vez dibujados, pintamos los caracteres
      for (int n = 1; n <= cantidad; n++) {
        if (n <= (cantidad / 2)) {
          System.out.print(muestra);
          muestra++;
        } else {
          System.out.print(muestra);
          muestra--;
        }
      }
      //al salir del bucle al dibujar la linea entera, hacemos salto de linea e incrementamos cantidad
      cantidad += 2;
      System.out.println();
    }
  }
}
