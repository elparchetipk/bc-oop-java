# Paradigmas de Programación

## 📖 Índice
1. [¿Qué es un Paradigma de Programación?](#qué-es-un-paradigma-de-programación)
2. [Programación Estructurada](#programación-estructurada)
3. [Programación Orientada a Objetos](#programación-orientada-a-objetos)
4. [Comparación Detallada](#comparación-detallada)
5. [Ejemplo Práctico: Mismo Problema, Dos Enfoques](#ejemplo-práctico-mismo-problema-dos-enfoques)
6. [Ventajas y Desventajas](#ventajas-y-desventajas)

---

## 🤔 ¿Qué es un Paradigma de Programación?

### Definición

Un **paradigma de programación** es un estilo o forma de pensar y organizar el código para resolver problemas.

```
PARADIGMA = Filosofía + Reglas + Prácticas
```

### Analogía

> **Es como construir una casa:**
> - **Estructurado:** Construyes paso a paso (fundación → muros → techo)
> - **Orientado a Objetos:** Diseñas módulos prefabricados (habitación, baño, cocina) y los ensamblas

### Principales Paradigmas

```
┌─────────────────────────────────────┐
│  PARADIGMAS DE PROGRAMACIÓN         │
├─────────────────────────────────────┤
│  1. Estructurado                    │
│  2. Orientado a Objetos (POO)       │
│  3. Funcional                       │
│  4. Lógico                          │
│  5. Imperativo                      │
│  6. Declarativo                     │
└─────────────────────────────────────┘
```

**En este bootcamp:** Nos enfocaremos en **Estructurado** vs **POO**

---

## 📐 Programación Estructurada

### Características Principales

```java
┌─────────────────────────────────┐
│  PROGRAMACIÓN ESTRUCTURADA      │
├─────────────────────────────────┤
│  ✓ Secuencias de instrucciones  │
│  ✓ Funciones/procedimientos     │
│  ✓ Variables globales           │
│  ✓ Estructuras de control       │
│  ✓ Enfoque: PROCEDIMIENTOS      │
└─────────────────────────────────┘
```

### Filosofía

> "Divide el programa en funciones que procesan datos"

### Representación Visual

```
DATOS (variables globales)
    ↓
┌────────────────┐
│  Función 1     │ ← Opera sobre datos
└────────────────┘
    ↓
┌────────────────┐
│  Función 2     │ ← Opera sobre datos
└────────────────┘
    ↓
┌────────────────┐
│  Función 3     │ ← Opera sobre datos
└────────────────┘
```

### Ejemplo en Java

```java
/**
 * Gestión de estudiante - Enfoque Estructurado
 */
public class GestionEstudianteEstructurado {
    
    // Variables globales (datos)
    static String nombre;
    static int edad;
    static double nota1;
    static double nota2;
    static double nota3;
    
    // Función para calcular promedio
    static double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    
    // Función para determinar si aprobó
    static boolean aprobo() {
        return calcularPromedio() >= 3.0;
    }
    
    // Función para mostrar información
    static void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + (aprobo() ? "Aprobado" : "Reprobado"));
    }
    
    public static void main(String[] args) {
        // Inicializar datos
        nombre = "Juan Pérez";
        edad = 20;
        nota1 = 4.5;
        nota2 = 4.0;
        nota3 = 4.2;
        
        // Llamar funciones
        mostrarInformacion();
    }
}
```

### Ventajas

✅ **Simplicidad:** Fácil de entender para programas pequeños  
✅ **Ejecución lineal:** Flujo claro de arriba hacia abajo  
✅ **Eficiencia:** Generalmente rápido en ejecución  

### Desventajas

❌ **Escalabilidad limitada:** Difícil de mantener en proyectos grandes  
❌ **Reutilización limitada:** Difícil reutilizar código  
❌ **Acoplamiento fuerte:** Las funciones dependen de variables globales  
❌ **Difícil modelar el mundo real:** No refleja cómo pensamos sobre objetos  

---

## 🎯 Programación Orientada a Objetos

### Características Principales

```java
┌─────────────────────────────────┐
│  PROGRAMACIÓN ORIENTADA A       │
│  OBJETOS (POO)                  │
├─────────────────────────────────┤
│  ✓ Clases y objetos             │
│  ✓ Encapsulación                │
│  ✓ Herencia                     │
│  ✓ Polimorfismo                 │
│  ✓ Abstracción                  │
│  ✓ Enfoque: OBJETOS             │
└─────────────────────────────────┘
```

### Filosofía

> "Modela el programa como objetos que contienen datos y comportamientos"

### Representación Visual

```
OBJETO 1
┌─────────────────┐
│  Datos          │
│  - atributo1    │
│  - atributo2    │
├─────────────────┤
│  Comportamiento │
│  - método1()    │
│  - método2()    │
└─────────────────┘

OBJETO 2
┌─────────────────┐
│  Datos          │
│  - atributo1    │
│  - atributo2    │
├─────────────────┤
│  Comportamiento │
│  - método1()    │
│  - método2()    │
└─────────────────┘

Cada objeto es independiente
```

### Ejemplo en Java

```java
/**
 * Gestión de estudiante - Enfoque POO
 */
public class Estudiante {
    // Atributos (datos encapsulados en el objeto)
    private String nombre;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;
    
    // Constructor
    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    // Método para calcular promedio
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    
    // Método para determinar si aprobó
    public boolean aprobo() {
        return calcularPromedio() >= 3.0;
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + (aprobo() ? "Aprobado" : "Reprobado"));
    }
}

// Clase de prueba
public class PruebaEstudiante {
    public static void main(String[] args) {
        // Crear objeto estudiante
        Estudiante estudiante = new Estudiante("Juan Pérez", 20, 4.5, 4.0, 4.2);
        
        // Usar métodos del objeto
        estudiante.mostrarInformacion();
        
        // Crear múltiples estudiantes independientes
        Estudiante estudiante2 = new Estudiante("María García", 22, 3.8, 4.2, 3.5);
        estudiante2.mostrarInformacion();
    }
}
```

### Ventajas

✅ **Modelado natural:** Refleja cómo pensamos sobre el mundo real  
✅ **Reutilización:** Código fácilmente reutilizable (herencia)  
✅ **Mantenibilidad:** Fácil de actualizar y extender  
✅ **Encapsulación:** Datos protegidos dentro del objeto  
✅ **Escalabilidad:** Ideal para proyectos grandes  

### Desventajas

❌ **Curva de aprendizaje:** Más complejo al inicio  
❌ **Overhead:** Puede ser más lento que estructurado  
❌ **Complejidad inicial:** Requiere más planificación  

---

## ⚖️ Comparación Detallada

### Tabla Comparativa

| Aspecto | Estructurado | Orientado a Objetos |
|---------|-------------|---------------------|
| **Enfoque** | Funciones/procedimientos | Objetos (datos + métodos) |
| **Datos** | Variables globales | Encapsulados en objetos |
| **Reutilización** | Copiar/pegar funciones | Herencia y composición |
| **Modularidad** | Funciones independientes | Clases y objetos |
| **Seguridad** | Datos accesibles globalmente | Encapsulación protege datos |
| **Escalabilidad** | Limitada | Excelente |
| **Mantenimiento** | Difícil en proyectos grandes | Más fácil |
| **Modelado** | Basado en procesos | Basado en entidades del mundo real |
| **Complejidad inicial** | Baja | Moderada |
| **Ideal para** | Programas pequeños/scripts | Proyectos medianos y grandes |

### Diferencias Clave

#### 1. Organización de Datos

**Estructurado:**
```java
// Datos dispersos en variables globales
static String nombreEstudiante1;
static int edadEstudiante1;
static String nombreEstudiante2;
static int edadEstudiante2;
// ... difícil de gestionar
```

**POO:**
```java
// Datos agrupados en objetos
Estudiante estudiante1 = new Estudiante("Juan", 20);
Estudiante estudiante2 = new Estudiante("María", 22);
// ... organizado y claro
```

#### 2. Acceso a Datos

**Estructurado:**
```java
// Cualquier función puede modificar datos globales
static int saldo = 1000;

static void retirar(int monto) {
    saldo -= monto;  // Acceso directo
}

static void hackear() {
    saldo = 0;  // ¡Cualquiera puede modificar!
}
```

**POO:**
```java
public class Cuenta {
    private int saldo = 1000;  // Protegido
    
    public void retirar(int monto) {
        if (monto <= saldo) {
            saldo -= monto;  // Controlado
        }
    }
    
    // No hay forma de acceder directamente desde fuera
}
```

#### 3. Reutilización

**Estructurado:**
```java
// Para cada tipo de empleado, duplicas código
static void calcularSalarioProfesor() { /* ... */ }
static void calcularSalarioAdministrativo() { /* ... */ }
static void calcularSalarioDirector() { /* ... */ }
```

**POO:**
```java
// Clase base con lógica común
class Empleado {
    protected double salarioBase;
    
    public double calcularSalario() {
        return salarioBase;
    }
}

// Clases derivadas reutilizan y extienden
class Profesor extends Empleado {
    private int horasClase;
    
    @Override
    public double calcularSalario() {
        return salarioBase + (horasClase * 50);
    }
}
```

---

## 💻 Ejemplo Práctico: Mismo Problema, Dos Enfoques

### Problema: Sistema de Biblioteca

**Requerimiento:** Gestionar libros con título, autor, ISBN, disponibilidad

### Solución Estructurada

```java
public class BibliotecaEstructurada {
    // Variables globales para UN libro
    static String titulo;
    static String autor;
    static String isbn;
    static boolean disponible;
    
    // Funciones que operan sobre variables globales
    static void inicializarLibro(String t, String a, String i) {
        titulo = t;
        autor = a;
        isbn = i;
        disponible = true;
    }
    
    static void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado: " + titulo);
        } else {
            System.out.println("Libro no disponible");
        }
    }
    
    static void devolver() {
        disponible = true;
        System.out.println("Libro devuelto: " + titulo);
    }
    
    static void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
    
    public static void main(String[] args) {
        // Problema: ¿Cómo manejar múltiples libros?
        inicializarLibro("Don Quijote", "Cervantes", "123-456");
        mostrarInfo();
        prestar();
        
        // Para otro libro necesitarías más variables globales
        // o arrays complicados
    }
}
```

**Problemas:**
- ❌ Solo puedes manejar UN libro fácilmente
- ❌ Múltiples libros requieren arrays paralelos complicados
- ❌ Código difícil de mantener

### Solución POO

```java
/**
 * Clase Libro - Modelo del mundo real
 */
public class Libro {
    // Atributos (características del libro)
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;
    
    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;  // Por defecto disponible
    }
    
    // Métodos (comportamientos del libro)
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado: " + titulo);
        } else {
            System.out.println("Libro no disponible: " + titulo);
        }
    }
    
    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto: " + titulo);
    }
    
    public void mostrarInfo() {
        System.out.println("═══════════════════════");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("═══════════════════════");
    }
    
    // Getters
    public boolean estaDisponible() {
        return disponible;
    }
    
    public String getTitulo() {
        return titulo;
    }
}

/**
 * Sistema de biblioteca
 */
public class Biblioteca {
    public static void main(String[] args) {
        // Crear múltiples libros fácilmente
        Libro libro1 = new Libro("Don Quijote", "Cervantes", "123-456");
        Libro libro2 = new Libro("Cien Años de Soledad", "García Márquez", "789-012");
        Libro libro3 = new Libro("El Principito", "Saint-Exupéry", "345-678");
        
        // Usar cada libro independientemente
        libro1.mostrarInfo();
        libro1.prestar();
        libro1.prestar();  // Intenta prestar dos veces
        libro1.devolver();
        
        libro2.mostrarInfo();
        libro2.prestar();
        
        libro3.mostrarInfo();
        
        // Colección de libros
        Libro[] libros = {libro1, libro2, libro3};
        
        System.out.println("\n=== LIBROS DISPONIBLES ===");
        for (Libro libro : libros) {
            if (libro.estaDisponible()) {
                System.out.println("- " + libro.getTitulo());
            }
        }
    }
}
```

**Salida:**
```
═══════════════════════
Título: Don Quijote
Autor: Cervantes
ISBN: 123-456
Disponible: Sí
═══════════════════════
Libro prestado: Don Quijote
Libro no disponible: Don Quijote
Libro devuelto: Don Quijote
═══════════════════════
Título: Cien Años de Soledad
Autor: García Márquez
ISBN: 789-012
Disponible: Sí
═══════════════════════
Libro prestado: Cien Años de Soledad
═══════════════════════
Título: El Principito
Autor: Saint-Exupéry
ISBN: 345-678
Disponible: Sí
═══════════════════════

=== LIBROS DISPONIBLES ===
- Don Quijote
- El Principito
```

**Ventajas:**
- ✅ Múltiples libros fácilmente manejables
- ✅ Cada libro es independiente
- ✅ Código limpio y organizado
- ✅ Fácil de extender (agregar más libros)

---

## 📊 Ventajas y Desventajas

### Cuándo Usar Programación Estructurada

✅ **Ideal para:**
- Scripts pequeños
- Programas de procesamiento de datos simples
- Herramientas de línea de comandos
- Cálculos matemáticos sencillos
- Automatización básica

❌ **No recomendado para:**
- Sistemas grandes y complejos
- Aplicaciones que modelan el mundo real
- Software que requiere mantenimiento a largo plazo
- Proyectos con múltiples desarrolladores

### Cuándo Usar POO

✅ **Ideal para:**
- Aplicaciones empresariales
- Sistemas de gestión (inventarios, ventas, etc.)
- Videojuegos
- Aplicaciones web y móviles
- Software con múltiples entidades relacionadas
- Proyectos colaborativos

❌ **No necesariamente para:**
- Scripts muy simples (puede ser overkill)
- Problemas puramente algorítmicos
- Herramientas de procesamiento rápido

---

## 🎯 Puntos Clave

**Recuerda:**

1. 📐 **Estructurado:** Enfoque en funciones y procedimientos
2. 🎯 **POO:** Enfoque en objetos (datos + comportamiento)
3. 🔄 POO facilita **reutilización** con herencia
4. 🔒 POO ofrece mejor **encapsulación** de datos
5. 📈 POO es más **escalable** para proyectos grandes
6. 🌍 POO **modela mejor el mundo real**
7. ⚖️ Elige el paradigma según el **tamaño y complejidad** del proyecto

---

## 📚 Recursos Adicionales

- [Oracle: Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [GeeksforGeeks: Difference between Structured and Object-Oriented Programming](https://www.geeksforgeeks.org/difference-between-structured-and-object-oriented-programming/)

---

**Próximo tema:** [Conceptos Fundamentales de POO](./03-conceptos-fundamentales-poo.md)

---

**Última actualización:** 3 de octubre de 2025  
**Bootcamp:** POO Java - SENA  
**Semana:** 1 - Introducción a POO
