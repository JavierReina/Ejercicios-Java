/**
 *
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 3 Tema 4
 */
 
public class Ej3 {
 public static void main(String[] args) {
   
  System.out.println("Este programa dirá el día de la semana según el número dado");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  System.out.print("Introduzca un número del 1 al 7: ");
  String dia;
  int numDia = Integer.parseInt(System.console().readLine());
  
  switch (numDia) {
    case 1:
      dia = "Lunes";
      break;
    case 2:
      dia = "Martes";
      break;
    case 3:
      dia = "Miércoles";
      break;
    case 4:
      dia = "Jueves";
      break;
    case 5:
      dia = "Viernes";
      break;
    case 6:
      dia = "Sábado";
      break;
    case 7:
      dia = "Domingo";
      break;
    default:
      dia = "nulo";
      
    }
    if (dia.equals("nulo")) {
      System.out.println("No me seas listillo, he dicho del 1 al 7 ¬,¬");
    } else {
      System.out.println("El día es " + dia);
    }
 }
}
