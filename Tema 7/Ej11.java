/**
 *
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. 
 * A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello una tabla. 
 * Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el resto de números 
 * (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el array resultante
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 11 Tema 7
 */

public class Ej11 {

  public static void main(String[] args) {
    
    int[] num = new int[10];
    int[] resultado = new int[10];
    int contador = 0;
    int cuentaArray = 0;
    int prim = 0;
    int prueba = 0;
    
    System.out.println("Introduzca 10 números");
    //primero pedimos los números por teclado
    for (int i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Índice\tValor");
    //mostramos el array
    for (int i = 0; i < 10; i++) {
      System.out.println(i + "\t" + num[i]);
    }
    
    //comprobamos cuales son primos y los posicionamos primero
    for (int i = 0; i < 10; i++) {
      do {
        prim++;
        prueba = num[i] % prim;
        
        if (prueba == 0) {
          contador++;
        } else {
          //nada
        }
      } while (prim != num[i]); 
      
        if (contador == 2) {
          resultado[cuentaArray] = num[i];
          cuentaArray++;
        } else {
        //nada
        }
      
      contador = 0;
      prim = 0;
    }//for
    
    //ahora metemos en el array resultante los que quedan
    for (int i = 0; i < 10; i++) {
      do {
        prim++;
        prueba = num[i] % prim;
        
        if (prueba == 0) {
          contador++;
        } else {
          //nada
        }
      } while (prim != num[i]);  
      
        if (contador != 2) {
        resultado[cuentaArray] = num[i];
        cuentaArray++;
        } else {
        //nada
        }
      
      contador = 0;
      prim = 0;
    }//for
    
    System.out.println("\nArray final");
    //por último mostramos el array resultante
    System.out.println("Índice\tValor");
    //mostramos el array
    for (int i = 0; i < 10; i++) {
      System.out.println(i + "\t" + resultado[i]);
    }
  }
}
