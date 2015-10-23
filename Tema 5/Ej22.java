/**
 *
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 22 Tema 5
 */

public class Ej22 {

  public static void main(String[] args) {
    
    System.out.println("Este programa mostrará todos los números primos hasta el 100");
    System.out.println("Pulse INTRO para continuar");
    System.console().readLine();
    
    int prueba = 0;
    int i = 1;
    int contador = 0; //para contar las veces que el resto del numero da 0
    
    for (int n = 1; n < 101; n++) {
      i = 0;
      contador = 0;
      do {
        i++;
        prueba = n % i;
        
        if (prueba == 0) {
          contador++;
        } else {
          //nada
        }
        
      } while (i != n);
      
      if (contador == 2) {
        System.out.print(n + " ");
      } else {
        //nada
      }
    }
  }
}
