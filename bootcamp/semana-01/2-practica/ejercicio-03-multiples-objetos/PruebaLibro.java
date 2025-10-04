/**
 * Clase de prueba para la clase Libro
 * 
 * Esta clase demuestra cómo trabajar con múltiples objetos
 * de la misma clase y gestionar una pequeña biblioteca.
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class PruebaLibro {

  public static void main(String[] args) {
    System.out.println("╔═══════════════════════════════════════════════════╗");
    System.out.println("║   EJERCICIO 03: MÚLTIPLES OBJETOS - BIBLIOTECA   ║");
    System.out.println("╚═══════════════════════════════════════════════════╝\n");

    // ===== CREAR BIBLIOTECA CON 5 LIBROS =====
    System.out.println(">>> Creando biblioteca con 5 libros...\n");

    // Libro 1: Don Quijote de la Mancha
    Libro libro1 = new Libro();
    libro1.titulo = "Don Quijote de la Mancha";
    libro1.autor = "Miguel de Cervantes";
    libro1.isbn = "978-84-376-0494-7";
    libro1.numeroPaginas = 863;
    libro1.anioPublicacion = 1605;
    libro1.editorial = "Francisco de Robles";
    libro1.disponible = true;

    // Libro 2: Cien Años de Soledad
    Libro libro2 = new Libro();
    libro2.titulo = "Cien Años de Soledad";
    libro2.autor = "Gabriel García Márquez";
    libro2.isbn = "978-84-376-0494-8";
    libro2.numeroPaginas = 471;
    libro2.anioPublicacion = 1967;
    libro2.editorial = "Sudamericana";
    libro2.disponible = true;

    // Libro 3: El Principito
    Libro libro3 = new Libro();
    libro3.titulo = "El Principito";
    libro3.autor = "Antoine de Saint-Exupéry";
    libro3.isbn = "978-84-376-0494-9";
    libro3.numeroPaginas = 96;
    libro3.anioPublicacion = 1943;
    libro3.editorial = "Reynal & Hitchcock";
    libro3.disponible = true;

    // Libro 4: 1984
    Libro libro4 = new Libro();
    libro4.titulo = "1984";
    libro4.autor = "George Orwell";
    libro4.isbn = "978-84-376-0495-0";
    libro4.numeroPaginas = 328;
    libro4.anioPublicacion = 1949;
    libro4.editorial = "Secker & Warburg";
    libro4.disponible = true;

    // Libro 5: El Amor en los Tiempos del Cólera
    Libro libro5 = new Libro();
    libro5.titulo = "El Amor en los Tiempos del Cólera";
    libro5.autor = "Gabriel García Márquez";
    libro5.isbn = "978-84-376-0495-1";
    libro5.numeroPaginas = 464;
    libro5.anioPublicacion = 1985;
    libro5.editorial = "Oveja Negra";
    libro5.disponible = true;

    // ===== MOSTRAR CATÁLOGO =====
    System.out.println("═══════════════════════════════════════════════");
    System.out.println("           CATÁLOGO DE LA BIBLIOTECA");
    System.out.println("═══════════════════════════════════════════════\n");

    libro1.mostrarResumen();
    libro2.mostrarResumen();
    libro3.mostrarResumen();
    libro4.mostrarResumen();
    libro5.mostrarResumen();

    // ===== SIMULAR PRÉSTAMOS =====
    System.out.println("\n\n>>> Simulando préstamos...\n");

    libro1.prestar("Juan Pérez");
    System.out.println();

    libro3.prestar("María García");
    System.out.println();

    libro2.prestar("Pedro Rodríguez");
    System.out.println();

    // Intentar prestar un libro ya prestado
    System.out.println("\n>>> Intentando prestar libro ya prestado...\n");
    libro1.prestar("Ana López");

    // ===== MOSTRAR ESTADO ACTUAL =====
    System.out.println("\n\n═══════════════════════════════════════════════");
    System.out.println("         ESTADO ACTUAL DE LA BIBLIOTECA");
    System.out.println("═══════════════════════════════════════════════\n");

    libro1.mostrarResumen();
    libro2.mostrarResumen();
    libro3.mostrarResumen();
    libro4.mostrarResumen();
    libro5.mostrarResumen();

    // ===== DEVOLUCIONES =====
    System.out.println("\n\n>>> Procesando devoluciones...\n");

    libro1.devolver();
    System.out.println();

    libro3.devolver();

    // ===== CONSULTAS AVANZADAS =====
    System.out.println("\n\n>>> Consultas sobre los libros...\n");

    // Libros voluminosos
    System.out.println("📖 LIBROS VOLUMINOSOS (> 500 páginas):");
    if (libro1.esVoluminoso()) {
      System.out.println("   - " + libro1.titulo + " (" + libro1.numeroPaginas + " págs)");
    }
    if (libro2.esVoluminoso()) {
      System.out.println("   - " + libro2.titulo + " (" + libro2.numeroPaginas + " págs)");
    }
    if (libro3.esVoluminoso()) {
      System.out.println("   - " + libro3.titulo + " (" + libro3.numeroPaginas + " págs)");
    }
    if (libro4.esVoluminoso()) {
      System.out.println("   - " + libro4.titulo + " (" + libro4.numeroPaginas + " págs)");
    }
    if (libro5.esVoluminoso()) {
      System.out.println("   - " + libro5.titulo + " (" + libro5.numeroPaginas + " págs)");
    }

    // Libros antiguos
    System.out.println("\n📜 LIBROS ANTIGUOS (> 50 años):");
    if (libro1.esAntiguo()) {
      System.out.println("   - " + libro1.titulo + " (" + libro1.calcularEdad() + " años)");
    }
    if (libro2.esAntiguo()) {
      System.out.println("   - " + libro2.titulo + " (" + libro2.calcularEdad() + " años)");
    }
    if (libro3.esAntiguo()) {
      System.out.println("   - " + libro3.titulo + " (" + libro3.calcularEdad() + " años)");
    }
    if (libro4.esAntiguo()) {
      System.out.println("   - " + libro4.titulo + " (" + libro4.calcularEdad() + " años)");
    }
    if (libro5.esAntiguo()) {
      System.out.println("   - " + libro5.titulo + " (" + libro5.calcularEdad() + " años)");
    }

    // Comparaciones
    System.out.println("\n📊 COMPARACIONES:");

    if (libro1.tieneMasPaginasQue(libro2)) {
      System.out.println("   ✓ \"" + libro1.titulo + "\" tiene más páginas que \"" + libro2.titulo + "\"");
    }

    if (libro2.esMismoAutorQue(libro5)) {
      System.out.println("   ✓ \"" + libro2.titulo + "\" y \"" + libro5.titulo + "\" son del mismo autor");
      System.out.println("     Autor: " + libro2.autor);
    }

    // ===== MOSTRAR DETALLE DE UN LIBRO =====
    System.out.println("\n\n>>> Mostrando detalle completo de un libro...");
    libro2.mostrarInformacion();

    // ===== ESTADÍSTICAS FINALES =====
    System.out.println("\n\n╔═══════════════════════════════════════════════╗");
    System.out.println("║          ESTADÍSTICAS DE LA BIBLIOTECA        ║");
    System.out.println("╚═══════════════════════════════════════════════╝\n");

    int disponibles = 0;
    int prestados = 0;
    int totalPaginas = 0;

    if (libro1.disponible)
      disponibles++;
    else
      prestados++;
    if (libro2.disponible)
      disponibles++;
    else
      prestados++;
    if (libro3.disponible)
      disponibles++;
    else
      prestados++;
    if (libro4.disponible)
      disponibles++;
    else
      prestados++;
    if (libro5.disponible)
      disponibles++;
    else
      prestados++;

    totalPaginas = libro1.numeroPaginas + libro2.numeroPaginas + libro3.numeroPaginas +
        libro4.numeroPaginas + libro5.numeroPaginas;

    System.out.println("Total de libros:        5");
    System.out.println("Libros disponibles:     " + disponibles);
    System.out.println("Libros prestados:       " + prestados);
    System.out.println("Total de páginas:       " + totalPaginas);
    System.out.println("Promedio páginas/libro: " + (totalPaginas / 5));

    System.out.println("\n✓ Ejercicio completado exitosamente.");
  }
}
