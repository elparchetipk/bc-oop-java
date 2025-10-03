import java.util.Scanner;

/**
 * Sistema interactivo de gestión de estudiantes con menú
 * 
 * Permite registrar y consultar información de un estudiante.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class MenuInteractivo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variables para almacenar datos
    String nombre = "";
    double calificacion = -1;
    int opcion;

    System.out.println("=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===");

    // Menú principal con do-while
    do {
      // Mostrar menú
      System.out.println("\n--- MENÚ ---");
      System.out.println("1. Registrar nombre del estudiante");
      System.out.println("2. Registrar calificación");
      System.out.println("3. Mostrar información completa");
      System.out.println("4. Evaluar calificación");
      System.out.println("0. Salir");
      System.out.print("\nSelecciona una opción: ");

      opcion = sc.nextInt();
      sc.nextLine(); // Limpiar buffer

      // Procesar opción con switch
      switch (opcion) {
        case 1:
          System.out.print("Nombre del estudiante: ");
          nombre = sc.nextLine();
          System.out.println("✓ Nombre registrado exitosamente");
          break;

        case 2:
          System.out.print("Calificación (0-100): ");
          calificacion = sc.nextDouble();

          // Validar calificación
          if (calificacion < 0 || calificacion > 100) {
            System.out.println("✗ Error: Calificación debe estar entre 0 y 100");
            calificacion = -1;
          } else {
            System.out.println("✓ Calificación registrada exitosamente");
          }
          break;

        case 3:
          System.out.println("\n--- INFORMACIÓN DEL ESTUDIANTE ---");

          if (nombre.isEmpty()) {
            System.out.println("Nombre: (No registrado)");
          } else {
            System.out.println("Nombre: " + nombre);
          }

          if (calificacion == -1) {
            System.out.println("Calificación: (No registrada)");
          } else {
            System.out.println("Calificación: " + calificacion);
          }
          break;

        case 4:
          if (calificacion == -1) {
            System.out.println("✗ Error: Primero registra una calificación");
          } else {
            // Determinar letra
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

            System.out.println("\n--- EVALUACIÓN ---");
            System.out.println("Calificación: " + calificacion);
            System.out.println("Letra: " + letra);

            if (calificacion >= 60) {
              System.out.println("Estado: APROBADO ✓");
            } else {
              System.out.println("Estado: REPROBADO ✗");
            }
          }
          break;

        case 0:
          System.out.println("\n¡Hasta luego! Gracias por usar el sistema.");
          break;

        default:
          System.out.println("✗ Opción inválida. Intenta de nuevo.");
      }

    } while (opcion != 0);

    sc.close();
  }
}
