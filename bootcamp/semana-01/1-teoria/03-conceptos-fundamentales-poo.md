# Conceptos Fundamentales de POO

## 📖 Índice
1. [¿Qué es la POO?](#qué-es-la-poo)
2. [Clase](#clase)
3. [Objeto](#objeto)
4. [Atributos](#atributos)
5. [Métodos](#métodos)
6. [Relación Clase-Objeto](#relación-clase-objeto)
7. [Analogías del Mundo Real](#analogías-del-mundo-real)

---

## 🎯 ¿Qué es la POO?

### Definición

**Programación Orientada a Objetos (POO)** es un paradigma de programación que organiza el software en **objetos** que contienen datos (atributos) y código (métodos).

### Principio Fundamental

> "Modela el software como objetos que interactúan entre sí, similar a como funcionan las cosas en el mundo real."

### Pilares de la POO

La POO se basa en 4 pilares fundamentales:

```
┌─────────────────────────────────┐
│   PILARES DE LA POO             │
├─────────────────────────────────┤
│  1. Encapsulación               │
│  2. Herencia                    │
│  3. Polimorfismo                │
│  4. Abstracción                 │
└─────────────────────────────────┘
```

**En esta semana:** Nos enfocaremos en los conceptos básicos (clase, objeto, atributo, método)  
**Próximas semanas:** Profundizaremos en cada pilar

---

## 📦 Clase

### Definición

Una **clase** es una plantilla o molde que define la estructura y comportamiento de los objetos.

```java
// Sintaxis básica de una clase
public class NombreClase {
    // Atributos (datos)
    
    // Métodos (comportamientos)
}
```

### Características

- ✅ Define QUÉ datos tendrán los objetos (atributos)
- ✅ Define QUÉ pueden hacer los objetos (métodos)
- ✅ Es una abstracción del mundo real
- ✅ No ocupa memoria hasta que se crea un objeto

### Analogía

**Clase = Plano de una casa**

```
┌────────────────────────┐
│  PLANO DE CASA         │
├────────────────────────┤
│  - 3 habitaciones      │
│  - 2 baños             │
│  - 1 cocina            │
│  - Sala                │
│                        │
│  Funciones:            │
│  - Abrir puerta        │
│  - Encender luces      │
└────────────────────────┘
```

El plano define cómo serán las casas, pero no es una casa real.

### Ejemplo en Java

```java
/**
 * Clase que representa un Perro
 */
public class Perro {
    // Atributos
    String nombre;
    String raza;
    int edad;
    String color;
    
    // Métodos
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
    
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
    
    public void dormir() {
        System.out.println(nombre + " está durmiendo... Zzz");
    }
}
```

### Componentes de una Clase

```java
┌─────────────────────────────────────┐
│  public class Perro {               │
│                                     │
│    // 1. ATRIBUTOS (Datos)         │
│    String nombre;                   │
│    int edad;                        │
│                                     │
│    // 2. MÉTODOS (Comportamientos) │
│    public void ladrar() {           │
│        System.out.println("Guau");  │
│    }                                │
│  }                                  │
└─────────────────────────────────────┘
```

---

## 🎁 Objeto

### Definición

Un **objeto** es una **instancia** de una clase. Es una entidad concreta creada a partir de la plantilla (clase).

### Características

- ✅ Es una realización concreta de una clase
- ✅ Ocupa memoria en tiempo de ejecución
- ✅ Tiene valores específicos para sus atributos
- ✅ Puede ejecutar los métodos definidos en la clase

### Analogía

**Objeto = Casa construida**

```
De un mismo plano (clase) puedo construir múltiples casas (objetos)

CLASE: Perro
   ↓
OBJETOS:
- fido (nombre="Fido", raza="Labrador", edad=3)
- rocky (nombre="Rocky", raza="Bulldog", edad=5)
- luna (nombre="Luna", raza="Chihuahua", edad=2)
```

### Creación de Objetos (Instanciación)

```java
// Sintaxis: NombreClase nombreVariable = new NombreClase();

Perro miPerro = new Perro();
```

**Partes:**
1. `Perro` → Tipo de dato (la clase)
2. `miPerro` → Nombre de la variable
3. `new` → Operador que crea el objeto en memoria
4. `Perro()` → Constructor (lo veremos en semana-03)

### Ejemplo Completo

```java
public class PruebaPerro {
    public static void main(String[] args) {
        // Crear objeto
        Perro miPerro = new Perro();
        
        // Asignar valores a atributos
        miPerro.nombre = "Fido";
        miPerro.raza = "Labrador";
        miPerro.edad = 3;
        miPerro.color = "Dorado";
        
        // Usar métodos
        miPerro.ladrar();   // Fido dice: ¡Guau guau!
        miPerro.comer();    // Fido está comiendo.
        miPerro.dormir();   // Fido está durmiendo... Zzz
    }
}
```

### Múltiples Objetos

```java
public class PerreraDemo {
    public static void main(String[] args) {
        // Crear varios perros
        Perro perro1 = new Perro();
        perro1.nombre = "Fido";
        perro1.raza = "Labrador";
        
        Perro perro2 = new Perro();
        perro2.nombre = "Rocky";
        perro2.raza = "Bulldog";
        
        Perro perro3 = new Perro();
        perro3.nombre = "Luna";
        perro3.raza = "Chihuahua";
        
        // Cada objeto es independiente
        perro1.ladrar();  // Fido dice: ¡Guau guau!
        perro2.ladrar();  // Rocky dice: ¡Guau guau!
        perro3.ladrar();  // Luna dice: ¡Guau guau!
    }
}
```

### Visualización

```
MEMORIA:
┌────────────────────┐
│  perro1            │
│  ┌──────────────┐  │
│  │ nombre: Fido │  │
│  │ raza: Lab... │  │
│  │ edad: 3      │  │
│  └──────────────┘  │
└────────────────────┘

┌────────────────────┐
│  perro2            │
│  ┌──────────────┐  │
│  │ nombre: Rocky│  │
│  │ raza: Bull...│  │
│  │ edad: 5      │  │
│  └──────────────┘  │
└────────────────────┘

Cada objeto tiene su propio espacio en memoria
```

---

## 📊 Atributos

### Definición

Los **atributos** (también llamados **campos** o **variables de instancia**) son las características o propiedades que definen el estado de un objeto.

### Sintaxis

```java
public class Persona {
    // Atributos
    String nombre;      // Nombre de la persona
    int edad;           // Edad en años
    double altura;      // Altura en metros
    boolean esEstudiante; // ¿Es estudiante?
}
```

### Tipos de Atributos

#### 1. Atributos de Instancia

Cada objeto tiene su propia copia:

```java
public class Coche {
    String marca;    // Cada coche tiene su marca
    String modelo;   // Cada coche tiene su modelo
    int anio;        // Cada coche tiene su año
}

Coche coche1 = new Coche();
coche1.marca = "Toyota";  // Solo afecta a coche1

Coche coche2 = new Coche();
coche2.marca = "Honda";   // Solo afecta a coche2
```

#### 2. Atributos de Clase (static)

Compartido por todos los objetos:

```java
public class Contador {
    static int totalObjetos = 0;  // Compartido por todos
    
    public Contador() {
        totalObjetos++;  // Incrementa para todos
    }
}
```

**Por ahora:** Nos enfocamos en atributos de instancia  
**Más adelante:** Veremos atributos static en profundidad

### Acceso a Atributos

```java
// Sintaxis: objeto.atributo

Persona persona = new Persona();
persona.nombre = "Juan";        // Asignar valor
System.out.println(persona.nombre); // Leer valor
```

### Valores Predeterminados

Si no inicializas un atributo, Java le asigna un valor por defecto:

| Tipo | Valor Predeterminado |
|------|---------------------|
| `int`, `short`, `byte`, `long` | `0` |
| `float`, `double` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` (null character) |
| Referencias (String, etc.) | `null` |

```java
public class Demo {
    public static void main(String[] args) {
        Persona p = new Persona();
        System.out.println(p.nombre); // null
        System.out.println(p.edad);   // 0
    }
}
```

### Buenos Nombres de Atributos

**✅ Buenas prácticas:**
```java
String nombreCompleto;
int edadEnAnios;
double salarioMensual;
boolean estaActivo;
```

**❌ Malas prácticas:**
```java
String n;           // Muy corto, no descriptivo
int x;              // No dice qué representa
double valor;       // Ambiguo
boolean flag;       // No dice qué indica
```

---

## ⚙️ Métodos

### Definición

Los **métodos** son funciones que definen el **comportamiento** de los objetos. Representan las acciones que un objeto puede realizar.

### Sintaxis

```java
public tipoRetorno nombreMetodo(parametros) {
    // Cuerpo del método
    return valor; // Si retorna algo
}
```

### Componentes de un Método

```java
public void saludar(String destinatario) {
//  ↑     ↑      ↑           ↑
//  |     |      |           |
//  |     |      |           +-- Parámetro
//  |     |      +-------------- Nombre
//  |     +--------------------- Tipo de retorno
//  +--------------------------- Modificador de acceso
    
    System.out.println("Hola, " + destinatario);
    // Cuerpo del método
}
```

### Tipos de Métodos

#### 1. Métodos sin Retorno (void)

```java
public class Robot {
    public void moverse() {
        System.out.println("El robot se está moviendo...");
        // No retorna nada
    }
    
    public void hablar(String mensaje) {
        System.out.println("Robot dice: " + mensaje);
        // No retorna nada
    }
}

// Uso
Robot r = new Robot();
r.moverse();              // El robot se está moviendo...
r.hablar("Hola humano");  // Robot dice: Hola humano
```

#### 2. Métodos con Retorno

```java
public class Calculadora {
    public int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;  // Retorna un int
    }
    
    public double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;  // Retorna un double
    }
}

// Uso
Calculadora calc = new Calculadora();
int suma = calc.sumar(5, 3);          // suma = 8
double promedio = calc.calcularPromedio(new double[]{4.5, 3.8, 4.2});
```

#### 3. Métodos con y sin Parámetros

```java
public class Gato {
    String nombre;
    
    // Sin parámetros
    public void maullar() {
        System.out.println("¡Miau!");
    }
    
    // Con un parámetro
    public void llamar(String quien) {
        System.out.println(quien + " está llamando a " + nombre);
    }
    
    // Con múltiples parámetros
    public void jugar(String juguete, int minutos) {
        System.out.println(nombre + " juega con " + juguete + 
                          " por " + minutos + " minutos");
    }
}
```

### Métodos y Atributos

Los métodos pueden acceder a los atributos de la clase:

```java
public class CuentaBancaria {
    double saldo;  // Atributo
    
    // Método que usa y modifica el atributo
    public void depositar(double monto) {
        saldo = saldo + monto;  // Accede al atributo
        System.out.println("Nuevo saldo: " + saldo);
    }
    
    // Método que retorna el atributo
    public double consultarSaldo() {
        return saldo;  // Retorna el valor del atributo
    }
    
    // Método que usa el atributo en una condición
    public boolean puedeRetirar(double monto) {
        return saldo >= monto;  // Compara con el atributo
    }
}
```

### Ejemplo Completo: Clase Persona

```java
public class Persona {
    // Atributos
    String nombre;
    int edad;
    String profesion;
    
    // Método void sin parámetros
    public void presentarse() {
        System.out.println("Hola, soy " + nombre);
        System.out.println("Tengo " + edad + " años");
        System.out.println("Soy " + profesion);
    }
    
    // Método void con parámetro
    public void saludar(String otraPersona) {
        System.out.println("Hola " + otraPersona + ", soy " + nombre);
    }
    
    // Método con retorno
    public int calcularAnioNacimiento() {
        int anioActual = 2025;
        return anioActual - edad;
    }
    
    // Método con retorno y parámetro
    public boolean esMayorQue(Persona otra) {
        return this.edad > otra.edad;
    }
}

// Clase de prueba
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 25;
        persona1.profesion = "Programador";
        
        persona1.presentarse();
        // Hola, soy Juan
        // Tengo 25 años
        // Soy Programador
        
        persona1.saludar("María");
        // Hola María, soy Juan
        
        int anio = persona1.calcularAnioNacimiento();
        System.out.println("Nació en: " + anio);  // Nació en: 2000
        
        Persona persona2 = new Persona();
        persona2.nombre = "Pedro";
        persona2.edad = 30;
        
        boolean esMayor = persona2.esMayorQue(persona1);
        System.out.println("Pedro es mayor que Juan: " + esMayor); // true
    }
}
```

---

## 🔗 Relación Clase-Objeto

### Concepto Clave

```
CLASE ──crea──> OBJETO

Clase: Molde/Plantilla
Objeto: Instancia concreta
```

### Diagrama

```
┌─────────────────────────────┐
│       CLASE: Coche          │
│                             │
│  Atributos:                 │
│  - marca                    │
│  - modelo                   │
│  - año                      │
│                             │
│  Métodos:                   │
│  - arrancar()               │
│  - frenar()                 │
│  - acelerar()               │
└─────────────────────────────┘
         │
         │ new Coche()
         │
         ↓
┌─────────────────────┐  ┌─────────────────────┐  ┌─────────────────────┐
│  OBJETO: coche1     │  │  OBJETO: coche2     │  │  OBJETO: coche3     │
│                     │  │                     │  │                     │
│  marca: "Toyota"    │  │  marca: "Honda"     │  │  marca: "Ford"      │
│  modelo: "Corolla"  │  │  modelo: "Civic"    │  │  modelo: "Mustang"  │
│  año: 2023          │  │  año: 2022          │  │  año: 2024          │
└─────────────────────┘  └─────────────────────┘  └─────────────────────┘
```

### Reglas Importantes

1. **Una clase puede crear múltiples objetos**
   ```java
   Persona p1 = new Persona();
   Persona p2 = new Persona();
   Persona p3 = new Persona();
   // Todos de la misma clase, pero independientes
   ```

2. **Cada objeto es independiente**
   ```java
   p1.nombre = "Juan";
   p2.nombre = "María";
   // No se afectan entre sí
   ```

3. **Todos los objetos comparten la misma estructura**
   ```java
   // Todos tienen los mismos atributos y métodos
   // Pero con valores diferentes
   ```

---

## 🌍 Analogías del Mundo Real

### Analogía 1: Receta de Cocina

```
CLASE = Receta de Pizza
┌─────────────────────────┐
│ Ingredientes:           │
│ - Masa                  │
│ - Salsa de tomate       │
│ - Queso                 │
│ - Toppings              │
│                         │
│ Pasos:                  │
│ 1. Extender masa        │
│ 2. Agregar salsa        │
│ 3. Agregar queso        │
│ 4. Hornear              │
└─────────────────────────┘
         │
         │ new Pizza()
         ↓
┌────────────────┐  ┌────────────────┐  ┌────────────────┐
│ PIZZA 1        │  │ PIZZA 2        │  │ PIZZA 3        │
│ Pepperoni      │  │ Vegetariana    │  │ Hawaiana       │
└────────────────┘  └────────────────┘  └────────────────┘
```

### Analogía 2: Formulario

```
CLASE = Formulario en Blanco
┌─────────────────────────┐
│ FORMULARIO DE REGISTRO  │
│                         │
│ Nombre: ______________  │
│ Edad:   ______________  │
│ Email:  ______________  │
│ Ciudad: ______________  │
└─────────────────────────┘
         │
         │ llenar formulario
         ↓
┌─────────────────────────┐  ┌─────────────────────────┐
│ Nombre: Juan Pérez      │  │ Nombre: María García    │
│ Edad:   25              │  │ Edad:   30              │
│ Email:  juan@mail.com   │  │ Email:  maria@mail.com  │
│ Ciudad: Bogotá          │  │ Ciudad: Medellín        │
└─────────────────────────┘  └─────────────────────────┘
```

### Analogía 3: Molde de Galletas

```
CLASE = Molde de Estrella
    ⭐
    │
    │ presionar en masa
    ↓
⭐  ⭐  ⭐  ⭐  ⭐  (Objetos: galletas)
```

---

## 💻 Ejemplo Práctico Completo

```java
/**
 * Clase que representa un Estudiante
 */
public class Estudiante {
    // ===== ATRIBUTOS =====
    String nombre;
    String codigo;
    double notaMatematicas;
    double notaProgramacion;
    double notaIngles;
    
    // ===== MÉTODOS =====
    
    /**
     * Calcula el promedio de las tres notas
     * @return promedio de notas
     */
    public double calcularPromedio() {
        double suma = notaMatematicas + notaProgramacion + notaIngles;
        double promedio = suma / 3.0;
        return promedio;
    }
    
    /**
     * Determina si el estudiante aprobó (promedio >= 3.0)
     * @return true si aprobó, false si no
     */
    public boolean aprobo() {
        double promedio = calcularPromedio();
        return promedio >= 3.0;
    }
    
    /**
     * Muestra información completa del estudiante
     */
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Nota Matemáticas: " + notaMatematicas);
        System.out.println("Nota Programación: " + notaProgramacion);
        System.out.println("Nota Inglés: " + notaIngles);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + (aprobo() ? "APROBADO" : "REPROBADO"));
        System.out.println("==================================");
    }
    
    /**
     * Compara promedios con otro estudiante
     * @param otro otro estudiante a comparar
     * @return true si este estudiante tiene mejor promedio
     */
    public boolean tieneMejorPromedioQue(Estudiante otro) {
        return this.calcularPromedio() > otro.calcularPromedio();
    }
}

/**
 * Clase de prueba
 */
public class PruebaEstudiante {
    public static void main(String[] args) {
        // Crear primer estudiante
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan Pérez";
        estudiante1.codigo = "2025001";
        estudiante1.notaMatematicas = 4.5;
        estudiante1.notaProgramacion = 4.8;
        estudiante1.notaIngles = 4.2;
        
        // Crear segundo estudiante
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "María García";
        estudiante2.codigo = "2025002";
        estudiante2.notaMatematicas = 3.5;
        estudiante2.notaProgramacion = 3.8;
        estudiante2.notaIngles = 3.2;
        
        // Mostrar información
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        
        // Comparar estudiantes
        if (estudiante1.tieneMejorPromedioQue(estudiante2)) {
            System.out.println(estudiante1.nombre + " tiene mejor promedio");
        } else {
            System.out.println(estudiante2.nombre + " tiene mejor promedio");
        }
    }
}
```

**Salida:**
```
=== INFORMACIÓN DEL ESTUDIANTE ===
Nombre: Juan Pérez
Código: 2025001
Nota Matemáticas: 4.5
Nota Programación: 4.8
Nota Inglés: 4.2
Promedio: 4.5
Estado: APROBADO
==================================
=== INFORMACIÓN DEL ESTUDIANTE ===
Nombre: María García
Código: 2025002
Nota Matemáticas: 3.5
Nota Programación: 3.8
Nota Inglés: 3.2
Promedio: 3.5
Estado: APROBADO
==================================
Juan Pérez tiene mejor promedio
```

---

## 🎯 Puntos Clave

**Recuerda:**

1. 📦 **Clase** = Plantilla/Molde
2. 🎁 **Objeto** = Instancia concreta de una clase
3. 📊 **Atributos** = Datos/Características (estado)
4. ⚙️ **Métodos** = Comportamientos/Acciones
5. 🔗 Una clase puede crear múltiples objetos
6. 🎯 Cada objeto tiene sus propios valores de atributos
7. 🌍 POO modela el mundo real en código

---

## 📚 Recursos Adicionales

- [Oracle: What Is an Object?](https://docs.oracle.com/javase/tutorial/java/concepts/object.html)
- [Oracle: What Is a Class?](https://docs.oracle.com/javase/tutorial/java/concepts/class.html)

---

**Próximo tema:** [Primer Programa POO](./04-primer-programa-poo.md)

---

**Última actualización:** 3 de octubre de 2025  
**Bootcamp:** POO Java - SENA  
**Semana:** 1 - Introducción a POO
