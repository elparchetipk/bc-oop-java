import java.util.Scanner;
import java.util.Arrays;

/**
 * Sistema de análisis estadístico de calificaciones
 * 
 * Calcula estadísticas y distribución de notas.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class EstadisticasNotas {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=== SISTEMA DE ESTADÍSTICAS DE NOTAS ===\n");

    // Solicitar cantidad de estudiantes
    System.out.print("¿Cuántos estudiantes? ");
    int cantidad = sc.nextInt();

    // Crear array para calificaciones
    double[] calificaciones = new double[cantidad];

    // Ingresar calificaciones con validación
    for (int i = 0; i < cantidad; i++) {
      double nota;
      do {
        System.out.print("Calificación estudiante " + (i + 1) + ": ");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 100) {
          System.out.println("Error: La calificación debe estar entre 0 y 100");
        }
      } while (nota < 0 || nota > 100);

      calificaciones[i] = nota;
    }

    // CALCULAR ESTADÍSTICAS

    // 1. Promedio
    double suma = 0;
    for (double nota : calificaciones) {
      suma += nota;
    }
    double promedio = suma / cantidad;

    // 2. Máximo y mínimo
    double max = calificaciones[0];
    double min = calificaciones[0];
    for (double nota : calificaciones) {
      if (nota > max)
        max = nota;
      if (nota < min)
        min = nota;
    }

    // 3. Aprobados y reprobados
    int aprobados = 0, reprobados = 0;
    for (double nota : calificaciones) {
      if (nota >= 60) {
        aprobados++;
      } else {
        reprobados++;
      }
    }

    // 4. Distribución por letras
    int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
    for (double nota : calificaciones) {
      if (nota >= 90) {
        countA++;
      } else if (nota >= 80) {
        countB++;
      } else if (nota >= 70) {
        countC++;
      } else if (nota >= 60) {
        countD++;
      } else {
        countF++;
      }
    }

    // MOSTRAR RESULTADOS
    System.out.println("\n--- ESTADÍSTICAS ---");
    System.out.printf("Promedio general: %.2f\n", promedio);
    System.out.printf("Nota máxima: %.2f\n", max);
    System.out.printf("Nota mínima: %.2f\n", min);
    System.out.println("Aprobados (≥60): " + aprobados);
    System.out.println("Reprobados (<60): " + reprobados);

    System.out.println("\n--- DISTRIBUCIÓN ---");
    System.out.println("A (90-100): " + countA + " estudiante(s)");
    System.out.println("B (80-89): " + countB + " estudiante(s)");
    System.out.println("C (70-79): " + countC + " estudiante(s)");
    System.out.println("D (60-69): " + countD + " estudiante(s)");
    System.out.println("F (0-59): " + countF + " estudiante(s)");

    // Ordenar calificaciones
    Arrays.sort(calificaciones);
    System.out.print("\nCalificaciones ordenadas: [");
    for (int i = 0; i < calificaciones.length; i++) {
      System.out.printf("%.0f", calificaciones[i]);
      if (i < calificaciones.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");

    sc.close();
  }
}
