/**
 * Clase principal para probar la clase Persona
 * 
 * @author SENA - Bootcamp POO Java
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 01 - Primera Clase Básica ===\n");
        
        // Crear primer objeto Persona
        Persona p1 = new Persona();
        p1.nombre = "Juan Pérez";
        p1.edad = 25;
        p1.ciudad = "Bogotá";
        
        // Usar los métodos de p1
        p1.saludar();
        p1.mostrarInfo();
        
        System.out.println("\n--- Segunda Persona ---\n");
        
        // Crear segundo objeto Persona
        Persona p2 = new Persona();
        p2.nombre = "María González";
        p2.edad = 30;
        p2.ciudad = "Medellín";
        
        // Usar los métodos de p2
        p2.saludar();
        p2.mostrarInfo();
        
        System.out.println("\n--- Tercera Persona ---\n");
        
        // Crear tercer objeto Persona
        Persona p3 = new Persona();
        p3.nombre = "Carlos López";
        p3.edad = 22;
        p3.ciudad = "Cali";
        
        // Usar los métodos de p3
        p3.saludar();
        p3.mostrarInfo();
    }
}
