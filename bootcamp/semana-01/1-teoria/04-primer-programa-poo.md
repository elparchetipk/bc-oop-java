# Primer Programa Orientado a Objetos

## 📖 Índice
1. [Introducción](#introducción)
2. [Paso 1: Identificar Objetos del Mundo Real](#paso-1-identificar-objetos-del-mundo-real)
3. [Paso 2: Definir Atributos](#paso-2-definir-atributos)
4. [Paso 3: Definir Métodos](#paso-3-definir-métodos)
5. [Paso 4: Crear la Clase](#paso-4-crear-la-clase)
6. [Paso 5: Instanciar Objetos](#paso-5-instanciar-objetos)
7. [Paso 6: Usar los Objetos](#paso-6-usar-los-objetos)
8. [Ejemplo Completo: Sistema de Mascotas](#ejemplo-completo-sistema-de-mascotas)
9. [Ejercicios Guiados](#ejercicios-guiados)

---

## 🎯 Introducción

Este documento te guiará paso a paso en la creación de tu primer programa orientado a objetos en Java.

### Objetivo

Crear un programa que modele un **Coche** con sus características y comportamientos.

### Conceptos que Aplicarás

```
✓ Clases
✓ Objetos
✓ Atributos
✓ Métodos
✓ Instanciación
✓ Uso de objetos
```

---

## 🔍 Paso 1: Identificar Objetos del Mundo Real

### Pregunta Clave

> ¿Qué entidad del mundo real quiero modelar?

### Ejemplo: Coche

Un coche es un objeto del mundo real que podemos modelar en nuestro programa.

```
🚗 COCHE
┌─────────────────────────┐
│  Características:       │
│  - Marca                │
│  - Modelo               │
│  - Año                  │
│  - Color                │
│  - Velocidad actual     │
│                         │
│  Acciones:              │
│  - Arrancar             │
│  - Acelerar             │
│  - Frenar               │
│  - Mostrar información  │
└─────────────────────────┘
```

### Ejercicio Rápido

**Piensa en otros objetos:**
- 📚 Libro: título, autor, páginas → leer(), cerrar()
- 👤 Persona: nombre, edad → caminar(), hablar()
- 🏠 Casa: dirección, habitaciones → abrir_puerta(), encender_luz()

---

## 📊 Paso 2: Definir Atributos

### ¿Qué son los atributos?

Los **atributos** son las características o propiedades del objeto.

### Para el Coche

| Atributo | Tipo de Dato | Descripción |
|----------|-------------|-------------|
| `marca` | `String` | Marca del coche (Toyota, Honda, etc.) |
| `modelo` | `String` | Modelo del coche (Corolla, Civic, etc.) |
| `anio` | `int` | Año de fabricación |
| `color` | `String` | Color del coche |
| `velocidadActual` | `int` | Velocidad actual (km/h) |

### En Código

```java
public class Coche {
    // Atributos
    String marca;
    String modelo;
    int anio;
    String color;
    int velocidadActual;
}
```

### Buenas Prácticas

✅ **Nombres descriptivos:** `velocidadActual` en lugar de `vel`  
✅ **camelCase:** `velocidadActual` (primera palabra minúscula, siguientes capitalizadas)  
✅ **Significado claro:** Cualquiera debe entender qué representa

---

## ⚙️ Paso 3: Definir Métodos

### ¿Qué son los métodos?

Los **métodos** son las acciones o comportamientos que el objeto puede realizar.

### Para el Coche

| Método | Tipo Retorno | Descripción |
|--------|-------------|-------------|
| `arrancar()` | `void` | Inicia el coche |
| `acelerar(int)` | `void` | Aumenta la velocidad |
| `frenar(int)` | `void` | Disminuye la velocidad |
| `mostrarInformacion()` | `void` | Muestra datos del coche |

### En Código

```java
public class Coche {
    // Atributos
    String marca;
    String modelo;
    int anio;
    String color;
    int velocidadActual;
    
    // Métodos
    public void arrancar() {
        // Código para arrancar
    }
    
    public void acelerar(int incremento) {
        // Código para acelerar
    }
    
    public void frenar(int decremento) {
        // Código para frenar
    }
    
    public void mostrarInformacion() {
        // Código para mostrar info
    }
}
```

---

## 💻 Paso 4: Crear la Clase

### Clase Completa: Coche

```java
/**
 * Clase que representa un Coche
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class Coche {
    // ===== ATRIBUTOS =====
    String marca;
    String modelo;
    int anio;
    String color;
    int velocidadActual;
    
    // ===== MÉTODOS =====
    
    /**
     * Arranca el coche
     */
    public void arrancar() {
        System.out.println("🔑 El coche " + marca + " " + modelo + " ha arrancado.");
        System.out.println("Vroom vroom! 🚗");
    }
    
    /**
     * Acelera el coche
     * @param incremento cantidad de km/h a aumentar
     */
    public void acelerar(int incremento) {
        velocidadActual += incremento;
        System.out.println("⚡ Acelerando... Velocidad actual: " + velocidadActual + " km/h");
    }
    
    /**
     * Frena el coche
     * @param decremento cantidad de km/h a disminuir
     */
    public void frenar(int decremento) {
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;  // No puede tener velocidad negativa
        }
        System.out.println("🛑 Frenando... Velocidad actual: " + velocidadActual + " km/h");
    }
    
    /**
     * Muestra información completa del coche
     */
    public void mostrarInformacion() {
        System.out.println("═══════════════════════════════");
        System.out.println("🚗 INFORMACIÓN DEL COCHE");
        System.out.println("═══════════════════════════════");
        System.out.println("Marca:            " + marca);
        System.out.println("Modelo:           " + modelo);
        System.out.println("Año:              " + anio);
        System.out.println("Color:            " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("═══════════════════════════════");
    }
}
```

### Explicación del Código

```java
public class Coche {
//  ↑      ↑      ↑
//  |      |      └─── Llave de apertura
//  |      └────────── Nombre de la clase (PascalCase)
//  └──────────────── Modificador de acceso
    
    String marca;
    //  ↑     ↑
    //  |     └───── Nombre del atributo
    //  └─────────── Tipo de dato
    
    public void arrancar() {
    //  ↑     ↑      ↑
    //  |     |      └─── Nombre del método
    //  |     └────────── Tipo de retorno (void = no retorna nada)
    //  └──────────────── Modificador de acceso
        
        System.out.println("...");  // Instrucciones
    }
}
```

---

## 🎁 Paso 5: Instanciar Objetos

### ¿Qué es Instanciar?

**Instanciar** es crear un objeto a partir de una clase.

```
CLASE (molde) ──new──> OBJETO (instancia concreta)
```

### Sintaxis

```java
NombreClase nombreVariable = new NombreClase();
```

### Crear un Objeto Coche

```java
public class PruebaCoche {
    public static void main(String[] args) {
        // Crear objeto (instanciar)
        Coche miCoche = new Coche();
        //  ↑      ↑       ↑      ↑
        //  |      |       |      └─── Llamada al constructor
        //  |      |       └────────── Operador new (crea objeto en memoria)
        //  |      └────────────────── Nombre de la variable
        //  └───────────────────────── Tipo (la clase)
    }
}
```

### Visualización

```
ANTES:
miCoche = null (no apunta a nada)

DESPUÉS de "new Coche()":
miCoche ──→ ┌──────────────────┐
            │ Objeto Coche     │
            ├──────────────────┤
            │ marca: null      │
            │ modelo: null     │
            │ anio: 0          │
            │ color: null      │
            │ velocidad: 0     │
            └──────────────────┘
```

---

## 🎮 Paso 6: Usar los Objetos

### Asignar Valores a Atributos

```java
public class PruebaCoche {
    public static void main(String[] args) {
        // Crear objeto
        Coche miCoche = new Coche();
        
        // Asignar valores a atributos
        miCoche.marca = "Toyota";
        miCoche.modelo = "Corolla";
        miCoche.anio = 2024;
        miCoche.color = "Rojo";
        miCoche.velocidadActual = 0;  // Empieza detenido
        
        // Sintaxis: objeto.atributo
        //              ↑      ↑
        //              |      └─── Nombre del atributo
        //              └────────── Operador punto (.)
    }
}
```

### Llamar Métodos

```java
public class PruebaCoche {
    public static void main(String[] args) {
        // Crear y configurar objeto
        Coche miCoche = new Coche();
        miCoche.marca = "Toyota";
        miCoche.modelo = "Corolla";
        miCoche.anio = 2024;
        miCoche.color = "Rojo";
        miCoche.velocidadActual = 0;
        
        // Llamar métodos
        miCoche.mostrarInformacion();
        //  ↑         ↑
        //  |         └─── Nombre del método con ()
        //  └───────────── Operador punto (.)
        
        miCoche.arrancar();
        miCoche.acelerar(30);
        miCoche.acelerar(20);
        miCoche.frenar(10);
        miCoche.mostrarInformacion();
    }
}
```

### Salida Esperada

```
═══════════════════════════════
🚗 INFORMACIÓN DEL COCHE
═══════════════════════════════
Marca:            Toyota
Modelo:           Corolla
Año:              2024
Color:            Rojo
Velocidad actual: 0 km/h
═══════════════════════════════
🔑 El coche Toyota Corolla ha arrancado.
Vroom vroom! 🚗
⚡ Acelerando... Velocidad actual: 30 km/h
⚡ Acelerando... Velocidad actual: 50 km/h
🛑 Frenando... Velocidad actual: 40 km/h
═══════════════════════════════
🚗 INFORMACIÓN DEL COCHE
═══════════════════════════════
Marca:            Toyota
Modelo:           Corolla
Año:              2024
Color:            Rojo
Velocidad actual: 40 km/h
═══════════════════════════════
```

---

## 🐾 Ejemplo Completo: Sistema de Mascotas

### Paso 1: Identificar el Objeto

**Objeto:** Mascota (Perro)

**Características:**
- Nombre
- Raza
- Edad
- Nivel de energía

**Acciones:**
- Ladrar
- Comer
- Jugar
- Dormir

### Paso 2-4: Crear la Clase

```java
/**
 * Clase que representa una Mascota (Perro)
 */
public class Mascota {
    // ===== ATRIBUTOS =====
    String nombre;
    String raza;
    int edad;
    int nivelEnergia;  // 0-100
    
    // ===== MÉTODOS =====
    
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau guau! 🐕");
    }
    
    public void comer() {
        nivelEnergia += 20;
        if (nivelEnergia > 100) {
            nivelEnergia = 100;
        }
        System.out.println(nombre + " está comiendo... 🍖");
        System.out.println("Energía actual: " + nivelEnergia + "%");
    }
    
    public void jugar(int minutos) {
        int energiaGastada = minutos * 2;
        nivelEnergia -= energiaGastada;
        if (nivelEnergia < 0) {
            nivelEnergia = 0;
        }
        System.out.println(nombre + " jugó por " + minutos + " minutos. ⚽");
        System.out.println("Energía actual: " + nivelEnergia + "%");
        
        if (nivelEnergia < 20) {
            System.out.println(nombre + " está muy cansado! 😴");
        }
    }
    
    public void dormir() {
        nivelEnergia = 100;
        System.out.println(nombre + " está durmiendo... Zzz 😴");
        System.out.println("Energía restaurada al 100%!");
    }
    
    public void mostrarEstado() {
        System.out.println("\n══════════════════════════");
        System.out.println("🐕 " + nombre + " (" + raza + ")");
        System.out.println("══════════════════════════");
        System.out.println("Edad:    " + edad + " años");
        System.out.println("Energía: " + nivelEnergia + "%");
        System.out.println("══════════════════════════\n");
    }
}
```

### Paso 5-6: Usar la Clase

```java
/**
 * Programa principal - Simulador de Mascota
 */
public class SimuladorMascota {
    public static void main(String[] args) {
        System.out.println("🐾 SIMULADOR DE MASCOTA 🐾\n");
        
        // Crear mascota
        Mascota miPerro = new Mascota();
        miPerro.nombre = "Rocky";
        miPerro.raza = "Labrador";
        miPerro.edad = 3;
        miPerro.nivelEnergia = 80;
        
        // Día en la vida de Rocky
        miPerro.mostrarEstado();
        
        miPerro.ladrar();
        miPerro.jugar(15);
        miPerro.comer();
        miPerro.jugar(25);
        miPerro.dormir();
        
        miPerro.mostrarEstado();
        
        System.out.println("\n--- Creando otra mascota ---\n");
        
        // Crear segunda mascota
        Mascota otraPerro = new Mascota();
        otraPerro.nombre = "Luna";
        otraPerro.raza = "Chihuahua";
        otraPerro.edad = 2;
        otraPerro.nivelEnergia = 100;
        
        otraPerro.mostrarEstado();
        otraPerro.ladrar();
        otraPerro.jugar(10);
    }
}
```

### Salida del Programa

```
🐾 SIMULADOR DE MASCOTA 🐾

══════════════════════════
🐕 Rocky (Labrador)
══════════════════════════
Edad:    3 años
Energía: 80%
══════════════════════════

Rocky dice: ¡Guau guau! 🐕
Rocky jugó por 15 minutos. ⚽
Energía actual: 50%
Rocky está comiendo... 🍖
Energía actual: 70%
Rocky jugó por 25 minutos. ⚽
Energía actual: 20%
Rocky está durmiendo... Zzz 😴
Energía restaurada al 100%!

══════════════════════════
🐕 Rocky (Labrador)
══════════════════════════
Edad:    3 años
Energía: 100%
══════════════════════════

--- Creando otra mascota ---

══════════════════════════
🐕 Luna (Chihuahua)
══════════════════════════
Edad:    2 años
Energía: 100%
══════════════════════════

Luna dice: ¡Guau guau! 🐕
Luna jugó por 10 minutos. ⚽
Energía actual: 80%
```

---

## 📝 Ejercicios Guiados

### Ejercicio 1: Clase CuentaBancaria

**Crea una clase con:**

**Atributos:**
- `numeroCuenta` (String)
- `titular` (String)
- `saldo` (double)

**Métodos:**
- `depositar(double monto)`
- `retirar(double monto)`
- `consultarSaldo()`
- `mostrarInformacion()`

**Desafío:** Evita que el saldo sea negativo

### Ejercicio 2: Clase Estudiante

**Crea una clase con:**

**Atributos:**
- `nombre` (String)
- `codigo` (String)
- `notaMatematicas` (double)
- `notaProgramacion` (double)
- `notaIngles` (double)

**Métodos:**
- `calcularPromedio()` → retorna double
- `aprobo()` → retorna boolean (promedio >= 3.0)
- `mostrarInformacion()`

### Ejercicio 3: Clase Producto

**Crea una clase con:**

**Atributos:**
- `nombre` (String)
- `precio` (double)
- `cantidadStock` (int)
- `categoria` (String)

**Métodos:**
- `aplicarDescuento(double porcentaje)`
- `agregarStock(int cantidad)`
- `vender(int cantidad)` → verifica stock disponible
- `mostrarInformacion()`

---

## 🎯 Puntos Clave

**Recuerda:**

1. 🔍 **Identifica** objetos del mundo real
2. 📊 **Define atributos** (características)
3. ⚙️ **Define métodos** (comportamientos)
4. 💻 **Crea la clase** con atributos y métodos
5. 🎁 **Instancia objetos** con `new`
6. 🎮 **Usa los objetos** con `.atributo` y `.metodo()`
7. ✅ **Prueba** tu código con múltiples objetos

---

## 📚 Recursos Adicionales

- [Oracle: Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Oracle: Creating Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html)

---

**Próximo tema:** [Ventajas y Desventajas de POO](./05-ventajas-desventajas-poo.md)

---

**Última actualización:** 3 de octubre de 2025  
**Bootcamp:** POO Java - SENA  
**Semana:** 1 - Introducción a POO
