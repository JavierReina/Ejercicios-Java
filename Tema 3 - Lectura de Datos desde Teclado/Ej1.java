/**
 *
 * Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 1 Tema 3
 */
 
public class Ej1 {
 public static void main(String[] args) {
   
   double numero1;
   double numero2;
   
   System.out.println("Este programa pedirá 2 números y los multiplicará");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.println("");
   System.out.print("Introduzca un número: ");
   numero1 = Double.parseDouble(System.console().readLine());
   
   System.out.print("Introduzca otro: ");
   numero2 = Double.parseDouble(System.console().readLine());
   
   System.out.println("");
   double resultado = numero1 * numero2;
   System.out.println("El resultado de la multiplicación es: " + resultado);
   
 }
}
