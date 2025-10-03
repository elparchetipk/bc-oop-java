# 02 - Sintaxis Básica de Java

## 📝 Estructura de un Programa Java

### Programa Mínimo

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
}
```

### Anatomía del Programa

```java
// 1. Declaración de clase
public class HolaMundo {
    
    // 2. Método principal (punto de entrada)
    public static void main(String[] args) {
        
        // 3. Instrucciones
        System.out.println("¡Hola Mundo!");
    }
}
```

#### Explicación de cada parte:

1. **`public class HolaMundo`**
   - `public`: modificador de acceso (visible desde cualquier lugar)
   - `class`: declara una clase
   - `HolaMundo`: nombre de la clase (debe coincidir con el nombre del archivo)

2. **`public static void main(String[] args)`**
   - `public`: método accesible desde cualquier lugar
   - `static`: método de clase (no necesita instancia)
   - `void`: no retorna ningún valor
   - `main`: nombre del método principal
   - `String[] args`: parámetros de línea de comandos

3. **`System.out.println("¡Hola Mundo!");`**
   - `System.out`: flujo de salida estándar
   - `println`: imprime con salto de línea
   - Instrucción termina con `;`

---

## 💬 Comentarios

Los comentarios son texto que el compilador ignora, usado para documentar código.

### Tipos de Comentarios

#### 1. Comentario de Una Línea

```java
// Este es un comentario de una línea
int edad = 25; // También puede estar al final de la línea
```

#### 2. Comentario Multilínea

```java
/*
 * Este es un comentario
 * que abarca varias
 * líneas
 */
int suma = a + b;
```

#### 3. Comentario Javadoc

```java
/**
 * Este método calcula la suma de dos números.
 * 
 * @param a primer número
 * @param b segundo número
 * @return la suma de a y b
 */
public int sumar(int a, int b) {
    return a + b;
}
```

### 💡 Buenas Prácticas

✅ **Hacer:**
```java
// Calcula el área del rectángulo
int area = base * altura;
```

❌ **Evitar:**
```java
int a = b * h; // sin comentario explicativo
// esto es una variable (comentario obvio)
int numero;
```

---

## 📦 Identificadores

Los identificadores son nombres que damos a clases, variables, métodos, etc.

### Reglas para Identificadores

#### ✅ Permitido:
- Letras (a-z, A-Z)
- Dígitos (0-9) - pero no al inicio
- Guión bajo `_`
- Símbolo de dólar `$`

#### ❌ No permitido:
- Comenzar con dígito
- Usar palabras reservadas
- Contener espacios
- Usar caracteres especiales (@, #, %, etc.)

### Ejemplos

```java
// ✅ Válidos
int edad;
int edad_persona;
int edad2;
int _contador;
int $precio;
String nombreCompleto;

// ❌ Inválidos
int 2edad;        // Comienza con número
int nombre-completo; // Guión no permitido
int class;        // Palabra reservada
int mi edad;      // Espacio no permitido
```

---

## 📏 Convenciones de Nomenclatura

Java tiene convenciones estándar para nombrar elementos:

### 1. Clases e Interfaces - **PascalCase**

```java
public class Estudiante { }
public class CuentaBancaria { }
public interface Calculadora { }
```

### 2. Métodos y Variables - **camelCase**

```java
int numeroEstudiantes;
String nombreCompleto;

public void calcularPromedio() { }
public int obtenerEdad() { }
```

### 3. Constantes - **UPPER_SNAKE_CASE**

```java
public static final double PI = 3.14159;
public static final int MAX_INTENTOS = 3;
public static final String NOMBRE_APP = "MiApp";
```

### 4. Paquetes - **lowercase**

```java
package com.empresa.proyecto;
package utilidades.matematicas;
```

---

## 🔤 Palabras Reservadas (Keywords)

Java tiene 53 palabras reservadas que no pueden usarse como identificadores:

### Tabla de Palabras Reservadas

| | | | | |
|---------|---------|---------|---------|---------|
| abstract | assert | boolean | break | byte |
| case | catch | char | class | const* |
| continue | default | do | double | else |
| enum | extends | final | finally | float |
| for | goto* | if | implements | import |
| instanceof | int | interface | long | native |
| new | package | private | protected | public |
| return | short | static | strictfp | super |
| switch | synchronized | this | throw | throws |
| transient | try | void | volatile | while |

**\* No usadas actualmente pero reservadas**

### Literales Reservados

```java
true    // Literal booleano verdadero
false   // Literal booleano falso
null    // Literal nulo (ausencia de valor)
```

---

## 🔢 Literales

Los literales son valores constantes escritos directamente en el código.

### Tipos de Literales

#### 1. Literales Enteros

```java
int decimal = 42;
int hexadecimal = 0x2A;      // Base 16
int binario = 0b101010;      // Base 2
int octal = 052;             // Base 8
long numeroGrande = 1000000L; // L para long
```

#### 2. Literales de Punto Flotante

```java
double pi = 3.14159;
double cientifico = 1.5e10;  // 1.5 × 10^10
float decimal = 3.14F;       // F para float
```

#### 3. Literales de Carácter

```java
char letra = 'A';
char unicode = '\u0041';     // 'A' en Unicode
char tab = '\t';             // Tabulación
char nuevaLinea = '\n';      // Salto de línea
```

#### 4. Literales de Cadena

```java
String mensaje = "Hola Mundo";
String vacio = "";
String multilinea = "Primera línea\n" +
                    "Segunda línea";
```

#### 5. Literales Booleanos

```java
boolean verdadero = true;
boolean falso = false;
```

---

## 🔤 Secuencias de Escape

Caracteres especiales en cadenas y caracteres:

| Secuencia | Significado |
|-----------|-------------|
| `\n` | Nueva línea |
| `\t` | Tabulación |
| `\r` | Retorno de carro |
| `\\` | Barra invertida |
| `\'` | Comilla simple |
| `\"` | Comilla doble |
| `\b` | Retroceso |
| `\f` | Avance de página |

### Ejemplo

```java
System.out.println("Línea 1\nLínea 2");
System.out.println("Nombre:\tJuan");
System.out.println("Él dijo: \"Hola\"");
System.out.println("Ruta: C:\\Users\\Documents");
```

**Salida:**
```
Línea 1
Línea 2
Nombre:	Juan
Él dijo: "Hola"
Ruta: C:\Users\Documents
```

---

## 📤 Salida de Datos

### System.out.println()

Imprime y añade salto de línea:

```java
System.out.println("Hola");
System.out.println("Mundo");
// Salida:
// Hola
// Mundo
```

### System.out.print()

Imprime sin salto de línea:

```java
System.out.print("Hola ");
System.out.print("Mundo");
// Salida: Hola Mundo
```

### System.out.printf()

Imprime con formato:

```java
String nombre = "Juan";
int edad = 25;
double altura = 1.75;

System.out.printf("Nombre: %s%n", nombre);
System.out.printf("Edad: %d años%n", edad);
System.out.printf("Altura: %.2f metros%n", altura);

// Salida:
// Nombre: Juan
// Edad: 25 años
// Altura: 1.75 metros
```

#### Especificadores de Formato

| Especificador | Tipo |
|---------------|------|
| `%d` | Entero decimal |
| `%f` | Punto flotante |
| `%s` | Cadena |
| `%c` | Carácter |
| `%b` | Booleano |
| `%n` | Nueva línea |
| `%x` | Hexadecimal |
| `%.2f` | Float con 2 decimales |

---

## 📥 Entrada de Datos

### Usando Scanner

```java
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer cadena
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        // Leer entero
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        // Leer decimal
        System.out.print("Ingresa tu altura: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        
        scanner.close();
    }
}
```

### Métodos de Scanner

| Método | Descripción |
|--------|-------------|
| `next()` | Lee una palabra |
| `nextLine()` | Lee una línea completa |
| `nextInt()` | Lee un entero |
| `nextDouble()` | Lee un double |
| `nextFloat()` | Lee un float |
| `nextBoolean()` | Lee un boolean |

---

## 📐 Bloques de Código

Los bloques se delimitan con llaves `{ }`:

```java
public class Ejemplo {
    // Bloque de clase
    
    public static void main(String[] args) {
        // Bloque de método
        
        int x = 10;
        
        if (x > 5) {
            // Bloque de if
            System.out.println("x es mayor que 5");
        }
    }
}
```

### 💡 Buenas Prácticas de Indentación

```java
// ✅ Bien indentado
public class Ejemplo {
    public static void main(String[] args) {
        if (condicion) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
    }
}

// ❌ Mal indentado
public class Ejemplo {
public static void main(String[] args) {
if (condicion) {
System.out.println("Verdadero");
} else {
System.out.println("Falso");
}
}
}
```

---

## 🎯 Punto y Coma (;)

Cada instrucción termina con punto y coma:

```java
int edad = 25;
String nombre = "Juan";
System.out.println("Hola");
```

**Excepciones** (no llevan `;`):
- Declaraciones de clases
- Declaraciones de métodos
- Bloques de control (if, for, while)

---

## ✅ Ejemplo Completo

```java
import java.util.Scanner;

/**
 * Programa que solicita datos del usuario y los muestra.
 */
public class DatosPersonales {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar datos
        System.out.println("=== DATOS PERSONALES ===");
        
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        
        System.out.print("Altura (m): ");
        double altura = entrada.nextDouble();
        
        // Mostrar datos
        System.out.println("\n=== RESUMEN ===");
        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Edad: %d años%n", edad);
        System.out.printf("Altura: %.2f metros%n", altura);
        
        // Cerrar Scanner
        entrada.close();
    }
}
```

---

## 📝 Resumen

| Elemento | Descripción |
|----------|-------------|
| **Comentarios** | `//`, `/* */`, `/** */` |
| **Identificadores** | Nombres para variables, clases, métodos |
| **Palabras reservadas** | 53 keywords de Java |
| **Literales** | Valores constantes en código |
| **Entrada** | `Scanner` para leer datos |
| **Salida** | `println()`, `print()`, `printf()` |
| **Bloques** | Delimitados por `{ }` |

---

## ✅ Ejercicios de Práctica

1. Crea un programa que imprima tu nombre usando `println()`
2. Usa comentarios para documentar un programa simple
3. Crea un programa que pida nombre y edad, y los muestre
4. Experimenta con `printf()` para formatear salidas

---

[⬅️ Anterior: Introducción](01-introduccion-java.md) | [➡️ Siguiente: Tipos de Datos](03-tipos-datos.md)
