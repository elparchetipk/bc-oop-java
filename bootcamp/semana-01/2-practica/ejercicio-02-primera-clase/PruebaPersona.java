/**
 * Clase de prueba para la clase Persona
 * 
 * Esta clase demuestra cómo crear objetos de la clase Persona
 * y cómo usar sus métodos.
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class PruebaPersona {

  public static void main(String[] args) {
    System.out.println("╔════════════════════════════════════════════╗");
    System.out.println("║  EJERCICIO 02: PRIMERA CLASE - PERSONA     ║");
    System.out.println("╚════════════════════════════════════════════╝\n");

    // ===== CREAR PRIMER OBJETO =====
    System.out.println(">>> Creando primera persona...\n");

    Persona persona1 = new Persona();

    // Asignar valores a los atributos
    persona1.nombre = "Juan Pérez";
    persona1.edad = 25;
    persona1.profesion = "Desarrollador de Software";
    persona1.ciudad = "Bogotá";

    // Usar métodos del objeto
    persona1.saludar();
    persona1.presentarse();

    // Probar otros métodos
    System.out.println(">>> Probando métodos adicionales...\n");

    int anioNacimiento = persona1.calcularAnioNacimiento();
    System.out.println("📅 " + persona1.nombre + " nació aproximadamente en: " + anioNacimiento);

    boolean mayorEdad = persona1.esMayorDeEdad();
    System.out.println("🔞 ¿Es mayor de edad? " + (mayorEdad ? "Sí" : "No"));

    System.out.println();
    persona1.cumplirAnios();

    System.out.println();
    persona1.cambiarCiudad("Medellín");

    // ===== CREAR SEGUNDO OBJETO =====
    System.out.println("\n\n>>> Creando segunda persona...\n");

    Persona persona2 = new Persona();
    persona2.nombre = "María García";
    persona2.edad = 30;
    persona2.profesion = "Diseñadora Gráfica";
    persona2.ciudad = "Cali";

    persona2.saludar();
    persona2.presentarse();

    // ===== COMPARAR OBJETOS =====
    System.out.println(">>> Comparando personas...\n");

    if (persona2.esMayorQue(persona1)) {
      System.out.println("✓ " + persona2.nombre + " es mayor que " + persona1.nombre);
    } else {
      System.out.println("✓ " + persona1.nombre + " es mayor que " + persona2.nombre);
    }

    // ===== CREAR TERCER OBJETO =====
    System.out.println("\n\n>>> Creando tercera persona...\n");

    Persona persona3 = new Persona();
    persona3.nombre = "Pedro Rodríguez";
    persona3.edad = 17;
    persona3.profesion = "Estudiante";
    persona3.ciudad = "Cartagena";

    persona3.presentarse();

    if (persona3.esMayorDeEdad()) {
      System.out.println("✓ " + persona3.nombre + " puede votar");
    } else {
      System.out.println("✗ " + persona3.nombre + " aún no puede votar (menor de edad)");
    }

    // ===== RESUMEN FINAL =====
    System.out.println("\n\n╔════════════════════════════════════════════╗");
    System.out.println("║           RESUMEN DE PERSONAS              ║");
    System.out.println("╚════════════════════════════════════════════╝\n");

    System.out.println("Total de personas creadas: 3");
    System.out.println("1. " + persona1.nombre + " - " + persona1.edad + " años - " + persona1.ciudad);
    System.out.println("2. " + persona2.nombre + " - " + persona2.edad + " años - " + persona2.ciudad);
    System.out.println("3. " + persona3.nombre + " - " + persona3.edad + " años - " + persona3.ciudad);

    System.out.println("\n✓ Ejercicio completado exitosamente.");
  }
}
