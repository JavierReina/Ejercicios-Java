/**
 *
 * Realiza un programa que pida un número por teclado y que luego muestre ese número al revés
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 25 Tema 5
 */

public class Ej25 {

  public static void main(String[] args) {
    
    System.out.println("Este programa le dará la vuelta a un número");
    
    //para menos complicaciones, restringiré que el número al menos tenga 2 dígitos
    boolean sale = false;
    int num = 0;
    int copia = 0;
    int digito = 0;
    int inversa = 0;
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
    //ahora queremos saber cuantos dígitos tiene el número introducido
    copia = num;
    do {
      copia = copia / 10;
      digito++;
    } while (copia > 0);
    //ahora sabemos cunatos digitos tiene, ahora invertimos el número
    for (int i = 0; i < digito; i++) {
      copia = num % 10;
      num = num / 10;
      if (i == 0){
        inversa = copia;
      } else {
        inversa = (inversa * 10) + copia;
      }
    }
    System.out.println("El número invetido es: " + inversa);
  }
}
