/**
 *
 * Realiza un programa que pida primero un número y a continuación un dígito. 
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha 
 * que ocupa ese dígito en el número introducido
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 26 Tema 5
 */

public class Ej26 {

  public static void main(String[] args) {
    
    System.out.println("Este programa le dirá la posición de un dígito en un número");
    
    //para menos complicaciones, restringiré que el número al menos tenga 2 dígitos
    boolean sale = false;
    int num = 0;
    int dig = 0;
    int resto = 0;
    int posicion = 0;
    int copia = 0;
    int digito = 0;
    
    do {
      System.out.print("Introduca un número: ");
      num = Integer.parseInt(System.console().readLine());
      if ((num > 9) || (num < -9)) {
        sale = true;
      } else {
        sale = false;
        System.out.println("El número introducido es demasiado pequeño\n");
      }
    } while (sale == false);
    copia = num;
    sale = false;
    //para el dígito voy a restringir que solo sea de uno y que sea mayor que 0
    do {
      System.out.print("Introduzca un dígito: ");
      dig = Integer.parseInt(System.console().readLine());
      if ((dig >= 0) && (dig < 10)) {
        sale = true;
      } else {
        sale = false;
        System.out.println("Por favor, el número debe ser de 1 dígito y mayor que 0");
      }
    } while (sale == false);
    
    sale = false;
    do {
      resto = num % 10;
      num = num / 10;
      posicion++;
      if (resto == dig) {
        sale = true;
      } else {
        sale = false;
      }
    } while (sale == false);
    
    do {
      copia = copia / 10;
      digito++;
    } while (copia > 0);
    
    posicion = digito - (posicion - 1);
    System.out.println("El dígito " + dig + " está en la posición " + posicion);
  }
}
