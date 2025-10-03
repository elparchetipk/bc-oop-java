import java.util.Scanner;

/**
 * Implementación de algoritmos de búsqueda y ordenamiento
 * 
 * Búsqueda lineal y ordenamiento burbuja con contadores.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class BusquedaOrdenamiento {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=== BÚSQUEDA Y ORDENAMIENTO ===\n");

    // Array de ejemplo
    int[] numeros = { 64, 34, 25, 12, 22, 11, 90 };

    // Mostrar array original
    System.out.print("Array original: ");
    imprimirArray(numeros);
    System.out.println();

    // 1. BÚSQUEDA LINEAL
    System.out.println("\n1. BÚSQUEDA LINEAL");
    System.out.print("¿Qué número deseas buscar? ");
    int buscar = sc.nextInt();

    int posicion = -1;
    int comparaciones = 0;

    for (int i = 0; i < numeros.length; i++) {
      comparaciones++;
      if (numeros[i] == buscar) {
        posicion = i;
        break;
      }
    }

    if (posicion != -1) {
      System.out.println("Resultado: Encontrado en posición " + posicion);
    } else {
      System.out.println("Resultado: No encontrado");
    }
    System.out.println("Comparaciones realizadas: " + comparaciones);

    // 2. ORDENAMIENTO BURBUJA
    System.out.println("\n2. ORDENAMIENTO BURBUJA");
    System.out.println("Ordenando...");

    // Crear copia para no modificar el original en la demostración
    int[] numerosOrdenados = numeros.clone();
    int intercambios = 0;

    // Algoritmo de ordenamiento burbuja
    for (int i = 0; i < numerosOrdenados.length - 1; i++) {
      for (int j = 0; j < numerosOrdenados.length - 1 - i; j++) {
        if (numerosOrdenados[j] > numerosOrdenados[j + 1]) {
          // Intercambiar
          int temp = numerosOrdenados[j];
          numerosOrdenados[j] = numerosOrdenados[j + 1];
          numerosOrdenados[j + 1] = temp;
          intercambios++;
        }
      }
    }

    System.out.print("Array ordenado: ");
    imprimirArray(numerosOrdenados);
    System.out.println("\nIntercambios realizados: " + intercambios);

    // 3. BÚSQUEDA EN ARRAY ORDENADO
    System.out.println("\n3. BÚSQUEDA EN ARRAY ORDENADO");
    System.out.print("¿Qué número deseas buscar? ");
    int buscar2 = sc.nextInt();

    int posicion2 = -1;
    int comparaciones2 = 0;

    for (int i = 0; i < numerosOrdenados.length; i++) {
      comparaciones2++;
      if (numerosOrdenados[i] == buscar2) {
        posicion2 = i;
        break;
      }
      // Optimización: si el valor actual es mayor, no existe
      if (numerosOrdenados[i] > buscar2) {
        break;
      }
    }

    if (posicion2 != -1) {
      System.out.println("Resultado: Encontrado en posición " + posicion2);
    } else {
      System.out.println("Resultado: No encontrado");
    }
    System.out.println("Comparaciones realizadas: " + comparaciones2);
    System.out.println("(Nota: Menos comparaciones en array ordenado)");

    sc.close();
  }

  /**
   * Método auxiliar para imprimir un array
   */
  public static void imprimirArray(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.print("]");
  }
}
