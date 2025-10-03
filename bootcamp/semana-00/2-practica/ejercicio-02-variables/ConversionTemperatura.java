import java.util.Scanner;

/**
 * Conversor de temperatura entre Celsius y Fahrenheit
 * 
 * Fórmulas:
 * - Celsius a Fahrenheit: F = (C × 9/5) + 32
 * - Fahrenheit a Celsius: C = (F - 32) × 5/9
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class ConversionTemperatura {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=== CONVERSOR DE TEMPERATURA ===\n");

    // TODO: Mostrar menú de opciones
    System.out.println("1. Celsius → Fahrenheit");
    System.out.println("2. Fahrenheit → Celsius");
    System.out.print("\nSelecciona una opción: ");
    int opcion = sc.nextInt();

    // TODO: Solicitar temperatura según la opción
    double temperatura;
    double resultado;

    if (opcion == 1) {
      // Celsius a Fahrenheit
      System.out.print("Temperatura en Celsius: ");
      temperatura = sc.nextDouble();
      resultado = (temperatura * 9 / 5) + 32;
      System.out.printf("\n%.2f°C = %.2f°F\n", temperatura, resultado);

    } else if (opcion == 2) {
      // Fahrenheit a Celsius
      System.out.print("Temperatura en Fahrenheit: ");
      temperatura = sc.nextDouble();
      resultado = (temperatura - 32) * 5 / 9;
      System.out.printf("\n%.2f°F = %.2f°C\n", temperatura, resultado);

    } else {
      System.out.println("Opción inválida");
    }

    sc.close();
  }
}
