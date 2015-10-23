/**
 *
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
 * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje 
 * “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
 * Tendremos cuatro oportunidades para abrir la caja fuerte
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 7 Tema 5
 */

public class Ej7 {

  public static void main(String[] args) {
    
    System.out.println("Bienvenido a su caja fuerte, por favor introduzca la clave");
    int clave = 0;
    int sale = 0;
    int acierto = 0;
    
    for (int intento = 4; intento != 0; intento--) {
      do { //aqui vamos a controlar que la clave sea de 4 digitos
        clave = Integer.parseInt(System.console().readLine());
        
        if ((((clave / 1000) <= 0)) || ((clave / 1000) >= 10)) {
          System.out.println("Lo siento, la clave introducida es demasiado corta o larga");
          System.out.print("Por favor, introduzca la clave de nuevo: ");
        } else {
          sale = 1;
        }
      } while (sale == 0);
      
      if (clave == 1234) {
        System.out.println("Caja fuerte abierta satisfactoriamente");
        acierto = 1;
        intento = 1;
      } else {
        System.out.println("Fallas al intentar abrir, pierdes 20 HP");
      }
      
    } // for intento
    if (acierto == 1) {
      System.out.println("Ganas 30 Exp y 6 oro");
    } else {
      System.out.println("...");
      System.out.println("Has perdido todo tu HP, pierdes el combate");
    }
  }
}
