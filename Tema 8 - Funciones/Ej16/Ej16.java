package ej16;
import ej16.funciones.Varias;
/**
 * Muestra los números capicúa que hay entre 1 y 99999
 * @author Francisco Javier Reina Benítez
 */
public class Ej16 {
  public static void main(String[] args) {
    for (int i = 1; i <= 99999; i++) {
      if (Varias.esCapicua(i)) {
        System.out.println(i + " ");
      }
    }
  }
}
