/**
 *
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser introducida por teclado
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 3 Tema 3
 */
 
public class Ej3 {
 public static void main(String[] args) {
   
   System.out.println("Este programa combertirá una cantidad de pesetas a euro introducidas por teclado");
   System.out.println("pulse INTRO para continuar");
   System.console().readLine();
   
   System.out.print("Introduce la cantidad de pesetas que desea combertir: ");
   int peseta = Integer.parseInt(System.console().readLine());
   
   double resultado = (double)peseta * 0.006;
   System.out.println(peseta + " pesetas son " + (int)resultado + " euros");
 }
}
