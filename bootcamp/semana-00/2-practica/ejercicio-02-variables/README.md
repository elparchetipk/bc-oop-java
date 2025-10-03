# Ejercicio 02: Variables y Tipos de Datos

## 🎯 Objetivos
- Declarar y usar variables de diferentes tipos
- Aplicar operadores aritméticos, relacionales y lógicos
- Realizar conversiones entre tipos de datos
- Usar Scanner para entrada de datos del usuario

---

## 📋 Requisitos

### Parte 1: TiposDatos.java
Programa que demuestra el uso de los 8 tipos primitivos de Java.

### Parte 2: Calculadora.java
Calculadora básica que solicita dos números y realiza las 4 operaciones básicas.

### Parte 3: ConversionTemperatura.java
Conversor de temperatura (Celsius ↔ Fahrenheit).

---

## 📝 Instrucciones Detalladas

### Parte 1: TiposDatos.java

Crea un programa que declare variables de todos los tipos primitivos:

**Requisitos**:
- [ ] Declarar una variable de cada tipo primitivo (byte, short, int, long, float, double, boolean, char)
- [ ] Asignar valores iniciales
- [ ] Imprimir cada variable con su tipo
- [ ] Mostrar el rango mínimo y máximo de cada tipo numérico

**Salida esperada**:
```
=== TIPOS DE DATOS EN JAVA ===

byte: -128 a 127
Valor: 100

short: -32768 a 32767
Valor: 30000

int: -2147483648 a 2147483647
Valor: 1500000

...
```

### Parte 2: Calculadora.java

Crea una calculadora que:

**Requisitos**:
- [ ] Solicite dos números al usuario (double)
- [ ] Realice suma, resta, multiplicación y división
- [ ] Muestre los resultados formateados
- [ ] Valide división por cero

**Salida esperada**:
```
=== CALCULADORA BÁSICA ===

Ingresa el primer número: 10
Ingresa el segundo número: 3

--- RESULTADOS ---
10.0 + 3.0 = 13.0
10.0 - 3.0 = 7.0
10.0 × 3.0 = 30.0
10.0 ÷ 3.0 = 3.33
```

### Parte 3: ConversionTemperatura.java

Crea un conversor de temperatura:

**Requisitos**:
- [ ] Menú de opciones (Celsius→Fahrenheit, Fahrenheit→Celsius)
- [ ] Solicitar temperatura al usuario
- [ ] Aplicar fórmulas correctas
- [ ] Mostrar resultado con 2 decimales

**Fórmulas**:
- Celsius a Fahrenheit: `F = (C × 9/5) + 32`
- Fahrenheit a Celsius: `C = (F - 32) × 5/9`

**Salida esperada**:
```
=== CONVERSOR DE TEMPERATURA ===

1. Celsius → Fahrenheit
2. Fahrenheit → Celsius

Opción: 1
Temperatura en Celsius: 25

25.0°C = 77.0°F
```

---

## ✅ Criterios de Éxito

### TiposDatos.java
- [ ] Declara las 8 variables primitivas
- [ ] Muestra rangos de valores
- [ ] Imprime correctamente cada tipo

### Calculadora.java
- [ ] Usa Scanner para entrada
- [ ] Realiza las 4 operaciones
- [ ] Valida división por cero
- [ ] Formatea salida correctamente

### ConversionTemperatura.java
- [ ] Implementa menú de opciones
- [ ] Aplica fórmulas correctas
- [ ] Muestra resultados con 2 decimales
- [ ] Usa tipos de datos apropiados

---

## 🔍 Conceptos Clave

### Tipos Primitivos

| Tipo | Tamaño | Rango | Ejemplo |
|------|--------|-------|---------|
| byte | 8 bits | -128 a 127 | `byte edad = 25;` |
| short | 16 bits | -32,768 a 32,767 | `short año = 2025;` |
| int | 32 bits | -2³¹ a 2³¹-1 | `int poblacion = 1000000;` |
| long | 64 bits | -2⁶³ a 2⁶³-1 | `long distancia = 123456789L;` |
| float | 32 bits | ~6-7 dígitos | `float precio = 19.99f;` |
| double | 64 bits | ~15 dígitos | `double pi = 3.14159265359;` |
| boolean | 1 bit | true/false | `boolean activo = true;` |
| char | 16 bits | '\u0000' a '\uffff' | `char inicial = 'A';` |

### Operadores Aritméticos

```java
int a = 10, b = 3;

System.out.println(a + b);   // 13 (suma)
System.out.println(a - b);   // 7 (resta)
System.out.println(a * b);   // 30 (multiplicación)
System.out.println(a / b);   // 3 (división entera)
System.out.println(a % b);   // 1 (módulo/resto)
```

### Scanner para Entrada

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

System.out.print("Ingresa un número: ");
int numero = sc.nextInt();

System.out.print("Ingresa un decimal: ");
double decimal = sc.nextDouble();

System.out.print("Ingresa texto: ");
String texto = sc.next();  // Una palabra
String linea = sc.nextLine();  // Línea completa
```

---

## 🧪 Pruebas y Validación

### TiposDatos.java
```bash
javac TiposDatos.java
java TiposDatos
```

### Calculadora.java
Prueba con:
- Números enteros: `10` y `5`
- Números decimales: `7.5` y `2.5`
- División por cero: `10` y `0`

### ConversionTemperatura.java
Verifica:
- 0°C = 32°F
- 100°C = 212°F
- 32°F = 0°C
- 68°F = 20°C

---

## 🎨 Ejercicios Adicionales

### Nivel 1: Básico
1. Agrega operador módulo (%) a la calculadora
2. Crea conversor de pesos colombianos a dólares

### Nivel 2: Intermedio
3. Calculadora con operaciones avanzadas (potencia, raíz cuadrada)
4. Conversor múltiple (Celsius, Fahrenheit, Kelvin)

### Nivel 3: Avanzado
5. Calculadora científica con menú de opciones
6. Sistema de conversión de unidades (longitud, peso, volumen)

---

## 🐛 Errores Comunes

### Error 1: InputMismatchException
```java
// Si el usuario ingresa texto cuando esperamos número
int numero = sc.nextInt();  // Usuario escribe "abc"
```
**Solución**: Validar entrada o usar try-catch (tema avanzado)

### Error 2: División entera
```java
int a = 10, b = 3;
System.out.println(a / b);  // 3 (no 3.333...)
```
**Solución**: Usar double o hacer casting
```java
double resultado = (double) a / b;  // 3.333...
```

### Error 3: Pérdida de precisión
```java
float f = 3.14159265359;  // Error: pierde precisión
```
**Solución**: Usar `f` al final o declarar como double
```java
float f = 3.14f;
double d = 3.14159265359;
```

---

## 📚 Recursos

### Conversión de Tipos

```java
// Implícita (automática)
int i = 10;
double d = i;  // OK: int → double

// Explícita (casting)
double d = 10.5;
int i = (int) d;  // i = 10 (pierde decimales)

// String a número
String texto = "123";
int numero = Integer.parseInt(texto);
double decimal = Double.parseDouble("3.14");

// Número a String
int num = 100;
String texto = String.valueOf(num);
// o
String texto = "" + num;
```

---

## 🏆 Reto Final

Crea `CalculadoraIMC.java` que:
- Solicite peso (kg) y altura (m)
- Calcule el IMC: `IMC = peso / (altura²)`
- Muestre categoría:
  - < 18.5: Bajo peso
  - 18.5 - 24.9: Normal
  - 25 - 29.9: Sobrepeso
  - ≥ 30: Obesidad

---

## 📊 Autoevaluación

- [ ] Entiendo los 8 tipos primitivos
- [ ] Puedo declarar y asignar variables
- [ ] Sé usar operadores aritméticos
- [ ] Uso Scanner correctamente
- [ ] Realizo conversiones de tipos
- [ ] Formateé salidas con printf o format

---

**¡Excelente trabajo! Ahora dominas variables y tipos de datos en Java. 🚀**

[⬅️ Anterior: Ejercicio 01](../ejercicio-01-hola-mundo/README.md) | [➡️ Siguiente: Ejercicio 03](../ejercicio-03-control/README.md)
