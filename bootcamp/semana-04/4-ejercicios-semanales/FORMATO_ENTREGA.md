# Formato de Entrega - Semana 04

## 📋 Información General

**Semana:** 04 - Herencia  
**Tipo de trabajo:** Extensión con jerarquías de clases  
**Repositorio:** MISMO repositorio de semanas anteriores  
**Rama:** `main`

---

## ⚠️ IMPORTANTE

Esta semana **agregas nueva funcionalidad** mediante herencia, pero trabajas en el **mismo repositorio**.

**Pasos:**
1. Copia la carpeta `semana-03` completa
2. Renómbrala a `semana-04`
3. Refactoriza una clase existente como superclase
4. Agrega 2 nuevas subclases
5. **NO modifiques** los archivos de `semana-03`

---

## 📁 Estructura de Carpetas

```
bc-poo-java-[nombre]-[apellido]/
├── .gitignore
├── README.md
├── semana-01/
├── semana-02/
├── semana-03/
└── semana-04/              ⬅️ NUEVA carpeta esta semana
    ├── README.md
    ├── src/
    │   ├── [Superclase].java          # Refactorizada como superclase ✅
    │   ├── [Subclase1].java           # NUEVA - extiende superclase 🆕
    │   ├── [Subclase2].java           # NUEVA - extiende superclase 🆕
    │   ├── [Clase2].java              # Sin cambios (de semana-03)
    │   ├── [Clase3].java              # Sin cambios (de semana-03)
    │   ├── Sistema[X].java            # Actualizado para polimorfismo ✅
    │   └── Main.java                  # Demuestra herencia ✅
    └── docs/
        ├── DECISION_HERENCIA.md       # Decisión de diseño 🆕
        └── ANALISIS.md                # Análisis completo ✅
```

### Ejemplo Concreto: Sistema de Cursos

```
semana-04/
├── README.md
├── src/
│   ├── Curso.java                  # Superclase (refactorizada)
│   ├── CursoPresencial.java        # Subclase 1 (NUEVA)
│   ├── CursoVirtual.java           # Subclase 2 (NUEVA)
│   ├── Estudiante.java             # Sin cambios
│   ├── Instructor.java             # Sin cambios
│   ├── SistemaCursos.java          # Actualizado (array de Curso[])
│   └── Main.java                   # Demuestra herencia
└── docs/
    ├── DECISION_HERENCIA.md
    └── ANALISIS.md
```

---

## 🔧 Pasos de Trabajo

### 1. Copiar y Preparar

```bash
# Desde la raíz de tu repositorio
cd bc-poo-java-[tu-nombre]-[tu-apellido]

# Copiar semana-03 a semana-04
cp -r semana-03 semana-04

# Entrar a la nueva carpeta
cd semana-04
```

### 2. Actualizar README.md

Edita `semana-04/README.md`:

```markdown
# Semana 04 - Herencia

## Descripción
Implementación de jerarquías de clases aplicando herencia mediante `extends`, `super` y `@Override`.

## Dominio
[Tu dominio asignado]

## Jerarquía Implementada

```
        [Superclase]
           △
    ┌──────┴──────┐
    │             │
[Subclase1]   [Subclase2]
```

## Clases

### Jerarquía Principal
- `[Superclase].java` - Clase base con atributos comunes
- `[Subclase1].java` - Especialización 1 (agrega X atributos)
- `[Subclase2].java` - Especialización 2 (agrega Y atributos)

### Otras Clases
- `[Clase2].java` - [Descripción]
- `[Clase3].java` - [Descripción]
- `Sistema[X].java` - Gestor polimórfico (maneja superclase)
- `Main.java` - Demostración de herencia y polimorfismo

## Conceptos Aplicados
- ✅ Herencia con `extends`
- ✅ Constructores con `super()`
- ✅ Sobrescritura de métodos con `@Override`
- ✅ Polimorfismo (arrays de superclase)
- ✅ `instanceof` y casting
- ✅ Métodos específicos de subclases

## Compilación y Ejecución

```bash
# Compilar todos los archivos
javac src/*.java

# Ejecutar el programa
java -cp src Main
```

## Autor
[Tu nombre completo]  
Ficha: [Número de ficha]  
Fecha: [DD/MM/AAAA]
```

---

### 3. Refactorizar Superclase

Toma una de tus clases existentes y conviértela en **superclase**:

#### a) Identificar Atributos Comunes

```java
// ANTES (Semana 03) - Clase normal
public class Curso {
    private final String codigo;
    private String nombre;
    private int duracion;
    private String instructor;
    
    // Atributos que NO son comunes a todos los cursos
    private String salon;  // ⚠️ Solo cursos presenciales
    private String enlace; // ⚠️ Solo cursos virtuales
}

// DESPUÉS (Semana 04) - Superclase
public class Curso {
    // SOLO atributos comunes a TODOS los tipos de cursos
    private final String codigo;
    private String nombre;
    private int duracion;
    private String instructor;
    
    // Métodos comunes...
}
```

#### b) Estructura Básica de Superclase

```java
/**
 * Clase base para todos los tipos de [X]
 * @author [Tu Nombre]
 * @version 3.0 (Semana 04)
 */
public class [Superclase] {
    // ===== ATRIBUTOS COMUNES =====
    private final String codigo;  // ID único
    private String nombre;        // Nombre descriptivo
    // ... otros atributos comunes
    
    // ===== CONSTRUCTOR =====
    /**
     * Constructor de la superclase
     * @param codigo Código único
     * @param nombre Nombre descriptivo
     */
    public [Superclase](String codigo, String nombre) {
        // Validaciones
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código requerido");
        }
        
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    // ===== GETTERS Y SETTERS =====
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre requerido");
        }
        this.nombre = nombre;
    }
    
    // ===== MÉTODOS COMUNES (pueden ser sobrescritos) =====
    /**
     * Método que puede ser sobrescrito por subclases
     * @return Algún valor calculado
     */
    public double calcularAlgo() {
        // Lógica base
        return 0.0;
    }
    
    /**
     * Representación en texto del objeto
     * @return String con información básica
     */
    @Override
    public String toString() {
        return String.format("%s[%s] - %s", 
                            getClass().getSimpleName(), codigo, nombre);
    }
}
```

---

### 4. Crear Subclases

Para **cada subclase** (mínimo 2):

#### Plantilla de Subclase

```java
/**
 * Representa un [tipo específico] de [Superclase]
 * Extiende [Superclase] agregando [funcionalidad específica]
 * @author [Tu Nombre]
 * @version 3.0 (Semana 04)
 */
public class [Subclase1] extends [Superclase] {
    // ===== ATRIBUTOS ESPECÍFICOS =====
    private String atributoEspecifico1;
    private int atributoEspecifico2;
    // ... mínimo 2 atributos propios
    
    /**
     * Constructor de la subclase
     * @param codigo Parámetro de superclase
     * @param nombre Parámetro de superclase
     * @param atributo1 Parámetro específico de esta subclase
     * @param atributo2 Parámetro específico de esta subclase
     */
    public [Subclase1](String codigo, String nombre, 
                       String atributo1, int atributo2) {
        // ⚠️ super() SIEMPRE es la primera línea
        super(codigo, nombre);  // Llama constructor de superclase
        
        // Validaciones específicas
        if (atributo1 == null || atributo1.isEmpty()) {
            throw new IllegalArgumentException("Atributo1 requerido");
        }
        
        // Inicializar atributos propios
        this.atributoEspecifico1 = atributo1;
        this.atributoEspecifico2 = atributo2;
    }
    
    // ===== GETTERS Y SETTERS ESPECÍFICOS =====
    public String getAtributoEspecifico1() {
        return atributoEspecifico1;
    }
    
    public void setAtributoEspecifico1(String valor) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("Valor requerido");
        }
        this.atributoEspecifico1 = valor;
    }
    
    // ===== MÉTODOS SOBRESCRITOS =====
    /**
     * Versión especializada del método de la superclase
     * @return Valor calculado de forma específica
     */
    @Override
    public double calcularAlgo() {
        // Opción 1: Usar cálculo de superclase y extenderlo
        double base = super.calcularAlgo();
        return base + algúnRecargo;
        
        // Opción 2: Cálculo completamente nuevo
        // return calculoEspecífico;
    }
    
    /**
     * toString extendido con información específica
     * @return String completo
     */
    @Override
    public String toString() {
        // Llamar al toString de la superclase y agregar info
        return super.toString() + 
               String.format(" | %s: %s", "Tipo", atributoEspecifico1);
    }
    
    // ===== MÉTODOS ESPECÍFICOS (solo de esta subclase) =====
    /**
     * Método que solo tiene sentido para esta subclase
     * @return Algún resultado
     */
    public String metodoEspecifico() {
        return "Funcionalidad específica de " + getClass().getSimpleName();
    }
}
```

---

### 5. Actualizar Gestor (Sistema[X].java)

El gestor debe manejar la **superclase** para lograr polimorfismo:

```java
/**
 * Gestor que maneja [Superclase] y todas sus subclases
 * @author [Tu Nombre]
 * @version 3.0 (Semana 04 - con polimorfismo)
 */
public class Sistema[X] {
    // ⬇️ Array de tipo SUPERCLASE (puede contener cualquier subclase)
    private [Superclase][] items;
    private int cantidad;
    private static final int MAX = 50;
    
    public Sistema[X]() {
        this.items = new [Superclase][MAX];
        this.cantidad = 0;
    }
    
    /**
     * Agrega un item al sistema
     * ⚠️ El parámetro es de tipo SUPERCLASE (acepta cualquier subclase)
     * @param item Objeto de superclase o cualquier subclase
     * @return true si se agregó
     */
    public boolean agregar([Superclase] item) {
        if (item == null) {
            throw new IllegalArgumentException("Item no puede ser nulo");
        }
        
        if (cantidad >= MAX) {
            return false;
        }
        
        items[cantidad] = item;  // ⬅️ Polimorfismo
        cantidad++;
        return true;
    }
    
    /**
     * Lista todos los items (polimorfismo en acción)
     */
    public void listarTodos() {
        System.out.println("=== LISTA COMPLETA ===");
        for (int i = 0; i < cantidad; i++) {
            // toString() se ejecuta polimórficamente
            System.out.println((i + 1) + ". " + items[i].toString());
        }
    }
    
    /**
     * Filtra y muestra solo items de tipo Subclase1
     */
    public void listarTipo1() {
        System.out.println("=== ITEMS DE TIPO [Subclase1] ===");
        for (int i = 0; i < cantidad; i++) {
            if (items[i] instanceof [Subclase1]) {  // ⬅️ Verificar tipo
                [Subclase1] s1 = ([Subclase1]) items[i];  // ⬅️ Casting
                System.out.println(s1.toString());
                // Acceder a métodos específicos
                System.out.println("   " + s1.metodoEspecifico());
            }
        }
    }
    
    /**
     * Calcula algo usando polimorfismo
     * @return Suma de cálculos polimórficos
     */
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            // calcularAlgo() se ejecuta polimórficamente
            total += items[i].calcularAlgo();
        }
        return total;
    }
    
    /**
     * Genera reporte con estadísticas por tipo
     */
    public void generarReporte() {
        int tipo1 = 0;
        int tipo2 = 0;
        
        for (int i = 0; i < cantidad; i++) {
            if (items[i] instanceof [Subclase1]) {
                tipo1++;
            } else if (items[i] instanceof [Subclase2]) {
                tipo2++;
            }
        }
        
        System.out.println("=== REPORTE ===");
        System.out.println("Total items: " + cantidad);
        System.out.println("Tipo 1: " + tipo1);
        System.out.println("Tipo 2: " + tipo2);
    }
}
```

---

### 6. Crear Main Integrador

Tu `Main.java` debe **demostrar herencia y polimorfismo**:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE HERENCIA - SEMANA 04 ===\n");
        
        Sistema[X] sistema = new Sistema[X]();
        
        // ===== 1. CREAR OBJETOS DE SUBCLASES =====
        System.out.println("--- Creando objetos de subclases ---");
        
        [Subclase1] obj1 = new [Subclase1]("C001", "Nombre1", "AtributoA", 10);
        System.out.println("✅ Creado: " + obj1.getNombre());
        
        [Subclase2] obj2 = new [Subclase2]("C002", "Nombre2", "AtributoB", 20);
        System.out.println("✅ Creado: " + obj2.getNombre());
        
        // ===== 2. POLIMORFISMO: Variable de tipo superclase =====
        System.out.println("\n--- Polimorfismo ---");
        
        [Superclase] refPoli;  // Variable de tipo superclase
        
        refPoli = obj1;  // Apunta a Subclase1
        System.out.println("RefPoli apunta a: " + refPoli.getClass().getSimpleName());
        
        refPoli = obj2;  // Ahora apunta a Subclase2
        System.out.println("RefPoli apunta a: " + refPoli.getClass().getSimpleName());
        
        // ===== 3. AGREGAR AL GESTOR (polimorfismo) =====
        System.out.println("\n--- Agregando al sistema ---");
        sistema.agregar(obj1);  // Acepta Subclase1
        sistema.agregar(obj2);  // Acepta Subclase2
        System.out.println("✅ Objetos agregados");
        
        // ===== 4. LISTAR (toString polimórfico) =====
        System.out.println("\n--- Listado completo ---");
        sistema.listarTodos();
        
        // ===== 5. FILTRAR POR TIPO (instanceof) =====
        System.out.println("\n--- Filtros por tipo ---");
        sistema.listarTipo1();
        
        // ===== 6. CÁLCULOS POLIMÓRFICOS =====
        System.out.println("\n--- Cálculos ---");
        System.out.println("Total calculado: " + sistema.calcularTotal());
        
        // ===== 7. MÉTODOS ESPECÍFICOS (casting) =====
        System.out.println("\n--- Métodos específicos ---");
        if (obj1 instanceof [Subclase1]) {
            System.out.println(obj1.metodoEspecifico());
        }
        
        // ===== 8. REPORTE =====
        System.out.println("\n--- Reporte final ---");
        sistema.generarReporte();
        
        System.out.println("\n=== FIN ===");
    }
}
```

---

### 7. Crear Documentación

#### Archivo 1: `semana-04/docs/DECISION_HERENCIA.md`

Ver sección completa en `EJERCICIOS_SEMANALES.md` (Ejercicio 1).

#### Archivo 2: `semana-04/docs/ANALISIS.md`

Ver sección completa en `EJERCICIOS_SEMANALES.md` (Ejercicio 4).

---

## ✅ Checklist Pre-Entrega

### Estructura
- [ ] Carpeta `semana-04` creada
- [ ] `README.md` actualizado
- [ ] Todos los archivos `.java` en `src/`
- [ ] Ambos archivos de documentación en `docs/`

### Superclase
- [ ] Contiene solo atributos comunes
- [ ] Constructores con validaciones
- [ ] Métodos aplicables a todas las subclases
- [ ] JavaDoc completo

### Subclases (cada una)
- [ ] Usa `extends [Superclase]`
- [ ] Mínimo 2 atributos específicos
- [ ] Constructor llama a `super()` en primera línea
- [ ] Sobrescribe mínimo 1 método con `@Override`
- [ ] `toString()` llama a `super.toString()`
- [ ] JavaDoc completo

### Gestor
- [ ] Array es de tipo superclase: `[Superclase][]`
- [ ] Método `agregar()` acepta superclase como parámetro
- [ ] Usa `instanceof` para filtrar por tipo
- [ ] Demuestra polimorfismo (calcularAlgo, toString)
- [ ] Genera reporte con estadísticas

### Main
- [ ] Crea objetos de ambas subclases
- [ ] Usa variable de tipo superclase (polimorfismo)
- [ ] Demuestra `instanceof` y casting
- [ ] Llama métodos comunes y específicos
- [ ] Salida clara y organizada

### Documentación
- [ ] `DECISION_HERENCIA.md` completo
- [ ] `ANALISIS.md` con diagrama UML
- [ ] Comparación antes/después
- [ ] Ventajas de herencia explicadas

### Compilación
- [ ] Compila sin errores: `javac src/*.java`
- [ ] Ejecuta correctamente: `java -cp src Main`
- [ ] Sin warnings

---

## 🚀 Comandos Git para Entrega

```bash
# 1. Verificar estado
git status

# 2. Agregar la nueva carpeta semana-04
git add semana-04/

# 3. Commit descriptivo
git commit -m "feat(semana-04): implementar jerarquía con herencia

What? 
- Clase [Superclase] refactorizada como clase base
- [Subclase1] y [Subclase2] extienden [Superclase]
- Sistema gestor actualizado para polimorfismo
- Main integrador con demostraciones completas
- Documentación con diagrama UML y análisis

For? 
Aplicar herencia para reutilizar código y especializar comportamientos

Impact? 
Sistema más extensible, mantenible y orientado a objetos"

# 4. Subir a GitHub
git push origin main

# 5. Verificar en GitHub que semana-04 está visible
```

---

## 📊 Criterios de Evaluación

| Aspecto | Puntos | Detalles |
|---------|--------|----------|
| **Jerarquía diseñada** | 20 | Superclase apropiada, decisión documentada |
| **Subclases especializadas** | 30 | Atributos propios, super(), @Override |
| **Gestor polimórfico** | 25 | Array de superclase, instanceof, métodos genéricos |
| **Integración y docs** | 25 | Main completo, diagramas UML, análisis |
| **TOTAL** | **100** | |

---

## 💡 Tips Importantes

### Relación IS-A (ES-UN)

```
✅ Correcto: "Un CursoVirtual ES-UN Curso"
✅ Correcto: "Un LibroDigital ES-UN Libro"
❌ Incorrecto: "Un Curso TIENE-UN Instructor" (composición, no herencia)
```

### Uso de `super()`

```java
// ✅ Correcto
public Subclase(String a, String b) {
    super(a);  // Primera línea
    this.b = b;
}

// ❌ Incorrecto
public Subclase(String a, String b) {
    this.b = b;  // ❌ No puede ir antes de super()
    super(a);
}
```

### Polimorfismo

```java
// Variable de tipo superclase puede referenciar subclases
Curso c;

c = new CursoPresencial(...);  // ✅ Válido
c = new CursoVirtual(...);     // ✅ Válido

// Métodos se ejecutan según el tipo REAL
System.out.println(c.toString());  // Llama al toString de la subclase
```

---

## ❓ Preguntas Frecuentes

### ¿Debo modificar semana-03?
**No**, semana-03 queda como histórico.

### ¿Cuántas subclases debo crear?
**Mínimo 2** para cumplir con la rúbrica.

### ¿Puedo tener jerarquías más profundas (subclases de subclases)?
Sí, pero **no es necesario** esta semana. Enfócate en una jerarquía simple: 1 superclase → 2 subclases.

### ¿Qué métodos debo sobrescribir?
Como mínimo:
- `toString()` (obligatorio)
- Algún método de lógica de negocio (ej: `calcularCosto()`)

### ¿Debo usar `abstract`?
**No es obligatorio** esta semana. Las clases abstractas se verán en semana 06.

### Mi dominio no tiene variantes obvias, ¿qué hago?
Consulta con tu instructor. Ejemplos:
- Cliente → ClienteFrecuente, ClienteNuevo
- Empleado → EmpleadoTiempoCompleto, EmpleadoPorHoras
- Producto → ProductoPerecible, ProductoNoPerecible

### ¿Cómo compilo si tengo muchos archivos?
```bash
# Compilar todos los .java de una vez
javac src/*.java

# Ejecutar
java -cp src Main
```

---

## 🔗 Referencias

- **Formato Detallado**: Ver `EJERCICIOS_SEMANALES.md` en esta carpeta
- **Herencia en Java**: [Oracle Docs - Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- **Polimorfismo**: [Oracle Docs - Polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
- **Diagramas UML**: [Visual Paradigm - Class Diagrams](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-class-diagram-tutorial/)

---

## 📧 Contacto

Si tienes dudas sobre herencia, polimorfismo o el formato de entrega, consulta con tu instructor.

---

**Recuerda:** Herencia representa relación "ES-UN". Si tu subclase ES-UN tipo específico de la superclase, estás en el camino correcto. 🚀
