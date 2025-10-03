# Ejercicio 05: Métodos (Funciones)

## 🎯 Objetivos
- Crear métodos con diferentes firmas
- Usar parámetros y valores de retorno
- Aplicar sobrecarga de métodos
- Modularizar código con métodos
- Implementar bibliotecas de funciones reutilizables

---

## 📋 Requisitos

### Parte 1: MetodosBasicos.java
Programa que demuestra métodos con diferentes tipos de parámetros y retornos.

### Parte 2: BibliotecaMatematicas.java
Biblioteca de funciones matemáticas reutilizables.

### Parte 3: ValidacionDatos.java
Sistema de validación de datos con métodos especializados.

---

## 📝 Instrucciones Detalladas

### Parte 1: MetodosBasicos.java

Crea un programa que demuestre los 4 tipos de métodos:

**Requisitos**:
- [ ] Método sin parámetros y sin retorno (void)
- [ ] Método con parámetros y sin retorno
- [ ] Método sin parámetros y con retorno
- [ ] Método con parámetros y con retorno
- [ ] Demostración de sobrecarga de métodos
- [ ] Método que procese un array

**Métodos a implementar**:
1. `saludar()`: Sin parámetros, sin retorno - imprime saludo
2. `saludarPersona(String nombre)`: Con parámetro, sin retorno
3. `obtenerFechaActual()`: Sin parámetros, con retorno String
4. `sumar(int a, int b)`: Con parámetros, con retorno int
5. `sumar(double a, double b)`: Sobrecarga con doubles
6. `promedioArray(double[] numeros)`: Procesa array

**Salida esperada**:
```
=== DEMOSTRACIÓN DE MÉTODOS ===

1. Método sin parámetros y sin retorno:
¡Hola desde el método!

2. Método con parámetros y sin retorno:
¡Hola, Juan!

3. Método sin parámetros y con retorno:
Fecha actual: 2025-10-02

4. Método con parámetros y con retorno:
5 + 3 = 8

5. Sobrecarga de métodos:
5.5 + 3.2 = 8.7

6. Método con array:
Promedio: 7.5
```

### Parte 2: BibliotecaMatematicas.java

Crea una biblioteca de funciones matemáticas:

**Requisitos**:
- [ ] Método `esPar(int numero)`: Retorna boolean
- [ ] Método `esImpar(int numero)`: Retorna boolean
- [ ] Método `esPrimo(int numero)`: Verifica si es primo
- [ ] Método `factorial(int n)`: Calcula factorial
- [ ] Método `potencia(int base, int exponente)`: Calcula potencia
- [ ] Método `fibonacci(int n)`: N-ésimo número Fibonacci
- [ ] Método `maximoDeTres(int a, int b, int c)`: Retorna el máximo
- [ ] Método `mayorArray(int[] numeros)`: Mayor elemento
- [ ] Programa principal que demuestre todos los métodos

**Salida esperada**:
```
=== BIBLIOTECA MATEMÁTICA ===

1. Par/Impar
¿10 es par? true
¿7 es impar? true

2. Número Primo
¿17 es primo? true
¿20 es primo? false

3. Factorial
5! = 120

4. Potencia
2^8 = 256

5. Fibonacci
Posición 10: 55

6. Máximo de tres
Máximo(15, 32, 8) = 32

7. Mayor de array
Array: [12, 45, 23, 67, 34]
Mayor: 67
```

### Parte 3: ValidacionDatos.java

Sistema de validación con métodos especializados:

**Requisitos**:
- [ ] `validarEdad(int edad)`: Valida edad (0-120)
- [ ] `validarEmail(String email)`: Valida formato email
- [ ] `validarTelefono(String telefono)`: Valida formato
- [ ] `validarNombre(String nombre)`: Solo letras, min 2 caracteres
- [ ] `validarCalificacion(double nota)`: 0-100
- [ ] `validarRangoEntero(int valor, int min, int max)`: En rango
- [ ] Menú interactivo que use todos los validadores

**Salida esperada**:
```
=== SISTEMA DE VALIDACIÓN DE DATOS ===

--- MENÚ ---
1. Validar edad
2. Validar email
3. Validar teléfono
4. Validar nombre
5. Validar calificación
0. Salir

Opción: 1
Ingresa edad: 25
✓ Edad válida

Opción: 2
Ingresa email: usuario@ejemplo.com
✓ Email válido

Opción: 2
Ingresa email: correo_invalido
✗ Email inválido (debe contener @)
```

---

## ✅ Criterios de Éxito

### MetodosBasicos.java
- [ ] Implementa los 4 tipos de métodos correctamente
- [ ] Sobrecarga funciona correctamente
- [ ] Método con array retorna promedio correcto
- [ ] Llamadas desde main son apropiadas

### BibliotecaMatematicas.java
- [ ] Todos los métodos retornan valores correctos
- [ ] esPrimo() funciona para todos los casos
- [ ] factorial() maneja 0 y números grandes
- [ ] Código bien organizado y documentado

### ValidacionDatos.java
- [ ] Todas las validaciones funcionan
- [ ] Validación de email detecta @ y punto
- [ ] Validaciones retornan boolean
- [ ] Menú usa los métodos correctamente

---

## 🔍 Conceptos Clave

### Estructura de un Método

```java
public static tipoRetorno nombreMetodo(parametros) {
    // código
    return valor;  // si no es void
}
```

### 4 Tipos de Métodos

```java
// 1. Sin parámetros, sin retorno
public static void saludar() {
    System.out.println("¡Hola!");
}

// 2. Con parámetros, sin retorno
public static void imprimirNumero(int n) {
    System.out.println("Número: " + n);
}

// 3. Sin parámetros, con retorno
public static int obtenerCinco() {
    return 5;
}

// 4. Con parámetros, con retorno
public static int sumar(int a, int b) {
    return a + b;
}
```

### Sobrecarga de Métodos

```java
public static int sumar(int a, int b) {
    return a + b;
}

public static double sumar(double a, double b) {
    return a + b;
}

public static int sumar(int a, int b, int c) {
    return a + b + c;
}
```

### Métodos con Arrays

```java
public static double promedio(double[] numeros) {
    double suma = 0;
    for (double n : numeros) {
        suma += n;
    }
    return suma / numeros.length;
}

// Llamada
double[] notas = {8.5, 9.0, 7.5};
double prom = promedio(notas);
```

---

## 🧪 Pruebas y Validación

### MetodosBasicos.java

Verifica:
- Todos los métodos se llaman correctamente
- Sobrecarga diferencia int de double
- Promedio de array es correcto

### BibliotecaMatematicas.java

Prueba casos especiales:
- esPrimo(2) → true (caso especial)
- esPrimo(1) → false
- factorial(0) → 1
- potencia(2, 0) → 1
- fibonacci(0) → 0

### ValidacionDatos.java

Prueba entradas:
- Edad: -5, 0, 25, 120, 150
- Email: sin @, sin punto, válido
- Nombre: "", "A", "Juan", "Juan123"

---

## 🎨 Ejercicios Adicionales

### Nivel 1: Básico
1. Agrega método `esPerfecto(int n)`: suma divisores = n
2. Método `invertirNumero(int n)`: 123 → 321

### Nivel 2: Intermedio
3. Método recursivo `mcd(int a, int b)`: Máximo común divisor
4. Método `ordenarArray(int[] arr)`: Ordena in-place
5. Sobrecarga para calcular área (cuadrado, rectángulo, círculo)

### Nivel 3: Avanzado
6. Sistema completo de validación de formulario
7. Calculadora científica con métodos modulares
8. Conversor de unidades con múltiples métodos

---

## 🐛 Errores Comunes

### Error 1: Método sin return
```java
// ❌ Mal
public static int sumar(int a, int b) {
    int suma = a + b;
    // Falta return
}

// ✅ Bien
public static int sumar(int a, int b) {
    return a + b;
}
```

### Error 2: Tipo de retorno incorrecto
```java
// ❌ Mal
public static int dividir(int a, int b) {
    return a / b;  // Pierde decimales
}

// ✅ Bien
public static double dividir(double a, double b) {
    return a / b;
}
```

### Error 3: No usar el valor retornado
```java
// ❌ Mal
sumar(5, 3);  // El resultado se pierde

// ✅ Bien
int resultado = sumar(5, 3);
System.out.println(resultado);
```

### Error 4: Modificar parámetros primitivos
```java
// No funciona con primitivos
public static void duplicar(int n) {
    n = n * 2;  // No afecta fuera del método
}

// Funciona retornando
public static int duplicar(int n) {
    return n * 2;
}
```

---

## 🏆 Reto Final

Crea `CalculadoraCientifica.java` que:

1. Menú de operaciones:
   - Operaciones básicas (+, -, *, /)
   - Potencia, raíz cuadrada
   - Factorial
   - Trigonometría (sin, cos, tan)
   - Logaritmo
2. Cada operación en un método
3. Validaciones apropiadas
4. Historial de operaciones (array)

**Conceptos**: Métodos, Math class, menú, validación, arrays

---

## 📚 Recursos Adicionales

### Javadoc

```java
/**
 * Calcula el factorial de un número.
 * 
 * @param n El número del cual calcular factorial
 * @return El factorial de n
 */
public static long factorial(int n) {
    if (n == 0 || n == 1) return 1;
    long fact = 1;
    for (int i = 2; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
```

### Clase Math

```java
Math.abs(-5);           // 5
Math.max(10, 20);       // 20
Math.min(10, 20);       // 10
Math.pow(2, 3);         // 8.0
Math.sqrt(16);          // 4.0
Math.random();          // 0.0 - 1.0
Math.round(3.7);        // 4
Math.ceil(3.2);         // 4.0
Math.floor(3.7);        // 3.0
```

---

## 📊 Autoevaluación

- [ ] Creo métodos con diferentes firmas
- [ ] Uso parámetros correctamente
- [ ] Retorno valores del tipo apropiado
- [ ] Aplico sobrecarga de métodos
- [ ] Método único, responsabilidad única
- [ ] Documento métodos con Javadoc
- [ ] Valido parámetros de entrada

**Escala**:
- 7/7: ¡Excelente! Dominas métodos completamente
- 5-6/7: Muy bien, practica sobrecarga
- <5/7: Repasa teoría de métodos

---

## 💡 Consejos

1. **Un método, una tarea**: Mantén métodos enfocados
2. **Nombres descriptivos**: `calcularPromedio()` no `calc()`
3. **Valida entradas**: No asumas datos correctos
4. **Retorna, no imprimas**: Más reutilizable
5. **DRY**: Don't Repeat Yourself - usa métodos
6. **Métodos cortos**: Idealmente < 20 líneas
7. **Documenta**: Explica qué hace, parámetros, retorno

---

**¡Domina los métodos y tu código será modular, reutilizable y profesional! 🚀**

[⬅️ Anterior: Ejercicio 04](../ejercicio-04-arrays/README.md) | [➡️ Siguiente: Ejercicio 06](../ejercicio-06-integrador/README.md)
