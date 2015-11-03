/**
 *
 * Escribe un programa que piense un número al azar entre 0 y 100. 
 * El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
 * Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y 
 * si el número introducido es menor o mayor que el número secreto
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 6 Tema 6
 */

public class Ej6 {

  public static void main(String[] args) {
    
    int aleatorio = (int)(Math.random() * 101);
    int num = 0;
    boolean sale = false;
    int intento = 5;
    
    do {
      System.out.print("Introduzca un número: ");
      num = Integer.parseInt(System.console().readLine());
      
      if (num > aleatorio) {
        System.out.println("El número es menor");
      } else if (num < aleatorio) {
        System.out.println("El número es mayor");
      } else {
        sale = true;
      }
      intento--;
      if (intento == 0 && sale == false) {
        sale = true;
        System.out.println("Lo siento has fallado");
        System.out.println("El número era " + aleatorio);
      } else if (intento > 0 && sale == false) {
        System.out.println("Te quedan " + intento + " intentos\n");
      } else if (sale == true) {
        System.out.println("Has acertado");
      } else {
      }
    } while (sale == false);
  }
}
