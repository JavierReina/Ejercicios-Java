/**
 *
 * Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 4 Tema 3
 */
 
public class Ej4 {
 public static void main(String[] args) {
   
   System.out.println("Este programa hará una suma, resta, multiplicación y división de los números introducidos");
   System.out.println("para evitar errores, asegurese que el primer número es mañor que el segundo");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.print("Introduzca un número: ");
   double numero1 = Double.parseDouble(System.console().readLine());
   
   System.out.print("Introduzca otro número: ");
   double numero2 = Double.parseDouble(System.console().readLine());
   System.out.println("");
   
   double suma = numero1 + numero2;
   double resta = numero1 - numero2;
   double multi = numero1 * numero2;
   double divi = numero1 / numero2;
   
   System.out.println("La suma de los números es: " + suma);
   System.out.println("La resta de los números es: " + resta);
   System.out.println("La multiplicación de los números es: " + multi);
   System.out.println("La división de los números es: " + divi);
 }
}
