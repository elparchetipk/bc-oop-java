import java.util.Scanner;

/**
 * Evaluador de calificaciones con estructuras de decisión
 * 
 * Determina la letra y estado según la calificación numérica.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class EstructurasDecision {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=== EVALUADOR DE CALIFICACIONES ===\n");

    // Solicitar calificación
    System.out.print("Ingresa tu calificación (0-100): ");
    int calificacion = sc.nextInt();

    // Validar rango
    if (calificacion < 0 || calificacion > 100) {
      System.out.println("Error: La calificación debe estar entre 0 y 100");
      sc.close();
      return;
    }

    // Determinar letra con if-else-if
    char letra;
    if (calificacion >= 90) {
      letra = 'A';
    } else if (calificacion >= 80) {
      letra = 'B';
    } else if (calificacion >= 70) {
      letra = 'C';
    } else if (calificacion >= 60) {
      letra = 'D';
    } else {
      letra = 'F';
    }

    // Mostrar resultados
    System.out.println("\nTu calificación: " + calificacion);
    System.out.println("Letra: " + letra);

    // Mensaje según letra con switch
    System.out.print("Estado: ");
    switch (letra) {
      case 'A':
        System.out.println("Excelente");
        break;
      case 'B':
        System.out.println("Muy bien");
        break;
      case 'C':
        System.out.println("Bien");
        break;
      case 'D':
        System.out.println("Suficiente");
        break;
      case 'F':
        System.out.println("Insuficiente");
        break;
      default:
        System.out.println("Desconocido");
    }

    // Determinar si aprobó
    System.out.print("Resultado: ");
    if (calificacion >= 60) {
      System.out.println("¡APROBADO! ✓");
    } else {
      System.out.println("REPROBADO ✗");
    }

    sc.close();
  }
}
