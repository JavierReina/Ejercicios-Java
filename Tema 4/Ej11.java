/**
 *
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan
 * para llegar a la medianoche
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 11 Tema 4
 */
 
public class Ej11 {
 public static void main(String[] args) {
   
  System.out.println("Este programa que te dirá cuanto queda para medianoche");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.println("Utilizaremos el formato 24 horas en vez de AM y PM");
  System.out.print("Introduzca que hora es:  ");
  int hora = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduzca los minutos:  ");
  int minuto = Integer.parseInt(System.console().readLine());
  System.out.println();
  
  if ((hora == 0 || hora == 24) && (minuto == 0 || minuto == 60)) {
    System.out.println("Ya es medianoche");
  } else if (minuto == 60 || minuto == 0) {
    System.out.println("Quedan " + (24 - hora) + " horas");
  } else {
    System.out.println("Quedan " + (24 - (hora + 1)) + " horas y " + (60 - minuto) + " minutos");
  }
 }
}
