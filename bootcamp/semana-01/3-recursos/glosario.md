# Glosario - Semana 01: Introducción a POO

## 📚 Índice Alfabético

[A](#a) | [B](#b) | [C](#c) | [E](#e) | [H](#h) | [I](#i) | [J](#j) | [M](#m) | [O](#o) | [P](#p) | [S](#s)

---

## A

### Abstracción
**Definición:** Proceso de ocultar los detalles complejos de implementación y exponer solo la funcionalidad esencial.

**Ejemplo:**
```java
// Usuario solo ve el método simple
boton.click(); 
// No necesita saber los detalles internos de cómo funciona
```

**Analogía:** Un control remoto de TV - presionas botones simples sin saber la electrónica interna.

---

### API (Application Programming Interface)
**Definición:** Conjunto de métodos y funciones que una clase o sistema expone para que otros puedan usarla.

**Ejemplo:** Los métodos públicos de una clase forman su API.

---

### Atributo
**Definición:** Variable que pertenece a una clase y define las características o propiedades de los objetos.

**Sinónimos:** Campo, variable de instancia, propiedad

**Ejemplo:**
```java
public class Persona {
    String nombre;    // Atributo
    int edad;         // Atributo
}
```

**Nota:** Cada objeto tiene su propia copia de los atributos.

---

## B

### Bytecode
**Definición:** Código intermedio generado por el compilador de Java que es interpretado por la JVM.

**Proceso:**
```
Código.java → javac → Codigo.class (bytecode) → JVM → Ejecución
```

**Ventaja:** El mismo bytecode corre en cualquier plataforma con JVM.

---

## C

### Clase
**Definición:** Plantilla o molde que define la estructura y comportamiento de los objetos.

**Analogía:** Plano de una casa (clase) vs casa construida (objeto)

**Sintaxis:**
```java
public class NombreClase {
    // Atributos
    // Métodos
}
```

**Características:**
- Define QUÉ datos tendrán los objetos (atributos)
- Define QUÉ pueden hacer los objetos (métodos)

---

### Constructor
**Definición:** Método especial que se ejecuta al crear un objeto, utilizado para inicializar atributos.

**Ejemplo:**
```java
public class Persona {
    String nombre;
    
    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

Persona p = new Persona("Juan"); // Llama al constructor
```

**Nota:** Si no defines constructor, Java crea uno vacío automáticamente.

---

## E

### Encapsulación
**Definición:** Pilar de POO que consiste en ocultar los datos internos de un objeto y exponer solo métodos públicos para acceder a ellos.

**Objetivo:** Proteger los datos de modificaciones no autorizadas.

**Ejemplo:**
```java
public class CuentaBancaria {
    private double saldo; // Oculto
    
    public void depositar(double monto) { // Acceso controlado
        if (monto > 0) {
            saldo += monto;
        }
    }
}
```

**Beneficio:** Validaciones centralizadas, datos protegidos.

---

### Estado
**Definición:** Conjunto de valores actuales de los atributos de un objeto en un momento dado.

**Ejemplo:**
```java
Persona p = new Persona();
p.nombre = "Juan";
p.edad = 25;
// Estado: {nombre: "Juan", edad: 25}
```

---

## H

### Herencia
**Definición:** Pilar de POO que permite crear nuevas clases basadas en clases existentes, heredando sus atributos y métodos.

**Palabra clave:** `extends`

**Ejemplo:**
```java
class Animal {
    void comer() { }
}

class Perro extends Animal {
    void ladrar() { }
}

Perro perro = new Perro();
perro.comer();  // Heredado de Animal
perro.ladrar(); // Propio de Perro
```

**Beneficio:** Reutilización de código, jerarquías lógicas.

---

## I

### Instancia
**Definición:** Objeto concreto creado a partir de una clase.

**Sinónimo:** Objeto

**Ejemplo:**
```java
Persona p1 = new Persona(); // p1 es una instancia de Persona
Persona p2 = new Persona(); // p2 es otra instancia
```

---

### Instanciación
**Definición:** Proceso de crear un objeto a partir de una clase usando el operador `new`.

**Sintaxis:**
```java
NombreClase variable = new NombreClase();
```

**Qué sucede:**
1. Se reserva memoria para el objeto
2. Se ejecuta el constructor
3. Se retorna la referencia al objeto

---

### Interfaz
**Definición:** Contrato que especifica qué métodos debe implementar una clase, sin definir cómo.

**Palabra clave:** `interface`, `implements`

**Ejemplo:**
```java
interface Volador {
    void volar();
}

class Avion implements Volador {
    public void volar() {
        System.out.println("Volando...");
    }
}
```

**Beneficio:** Múltiples clases pueden implementar la misma interfaz.

---

## J

### JDK (Java Development Kit)
**Definición:** Kit de desarrollo que incluye herramientas para compilar, ejecutar y depurar programas Java.

**Incluye:**
- JRE (Java Runtime Environment)
- javac (compilador)
- jar (empaquetador)
- javadoc (generador de documentación)

---

### JRE (Java Runtime Environment)
**Definición:** Entorno de ejecución que incluye la JVM y librerías necesarias para ejecutar programas Java.

**Incluye:**
- JVM (Java Virtual Machine)
- Librerías estándar de Java

---

### JVM (Java Virtual Machine)
**Definición:** Máquina virtual que ejecuta bytecode de Java.

**Función:** Permite que el mismo programa corra en diferentes sistemas operativos.

**Relación:**
```
JDK ⊃ JRE ⊃ JVM
```

---

## M

### Método
**Definición:** Función que pertenece a una clase y define el comportamiento de los objetos.

**Sinónimos:** Función miembro, operación

**Sintaxis:**
```java
public tipoRetorno nombreMetodo(parametros) {
    // Cuerpo del método
}
```

**Tipos:**
- **void:** No retorna nada
- **Con retorno:** Retorna un valor

**Ejemplo:**
```java
public int sumar(int a, int b) {
    return a + b;
}
```

---

### Modificador de Acceso
**Definición:** Palabra clave que controla la visibilidad de clases, atributos y métodos.

**Tipos:**
- `public` - Accesible desde cualquier lugar
- `private` - Solo accesible dentro de la clase
- `protected` - Accesible en la clase y subclases
- (sin modificador) - Accesible en el mismo paquete

**Ejemplo:**
```java
public class Persona {
    private String nombre;    // Solo dentro de Persona
    public void saludar() { } // Accesible desde fuera
}
```

---

## O

### Objeto
**Definición:** Instancia concreta de una clase que tiene estado (valores de atributos) y comportamiento (métodos).

**Características:**
- Ocupa memoria
- Tiene identidad única
- Puede interactuar con otros objetos

**Ejemplo:**
```java
Coche miCoche = new Coche(); // miCoche es un objeto
miCoche.marca = "Toyota";
miCoche.arrancar();
```

---

### Operador `new`
**Definición:** Operador que crea un nuevo objeto en memoria.

**Sintaxis:**
```java
Clase variable = new Clase();
```

**Qué hace:**
1. Reserva memoria
2. Inicializa atributos
3. Ejecuta constructor
4. Retorna referencia

---

## P

### Paradigma
**Definición:** Estilo o filosofía de programación que define cómo estructurar y organizar el código.

**Ejemplos:**
- Paradigma Estructurado (funciones, procedimientos)
- Paradigma Orientado a Objetos (clases, objetos)
- Paradigma Funcional (funciones puras, inmutabilidad)

---

### Parámetro
**Definición:** Variable que recibe un método para trabajar con datos externos.

**Ejemplo:**
```java
public void saludar(String nombre) {
    //                  ↑ parámetro
    System.out.println("Hola " + nombre);
}

saludar("Juan"); // "Juan" es el argumento
```

---

### Polimorfismo
**Definición:** Pilar de POO que permite que un mismo método se comporte de diferente manera según el objeto que lo invoca.

**Tipos:**
1. **Sobrecarga** (compile-time): Mismo nombre, diferentes parámetros
2. **Sobrescritura** (runtime): Redefinir método heredado

**Ejemplo:**
```java
class Animal {
    void hacerSonido() { }
}

class Perro extends Animal {
    void hacerSonido() { System.out.println("Guau"); }
}

class Gato extends Animal {
    void hacerSonido() { System.out.println("Miau"); }
}

Animal a1 = new Perro();
Animal a2 = new Gato();
a1.hacerSonido(); // Guau
a2.hacerSonido(); // Miau
```

---

### Programación Estructurada
**Definición:** Paradigma que organiza el código en secuencias, decisiones y repeticiones usando funciones.

**Características:**
- Variables globales
- Funciones independientes
- Flujo de control estructurado

---

### Programación Orientada a Objetos (POO)
**Definición:** Paradigma que organiza el código en objetos que contienen datos (atributos) y comportamientos (métodos).

**4 Pilares:**
1. Encapsulación
2. Herencia
3. Polimorfismo
4. Abstracción

---

## S

### Sobrecarga de Métodos
**Definición:** Definir múltiples métodos con el mismo nombre pero diferentes parámetros.

**Ejemplo:**
```java
public int sumar(int a, int b) {
    return a + b;
}

public double sumar(double a, double b) {
    return a + b;
}

public int sumar(int a, int b, int c) {
    return a + b + c;
}
```

---

### Sobrescritura de Métodos
**Definición:** Redefinir un método heredado en una subclase.

**Palabra clave:** `@Override`

**Ejemplo:**
```java
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}
```

---

### `this`
**Definición:** Palabra clave que se refiere al objeto actual.

**Usos:**
1. Diferenciar atributo de parámetro
2. Llamar a otro constructor
3. Pasar el objeto actual como argumento

**Ejemplo:**
```java
public class Persona {
    String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre; // this.nombre = atributo
    }
}
```

---

### Tipo de Dato
**Definición:** Clasificación que especifica qué tipo de valor puede almacenar una variable.

**Tipos en Java:**
- **Primitivos:** `int`, `double`, `boolean`, `char`, etc.
- **Referencia:** Clases, interfaces, arrays

---

### `void`
**Definición:** Palabra clave que indica que un método no retorna ningún valor.

**Ejemplo:**
```java
public void mostrarMensaje() {
    System.out.println("Hola");
    // No hay return
}
```

---

## 📚 Recursos Adicionales

- [Oracle Java Glossary](https://docs.oracle.com/javase/tutorial/information/glossary.html)
- [W3Schools Java Tutorial](https://www.w3schools.com/java/)

---

**Última actualización:** 3 de octubre de 2025  
**Bootcamp:** POO Java - SENA  
**Semana:** 1 - Introducción a POO
