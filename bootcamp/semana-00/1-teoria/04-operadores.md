# 04 - Operadores en Java

## 🔧 ¿Qué son los Operadores?

Los operadores son símbolos especiales que realizan operaciones sobre uno, dos o tres operandos, y producen un resultado.

```java
int resultado = 5 + 3;  // '+' es el operador, 5 y 3 son operandos
```

---

## ➕ Operadores Aritméticos

Realizan operaciones matemáticas básicas.

| Operador | Operación | Ejemplo | Resultado |
|----------|-----------|---------|-----------|
| `+` | Suma | `5 + 3` | `8` |
| `-` | Resta | `5 - 3` | `2` |
| `*` | Multiplicación | `5 * 3` | `15` |
| `/` | División | `10 / 2` | `5` |
| `%` | Módulo (residuo) | `10 % 3` | `1` |

### Ejemplos

```java
int a = 10;
int b = 3;

int suma = a + b;           // 13
int resta = a - b;          // 7
int multiplicacion = a * b; // 30
int division = a / b;       // 3 (división entera)
int modulo = a % b;         // 1 (residuo)

double divisionDecimal = (double) a / b;  // 3.333...
```

### ⚠️ División de Enteros

```java
int x = 7;
int y = 2;

int resultado = x / y;        // 3 (no 3.5!)
double correcta = (double) x / y;  // 3.5 ✅
```

### Operador Módulo (%)

Útil para verificar divisibilidad:

```java
int numero = 10;

if (numero % 2 == 0) {
    System.out.println("Par");
} else {
    System.out.println("Impar");
}

// Obtener último dígito
int ultimoDigito = 12345 % 10;  // 5
```

---

## 🔢 Operadores Unarios

Operan sobre un solo operando.

| Operador | Operación | Ejemplo | Resultado |
|----------|-----------|---------|-----------|
| `+` | Positivo (raramente usado) | `+5` | `5` |
| `-` | Negación | `-5` | `-5` |
| `++` | Incremento | `x++` o `++x` | `x = x + 1` |
| `--` | Decremento | `x--` o `--x` | `x = x - 1` |
| `!` | NOT lógico | `!true` | `false` |

### Incremento y Decremento

#### Postfijo (x++)

```java
int x = 5;
int y = x++;  // y = 5, luego x = 6
System.out.println("x: " + x);  // 6
System.out.println("y: " + y);  // 5
```

#### Prefijo (++x)

```java
int x = 5;
int y = ++x;  // x = 6, luego y = 6
System.out.println("x: " + x);  // 6
System.out.println("y: " + y);  // 6
```

### Comparación

```java
int a = 10;

// Postfijo
int b = a++;  // b = 10, a = 11

int c = 10;

// Prefijo
int d = ++c;  // c = 11, d = 11
```

---

## 📊 Operadores Relacionales (Comparación)

Comparan dos valores y retornan `true` o `false`.

| Operador | Operación | Ejemplo | Resultado |
|----------|-----------|---------|-----------|
| `==` | Igual a | `5 == 5` | `true` |
| `!=` | Diferente de | `5 != 3` | `true` |
| `>` | Mayor que | `5 > 3` | `true` |
| `<` | Menor que | `3 < 5` | `true` |
| `>=` | Mayor o igual | `5 >= 5` | `true` |
| `<=` | Menor o igual | `3 <= 5` | `true` |

### Ejemplos

```java
int edad = 18;

boolean esMayorDeEdad = edad >= 18;     // true
boolean esMenorDeEdad = edad < 18;      // false
boolean esExactamente18 = edad == 18;   // true
boolean noEs18 = edad != 18;            // false
```

### ⚠️ Comparar Strings

```java
String nombre1 = "Juan";
String nombre2 = "Juan";

// ❌ NO usar ==
if (nombre1 == nombre2) {  // Compara referencias
    // Puede dar resultados inesperados
}

// ✅ Usar .equals()
if (nombre1.equals(nombre2)) {  // Compara contenido
    System.out.println("Son iguales");
}
```

---

## 🔗 Operadores Lógicos

Combinan expresiones booleanas.

| Operador | Operación | Ejemplo | Descripción |
|----------|-----------|---------|-------------|
| `&&` | AND (Y) | `true && false` | `true` solo si ambos son `true` |
| `\|\|` | OR (O) | `true \|\| false` | `true` si al menos uno es `true` |
| `!` | NOT (NO) | `!true` | Invierte el valor |

### Tabla de Verdad AND (&&)

| A | B | A && B |
|---|---|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

### Tabla de Verdad OR (||)

| A | B | A \|\| B |
|---|---|----------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

### Tabla de Verdad NOT (!)

| A | !A |
|---|----|
| true | false |
| false | true |

### Ejemplos Prácticos

```java
int edad = 20;
boolean tieneCarnet = true;

// AND: Ambas condiciones deben cumplirse
if (edad >= 18 && tieneCarnet) {
    System.out.println("Puede conducir");
}

// OR: Al menos una condición debe cumplirse
boolean esFinDeSemana = true;
boolean esFeriado = false;

if (esFinDeSemana || esFeriado) {
    System.out.println("No hay clases");
}

// NOT: Inversión
boolean estaLloviendo = false;
if (!estaLloviendo) {
    System.out.println("Puedes salir a caminar");
}
```

### Evaluación de Cortocircuito

```java
int x = 5;
int y = 0;

// && cortocircuito: si la primera es false, no evalúa la segunda
if (y != 0 && x / y > 2) {  // No da error
    System.out.println("OK");
}

// || cortocircuito: si la primera es true, no evalúa la segunda
if (x > 0 || x / y > 2) {  // No da error
    System.out.println("OK");
}
```

---

## ✏️ Operadores de Asignación

Asignan valores a variables.

| Operador | Ejemplo | Equivalente a |
|----------|---------|---------------|
| `=` | `x = 5` | Asignación simple |
| `+=` | `x += 3` | `x = x + 3` |
| `-=` | `x -= 3` | `x = x - 3` |
| `*=` | `x *= 3` | `x = x * 3` |
| `/=` | `x /= 3` | `x = x / 3` |
| `%=` | `x %= 3` | `x = x % 3` |

### Ejemplos

```java
int x = 10;

x += 5;   // x = 10 + 5 = 15
x -= 3;   // x = 15 - 3 = 12
x *= 2;   // x = 12 * 2 = 24
x /= 4;   // x = 24 / 4 = 6
x %= 5;   // x = 6 % 5 = 1

System.out.println(x);  // 1
```

### Cadena de Asignaciones

```java
int a, b, c;
a = b = c = 10;  // Todas valen 10

System.out.println(a);  // 10
System.out.println(b);  // 10
System.out.println(c);  // 10
```

---

## ❓ Operador Ternario

Forma abreviada de if-else.

### Sintaxis

```java
condicion ? valorSiTrue : valorSiFalse
```

### Ejemplos

```java
int edad = 20;
String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
System.out.println(mensaje);  // "Mayor de edad"

// Encontrar el máximo
int a = 10, b = 20;
int max = (a > b) ? a : b;
System.out.println("Máximo: " + max);  // 20

// Anidado (no recomendado por legibilidad)
int numero = 0;
String resultado = (numero > 0) ? "Positivo" : 
                   (numero < 0) ? "Negativo" : "Cero";
```

---

## 🔤 Operador de Concatenación (+)

Para unir strings.

```java
String nombre = "Juan";
int edad = 25;

String mensaje = nombre + " tiene " + edad + " años";
System.out.println(mensaje);  // "Juan tiene 25 años"

// Concatenación de números
String resultado = "5" + 5;     // "55" (String)
String resultado2 = "5" + 5 + 5; // "555" (String)
String resultado3 = 5 + 5 + "5"; // "105" (10 + "5")
```

---

## 🎯 Precedencia de Operadores

El orden en que se evalúan los operadores.

### Tabla de Precedencia (Mayor a Menor)

| Nivel | Operadores | Asociatividad |
|-------|------------|---------------|
| 1 | `()` `[]` `.` | Izquierda a derecha |
| 2 | `++` `--` `!` `+` `-` (unarios) | Derecha a izquierda |
| 3 | `*` `/` `%` | Izquierda a derecha |
| 4 | `+` `-` | Izquierda a derecha |
| 5 | `<` `<=` `>` `>=` | Izquierda a derecha |
| 6 | `==` `!=` | Izquierda a derecha |
| 7 | `&&` | Izquierda a derecha |
| 8 | `\|\|` | Izquierda a derecha |
| 9 | `?:` (ternario) | Derecha a izquierda |
| 10 | `=` `+=` `-=` etc. | Derecha a izquierda |

### Ejemplos

```java
int resultado1 = 5 + 3 * 2;        // 11 (no 16)
int resultado2 = (5 + 3) * 2;      // 16

boolean test1 = 5 > 3 && 10 < 20;  // true
boolean test2 = 5 > 3 || 10 > 20;  // true

int x = 10;
int y = ++x * 2;  // 22 (++x primero, luego *2)
```

### 💡 Uso de Paréntesis

```java
// Sin paréntesis (confuso)
int resultado = 10 + 5 * 2 - 3;  // 17

// Con paréntesis (claro)
int resultado = (10 + (5 * 2)) - 3;  // 17
int resultado = 10 + ((5 * 2) - 3);  // 17
```

---

## ✅ Ejercicios Prácticos

### Ejercicio 1: Calculadora Básica

```java
int a = 15, b = 4;

System.out.println("Suma: " + (a + b));
System.out.println("Resta: " + (a - b));
System.out.println("Multiplicación: " + (a * b));
System.out.println("División: " + (a / b));
System.out.println("Módulo: " + (a % b));
```

### Ejercicio 2: Par o Impar

```java
int numero = 17;
String resultado = (numero % 2 == 0) ? "Par" : "Impar";
System.out.println(numero + " es " + resultado);
```

### Ejercicio 3: Comparaciones

```java
int edad = 20;
boolean esMayor = edad >= 18;
boolean esMenor = edad < 18;

System.out.println("Es mayor de edad: " + esMayor);
System.out.println("Es menor de edad: " + esMenor);
```

### Ejercicio 4: Lógica

```java
int nota = 85;
boolean aprobado = nota >= 70;
boolean excelente = nota >= 90;

if (aprobado && !excelente) {
    System.out.println("Aprobado con buena nota");
} else if (excelente) {
    System.out.println("Excelente!");
} else {
    System.out.println("Reprobado");
}
```

---

## 📝 Resumen

| Tipo | Operadores | Uso |
|------|------------|-----|
| **Aritméticos** | `+` `-` `*` `/` `%` | Operaciones matemáticas |
| **Unarios** | `++` `--` `!` `+` `-` | Operan sobre un valor |
| **Relacionales** | `==` `!=` `>` `<` `>=` `<=` | Comparaciones |
| **Lógicos** | `&&` `\|\|` `!` | Operaciones booleanas |
| **Asignación** | `=` `+=` `-=` `*=` `/=` `%=` | Asignar valores |
| **Ternario** | `?:` | if-else abreviado |
| **Concatenación** | `+` | Unir strings |

---

## 💡 Consejos

1. ✅ Usa paréntesis para claridad
2. ✅ Cuidado con la división de enteros
3. ✅ Usa `.equals()` para comparar Strings
4. ✅ Aprovecha el cortocircuito en operadores lógicos
5. ✅ El operador ternario es útil pero no abuses

---

[⬅️ Anterior: Tipos de Datos](03-tipos-datos.md) | [➡️ Siguiente: Estructuras de Control](05-estructuras-control.md)
