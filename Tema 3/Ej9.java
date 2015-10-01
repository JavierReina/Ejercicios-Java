/**
 *
 * Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3 * πr^2 h
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 9 Tema 3
 */
 
public class Ej9 {
 public static void main(String[] args) {
   
   System.out.println("Este programa calculará el volumen de un cono");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.println("Se quiere averiguar el volumen de un cono");
   System.out.print("Introduzca el radio del cono: ");
   double radio = Integer.parseInt(System.console().readLine());
   
   System.out.print("Introduzca la altura del cono: ");
   double altura = Integer.parseInt(System.console().readLine());
   
   double volumen = (3.14 * (radio * radio) * altura) / 3;
   System.out.println("El volumen del cono dado es: " + volumen);
 }
}
