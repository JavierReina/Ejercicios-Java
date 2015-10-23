/**
 *
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 13 Tema 5
 */

public class Ej13 {

  public static void main(String[] args) {
    
    System.out.println("Este programa te dirá de una lista de 10 números, cuántos son negativos y positivos\n");
    
    int num = 0;
    int pos = 0;
    int neg = 0;
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + "º: ");
      num = Integer.parseInt(System.console().readLine());
      
      if (num >= 0) {
        pos++;
      } else {
        neg++;
      }
    }
    System.out.println("");
    System.out.println("-------------------------");
    System.out.println("| Nº Positivos | " + pos);
    System.out.println("-------------------------");
    System.out.println("| Nº Negativos | " + neg);
    System.out.println("-------------------------");
  }
}
