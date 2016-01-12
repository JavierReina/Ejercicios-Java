/**
 *
 * Realiza un programa que calcule la media de tres notas
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 7 Tema 4
 */
 
public class Ej7 {
 public static void main(String[] args) {
   
  System.out.println("Este programa que calculará la media de 3 notas dadas");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.print("Introduzca la primera nota:  ");
  double nota1 = Double.parseDouble(System.console().readLine());
  
  System.out.print("Introduzca la segunda nota:  ");
  double nota2 = Double.parseDouble(System.console().readLine());
  
  System.out.print("Introduzca la tercera nota:  ");
  double nota3 = Double.parseDouble(System.console().readLine());
  
  double media = (nota1 + nota2 + nota3) / 3;
  System.out.printf("\nLa media de las notas dadas es: %.2f", media);
 }
}
