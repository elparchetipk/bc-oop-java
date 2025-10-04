/**
 * Clase Libro - Gestión de biblioteca
 * 
 * Esta clase representa un libro con sus características y permite
 * gestionar su disponibilidad para préstamo.
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class Libro {
  // ===== ATRIBUTOS =====
  String titulo;
  String autor;
  String isbn;
  int numeroPaginas;
  int anioPublicacion;
  String editorial;
  boolean disponible;
  String prestadoA; // Nombre de quien tiene el libro

  // ===== MÉTODOS =====

  /**
   * Muestra la información completa del libro
   */
  public void mostrarInformacion() {
    System.out.println("\n╔═══════════════════════════════════════════════╗");
    System.out.println("║           INFORMACIÓN DEL LIBRO               ║");
    System.out.println("╠═══════════════════════════════════════════════╣");
    System.out.println("║ Título:       " + titulo);
    System.out.println("║ Autor:        " + autor);
    System.out.println("║ ISBN:         " + isbn);
    System.out.println("║ Páginas:      " + numeroPaginas);
    System.out.println("║ Año:          " + anioPublicacion);
    System.out.println("║ Editorial:    " + editorial);
    System.out.println("║ Estado:       " + (disponible ? "✓ Disponible" : "✗ Prestado"));
    if (!disponible && prestadoA != null) {
      System.out.println("║ Prestado a:   " + prestadoA);
    }
    System.out.println("╚═══════════════════════════════════════════════╝");
  }

  /**
   * Muestra información resumida del libro en una línea
   */
  public void mostrarResumen() {
    String estado = disponible ? "[DISPONIBLE]" : "[PRESTADO]";
    System.out.println(estado + " \"" + titulo + "\" - " + autor + " (" + anioPublicacion + ")");
  }

  /**
   * Presta el libro a una persona
   * 
   * @param nombrePersona nombre de quien solicita el libro
   * @return true si se prestó exitosamente, false si no estaba disponible
   */
  public boolean prestar(String nombrePersona) {
    if (disponible) {
      disponible = false;
      prestadoA = nombrePersona;
      System.out.println("📚 Libro prestado a " + nombrePersona);
      System.out.println("   \"" + titulo + "\" - " + autor);
      return true;
    } else {
      System.out.println("❌ El libro no está disponible.");
      System.out.println("   Actualmente prestado a: " + prestadoA);
      return false;
    }
  }

  /**
   * Devuelve el libro a la biblioteca
   * 
   * @return true si se devolvió exitosamente, false si no estaba prestado
   */
  public boolean devolver() {
    if (!disponible) {
      System.out.println("📥 Libro devuelto por " + prestadoA);
      System.out.println("   \"" + titulo + "\" ahora está disponible.");
      disponible = true;
      prestadoA = null;
      return true;
    } else {
      System.out.println("⚠️  El libro no estaba prestado.");
      return false;
    }
  }

  /**
   * Verifica si el libro es voluminoso (más de 500 páginas)
   * 
   * @return true si tiene más de 500 páginas, false en caso contrario
   */
  public boolean esVoluminoso() {
    return numeroPaginas > 500;
  }

  /**
   * Verifica si el libro es antiguo (más de 50 años)
   * 
   * @return true si tiene más de 50 años, false en caso contrario
   */
  public boolean esAntiguo() {
    int anioActual = 2025;
    return (anioActual - anioPublicacion) > 50;
  }

  /**
   * Calcula cuántos años tiene el libro
   * 
   * @return edad del libro en años
   */
  public int calcularEdad() {
    int anioActual = 2025;
    return anioActual - anioPublicacion;
  }

  /**
   * Compara si este libro tiene más páginas que otro
   * 
   * @param otroLibro libro con el que se comparará
   * @return true si este libro tiene más páginas, false en caso contrario
   */
  public boolean tieneMasPaginasQue(Libro otroLibro) {
    return this.numeroPaginas > otroLibro.numeroPaginas;
  }

  /**
   * Verifica si este libro es del mismo autor que otro
   * 
   * @param otroLibro libro con el que se comparará el autor
   * @return true si tienen el mismo autor, false en caso contrario
   */
  public boolean esMismoAutorQue(Libro otroLibro) {
    return this.autor.equalsIgnoreCase(otroLibro.autor);
  }
}
