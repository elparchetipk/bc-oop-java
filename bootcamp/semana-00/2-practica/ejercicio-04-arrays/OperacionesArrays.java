/**
 * Operaciones básicas con arrays
 * 
 * Demuestra operaciones comunes: suma, promedio, max, min, invertir.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class OperacionesArrays {

  public static void main(String[] args) {

    // Declarar e inicializar array
    int[] numeros = { 10, 25, 3, 47, 12, 8, 36, 5 };

    System.out.println("=== OPERACIONES CON ARRAYS ===\n");

    // 1. Imprimir array original
    System.out.print("Array original: [");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]);
      if (i < numeros.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]\n");

    // 2. Calcular suma
    int suma = 0;
    for (int num : numeros) {
      suma += num;
    }
    System.out.println("Suma total: " + suma);

    // 3. Calcular promedio
    double promedio = (double) suma / numeros.length;
    System.out.printf("Promedio: %.2f\n", promedio);

    // 4. Encontrar máximo
    int max = numeros[0];
    for (int num : numeros) {
      if (num > max) {
        max = num;
      }
    }
    System.out.println("Máximo: " + max);

    // 5. Encontrar mínimo
    int min = numeros[0];
    for (int num : numeros) {
      if (num < min) {
        min = num;
      }
    }
    System.out.println("Mínimo: " + min);

    // 6. Contar pares e impares
    int pares = 0, impares = 0;
    for (int num : numeros) {
      if (num % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }
    System.out.println("Números pares: " + pares);
    System.out.println("Números impares: " + impares);

    // 7. Invertir array
    System.out.print("\nArray invertido: [");
    for (int i = 0; i < numeros.length / 2; i++) {
      int temp = numeros[i];
      numeros[i] = numeros[numeros.length - 1 - i];
      numeros[numeros.length - 1 - i] = temp;
    }

    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]);
      if (i < numeros.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }
}
