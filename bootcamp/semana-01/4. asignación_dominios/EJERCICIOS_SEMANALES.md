# Ejercicios Semanales Evaluables - Semana 01

## 📋 Información General

**Semana:** 01 - Introducción al Paradigma Orientado a Objetos  
**Tipo:** Entregables obligatorios para evaluación automática  
**Peso en la evaluación:** 40% (Desempeño) + 30% (Producto) = 70% total  
**Fecha límite:** Final de la Semana 01  
**Formato de entrega:** Repositorio GitHub (ver especificaciones abajo)

---

## 🔴 IMPORTANTE: Formato de Entrega

**Antes de comenzar, lee detenidamente:**

### 📄 [FORMATO_ENTREGA.md](./FORMATO_ENTREGA.md)

Este documento define de forma **ESPECÍFICA y OBLIGATORIA**:
- ✅ Nomenclatura exacta del repositorio GitHub
- ✅ Estructura de carpetas (`semana-01/src/`, `semana-01/docs/`)
- ✅ Nombres de archivos (PascalCase para clases, `Main.java`, `ANALISIS.md`)
- ✅ Convenciones de código (camelCase, PascalCase, UPPER_SNAKE_CASE)
- ✅ Contenido del .gitignore
- ✅ Checklist completo de verificación

**⚠️ Entregas que NO sigan el formato especificado serán penalizadas.**

---

## 🎯 Objetivo

Aplicar los conceptos fundamentales de POO (clase, objeto, atributo, método) en el contexto de tu dominio asignado mediante ejercicios prácticos evaluables automáticamente.

---

## 📝 Ejercicios Obligatorios

### Ejercicio 1: Clase Principal del Dominio (30 puntos)

**Descripción:**  
Crea una clase que represente el **objeto principal** de tu dominio asignado.

**Requerimientos técnicos:**
- Nombre de archivo: `ObjetoPrincipal.java` (reemplaza con el nombre real, ej: `Reserva.java`, `Producto.java`, `Libro.java`)
- Mínimo **5 atributos** con tipos de datos apropiados:
  - Al menos 1 `String`
  - Al menos 1 `int` o `double`
  - Al menos 1 `boolean`
- Mínimo **4 métodos**:
  - 1 método `void` que imprima información
  - 1 método que retorne un valor calculado
  - 1 método getter
  - 1 método setter

**Ejemplo didáctico (dominio genérico):**

```java
// Ejemplo con Sistema de Gestión de Cursos Online (dominio NO asignado)
public class Curso {
    // Atributos (5 mínimo)
    private String codigoCurso;
    private String nombreCurso;
    private String instructor;
    private int duracionHoras;
    private boolean activo;
    
    // Constructor
    public Curso(String codigo, String nombre, String instructor, int horas) {
        this.codigoCurso = codigo;
        this.nombreCurso = nombre;
        this.instructor = instructor;
        this.duracionHoras = horas;
        this.activo = true;
    }
    
    // Método void (imprime información)
    public void mostrarInformacion() {
        System.out.println("=== CURSO ===");
        System.out.println("Código: " + codigoCurso);
        System.out.println("Nombre: " + nombreCurso);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Estado: " + (activo ? "ACTIVO" : "INACTIVO"));
    }
    
    // Método que retorna valor calculado
    public double calcularCostoTotal() {
        return duracionHoras * 15000; // $15,000 por hora
    }
    
    // Getter
    public String getCodigoCurso() {
        return codigoCurso;
    }
    
    // Setter
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
```

**Criterios de evaluación automática:**
- ✅ Archivo compila sin errores (5 puntos)
- ✅ Tiene 5+ atributos (5 puntos)
- ✅ Tipos de datos variados (5 puntos)
- ✅ Tiene 4+ métodos (5 puntos)
- ✅ Constructor inicializa atributos (5 puntos)
- ✅ Métodos tienen lógica funcional (5 puntos)

**Total:** 30 puntos

---

### Ejercicio 2: Clase Secundaria Relacionada (25 puntos)

**Descripción:**  
Crea una **segunda clase** que esté relacionada con la primera y complemente el dominio.

**Requerimientos técnicos:**
- Nombre de archivo: `ObjetoSecundario.java` (ej: `Cliente.java`, `Empleado.java`, `Autor.java`)
- Mínimo **4 atributos**
- Mínimo **3 métodos**
- Debe tener relación conceptual con la clase principal

**Ejemplos de relaciones según dominio:**
- **Tu dominio asignado:** Identifica dos clases relacionadas en TU contexto específico
- **Ejemplo genérico (NO usar):** `Curso.java` + `Estudiante.java`
- Debes analizar TU dominio y encontrar la relación apropiada

**Ejemplo didáctico (dominio genérico):**

```java
// Clase secundaria para Sistema de Cursos (ejemplo didáctico)
public class Estudiante {
    // Atributos (4 mínimo)
    private String codigo;
    private String nombre;
    private String email;
    private int cursosInscritos;
    
    // Constructor
    public Estudiante(String codigo, String nombre, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.cursosInscritos = 0;
    }
    
    // Métodos (3 mínimo)
    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Email: " + email);
        System.out.println("Cursos: " + cursosInscritos);
    }
    
    public void inscribirCurso() {
        cursosInscritos++;
    }
    
    public boolean esEstudianteActivo() {
        return cursosInscritos >= 1;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
}
```

**Criterios de evaluación automática:**
- ✅ Archivo compila sin errores (5 puntos)
- ✅ Tiene 4+ atributos (5 puntos)
- ✅ Tiene 3+ métodos (5 puntos)
- ✅ Relación conceptual con clase principal (5 puntos)
- ✅ Métodos tienen lógica funcional (5 puntos)

**Total:** 25 puntos

---

### Ejercicio 3: Programa de Demostración (20 puntos)

**Descripción:**  
Crea un programa principal que **demuestre el uso** de las dos clases anteriores.

**Requerimientos técnicos:**
- Nombre de archivo: `Main.java` o `PruebaDominio.java`
- Debe crear **mínimo 2 objetos** de cada clase
- Debe llamar a **todos los métodos** implementados
- Debe mostrar resultados en consola de forma clara

**Ejemplo didáctico (dominio genérico):**

```java
public class PruebaSistemaCursos {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE CURSOS ===\n");
        
        // Crear estudiantes
        Estudiante est1 = new Estudiante("E001", "Pedro Ramírez", "pedro@email.com");
        Estudiante est2 = new Estudiante("E002", "Ana Silva", "ana@email.com");
        
        // Crear cursos
        Curso curso1 = new Curso("POO101", "Prog. Orientada a Objetos", "Dr. García", 40);
        Curso curso2 = new Curso("WEB201", "Desarrollo Web", "Ing. López", 60);
        
        // Demostrar funcionalidad
        System.out.println("--- ESTUDIANTES ---");
        est1.mostrarDatos();
        System.out.println();
        est2.mostrarDatos();
        
        System.out.println("\n--- CURSOS ---");
        curso1.mostrarInformacion();
        System.out.println("\nCosto total: $" + curso1.calcularCostoTotal());
        
        System.out.println();
        curso2.mostrarInformacion();
        curso2.setActivo(false);
        System.out.println("\n--- Después de desactivar ---");
        curso2.mostrarInformacion();
        
        // Inscribir estudiante a curso
        est1.inscribirCurso();
        System.out.println("\n¿Estudiante activo?: " + est1.esEstudianteActivo());
    }
}
```

**Salida esperada:**
```
=== SISTEMA DE GESTIÓN DE CURSOS ===

--- ESTUDIANTES ---
Estudiante: Pedro Ramírez
Código: E001
Email: pedro@email.com
Cursos: 0

Estudiante: Ana Silva
Código: E002
Email: ana@email.com
Cursos: 0

--- CURSOS ---
=== CURSO ===
Código: POO101
Nombre: Prog. Orientada a Objetos
Instructor: Dr. García
Duración: 40 horas
Estado: ACTIVO

Costo total: $600000.0

=== CURSO ===
Código: WEB201
Nombre: Desarrollo Web
Instructor: Ing. López
Duración: 60 horas
Estado: ACTIVO

--- Después de desactivar ---
=== CURSO ===
Código: WEB201
Nombre: Desarrollo Web
Instructor: Ing. López
Duración: 60 horas
Estado: INACTIVO

¿Estudiante activo?: true
```

**Criterios de evaluación automática:**
- ✅ Archivo compila sin errores (5 puntos)
- ✅ Crea 2+ objetos de cada clase (5 puntos)
- ✅ Llama a todos los métodos (5 puntos)
- ✅ Salida formateada y clara (5 puntos)

**Total:** 20 puntos

---

### Ejercicio 4: Documento de Análisis (25 puntos)

**Descripción:**  
Crea un documento Markdown que explique tu análisis y diseño orientado a objetos.

**Requerimientos:**
- Nombre de archivo: `ANALISIS.md`
- Debe incluir las siguientes secciones:

**Estructura del documento:**

```markdown
# Análisis Orientado a Objetos - [Tu Dominio]

## 1. Identificación del Dominio

**Nombre del negocio:** [Nombre]
**Tipo:** [Tipo de negocio]
**Descripción:** [Descripción breve del dominio asignado]

## 2. Objetos Identificados

### Objeto Principal: [Nombre]
**¿Qué es?:** [Definición]
**Atributos identificados:**
- atributo1: tipo - descripción
- atributo2: tipo - descripción
- atributo3: tipo - descripción
- atributo4: tipo - descripción
- atributo5: tipo - descripción

**Métodos identificados:**
- metodo1(): descripción de qué hace
- metodo2(): descripción de qué hace
- metodo3(): descripción de qué hace
- metodo4(): descripción de qué hace

### Objeto Secundario: [Nombre]
**¿Qué es?:** [Definición]
**Atributos identificados:**
- atributo1: tipo - descripción
- atributo2: tipo - descripción
- atributo3: tipo - descripción
- atributo4: tipo - descripción

**Métodos identificados:**
- metodo1(): descripción
- metodo2(): descripción
- metodo3(): descripción

## 3. Relación entre Objetos

**Tipo de relación:** [Asociación, composición, etc.]
**Descripción:** Explica cómo se relacionan los dos objetos en el contexto del dominio.

Ejemplo: "Un Cliente puede tener múltiples Reservas. La Reserva necesita conocer el nombre del Cliente para registrar la información."

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**
[Explicación]

**¿Por qué estos atributos son importantes?**
[Explicación de cada atributo]

**¿Por qué estos métodos son necesarios?**
[Explicación de la lógica de negocio]

## 5. Comparación: POO vs Programación Estructurada

**Sin POO (Estructurado):**
[Explica cómo resolverías el mismo problema sin clases, solo con funciones y variables]

**Con POO:**
[Explica las ventajas de usar clases en tu solución]

**Ventajas específicas en mi dominio:**
1. [Ventaja 1]
2. [Ventaja 2]
3. [Ventaja 3]

## 6. Diagrama de Clases (Opcional)

```
┌─────────────────┐         ┌─────────────────┐
│   Clase1        │────────>│   Clase2        │
├─────────────────┤         ├─────────────────┤
│ - atributo1     │         │ - atributo1     │
│ - atributo2     │         │ - atributo2     │
├─────────────────┤         ├─────────────────┤
│ + metodo1()     │         │ + metodo1()     │
│ + metodo2()     │         │ + metodo2()     │
└─────────────────┘         └─────────────────┘
```
```

**Criterios de evaluación:**
- ✅ Documento completo con todas las secciones (5 puntos)
- ✅ Identificación clara de objetos (5 puntos)
- ✅ Atributos y métodos justificados (5 puntos)
- ✅ Comparación POO vs estructurado (5 puntos)
- ✅ Redacción clara y sin errores (5 puntos)

**Total:** 25 puntos

---

## 📦 Estructura de Entrega

Tu entrega debe tener la siguiente estructura:

```
semana-01/
├── ANALISIS.md
├── ObjetoPrincipal.java (ej: Reserva.java)
├── ObjetoSecundario.java (ej: Cliente.java)
├── Main.java (o PruebaDominio.java)
└── README.md (este archivo)
```

---

## ✅ Checklist de Verificación

Antes de entregar, verifica:

- [ ] **Ejercicio 1:** Clase principal con 5+ atributos y 4+ métodos
- [ ] **Ejercicio 2:** Clase secundaria con 4+ atributos y 3+ métodos
- [ ] **Ejercicio 3:** Programa Main que demuestra todas las funcionalidades
- [ ] **Ejercicio 4:** Documento ANALISIS.md completo
- [ ] **Compilación:** Todos los archivos `.java` compilan sin errores
- [ ] **Ejecución:** El programa Main se ejecuta sin errores
- [ ] **Nomenclatura:** Nombres de clases en PascalCase, métodos en camelCase
- [ ] **Comentarios:** Código tiene comentarios explicativos
- [ ] **Formato:** Código bien indentado y legible

---

## 📊 Tabla de Puntuación

| Ejercicio | Puntos | Descripción |
|-----------|--------|-------------|
| Ejercicio 1: Clase Principal | 30 | Objeto principal del dominio |
| Ejercicio 2: Clase Secundaria | 25 | Objeto relacionado |
| Ejercicio 3: Programa Demo | 20 | Main funcional |
| Ejercicio 4: Análisis | 25 | Documento de análisis |
| **TOTAL** | **100** | |

**Nota mínima aprobatoria:** 60 puntos (3.0/5.0)

---

## 🤖 Evaluación Automática

Tu código será evaluado automáticamente verificando:

1. **Compilación:** ¿Compila sin errores?
2. **Estructura:** ¿Tiene los atributos y métodos requeridos?
3. **Funcionalidad:** ¿Los métodos funcionan correctamente?
4. **Nomenclatura:** ¿Sigue las convenciones de Java?
5. **Ejecución:** ¿El programa Main se ejecuta sin excepciones?

**Herramienta de evaluación:** Script automático de validación

---

## 📚 Recursos de Apoyo

- **Teoría:** `/semana-01/1-teoria/`
- **Práctica:** `/semana-01/2-practica/`
- **Glosario:** `/semana-01/3-recursos/glosario.md`
- **Videos:** `/semana-01/3-recursos/videos.md`
- **Cheatsheet:** `/semana-01/3-recursos/cheatsheet-poo.md`

---

## ⏰ Fecha Límite

**Entrega:** Domingo 23:59 de la Semana 01  
**Plataforma:** [Definir plataforma - LMS, GitHub, etc.]

---

## ❓ Preguntas Frecuentes

**P: ¿Puedo usar más de 5 atributos?**  
R: Sí, el mínimo es 5, pero puedes usar más si tu dominio lo requiere.

**P: ¿Debo usar getters y setters para todos los atributos?**  
R: No es obligatorio para todos, pero sí al menos 1 getter y 1 setter.

**P: ¿Puedo usar constructores con parámetros?**  
R: Sí, es recomendado para inicializar los atributos.

**P: ¿El documento ANALISIS.md debe tener un formato específico?**  
R: Debe seguir la estructura proporcionada en el Ejercicio 4.

**P: ¿Qué pasa si mi código no compila?**  
R: El código debe compilar sin errores. Código que no compile obtiene 0 puntos en ese ejercicio.

---

**¡Éxito en tus ejercicios!** 🚀

Recuerda: La programación orientada a objetos es una forma de **pensar** y **modelar** el mundo real en código.
