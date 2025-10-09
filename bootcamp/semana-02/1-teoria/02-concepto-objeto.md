# 02 - ¿Qué es un Objeto?

## 📚 Introducción

Si una **clase** es el plano de una casa, entonces un **objeto** es la casa construida. El objeto es la materialización, la instancia concreta de la clase. Es algo tangible, con valores específicos y que existe en memoria.

## 🎯 Objetivos de Aprendizaje

Al finalizar este tema, podrás:
- Definir qué es un objeto en POO
- Diferenciar claramente entre clase y objeto
- Entender el proceso de instanciación
- Crear objetos en Java usando el operador `new`

---

## 🔍 Definición

> **Objeto:** Un objeto es una instancia específica de una clase. Es una entidad con estado (valores de atributos) y comportamiento (métodos) propios.

### Analogía Central

```
CLASE (Molde de galletas) ──────► OBJETOS (Galletas individuales)
                          crea
                          
Molde: Define la forma
Galletas: Cada una es única, tiene su propio sabor, decoración
```

---

## 🆚 Clase vs Objeto: Diferencias Fundamentales

| Aspecto | CLASE | OBJETO |
|---------|-------|--------|
| **Naturaleza** | Abstracta (plantilla) | Concreta (instancia) |
| **Existencia** | En código fuente | En memoria durante ejecución |
| **Cantidad** | Una definición | Muchas instancias posibles |
| **Valores** | No tiene valores | Tiene valores específicos |
| **Propósito** | Define estructura | Representa entidad real |

### Ejemplo Visual

```java
// ==================== CLASE ====================
// Plantilla genérica, sin valores específicos
public class Persona {
    String nombre;
    int edad;
}

// ==================== OBJETOS ====================
// Instancias concretas con valores específicos

Persona persona1 = new Persona();
persona1.nombre = "Juan Pérez";
persona1.edad = 25;

Persona persona2 = new Persona();
persona2.nombre = "María García";
persona2.edad = 30;

Persona persona3 = new Persona();
persona3.nombre = "Carlos López";
persona3.edad = 22;
```

```
┌─────────────────────┐
│   CLASE: Persona    │  ←── Plantilla (1 definición)
│   - nombre: String  │
│   - edad: int       │
└─────────────────────┘
           │
           │ instancia (new)
           ▼
    ┌──────┴──────┬──────────────┬──────────────┐
    │             │              │              │
┌───▼────┐  ┌────▼─────┐  ┌─────▼────┐  ┌─────▼────┐
│persona1│  │ persona2 │  │ persona3 │  │ persona4 │
│Juan, 25│  │María, 30 │  │Carlos, 22│  │Ana, 28   │
└────────┘  └──────────┘  └──────────┘  └──────────┘
    ↑           ↑             ↑             ↑
    └───────────┴─────────────┴─────────────┘
            OBJETOS (muchas instancias)
```

---

## 🏗️ Creación de Objetos: El Operador `new`

### Sintaxis

```java
NombreClase nombreVariable = new NombreClase();
│              │                │        │
│              │                │        └─ Constructor (veremos en Semana 03)
│              │                └─ Operador new (reserva memoria)
│              └─ Referencia al objeto
└─ Tipo de dato (la clase)
```

### Proceso de Instanciación

```java
// 1. Declara una variable de tipo Persona (referencia)
Persona miPersona;

// 2. Crea el objeto en memoria con 'new'
miPersona = new Persona();

// O en una sola línea:
Persona miPersona = new Persona();
```

---

## 🧠 ¿Qué hace el operador `new`?

Cuando ejecutas `new Persona()`, Java realiza estos pasos:

1. **Reserva memoria:** Asigna espacio en el heap para el nuevo objeto
2. **Inicializa atributos:** Asigna valores predeterminados (null, 0, false)
3. **Ejecuta constructor:** Llama al constructor de la clase (veremos después)
4. **Retorna referencia:** Devuelve la dirección de memoria del objeto

```java
Persona persona = new Persona();
//      ↑              ↑
//      │              └─ Crea objeto en memoria (heap)
//      └─ Guarda la dirección de memoria
```

---

## 🎯 Accediendo a Atributos y Métodos

Una vez creado el objeto, usamos el **operador punto (.)** para acceder a sus miembros:

### Sintaxis

```java
nombreObjeto.atributo          // Acceder a atributo
nombreObjeto.metodo()          // Llamar a método
```

### Ejemplo Completo

```java
// Crear objeto
Persona juan = new Persona();

// Asignar valores a atributos
juan.nombre = "Juan Pérez";
juan.edad = 25;
juan.altura = 1.75;

// Llamar métodos
juan.saludar();              // Imprime: ¡Hola! Soy Juan Pérez
juan.caminar();              // Imprime: Juan Pérez está caminando
juan.cumplirAnios();         // edad ahora es 26
```

---

## 💾 Objetos en Memoria

### Conceptos Importantes

```java
Persona persona1 = new Persona();
Persona persona2 = new Persona();
Persona persona3 = persona1;  // ¡Cuidado! Esto NO crea un nuevo objeto
```

#### Visualización en Memoria

```
STACK (Referencias)              HEAP (Objetos)
┌────────────────┐              ┌──────────────────┐
│ persona1 ──────┼─────────────►│ Objeto Persona 1 │
├────────────────┤              │ nombre: null     │
│ persona2 ──────┼────┐         │ edad: 0          │
├────────────────┤    │         └──────────────────┘
│ persona3 ──────┼────┼────┐
└────────────────┘    │    │    ┌──────────────────┐
                      └────┼───►│ Objeto Persona 2 │
                           │    │ nombre: null     │
                           │    │ edad: 0          │
                           │    └──────────────────┘
                           │
                           └────► (Apunta al MISMO objeto que persona1)
```

**Importante:** `persona3 = persona1` NO crea un nuevo objeto, solo crea otra referencia al mismo objeto.

---

## 🔢 Múltiples Objetos de la Misma Clase

Podemos crear tantos objetos como necesitemos de una misma clase:

```java
public class DemoObjetos {
    public static void main(String[] args) {
        // Crear 4 personas diferentes
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 25;
        
        Persona persona2 = new Persona();
        persona2.nombre = "María";
        persona2.edad = 30;
        
        Persona persona3 = new Persona();
        persona3.nombre = "Pedro";
        persona3.edad = 22;
        
        Persona persona4 = new Persona();
        persona4.nombre = "Ana";
        persona4.edad = 28;
        
        // Cada objeto tiene su propio estado
        persona1.saludar(); // ¡Hola! Soy Juan
        persona2.saludar(); // ¡Hola! Soy María
        persona3.saludar(); // ¡Hola! Soy Pedro
        persona4.saludar(); // ¡Hola! Soy Ana
    }
}
```

**Conclusión:** Cada objeto es independiente y tiene su propio estado (valores de atributos).

---

## 🚗 Ejemplo Completo: Clase Automóvil con Objetos

### Definición de la Clase

```java
public class Automovil {
    // Atributos
    String marca;
    String modelo;
    int anio;
    String color;
    double velocidadActual;
    
    // Método
    void acelerar() {
        velocidadActual += 10;
        System.out.println(marca + " " + modelo + " acelerando a " + velocidadActual + " km/h");
    }
}
```

### Creación y Uso de Objetos

```java
public class PruebaAutomovil {
    public static void main(String[] args) {
        
        // ========== OBJETO 1 ==========
        Automovil auto1 = new Automovil();
        auto1.marca = "Toyota";
        auto1.modelo = "Corolla";
        auto1.anio = 2024;
        auto1.color = "Gris";
        auto1.velocidadActual = 0.0;
        
        // ========== OBJETO 2 ==========
        Automovil auto2 = new Automovil();
        auto2.marca = "Ford";
        auto2.modelo = "Mustang";
        auto2.anio = 2023;
        auto2.color = "Rojo";
        auto2.velocidadActual = 0.0;
        
        // ========== OBJETO 3 ==========
        Automovil auto3 = new Automovil();
        auto3.marca = "Chevrolet";
        auto3.modelo = "Spark";
        auto3.anio = 2022;
        auto3.color = "Azul";
        auto3.velocidadActual = 0.0;
        
        // Usar los objetos
        System.out.println("=== ACELERANDO AUTOS ===");
        auto1.acelerar(); // Toyota Corolla acelerando a 10.0 km/h
        auto1.acelerar(); // Toyota Corolla acelerando a 20.0 km/h
        
        auto2.acelerar(); // Ford Mustang acelerando a 10.0 km/h
        
        auto3.acelerar(); // Chevrolet Spark acelerando a 10.0 km/h
        auto3.acelerar(); // Chevrolet Spark acelerando a 20.0 km/h
        auto3.acelerar(); // Chevrolet Spark acelerando a 30.0 km/h
        
        // Mostrar estado de cada auto
        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println(auto1.marca + " " + auto1.modelo + ": " + auto1.velocidadActual + " km/h");
        System.out.println(auto2.marca + " " + auto2.modelo + ": " + auto2.velocidadActual + " km/h");
        System.out.println(auto3.marca + " " + auto3.modelo + ": " + auto3.velocidadActual + " km/h");
    }
}
```

**Salida:**
```
=== ACELERANDO AUTOS ===
Toyota Corolla acelerando a 10.0 km/h
Toyota Corolla acelerando a 20.0 km/h
Ford Mustang acelerando a 10.0 km/h
Chevrolet Spark acelerando a 10.0 km/h
Chevrolet Spark acelerando a 20.0 km/h
Chevrolet Spark acelerando a 30.0 km/h

=== ESTADO FINAL ===
Toyota Corolla: 20.0 km/h
Ford Mustang: 10.0 km/h
Chevrolet Spark: 30.0 km/h
```

---

## 🎓 Características de los Objetos

### 1. **Identidad**
Cada objeto tiene una identidad única (dirección en memoria)

```java
Persona p1 = new Persona();
Persona p2 = new Persona();
// p1 y p2 son objetos DIFERENTES, aunque tengan los mismos valores
```

### 2. **Estado**
Los valores de sus atributos en un momento dado

```java
Persona juan = new Persona();
juan.nombre = "Juan";  // Estado inicial
juan.edad = 25;

juan.cumplirAnios();   // Estado cambia
// Ahora edad es 26
```

### 3. **Comportamiento**
Las acciones que puede realizar (métodos)

```java
juan.saludar();      // Comportamiento 1
juan.caminar();      // Comportamiento 2
juan.cumplirAnios(); // Comportamiento 3
```

---

## 💡 Valores Predeterminados

Cuando creas un objeto con `new`, Java asigna valores predeterminados:

| Tipo de Atributo | Valor Predeterminado |
|------------------|---------------------|
| `int`, `short`, `byte`, `long` | `0` |
| `float`, `double` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` (nulo) |
| **Objetos** (String, etc.) | `null` |

```java
Persona persona = new Persona();
// persona.nombre = null
// persona.edad = 0
// persona.altura = 0.0
```

---

## 🔑 Conceptos Clave

| Concepto | Definición |
|----------|------------|
| **Objeto** | Instancia concreta de una clase |
| **Instancia** | Sinónimo de objeto |
| **Instanciación** | Proceso de crear un objeto |
| **`new`** | Operador que crea objetos en memoria |
| **Referencia** | Variable que apunta a un objeto |
| **Estado** | Valores de los atributos del objeto |

---

## ⚠️ Errores Comunes

### 1. Usar un objeto sin crearlo

```java
Persona persona;              // Solo declara, NO crea el objeto
persona.nombre = "Juan";      // ❌ ERROR: NullPointerException
```

**Solución:**
```java
Persona persona = new Persona();  // Ahora sí existe el objeto
persona.nombre = "Juan";          // ✅ Funciona
```

### 2. Confundir clase con objeto

```java
// ❌ Incorrecto: Persona es una clase, no tiene valores
Persona.nombre = "Juan";

// ✅ Correcto: persona es un objeto, sí tiene valores
Persona persona = new Persona();
persona.nombre = "Juan";
```

---

## ✅ Verificación de Comprensión

1. ¿Qué es un objeto en POO?
2. ¿Cuál es la diferencia entre una clase y un objeto?
3. ¿Qué hace el operador `new`?
4. ¿Cómo se accede a los atributos y métodos de un objeto?
5. ¿Puedo crear múltiples objetos de la misma clase?

---

## 🔗 Relación con Otros Temas

- **Anterior:** 01 - ¿Qué es una Clase?
- **Siguiente:** 03 - Atributos y Métodos
- **Fundamento para:** Constructores (Semana 03)

---

## 📚 Recursos Adicionales

### Videos
- [Java Objects Explained](https://www.youtube.com/results?search_query=java+objects+explained)
- [Classes vs Objects in Java](https://www.youtube.com/results?search_query=java+classes+vs+objects)

### Documentación
- [Oracle: Creating Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html)

---

**Siguiente tema:** [03 - Atributos y Métodos](./03-atributos-metodos.md)

*Bootcamp POO Java - SENA 2025*
