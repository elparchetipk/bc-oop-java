# 03 - Tipos de Datos y Variables

## 📊 Tipos de Datos en Java

Java es un lenguaje **fuertemente tipado**, lo que significa que cada variable debe tener un tipo de dato específico.

### Categorías de Tipos de Datos

```
Tipos de Datos
├── Primitivos (8 tipos)
│   ├── Enteros: byte, short, int, long
│   ├── Punto flotante: float, double
│   ├── Carácter: char
│   └── Booleano: boolean
└── Referencia (objetos)
    ├── Clases
    ├── Interfaces
    ├── Arrays
    └── Enums
```

---

## 🔢 Tipos de Datos Primitivos

### 1. Tipos Enteros

#### `byte` - 8 bits

```java
byte edad = 25;
byte temperatura = -10;
```

- **Rango:** -128 a 127
- **Tamaño:** 1 byte (8 bits)
- **Uso:** Ahorrar memoria en arrays grandes

#### `short` - 16 bits

```java
short year = 2025;
short poblacion = 30000;
```

- **Rango:** -32,768 a 32,767
- **Tamaño:** 2 bytes (16 bits)
- **Uso:** Ahorrar memoria cuando int es muy grande

#### `int` - 32 bits ⭐ (Más usado)

```java
int numeroEstudiantes = 1500;
int saldo = -50000;
```

- **Rango:** -2,147,483,648 a 2,147,483,647
- **Tamaño:** 4 bytes (32 bits)
- **Uso:** Tipo entero por defecto

#### `long` - 64 bits

```java
long poblacionMundial = 8000000000L;
long distanciaLuz = 9460730472580800L;
```

- **Rango:** -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
- **Tamaño:** 8 bytes (64 bits)
- **Uso:** Números muy grandes
- **Nota:** Usar sufijo `L` o `l`

### 📊 Tabla Comparativa de Enteros

| Tipo | Tamaño | Rango | Ejemplo |
|------|--------|-------|---------|
| `byte` | 8 bits | -128 a 127 | `byte b = 100;` |
| `short` | 16 bits | -32,768 a 32,767 | `short s = 30000;` |
| `int` | 32 bits | ±2.1 billones | `int i = 100000;` |
| `long` | 64 bits | ±9.2 trillones | `long l = 100000L;` |

---

### 2. Tipos de Punto Flotante

#### `float` - 32 bits

```java
float pi = 3.14159F;
float precio = 19.99F;
float temperatura = -5.5F;
```

- **Precisión:** ~6-7 dígitos decimales
- **Tamaño:** 4 bytes
- **Uso:** Cuando la precisión no es crítica
- **Nota:** Usar sufijo `F` o `f`

#### `double` - 64 bits ⭐ (Más usado)

```java
double pi = 3.14159265359;
double precio = 1999.99;
double cientifico = 1.5e10; // 1.5 × 10^10
```

- **Precisión:** ~15 dígitos decimales
- **Tamaño:** 8 bytes
- **Uso:** Tipo decimal por defecto

### 📊 Tabla Comparativa de Decimales

| Tipo | Tamaño | Precisión | Ejemplo |
|------|--------|-----------|---------|
| `float` | 32 bits | 6-7 dígitos | `float f = 3.14F;` |
| `double` | 64 bits | 15 dígitos | `double d = 3.14159;` |

---

### 3. Tipo Carácter

#### `char` - 16 bits

```java
char letra = 'A';
char digito = '9';
char simbolo = '@';
char unicode = '\u0041'; // 'A'
```

- **Rango:** 0 a 65,535 (Unicode)
- **Tamaño:** 2 bytes (16 bits)
- **Uso:** Almacenar un solo carácter
- **Nota:** Usar comillas simples `' '`

#### Caracteres Especiales

```java
char tab = '\t';          // Tabulación
char nuevaLinea = '\n';   // Nueva línea
char comilla = '\'';      // Comilla simple
char backslash = '\\';    // Barra invertida
```

---

### 4. Tipo Booleano

#### `boolean` - 1 bit (en teoría)

```java
boolean esMayorDeEdad = true;
boolean tieneDescuento = false;
boolean estaActivo = true;
```

- **Valores:** `true` o `false`
- **Tamaño:** Depende de la JVM (usualmente 1 byte)
- **Uso:** Condiciones lógicas

---

## 📦 Variables

Una variable es un espacio en memoria con un nombre que almacena un valor.

### Declaración de Variables

#### Sintaxis

```java
tipo nombreVariable;
```

#### Ejemplos

```java
int edad;
double precio;
boolean activo;
char inicial;
```

### Inicialización de Variables

#### Declaración e Inicialización Separadas

```java
int edad;
edad = 25;
```

#### Declaración e Inicialización Juntas ⭐

```java
int edad = 25;
double precio = 19.99;
boolean activo = true;
```

#### Múltiples Variables del Mismo Tipo

```java
int x = 10, y = 20, z = 30;
double a, b, c;
a = 1.5;
b = 2.5;
c = 3.5;
```

---

## 🔒 Constantes

Las constantes son valores que no cambian durante la ejecución.

### Declaración con `final`

```java
final double PI = 3.14159;
final int MAX_ESTUDIANTES = 50;
final String NOMBRE_APP = "MiApp";
```

### Características

- ✅ Usar palabra clave `final`
- ✅ Nombres en MAYÚSCULAS
- ✅ No pueden ser modificadas
- ✅ Deben inicializarse al declararse

### Ejemplo

```java
final double GRAVEDAD = 9.8;
GRAVEDAD = 10; // ❌ ERROR: no se puede modificar

final int EDAD_MINIMA = 18;
System.out.println("Edad mínima: " + EDAD_MINIMA);
```

---

## 🔄 Conversión de Tipos (Casting)

### Conversión Implícita (Automática)

Ocurre cuando se asigna un tipo más pequeño a uno más grande.

```java
int entero = 100;
long largo = entero;      // int → long ✅
double decimal = entero;  // int → double ✅

float f = 3.14F;
double d = f;             // float → double ✅
```

#### Jerarquía de Conversión Implícita

```
byte → short → int → long → float → double
         ↑
       char
```

### Conversión Explícita (Casting Manual)

Necesaria cuando se asigna un tipo más grande a uno más pequeño.

```java
double decimal = 9.78;
int entero = (int) decimal;  // 9 (se pierde .78)

long largo = 100L;
int mediano = (int) largo;

float f = 3.14F;
int i = (int) f;  // 3
```

### ⚠️ Pérdida de Datos

```java
int grande = 130;
byte pequeño = (byte) grande;  // Overflow! Resultado inesperado

double decimal = 9.99;
int entero = (int) decimal;    // 9 (se pierden decimales)
```

### Ejemplos Prácticos

```java
// División de enteros
int a = 7;
int b = 2;
int resultado = a / b;           // 3 (no 3.5)
double resultadoD = (double) a / b; // 3.5 ✅

// Conversión en operaciones
int x = 10;
double y = 5.5;
double suma = x + y;  // 15.5 (x se convierte a double)
```

---

## 🎯 Valores por Defecto

Si no inicializas variables de instancia (en clases), tienen valores por defecto:

| Tipo | Valor por Defecto |
|------|-------------------|
| `byte` | 0 |
| `short` | 0 |
| `int` | 0 |
| `long` | 0L |
| `float` | 0.0F |
| `double` | 0.0 |
| `char` | '\u0000' (null) |
| `boolean` | false |
| `Referencia` | null |

### ⚠️ Variables Locales

Las variables locales (dentro de métodos) **NO tienen valor por defecto** y deben inicializarse antes de usarse.

```java
public void metodo() {
    int x;
    System.out.println(x); // ❌ ERROR: variable no inicializada
    
    int y = 0;
    System.out.println(y); // ✅ OK
}
```

---

## 📏 Ámbito de Variables (Scope)

El ámbito determina dónde es visible y accesible una variable.

### Variables Locales

```java
public void metodo() {
    int local = 10;  // Solo visible en metodo()
    System.out.println(local);
}
// local no existe aquí
```

### Variables de Bloque

```java
public void metodo() {
    if (true) {
        int bloqueVar = 5;  // Solo en el bloque if
        System.out.println(bloqueVar);
    }
    // bloqueVar no existe aquí ❌
}
```

### Ejemplo Completo

```java
public class EjemploScope {
    int instancia = 100;  // Variable de instancia
    
    public void metodo() {
        int local = 50;  // Variable local
        
        if (local > 0) {
            int bloque = 25;  // Variable de bloque
            System.out.println(instancia);  // ✅ Accesible
            System.out.println(local);      // ✅ Accesible
            System.out.println(bloque);     // ✅ Accesible
        }
        
        System.out.println(instancia);  // ✅ Accesible
        System.out.println(local);      // ✅ Accesible
        // System.out.println(bloque);  // ❌ No accesible
    }
}
```

---

## 💡 Buenas Prácticas

### ✅ Hacer

```java
// Nombres descriptivos
int edadEstudiante = 20;
double precioProducto = 99.99;

// Inicializar al declarar
int contador = 0;
boolean activo = false;

// Constantes en mayúsculas
final double IVA = 0.19;

// Usar el tipo apropiado
int cantidadEstudiantes = 50;  // No usar long innecesariamente
```

### ❌ Evitar

```java
// Nombres no descriptivos
int x = 20;
double p = 99.99;

// No inicializar
int contador;
contador = contador + 1;  // ❌ Error

// Nombres confusos
int l = 1;  // Parece número 1
int O = 0;  // Parece número 0
```

---

## ✅ Ejemplo Integrador

```java
public class VariablesEjemplo {
    public static void main(String[] args) {
        // Tipos enteros
        byte edad = 25;
        short año = 2025;
        int poblacion = 1500000;
        long distancia = 384400000L;  // km a la Luna
        
        // Tipos decimales
        float precio = 19.99F;
        double pi = 3.14159265359;
        
        // Carácter y booleano
        char inicial = 'J';
        boolean activo = true;
        
        // Constante
        final double IVA = 0.19;
        
        // Operaciones
        double total = precio + (precio * IVA);
        
        // Casting
        int edadInt = (int) precio;  // 19
        
        // Salida
        System.out.println("Edad: " + edad);
        System.out.println("Año: " + año);
        System.out.println("Población: " + poblacion);
        System.out.println("Distancia: " + distancia + " km");
        System.out.println("Precio: $" + precio);
        System.out.println("Pi: " + pi);
        System.out.println("Inicial: " + inicial);
        System.out.println("Activo: " + activo);
        System.out.println("Total con IVA: $" + total);
    }
}
```

---

## 📝 Resumen

| Concepto | Descripción |
|----------|-------------|
| **Tipos Primitivos** | 8 tipos básicos en Java |
| **Variables** | Espacios en memoria con nombre y tipo |
| **Constantes** | Variables inmutables (`final`) |
| **Casting** | Conversión entre tipos |
| **Scope** | Ámbito de visibilidad de variables |

### Tipos Primitivos Resumen

| Tipo | Bytes | Rango/Valores |
|------|-------|---------------|
| `byte` | 1 | -128 a 127 |
| `short` | 2 | -32,768 a 32,767 |
| `int` | 4 | ±2 mil millones |
| `long` | 8 | ±9 trillones |
| `float` | 4 | ~7 dígitos |
| `double` | 8 | ~15 dígitos |
| `char` | 2 | Carácter Unicode |
| `boolean` | 1 | true/false |

---

## ✅ Ejercicios

1. Declara variables de cada tipo primitivo
2. Crea constantes para valores fijos (PI, IVA, etc.)
3. Practica casting entre tipos
4. Experimenta con el scope de variables

---

[⬅️ Anterior: Sintaxis Básica](02-sintaxis-basica.md) | [➡️ Siguiente: Operadores](04-operadores.md)
