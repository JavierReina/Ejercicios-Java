/**
 *
 * Escribe un programa que diga si un número introducido por teclado es o no primo. 
 * Un número primo es aquel que sólo es divisible entre él mismo y la unidad
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 16 Tema 5
 */

public class Ej16 {

  public static void main(String[] args) {
    
    System.out.println("Este programa te dirá si un número es primo");
    
    int num = Integer.parseInt(System.console().readLine());
    int prueba = 0;
    int contador = 0;//es para contar las veces que el numero da 0 en el resto
    int i = 0;
    
      do {
        i++;
        prueba = num % i;
        
        if (prueba == 0) {
          contador++;
        } else {
          //nada
        }
        
      } while (i != num);
      
      if (contador == 2) {
        System.out.print("El número es primo");
      } else {
        System.out.print("El número no es primo");
      }
}
}
