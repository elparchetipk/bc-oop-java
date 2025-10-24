# Ejercicios Semanales Evaluables - Semana 02

## 📋 Información General

**Semana:** 02 - Fundamentos de Clases y Objetos  
**Tipo:** Entregables obligatorios (continuación de Semana 01)  
**Peso en la evaluación:** 70% de la nota semanal  
**Fecha límite:** Domingo 23:59 de la Semana 02  
**Formato de entrega:** Repositorio GitHub (mismo del semana-01)

---

## 🔴 IMPORTANTE: Continuidad del Proyecto

### Este trabajo es una EXTENSIÓN de tu Semana 01

- ✅ Usa el **mismo dominio** asignado
- ✅ Usa el **mismo repositorio** GitHub
- ✅ Mantén las clases de la Semana 01
- ✅ Agrega nuevas clases y funcionalidades

**Estructura esperada:**
```
bc-poo-java-[nombre]-[apellido]/
├── semana-01/          # Ya existe de la semana anterior
│   └── src/
│       ├── [Clase1].java
│       ├── [Clase2].java
│       └── Main.java
└── semana-02/          # NUEVO - crearás esta carpeta
    ├── README.md
    ├── src/
    │   ├── [Clase1].java      # Copiada y mejorada de semana-01
    │   ├── [Clase2].java      # Copiada y mejorada de semana-01
    │   ├── [Clase3].java      # NUEVA clase
    │   └── Main.java          # Programa mejorado
    └── docs/
        └── ANALISIS.md
```

---

## 🎯 Objetivo

Expandir tu modelo orientado a objetos agregando una tercera clase, gestionando múltiples objetos, e implementando métodos más complejos que demuestren las relaciones entre objetos.

---

## 📝 Ejercicios Obligatorios

### Ejercicio 1: Tercera Clase del Dominio (25 puntos)

**Descripción:**  
Agrega una **tercera clase** que complemente tu dominio y se relacione con las dos clases anteriores.

**Requerimientos técnicos:**
- Nombre de archivo: `[Clase3].java` (según tu dominio)
- Mínimo **4 atributos**
- Mínimo **3 métodos** (además de constructor)
- Debe tener **relación lógica** con las otras dos clases

**Ejemplos según dominio:**

| Dominio | Clase 1 (Sem01) | Clase 2 (Sem01) | Clase 3 (NUEVA) |
|---------|-----------------|-----------------|-----------------|
| Agencia Viajes | Reserva | Cliente | Destino |
| Restaurante | Pedido | Producto | Mesa |
| Biblioteca | Libro | Autor | Prestamo |
| Tienda Mascotas | Mascota | Propietario | Cita |
| Hospital | Cita | Paciente | Doctor |
| Hotel | Habitacion | Huesped | Reserva |
| Cafetería | Orden | Cliente | Menu |
| Librería | Libro | Cliente | Categoria |

**Ejemplo didáctico (Sistema de Gestión de Cursos):**

```java
/**
 * Clase que representa una inscripción en el sistema de cursos
 */
public class Inscripcion {
    // Atributos
    private String codigoInscripcion;
    private String codigoCurso;
    private String codigoEstudiante;
    private String fechaInscripcion;
    private boolean activa;
    
    // Constructor
    public Inscripcion(String codigo, String codigoCurso, 
                      String codigoEstudiante, String fecha) {
        this.codigoInscripcion = codigo;
        this.codigoCurso = codigoCurso;
        this.codigoEstudiante = codigoEstudiante;
        this.fechaInscripcion = fecha;
        this.activa = true;
    }
    
    // Métodos
    public void mostrarInformacion() {
        System.out.println("=== INSCRIPCIÓN ===");
        System.out.println("Código: " + codigoInscripcion);
        System.out.println("Curso: " + codigoCurso);
        System.out.println("Estudiante: " + codigoEstudiante);
        System.out.println("Fecha: " + fechaInscripcion);
        System.out.println("Estado: " + (activa ? "ACTIVA" : "CANCELADA"));
    }
    
    public void cancelar() {
        if (activa) {
            activa = false;
            System.out.println("Inscripción cancelada");
        }
    }
    
    public boolean estaActiva() {
        return activa;
    }
    
    // Getters
    public String getCodigoCurso() {
        return codigoCurso;
    }
    
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }
}
```

**Criterios de evaluación:**
- ✅ Archivo compila sin errores (5 pts)
- ✅ Tiene 4+ atributos relevantes (5 pts)
- ✅ Tiene 3+ métodos funcionales (5 pts)
- ✅ Se relaciona lógicamente con las otras clases (5 pts)
- ✅ Código bien comentado (5 pts)

**Total:** 25 puntos

---

### Ejercicio 2: Gestión de Múltiples Objetos (30 puntos)

**Descripción:**  
Crea una clase "Gestor" o "Sistema" que maneje **arrays** de tus objetos del dominio.

**Requerimientos técnicos:**
- Nombre: `Sistema[Dominio].java` o `Gestor[Dominio].java`
  - Ejemplo: `SistemaAgenciaViajes.java`, `GestorRestaurante.java`
- Debe gestionar arrays de AL MENOS 2 de tus clases
- Mínimo **5 métodos**:
  - Agregar objeto
  - Buscar por algún criterio
  - Listar todos
  - Contar objetos
  - Método personalizado (según tu dominio)

**Ejemplo didáctico:**

```java
/**
 * Sistema que gestiona cursos y estudiantes
 */
public class SistemaCursos {
    // Arrays para almacenar objetos
    private Curso[] cursos;
    private Estudiante[] estudiantes;
    private Inscripcion[] inscripciones;
    private int contadorCursos;
    private int contadorEstudiantes;
    private int contadorInscripciones;
    
    // Constantes
    private static final int MAX_CURSOS = 50;
    private static final int MAX_ESTUDIANTES = 100;
    private static final int MAX_INSCRIPCIONES = 200;
    
    // Constructor
    public SistemaCursos() {
        this.cursos = new Curso[MAX_CURSOS];
        this.estudiantes = new Estudiante[MAX_ESTUDIANTES];
        this.inscripciones = new Inscripcion[MAX_INSCRIPCIONES];
        this.contadorCursos = 0;
        this.contadorEstudiantes = 0;
        this.contadorInscripciones = 0;
    }
    
    // Método 1: Agregar curso
    public boolean agregarCurso(Curso curso) {
        if (contadorCursos < MAX_CURSOS) {
            cursos[contadorCursos] = curso;
            contadorCursos++;
            System.out.println("✓ Curso agregado exitosamente");
            return true;
        }
        System.out.println("✗ No hay espacio para más cursos");
        return false;
    }
    
    // Método 2: Buscar curso por código
    public Curso buscarCursoPorCodigo(String codigo) {
        for (int i = 0; i < contadorCursos; i++) {
            if (cursos[i].getCodigoCurso().equals(codigo)) {
                return cursos[i];
            }
        }
        return null; // No encontrado
    }
    
    // Método 3: Listar todos los cursos
    public void listarCursos() {
        System.out.println("\n=== LISTA DE CURSOS ===");
        if (contadorCursos == 0) {
            System.out.println("No hay cursos registrados");
            return;
        }
        for (int i = 0; i < contadorCursos; i++) {
            cursos[i].mostrarInformacion();
            System.out.println("---");
        }
    }
    
    // Método 4: Contar cursos activos
    public int contarCursosActivos() {
        int activos = 0;
        for (int i = 0; i < contadorCursos; i++) {
            if (cursos[i].estaActivo()) {
                activos++;
            }
        }
        return activos;
    }
    
    // Método 5: Método personalizado - Inscribir estudiante
    public boolean inscribirEstudiante(String codigoCurso, 
                                       String codigoEstudiante) {
        // Verificar que curso existe
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        if (curso == null) {
            System.out.println("✗ Curso no encontrado");
            return false;
        }
        
        // Crear inscripción
        String codigoInsc = "INS" + (contadorInscripciones + 1);
        Inscripcion inscripcion = new Inscripcion(
            codigoInsc, codigoCurso, codigoEstudiante, "2025-10-23"
        );
        
        inscripciones[contadorInscripciones] = inscripcion;
        contadorInscripciones++;
        
        System.out.println("✓ Estudiante inscrito exitosamente");
        return true;
    }
    
    // Getters
    public int getTotalCursos() {
        return contadorCursos;
    }
    
    public int getTotalEstudiantes() {
        return contadorEstudiantes;
    }
}
```

**Criterios de evaluación:**
- ✅ Usa arrays correctamente (5 pts)
- ✅ Método agregar funciona (5 pts)
- ✅ Método buscar funciona (5 pts)
- ✅ Método listar funciona (5 pts)
- ✅ Métodos adicionales implementados (5 pts)
- ✅ Maneja contadores correctamente (5 pts)

**Total:** 30 puntos

---

### Ejercicio 3: Programa Integrado (25 puntos)

**Descripción:**  
Crea un programa `Main.java` que demuestre TODAS las funcionalidades de tu sistema.

**Requerimientos:**
- Debe usar la clase Sistema/Gestor
- Debe crear AL MENOS:
  - 3 objetos de tipo 1
  - 3 objetos de tipo 2
  - 2 objetos de tipo 3
- Debe demostrar:
  - Agregar objetos al sistema
  - Buscar objetos
  - Listar objetos
  - Interacción entre objetos
  
**Ejemplo didáctico:**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   SISTEMA DE GESTIÓN DE CURSOS V2.0   ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        // Crear el sistema
        SistemaCursos sistema = new SistemaCursos();
        
        // 1. AGREGAR CURSOS
        System.out.println("=== REGISTRANDO CURSOS ===");
        Curso curso1 = new Curso("POO101", "Prog. Orientada a Objetos", 
                                 "Dr. García", 40);
        Curso curso2 = new Curso("WEB201", "Desarrollo Web", 
                                 "Ing. López", 60);
        Curso curso3 = new Curso("BD301", "Bases de Datos", 
                                 "Dra. Martínez", 45);
        
        sistema.agregarCurso(curso1);
        sistema.agregarCurso(curso2);
        sistema.agregarCurso(curso3);
        
        // 2. AGREGAR ESTUDIANTES
        System.out.println("\n=== REGISTRANDO ESTUDIANTES ===");
        Estudiante est1 = new Estudiante("E001", "Pedro Ramírez", 
                                         "pedro@email.com");
        Estudiante est2 = new Estudiante("E002", "Ana Silva", 
                                         "ana@email.com");
        Estudiante est3 = new Estudiante("E003", "Luis Torres", 
                                         "luis@email.com");
        
        sistema.agregarEstudiante(est1);
        sistema.agregarEstudiante(est2);
        sistema.agregarEstudiante(est3);
        
        // 3. LISTAR CURSOS
        sistema.listarCursos();
        
        // 4. BUSCAR CURSO
        System.out.println("\n=== BUSCANDO CURSO ===");
        Curso encontrado = sistema.buscarCursoPorCodigo("POO101");
        if (encontrado != null) {
            System.out.println("✓ Curso encontrado:");
            encontrado.mostrarInformacion();
        }
        
        // 5. INSCRIBIR ESTUDIANTES
        System.out.println("\n=== INSCRIBIENDO ESTUDIANTES ===");
        sistema.inscribirEstudiante("POO101", "E001");
        sistema.inscribirEstudiante("WEB201", "E001");
        sistema.inscribirEstudiante("POO101", "E002");
        
        // 6. ESTADÍSTICAS
        System.out.println("\n=== ESTADÍSTICAS DEL SISTEMA ===");
        System.out.println("Total de cursos: " + sistema.getTotalCursos());
        System.out.println("Cursos activos: " + sistema.contarCursosActivos());
        System.out.println("Total estudiantes: " + sistema.getTotalEstudiantes());
        
        System.out.println("\n✓ Programa finalizado exitosamente");
    }
}
```

**Criterios de evaluación:**
- ✅ Compila y ejecuta sin errores (5 pts)
- ✅ Crea múltiples objetos (5 pts)
- ✅ Usa el sistema/gestor correctamente (5 pts)
- ✅ Demuestra búsquedas y listados (5 pts)
- ✅ Salida clara y formateada (5 pts)

**Total:** 25 puntos

---

### Ejercicio 4: Documento de Análisis Actualizado (20 puntos)

**Descripción:**  
Actualiza tu documento de análisis explicando las nuevas clases y relaciones.

**Nombre:** `ANALISIS.md` en `semana-02/docs/`

**Estructura:**

```markdown
# Análisis OO - Semana 02: [Tu Dominio]

## 1. Evolución del Modelo

### Semana 01 (Recap)
- Clase 1: [Nombre] - [Descripción breve]
- Clase 2: [Nombre] - [Descripción breve]

### Semana 02 (Nuevas adiciones)
- Clase 3: [Nombre] - [Descripción y justificación]
- Clase Sistema: [Nombre] - [Descripción y justificación]

## 2. Nueva Clase: [Clase3]

### Justificación
¿Por qué es necesaria esta tercera clase?
¿Qué problema del dominio resuelve?

### Atributos
- atributo1: tipo - descripción y justificación
- atributo2: tipo - descripción y justificación
- ...

### Métodos
- metodo1(): descripción y justificación
- metodo2(): descripción y justificación
- ...

### Relaciones
- Con [Clase1]: [Descripción de la relación]
- Con [Clase2]: [Descripción de la relación]

## 3. Clase Sistema/Gestor

### Responsabilidades
- Responsabilidad 1
- Responsabilidad 2
- Responsabilidad 3

### Decisiones de Diseño
- ¿Por qué usar arrays? (vs otras estructuras)
- ¿Qué capacidad máxima definiste y por qué?
- ¿Cómo manejas las búsquedas?

### Métodos Clave
- agregarX(): [explicación]
- buscarX(): [explicación]
- listarX(): [explicación]

## 4. Diagrama de Relaciones

```
┌─────────────┐         ┌─────────────┐
│   Clase1    │◇────────│   Clase3    │
└─────────────┘         └─────────────┘
       │                       │
       │                       │
       ▼                       ▼
┌─────────────┐         ┌─────────────┐
│   Clase2    │         │   Sistema   │
└─────────────┘         └─────────────┘
```

## 5. Mejoras Respecto a Semana 01

### Funcionalidades Nuevas
1. [Funcionalidad 1]
2. [Funcionalidad 2]
3. [Funcionalidad 3]

### Conceptos Aplicados
- Encapsulación mejorada
- Uso de arrays
- Métodos de búsqueda
- Gestión de múltiples objetos

## 6. Dificultades y Soluciones

### Dificultad 1: [Descripción]
**Solución:** [Cómo lo resolviste]

### Dificultad 2: [Descripción]
**Solución:** [Cómo lo resolviste]

## 7. Próximos Pasos (Semana 03)

¿Qué mejoras podrían hacerse?
- Mejorar encapsulación
- Agregar validaciones
- Usar constructores sobrecargados
- ...
```

**Criterios de evaluación:**
- ✅ Documento completo (5 pts)
- ✅ Justificación de nueva clase (5 pts)
- ✅ Explicación del sistema gestor (5 pts)
- ✅ Reflexión sobre mejoras (5 pts)

**Total:** 20 puntos

---

## 📦 Estructura de Entrega

```
bc-poo-java-[nombre]-[apellido]/
├── semana-01/              # Ya existe
│   └── ...
└── semana-02/              # NUEVA carpeta
    ├── README.md
    ├── src/
    │   ├── [Clase1].java       # Mejorada de semana-01
    │   ├── [Clase2].java       # Mejorada de semana-01
    │   ├── [Clase3].java       # NUEVA
    │   ├── Sistema[X].java     # NUEVA
    │   └── Main.java           # Mejorado
    └── docs/
        └── ANALISIS.md
```

---

## ✅ Checklist de Verificación

### Código
- [ ] Tercera clase implementada con 4+ atributos
- [ ] Clase Sistema/Gestor con arrays funcionales
- [ ] Método agregar funciona correctamente
- [ ] Método buscar funciona correctamente
- [ ] Método listar funciona correctamente
- [ ] Main demuestra todas las funcionalidades
- [ ] Todo compila sin errores
- [ ] Todo ejecuta sin excepciones

### Documentación
- [ ] ANALISIS.md completo y actualizado
- [ ] README.md en semana-02/
- [ ] Código comentado adecuadamente
- [ ] Instrucciones de ejecución claras

### Formato
- [ ] Carpeta semana-02/ creada en el repo
- [ ] Estructura src/ y docs/ correcta
- [ ] Nomenclatura PascalCase en clases
- [ ] No hay archivos .class en el repo
- [ ] Commit con mensaje descriptivo

---

## 📊 Tabla de Puntuación

| Ejercicio | Puntos | Descripción |
|-----------|--------|-------------|
| Ejercicio 1 | 25 | Tercera clase del dominio |
| Ejercicio 2 | 30 | Sistema gestor con arrays |
| Ejercicio 3 | 25 | Programa integrado |
| Ejercicio 4 | 20 | Análisis actualizado |
| **TOTAL** | **100** | |

---

## 💡 Consejos

### Para la Tercera Clase
- Piensa en qué información adicional necesita tu dominio
- Debe complementar, no duplicar lo existente
- Debe tener sentido en el contexto del negocio

### Para el Sistema Gestor
- Empieza con arrays pequeños (10-20 elementos)
- Usa contadores para rastrear elementos agregados
- Maneja casos donde no se encuentra lo buscado

### Para el Main
- Crea datos de prueba suficientes
- Demuestra casos exitosos Y fallidos
- Usa mensajes claros para el usuario

---

## 🚀 Comandos Git

```bash
# Crear estructura
cd bc-poo-java-[nombre]-[apellido]
mkdir -p semana-02/src semana-02/docs

# Agregar archivos
git add semana-02/

# Commit
git commit -m "feat(semana-02): agregar tercera clase y sistema gestor"

# Push
git push origin main
```

---

## 📚 Recursos

- `/semana-02/1-teoria/` - Teoría sobre instanciación y objetos
- `/semana-02/2-practica/` - Ejercicios con arrays
- `/semana-02/3-recursos/` - Ejemplos de gestores

---

## ❓ FAQ

**P: ¿Puedo modificar las clases de la semana-01?**  
R: Sí, pero manténlas en la carpeta semana-01. Copia las versiones mejoradas a semana-02.

**P: ¿Debo usar ArrayList o arrays simples?**  
R: En Semana 02, usa arrays simples. ArrayList se verá en semanas posteriores.

**P: ¿Cuántos objetos debo crear como mínimo?**  
R: Al menos 8 objetos en total (3+3+2 de cada tipo).

**P: ¿El sistema debe tener menú interactivo?**  
R: No es obligatorio en Semana 02. Un Main con secuencia fija es suficiente.

---

**¡Continúa construyendo tu proyecto! Cada semana será más completo.** 🚀
