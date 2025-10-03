import java.util.Scanner;

/**
 * Sistema de Gestión Estudiantil
 * 
 * Proyecto integrador que combina todos los conceptos de la Semana 0:
 * - Variables y tipos de datos
 * - Operadores
 * - Estructuras de control
 * - Arrays
 * - Métodos
 * 
 * @author [Tu Nombre Completo]
 * @version 1.0
 * @since 2025
 */
public class SistemaGestion {

  // ==================== CONSTANTES ====================
  static final int MAX_ESTUDIANTES = 50;
  static final int NUM_MATERIAS = 5;
  static final double NOTA_APROBATORIA = 60.0;

  // ==================== VARIABLES GLOBALES ====================
  // Arrays para estudiantes
  static String[] nombresEstudiantes = new String[MAX_ESTUDIANTES];
  static int[] edadesEstudiantes = new int[MAX_ESTUDIANTES];
  static String[] idsEstudiantes = new String[MAX_ESTUDIANTES];
  static int totalEstudiantes = 0;

  // Matriz de calificaciones [estudiante][materia]
  static double[][] calificaciones = new double[MAX_ESTUDIANTES][NUM_MATERIAS];

  // Nombres de materias
  static String[] nombresMaterias = {
      "Matemáticas",
      "Física",
      "Programación",
      "Inglés",
      "Base de Datos"
  };

  // Scanner global
  static Scanner sc = new Scanner(System.in);

  // ==================== MÉTODO PRINCIPAL ====================
  /**
   * Método principal del programa
   */
  public static void main(String[] args) {
    inicializarDatos();
    menuPrincipal();
  }

  // ==================== INICIALIZACIÓN ====================
  /**
   * Inicializa las calificaciones en -1 (sin calificar)
   */
  public static void inicializarDatos() {
    for (int i = 0; i < MAX_ESTUDIANTES; i++) {
      for (int j = 0; j < NUM_MATERIAS; j++) {
        calificaciones[i][j] = -1; // -1 indica no calificado
      }
    }
  }

  // ==================== MENÚS ====================
  /**
   * Menú principal del sistema
   */
  public static void menuPrincipal() {
    int opcion;

    do {
      mostrarEncabezado();
      System.out.println("=== MENÚ PRINCIPAL ===");
      System.out.println("1. Gestión de Estudiantes");
      System.out.println("2. Gestión de Calificaciones");
      System.out.println("3. Estadísticas y Reportes");
      System.out.println("4. Acerca de");
      System.out.println("0. Salir");
      System.out.print("\nOpción: ");

      opcion = sc.nextInt();
      sc.nextLine(); // Limpiar buffer

      switch (opcion) {
        case 1:
          menuEstudiantes();
          break;
        case 2:
          menuCalificaciones();
          break;
        case 3:
          menuEstadisticas();
          break;
        case 4:
          mostrarAcercaDe();
          break;
        case 0:
          System.out.println("\n¡Gracias por usar el sistema!");
          break;
        default:
          System.out.println("✗ Opción inválida");
      }

      if (opcion != 0) {
        pausar();
      }

    } while (opcion != 0);
  }

  /**
   * Menú de gestión de estudiantes
   */
  public static void menuEstudiantes() {
    int opcion;

    do {
      limpiarPantalla();
      System.out.println("=== GESTIÓN DE ESTUDIANTES ===");
      System.out.println("1. Registrar nuevo estudiante");
      System.out.println("2. Buscar estudiante");
      System.out.println("3. Listar todos los estudiantes");
      System.out.println("4. Actualizar estudiante");
      System.out.println("5. Eliminar estudiante");
      System.out.println("0. Volver");
      System.out.print("\nOpción: ");

      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1:
          registrarEstudiante();
          break;
        case 2:
          buscarEstudianteMenu();
          break;
        case 3:
          listarEstudiantes();
          break;
        case 4:
          actualizarEstudianteMenu();
          break;
        case 5:
          eliminarEstudianteMenu();
          break;
        case 0:
          break;
        default:
          System.out.println("✗ Opción inválida");
      }

      if (opcion != 0) {
        pausar();
      }

    } while (opcion != 0);
  }

  /**
   * Menú de gestión de calificaciones
   */
  public static void menuCalificaciones() {
    int opcion;

    do {
      limpiarPantalla();
      System.out.println("=== GESTIÓN DE CALIFICACIONES ===");
      System.out.println("1. Registrar calificación");
      System.out.println("2. Ver calificaciones de estudiante");
      System.out.println("3. Promedio por estudiante");
      System.out.println("4. Promedio por materia");
      System.out.println("0. Volver");
      System.out.print("\nOpción: ");

      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1:
          registrarCalificacionMenu();
          break;
        case 2:
          verCalificacionesEstudianteMenu();
          break;
        case 3:
          calcularPromedioEstudianteMenu();
          break;
        case 4:
          calcularPromedioMateriaMenu();
          break;
        case 0:
          break;
        default:
          System.out.println("✗ Opción inválida");
      }

      if (opcion != 0) {
        pausar();
      }

    } while (opcion != 0);
  }

  /**
   * Menú de estadísticas y reportes
   */
  public static void menuEstadisticas() {
    int opcion;

    do {
      limpiarPantalla();
      System.out.println("=== ESTADÍSTICAS Y REPORTES ===");
      System.out.println("1. Mejor estudiante");
      System.out.println("2. Estudiantes aprobados/reprobados");
      System.out.println("3. Ranking de estudiantes");
      System.out.println("4. Materia más difícil");
      System.out.println("5. Reporte completo");
      System.out.println("0. Volver");
      System.out.print("\nOpción: ");

      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1:
          mostrarMejorEstudiante();
          break;
        case 2:
          mostrarAprobadosReprobados();
          break;
        case 3:
          mostrarRanking();
          break;
        case 4:
          mostrarMateriaMasDificil();
          break;
        case 5:
          generarReporteCompleto();
          break;
        case 0:
          break;
        default:
          System.out.println("✗ Opción inválida");
      }

      if (opcion != 0) {
        pausar();
      }

    } while (opcion != 0);
  }

  // ==================== GESTIÓN DE ESTUDIANTES ====================

  /**
   * Registra un nuevo estudiante en el sistema
   */
  public static void registrarEstudiante() {
    System.out.println("\n--- REGISTRO DE ESTUDIANTE ---");

    // Verificar capacidad
    if (totalEstudiantes >= MAX_ESTUDIANTES) {
      System.out.println("✗ Error: Capacidad máxima alcanzada");
      return;
    }

    // TODO: Solicitar y validar nombre
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    // TODO: Solicitar y validar edad
    System.out.print("Edad: ");
    int edad = sc.nextInt();
    sc.nextLine();

    // TODO: Solicitar y validar ID
    System.out.print("ID: ");
    String id = sc.nextLine();

    // TODO: Verificar que ID sea único

    // TODO: Guardar datos
    nombresEstudiantes[totalEstudiantes] = nombre;
    edadesEstudiantes[totalEstudiantes] = edad;
    idsEstudiantes[totalEstudiantes] = id;
    totalEstudiantes++;

    System.out.println("✓ Estudiante registrado exitosamente");
  }

  /**
   * Busca un estudiante por ID
   * 
   * @param id El ID del estudiante a buscar
   * @return El índice del estudiante o -1 si no se encuentra
   */
  public static int buscarEstudiantePorID(String id) {
    // TODO: Implementar búsqueda
    for (int i = 0; i < totalEstudiantes; i++) {
      if (idsEstudiantes[i].equalsIgnoreCase(id)) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Muestra el menú de búsqueda de estudiante
   */
  public static void buscarEstudianteMenu() {
    System.out.println("\n--- BUSCAR ESTUDIANTE ---");
    System.out.print("ID del estudiante: ");
    String id = sc.nextLine();

    int indice = buscarEstudiantePorID(id);

    if (indice != -1) {
      System.out.println("\n✓ Estudiante encontrado:");
      mostrarDatosEstudiante(indice);
    } else {
      System.out.println("✗ Estudiante no encontrado");
    }
  }

  /**
   * Lista todos los estudiantes registrados
   */
  public static void listarEstudiantes() {
    System.out.println("\n--- LISTA DE ESTUDIANTES ---");

    if (totalEstudiantes == 0) {
      System.out.println("No hay estudiantes registrados");
      return;
    }

    System.out.println("ID       | Nombre                  | Edad | Promedio");
    System.out.println("---------|-------------------------|------|----------");

    for (int i = 0; i < totalEstudiantes; i++) {
      double promedio = calcularPromedioEstudiante(i);
      String promedioStr = promedio >= 0 ? String.format("%.2f", promedio) : "N/A";

      System.out.printf("%-8s | %-23s | %-4d | %s\n",
          idsEstudiantes[i],
          nombresEstudiantes[i],
          edadesEstudiantes[i],
          promedioStr);
    }

    System.out.println("\nTotal de estudiantes: " + totalEstudiantes);
  }

  // TODO: Implementar métodos de actualización y eliminación
  public static void actualizarEstudianteMenu() {
    System.out.println("TODO: Implementar actualización de estudiante");
  }

  public static void eliminarEstudianteMenu() {
    System.out.println("TODO: Implementar eliminación de estudiante");
  }

  // ==================== GESTIÓN DE CALIFICACIONES ====================

  /**
   * Registra una calificación para un estudiante en una materia
   */
  public static void registrarCalificacionMenu() {
    System.out.println("\n--- REGISTRAR CALIFICACIÓN ---");

    // TODO: Implementar registro de calificación
    System.out.println("TODO: Implementar registro de calificación");
  }

  /**
   * Calcula el promedio de un estudiante
   * 
   * @param indice El índice del estudiante
   * @return El promedio o -1 si no tiene calificaciones
   */
  public static double calcularPromedioEstudiante(int indice) {
    double suma = 0;
    int contador = 0;

    for (int j = 0; j < NUM_MATERIAS; j++) {
      if (calificaciones[indice][j] >= 0) {
        suma += calificaciones[indice][j];
        contador++;
      }
    }

    return contador > 0 ? suma / contador : -1;
  }

  // TODO: Implementar más métodos de calificaciones
  public static void verCalificacionesEstudianteMenu() {
    System.out.println("TODO: Ver calificaciones de estudiante");
  }

  public static void calcularPromedioEstudianteMenu() {
    System.out.println("TODO: Calcular promedio de estudiante");
  }

  public static void calcularPromedioMateriaMenu() {
    System.out.println("TODO: Calcular promedio por materia");
  }

  // ==================== ESTADÍSTICAS Y REPORTES ====================

  /**
   * Muestra el mejor estudiante (mayor promedio)
   */
  public static void mostrarMejorEstudiante() {
    System.out.println("\n--- MEJOR ESTUDIANTE ---");
    // TODO: Implementar
    System.out.println("TODO: Implementar mejor estudiante");
  }

  public static void mostrarAprobadosReprobados() {
    System.out.println("\n--- APROBADOS/REPROBADOS ---");
    // TODO: Implementar
    System.out.println("TODO: Implementar conteo aprobados/reprobados");
  }

  public static void mostrarRanking() {
    System.out.println("\n--- RANKING DE ESTUDIANTES ---");
    // TODO: Implementar
    System.out.println("TODO: Implementar ranking");
  }

  public static void mostrarMateriaMasDificil() {
    System.out.println("\n--- MATERIA MÁS DIFÍCIL ---");
    // TODO: Implementar
    System.out.println("TODO: Implementar materia más difícil");
  }

  public static void generarReporteCompleto() {
    System.out.println("\n--- REPORTE COMPLETO ---");
    // TODO: Implementar reporte completo
    System.out.println("TODO: Implementar reporte completo");
  }

  // ==================== MÉTODOS AUXILIARES ====================

  /**
   * Muestra los datos de un estudiante
   * 
   * @param indice El índice del estudiante
   */
  public static void mostrarDatosEstudiante(int indice) {
    System.out.println("ID: " + idsEstudiantes[indice]);
    System.out.println("Nombre: " + nombresEstudiantes[indice]);
    System.out.println("Edad: " + edadesEstudiantes[indice]);

    double promedio = calcularPromedioEstudiante(indice);
    if (promedio >= 0) {
      System.out.printf("Promedio: %.2f\n", promedio);
    } else {
      System.out.println("Promedio: Sin calificaciones");
    }
  }

  /**
   * Muestra el encabezado del sistema
   */
  public static void mostrarEncabezado() {
    limpiarPantalla();
    System.out.println("╔════════════════════════════════════════════╗");
    System.out.println("║   SISTEMA DE GESTIÓN ESTUDIANTIL          ║");
    System.out.println("╚════════════════════════════════════════════╝");
    System.out.println();
  }

  /**
   * Muestra información acerca del sistema
   */
  public static void mostrarAcercaDe() {
    System.out.println("\n--- ACERCA DE ---");
    System.out.println("Sistema de Gestión Estudiantil v1.0");
    System.out.println("Proyecto Integrador - Semana 0");
    System.out.println("Bootcamp Java - Programación Orientada a Objetos");
    System.out.println("Autor: [Tu Nombre]");
    System.out.println("Fecha: 2025");
  }

  /**
   * Simula limpiar la pantalla
   */
  public static void limpiarPantalla() {
    for (int i = 0; i < 50; i++) {
      System.out.println();
    }
  }

  /**
   * Pausa la ejecución hasta que el usuario presione Enter
   */
  public static void pausar() {
    System.out.print("\nPresiona Enter para continuar...");
    sc.nextLine();
  }
}
