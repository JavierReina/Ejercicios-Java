/**
 *
 * Realiza un conversor de Kb a Mb
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 11 Tema 3
 */
 
public class Ej11 {
 public static void main(String[] args) {
   
   System.out.println("Este programa combertirá de kb a mb");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.println("Se quiere transformar de kb a mb");
   System.out.print("Introduzca el número de kb: ");
   int kilo = Integer.parseInt(System.console().readLine());
   
   int resultado = kilo / 1024;
   System.out.println(kilo + " kb son " + resultado + " mb");
 }
}
