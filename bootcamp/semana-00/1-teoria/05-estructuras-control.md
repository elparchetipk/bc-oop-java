# 05 - Estructuras de Control

Las estructuras de control determinan el flujo de ejecución de un programa. Permiten tomar decisiones y repetir bloques de código.

---

## 🔀 Estructuras Condicionales

### 1. if - else if - else

Ejecuta código basándose en condiciones.

#### Sintaxis

```java
if (condicion) {
    // código si la condición es true
}
```

#### if-else

```java
if (condicion) {
    // código si true
} else {
    // código si false
}
```

#### if-else if-else

```java
if (condicion1) {
    // código si condicion1 es true
} else if (condicion2) {
    // código si condicion2 es true
} else {
    // código si ninguna es true
}
```

### 📝 Ejemplos Prácticos

#### Ejemplo 1: Verificar Mayor de Edad

```java
int edad = 18;

if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```

#### Ejemplo 2: Calificaciones

```java
int nota = 85;

if (nota >= 90) {
    System.out.println("Excelente");
} else if (nota >= 80) {
    System.out.println("Muy bien");
} else if (nota >= 70) {
    System.out.println("Bien");
} else if (nota >= 60) {
    System.out.println("Suficiente");
} else {
    System.out.println("Insuficiente");
}
```

#### Ejemplo 3: Múltiples Condiciones

```java
int edad = 25;
boolean tieneCarnet = true;

if (edad >= 18 && tieneCarnet) {
    System.out.println("Puede conducir");
} else if (edad >= 18 && !tieneCarnet) {
    System.out.println("Puede sacar el carnet");
} else {
    System.out.println("No puede conducir aún");
}
```

### ⚠️ Errores Comunes

```java
// ❌ Sin llaves (peligroso con múltiples líneas)
if (x > 0)
    System.out.println("Positivo");
    System.out.println("Esto siempre se ejecuta"); // No está en el if!

// ✅ Con llaves (recomendado)
if (x > 0) {
    System.out.println("Positivo");
    System.out.println("Mayor que cero");
}

// ❌ Asignación en lugar de comparación
if (x = 5) {  // Error de compilación
    // ...
}

// ✅ Comparación correcta
if (x == 5) {
    // ...
}
```

---

### 2. switch-case

Ejecuta código basado en el valor de una expresión.

#### Sintaxis

```java
switch (expresion) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    default:
        // código si ningún case coincide
}
```

### 📝 Ejemplos Prácticos

#### Ejemplo 1: Días de la Semana

```java
int dia = 3;
String nombreDia;

switch (dia) {
    case 1:
        nombreDia = "Lunes";
        break;
    case 2:
        nombreDia = "Martes";
        break;
    case 3:
        nombreDia = "Miércoles";
        break;
    case 4:
        nombreDia = "Jueves";
        break;
    case 5:
        nombreDia = "Viernes";
        break;
    case 6:
        nombreDia = "Sábado";
        break;
    case 7:
        nombreDia = "Domingo";
        break;
    default:
        nombreDia = "Día inválido";
}

System.out.println("Hoy es: " + nombreDia);
```

#### Ejemplo 2: Menú de Opciones

```java
int opcion = 2;

switch (opcion) {
    case 1:
        System.out.println("Crear nuevo archivo");
        break;
    case 2:
        System.out.println("Abrir archivo");
        break;
    case 3:
        System.out.println("Guardar archivo");
        break;
    case 4:
        System.out.println("Salir");
        break;
    default:
        System.out.println("Opción inválida");
}
```

#### Ejemplo 3: Múltiples Cases (Fall-through)

```java
int mes = 12;

switch (mes) {
    case 12:
    case 1:
    case 2:
        System.out.println("Verano");
        break;
    case 3:
    case 4:
    case 5:
        System.out.println("Otoño");
        break;
    case 6:
    case 7:
    case 8:
        System.out.println("Invierno");
        break;
    case 9:
    case 10:
    case 11:
        System.out.println("Primavera");
        break;
    default:
        System.out.println("Mes inválido");
}
```

#### Ejemplo 4: Switch con String (Java 7+)

```java
String dia = "Lunes";

switch (dia) {
    case "Lunes":
    case "Martes":
    case "Miércoles":
    case "Jueves":
    case "Viernes":
        System.out.println("Día laboral");
        break;
    case "Sábado":
    case "Domingo":
        System.out.println("Fin de semana");
        break;
    default:
        System.out.println("Día inválido");
}
```

### 💡 Switch vs if-else

**Usar switch cuando:**
- ✅ Comparas una variable contra múltiples valores específicos
- ✅ Los valores son constantes (int, String, char, enum)
- ✅ Tienes muchos casos (> 3)

**Usar if-else cuando:**
- ✅ Necesitas rangos (x > 10 && x < 20)
- ✅ Condiciones complejas
- ✅ Comparas diferentes variables

---

## 🔄 Estructuras de Repetición (Bucles)

### 1. Bucle for

Repite código un número específico de veces.

#### Sintaxis

```java
for (inicialización; condición; actualización) {
    // código a repetir
}
```

### 📝 Ejemplos

#### Ejemplo 1: Contar del 1 al 10

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

#### Ejemplo 2: Contar hacia Atrás

```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
System.out.println("¡Despegue!");
```

#### Ejemplo 3: Saltos

```java
// De 2 en 2
for (int i = 0; i <= 20; i += 2) {
    System.out.println(i);
}

// Impares
for (int i = 1; i <= 20; i += 2) {
    System.out.println(i);
}
```

#### Ejemplo 4: Tabla de Multiplicar

```java
int numero = 5;

System.out.println("Tabla del " + numero);
for (int i = 1; i <= 10; i++) {
    System.out.println(numero + " x " + i + " = " + (numero * i));
}
```

#### Ejemplo 5: Bucles Anidados

```java
// Tabla de multiplicar completa
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 10; j++) {
        System.out.print(i + "x" + j + "=" + (i*j) + "\t");
    }
    System.out.println();
}

// Patrón de asteriscos
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
// Salida:
// * 
// * * 
// * * * 
// * * * * 
// * * * * *
```

---

### 2. Bucle while

Repite mientras la condición sea verdadera.

#### Sintaxis

```java
while (condicion) {
    // código a repetir
}
```

### 📝 Ejemplos

#### Ejemplo 1: Contador Simple

```java
int contador = 1;

while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

#### Ejemplo 2: Validación de Entrada

```java
Scanner scanner = new Scanner(System.in);
int numero = 0;

while (numero <= 0) {
    System.out.print("Ingresa un número positivo: ");
    numero = scanner.nextInt();
    
    if (numero <= 0) {
        System.out.println("Error: debe ser positivo");
    }
}

System.out.println("Número válido: " + numero);
```

#### Ejemplo 3: Suma de Números

```java
Scanner scanner = new Scanner(System.in);
int suma = 0;
int numero;

System.out.println("Ingresa números (0 para terminar):");

numero = scanner.nextInt();
while (numero != 0) {
    suma += numero;
    numero = scanner.nextInt();
}

System.out.println("Suma total: " + suma);
```

#### Ejemplo 4: Búsqueda

```java
int[] numeros = {5, 10, 15, 20, 25};
int buscar = 15;
int indice = 0;
boolean encontrado = false;

while (indice < numeros.length && !encontrado) {
    if (numeros[indice] == buscar) {
        encontrado = true;
        System.out.println("Encontrado en posición: " + indice);
    }
    indice++;
}

if (!encontrado) {
    System.out.println("No encontrado");
}
```

---

### 3. Bucle do-while

Ejecuta el código al menos una vez, luego repite mientras la condición sea verdadera.

#### Sintaxis

```java
do {
    // código a ejecutar
} while (condicion);
```

### 📝 Ejemplos

#### Ejemplo 1: Menú

```java
Scanner scanner = new Scanner(System.in);
int opcion;

do {
    System.out.println("\n=== MENÚ ===");
    System.out.println("1. Opción 1");
    System.out.println("2. Opción 2");
    System.out.println("3. Opción 3");
    System.out.println("0. Salir");
    System.out.print("Selecciona: ");
    
    opcion = scanner.nextInt();
    
    switch (opcion) {
        case 1:
            System.out.println("Ejecutando opción 1");
            break;
        case 2:
            System.out.println("Ejecutando opción 2");
            break;
        case 3:
            System.out.println("Ejecutando opción 3");
            break;
        case 0:
            System.out.println("¡Adiós!");
            break;
        default:
            System.out.println("Opción inválida");
    }
} while (opcion != 0);
```

#### Ejemplo 2: Validación

```java
Scanner scanner = new Scanner(System.in);
int edad;

do {
    System.out.print("Ingresa tu edad (0-120): ");
    edad = scanner.nextInt();
    
    if (edad < 0 || edad > 120) {
        System.out.println("Edad inválida. Intenta de nuevo.");
    }
} while (edad < 0 || edad > 120);

System.out.println("Edad válida: " + edad);
```

### 🔄 while vs do-while

**while:**
- Evalúa la condición ANTES de ejecutar
- Puede no ejecutarse nunca (si condición es false desde el inicio)

**do-while:**
- Evalúa la condición DESPUÉS de ejecutar
- Se ejecuta AL MENOS UNA VEZ

```java
// while - puede no ejecutarse
int x = 10;
while (x < 5) {
    System.out.println("Esto no se imprime");
    x++;
}

// do-while - se ejecuta al menos una vez
int y = 10;
do {
    System.out.println("Esto se imprime una vez");
    y++;
} while (y < 5);
```

---

## 🛑 Control de Bucles

### break

Termina el bucle inmediatamente.

```java
// Buscar el primer número par
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        System.out.println("Primer par encontrado: " + i);
        break;  // Sale del bucle
    }
}

// Salir de un while
int contador = 1;
while (true) {  // Bucle infinito controlado
    System.out.println(contador);
    if (contador >= 5) {
        break;
    }
    contador++;
}
```

### continue

Salta a la siguiente iteración.

```java
// Imprimir solo impares
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;  // Salta los pares
    }
    System.out.println(i);
}

// Saltar múltiplos de 3
for (int i = 1; i <= 20; i++) {
    if (i % 3 == 0) {
        continue;
    }
    System.out.println(i);
}
```

### break vs continue

```java
// Diferencia clara
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;  // Para en 3
    }
    System.out.println(i);
}
// Salida: 1, 2

for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;  // Salta el 3
    }
    System.out.println(i);
}
// Salida: 1, 2, 4, 5
```

---

## 📊 Comparación de Bucles

| Bucle | Cuándo Usar | Ejemplo |
|-------|-------------|---------|
| **for** | Sabes el número de iteraciones | Recorrer array, contar 1 a 10 |
| **while** | No sabes cuántas veces repetir | Validar entrada, buscar |
| **do-while** | Al menos una ejecución | Menús, pedir datos |

---

## ✅ Ejemplos Integradores

### Ejemplo 1: Calculadora con Menú

```java
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Número 1: ");
                double num1 = sc.nextDouble();
                System.out.print("Número 2: ");
                double num2 = sc.nextDouble();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Error: División por cero");
                        }
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción inválida");
            }
        } while (opcion != 0);
        
        System.out.println("¡Hasta luego!");
    }
}
```

### Ejemplo 2: Adivina el Número

```java
import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;  // 1-100
        int intentos = 0;
        int adivinanza;
        boolean acerto = false;
        
        System.out.println("¡Adivina el número entre 1 y 100!");
        
        while (!acerto && intentos < 10) {
            System.out.print("\nIntento " + (intentos + 1) + ": ");
            adivinanza = sc.nextInt();
            intentos++;
            
            if (adivinanza == numeroSecreto) {
                acerto = true;
                System.out.println("¡Correcto! Lo adivinaste en " + intentos + " intentos");
            } else if (adivinanza < numeroSecreto) {
                System.out.println("Muy bajo");
            } else {
                System.out.println("Muy alto");
            }
        }
        
        if (!acerto) {
            System.out.println("\nPerdiste. El número era: " + numeroSecreto);
        }
    }
}
```

---

## 📝 Resumen

| Estructura | Sintaxis | Uso |
|------------|----------|-----|
| **if-else** | `if (cond) {...} else {...}` | Decisiones |
| **switch** | `switch (var) { case: ... }` | Múltiples opciones |
| **for** | `for (init; cond; inc) {...}` | Iteraciones conocidas |
| **while** | `while (cond) {...}` | Iteraciones desconocidas |
| **do-while** | `do {...} while (cond);` | Al menos una vez |
| **break** | `break;` | Salir del bucle |
| **continue** | `continue;` | Siguiente iteración |

---

## 💡 Buenas Prácticas

1. ✅ Siempre usa llaves `{}` en if/else (incluso con una línea)
2. ✅ Usa `break` en cada `case` del switch
3. ✅ Evita bucles infinitos sin control
4. ✅ Nombra variables de control descriptivamente
5. ✅ Indenta correctamente para legibilidad

---

[⬅️ Anterior: Operadores](04-operadores.md) | [➡️ Siguiente: Arrays](06-arrays.md)
