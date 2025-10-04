/**
 * Clase Persona - Primera clase POO
 * 
 * Esta clase representa una persona con sus características básicas.
 * Es un ejemplo introductorio de cómo crear una clase en Java.
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class Persona {
  // ===== ATRIBUTOS =====
  // Características de una persona
  String nombre;
  int edad;
  String profesion;
  String ciudad;

  // ===== MÉTODOS =====

  /**
   * Muestra un saludo personalizado de la persona
   */
  public void saludar() {
    System.out.println("¡Hola! Mi nombre es " + nombre);
    System.out.println("Es un placer conocerte.");
  }

  /**
   * Muestra la presentación completa de la persona
   */
  public void presentarse() {
    System.out.println("\n════════════════════════════════");
    System.out.println("       PRESENTACIÓN");
    System.out.println("════════════════════════════════");
    System.out.println("Nombre:    " + nombre);
    System.out.println("Edad:      " + edad + " años");
    System.out.println("Profesión: " + profesion);
    System.out.println("Ciudad:    " + ciudad);
    System.out.println("════════════════════════════════\n");
  }

  /**
   * Calcula y retorna el año aproximado de nacimiento
   * 
   * @return año de nacimiento (aproximado)
   */
  public int calcularAnioNacimiento() {
    int anioActual = 2025;
    return anioActual - edad;
  }

  /**
   * Verifica si la persona es mayor de edad
   * 
   * @return true si tiene 18 años o más, false en caso contrario
   */
  public boolean esMayorDeEdad() {
    return edad >= 18;
  }

  /**
   * Simula el cumpleaños de la persona (incrementa la edad)
   */
  public void cumplirAnios() {
    edad++;
    System.out.println("¡Feliz cumpleaños " + nombre + "!");
    System.out.println("Ahora tienes " + edad + " años.");
  }

  /**
   * Cambia la ciudad de residencia
   * 
   * @param nuevaCiudad nueva ciudad donde vivirá la persona
   */
  public void cambiarCiudad(String nuevaCiudad) {
    String ciudadAnterior = ciudad;
    ciudad = nuevaCiudad;
    System.out.println(nombre + " se mudó de " + ciudadAnterior + " a " + nuevaCiudad);
  }

  /**
   * Compara la edad con otra persona
   * 
   * @param otraPersona persona con la que se comparará la edad
   * @return true si esta persona es mayor, false en caso contrario
   */
  public boolean esMayorQue(Persona otraPersona) {
    return this.edad > otraPersona.edad;
  }
}
