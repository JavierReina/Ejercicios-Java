/**
 *
 * Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado. 
 * Se debe comprobar que el dato introducido es correcto (que es un número positivo)
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 17 Tema 5
 */

public class Ej17 {

  public static void main(String[] args) {
    
    System.out.println("Este programa sumará los 100 números siguentes a un número introducido");
    
    int num = Integer.parseInt(System.console().readLine());
    int prueba = 0;
    
    for (int i = num + 1; i < (num + 101); i++) {
      prueba += i;
    }
    System.out.println("El resultado es: " + prueba);
  }
}
