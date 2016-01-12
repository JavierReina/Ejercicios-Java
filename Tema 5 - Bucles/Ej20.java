/**
 *
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 20 Tema 5
 */

public class Ej20 {

  public static void main(String[] args) {
    
    System.out.println("Este programa pintará una pirámide hueca");
    
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
    
    for (int i = 1; i <= altura; i++) {
      //dibujamos los espacios sin saltar de linea
      if (i != altura) {
        for (int n = 0; n < espacios; n++) {
          System.out.print(" ");
        }
        espacios--;
        //una vez dibujados, pintamos los caracteres
        for (int n = 1; n <= cantidad; n++) {
          //hacemos un if para controlar cuando dibujar el caracter o un espacio en la piramide
          if ((n == 1) || (n == cantidad)) {
            System.out.print(caracter);
          } else {
            System.out.print(" ");
          }
        }
        cantidad += 2;
        System.out.println();
      } else {
        for (int n = 0; n < espacios; n++) {
        System.out.print(" ");
        }
        espacios--;
        
        for (int n = 1; n <= cantidad; n++) {
          System.out.print(caracter);
        }
      }//finaliza if
    }//finaliza for
  }
}
