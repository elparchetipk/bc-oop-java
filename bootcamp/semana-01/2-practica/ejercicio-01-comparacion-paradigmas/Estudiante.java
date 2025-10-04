/**
 * Ejercicio 01 - Clase Estudiante (Enfoque POO)
 * 
 * Esta clase representa un estudiante con sus datos académicos.
 * Demuestra el enfoque orientado a objetos para gestionar información.
 * 
 * Características:
 * - Atributos encapsulados (datos dentro del objeto)
 * - Métodos que operan sobre los datos del objeto
 * - Cada objeto es independiente
 * - Fácil crear múltiples estudiantes
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class Estudiante {

  // ===== ATRIBUTOS =====
  // Datos encapsulados dentro del objeto
  String nombre;
  String codigo;
  double nota1;
  double nota2;
  double nota3;

  // ===== MÉTODOS =====

  /**
   * Calcula el promedio de las tres notas
   * 
   * @return promedio de notas
   */
  public double calcularPromedio() {
    return (nota1 + nota2 + nota3) / 3.0;
  }

  /**
   * Determina si el estudiante aprobó
   * 
   * @return true si el promedio es >= 3.0, false en caso contrario
   */
  public boolean aprobo() {
    return calcularPromedio() >= 3.0;
  }

  /**
   * Muestra toda la información del estudiante
   */
  public void mostrarInformacion() {
    System.out.println("═══════════════════════════════");
    System.out.println("INFORMACIÓN DEL ESTUDIANTE");
    System.out.println("═══════════════════════════════");
    System.out.println("Nombre:   " + nombre);
    System.out.println("Código:   " + codigo);
    System.out.println("Nota 1:   " + nota1);
    System.out.println("Nota 2:   " + nota2);
    System.out.println("Nota 3:   " + nota3);
    System.out.printf("Promedio: %.2f%n", calcularPromedio());
    System.out.println("Estado:   " + (aprobo() ? "APROBADO" : "REPROBADO"));
    System.out.println("═══════════════════════════════");
  }

  /**
   * Compara el promedio con otro estudiante
   * 
   * @param otro estudiante a comparar
   * @return true si este estudiante tiene mejor promedio
   */
  public boolean tieneMejorPromedioQue(Estudiante otro) {
    return this.calcularPromedio() > otro.calcularPromedio();
  }
}
