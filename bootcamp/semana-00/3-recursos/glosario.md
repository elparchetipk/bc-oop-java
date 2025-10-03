# Glosario de Términos - Semana 0: Fundamentos de Java

> Términos y conceptos clave organizados alfabéticamente

---

## A

### **API (Application Programming Interface)**
Conjunto de definiciones y protocolos para construir e integrar software. Java tiene muchas APIs estándar.

### **Arreglo (Array)**
Estructura de datos que almacena múltiples valores del mismo tipo en una secuencia ordenada. Se accede mediante índices.
```java
int[] numeros = {1, 2, 3, 4, 5};
```

### **Asignación**
Operación que almacena un valor en una variable usando el operador `=`.
```java
int edad = 25;
```

---

## B

### **Bloque de código**
Conjunto de instrucciones agrupadas entre llaves `{ }`.

### **Booleano (boolean)**
Tipo de dato primitivo que solo puede ser `true` o `false`.

### **Break**
Palabra clave que termina la ejecución de un bucle o switch-case.

### **Bucle (Loop)**
Estructura de control que repite un bloque de código mientras se cumpla una condición.

### **byte**
Tipo de dato primitivo entero de 8 bits. Rango: -128 a 127.

---

## C

### **Camel Case**
Convención de nomenclatura donde la primera palabra está en minúsculas y las siguientes empiezan con mayúscula.
```java
int miEdad;
String nombreCompleto;
```

### **Casting**
Conversión de un tipo de dato a otro.
```java
double d = 9.78;
int i = (int) d; // casting explícito
```

### **char**
Tipo de dato primitivo que almacena un único carácter Unicode.
```java
char letra = 'A';
```

### **Clase (Class)**
Plantilla o molde para crear objetos. Define atributos y métodos.

### **Comentario**
Texto en el código que no se ejecuta, usado para documentación.
```java
// Comentario de una línea
/* Comentario
   multilínea */
/** Comentario Javadoc */
```

### **Compilador**
Programa que traduce código fuente Java a bytecode.

### **Constante**
Variable cuyo valor no puede cambiar después de ser inicializada. Se declara con `final`.
```java
final double PI = 3.14159;
```

### **continue**
Palabra clave que salta a la siguiente iteración de un bucle.

---

## D

### **Declaración**
Acción de definir una variable especificando su tipo y nombre.
```java
int edad;
```

### **do-while**
Bucle que se ejecuta al menos una vez antes de evaluar la condición.
```java
do {
    // código
} while (condicion);
```

### **double**
Tipo de dato primitivo de punto flotante de doble precisión (64 bits).

---

## E

### **Entrada/Salida (I/O)**
Operaciones de lectura (entrada) y escritura (salida) de datos.

### **Estructura de control**
Construcciones del lenguaje que controlan el flujo de ejecución (if, for, while, switch).

### **Expresión**
Combinación de variables, operadores y valores que produce un resultado.
```java
int resultado = (a + b) * c;
```

---

## F

### **final**
Palabra clave que indica que una variable no puede ser modificada después de su inicialización.

### **float**
Tipo de dato primitivo de punto flotante de simple precisión (32 bits).

### **for**
Bucle con inicialización, condición e incremento definidos.
```java
for (int i = 0; i < 10; i++) {
    // código
}
```

### **Función**
Ver **Método**.

---

## I

### **IDE (Integrated Development Environment)**
Entorno de desarrollo integrado como IntelliJ IDEA, Eclipse o VS Code.

### **if-else**
Estructura condicional que ejecuta código según una condición booleana.
```java
if (condicion) {
    // código si verdadero
} else {
    // código si falso
}
```

### **Indentación**
Espacios o tabulaciones al inicio de líneas para mejorar legibilidad.

### **Inicialización**
Asignar un valor inicial a una variable al declararla.
```java
int edad = 25;
```

### **int**
Tipo de dato primitivo entero de 32 bits. Rango: -2,147,483,648 a 2,147,483,647.

---

## J

### **Java**
Lenguaje de programación orientado a objetos, multiplataforma y de propósito general.

### **Javadoc**
Sistema de documentación estándar para código Java usando comentarios especiales `/** */`.

### **JDK (Java Development Kit)**
Kit de desarrollo que incluye compilador, JRE y herramientas de desarrollo.

### **JRE (Java Runtime Environment)**
Entorno de ejecución que incluye JVM y bibliotecas necesarias para ejecutar programas Java.

### **JVM (Java Virtual Machine)**
Máquina virtual que ejecuta bytecode Java. Permite independencia de plataforma.

---

## L

### **Literal**
Valor fijo escrito directamente en el código.
```java
int num = 42;        // literal entero
double pi = 3.14;    // literal decimal
char c = 'A';        // literal carácter
String s = "Hola";   // literal cadena
```

### **long**
Tipo de dato primitivo entero de 64 bits. Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.

---

## M

### **Main Method**
Método principal que sirve como punto de entrada de un programa Java.
```java
public static void main(String[] args) {
    // código
}
```

### **Método (Method)**
Bloque de código reutilizable que realiza una tarea específica. Puede recibir parámetros y devolver un valor.
```java
public static int sumar(int a, int b) {
    return a + b;
}
```

---

## O

### **Operador**
Símbolo que realiza operaciones sobre operandos.
- **Aritméticos**: `+`, `-`, `*`, `/`, `%`
- **Relacionales**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Lógicos**: `&&`, `||`, `!`
- **Asignación**: `=`, `+=`, `-=`, etc.

### **Operador ternario**
Forma abreviada de if-else.
```java
int max = (a > b) ? a : b;
```

---

## P

### **Palabra clave (Keyword)**
Palabra reservada del lenguaje con significado especial (if, for, while, class, public, etc.).

### **Parámetro**
Variable en la definición de un método que recibe valores.
```java
public void saludar(String nombre) {
    // 'nombre' es un parámetro
}
```

### **printf()**
Método para imprimir con formato.
```java
System.out.printf("Edad: %d años%n", 25);
```

### **Primitivo (Tipo)**
Tipo de dato básico incorporado en Java: byte, short, int, long, float, double, char, boolean.

### **public**
Modificador de acceso que indica que algo es accesible desde cualquier lugar.

---

## R

### **return**
Palabra clave que devuelve un valor desde un método y termina su ejecución.
```java
return resultado;
```

---

## S

### **Scanner**
Clase para leer entrada del usuario desde consola.
```java
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

### **Scope (Ámbito)**
Región del código donde una variable es visible y puede ser usada.

### **short**
Tipo de dato primitivo entero de 16 bits. Rango: -32,768 a 32,767.

### **static**
Palabra clave que indica que un miembro pertenece a la clase, no a instancias.

### **String**
Clase que representa cadenas de texto.
```java
String mensaje = "Hola Mundo";
```

### **switch-case**
Estructura de control que ejecuta diferentes bloques según el valor de una expresión.
```java
switch (opcion) {
    case 1:
        // código
        break;
    case 2:
        // código
        break;
    default:
        // código
}
```

### **System.out.println()**
Método para imprimir texto en consola con salto de línea.

---

## T

### **Tipo de dato**
Clasificación que especifica qué tipo de valor puede almacenar una variable.

---

## V

### **Variable**
Espacio en memoria identificado por un nombre que almacena un valor.
```java
int edad = 30;
```

### **void**
Palabra clave que indica que un método no devuelve ningún valor.
```java
public static void imprimir() {
    System.out.println("Hola");
}
```

---

## W

### **while**
Bucle que se ejecuta mientras una condición sea verdadera.
```java
while (condicion) {
    // código
}
```

---

## Símbolos

### **{ } (Llaves)**
Delimitan bloques de código.

### **[ ] (Corchetes)**
Se usan para declarar y acceder a arrays.

### **( ) (Paréntesis)**
Se usan en expresiones, condiciones y llamadas a métodos.

### **; (Punto y coma)**
Termina una instrucción en Java.

### **// (Doble barra)**
Inicia un comentario de una línea.

### **/* */ (Barra-asterisco)**
Delimita comentarios multilínea.

---

## 📚 Recursos Adicionales

- [Oracle Java Glossary](https://docs.oracle.com/javase/tutorial/information/glossary.html)
- [W3Schools Java Reference](https://www.w3schools.com/java/)
- [GeeksforGeeks Java Basics](https://www.geeksforgeeks.org/java/)

---

[⬅️ Volver a Semana 0](../README.md)
