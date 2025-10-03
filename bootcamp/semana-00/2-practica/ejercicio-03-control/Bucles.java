import java.util.Scanner;

/**
 * Demostración de los tres tipos de bucles en Java
 * 
 * Ejemplos prácticos de for, while y do-while
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class Bucles {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=== DEMOSTRACIÓN DE BUCLES ===\n");

    // 1. BUCLE FOR - Tabla de multiplicar
    System.out.println("1. TABLA DE MULTIPLICAR (for)");
    System.out.print("Ingresa un número: ");
    int numero = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }

    // 2. BUCLE WHILE - Factorial
    System.out.println("\n2. FACTORIAL (while)");
    System.out.print("Ingresa un número: ");
    int n = sc.nextInt();

    int factorial = 1;
    int contador = n;
    while (contador > 0) {
      factorial *= contador;
      contador--;
    }
    System.out.println(n + "! = " + factorial);

    // 3. BUCLE DO-WHILE - Validación
    System.out.println("\n3. VALIDACIÓN (do-while)");
    int numeroValido;
    do {
      System.out.print("Ingresa un número entre 1 y 10: ");
      numeroValido = sc.nextInt();

      if (numeroValido < 1 || numeroValido > 10) {
        System.out.println("Error. Intenta de nuevo.");
      }
    } while (numeroValido < 1 || numeroValido > 10);

    System.out.println("¡Correcto! Ingresaste: " + numeroValido);

    // 4. BREAK - Búsqueda
    System.out.println("\n4. BÚSQUEDA CON BREAK");
    int[] numeros = { 5, 10, 15, 20, 25, 30 };
    int buscar = 20;
    boolean encontrado = false;

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == buscar) {
        System.out.println("Número " + buscar + " encontrado en posición " + i);
        encontrado = true;
        break; // Sale del bucle al encontrar
      }
    }

    if (!encontrado) {
      System.out.println("Número no encontrado");
    }

    // 5. CONTINUE - Filtro
    System.out.println("\n5. IMPRIMIR SOLO PARES CON CONTINUE");
    System.out.print("Números pares del 1 al 20: ");
    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0) {
        continue; // Salta los impares
      }
      System.out.print(i + " ");
    }
    System.out.println();

    sc.close();
  }
}
