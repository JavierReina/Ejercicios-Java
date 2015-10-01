/**
 *
 * Realiza un conversor de Mb a Kb
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 10 Tema 3
 */
 
public class Ej10 {
 public static void main(String[] args) {
   
   System.out.println("Este programa combertirá de mb a kb");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.println("Se quiere transformar de mb a kb");
   System.out.print("Introduzca el número de mb: ");
   int mega = Integer.parseInt(System.console().readLine());
   
   int resultado = mega * 1024;
   System.out.println(mega + " mb son " + resultado + " kb");
 }
}
