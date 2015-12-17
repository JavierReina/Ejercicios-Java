/**
 *
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios. 
 * El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias 
 * del primer valor por el segundo en la lista generada anteriormente. 
 * Los números que se han cambiado deben aparecer entrecomillados
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 7 Tema 7
 */

public class Ej7 {

  public static void main(String[] args) {
    
    int[] num = new int[100];
    int aux = 0;
    int aux2 = 0;
    
    for (int i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 21);
    }
    
    for (int i = 0; i < 100; i++) {
      System.out.print(num[i] + " ");
    } 
    
    System.out.print("\nIntroduzca el número que desee cambiar: ");
    aux = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el reemplazo: ");
    aux2 = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < 100; i++) {
      if (num[i] == aux) {
        System.out.print("'" + aux2 + "' ");
      } else {
        System.out.print(num[i] + " ");
      }
    }
  }
}
