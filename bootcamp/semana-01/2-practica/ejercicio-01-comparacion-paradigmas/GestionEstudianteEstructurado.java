/**
 * Ejercicio 01 - Gestión de Estudiante (Enfoque Estructurado)
 * 
 * Este programa demuestra el enfoque estructurado para gestionar
 * información de un estudiante.
 * 
 * Características:
 * - Variables globales para almacenar datos
 * - Funciones estáticas para procesar datos
 * - Limitado a un solo estudiante fácilmente
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class GestionEstudianteEstructurado {

  // ===== VARIABLES GLOBALES =====
  static String nombre;
  static String codigo;
  static double nota1;
  static double nota2;
  static double nota3;

  // ===== FUNCIONES =====

  /**
   * Calcula el promedio de las tres notas
   * 
   * @return promedio de notas
   */
  static double calcularPromedio() {
    return (nota1 + nota2 + nota3) / 3.0;
  }

  /**
   * Determina si el estudiante aprobó
   * 
   * @return true si el promedio es >= 3.0, false en caso contrario
   */
  static boolean aprobo() {
    return calcularPromedio() >= 3.0;
  }

  /**
   * Muestra toda la información del estudiante
   */
  static void mostrarInformacion() {
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
   * Programa principal
   */
  public static void main(String[] args) {
    System.out.println("=== ENFOQUE ESTRUCTURADO ===\n");

    // Inicializar datos del estudiante
    nombre = "Juan Pérez";
    codigo = "2025001";
    nota1 = 4.5;
    nota2 = 4.0;
    nota3 = 4.2;

    // Mostrar información
    mostrarInformacion();

    /*
     * ANÁLISIS COMPARATIVO:
     * 
     * 1. ¿Cuál enfoque es más fácil de entender?
     * - Para programas muy simples, este enfoque puede parecer más directo.
     * - Sin embargo, la estructura global hace difícil entender el alcance
     * de las variables.
     * 
     * 2. ¿Cuál permite manejar múltiples estudiantes más fácilmente?
     * - Estructurado: MUY DIFÍCIL
     * - Necesitarías múltiples variables: nombre1, nombre2, nombre3...
     * - O arrays paralelos: nombres[], codigos[], notas1[]...
     * - Código rápidamente se vuelve inmanejable
     * 
     * 3. ¿Cuál es más escalable para un sistema grande?
     * - Estructurado: NO ESCALABLE
     * - Variables globales accesibles desde cualquier parte
     * - Difícil saber quién modifica qué
     * - Propenso a errores en equipos grandes
     * 
     * PROBLEMA REAL:
     * ¿Cómo manejamos 100 estudiantes con este enfoque?
     * → Necesitaríamos 500 variables globales (5 datos × 100 estudiantes)
     * → O arrays paralelos complejos y propensos a errores
     * → POO resuelve esto con objetos independientes
     */
  }
}
