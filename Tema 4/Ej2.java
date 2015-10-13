/**
 *
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches 
 * según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. 
 * Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 2 Tema 4
 */
 
public class Ej2 {
 public static void main(String[] args) {
   
  System.out.println("Este programa dirá los buenos días, tardes o noches");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.print("Introduzca la hora (formato 24 horas) ");
  int hora = Integer.parseInt(System.console().readLine());
    
    if (hora >= 6 && hora <= 12) {
      System.out.println("Buenos días");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("Buenas tardes");
    } else if (hora >= 21 && hora <= 24) {
      System.out.println("Buenas noches");
    } else if (hora >= 0 && hora <= 5) {
      System.out.println("Buenas noches");
    } else {
      System.out.println("Lo siento, se ha equivocado de hora");
    }
 }
}
