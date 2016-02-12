package ej15.funciones;

/**
 * @author Francisco Javier Reina Benítez
 */
public class Varias {
  /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa
   * y falso en caso contrario
   */
  public static boolean esCapicua(int x) {
    return (x == voltea(x));
  }
  
  /**
   * Devuelve verdadero si el número que se pasa como parámetro es primo y
   * falso en caso contrario 
   */
  public static boolean esPrimo(int x) {
    int prueba;
    int contador = 0;//es para contar las veces que el numero da 0 en el resto
    int i = 0;
    
      do {
        i++;
        prueba = x % i;
        
        if (prueba == 0) {
          contador++;
        } else {
          //nada
        }
        
      } while (i != x);
      
      return (contador == 2);
  }
  
  /**
   * Devuelve el menor primo que es mayor al número que se pasa
   * como parámetro
   */
  public static int siguientePrimo(int x) {
    do {
      x++;
    } while (!esPrimo(x));
    return x;
  }
  
  /**
   * Dada una base y un exponente devuelve la potencia
   */
  public static int potencia(int base, int exponente) {
    int total = 0;
    for (int i = 0; i < exponente; i++) {
      if (i == 0) {
        total = base;
      } else {
        total = total * base;
      }
    }
    return total;
  }
  
  /**
   * Cuenta el número de dígitos de un número entero
   */
  public static int digitos(int x) {
    int digito = 0;
    do {
      x = x / 10;
      digito++;
    } while (x > 0);
    return digito;
  }
  
  /**
   * Le da la vuelta a un número
   */
  public static int voltea(int x) {
    int copia = x;
    int volteada = 0;
    int digito = digitos(x);
    //sabiendo los digitos procedemos a darle la vuelta y a comprobar
    for (int i = 0; i < digito; i++) {
      if (i == 0) {
        volteada += copia % 10;
      } else {
        volteada = (volteada * 10) + (copia %10);
      }
      copia = copia / 10;
    }
    return volteada;
  }
  
  /**
   * Devuelve el dígito que está en la posición n de un número entero. Se
   * empieza contando por el 0 y de izquierda a derecha
   */
  public static int digitoN(int num, int pos) {
    //volteamos el numero para sacar la posicion mas facilmente
    num = voltea(num);
    int digito = 0;
    for (int i = 0; i < pos; i++) {
      digito = num % 10;
      num = num / 10;
    }
    return digito;
  }
  
  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de
   * un número entero. Si no se encuentra, devuelve -1
   */
  public static int posicionDeDigito(int num, int x) {
    num = voltea(num);
    int cont = 0;
    int resto;
    boolean sale = false;
    do {
      resto = num % 10;
      num = num / 10;
      cont++;
      if (resto == x) {
        sale = true;
      } else if (num == 0) {
        sale = true;
        cont =-1;
      } else {
        //nada
      }
    } while (sale == false);
    return cont;
  }
  
  /**
   * Le quita a un número n dígitos por detrás (por la derecha)
   */
  public static int quitaPorDetras(int num, int x) {

    return (num / potencia(10, x));
  }
  
  /**
   * Le quita a un número n dígitos por delante (por la izquierda)
   */
  public static int quitaPorDelante(int num, int x) {
    return voltea((voltea(num) / potencia(10, x)));
  }
  
  /**
   * Añade un dígito a un número por detrás
   */
  public static int pegaPorDetras(int x, int y) {
    return (x * potencia(10, digitos(y)) + y);
  }
  
  /**
   * Añade un dígito a un número por delante
   */
  public static int pegaPorDelante(int x, int y) {
    return (y * potencia(10, digitos(x)) + x);
  }
  
  /**
   * Toma como parámetros las posiciones inicial y final dentro de un
   * número y devuelve el trozo correspondiente
   */
  public static int trozoDeNumero(int num, int ini, int fin) {
    num = quitaPorDelante(num, (posicionDeDigito(num, ini) - 1));
    return (quitaPorDetras(num, (digitos(num) - posicionDeDigito(num, fin))));
  }
}
