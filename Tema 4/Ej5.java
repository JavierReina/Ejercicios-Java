/**
 *
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0)
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 5 Tema 4
 */
 
public class Ej5 {
 public static void main(String[] args) {
   
  System.out.println("Este programa que calculará una ecuación de primer grado");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.println("Dado la ecuacion (ax + b = 0), calcula x");
  System.out.print("Dale un valor a la constante a:  ");
  int a = Integer.parseInt(System.console().readLine());
  
  System.out.print("Dale un valor a la constante b:  ");
  int b = Integer.parseInt(System.console().readLine());
  int x = 0;
  
  if (a == 0 && b == 0) {
    x = 0;
  } else if (a == 0 && b != 0) {
    x = -b;
  } else if (a != 0 && b == 0) {
    x = 0;
  } else {
    x = (-b) / a;
  }
  
  System.out.println("El valor de x es: " + x);
 }
}
