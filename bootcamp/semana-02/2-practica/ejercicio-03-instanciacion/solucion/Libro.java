/**
 * Clase que representa un libro con información completa
 * Demuestra el concepto de instanciación y constructores
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class Libro {
  // ===== ATRIBUTOS =====
  String titulo;
  String autor;
  int numeroPaginas;
  int anioPublicacion;
  boolean disponible;

  // ===== CONSTRUCTOR =====
  /**
   * Constructor que inicializa un libro con todos sus datos
   * Por defecto, el libro está disponible
   * 
   * @param titulo          Título del libro
   * @param autor           Autor del libro
   * @param numeroPaginas   Cantidad de páginas
   * @param anioPublicacion Año de publicación
   */
  public Libro(String titulo, String autor, int numeroPaginas, int anioPublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
    this.anioPublicacion = anioPublicacion;
    this.disponible = true; // Por defecto disponible
  }

  // ===== MÉTODOS =====

  /**
   * Muestra la información completa del libro
   */
  public void mostrarInfo() {
    System.out.println("📖 " + titulo);
    System.out.println("   Autor: " + autor);
    System.out.println("   Páginas: " + numeroPaginas);
    System.out.println("   Año: " + anioPublicacion);
    System.out.println("   Estado: " + (disponible ? "✓ Disponible" : "✗ Prestado"));
    System.out.println("   Voluminoso: " + (esVoluminoso() ? "Sí" : "No"));
    System.out.println();
  }

  /**
   * Marca el libro como prestado
   * 
   * @return true si se prestó exitosamente, false si ya estaba prestado
   */
  public boolean prestar() {
    if (disponible) {
      disponible = false;
      return true;
    } else {
      return false;
    }
  }

  /**
   * Marca el libro como devuelto
   * 
   * @return true si se devolvió exitosamente, false si ya estaba disponible
   */
  public boolean devolver() {
    if (!disponible) {
      disponible = true;
      return true;
    } else {
      return false;
    }
  }

  /**
   * Verifica si el libro es voluminoso (más de 500 páginas)
   * 
   * @return true si tiene más de 500 páginas
   */
  public boolean esVoluminoso() {
    return numeroPaginas > 500;
  }
}
