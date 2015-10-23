/**
 *
 * Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
 * A priori, el programa no sabe cuántos números se introducirán. 
 * El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 10 Tema 5
 */

public class Ej10 {

  public static void main(String[] args) {
    
    System.out.println("Este programa calculará la media de los números introducidos");
    System.out.println("Para dejar de meter números, meta un número negativo\n");
    
    int num = 0;
    int linea = 0;
    int cuenta = 0;
    do {
      linea = Integer.parseInt(System.console().readLine());
      if (linea > 0) {
        num += linea;
        cuenta++;
      } else {
      }
    } while (linea > 0);
    
    System.out.println("-------------------------");
    System.out.println("| Suma Total | " + num);
    System.out.println("| Total Nº   | " + cuenta);
    System.out.println("-------------------------");
    System.out.println("| Media      | " + (num / cuenta));
    System.out.println("-------------------------");
  }
}
