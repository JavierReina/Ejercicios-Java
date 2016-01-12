/**
 *
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana. 
 * No se tendrán en cuenta los minutos ni los segundos. 
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). 
 * Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero. 
 * A continuación se muestra un ejemplo:
 * 
 * Por favor, introduzca la primera hora.
 * Día: lunes
 * Hora: 18
 * Por favor, introduzca la segunda hora.
 * Día: martes
 * Hora: 20
 * Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 30 Tema 5
 */

public class Ej30 {

  public static void main(String[] args) {
    
    String dia1 = "";
    int numDia1 = 0;
    int hora1 = 0;
    String dia2 = "";
    int numDia2 = 0;
    int hora2 = 0;
    boolean sale = false;
    
    //primer dia
    System.out.println("Por favor, introduzca la primera hora.");
    do {
      System.out.print("Dia: ");
      dia1 = System.console().readLine();
      switch (dia1.toLowerCase()) {
        case "lunes":
          numDia1 = 1;
          sale = true;
          break;
        case "martes":
          numDia1 = 2;
          sale = true;
          break;
        case "miercoles":
          numDia1 = 3;
          sale = true;
          break;
        case "jueves":
          numDia1 = 4;
          sale = true;
          break;
        case "viernes":
          numDia1 = 5;
          sale = true;
          break;
        case "sabado":
          numDia1 = 6;
          sale = true;
          break;
        case "domingo":
          numDia1 = 7;
          sale = true;
          break;
        default:
          sale = false;
          System.out.println("Día equivocado, vuelva a intentarlo");
          break;
      }
    } while (sale == false);
    sale = false;
    
    do {
      System.out.print("Hora: ");
      hora1 = Integer.parseInt(System.console().readLine());
      if ((hora1 >= 0) && (hora1 <= 24)) {
        sale = true;
      } else {
        System.out.println("Hora equivocada, inténtelo de nuevo");
      }
    } while (sale == false);
    //segundo dia
    sale = false;
    System.out.println("Por favor, introduzca la segunda hora.");
    do {
      System.out.print("Dia: ");
      dia2 = System.console().readLine();
      switch (dia2.toLowerCase()) {
        case "lunes":
          numDia2 = 1;
          break;
        case "martes":
          numDia2 = 2;
          break;
        case "miercoles":
          numDia2 = 3;
          break;
        case "jueves":
          numDia2 = 4;
          break;
        case "viernes":
          numDia2 = 5;
          break;
        case "sabado":
          numDia2 = 6;
          break;
        case "domingo":
          numDia2 = 7;
          break;
        default:
          System.out.println("Día equivocado, vuelva a intentarlo");
          break;
      }
      //comprobamos que el día 2 es después o el mismo que el día 1
      if (numDia2 >= numDia1) {
        //sale del bucle
        sale = true;
      } else {
        //sigue metiendo datos
        sale = false;
      }
    } while (sale == false);
    //una vez sabemos el que el día es correcto, seguimos con la hora del segundo día
    sale = false;
    
    do {
      if (numDia1 == numDia2) {
        System.out.print("Hora: ");
        hora2 = Integer.parseInt(System.console().readLine());
        if (((hora2 >= 0) && (hora2 <= 24)) && (hora2 >= hora1)) {
          sale = true;
        } else {
          System.out.println("Hora equivocada, inténtelo de nuevo");
        }
      } else {
        System.out.print("Hora: ");
        hora2 = Integer.parseInt(System.console().readLine());
        if ((hora2 >= 0) && (hora2 <= 24)) {
          sale = true;
        } else {
          System.out.println("Hora equivocada, inténtelo de nuevo");
        }
      }
    } while (sale == false);
    //ya hemos obtenido los datos correctamente, ahora solo hay que calcular los resultados y mostrarlos
    
    int diaRes = numDia2 - numDia1;
    int horaRes = hora2 - hora1;
    
    if ((horaRes <= 0) && (diaRes >= 1)) {
      diaRes -= 1;
      horaRes += 24;
    } else {
      //no hacemos nada
    }
    
    System.out.println("Quedan " + diaRes + " días y " + horaRes + " horas restantes");
  }
}
