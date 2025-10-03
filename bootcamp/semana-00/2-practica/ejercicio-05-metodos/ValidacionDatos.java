import java.util.Scanner;

/**
 * Sistema de validación de datos
 * 
 * Métodos especializados para validar diferentes tipos de datos.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class ValidacionDatos {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    System.out.println("=== SISTEMA DE VALIDACIÓN DE DATOS ===");

    do {
      mostrarMenu();
      opcion = sc.nextInt();
      sc.nextLine(); // Limpiar buffer

      switch (opcion) {
        case 1:
          validarEdadMenu(sc);
          break;

        case 2:
          validarEmailMenu(sc);
          break;

        case 3:
          validarTelefonoMenu(sc);
          break;

        case 4:
          validarNombreMenu(sc);
          break;

        case 5:
          validarCalificacionMenu(sc);
          break;

        case 0:
          System.out.println("\n¡Hasta luego!");
          break;

        default:
          System.out.println("✗ Opción inválida");
      }

    } while (opcion != 0);

    sc.close();
  }

  /**
   * Muestra el menú principal
   */
  public static void mostrarMenu() {
    System.out.println("\n--- MENÚ ---");
    System.out.println("1. Validar edad");
    System.out.println("2. Validar email");
    System.out.println("3. Validar teléfono");
    System.out.println("4. Validar nombre");
    System.out.println("5. Validar calificación");
    System.out.println("0. Salir");
    System.out.print("\nOpción: ");
  }

  /**
   * Valida una edad
   * 
   * @param edad La edad a validar
   * @return true si es válida (0-120), false si no
   */
  public static boolean validarEdad(int edad) {
    return edad >= 0 && edad <= 120;
  }

  /**
   * Valida formato de email básico
   * 
   * @param email El email a validar
   * @return true si contiene @ y ., false si no
   */
  public static boolean validarEmail(String email) {
    if (email == null || email.isEmpty()) {
      return false;
    }

    // Verificar que contenga @ y .
    boolean tieneArroba = email.contains("@");
    boolean tienePunto = email.contains(".");

    // @ debe estar antes del .
    int posArroba = email.indexOf("@");
    int posPunto = email.lastIndexOf(".");

    return tieneArroba && tienePunto && posArroba < posPunto && posArroba > 0;
  }

  /**
   * Valida formato de teléfono (solo dígitos, 7-10 caracteres)
   * 
   * @param telefono El teléfono a validar
   * @return true si es válido, false si no
   */
  public static boolean validarTelefono(String telefono) {
    if (telefono == null || telefono.isEmpty()) {
      return false;
    }

    // Verificar longitud
    if (telefono.length() < 7 || telefono.length() > 10) {
      return false;
    }

    // Verificar que solo contenga dígitos
    for (int i = 0; i < telefono.length(); i++) {
      if (!Character.isDigit(telefono.charAt(i))) {
        return false;
      }
    }

    return true;
  }

  /**
   * Valida un nombre (solo letras y espacios, mínimo 2 caracteres)
   * 
   * @param nombre El nombre a validar
   * @return true si es válido, false si no
   */
  public static boolean validarNombre(String nombre) {
    if (nombre == null || nombre.isEmpty()) {
      return false;
    }

    // Mínimo 2 caracteres
    if (nombre.trim().length() < 2) {
      return false;
    }

    // Solo letras y espacios
    for (int i = 0; i < nombre.length(); i++) {
      char c = nombre.charAt(i);
      if (!Character.isLetter(c) && c != ' ') {
        return false;
      }
    }

    return true;
  }

  /**
   * Valida una calificación
   * 
   * @param calificacion La calificación a validar
   * @return true si está entre 0 y 100, false si no
   */
  public static boolean validarCalificacion(double calificacion) {
    return calificacion >= 0 && calificacion <= 100;
  }

  /**
   * Valida si un valor está dentro de un rango
   * 
   * @param valor El valor a validar
   * @param min   El valor mínimo
   * @param max   El valor máximo
   * @return true si está en el rango, false si no
   */
  public static boolean validarRangoEntero(int valor, int min, int max) {
    return valor >= min && valor <= max;
  }

  // MÉTODOS AUXILIARES PARA EL MENÚ

  private static void validarEdadMenu(Scanner sc) {
    System.out.print("Ingresa edad: ");
    int edad = sc.nextInt();

    if (validarEdad(edad)) {
      System.out.println("✓ Edad válida");
    } else {
      System.out.println("✗ Edad inválida (debe estar entre 0 y 120)");
    }
  }

  private static void validarEmailMenu(Scanner sc) {
    System.out.print("Ingresa email: ");
    String email = sc.nextLine();

    if (validarEmail(email)) {
      System.out.println("✓ Email válido");
    } else {
      System.out.println("✗ Email inválido (debe contener @ y .)");
    }
  }

  private static void validarTelefonoMenu(Scanner sc) {
    System.out.print("Ingresa teléfono: ");
    String telefono = sc.nextLine();

    if (validarTelefono(telefono)) {
      System.out.println("✓ Teléfono válido");
    } else {
      System.out.println("✗ Teléfono inválido (7-10 dígitos)");
    }
  }

  private static void validarNombreMenu(Scanner sc) {
    System.out.print("Ingresa nombre: ");
    String nombre = sc.nextLine();

    if (validarNombre(nombre)) {
      System.out.println("✓ Nombre válido");
    } else {
      System.out.println("✗ Nombre inválido (mínimo 2 caracteres, solo letras)");
    }
  }

  private static void validarCalificacionMenu(Scanner sc) {
    System.out.print("Ingresa calificación: ");
    double calificacion = sc.nextDouble();

    if (validarCalificacion(calificacion)) {
      System.out.println("✓ Calificación válida");
    } else {
      System.out.println("✗ Calificación inválida (debe estar entre 0 y 100)");
    }
  }
}
