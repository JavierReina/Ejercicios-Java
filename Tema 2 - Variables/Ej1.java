/**
 *
 * Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores 144 y 999 respectivamente. 
 * A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 1 Tema 2
 */
 
public class Ej1 {
 public static void main(String[] args) {
   
   int x = 144;
   int y = 999;
   
   int resultado = x + y;
   System.out.println("La suma de x e y es = " + resultado);
   
   resultado = x - y;
   System.out.println("La resta de x e y es = " + resultado);
   
   resultado = x * y;
   System.out.println("La muliplicación de x e y es = " + resultado);
   
   double division = (double)x / (double)y;
   System.out.println("La división de x e y es = " + division);
 }
}
