/**
 *
 * Escribe un programa que muestre por pantalla todos los números enteros positivos menores 
 * a uno leído por teclado que no sean divisibles entre otro también leído de igual forma
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 29 Tema 5
 */

public class Ej29 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca el número máximo: ");
    double maximo = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el divisor: ");
    double divisor = Integer.parseInt(System.console().readLine());
    
    double cuenta = 0;
    
    for (int i = 1; i <= maximo; i++) {
      cuenta = i / divisor;
      System.out.printf("%dº) %.2f\n", i, cuenta);
    }
  }
}
