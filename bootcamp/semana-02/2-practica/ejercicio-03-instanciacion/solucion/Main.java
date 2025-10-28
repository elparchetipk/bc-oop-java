/**
 * Clase principal que demuestra la instanciación de múltiples objetos
 * y la gestión de una biblioteca
 * 
 * @author SENA - Bootcamp POO Java
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("=== BIBLIOTECA - Gestión de Libros ===\n");

    // ===== CREAR MÚLTIPLES OBJETOS (INSTANCIACIÓN) =====
    System.out.println("Agregando libros a la biblioteca...");

    Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471, 1967);
    Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863, 1605);
    Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96, 1943);
    Libro libro4 = new Libro("1984", "George Orwell", 328, 1949);
    Libro libro5 = new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", 120, 1981);

    // Array de libros para gestionar fácilmente
    Libro[] biblioteca = { libro1, libro2, libro3, libro4, libro5 };

    System.out.println("✓ " + biblioteca.length + " libros agregados\n");

    // ===== MOSTRAR CATÁLOGO COMPLETO =====
    System.out.println("========== CATÁLOGO COMPLETO ==========");
    for (int i = 0; i < biblioteca.length; i++) {
      biblioteca[i].mostrarInfo();
    }
    System.out.println("========================================\n");

    // ===== PRÉSTAMOS =====
    System.out.println("=== PRÉSTAMOS ===");

    System.out.println("Prestando '" + libro1.titulo + "'...");
    if (libro1.prestar()) {
      System.out.println("✓ Libro prestado exitosamente\n");
    } else {
      System.out.println("✗ El libro ya está prestado\n");
    }

    System.out.println("Prestando '" + libro3.titulo + "'...");
    if (libro3.prestar()) {
      System.out.println("✓ Libro prestado exitosamente\n");
    } else {
      System.out.println("✗ El libro ya está prestado\n");
    }

    // Intentar prestar un libro ya prestado
    System.out.println("Intentando prestar '" + libro1.titulo + "' nuevamente...");
    if (libro1.prestar()) {
      System.out.println("✓ Libro prestado exitosamente\n");
    } else {
      System.out.println("✗ El libro ya está prestado\n");
    }

    // ===== CONTAR LIBROS DISPONIBLES =====
    System.out.println("=== ESTADO ACTUAL ===");
    int disponibles = contarDisponibles(biblioteca);
    int prestados = biblioteca.length - disponibles;
    System.out.println("Libros disponibles: " + disponibles + "/" + biblioteca.length);
    System.out.println("Libros prestados: " + prestados + "/" + biblioteca.length + "\n");

    // ===== DEVOLUCIONES =====
    System.out.println("=== DEVOLUCIONES ===");

    System.out.println("Devolviendo '" + libro1.titulo + "'...");
    if (libro1.devolver()) {
      System.out.println("✓ Libro devuelto exitosamente\n");
    } else {
      System.out.println("✗ El libro ya estaba disponible\n");
    }

    // ===== ESTADO FINAL =====
    System.out.println("=== ESTADO FINAL ===");
    disponibles = contarDisponibles(biblioteca);
    System.out.println("Libros disponibles: " + disponibles + "/" + biblioteca.length + "\n");

    // ===== ESTADÍSTICAS =====
    System.out.println("=== ESTADÍSTICAS ===");

    // Encontrar libro más antiguo
    Libro masAntiguo = encontrarMasAntiguo(biblioteca);
    System.out.println("Libro más antiguo: " + masAntiguo.titulo + " (" + masAntiguo.anioPublicacion + ")");

    // Encontrar libro más nuevo
    Libro masNuevo = encontrarMasNuevo(biblioteca);
    System.out.println("Libro más nuevo: " + masNuevo.titulo + " (" + masNuevo.anioPublicacion + ")");

    // Contar libros voluminosos
    int voluminosos = contarVoluminosos(biblioteca);
    System.out.println("Libros voluminosos (>500 páginas): " + voluminosos);

    // Promedio de páginas
    double promedioPaginas = calcularPromedioPaginas(biblioteca);
    System.out.printf("Promedio de páginas: %.1f\n", promedioPaginas);

    // ===== LISTAR LIBROS VOLUMINOSOS =====
    System.out.println("\n=== LIBROS VOLUMINOSOS ===");
    listarVoluminosos(biblioteca);

    // ===== BUSCAR POR AUTOR =====
    System.out.println("\n=== LIBROS DE GABRIEL GARCÍA MÁRQUEZ ===");
    buscarPorAutor(biblioteca, "Gabriel García Márquez");
  }

  // ===== MÉTODOS AUXILIARES =====

  /**
   * Cuenta cuántos libros están disponibles
   */
  public static int contarDisponibles(Libro[] libros) {
    int contador = 0;
    for (int i = 0; i < libros.length; i++) {
      if (libros[i].disponible) {
        contador++;
      }
    }
    return contador;
  }

  /**
   * Encuentra el libro más antiguo (menor año de publicación)
   */
  public static Libro encontrarMasAntiguo(Libro[] libros) {
    Libro masAntiguo = libros[0];
    for (int i = 1; i < libros.length; i++) {
      if (libros[i].anioPublicacion < masAntiguo.anioPublicacion) {
        masAntiguo = libros[i];
      }
    }
    return masAntiguo;
  }

  /**
   * Encuentra el libro más nuevo (mayor año de publicación)
   */
  public static Libro encontrarMasNuevo(Libro[] libros) {
    Libro masNuevo = libros[0];
    for (int i = 1; i < libros.length; i++) {
      if (libros[i].anioPublicacion > masNuevo.anioPublicacion) {
        masNuevo = libros[i];
      }
    }
    return masNuevo;
  }

  /**
   * Cuenta cuántos libros son voluminosos
   */
  public static int contarVoluminosos(Libro[] libros) {
    int contador = 0;
    for (int i = 0; i < libros.length; i++) {
      if (libros[i].esVoluminoso()) {
        contador++;
      }
    }
    return contador;
  }

  /**
   * Calcula el promedio de páginas de todos los libros
   */
  public static double calcularPromedioPaginas(Libro[] libros) {
    int totalPaginas = 0;
    for (int i = 0; i < libros.length; i++) {
      totalPaginas += libros[i].numeroPaginas;
    }
    return (double) totalPaginas / libros.length;
  }

  /**
   * Lista todos los libros voluminosos
   */
  public static void listarVoluminosos(Libro[] libros) {
    for (int i = 0; i < libros.length; i++) {
      if (libros[i].esVoluminoso()) {
        System.out.println("- " + libros[i].titulo + " (" + libros[i].numeroPaginas + " páginas)");
      }
    }
  }

  /**
   * Busca y muestra todos los libros de un autor específico
   */
  public static void buscarPorAutor(Libro[] libros, String autor) {
    boolean encontrado = false;
    for (int i = 0; i < libros.length; i++) {
      if (libros[i].autor.equals(autor)) {
        System.out.println("- " + libros[i].titulo + " (" + libros[i].anioPublicacion + ")");
        encontrado = true;
      }
    }
    if (!encontrado) {
      System.out.println("No se encontraron libros de " + autor);
    }
  }
}
