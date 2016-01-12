/**
 *
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso. 
 * Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida. 
 * Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos 
 * en las diferentes asignaturas del curso
 *
 * @author Francisco Javier Reina Benítez
 *
 * Ejercicio 12 Tema 4
 */
 
public class Ej12 {
 public static void main(String[] args) {
   
  System.out.println("Este programa es un cuestionario");
  System.out.println("pulse INTRO para continuar");
  System.console().readLine();
  
  int puntos = 0;
  System.out.println("Me voy a tomar un poco la libertad de modificar el tema de las preguntas");
  System.out.println("Se te darán varias obciones a cada pregunta, escoge alguna con números");
  
  System.out.println("Empezamos facil");
  System.out.println("1) ¿Cual de éstos personajes NO es de Nintendo?");
  System.out.println("1. Mario\n2. Sonic\n3. Samus Aran\n4. Red");
  int respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 1: 
    case 3:
    case 4:
      break;
    case 2:
      puntos++;
      break;
  }
  
  System.out.println("Vamos con un poquito de historia");
  System.out.println("2) SquareSoft se salvó de la bancarrota gracias a un juego, ¿Cuál fué?");
  System.out.println("1. Dragon Quest\n2. Pokemon\n3. Brabely default\n4. Final Fantasy");
  respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 1:
    case 2:
    case 3:
      break;
    case 4:
      puntos++;
      break;
  }
  
  System.out.println("Incrementemos un poco la dificultad");
  System.out.println("3) ¿Cómo se llamaba el protagonista del Final Fantasy IX?");
  System.out.println("1. Yitan\n2. Cloud\n3. Minato\n4. Como me de la gana");
  respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 2:
    case 3:
      break;
    case 1:
      puntos++;
      break;
    case 4:
      puntos++;
      break;
  }
  
  System.out.println("4) ¿Cuántos pokémon habían en la pokédex de la primera generación?");
  System.out.println("1. 250\n2. 100\n3. 151\n4. 150");
  respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 1:
    case 2:
    case 4:
      break;
    case 3:
      puntos++;
      break;
  }
  
  System.out.println("¡Animo! ya llevas la mitad");
  System.out.println("5) ¿Qué juego se conoce por que su personaje use como arma principal un látigo?");
  System.out.println("1. Castlevania\n2. Metroid\n3. Contra\n4. Megaman");
  respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 2:
    case 3:
    case 4:
      break;
    case 1:
      puntos++;
      break;
  }
  
  System.out.println("Bueno, ha sido divertido, pero aqui viene lo duro");
  System.out.println("6) Uncharted es una saga muy aclamada de Naughty Dog, ¿Quien es su Protagonista?");
  System.out.println("1. Crash Bandicoot\n2. Luffy\n3. Nathan Drake\n4. Joel");
  respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 1:
    case 2:
    case 4:
      break;
    case 3:
      puntos++;
      break;
  }
  
  System.out.println("7) Ahora está de moda el género MOBA, ¿Cuál fué su origen?");
  System.out.println("1. Lo ha inventado Riot Games hace 4 años\n2. Fue un Mod de Warcraft\n3. No existe, son los padres");
  respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 1:
    case 3:
      break;
    case 2:
      puntos++;
      break;
  }
  
  System.out.println("8) ¿Cual es el nombre que más se repite en la saga Final Fantasy?");
  System.out.println("1. Cid\n2. Biggs\n3. Wedge\n4. Freija");
  respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 2:
    case 3:
    case 4:
      break;
    case 1:
      puntos++;
      break;
  }
  
  System.out.println("9) ¿Dónde aparece la siguiente frase?");
  System.out.println("Nada es verdad, todo está permitido");
  System.out.println("1. Kingdom Hearts\n2. Call of Duty\n3. Assassins Creed\n4. Hearthbound");
  respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 1:
    case 2:
    case 4:
      break;
    case 3:
      puntos++;
      break;
  }
  
  System.out.println("10) En el juego Persona 3, ¿Cuál es la tarea más dificil de hacer?");
  System.out.println("1. Derrotar al boss final\n2. Maximizar todos los Social Links en una partida\n3. Derrotar a Elizabeth\n4. Llegar a la parte más alta del Tártarus");
  respuesta = Integer.parseInt(System.console().readLine());
  
  switch (respuesta) {
    case 1:
    case 2:
    case 4:
      break;
    case 3:
      puntos++;
      break;
  }
  
  System.out.println("Enorabuena, has completado el cuestonario...");
  System.out.println("Pero como esto no es un juego no recibes experiencia ni dinero por las molestias");
  System.out.println("Pulsa INTRO para conocer los resultados");
  System.console().readLine();
  
  System.out.println("Has sacado " + puntos + "/10 puntos");
 }
}
