/**
 *
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), 
 * saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. 
 * No se deben utilizar funciones de exponenciación. 
 * Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2^1 , 2^2 , 2^3 , 2^4 y 2^5 
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 15 Tema 5
 */

public class Ej15 {

  public static void main(String[] args) {
    
    System.out.println("Este programa te dirá todos las potencias dado una base y un exponente");
    
    System.out.print("Indique una base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique su exponente: ");
    int exp = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i <= exp; i++) {
      System.out.print(base + "^" + i + ", ");
    }
  }
}
