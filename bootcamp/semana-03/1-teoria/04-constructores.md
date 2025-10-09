# Constructores en Java

## 📋 Contenido

1. [¿Qué es un Constructor?](#qué-es-un-constructor)
2. [Características de los Constructores](#características-de-los-constructores)
3. [Tipos de Constructores](#tipos-de-constructores)
4. [Constructor por Defecto](#constructor-por-defecto)
5. [Constructor con Parámetros](#constructor-con-parámetros)
6. [La Palabra Clave `this`](#la-palabra-clave-this)
7. [Sobrecarga de Constructores](#sobrecarga-de-constructores)
8. [Llamada entre Constructores con `this()`](#llamada-entre-constructores-con-this)
9. [Inicialización de Atributos](#inicialización-de-atributos)
10. [Buenas Prácticas](#buenas-prácticas)

---

## ¿Qué es un Constructor?

Un **constructor** es un método especial que se ejecuta automáticamente cuando se crea un objeto de una clase. Su propósito principal es **inicializar** los atributos del objeto.

### Definición

> Un constructor es un bloque de código especial que prepara un objeto recién creado para su uso, estableciendo valores iniciales en sus atributos.

### Analogía

Piensa en un **constructor de edificios**:
- Cuando construyes una casa nueva, el constructor la prepara: instala puertas, ventanas, electricidad
- Cuando creas un objeto, el constructor Java lo prepara: asigna valores iniciales a los atributos

---

## Características de los Constructores

### Reglas Fundamentales

1. **El nombre del constructor DEBE ser exactamente igual al nombre de la clase**
```java
public class Persona {
    // ✅ Correcto
    public Persona() {
    }
    
    // ❌ Incorrecto: no es un constructor
    public persona() { // Minúscula
    }
    
    // ❌ Incorrecto: no es un constructor
    public PersonaConstructor() { // Nombre diferente
    }
}
```

2. **No tiene tipo de retorno** (ni siquiera `void`)
```java
public class Producto {
    // ✅ Correcto: sin tipo de retorno
    public Producto() {
    }
    
    // ❌ Incorrecto: tiene tipo de retorno
    public void Producto() { // Esto es un método, NO un constructor
    }
}
```

3. **Se llama automáticamente con `new`**
```java
Persona p = new Persona(); // Constructor se ejecuta automáticamente
```

4. **Puede haber múltiples constructores** (sobrecarga)
```java
public class Persona {
    public Persona() { }
    public Persona(String nombre) { }
    public Persona(String nombre, int edad) { }
}
```

5. **Si no defines ningún constructor, Java crea uno por defecto**
```java
public class Persona {
    // Java crea automáticamente: public Persona() { }
}
```

### Comparación: Constructor vs Método

| Característica | Constructor | Método Normal |
|----------------|-------------|---------------|
| **Nombre** | Igual a la clase | Cualquier nombre válido |
| **Tipo de retorno** | NO tiene | Debe tener (puede ser void) |
| **Llamada** | Automática con `new` | Manual |
| **Propósito** | Inicializar objeto | Realizar operaciones |
| **Sobrecarga** | Sí | Sí |

---

## Tipos de Constructores

### 1. Constructor Sin Parámetros (Default)

```java
public class Persona {
    private String nombre;
    private int edad;
    
    // Constructor sin parámetros
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
}

// Uso
Persona p = new Persona();
System.out.println(p.getNombre()); // "Sin nombre"
```

### 2. Constructor con Parámetros

```java
public class Persona {
    private String nombre;
    private int edad;
    
    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

// Uso
Persona p = new Persona("Juan", 25);
System.out.println(p.getNombre()); // "Juan"
```

### 3. Constructor con Parámetros Parciales

```java
public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;
    
    // Constructor con algunos parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = "No especificada"; // Valor por defecto
    }
}
```

---

## Constructor por Defecto

### Constructor Implícito

Si NO defines ningún constructor, Java crea uno automáticamente:

```java
// Tu código
public class Persona {
    private String nombre;
}

// Java genera automáticamente:
public class Persona {
    private String nombre;
    
    public Persona() { // Constructor por defecto implícito
    }
}
```

### Constructor Explícito

Cuando defines tu propio constructor sin parámetros:

```java
public class Persona {
    private String nombre;
    private int edad;
    
    // Constructor por defecto EXPLÍCITO
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
        System.out.println("Persona creada con valores por defecto");
    }
}
```

### ⚠️ Importante: Pérdida del Constructor por Defecto

```java
public class Persona {
    private String nombre;
    
    // Si defines CUALQUIER constructor...
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    // ...Java NO crea el constructor por defecto
}

// ❌ ERROR: no existe constructor sin parámetros
Persona p = new Persona(); // ERROR de compilación

// ✅ FUNCIONA: usa el constructor definido
Persona p = new Persona("Juan"); // OK
```

**Solución**: Define explícitamente el constructor sin parámetros si lo necesitas:

```java
public class Persona {
    private String nombre;
    
    // Constructor sin parámetros
    public Persona() {
        this.nombre = "Sin nombre";
    }
    
    // Constructor con parámetros
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
```

---

## Constructor con Parámetros

### Propósito

Permite crear objetos con valores específicos desde el inicio.

### Sintaxis

```java
public class NombreClase {
    private TipoA atributo1;
    private TipoB atributo2;
    
    public NombreClase(TipoA param1, TipoB param2) {
        this.atributo1 = param1;
        this.atributo2 = param2;
    }
}
```

### Ejemplo Completo

```java
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    
    /**
     * Constructor completo para crear un producto.
     * 
     * @param codigo Código único del producto
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     */
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
}

// Uso
Producto laptop = new Producto("LAP001", "Laptop HP", 1200.0);
Producto mouse = new Producto("MOU001", "Mouse Logitech", 25.0);
```

### Validación en Constructores

```java
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    
    public CuentaBancaria(String numeroCuenta, double saldo) {
        // Validación
        if (numeroCuenta == null || numeroCuenta.isEmpty()) {
            throw new IllegalArgumentException("Número de cuenta inválido");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo no puede ser negativo");
        }
        
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
}
```

---

## La Palabra Clave `this`

### ¿Qué es `this`?

`this` es una referencia al **objeto actual** (el que se está creando o usando).

### Uso 1: Diferenciar Parámetros de Atributos

```java
public class Persona {
    private String nombre; // Atributo
    
    public Persona(String nombre) { // Parámetro con el mismo nombre
        this.nombre = nombre; 
        // ↑ atributo   ↑ parámetro
    }
}
```

**Sin `this`:**
```java
public Persona(String nombre) {
    nombre = nombre; // ❌ Asigna el parámetro a sí mismo, no al atributo
}
```

**Con `this`:**
```java
public Persona(String nombre) {
    this.nombre = nombre; // ✅ Claramente asigna al atributo
}
```

### Uso 2: Nombres Diferentes (Optional)

```java
public class Persona {
    private String nombre;
    
    // Opción 1: Usar this (más claro)
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    // Opción 2: Nombres diferentes (this no necesario, pero puede usarse)
    public Persona(String n) {
        nombre = n; // Funciona sin this
        // o
        this.nombre = n; // También funciona, más explícito
    }
}
```

### Uso 3: Llamar a Otros Constructores

```java
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona() {
        this("Sin nombre", 0); // Llama al constructor con parámetros
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
```

---

## Sobrecarga de Constructores

### Concepto

**Sobrecarga** (overloading) es tener múltiples constructores con **diferentes parámetros** en la misma clase.

### Reglas

1. Mismo nombre (el de la clase)
2. Diferente número de parámetros O diferentes tipos de parámetros
3. No puede diferir solo en el tipo de retorno (no hay tipo de retorno)

### Ejemplo Básico

```java
public class Rectangulo {
    private double ancho;
    private double alto;
    
    // Constructor 1: Sin parámetros (cuadrado unitario)
    public Rectangulo() {
        this.ancho = 1.0;
        this.alto = 1.0;
    }
    
    // Constructor 2: Un parámetro (cuadrado)
    public Rectangulo(double lado) {
        this.ancho = lado;
        this.alto = lado;
    }
    
    // Constructor 3: Dos parámetros (rectángulo)
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

// Uso
Rectangulo r1 = new Rectangulo();           // 1x1
Rectangulo r2 = new Rectangulo(5);          // 5x5 (cuadrado)
Rectangulo r3 = new Rectangulo(4, 6);       // 4x6 (rectángulo)
```

### Ejemplo Avanzado

```java
public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;
    private String departamento;
    
    // Constructor 1: Solo nombre
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.cargo = "Sin asignar";
        this.salario = 0.0;
        this.departamento = "General";
    }
    
    // Constructor 2: Nombre y cargo
    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = 0.0;
        this.departamento = "General";
    }
    
    // Constructor 3: Nombre, cargo y salario
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = "General";
    }
    
    // Constructor 4: Todos los parámetros
    public Empleado(String nombre, String cargo, double salario, String departamento) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }
}

// Uso flexible
Empleado e1 = new Empleado("Ana");
Empleado e2 = new Empleado("Carlos", "Desarrollador");
Empleado e3 = new Empleado("María", "Gerente", 5000.0);
Empleado e4 = new Empleado("Juan", "Analista", 3000.0, "IT");
```

---

## Llamada entre Constructores con `this()`

### Propósito

Evitar duplicación de código al reutilizar la lógica de inicialización entre constructores.

### Sintaxis

```java
public NombreClase() {
    this(valorPorDefecto); // Llama a otro constructor
}

public NombreClase(Tipo parametro) {
    // Inicialización
}
```

### ⚠️ Regla Importante

La llamada `this()` **DEBE ser la primera línea** del constructor.

```java
// ❌ ERROR
public Persona(String nombre) {
    System.out.println("Creando persona");
    this(nombre, 0); // ERROR: this() debe ser la primera línea
}

// ✅ CORRECTO
public Persona(String nombre) {
    this(nombre, 0); // Primera línea
    System.out.println("Creando persona");
}
```

### Ejemplo Práctico

```java
public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;
    
    // Constructor completo (el principal)
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        System.out.println("Empleado creado: " + nombre);
    }
    
    // Constructor que llama al principal
    public Empleado(String nombre, String cargo) {
        this(nombre, cargo, 0.0); // Reutiliza el constructor principal
    }
    
    // Constructor que llama a otro
    public Empleado(String nombre) {
        this(nombre, "Sin cargo"); // Llama al constructor de 2 parámetros
    }
    
    // Constructor por defecto
    public Empleado() {
        this("Sin nombre"); // Llama al constructor de 1 parámetro
    }
}
```

### Flujo de Ejecución

```java
Empleado e = new Empleado();

// Flujo:
// 1. Empleado() llama a this("Sin nombre")
// 2. Empleado(String) llama a this("Sin nombre", "Sin cargo")
// 3. Empleado(String, String) llama a this("Sin nombre", "Sin cargo", 0.0)
// 4. Empleado(String, String, double) ejecuta la inicialización completa
```

### Ventajas

✅ **Evita duplicación de código**
```java
// ❌ SIN this(): Código duplicado
public Empleado() {
    this.nombre = "Sin nombre";
    this.cargo = "Sin cargo";
    this.salario = 0.0;
    System.out.println("Empleado creado");
}

public Empleado(String nombre) {
    this.nombre = nombre;
    this.cargo = "Sin cargo";
    this.salario = 0.0;
    System.out.println("Empleado creado"); // Duplicado
}

// ✅ CON this(): Sin duplicación
public Empleado() {
    this("Sin nombre");
}

public Empleado(String nombre) {
    this(nombre, "Sin cargo", 0.0);
}

public Empleado(String nombre, String cargo, double salario) {
    this.nombre = nombre;
    this.cargo = cargo;
    this.salario = salario;
    System.out.println("Empleado creado");
}
```

✅ **Facilita mantenimiento**
```java
// Si cambias la lógica de inicialización, solo modificas un constructor
```

✅ **Garantiza consistencia**
```java
// Todos los constructores usan la misma lógica de validación
```

---

## Inicialización de Atributos

### Formas de Inicializar

#### 1. Valores por Defecto (Java)

```java
public class Persona {
    private String nombre;  // null por defecto
    private int edad;       // 0 por defecto
    private boolean activo; // false por defecto
}
```

#### 2. Inicialización Directa en Declaración

```java
public class Persona {
    private String nombre = "Sin nombre";
    private int edad = 0;
    private boolean activo = true;
}
```

#### 3. Inicialización en Constructor

```java
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
}
```

#### 4. Combinación

```java
public class Contador {
    private int valor = 0;        // Valor por defecto
    private String nombre;
    
    public Contador(String nombre) {
        this.nombre = nombre;
        // valor ya está inicializado en 0
    }
}
```

### Orden de Inicialización

1. Inicialización directa en declaración de atributos
2. Bloques de inicialización (si existen)
3. Constructor

```java
public class Demo {
    private int a = 10;           // 1. Primero
    private int b;
    
    {
        b = 20;                   // 2. Segundo (bloque de inicialización)
    }
    
    public Demo() {
        System.out.println(a);    // 3. Tercero: imprime 10
        System.out.println(b);    // imprime 20
        a = 30;                   // 4. Modifica después
    }
}
```

---

## Buenas Prácticas

### ✅ DO's (Hacer)

#### 1. Validar Datos en Constructores

```java
public Producto(String codigo, double precio) {
    if (codigo == null || codigo.isEmpty()) {
        throw new IllegalArgumentException("Código no puede estar vacío");
    }
    if (precio < 0) {
        throw new IllegalArgumentException("Precio no puede ser negativo");
    }
    this.codigo = codigo;
    this.precio = precio;
}
```

#### 2. Usar `this()` para Evitar Duplicación

```java
public Persona() {
    this("Sin nombre", 0);
}

public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
}
```

#### 3. Documentar Constructores Públicos

```java
/**
 * Crea un nuevo empleado con todos los datos.
 * 
 * @param nombre Nombre completo del empleado
 * @param salario Salario mensual, debe ser >= 0
 * @throws IllegalArgumentException si salario es negativo
 */
public Empleado(String nombre, double salario) {
    // ...
}
```

#### 4. Proporcionar Múltiples Opciones

```java
// Flexibilidad para el usuario
public Rectangulo() { }
public Rectangulo(double lado) { }
public Rectangulo(double ancho, double alto) { }
```

### ❌ DON'Ts (No Hacer)

#### 1. No Dejes Atributos Sin Inicializar

```java
// ❌ MAL
public class Persona {
    private String nombre; // Queda null
    
    public Persona() {
        // No inicializa nada
    }
}

// ✅ BIEN
public Persona() {
    this.nombre = "Sin nombre";
}
```

#### 2. No Hagas Constructores Demasiado Complejos

```java
// ❌ MAL: Constructor hace demasiado
public Empleado(String nombre, double salario) {
    this.nombre = nombre;
    this.salario = salario;
    conectarBaseDatos();
    enviarEmail();
    generarReporte();
}

// ✅ BIEN: Constructor solo inicializa
public Empleado(String nombre, double salario) {
    this.nombre = nombre;
    this.salario = salario;
}
```

#### 3. No Ignores la Validación

```java
// ❌ MAL
public CuentaBancaria(double saldo) {
    this.saldo = saldo; // ¿Y si es negativo?
}

// ✅ BIEN
public CuentaBancaria(double saldo) {
    if (saldo < 0) {
        throw new IllegalArgumentException("Saldo no puede ser negativo");
    }
    this.saldo = saldo;
}
```

---

## Ejemplo Completo

```java
/**
 * Representa una cuenta bancaria.
 */
public class CuentaBancaria {
    // Atributos
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private boolean activa;
    
    // Constructor 1: Por defecto
    public CuentaBancaria() {
        this("000000", "Sin titular", 0.0);
    }
    
    // Constructor 2: Cuenta básica
    public CuentaBancaria(String numeroCuenta, String titular) {
        this(numeroCuenta, titular, 0.0);
    }
    
    // Constructor 3: Completo (principal)
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        // Validación
        if (numeroCuenta == null || numeroCuenta.length() < 6) {
            throw new IllegalArgumentException("Número de cuenta inválido");
        }
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Titular no puede estar vacío");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial no puede ser negativo");
        }
        
        // Inicialización
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.activa = true;
        
        System.out.println("Cuenta creada exitosamente");
    }
    
    // Getters
    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public boolean isActiva() { return activa; }
    
    // Métodos de negocio
    public boolean depositar(double monto) {
        if (monto > 0 && activa) {
            saldo += monto;
            return true;
        }
        return false;
    }
    
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo && activa) {
            saldo -= monto;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("Cuenta[%s, %s, Saldo: $%.2f]", 
            numeroCuenta, titular, saldo);
    }
}
```

### Uso

```java
public class PruebaCuenta {
    public static void main(String[] args) {
        // Usando diferentes constructores
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("123456", "Juan Pérez");
        CuentaBancaria cuenta3 = new CuentaBancaria("789012", "Ana López", 1000.0);
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        
        cuenta3.depositar(500);
        cuenta3.retirar(200);
        System.out.println("Saldo final: $" + cuenta3.getSaldo());
    }
}
```

---

## Referencias

- [Java Constructors Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- Effective Java (Joshua Bloch) - Item 1: "Consider static factory methods instead of constructors"

---

**Próximo tema:** [Sobrecarga de Constructores](./05-sobrecarga-constructores.md)

