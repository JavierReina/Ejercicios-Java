/**
 *
 * Escribe un programa que calcule el total de una factura a partir de la base imponible
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 7 Tema 3
 */
 
public class Ej7 {
 public static void main(String[] args) {
   
   System.out.println("Este programa calculará el total de una factura");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.println("Se quiere averiguar el total a pargar");
   System.out.print("Introduzca la base imponible y se le añadirá el IVA: ");
   double base = Double.parseDouble(System.console().readLine());
   double iva = base * 0.21;
   double resultado = base + iva;
   
   System.out.println("La base imponible de la facura es " + base + " y el total con IVA es = " + resultado);
 }
}
