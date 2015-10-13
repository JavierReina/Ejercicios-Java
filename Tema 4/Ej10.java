/**
 *
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 10 Tema 4
 */
 
public class Ej10 {
 public static void main(String[] args) {
   
  System.out.println("Este programa que te dirá tu horóscopo");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.print("Introduzca el número de su mes de su nacimiento:  ");
  int mes = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduzca el dia de su nacimiento:  ");
  int dia = Integer.parseInt(System.console().readLine());
  System.out.println();
  
  if ((dia >= 20 && mes == 3) || (dia <= 19 && mes == 4)) {
      System.out.println("Tu horóscopo es Aries, no es que sirva de mucho pero en fin");
    } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
      System.out.println("Tu horóscopo es Tauro, no es que sirva de mucho pero en fin");
    } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
      System.out.println("Tu horóscopo es Géminis, no es que sirva de mucho pero en fin");
    } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
      System.out.println("Tu horóscopo es Cáncer, no es que sirva de mucho pero en fin");
    } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
      System.out.println("Tu horóscopo es Leo, no es que sirva de mucho pero en fin");
    } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
      System.out.println("Tu horóscopo es Virgo, no es que sirva de mucho pero en fin");
    } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
      System.out.println("Tu horóscopo es Libra, no es que sirva de mucho pero en fin");
    } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
      System.out.println("Tu horóscopo es Escorpio, no es que sirva de mucho pero en fin");
    } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
      System.out.println("Tu horóscopo es Sagitario, no es que sirva de mucho pero en fin");
    } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
      System.out.println("Tu horóscopo es Capricornio, no es que sirva de mucho pero en fin");
    } else if ((dia >= 20 && mes == 1) || (dia <= 17 && mes == 2)) {
      System.out.println("Tu horóscopo es Acuario, no es que sirva de mucho pero en fin");
    } else if ((dia >= 18 && mes == 2) || (dia <= 19 && mes == 3)) {
      System.out.println("Tu horóscopo es Piscis, no es que sirva de mucho pero en fin");
    }
  }
}
