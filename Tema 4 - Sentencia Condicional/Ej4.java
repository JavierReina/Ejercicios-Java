/**
 *
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras. 
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias 
 * (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 4 Tema 4
 */
 
public class Ej4 {
 public static void main(String[] args) {
   
  System.out.println("Este programa que calculará el salario de un trabajador");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.print("Introduzca las horas trabajadas por éste: ");
  int hora = Integer.parseInt(System.console().readLine());
  int salario = 0;
  
  if (hora < 41) {
    salario = hora * 12;
  } else {
    int horaExtra = hora - 40;
    salario = (40 * 12) + (horaExtra * 16);
  }
  
  System.out.println("El salario del trabajador es: " + salario);
 }
}
