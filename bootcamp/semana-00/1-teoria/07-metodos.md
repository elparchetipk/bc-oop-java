# 07 - Métodos (Funciones)

Los **métodos** son bloques de código reutilizables que realizan tareas específicas. Son fundamentales para organizar y modularizar el código.

---

## 🎯 ¿Qué es un Método?

Un método es un conjunto de instrucciones agrupadas bajo un nombre que puede ser invocado (llamado) desde otras partes del programa.

### Ventajas de Usar Métodos

| Ventaja | Descripción |
|---------|-------------|
| **Reutilización** | Escribir código una vez, usar muchas veces |
| **Organización** | Divide problemas grandes en partes pequeñas |
| **Mantenimiento** | Cambios en un solo lugar |
| **Legibilidad** | Código más claro y comprensible |
| **Testing** | Fácil probar funcionalidad aislada |

---

## 🛠️ Sintaxis de un Método

```java
modificadorAcceso tipoRetorno nombreMetodo(parámetros) {
    // cuerpo del método
    return valor;  // si tipoRetorno no es void
}
```

### Componentes

```java
public static int sumar(int a, int b) {
    int resultado = a + b;
    return resultado;
}
```

| Componente | Descripción | Ejemplo |
|------------|-------------|---------|
| **Modificador de acceso** | Visibilidad del método | `public`, `private` |
| **static** | Pertenece a la clase (no a una instancia) | `static` |
| **Tipo de retorno** | Tipo de dato que devuelve | `int`, `String`, `void` |
| **Nombre** | Identificador del método | `sumar`, `calcularPromedio` |
| **Parámetros** | Datos de entrada | `(int a, int b)` |
| **Cuerpo** | Código del método | `{ ... }` |
| **return** | Devuelve un valor | `return resultado;` |

---

## 📝 Tipos de Métodos

### 1. Métodos sin Parámetros y sin Retorno (void)

```java
public static void saludar() {
    System.out.println("¡Hola, mundo!");
}

// Llamada
saludar();  // Imprime: ¡Hola, mundo!
```

### 2. Métodos con Parámetros y sin Retorno

```java
public static void saludarPersona(String nombre) {
    System.out.println("¡Hola, " + nombre + "!");
}

// Llamada
saludarPersona("Juan");   // ¡Hola, Juan!
saludarPersona("María");  // ¡Hola, María!
```

### 3. Métodos sin Parámetros y con Retorno

```java
public static int obtenerNumeroAleatorio() {
    return (int) (Math.random() * 100);
}

// Llamada
int numero = obtenerNumeroAleatorio();
System.out.println("Número: " + numero);
```

### 4. Métodos con Parámetros y con Retorno

```java
public static int sumar(int a, int b) {
    return a + b;
}

// Llamada
int resultado = sumar(5, 3);
System.out.println("Resultado: " + resultado);  // 8

// Directamente en println
System.out.println("Suma: " + sumar(10, 20));  // 30
```

---

## 📥 Parámetros

### Parámetros Simples

```java
public static void imprimirDatos(String nombre, int edad, double altura) {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Altura: " + altura + " m");
}

// Llamada
imprimirDatos("Carlos", 25, 1.75);
```

### Parámetros de Tipo Array

```java
public static void imprimirArray(int[] numeros) {
    for (int numero : numeros) {
        System.out.print(numero + " ");
    }
    System.out.println();
}

// Llamada
int[] valores = {1, 2, 3, 4, 5};
imprimirArray(valores);
```

### Número Variable de Parámetros (Varargs)

```java
public static int sumar(int... numeros) {
    int suma = 0;
    for (int numero : numeros) {
        suma += numero;
    }
    return suma;
}

// Llamadas
System.out.println(sumar(1, 2));           // 3
System.out.println(sumar(1, 2, 3));        // 6
System.out.println(sumar(1, 2, 3, 4, 5));  // 15
```

---

## 📤 Retorno de Valores

### return con Valor

```java
public static int multiplicar(int a, int b) {
    return a * b;
}

public static String obtenerMensaje(boolean exito) {
    if (exito) {
        return "Operación exitosa";
    } else {
        return "Operación fallida";
    }
}
```

### return void (sin valor)

```java
public static void mostrarMensaje(String mensaje) {
    System.out.println(mensaje);
    return;  // Opcional, sale del método
}

public static void validarEdad(int edad) {
    if (edad < 0) {
        System.out.println("Edad inválida");
        return;  // Sale del método anticipadamente
    }
    System.out.println("Edad válida: " + edad);
}
```

### Múltiples return

```java
public static String calificar(int nota) {
    if (nota >= 90) {
        return "A";
    } else if (nota >= 80) {
        return "B";
    } else if (nota >= 70) {
        return "C";
    } else if (nota >= 60) {
        return "D";
    } else {
        return "F";
    }
}
```

---

## 🔄 Llamada de Métodos

### Desde main

```java
public class Calculadora {
    public static void main(String[] args) {
        // Llamadas a métodos
        int suma = sumar(5, 3);
        int resta = restar(10, 4);
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
        return a - b;
    }
}
```

### Método que Llama a Otro Método

```java
public class Matematicas {
    public static void main(String[] args) {
        int resultado = calcularPromedio(5, 8, 10);
        System.out.println("Promedio: " + resultado);
    }
    
    public static int calcularPromedio(int a, int b, int c) {
        int suma = sumar(a, b, c);
        return suma / 3;
    }
    
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

## 📊 Ejemplos Prácticos

### Ejemplo 1: Operaciones Matemáticas

```java
public class OperacionesMatematicas {
    public static void main(String[] args) {
        System.out.println("5 + 3 = " + sumar(5, 3));
        System.out.println("10 - 4 = " + restar(10, 4));
        System.out.println("6 * 7 = " + multiplicar(6, 7));
        System.out.println("20 / 4 = " + dividir(20, 4));
        System.out.println("2^3 = " + potencia(2, 3));
    }
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }
        return a / b;
    }
    
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
```

### Ejemplo 2: Validaciones

```java
public class Validaciones {
    public static void main(String[] args) {
        System.out.println(esPar(4));      // true
        System.out.println(esPar(7));      // false
        
        System.out.println(esPrimo(7));    // true
        System.out.println(esPrimo(8));    // false
        
        System.out.println(esVocal('a'));  // true
        System.out.println(esVocal('b'));  // false
    }
    
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' 
            || letra == 'o' || letra == 'u';
    }
}
```

### Ejemplo 3: Procesamiento de Arrays

```java
public class ProcesamientoArrays {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 9, 3};
        
        System.out.println("Suma: " + sumarArray(numeros));
        System.out.println("Promedio: " + promedioArray(numeros));
        System.out.println("Máximo: " + maximoArray(numeros));
        System.out.println("Mínimo: " + minimoArray(numeros));
        
        imprimirArray(numeros);
        invertirArray(numeros);
        imprimirArray(numeros);
    }
    
    public static int sumarArray(int[] arr) {
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }
        return suma;
    }
    
    public static double promedioArray(int[] arr) {
        return (double) sumarArray(arr) / arr.length;
    }
    
    public static int maximoArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    public static int minimoArray(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void invertirArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
```

### Ejemplo 4: Menú con Métodos

```java
import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            procesarOpcion(opcion, sc);
        } while (opcion != 0);
        
        System.out.println("¡Hasta luego!");
    }
    
    public static void mostrarMenu() {
        System.out.println("\n=== CALCULADORA ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }
    
    public static void procesarOpcion(int opcion, Scanner sc) {
        if (opcion >= 1 && opcion <= 4) {
            double[] numeros = pedirNumeros(sc);
            double resultado = realizarOperacion(opcion, numeros[0], numeros[1]);
            mostrarResultado(resultado);
        } else if (opcion != 0) {
            System.out.println("Opción inválida");
        }
    }
    
    public static double[] pedirNumeros(Scanner sc) {
        System.out.print("Número 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double num2 = sc.nextDouble();
        return new double[]{num1, num2};
    }
    
    public static double realizarOperacion(int opcion, double a, double b) {
        switch (opcion) {
            case 1: return a + b;
            case 2: return a - b;
            case 3: return a * b;
            case 4: return b != 0 ? a / b : 0;
            default: return 0;
        }
    }
    
    public static void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
```

---

## 🔁 Recursividad

Un método que se llama a sí mismo.

### Ejemplo 1: Factorial

```java
public static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;  // Caso base
    }
    return n * factorial(n - 1);  // Llamada recursiva
}

// Uso
System.out.println(factorial(5));  // 120
// 5! = 5 * 4 * 3 * 2 * 1 = 120
```

### Ejemplo 2: Fibonacci

```java
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// Uso
for (int i = 0; i < 10; i++) {
    System.out.print(fibonacci(i) + " ");
}
// Salida: 0 1 1 2 3 5 8 13 21 34
```

### Ejemplo 3: Suma de Dígitos

```java
public static int sumaDigitos(int numero) {
    if (numero == 0) {
        return 0;
    }
    return numero % 10 + sumaDigitos(numero / 10);
}

// Uso
System.out.println(sumaDigitos(1234));  // 10
// 4 + 3 + 2 + 1 = 10
```

### ⚠️ Cuidado con la Recursividad

```java
// ❌ Recursión infinita (sin caso base)
public static int malaRecursion(int n) {
    return malaRecursion(n - 1);  // StackOverflowError
}

// ✅ Recursión correcta (con caso base)
public static int buenaRecursion(int n) {
    if (n == 0) {
        return 0;  // Caso base
    }
    return n + buenaRecursion(n - 1);
}
```

---

## 📋 Sobrecarga de Métodos (Method Overloading)

Varios métodos con el mismo nombre pero diferentes parámetros.

```java
public class Sobrecarga {
    // Diferentes números de parámetros
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    public static int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    // Diferentes tipos de parámetros
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static String sumar(String a, String b) {
        return a + b;
    }
    
    // Uso
    public static void main(String[] args) {
        System.out.println(sumar(1, 2));           // 3
        System.out.println(sumar(1, 2, 3));        // 6
        System.out.println(sumar(1, 2, 3, 4));     // 10
        System.out.println(sumar(1.5, 2.5));       // 4.0
        System.out.println(sumar("Hola", "Mundo")); // HolaMundo
    }
}
```

### Reglas para Sobrecarga

✅ **Permitido:**
- Diferente número de parámetros
- Diferentes tipos de parámetros
- Diferente orden de tipos de parámetros

❌ **No permitido:**
- Solo cambiar el tipo de retorno
- Solo cambiar nombres de parámetros

```java
// ✅ Válido
public static int calcular(int a, double b) { ... }
public static int calcular(double a, int b) { ... }

// ❌ Inválido (error de compilación)
public static int calcular(int a, int b) { ... }
public static double calcular(int a, int b) { ... }  // Solo cambia retorno
```

---

## 📝 Documentación de Métodos (Javadoc)

```java
/**
 * Calcula el área de un rectángulo.
 * 
 * @param base   La base del rectángulo
 * @param altura La altura del rectángulo
 * @return       El área calculada (base * altura)
 */
public static double calcularAreaRectangulo(double base, double altura) {
    return base * altura;
}

/**
 * Verifica si un número es primo.
 * 
 * @param numero El número a verificar
 * @return       true si es primo, false en caso contrario
 */
public static boolean esPrimo(int numero) {
    if (numero <= 1) return false;
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) return false;
    }
    return true;
}
```

---

## ✅ Ejemplo Integrador Completo

```java
import java.util.Scanner;

/**
 * Sistema de gestión de calificaciones de estudiantes.
 */
public class GestionCalificaciones {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos estudiantes? ");
        int cantidad = sc.nextInt();
        
        double[] calificaciones = ingresarCalificaciones(cantidad, sc);
        mostrarEstadisticas(calificaciones);
    }
    
    /**
     * Solicita al usuario ingresar las calificaciones.
     */
    public static double[] ingresarCalificaciones(int cantidad, Scanner sc) {
        double[] calificaciones = new double[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            do {
                System.out.print("Calificación estudiante " + (i + 1) + " (0-10): ");
                calificaciones[i] = sc.nextDouble();
                
                if (!esCalificacionValida(calificaciones[i])) {
                    System.out.println("Error: Ingresa una calificación entre 0 y 10");
                }
            } while (!esCalificacionValida(calificaciones[i]));
        }
        
        return calificaciones;
    }
    
    /**
     * Valida que una calificación esté en el rango 0-10.
     */
    public static boolean esCalificacionValida(double calificacion) {
        return calificacion >= 0 && calificacion <= 10;
    }
    
    /**
     * Muestra las estadísticas de las calificaciones.
     */
    public static void mostrarEstadisticas(double[] calificaciones) {
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.printf("Promedio: %.2f\n", calcularPromedio(calificaciones));
        System.out.printf("Máxima: %.2f\n", obtenerMaximo(calificaciones));
        System.out.printf("Mínima: %.2f\n", obtenerMinimo(calificaciones));
        System.out.println("Aprobados: " + contarAprobados(calificaciones));
        System.out.println("Reprobados: " + contarReprobados(calificaciones));
        
        mostrarDistribucion(calificaciones);
    }
    
    /**
     * Calcula el promedio de las calificaciones.
     */
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / calificaciones.length;
    }
    
    /**
     * Obtiene la calificación máxima.
     */
    public static double obtenerMaximo(double[] calificaciones) {
        double max = calificaciones[0];
        for (double cal : calificaciones) {
            if (cal > max) max = cal;
        }
        return max;
    }
    
    /**
     * Obtiene la calificación mínima.
     */
    public static double obtenerMinimo(double[] calificaciones) {
        double min = calificaciones[0];
        for (double cal : calificaciones) {
            if (cal < min) min = cal;
        }
        return min;
    }
    
    /**
     * Cuenta cuántos estudiantes aprobaron (>= 6.0).
     */
    public static int contarAprobados(double[] calificaciones) {
        int contador = 0;
        for (double cal : calificaciones) {
            if (cal >= 6.0) contador++;
        }
        return contador;
    }
    
    /**
     * Cuenta cuántos estudiantes reprobaron (< 6.0).
     */
    public static int contarReprobados(double[] calificaciones) {
        return calificaciones.length - contarAprobados(calificaciones);
    }
    
    /**
     * Muestra la distribución de calificaciones por letra.
     */
    public static void mostrarDistribucion(double[] calificaciones) {
        int a = 0, b = 0, c = 0, d = 0, f = 0;
        
        for (double cal : calificaciones) {
            char letra = obtenerLetra(cal);
            switch (letra) {
                case 'A': a++; break;
                case 'B': b++; break;
                case 'C': c++; break;
                case 'D': d++; break;
                case 'F': f++; break;
            }
        }
        
        System.out.println("\nDistribución:");
        System.out.println("A (9-10): " + a);
        System.out.println("B (8-8.9): " + b);
        System.out.println("C (7-7.9): " + c);
        System.out.println("D (6-6.9): " + d);
        System.out.println("F (0-5.9): " + f);
    }
    
    /**
     * Convierte una calificación numérica a letra.
     */
    public static char obtenerLetra(double calificacion) {
        if (calificacion >= 9) return 'A';
        else if (calificacion >= 8) return 'B';
        else if (calificacion >= 7) return 'C';
        else if (calificacion >= 6) return 'D';
        else return 'F';
    }
}
```

---

## 📝 Resumen

| Concepto | Sintaxis | Ejemplo |
|----------|----------|---------|
| **Método sin retorno** | `void nombre()` | `void saludar()` |
| **Método con retorno** | `tipo nombre()` | `int sumar()` |
| **Con parámetros** | `tipo nombre(params)` | `int sumar(int a, int b)` |
| **Llamada** | `nombreMetodo(args)` | `sumar(5, 3)` |
| **Recursividad** | Método se llama a sí mismo | `factorial(n-1)` |
| **Sobrecarga** | Mismo nombre, diferentes params | `sumar(int)`, `sumar(double)` |

---

## 💡 Buenas Prácticas

1. ✅ **Un método, una responsabilidad** (Single Responsibility Principle)
2. ✅ Nombres descriptivos en verbo: `calcular`, `obtener`, `validar`
3. ✅ Métodos cortos (idealmente < 20 líneas)
4. ✅ Documenta métodos públicos con Javadoc
5. ✅ Valida parámetros de entrada
6. ✅ Evita efectos secundarios inesperados
7. ✅ Retorna valores en lugar de imprimir (más reutilizable)
8. ✅ Usa nombres de parámetros descriptivos

```java
// ❌ Mal
public static int c(int x, int y) {
    System.out.println(x + y);  // No debería imprimir
    return x + y;
}

// ✅ Bien
/**
 * Suma dos números enteros.
 * @param primerNumero El primer sumando
 * @param segundoNumero El segundo sumando
 * @return La suma de ambos números
 */
public static int sumarNumeros(int primerNumero, int segundoNumero) {
    return primerNumero + segundoNumero;
}
```

---

## ⚠️ Errores Comunes

```java
// ❌ Falta return
public static int sumar(int a, int b) {
    int suma = a + b;
    // Error: falta return
}

// ❌ Tipo de retorno incorrecto
public static int dividir(int a, int b) {
    return a / b;  // Debería ser double
}

// ❌ Llamada sin asignar/usar resultado
public static void main(String[] args) {
    sumar(5, 3);  // El resultado se pierde
}

// ✅ Correcto
public static int sumar(int a, int b) {
    return a + b;
}

public static double dividir(double a, double b) {
    return a / b;
}

public static void main(String[] args) {
    int resultado = sumar(5, 3);
    System.out.println(resultado);
}
```

---

[⬅️ Anterior: Arrays](06-arrays.md) | [➡️ Siguiente: Proyecto Integrador](../../2-practica/README.md)
