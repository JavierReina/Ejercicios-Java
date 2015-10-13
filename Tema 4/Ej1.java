/**
 *
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 1 Tema 4
 */
 
public class Ej1 {
 public static void main(String[] args) {
   
  System.out.println("Este programa dirá la asignatura a primera hora según el día dado");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.print("Introduzca el día de la semana ");
  String asignatura;
  String dia = (System.console().readLine()).toLowerCase();
  
  switch (dia) {
    case "lunes":
      asignatura = "Fol";
      break;
    case "martes":
      asignatura = "Programación";
      break;
    case "miercoles":
      asignatura = "Sistemas Informáticos";
      break;
    case "jueves":
      asignatura = "Programación";
      break;
    case "viernes":
      asignatura = "Base de Datos";
      break;
    default:
      asignatura = "nulo";
      
    }
    
    if (asignatura.equals("nulo")) {
      System.out.println("Ese día no tienes clases");
    } else {
      System.out.println("Ese día tienes " + asignatura + " a primera hora");
    }
 }
}
