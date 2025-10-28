/**
 * Clase que representa a una persona con información básica
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class Persona {
  // ===== ATRIBUTOS =====
  String nombre;
  int edad;
  String ciudad;

  // ===== MÉTODOS =====

  /**
   * Método que imprime un saludo personalizado
   */
  public void saludar() {
    System.out.println("¡Hola! Mi nombre es " + nombre);
  }

  /**
   * Método que muestra toda la información de la persona
   */
  public void mostrarInfo() {
    System.out.println("========== INFORMACIÓN PERSONAL ==========");
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Ciudad: " + ciudad);
    System.out.println("==========================================");
  }
}
