/**
 * Ejercicio 01 - Prueba de la Clase Estudiante (Enfoque POO)
 * 
 * Programa que demuestra el uso de la clase Estudiante.
 * Muestra las ventajas de POO sobre programación estructurada.
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class PruebaEstudiante {

  public static void main(String[] args) {
    System.out.println("=== ENFOQUE POO ===\n");

    // Crear primer estudiante (objeto)
    Estudiante estudiante1 = new Estudiante();
    estudiante1.nombre = "Juan Pérez";
    estudiante1.codigo = "2025001";
    estudiante1.nota1 = 4.5;
    estudiante1.nota2 = 4.0;
    estudiante1.nota3 = 4.2;

    // Mostrar información
    estudiante1.mostrarInformacion();

    System.out.println("\n--- VENTAJA DE POO: Múltiples Objetos Fácilmente ---\n");

    // Crear segundo estudiante (independiente del primero)
    Estudiante estudiante2 = new Estudiante();
    estudiante2.nombre = "María García";
    estudiante2.codigo = "2025002";
    estudiante2.nota1 = 3.8;
    estudiante2.nota2 = 4.2;
    estudiante2.nota3 = 3.5;

    estudiante2.mostrarInformacion();

    // Crear tercer estudiante
    Estudiante estudiante3 = new Estudiante();
    estudiante3.nombre = "Pedro Martínez";
    estudiante3.codigo = "2025003";
    estudiante3.nota1 = 2.5;
    estudiante3.nota2 = 2.8;
    estudiante3.nota3 = 3.0;

    estudiante3.mostrarInformacion();

    System.out.println("\n--- Comparaciones ---\n");

    // Comparar estudiantes
    if (estudiante1.tieneMejorPromedioQue(estudiante2)) {
      System.out.println(estudiante1.nombre + " tiene mejor promedio que " + estudiante2.nombre);
    } else {
      System.out.println(estudiante2.nombre + " tiene mejor promedio que " + estudiante1.nombre);
    }

    if (estudiante2.tieneMejorPromedioQue(estudiante3)) {
      System.out.println(estudiante2.nombre + " tiene mejor promedio que " + estudiante3.nombre);
    } else {
      System.out.println(estudiante3.nombre + " tiene mejor promedio que " + estudiante2.nombre);
    }

    /*
     * ANÁLISIS COMPARATIVO:
     * 
     * 1. ¿Cuál enfoque es más fácil de entender?
     * - POO: MÁS INTUITIVO
     * - Modela el mundo real: "Un estudiante tiene nombre, notas..."
     * - Los datos y comportamientos están juntos
     * - Fácil de explicar a no programadores
     * 
     * 2. ¿Cuál permite manejar múltiples estudiantes más fácilmente?
     * - POO: EXTREMADAMENTE FÁCIL
     * - Simplemente creas más objetos: new Estudiante()
     * - Cada objeto es independiente
     * - No hay límite práctico de estudiantes
     * 
     * 3. ¿Cuál es más escalable para un sistema grande?
     * - POO: MUY ESCALABLE
     * - Código organizado en clases
     * - Datos encapsulados y protegidos
     * - Fácil agregar nuevas funcionalidades (herencia)
     * - Equipo grande puede trabajar en clases separadas
     * 
     * VENTAJAS CLAVE DE POO:
     * ✅ Múltiples objetos sin complejidad adicional
     * ✅ Cada objeto mantiene su propio estado
     * ✅ Código reutilizable y extensible
     * ✅ Modelado natural del dominio del problema
     * 
     * CONCLUSIÓN:
     * Para este problema simple, ambos enfoques funcionan.
     * Pero para sistemas reales con muchas entidades,
     * POO es claramente superior.
     */
  }
}
