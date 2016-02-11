package ej15;
import ej15.funciones.Varias;
/**
 * Muestra los números primos que hay entre 1 y 1000
 * @author Francisco Javier Reina Benítez
 */
public class Ej15 {
  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
      if (Varias.esPrimo(i)) {
        System.out.println(i);
      }
    }
  }
}
