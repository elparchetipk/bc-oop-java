# 01 - ¿Qué es una Clase?

## 📚 Introducción

Una **clase** es el concepto fundamental de la Programación Orientada a Objetos. Es la plantilla o molde a partir del cual se crean objetos. Piensa en una clase como el plano arquitectónico de una casa: define la estructura, pero no es la casa en sí misma.

## 🎯 Objetivos de Aprendizaje

Al finalizar este tema, podrás:
- Definir qué es una clase en POO
- Identificar los componentes de una clase
- Comprender la diferencia entre clase y objeto
- Escribir una clase básica en Java

---

## 🔍 Definición

> **Clase:** Una clase es una plantilla o molde que define las características (atributos) y comportamientos (métodos) que tendrán los objetos creados a partir de ella.

### Analogías del Mundo Real

| Analogía | Clase | Objeto |
|----------|-------|--------|
| 🏗️ **Construcción** | Plano arquitectónico | Casa construida |
| 🍪 **Cocina** | Molde de galletas | Galleta horneada |
| 📱 **Tecnología** | Diseño del iPhone | Tu iPhone específico |
| 🚗 **Automóviles** | Modelo Toyota Corolla | Tu Corolla con placa ABC-123 |

En todos estos casos:
- La **clase** es el diseño, el molde, la plantilla
- El **objeto** es la instancia concreta creada a partir de ese molde

---

## 🧩 Componentes de una Clase

Una clase en Java se compone de tres elementos principales:

### 1. **Atributos** (Variables de Instancia)
Representan el **estado** o las características del objeto.

```java
String nombre;
int edad;
double altura;
```

### 2. **Métodos** (Funciones)
Representan el **comportamiento** o las acciones que puede realizar el objeto.

```java
void saludar() { }
void caminar() { }
int calcularEdad() { }
```

### 3. **Constructores** (Veremos en Semana 03)
Métodos especiales que inicializan los objetos.

```java
public Persona(String nombre) {
    this.nombre = nombre;
}
```

---

## 📝 Sintaxis de una Clase en Java

### Estructura Básica

```java
[modificador] class NombreClase {
    // 1. ATRIBUTOS (Estado)
    tipo1 atributo1;
    tipo2 atributo2;
    
    // 2. MÉTODOS (Comportamiento)
    tipoRetorno nombreMetodo(parametros) {
        // código
    }
}
```

### Ejemplo Completo: Clase Persona

```java
/**
 * Clase que representa a una persona
 * Esta es la PLANTILLA, no es una persona específica
 */
public class Persona {
    // ATRIBUTOS - Características de una persona
    String nombre;
    int edad;
    double altura;
    
    // MÉTODOS - Acciones que puede hacer una persona
    void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }
    
    void caminar() {
        System.out.println(nombre + " está caminando");
    }
    
    void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años");
    }
}
```

---

## 🎨 Representación Visual

```
┌─────────────────────────────────┐
│         CLASE: Persona          │
├─────────────────────────────────┤
│  ATRIBUTOS (Estado)             │
│  - nombre: String               │
│  - edad: int                    │
│  - altura: double               │
├─────────────────────────────────┤
│  MÉTODOS (Comportamiento)       │
│  + saludar(): void              │
│  + caminar(): void              │
│  + cumplirAnios(): void         │
└─────────────────────────────────┘
```

Este es un **diagrama de clase UML** básico, una representación estándar en ingeniería de software.

---

## 🔑 Características Importantes

### 1. **La clase es solo una plantilla**
```java
// Esto define QUÉ ES una persona, pero no crea ninguna persona real
public class Persona {
    String nombre;
    int edad;
}
```

### 2. **Una clase puede crear múltiples objetos**
```java
// De la MISMA clase Persona puedo crear muchas personas diferentes
Persona persona1 = new Persona(); // Juan
Persona persona2 = new Persona(); // María
Persona persona3 = new Persona(); // Pedro
```

### 3. **Las clases encapsulan datos y comportamiento**
Una clase agrupa en un solo lugar:
- Los **datos** que describe (atributos)
- Las **operaciones** que puede hacer con esos datos (métodos)

---

## 💡 ¿Por qué usar Clases?

### Ventajas

1. **Organización:** Agrupa código relacionado
2. **Reutilización:** Una clase se puede usar muchas veces
3. **Mantenibilidad:** Cambios en un lugar afectan todos los objetos
4. **Abstracción:** Modela conceptos del mundo real
5. **Modularidad:** Código dividido en unidades lógicas

### Ejemplo de Reutilización

```java
// Definimos la clase UNA VEZ
public class CuentaBancaria {
    String titular;
    double saldo;
    
    void depositar(double monto) {
        saldo += monto;
    }
}

// Pero la USAMOS muchas veces
CuentaBancaria cuenta1 = new CuentaBancaria(); // Cuenta de Juan
CuentaBancaria cuenta2 = new CuentaBancaria(); // Cuenta de María
CuentaBancaria cuenta3 = new CuentaBancaria(); // Cuenta de Pedro
```

---

## 📋 Convenciones de Nomenclatura

En Java, seguimos estas reglas para nombrar clases:

| Regla | Ejemplo | ✅ Correcto | ❌ Incorrecto |
|-------|---------|------------|--------------|
| **PascalCase** | Primera letra de cada palabra en mayúscula | `CuentaBancaria` | `cuentaBancaria` |
| **Sustantivos** | Las clases representan cosas | `Estudiante` | `Estudiar` |
| **Descriptivos** | Nombres claros y significativos | `VehiculoTransporte` | `VT` |
| **Sin espacios** | Palabras unidas | `LibroTexto` | `Libro Texto` |

### Ejemplos de Buenos Nombres

```java
public class Persona { }
public class CuentaBancaria { }
public class VehiculoTransporte { }
public class LibroTexto { }
public class EmpleadoTiempoCompleto { }
```

---

## 🚀 Ejemplo Completo: Clase Automóvil

```java
/**
 * Clase que representa un automóvil
 * Define las características y comportamientos de un vehículo
 * 
 * @author Tu Nombre
 * @version 1.0
 */
public class Automovil {
    
    // ============================================
    // ATRIBUTOS - Estado del automóvil
    // ============================================
    String marca;           // Ej: Toyota, Ford, Chevrolet
    String modelo;          // Ej: Corolla, Mustang, Spark
    int anio;              // Ej: 2024
    String color;          // Ej: Rojo, Azul, Negro
    double velocidadActual; // Ej: 0.0, 60.5, 120.0
    boolean encendido;     // true o false
    
    // ============================================
    // MÉTODOS - Comportamiento del automóvil
    // ============================================
    
    /**
     * Enciende el motor del automóvil
     */
    void encender() {
        encendido = true;
        System.out.println("El " + marca + " " + modelo + " está encendido");
    }
    
    /**
     * Apaga el motor del automóvil
     */
    void apagar() {
        encendido = false;
        velocidadActual = 0.0;
        System.out.println("El " + marca + " " + modelo + " está apagado");
    }
    
    /**
     * Acelera el automóvil aumentando su velocidad
     */
    void acelerar() {
        if (encendido) {
            velocidadActual += 10;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("El auto está apagado. Enciéndelo primero.");
        }
    }
    
    /**
     * Frena el automóvil disminuyendo su velocidad
     */
    void frenar() {
        if (velocidadActual > 0) {
            velocidadActual -= 10;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        }
    }
    
    /**
     * Muestra la información del automóvil
     */
    void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL VEHÍCULO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidadActual + " km/h");
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }
}
```

---

## 🧪 Conceptos Clave para Recordar

| Concepto | Definición Corta |
|----------|------------------|
| **Clase** | Plantilla o molde para crear objetos |
| **Atributo** | Variable que representa el estado |
| **Método** | Función que representa el comportamiento |
| **PascalCase** | Convención de nombres para clases |
| **Encapsulación** | Agrupar datos y comportamiento |

---

## ✅ Verificación de Comprensión

Responde estas preguntas para verificar tu entendimiento:

1. ¿Qué es una clase en POO?
2. ¿Cuáles son los dos componentes principales de una clase?
3. ¿Qué representa un atributo? ¿Y un método?
4. ¿Por qué decimos que una clase es una "plantilla"?
5. ¿Cuántos objetos puedo crear de una misma clase?

---

## 🔗 Relación con Otros Temas

- **Siguiente:** 02 - ¿Qué es un Objeto? (Instanciación)
- **Relacionado:** Semana 03 - Encapsulación y Constructores
- **Fundamento:** Semana 01 - Introducción a POO

---

## 📚 Recursos Adicionales

### Videos Recomendados
- [Java Classes Explained](https://www.youtube.com/results?search_query=java+classes+explained)
- [Object-Oriented Programming Concepts](https://www.youtube.com/results?search_query=oop+concepts+java)

### Documentación Oficial
- [Oracle Java Tutorials - Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)

### Ejercicios
- Práctica: Ejercicio 01 - Clase Básica
- Desafío: Crea una clase `Producto` para una tienda

---

**Siguiente tema:** [02 - ¿Qué es un Objeto?](./02-concepto-objeto.md)

*Bootcamp POO Java - SENA 2025*
