/**
 *
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente)
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 8 Tema 4
 */
 
public class Ej8 {
 public static void main(String[] args) {
   
  System.out.println("Este programa que calculará la media de 3 notas dadas");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.print("Introduzca la primera nota:  ");
  double nota1 = Double.parseDouble(System.console().readLine());
  
  System.out.print("Introduzca la segunda nota:  ");
  double nota2 = Double.parseDouble(System.console().readLine());
  
  System.out.print("Introduzca la tercera nota:  ");
  double nota3 = Double.parseDouble(System.console().readLine());
  System.out.println();
  double media = (nota1 + nota2 + nota3) / 3;
  
  if (media < 5) {
    System.out.println("Tienes un insuficiente");
  } else if (media >= 5 &&  media < 6) {
    System.out.println("Tienes un suficiente");
  } else if (media >= 6 && media < 7) {
    System.out.println("Tienes un bien");
  } else if (media >= 7 && media < 9) {
    System.out.println("Tienes un notable");
  } else if (media >= 9 && media <= 10) {
    System.out.println("Tienes un sobresaliente");
  } else {
    System.out.println("Esa nota media no es posible");
  }
 }
}
