/**
 *
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax^2 + bx + c = 0)
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 9 Tema 4
 */
 
public class Ej9 {
 public static void main(String[] args) {
   
  System.out.println("Este programa que calculará el resultado de una ecuación de segundo grado");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.print("Introduzca la constante a:  ");
  int a = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduzca la constante b:  ");
  int b = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduzca la constante c:  ");
  int c = Integer.parseInt(System.console().readLine());
  System.out.println();
  double x;
  
  if (a == 0 && b == 0) {
    System.out.println("La ecuación no tiene solución");
  } else if (a == 0 && b != 0 && c == 0) {
    System.out.println("x = " + (-b));
  } else if (a == 0 && b != 0 && c != 0) {
    x = (-b) / c;
    System.out.println("x = " + x);
  } else if (a != 0 && b == 0 && c == 0) {
    System.out.println("x = 0");
  } else if (a != 0 && b == 0 && c != 0) {
    x = Math.sqrt((-c) / a);
    System.out.println("x = " + x);
  } else if (a != 0 && b != 0 && c == 0) {
    x = (-b) / a;
    System.out.println("x tiene 2 soluciones, x = 0 y x = " + (int)x);
  } else {
    x = ((-b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
    double x2 = ((-b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
    
    System.out.println("x tiene 2 soluciones x = " + (int)x + " y x = " + (int)x2);
  }
 }
}
