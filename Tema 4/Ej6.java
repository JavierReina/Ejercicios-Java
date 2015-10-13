/**
 *
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. 
 * Aplica la fórmula t = √2h/g siendo g = 9.81m/s^2
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 6 Tema 4
 */
 
public class Ej6 {
 public static void main(String[] args) {
   
  System.out.println("Este programa que calculará el tiempo que tardará un objeto en caer");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  double tiempo = 0;
  System.out.print("Introduzca la altura a la que está el objeto:  ");
  double altura = Double.parseDouble(System.console().readLine());
  
  if (altura == 0) {
    System.out.println("El objeto, no tardará nada de tiempo en llegar al suelo, ya que ya está en él");
  } else if (altura < 0) {
    System.out.println("Ese dato es erróneo, no existen alturas negativas");
  } else {
    tiempo = (2 * altura) / 9.81;
    tiempo = Math.sqrt(tiempo);
    System.out.printf("El tiempo que tarda en llegar al suelo es: %.2f segundos", tiempo);
  }
 }
}
