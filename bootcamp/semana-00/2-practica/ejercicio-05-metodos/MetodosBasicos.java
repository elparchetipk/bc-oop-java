/**
 * Demostración de métodos básicos en Java
 * 
 * Muestra los 4 tipos de métodos y sobrecarga.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class MetodosBasicos {

  public static void main(String[] args) {
    System.out.println("=== DEMOSTRACIÓN DE MÉTODOS ===\n");

    // 1. Método sin parámetros y sin retorno
    System.out.println("1. Método sin parámetros y sin retorno:");
    saludar();

    // 2. Método con parámetros y sin retorno
    System.out.println("\n2. Método con parámetros y sin retorno:");
    saludarPersona("Juan");

    // 3. Método sin parámetros y con retorno
    System.out.println("\n3. Método sin parámetros y con retorno:");
    String fecha = obtenerFechaActual();
    System.out.println("Fecha actual: " + fecha);

    // 4. Método con parámetros y con retorno
    System.out.println("\n4. Método con parámetros y con retorno:");
    int resultado = sumar(5, 3);
    System.out.println("5 + 3 = " + resultado);

    // 5. Sobrecarga de métodos
    System.out.println("\n5. Sobrecarga de métodos:");
    double resultadoDouble = sumar(5.5, 3.2);
    System.out.println("5.5 + 3.2 = " + resultadoDouble);

    int resultadoTres = sumar(10, 20, 30);
    System.out.println("10 + 20 + 30 = " + resultadoTres);

    // 6. Método con array
    System.out.println("\n6. Método con array:");
    double[] notas = { 7.5, 8.0, 6.5, 9.0, 7.0 };
    double promedio = promedioArray(notas);
    System.out.printf("Promedio: %.2f\n", promedio);
  }

  /**
   * Método sin parámetros y sin retorno
   */
  public static void saludar() {
    System.out.println("¡Hola desde el método!");
  }

  /**
   * Método con parámetros y sin retorno
   * 
   * @param nombre El nombre de la persona a saludar
   */
  public static void saludarPersona(String nombre) {
    System.out.println("¡Hola, " + nombre + "!");
  }

  /**
   * Método sin parámetros y con retorno
   * 
   * @return La fecha actual como String
   */
  public static String obtenerFechaActual() {
    return java.time.LocalDate.now().toString();
  }

  /**
   * Método con parámetros y con retorno
   * 
   * @param a Primer número
   * @param b Segundo número
   * @return La suma de a y b
   */
  public static int sumar(int a, int b) {
    return a + b;
  }

  /**
   * Sobrecarga: suma de doubles
   * 
   * @param a Primer número
   * @param b Segundo número
   * @return La suma de a y b
   */
  public static double sumar(double a, double b) {
    return a + b;
  }

  /**
   * Sobrecarga: suma de tres enteros
   * 
   * @param a Primer número
   * @param b Segundo número
   * @param c Tercer número
   * @return La suma de a, b y c
   */
  public static int sumar(int a, int b, int c) {
    return a + b + c;
  }

  /**
   * Calcula el promedio de un array de números
   * 
   * @param numeros Array de números
   * @return El promedio
   */
  public static double promedioArray(double[] numeros) {
    if (numeros.length == 0) {
      return 0;
    }

    double suma = 0;
    for (double num : numeros) {
      suma += num;
    }

    return suma / numeros.length;
  }
}
