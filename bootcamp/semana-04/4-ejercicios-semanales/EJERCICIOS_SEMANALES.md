# Ejercicios Semanales Evaluables - Semana 04

## 📋 Información General

**Semana:** 04 - Herencia  
**Tipo:** Extensión del sistema con jerarquías de clases  
**Peso en la evaluación:** 70% de la nota semanal  
**Fecha límite:** Domingo 23:59 de la Semana 04  
**Formato de entrega:** Repositorio GitHub (mismo repositorio)

---

## 🎯 Objetivo

Aplicar herencia para crear jerarquías de clases, reutilizar código mediante superclases, y especializar comportamientos en subclases usando `extends`, `super` y `@Override`.

---

## 🔄 Continuidad del Proyecto

Esta semana **SÍ agregas nuevas clases**, pero mediante **herencia** de las existentes.

| Semana | Acción | Clases Totales |
|--------|--------|----------------|
| 01 | Crear 2 clases básicas | 2 + Main |
| 02 | Agregar 3ra clase + Gestor | 4 + Main |
| 03 | Refactorizar (encapsulación) | 4 + Main (mejoradas) |
| 04 | Agregar herencia | 6 + Main (jerarquía) |

---

## 📝 Ejercicios Obligatorios

### Ejercicio 1: Identificar y Crear Jerarquía (20 puntos)

**Descripción:**  
Identifica cuál de tus clases existentes puede tener "tipos" o "categorías", conviértela en **superclase**, y documenta la decisión.

**Pasos:**

#### 1.1 Identificar la Superclase

Pregúntate: ¿Cuál de mis 3 clases tiene variantes o especializaciones naturales?

**Ejemplos:**

| Dominio | Clase Existente | ¿Tiene variantes? | Posibles Subclases |
|---------|----------------|-------------------|-------------------|
| Cursos | `Curso` | ✅ Sí | `CursoPresencial`, `CursoVirtual` |
| Biblioteca | `Libro` | ✅ Sí | `LibroFisico`, `LibroDigital` |
| Restaurante | `Producto` | ✅ Sí | `ProductoCongelado`, `ProductoFresco` |
| Tienda | `Articulo` | ✅ Sí | `ArticuloPerecible`, `ArticuloNoPerecible` |
| Hospital | `Paciente` | ✅ Sí | `PacienteHospitalizado`, `PacienteExterno` |
| Empleados | `Empleado` | ❌ No | (Mejor mantener simple) |

**Regla IS-A (ES-UN):** 
- ✅ "Un CursoVirtual **ES-UN** Curso" → Herencia válida
- ✅ "Un LibroDigital **ES-UN** Libro" → Herencia válida
- ❌ "Un Empleado **TIENE-UN** Departamento" → Composición, no herencia

#### 1.2 Refactorizar la Superclase

Mueve a la superclase **solo** lo que es **común** a todas las variantes.

**Ejemplo: Sistema Educativo**

```java
/**
 * Clase base para todos los tipos de cursos
 * @author [Tu Nombre]
 * @version 3.0 (Semana 04)
 */
public class Curso {
    // ===== ATRIBUTOS COMUNES (todos los cursos los tienen) =====
    private final String codigoCurso;
    private String nombreCurso;
    private int duracionHoras;
    private String instructor;
    private boolean activo;
    
    // Constante común
    private static final double COSTO_BASE_POR_HORA = 15000.0;
    
    /**
     * Constructor principal de la superclase
     * @param codigo Código único del curso
     * @param nombre Nombre del curso
     * @param horas Duración en horas
     * @param instructor Nombre del instructor
     */
    public Curso(String codigo, String nombre, int horas, String instructor) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código requerido");
        }
        if (horas < 10 || horas > 200) {
            throw new IllegalArgumentException("Duración debe estar entre 10 y 200 horas");
        }
        
        this.codigoCurso = codigo;
        this.nombreCurso = nombre;
        this.duracionHoras = horas;
        this.instructor = instructor;
        this.activo = true;
    }
    
    // Constructores sobrecargados
    public Curso(String codigo, String nombre, int horas) {
        this(codigo, nombre, horas, "Por asignar");
    }
    
    public Curso(String codigo, String nombre) {
        this(codigo, nombre, 40, "Por asignar");
    }
    
    // ===== GETTERS Y SETTERS =====
    public String getCodigoCurso() {
        return codigoCurso;
    }
    
    public String getNombreCurso() {
        return nombreCurso;
    }
    
    public void setNombreCurso(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre requerido");
        }
        this.nombreCurso = nombre;
    }
    
    public int getDuracionHoras() {
        return duracionHoras;
    }
    
    public void setDuracionHoras(int horas) {
        if (horas < 10 || horas > 200) {
            throw new IllegalArgumentException("Duración inválida");
        }
        this.duracionHoras = horas;
    }
    
    public String getInstructor() {
        return instructor;
    }
    
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    public boolean isActivo() {
        return activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    /**
     * Calcula el costo base del curso
     * Este método puede ser sobrescrito por las subclases
     * @return Costo base calculado
     */
    public double calcularCosto() {
        return duracionHoras * COSTO_BASE_POR_HORA;
    }
    
    /**
     * Devuelve información general del curso
     * @return String con datos del curso
     */
    @Override
    public String toString() {
        return String.format("Curso[%s] %s - %d horas - Instructor: %s", 
                             codigoCurso, nombreCurso, duracionHoras, instructor);
    }
}
```

#### 1.3 Documentar la Decisión

Crea `semana-04/docs/DECISION_HERENCIA.md`:

```markdown
# Decisión de Diseño: Jerarquía de Herencia

## Clase Seleccionada como Superclase
**Clase:** [Nombre de tu clase]

## Justificación
[Explica por qué elegiste esta clase]

### Pregunta IS-A
- ¿[Subclase1] ES-UN [Superclase]? ✅ Sí, porque...
- ¿[Subclase2] ES-UN [Superclase]? ✅ Sí, porque...

### Atributos Comunes Identificados
| Atributo | Tipo | Justificación |
|----------|------|---------------|
| codigo | String | Todos los [objetos] tienen código único |
| nombre | String | Todos tienen nombre descriptivo |
| ... | ... | ... |

### Atributos Específicos de Subclases
| Subclase | Atributo Nuevo | Justificación |
|----------|----------------|---------------|
| [Subclase1] | [atributo1] | Solo aplica a [Subclase1] porque... |
| [Subclase2] | [atributo2] | Solo aplica a [Subclase2] porque... |

## Alternativas Consideradas
[Otras clases que evaluaste y por qué NO las elegiste]

## Diagrama UML Simplificado
```
        [ Superclase ]
              △
       ┌──────┴──────┐
       │             │
[Subclase1]    [Subclase2]
```

## Ventajas Esperadas
1. **Reutilización de código**: [Explicar]
2. **Mantenibilidad**: [Explicar]
3. **Extensibilidad**: [Explicar]
```

**Criterios de evaluación:**
- ✅ Clase apropiada seleccionada como superclase (5 pts)
- ✅ Atributos comunes correctamente identificados (5 pts)
- ✅ Documentación de decisión completa (5 pts)
- ✅ Código de superclase bien estructurado (5 pts)

**Total:** 20 puntos

---

### Ejercicio 2: Crear Dos Subclases Especializadas (30 puntos)

**Descripción:**  
Crea dos subclases que **extiendan** la superclase, agregando atributos y comportamientos específicos.

**Requerimientos:**
- Cada subclase debe agregar **mínimo 2 atributos propios**
- Usar `extends` para heredar de la superclase
- Usar `super()` en constructores
- Sobrescribir mínimo 1 método con `@Override`

**Ejemplo: CursoPresencial**

```java
/**
 * Representa un curso presencial con ubicación física
 * Extiende la clase Curso agregando información de localización
 * @author [Tu Nombre]
 * @version 3.0 (Semana 04)
 */
public class CursoPresencial extends Curso {
    // ===== ATRIBUTOS ESPECÍFICOS DE CURSOS PRESENCIALES =====
    private String salon;           // Salón donde se dicta
    private String sede;            // Sede física
    private int capacidadMaxima;    // Número máximo de estudiantes
    private String horario;         // Horario de clases
    
    /**
     * Constructor completo para curso presencial
     * @param codigo Código único del curso
     * @param nombre Nombre del curso
     * @param horas Duración en horas
     * @param instructor Nombre del instructor
     * @param salon Salón asignado
     * @param sede Sede donde se dicta
     * @param capacidad Capacidad máxima
     */
    public CursoPresencial(String codigo, String nombre, int horas, 
                          String instructor, String salon, String sede, 
                          int capacidad) {
        // Llamar al constructor de la superclase
        super(codigo, nombre, horas, instructor);
        
        // Validaciones específicas
        if (salon == null || salon.trim().isEmpty()) {
            throw new IllegalArgumentException("Salón requerido");
        }
        if (capacidad < 5 || capacidad > 50) {
            throw new IllegalArgumentException("Capacidad debe estar entre 5 y 50");
        }
        
        // Inicializar atributos propios
        this.salon = salon;
        this.sede = sede;
        this.capacidadMaxima = capacidad;
        this.horario = "Por definir";
    }
    
    /**
     * Constructor sin horario (se define después)
     */
    public CursoPresencial(String codigo, String nombre, int horas, 
                          String instructor, String salon, String sede) {
        this(codigo, nombre, horas, instructor, salon, sede, 30); // Capacidad default 30
    }
    
    // ===== GETTERS Y SETTERS ESPECÍFICOS =====
    public String getSalon() {
        return salon;
    }
    
    public void setSalon(String salon) {
        if (salon == null || salon.trim().isEmpty()) {
            throw new IllegalArgumentException("Salón requerido");
        }
        this.salon = salon;
    }
    
    public String getSede() {
        return sede;
    }
    
    public void setSede(String sede) {
        this.sede = sede;
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public void setCapacidadMaxima(int capacidad) {
        if (capacidad < 5 || capacidad > 50) {
            throw new IllegalArgumentException("Capacidad inválida");
        }
        this.capacidadMaxima = capacidad;
    }
    
    public String getHorario() {
        return horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    // ===== MÉTODOS SOBRESCRITOS =====
    /**
     * Calcula el costo del curso presencial
     * Los cursos presenciales tienen un recargo por uso de instalaciones
     * @return Costo total incluyendo recargo de instalaciones
     */
    @Override
    public double calcularCosto() {
        double costoBase = super.calcularCosto();  // Llamar al método de la superclase
        double recargoInstalaciones = 50000.0;     // Recargo fijo por uso de salón
        return costoBase + recargoInstalaciones;
    }
    
    /**
     * Devuelve información completa del curso presencial
     * @return String con todos los datos incluidos los específicos
     */
    @Override
    public String toString() {
        return super.toString() + 
               String.format(" | Presencial - Salón: %s, Sede: %s, Capacidad: %d", 
                            salon, sede, capacidadMaxima);
    }
    
    // ===== MÉTODOS ESPECÍFICOS =====
    /**
     * Verifica si el salón es adecuado para el número de estudiantes
     * @param numEstudiantes Número de estudiantes inscritos
     * @return true si hay cupo, false si está lleno
     */
    public boolean verificarDisponibilidad(int numEstudiantes) {
        return numEstudiantes < capacidadMaxima;
    }
    
    /**
     * Genera un resumen de la logística del curso
     * @return String con información logística
     */
    public String obtenerResumenLogistico() {
        return String.format("Curso: %s\nSede: %s\nSalón: %s\nHorario: %s\nCapacidad: %d/%d",
                            getNombreCurso(), sede, salon, horario, 0, capacidadMaxima);
    }
}
```

**Ejemplo: CursoVirtual**

```java
/**
 * Representa un curso virtual con plataforma en línea
 * Extiende la clase Curso agregando información tecnológica
 * @author [Tu Nombre]
 * @version 3.0 (Semana 04)
 */
public class CursoVirtual extends Curso {
    // ===== ATRIBUTOS ESPECÍFICOS DE CURSOS VIRTUALES =====
    private String plataforma;          // Zoom, Teams, Meet, etc.
    private String enlaceAcceso;        // URL de la sesión
    private boolean requiereKit;        // Si necesita kit de materiales enviado
    private int limiteConexiones;       // Límite técnico de la plataforma
    
    /**
     * Constructor completo para curso virtual
     * @param codigo Código único del curso
     * @param nombre Nombre del curso
     * @param horas Duración en horas
     * @param instructor Nombre del instructor
     * @param plataforma Plataforma tecnológica usada
     * @param enlace URL de acceso
     */
    public CursoVirtual(String codigo, String nombre, int horas, 
                       String instructor, String plataforma, String enlace) {
        // Llamar al constructor de la superclase
        super(codigo, nombre, horas, instructor);
        
        // Validaciones específicas
        if (plataforma == null || plataforma.trim().isEmpty()) {
            throw new IllegalArgumentException("Plataforma requerida");
        }
        if (enlace == null || !enlace.startsWith("http")) {
            throw new IllegalArgumentException("Enlace debe ser una URL válida");
        }
        
        // Inicializar atributos propios
        this.plataforma = plataforma;
        this.enlaceAcceso = enlace;
        this.requiereKit = false;
        this.limiteConexiones = 100;  // Default 100 conexiones
    }
    
    /**
     * Constructor simplificado (enlace se genera después)
     */
    public CursoVirtual(String codigo, String nombre, int horas, 
                       String instructor, String plataforma) {
        this(codigo, nombre, horas, instructor, plataforma, "http://pendiente.com");
    }
    
    // ===== GETTERS Y SETTERS ESPECÍFICOS =====
    public String getPlataforma() {
        return plataforma;
    }
    
    public void setPlataforma(String plataforma) {
        if (plataforma == null || plataforma.trim().isEmpty()) {
            throw new IllegalArgumentException("Plataforma requerida");
        }
        this.plataforma = plataforma;
    }
    
    public String getEnlaceAcceso() {
        return enlaceAcceso;
    }
    
    public void setEnlaceAcceso(String enlace) {
        if (enlace == null || !enlace.startsWith("http")) {
            throw new IllegalArgumentException("Enlace debe ser una URL válida");
        }
        this.enlaceAcceso = enlace;
    }
    
    public boolean requiereKit() {
        return requiereKit;
    }
    
    public void setRequiereKit(boolean requiere) {
        this.requiereKit = requiere;
    }
    
    public int getLimiteConexiones() {
        return limiteConexiones;
    }
    
    public void setLimiteConexiones(int limite) {
        if (limite < 10 || limite > 1000) {
            throw new IllegalArgumentException("Límite debe estar entre 10 y 1000");
        }
        this.limiteConexiones = limite;
    }
    
    // ===== MÉTODOS SOBRESCRITOS =====
    /**
     * Calcula el costo del curso virtual
     * Los cursos virtuales tienen descuento por no usar instalaciones físicas
     * @return Costo total con descuento aplicado
     */
    @Override
    public double calcularCosto() {
        double costoBase = super.calcularCosto();  // Llamar al método de la superclase
        double descuentoVirtual = costoBase * 0.15;  // 15% descuento
        double costoFinal = costoBase - descuentoVirtual;
        
        // Si requiere kit físico, agregar costo de envío
        if (requiereKit) {
            costoFinal += 30000.0;  // Costo de envío de kit
        }
        
        return costoFinal;
    }
    
    /**
     * Devuelve información completa del curso virtual
     * @return String con todos los datos incluidos los específicos
     */
    @Override
    public String toString() {
        String kitInfo = requiereKit ? "con kit" : "sin kit";
        return super.toString() + 
               String.format(" | Virtual - Plataforma: %s, Límite: %d conexiones, %s", 
                            plataforma, limiteConexiones, kitInfo);
    }
    
    // ===== MÉTODOS ESPECÍFICOS =====
    /**
     * Verifica si la plataforma soporta el número de estudiantes
     * @param numEstudiantes Número de estudiantes inscritos
     * @return true si la plataforma soporta la cantidad, false si excede
     */
    public boolean verificarCapacidadTecnica(int numEstudiantes) {
        return numEstudiantes <= limiteConexiones;
    }
    
    /**
     * Genera instrucciones de acceso para los estudiantes
     * @return String con instrucciones
     */
    public String generarInstruccionesAcceso() {
        return String.format(
            "=== INSTRUCCIONES DE ACCESO ===\n" +
            "Curso: %s\n" +
            "Plataforma: %s\n" +
            "Enlace: %s\n" +
            "Instructor: %s\n" +
            "Requerimientos: Conexión estable a internet, cámara y micrófono\n" +
            "Kit físico: %s",
            getNombreCurso(), plataforma, enlaceAcceso, getInstructor(),
            requiereKit ? "Se enviará a tu domicilio" : "No requerido"
        );
    }
}
```

**Criterios de evaluación:**
- ✅ Cada subclase extiende correctamente (5 pts)
- ✅ Mínimo 2 atributos propios por subclase (5 pts)
- ✅ Constructores usan super() correctamente (5 pts)
- ✅ Validaciones en constructores de subclases (5 pts)
- ✅ Métodos sobrescritos con @Override (5 pts)
- ✅ toString() sobrescrito llamando a super (5 pts)

**Total:** 30 puntos

---

### Ejercicio 3: Actualizar Gestor para Polimorfismo (25 puntos)

**Descripción:**  
Modifica tu clase `Sistema[X].java` para que maneje la **superclase** (permitiendo polimorfismo).

**Concepto clave:** Un array de tipo `Curso[]` puede contener objetos `CursoPresencial` y `CursoVirtual`.

**Ejemplo: SistemaCursos**

```java
/**
 * Gestor de cursos que maneja tanto presenciales como virtuales mediante polimorfismo
 * @author [Tu Nombre]
 * @version 3.0 (Semana 04 - con polimorfismo)
 */
public class SistemaCursos {
    // Array de tipo SUPERCLASE (puede contener cualquier subclase)
    private Curso[] cursos;  // ⬅️ Puede contener CursoPresencial y CursoVirtual
    private int cantidadCursos;
    private static final int MAX_CURSOS = 50;
    
    /**
     * Constructor del sistema
     */
    public SistemaCursos() {
        this.cursos = new Curso[MAX_CURSOS];
        this.cantidadCursos = 0;
    }
    
    /**
     * Agrega un curso al sistema (puede ser presencial o virtual)
     * @param curso Curso a agregar (CursoPresencial o CursoVirtual)
     * @return true si se agregó, false si no hay espacio
     */
    public boolean agregarCurso(Curso curso) {  // ⬅️ Acepta cualquier subclase
        if (curso == null) {
            throw new IllegalArgumentException("Curso no puede ser nulo");
        }
        
        if (cantidadCursos >= MAX_CURSOS) {
            return false;
        }
        
        cursos[cantidadCursos] = curso;
        cantidadCursos++;
        return true;
    }
    
    /**
     * Busca un curso por código
     * @param codigo Código del curso a buscar
     * @return Curso encontrado o null
     */
    public Curso buscarCursoPorCodigo(String codigo) {
        for (int i = 0; i < cantidadCursos; i++) {
            if (cursos[i].getCodigoCurso().equals(codigo)) {
                return cursos[i];  // Puede retornar cualquier subclase
            }
        }
        return null;
    }
    
    /**
     * Lista todos los cursos (polimorfismo en acción)
     */
    public void listarTodosLosCursos() {
        System.out.println("=== LISTA DE CURSOS ===");
        for (int i = 0; i < cantidadCursos; i++) {
            // toString() se ejecuta de forma polimórfica
            // Si es CursoPresencial, ejecuta el toString de CursoPresencial
            // Si es CursoVirtual, ejecuta el toString de CursoVirtual
            System.out.println((i + 1) + ". " + cursos[i].toString());
        }
        System.out.println("Total: " + cantidadCursos + " cursos\n");
    }
    
    /**
     * Filtra y muestra solo cursos presenciales
     * Usa instanceof para verificar el tipo real
     */
    public void listarCursosPresenciales() {
        System.out.println("=== CURSOS PRESENCIALES ===");
        int contador = 0;
        for (int i = 0; i < cantidadCursos; i++) {
            if (cursos[i] instanceof CursoPresencial) {  // ⬅️ Verifica tipo
                CursoPresencial cp = (CursoPresencial) cursos[i];  // ⬅️ Cast
                System.out.println(cp.toString());
                System.out.println("   Sede: " + cp.getSede() + ", Salón: " + cp.getSalon());
                contador++;
            }
        }
        System.out.println("Total presenciales: " + contador + "\n");
    }
    
    /**
     * Filtra y muestra solo cursos virtuales
     */
    public void listarCursosVirtuales() {
        System.out.println("=== CURSOS VIRTUALES ===");
        int contador = 0;
        for (int i = 0; i < cantidadCursos; i++) {
            if (cursos[i] instanceof CursoVirtual) {  // ⬅️ Verifica tipo
                CursoVirtual cv = (CursoVirtual) cursos[i];  // ⬅️ Cast
                System.out.println(cv.toString());
                System.out.println("   Plataforma: " + cv.getPlataforma());
                contador++;
            }
        }
        System.out.println("Total virtuales: " + contador + "\n");
    }
    
    /**
     * Calcula el costo total de todos los cursos (polimorfismo)
     * Cada subclase calcula su costo de forma diferente
     * @return Suma de costos de todos los cursos
     */
    public double calcularCostoTotal() {
        double total = 0;
        for (int i = 0; i < cantidadCursos; i++) {
            // calcularCosto() se ejecuta de forma polimórfica
            total += cursos[i].calcularCosto();
        }
        return total;
    }
    
    /**
     * Genera reporte con estadísticas por tipo
     */
    public void generarReporte() {
        int presenciales = 0;
        int virtuales = 0;
        double costoPresenciales = 0;
        double costoVirtuales = 0;
        
        for (int i = 0; i < cantidadCursos; i++) {
            if (cursos[i] instanceof CursoPresencial) {
                presenciales++;
                costoPresenciales += cursos[i].calcularCosto();
            } else if (cursos[i] instanceof CursoVirtual) {
                virtuales++;
                costoVirtuales += cursos[i].calcularCosto();
            }
        }
        
        System.out.println("=== REPORTE DE CURSOS ===");
        System.out.println("Total de cursos: " + cantidadCursos);
        System.out.println("Presenciales: " + presenciales + 
                         " (Costo promedio: $" + (presenciales > 0 ? costoPresenciales/presenciales : 0) + ")");
        System.out.println("Virtuales: " + virtuales + 
                         " (Costo promedio: $" + (virtuales > 0 ? costoVirtuales/virtuales : 0) + ")");
        System.out.println("Costo total del catálogo: $" + calcularCostoTotal());
        System.out.println();
    }
    
    public int getCantidadCursos() {
        return cantidadCursos;
    }
}
```

**Criterios de evaluación:**
- ✅ Array es de tipo superclase (5 pts)
- ✅ Método agregar acepta superclase (5 pts)
- ✅ Usa instanceof para filtrar por tipo (5 pts)
- ✅ Método polimórfico (calcularCosto, toString) (5 pts)
- ✅ Método de reporte con estadísticas (5 pts)

**Total:** 25 puntos

---

### Ejercicio 4: Main Integrador y Documentación (25 puntos)

**Descripción:**  
Crea un `Main.java` que demuestre el uso completo de la jerarquía y documenta el análisis.

**Ejemplo: Main.java**

```java
/**
 * Clase principal que demuestra herencia y polimorfismo
 * @author [Tu Nombre]
 * @version 3.0 (Semana 04)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   SISTEMA DE GESTIÓN DE CURSOS V3.0   ║");
        System.out.println("║      Semana 04 - Herencia y OOP       ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        // Crear el sistema gestor
        SistemaCursos sistema = new SistemaCursos();
        
        // ===== DEMOSTRACIÓN DE HERENCIA =====
        System.out.println("=== 1. CREANDO CURSOS PRESENCIALES ===");
        
        CursoPresencial cp1 = new CursoPresencial(
            "POO101", "Programación Orientada a Objetos", 40,
            "Dr. García", "Salón 301", "Sede Norte", 30
        );
        cp1.setHorario("Lunes y Miércoles 14:00-18:00");
        System.out.println("✅ Creado: " + cp1.getNombreCurso());
        System.out.println("   Costo: $" + cp1.calcularCosto());
        
        CursoPresencial cp2 = new CursoPresencial(
            "BD201", "Bases de Datos", 60,
            "Ing. Rodríguez", "Lab 102", "Sede Centro", 25
        );
        System.out.println("✅ Creado: " + cp2.getNombreCurso());
        System.out.println("   Costo: $" + cp2.calcularCosto());
        
        System.out.println("\n=== 2. CREANDO CURSOS VIRTUALES ===");
        
        CursoVirtual cv1 = new CursoVirtual(
            "WEB301", "Desarrollo Web Full Stack", 80,
            "MSc. Torres", "Zoom", "https://zoom.us/j/123456"
        );
        cv1.setRequiereKit(true);
        System.out.println("✅ Creado: " + cv1.getNombreCurso());
        System.out.println("   Costo: $" + cv1.calcularCosto());
        
        CursoVirtual cv2 = new CursoVirtual(
            "IA401", "Inteligencia Artificial", 100,
            "PhD. Martínez", "Microsoft Teams", "https://teams.microsoft.com/abc"
        );
        System.out.println("✅ Creado: " + cv2.getNombreCurso());
        System.out.println("   Costo: $" + cv2.calcularCosto());
        
        // ===== DEMOSTRACIÓN DE POLIMORFISMO =====
        System.out.println("\n=== 3. AGREGANDO AL SISTEMA (Polimorfismo) ===");
        
        // Variable de tipo SUPERCLASE puede referenciar SUBCLASES
        Curso c;  // Variable polimórfica
        
        c = cp1;  // Apunta a CursoPresencial
        sistema.agregarCurso(c);
        System.out.println("✅ Agregado: " + c.getCodigoCurso());
        
        c = cp2;  // Ahora apunta a otro CursoPresencial
        sistema.agregarCurso(c);
        System.out.println("✅ Agregado: " + c.getCodigoCurso());
        
        c = cv1;  // Ahora apunta a CursoVirtual
        sistema.agregarCurso(c);
        System.out.println("✅ Agregado: " + c.getCodigoCurso());
        
        c = cv2;  // Otro CursoVirtual
        sistema.agregarCurso(c);
        System.out.println("✅ Agregado: " + c.getCodigoCurso());
        
        // ===== LISTADOS POLIMÓRFICOS =====
        System.out.println("\n=== 4. LISTAR TODOS (toString polimórfico) ===");
        sistema.listarTodosLosCursos();
        
        System.out.println("=== 5. FILTROS POR TIPO (instanceof) ===");
        sistema.listarCursosPresenciales();
        sistema.listarCursosVirtuales();
        
        // ===== REPORTE ESTADÍSTICO =====
        System.out.println("=== 6. REPORTE GENERAL ===");
        sistema.generarReporte();
        
        // ===== DEMOSTRACIÓN DE MÉTODOS ESPECÍFICOS =====
        System.out.println("=== 7. MÉTODOS ESPECÍFICOS DE SUBCLASES ===");
        
        System.out.println("\n--- Curso Presencial ---");
        System.out.println(cp1.obtenerResumenLogistico());
        System.out.println("¿Disponibilidad para 25 estudiantes? " + 
                          (cp1.verificarDisponibilidad(25) ? "✅ Sí" : "❌ No"));
        
        System.out.println("\n--- Curso Virtual ---");
        System.out.println(cv1.generarInstruccionesAcceso());
        System.out.println("¿Capacidad técnica para 80 estudiantes? " + 
                          (cv1.verificarCapacidadTecnica(80) ? "✅ Sí" : "❌ No"));
        
        // ===== BÚSQUEDA Y CASTING =====
        System.out.println("\n=== 8. BÚSQUEDA Y DOWNCASTING ===");
        Curso encontrado = sistema.buscarCursoPorCodigo("WEB301");
        if (encontrado != null) {
            System.out.println("Curso encontrado: " + encontrado.getNombreCurso());
            
            // Verificar tipo específico y hacer casting si es necesario
            if (encontrado instanceof CursoVirtual) {
                CursoVirtual cvEncontrado = (CursoVirtual) encontrado;
                System.out.println("Es virtual, plataforma: " + cvEncontrado.getPlataforma());
            }
        }
        
        System.out.println("\n=== FIN DE DEMOSTRACIÓN ===");
    }
}
```

**Archivo:** `semana-04/docs/ANALISIS.md`

```markdown
# Análisis de Herencia - Semana 04

## 1. Diagrama UML de Jerarquía

```
        ┌────────────────────┐
        │       Curso        │
        │ (Superclase)       │
        ├────────────────────┤
        │ - codigoCurso      │
        │ - nombreCurso      │
        │ - duracionHoras    │
        │ - instructor       │
        │ - activo           │
        ├────────────────────┤
        │ + calcularCosto()  │
        │ + toString()       │
        └──────────┬─────────┘
                   △
          ┌────────┴────────┐
          │                 │
┌─────────┴──────────┐ ┌────┴───────────────┐
│  CursoPresencial   │ │   CursoVirtual     │
├────────────────────┤ ├────────────────────┤
│ - salon            │ │ - plataforma       │
│ - sede             │ │ - enlaceAcceso     │
│ - capacidadMaxima  │ │ - requiereKit      │
│ - horario          │ │ - limiteConexiones │
├────────────────────┤ ├────────────────────┤
│ + calcularCosto()  │ │ + calcularCosto()  │
│ + toString()       │ │ + toString()       │
│ + verificar...()   │ │ + generarInstr...()│
└────────────────────┘ └────────────────────┘
```

## 2. Comparación Antes vs Después

### Antes (Semana 03)
- **1 clase** `Curso` con muchos atributos opcionales
- Atributos como `estaEnLinea`, `sede`, `plataforma` en la misma clase
- Métodos con muchos `if` para manejar casos especiales
- Difícil de extender

### Después (Semana 04)
- **1 superclase** `Curso` con atributos comunes
- **2 subclases** especializadas con sus propios atributos
- Métodos polimórficos que se comportan diferente según el tipo
- Fácil de extender (agregar `CursoHibrido`, `CursoSemi presencial`, etc.)

## 3. Ventajas de Herencia Observadas

### Reutilización de Código
- Atributos comunes (`codigo`, `nombre`, `horas`, etc.) definidos **una sola vez**
- Getters/setters comunes heredados automáticamente
- Menos duplicación = menos errores

### Mantenibilidad
- Cambio en superclase se refleja en todas las subclases
- Ejemplo: Si cambia la validación de `duracionHoras`, se actualiza automáticamente en ambos tipos

### Extensibilidad
- Agregar un nuevo tipo de curso (ej: `CursoHibrido`) es sencillo:
  ```java
  public class CursoHibrido extends Curso {
      // Solo agregar atributos específicos
  }
  ```

### Polimorfismo
- Array `Curso[]` puede contener cualquier subclase
- Métodos del gestor trabajan con la superclase
- `calcularCosto()` se ejecuta de forma polimórfica

## 4. Relación IS-A

| Pregunta | Respuesta | Validez |
|----------|-----------|---------|
| ¿CursoPresencial ES-UN Curso? | ✅ Sí | Herencia válida |
| ¿CursoVirtual ES-UN Curso? | ✅ Sí | Herencia válida |
| ¿Curso TIENE-UN Instructor? | ⚠️ No (es composición) | No usar herencia |

## 5. Métodos Sobrescritos

### `calcularCosto()`

**Superclase:**
```java
public double calcularCosto() {
    return duracionHoras * COSTO_BASE_POR_HORA;
}
```

**CursoPresencial (recargo):**
```java
@Override
public double calcularCosto() {
    return super.calcularCosto() + 50000.0;  // Recargo instalaciones
}
```

**CursoVirtual (descuento):**
```java
@Override
public double calcularCosto() {
    double base = super.calcularCosto();
    return base - (base * 0.15);  // 15% descuento
}
```

**Ventaja:** Cada subclase calcula su costo de forma específica, pero la interfaz es uniforme.

### `toString()`

Cada subclase extiende el `toString()` de la superclase agregando información específica.

## 6. Uso de `super`

### En Constructores
```java
public CursoPresencial(...) {
    super(codigo, nombre, horas, instructor);  // ⬅️ Llama constructor de Curso
    // Luego inicializa atributos propios
    this.salon = salon;
}
```

### En Métodos
```java
@Override
public double calcularCosto() {
    double costoBase = super.calcularCosto();  // ⬅️ Llama método de Curso
    // Luego aplica lógica específica
    return costoBase + recargo;
}
```

## 7. Uso de `instanceof` y Casting

### Verificación de Tipo
```java
if (curso instanceof CursoPresencial) {
    // Es seguro hacer casting
    CursoPresencial cp = (CursoPresencial) curso;
    System.out.println(cp.getSalon());
}
```

### Polimorfismo sin Casting
```java
// No necesita casting, método es común
for (Curso c : cursos) {
    System.out.println(c.toString());  // Polimórfico
    System.out.println(c.calcularCosto());  // Polimórfico
}
```

## 8. Lecciones Aprendidas

### Lo que funcionó bien
1. **Separación clara:** Atributos comunes en superclase, específicos en subclases
2. **Constructores en cadena:** `super()` evita duplicación de validaciones
3. **Polimorfismo natural:** Sistema gestor no necesita saber el tipo exacto

### Desafíos encontrados
1. **Decidir qué va en superclase:** Tentación de poner todo ahí
   **Solución:** Solo lo **verdaderamente común** a todas las subclases

2. **Validaciones duplicadas:** Validar en superclase vs subclase
   **Solución:** Validaciones comunes en superclase, específicas en subclases

## 9. Próximos Pasos (Semana 05)

Con herencia implementada, ahora se puede:
- **Polimorfismo avanzado:** Interfaces y clases abstractas
- **Sobrecarga avanzada:** Métodos con diferentes firmas
- **Jerarquías más profundas:** Subclases de subclases (con cuidado)

## 10. Conclusión

La herencia mejoró significativamente el diseño del sistema:
- ✅ Código más organizado y mantenible
- ✅ Fácil de extender con nuevos tipos
- ✅ Polimorfismo permite escribir código genérico
- ✅ Menos duplicación de código

**Métrica:**
- Líneas de código duplicado: ↓ 40%
- Facilidad para agregar nuevo tipo: ↑ 80%
- Claridad del diseño: ↑ 60%
```

**Criterios de evaluación:**
- ✅ Main demuestra creación de ambas subclases (5 pts)
- ✅ Main demuestra polimorfismo (5 pts)
- ✅ Main demuestra uso de instanceof y casting (5 pts)
- ✅ ANALISIS.md completo con diagrama UML (5 pts)
- ✅ Comparación antes/después y ventajas (5 pts)

**Total:** 25 puntos

---

## 📦 Estructura de Entrega

```
bc-poo-java-[nombre]-[apellido]/
├── semana-01/
├── semana-02/
├── semana-03/
└── semana-04/              # NUEVA carpeta
    ├── README.md
    ├── src/
    │   ├── Curso.java              # SUPERCLASE refactorizada
    │   ├── CursoPresencial.java    # SUBCLASE nueva
    │   ├── CursoVirtual.java       # SUBCLASE nueva
    │   ├── [Clase2].java           # Sin cambios
    │   ├── [Clase3].java           # Sin cambios
    │   ├── SistemaCursos.java      # Actualizado para polimorfismo
    │   └── Main.java               # Demuestra herencia
    └── docs/
        ├── DECISION_HERENCIA.md    # Decisión de diseño
        └── ANALISIS.md             # Análisis completo
```

---

## ✅ Checklist de Verificación

### Superclase
- [ ] Contiene solo atributos comunes
- [ ] Métodos aplicables a todas las subclases
- [ ] JavaDoc completo
- [ ] Compilas sin errores

### Subclases
- [ ] Usan `extends` correctamente
- [ ] Mínimo 2 atributos propios cada una
- [ ] Constructores llaman a `super()`
- [ ] Sobrescriben mínimo 1 método con `@Override`
- [ ] toString() llama a super.toString()

### Gestor
- [ ] Array es de tipo superclase
- [ ] Métodos aceptan superclase como parámetro
- [ ] Usa instanceof para filtrar por tipo
- [ ] Demuestra polimorfismo (calcularCosto, toString)

### Main
- [ ] Crea objetos de ambas subclases
- [ ] Demuestra polimorfismo con variable de tipo superclase
- [ ] Usa instanceof y casting
- [ ] Llama métodos específicos de subclases

### Documentación
- [ ] DECISION_HERENCIA.md completo
- [ ] ANALISIS.md con diagrama UML
- [ ] Comparación antes/después
- [ ] Ventajas identificadas

---

## 📊 Tabla de Puntuación

| Ejercicio | Puntos | Descripción |
|-----------|--------|-------------|
| Ejercicio 1 | 20 | Jerarquía identificada y documentada |
| Ejercicio 2 | 30 | Dos subclases especializadas |
| Ejercicio 3 | 25 | Gestor polimórfico |
| Ejercicio 4 | 25 | Main integrador y análisis |
| **TOTAL** | **100** | |

---

## 🚀 Comandos Git

```bash
# 1. Copiar desde semana-03
cp -r semana-03 semana-04
cd semana-04

# 2. Desarrollar herencia...

# 3. Commit
git add semana-04/
git commit -m "feat(semana-04): implementar herencia en jerarquía de cursos

What? 
- Clase Curso refactorizada como superclase
- CursoPresencial y CursoVirtual como subclases
- Sistema gestor actualizado para polimorfismo
- Main integrador demostrando herencia

For? 
Aplicar herencia para reutilizar código y especializar comportamientos

Impact? 
Código más mantenible, extensible y organizado mediante OOP"

git push origin main
```

---

## ❓ FAQ

**P: ¿Debo modificar semana-03?**  
R: No, semana-03 se queda como histórico.

**P: ¿Cuántas subclases debo crear?**  
R: **Mínimo 2** para cumplir con la rúbrica.

**P: ¿Puedo crear subclases de otras clases?**  
R: Sí, pero enfócate en UNA jerarquía completa primero.

**P: ¿Qué pasa si mi dominio no tiene variantes obvias?**  
R: Pregunta al instructor, siempre hay forma de aplicar herencia creativamente.

**P: ¿Debo usar clases abstractas?**  
R: No es obligatorio esta semana. Se verán en semana 06.

---

**¡A construir jerarquías orientadas a objetos/home/epti/Documentos/epti-dev/bc-channel/bc-oop-java/bootcamp/semana-03/4-ejercicios-semanales/EJERCICIOS_SEMANALES.md* 🚀
