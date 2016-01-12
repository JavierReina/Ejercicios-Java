/**
 *
 * Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA).
 * La base imponible estará almacenada en una variable
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 6 Tema 2
 */
 
public class Ej6 {
 public static void main(String[] args) {
   
   double base = 30;
   double iva = base * 0.21;
   double resultado = base + iva;
   
   System.out.println("La base imponible de la facura es " + base + " y el total con IVA es = " + resultado);
 }
}
