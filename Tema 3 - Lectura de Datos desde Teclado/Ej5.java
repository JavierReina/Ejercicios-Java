/**
 *
 * Escribe un programa que calcule el área de un rectángulo
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 5 Tema 3
 */
 
public class Ej5 {
 public static void main(String[] args) {
   
   System.out.println("Este programa calculará el área de un rectángulo");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.print("Introduzca la base del rectángulo en cm: ");
   double base = Double.parseDouble(System.console().readLine());
   
   System.out.print("Introduzca la altura del rectángulo en cm: ");
   double alt = Double.parseDouble(System.console().readLine());
   System.out.println("");
   
   double area = base * alt;
   
   System.out.println("El área del rectángulo es: " + area + " cm^2");
 }
}
