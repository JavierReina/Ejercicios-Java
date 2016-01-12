/**
 *
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser introducida por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 2 Tema 3
 */
 
public class Ej2 {
 public static void main(String[] args) {
   
   System.out.println("Este programa combertirá una cantidad de euro a pesetas introducidas por teclado");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.print("Introduce la cantidad de euros que desea combertir: ");
   double euro = Double.parseDouble(System.console().readLine());
   
   double resultado = euro * 166.386;
   System.out.println(euro + " euros son " + (int)resultado + " pesetas");
 }
}
