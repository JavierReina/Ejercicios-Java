/**
 *
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 9 Tema 5
 */

public class Ej9 {

  public static void main(String[] args) {
    
    System.out.println("Este programa dirá cuántos dígitos tiene un número");
    System.out.print("Indique el número");
    
    int num = Integer.parseInt(System.console().readLine());
    int copia = num;
    int digito = 0;
    
    do {
      num = num / 10;
      digito++;
    } while (num > 0);
    System.out.println("El número " + copia + " tiene " + digito + " dígitos");
  }
}
