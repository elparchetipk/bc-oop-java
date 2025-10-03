/**
 * Biblioteca de funciones matemáticas
 * 
 * Colección de métodos matemáticos reutilizables.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class BibliotecaMatematicas {

  public static void main(String[] args) {
    System.out.println("=== BIBLIOTECA MATEMÁTICA ===\n");

    // 1. Par/Impar
    System.out.println("1. Par/Impar");
    System.out.println("¿10 es par? " + esPar(10));
    System.out.println("¿7 es impar? " + esImpar(7));

    // 2. Número Primo
    System.out.println("\n2. Número Primo");
    System.out.println("¿17 es primo? " + esPrimo(17));
    System.out.println("¿20 es primo? " + esPrimo(20));

    // 3. Factorial
    System.out.println("\n3. Factorial");
    System.out.println("5! = " + factorial(5));

    // 4. Potencia
    System.out.println("\n4. Potencia");
    System.out.println("2^8 = " + potencia(2, 8));

    // 5. Fibonacci
    System.out.println("\n5. Fibonacci");
    System.out.println("Posición 10: " + fibonacci(10));

    // 6. Máximo de tres
    System.out.println("\n6. Máximo de tres");
    System.out.println("Máximo(15, 32, 8) = " + maximoDeTres(15, 32, 8));

    // 7. Mayor de array
    System.out.println("\n7. Mayor de array");
    int[] numeros = { 12, 45, 23, 67, 34 };
    System.out.print("Array: [");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]);
      if (i < numeros.length - 1)
        System.out.print(", ");
    }
    System.out.println("]");
    System.out.println("Mayor: " + mayorArray(numeros));
  }

  /**
   * Verifica si un número es par
   * 
   * @param numero El número a verificar
   * @return true si es par, false si no
   */
  public static boolean esPar(int numero) {
    return numero % 2 == 0;
  }

  /**
   * Verifica si un número es impar
   * 
   * @param numero El número a verificar
   * @return true si es impar, false si no
   */
  public static boolean esImpar(int numero) {
    return numero % 2 != 0;
  }

  /**
   * Verifica si un número es primo
   * 
   * @param numero El número a verificar
   * @return true si es primo, false si no
   */
  public static boolean esPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * Calcula el factorial de un número
   * 
   * @param n El número
   * @return El factorial de n
   */
  public static long factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    long resultado = 1;
    for (int i = 2; i <= n; i++) {
      resultado *= i;
    }

    return resultado;
  }

  /**
   * Calcula la potencia de un número
   * 
   * @param base      La base
   * @param exponente El exponente
   * @return base^exponente
   */
  public static long potencia(int base, int exponente) {
    long resultado = 1;

    for (int i = 0; i < exponente; i++) {
      resultado *= base;
    }

    return resultado;
  }

  /**
   * Calcula el n-ésimo número de Fibonacci
   * 
   * @param n La posición en la secuencia
   * @return El n-ésimo número de Fibonacci
   */
  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }

    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
      int temp = a + b;
      a = b;
      b = temp;
    }

    return b;
  }

  /**
   * Encuentra el máximo de tres números
   * 
   * @param a Primer número
   * @param b Segundo número
   * @param c Tercer número
   * @return El mayor de los tres
   */
  public static int maximoDeTres(int a, int b, int c) {
    int max = a;

    if (b > max) {
      max = b;
    }

    if (c > max) {
      max = c;
    }

    return max;
  }

  /**
   * Encuentra el mayor elemento de un array
   * 
   * @param numeros El array de números
   * @return El mayor elemento
   */
  public static int mayorArray(int[] numeros) {
    if (numeros.length == 0) {
      throw new IllegalArgumentException("El array está vacío");
    }

    int max = numeros[0];

    for (int num : numeros) {
      if (num > max) {
        max = num;
      }
    }

    return max;
  }
}
