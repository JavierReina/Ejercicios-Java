/**
 *
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 5 Tema 1
 */
 
public class Ej5 {
 public static void main(String[] args) { 
   
   String rojo = "\033[31m";
   String verde = "\033[32m";
   String naranja = "\033[33m";
   String azul = "\033[34m";
   String morado = "\033[35m";
   String blanco = "\033[37m";


   System.out.println(blanco + "\t\tLunes\tMartes\tMiércoles\tJueves\tViernes");
   System.out.println(blanco + "8:15-9:15\tFOL" + rojo +"\tPROG" + verde + "\tSIN" + rojo + "\t\tPROG" + naranja + "\tBBDD");
   System.out.println(blanco + "9:15-10:15\tFOL" + rojo +"\tPROG" + verde + "\tSIN" + rojo + "\t\tPROG" + naranja + "\tBBDD");
   System.out.println(blanco + "10:15-11:15\tFOL" + rojo +"\tPROG" + verde + "\tSIN" + rojo + "\t\tPROG" + naranja + "\tBBDD");
   System.out.println(blanco + "11:15-11:45\tR\tE\tCR\t\tE\tO");
   System.out.println(blanco + "11:45-12:40" + rojo + "\tPROG" + naranja + "\tBBDD" + verde + "\tSIN" + azul + "\t\tED" + rojo + "\tPROG");
   System.out.println(blanco + "12:40-13:35" + azul + "\tED" + naranja + "\tBBDD" + morado + "\tLM" + morado + "\t\tLM" + verde + "\tSIN");
   System.out.println(blanco + "13:35-14:30" + azul + "\tED" + naranja + "\tBBDD" + morado + "\tLM" + morado + "\t\tLM" + verde + "\tSIN");
 }
}
