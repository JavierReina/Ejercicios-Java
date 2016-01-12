/**
 *
 * Escribe un programa que calcule el salario semanal de un empleado en base a las horas 
 * trabajadas, a razón de 12 euros la hora
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 8 Tema 3
 */
 
public class Ej8 {
 public static void main(String[] args) {
   
   System.out.println("Este programa calculará el salario de un empleado");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.println("Se quiere averiguar saber cuanto cobra un empleado");
   System.out.print("Introduzca las horas trabajadas por éste: ");
   int hora = Integer.parseInt(System.console().readLine());
   int salario = hora * 12;
   
   System.out.println("El salario del empleado es: " + salario);
 }
}
