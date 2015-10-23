/**
 *
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. 
 * El carácter con el que se pinta la pirámide también se debe pedir por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 19 Tema 5
 */

public class Ej19 {

  public static void main(String[] args) {
    
    System.out.println("Este programa pintará una pirámide");
    
    System.out.print("Introduzca el carácter con el que quiera dibujar la pirámide: ");
    String caracter = System.console().readLine();
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    int cantidad = 1;//esta variable es la cantidad de variables que se dibujaran
    int espacios = 0;//el numero de espacios que necesitaremos
    
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
      //una vez dibujados, pintamos los caracteres
      for (int n = 1; n <= cantidad; n++) {
        System.out.print(caracter);
      }
      //al salir del bucle al dibujar la linea entera, hacemos salto de linea e incrementamos cantidad
      cantidad += 2;
      System.out.println();
    }
  }
}
