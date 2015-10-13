/**
 *
 * Escribe un programa que ordene tres números enteros introducidos por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 13 Tema 4
 */
 
public class Ej13 {
 public static void main(String[] args) {
   
  System.out.println("Este programa ordenará números introducidos");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  
  System.out.print("Introduzca el primer número: ");
  int numero1 = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduzca el segundo número: ");
  int numero2 = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduzca el tercer número: ");
  int numero3 = Integer.parseInt(System.console().readLine());
  
  if ((numero3 < numero2) && (numero2 < numero1)) {
    System.out.println("El orden es: " + numero3 + " " + numero2 + " " + numero1);
  } else if ((numero3 < numero1) && (numero1 < numero2)) {
    System.out.println("El orden es: " + numero3 + " " + numero1 + " " + numero2);
  } else if ((numero2 < numero1) && (numero1 < numero3)) {
    System.out.println("El orden es: " + numero2 + " " + numero1 + " " + numero3);
  } else if ((numero2 < numero3) && (numero3 < numero1)) {
    System.out.println("El orden es: " + numero2 + " " + numero3 + " " + numero1);
  } else if ((numero1 < numero2) && (numero2 < numero3)) {
    System.out.println("El orden es: " + numero1 + " " + numero2 + " " + numero3);
  } else if ((numero1 < numero3) && (numero3 < numero2)) {
    System.out.println("El orden es: " + numero1 + " " + numero3 + " " + numero2);
  }
}
}
