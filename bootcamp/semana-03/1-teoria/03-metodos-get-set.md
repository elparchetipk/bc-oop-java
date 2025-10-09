# Métodos Get y Set (Getters y Setters)

## 📋 Contenido

1. [¿Qué son los Getters y Setters?](#qué-son-los-getters-y-setters)
2. [Propósito y Ventajas](#propósito-y-ventajas)
3. [Convenciones de Nomenclatura](#convenciones-de-nomenclatura)
4. [Implementación Básica](#implementación-básica)
5. [Validación en Setters](#validación-en-setters)
6. [Casos Especiales](#casos-especiales)
7. [Cuándo NO Usar Getters/Setters](#cuándo-no-usar-getterssetters)
8. [Buenas Prácticas](#buenas-prácticas)

---

## ¿Qué son los Getters y Setters?

Los **getters** y **setters** son métodos públicos que proporcionan acceso controlado a los atributos privados de una clase.

### Definiciones

| Tipo | Propósito | Retorna |
|------|-----------|---------|
| **Getter** | Obtener (leer) el valor de un atributo | El valor del atributo |
| **Setter** | Establecer (modificar) el valor de un atributo | void (generalmente) |

### Analogía

Piensa en una **caja fuerte**:
- **Atributo privado** = Contenido de la caja fuerte (no puedes tocarlo directamente)
- **Getter** = Mirilla para ver el contenido
- **Setter** = Ranura para depositar (con validación de seguridad)

---

## Propósito y Ventajas

### 1. Encapsulación

```java
// ❌ SIN getters/setters: Acceso directo
public class Persona {
    public String nombre; // Cualquiera puede modificar
}

Persona p = new Persona();
p.nombre = ""; // ¡Nombre vacío! Sin control

// ✅ CON getters/setters: Acceso controlado
public class Persona {
    private String nombre;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }
}

Persona p = new Persona();
p.setNombre(""); // Validación evita valor inválido
```

### 2. Validación de Datos

```java
public class Producto {
    private double precio;
    
    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("Precio no puede ser negativo");
            return;
        }
        this.precio = precio;
    }
}
```

### 3. Flexibilidad para Cambios

```java
// Versión 1: Almacena temperatura en Celsius
public class Termometro {
    private double temperaturaCelsius;
    
    public double getTemperatura() {
        return temperaturaCelsius;
    }
    
    public void setTemperatura(double temp) {
        this.temperaturaCelsius = temp;
    }
}

// Versión 2: Internamente cambia a Fahrenheit
public class Termometro {
    private double temperaturaFahrenheit; // Cambio interno
    
    // Interfaz pública NO cambia
    public double getTemperatura() {
        return (temperaturaFahrenheit - 32) * 5/9; // Convierte a Celsius
    }
    
    public void setTemperatura(double tempCelsius) {
        this.temperaturaFahrenheit = (tempCelsius * 9/5) + 32;
    }
}
// Los usuarios no notan la diferencia
```

### 4. Comportamiento Adicional

```java
public class CuentaBancaria {
    private double saldo;
    private List<String> historial;
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
        // Comportamiento adicional
        registrarEnHistorial("Saldo modificado a: " + saldo);
        notificarCambio();
    }
    
    private void registrarEnHistorial(String mensaje) {
        historial.add(LocalDateTime.now() + ": " + mensaje);
    }
    
    private void notificarCambio() {
        System.out.println("Alerta: Saldo modificado");
    }
}
```

### 5. Solo Lectura o Solo Escritura

```java
public class Usuario {
    private String username;
    private String passwordHash;
    private LocalDateTime fechaCreacion;
    
    // Solo lectura: tiene getter, NO setter
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    
    // Solo escritura: tiene setter, NO getter (para seguridad)
    public void setPassword(String password) {
        this.passwordHash = encriptar(password);
    }
    // No hay getPassword() por seguridad
}
```

---

## Convenciones de Nomenclatura

### Reglas Estándar de Java

#### Para Tipos Regulares

```java
private TipoA atributo;

// Getter: get + Nombre del atributo (capitalizado)
public TipoA getAtributo() {
    return atributo;
}

// Setter: set + Nombre del atributo (capitalizado)
public void setAtributo(TipoA atributo) {
    this.atributo = atributo;
}
```

#### Para Tipo Boolean

```java
private boolean activo;

// Getter: is + Nombre (capitalizado) - NO "get"
public boolean isActivo() {
    return activo;
}

// Setter: set + Nombre (capitalizado) - igual que otros tipos
public void setActivo(boolean activo) {
    this.activo = activo;
}
```

### Ejemplos Completos

```java
public class Persona {
    // Atributo String
    private String nombre;
    
    public String getNombre() {          // ✅ Correcto
        return nombre;
    }
    
    public void setNombre(String nombre) { // ✅ Correcto
        this.nombre = nombre;
    }
    
    // Atributo int
    private int edad;
    
    public int getEdad() {               // ✅ Correcto
        return edad;
    }
    
    public void setEdad(int edad) {      // ✅ Correcto
        this.edad = edad;
    }
    
    // Atributo boolean
    private boolean estudiante;
    
    public boolean isEstudiante() {      // ✅ Correcto: is, NO get
        return estudiante;
    }
    
    public void setEstudiante(boolean estudiante) { // ✅ Correcto
        this.estudiante = estudiante;
    }
    
    // Atributo boolean con "es"
    private boolean activo;
    
    public boolean isActivo() {          // ✅ Correcto
        return activo;
    }
    
    public void setActivo(boolean activo) { // ✅ Correcto
        this.activo = activo;
    }
}
```

### Errores Comunes de Nomenclatura

```java
public class EjemplosIncorrectos {
    private String nombre;
    private boolean activo;
    
    // ❌ INCORRECTO: No sigue convención
    public String obtenerNombre() {
        return nombre;
    }
    
    // ❌ INCORRECTO: No sigue convención
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // ❌ INCORRECTO: Boolean debe usar "is", no "get"
    public boolean getActivo() {
        return activo;
    }
    
    // ❌ INCORRECTO: Nombre en español
    public String obtenerNombre() {
        return nombre;
    }
}

public class EjemplosCorrectos {
    private String nombre;
    private boolean activo;
    
    // ✅ CORRECTO
    public String getNombre() {
        return nombre;
    }
    
    // ✅ CORRECTO
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // ✅ CORRECTO: Boolean con "is"
    public boolean isActivo() {
        return activo;
    }
    
    // ✅ CORRECTO
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
```

---

## Implementación Básica

### Template Estándar

```java
public class NombreClase {
    // 1. Atributo PRIVADO
    private TipoDato nombreAtributo;
    
    // 2. GETTER
    /**
     * Obtiene el valor de nombreAtributo.
     * @return el valor de nombreAtributo
     */
    public TipoDato getNombreAtributo() {
        return nombreAtributo;
    }
    
    // 3. SETTER
    /**
     * Establece el valor de nombreAtributo.
     * @param nombreAtributo el nuevo valor
     */
    public void setNombreAtributo(TipoDato nombreAtributo) {
        this.nombreAtributo = nombreAtributo;
    }
}
```

### Ejemplo Completo: Clase Producto

```java
/**
 * Representa un producto en un sistema de inventario.
 */
public class Producto {
    // ========================================
    // ATRIBUTOS PRIVADOS
    // ========================================
    
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private boolean disponible;
    
    // ========================================
    // CONSTRUCTOR
    // ========================================
    
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.disponible = true;
    }
    
    // ========================================
    // GETTERS
    // ========================================
    
    /**
     * Obtiene el código del producto.
     * @return código del producto
     */
    public String getCodigo() {
        return codigo;
    }
    
    /**
     * Obtiene el nombre del producto.
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene el precio del producto.
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Obtiene el stock disponible.
     * @return cantidad en stock
     */
    public int getStock() {
        return stock;
    }
    
    /**
     * Verifica si el producto está disponible.
     * @return true si está disponible, false en caso contrario
     */
    public boolean isDisponible() {
        return disponible;
    }
    
    // ========================================
    // SETTERS
    // ========================================
    
    /**
     * Establece el código del producto.
     * @param codigo nuevo código
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Establece el nombre del producto.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Establece el precio del producto.
     * @param precio nuevo precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     * Establece el stock del producto.
     * @param stock nueva cantidad
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    /**
     * Establece la disponibilidad del producto.
     * @param disponible true si está disponible
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
```

### Uso de la Clase

```java
public class PruebaProducto {
    public static void main(String[] args) {
        // Crear producto
        Producto producto = new Producto("P001", "Laptop", 1200.0, 15);
        
        // Usar getters para leer
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock());
        System.out.println("Disponible: " + producto.isDisponible());
        
        // Usar setters para modificar
        producto.setPrecio(1100.0); // Aplicar descuento
        producto.setStock(14);      // Vender una unidad
        
        System.out.println("\nDespués de modificaciones:");
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock());
    }
}
```

---

## Validación en Setters

### Importancia de Validar

Los setters son el **punto de entrada** de datos a tu objeto. Debes **validar** para mantener la integridad.

### Técnicas de Validación

#### 1. Validación de Rango

```java
public class Persona {
    private int edad;
    
    public void setEdad(int edad) {
        if (edad < 0 || edad > 150) {
            System.out.println("Error: Edad debe estar entre 0 y 150");
            return;
        }
        this.edad = edad;
    }
}
```

#### 2. Validación de Nulos

```java
public class Empleado {
    private String nombre;
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: Nombre no puede estar vacío");
            return;
        }
        this.nombre = nombre.trim();
    }
}
```

#### 3. Validación de Formato

```java
public class Usuario {
    private String email;
    
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("Error: Email inválido");
            return;
        }
        this.email = email.toLowerCase();
    }
}
```

#### 4. Validación con Excepciones

```java
public class CuentaBancaria {
    private double saldo;
    
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }
}
```

#### 5. Validación Compleja

```java
public class Rectangulo {
    private double ancho;
    private double alto;
    
    public void setAncho(double ancho) {
        if (!validarDimension(ancho)) {
            throw new IllegalArgumentException("Ancho inválido: " + ancho);
        }
        this.ancho = ancho;
    }
    
    public void setAlto(double alto) {
        if (!validarDimension(alto)) {
            throw new IllegalArgumentException("Alto inválido: " + alto);
        }
        this.alto = alto;
    }
    
    private boolean validarDimension(double dimension) {
        return dimension > 0 && dimension <= 10000;
    }
}
```

### Ejemplo Completo con Validación

```java
public class Estudiante {
    private String identificacion;
    private String nombre;
    private int edad;
    private double promedio;
    
    // Constructor con validación
    public Estudiante(String identificacion, String nombre, int edad) {
        setIdentificacion(identificacion);
        setNombre(nombre);
        setEdad(edad);
        this.promedio = 0.0;
    }
    
    // Getters
    public String getIdentificacion() {
        return identificacion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getPromedio() {
        return promedio;
    }
    
    // Setters con validación
    public void setIdentificacion(String identificacion) {
        if (identificacion == null || identificacion.trim().isEmpty()) {
            throw new IllegalArgumentException("Identificación no puede estar vacía");
        }
        if (identificacion.length() < 5) {
            throw new IllegalArgumentException("Identificación debe tener al menos 5 caracteres");
        }
        this.identificacion = identificacion.trim();
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre no puede estar vacío");
        }
        if (nombre.length() < 2) {
            throw new IllegalArgumentException("Nombre debe tener al menos 2 caracteres");
        }
        this.nombre = nombre.trim();
    }
    
    public void setEdad(int edad) {
        if (edad < 15 || edad > 100) {
            throw new IllegalArgumentException("Edad debe estar entre 15 y 100");
        }
        this.edad = edad;
    }
    
    public void setPromedio(double promedio) {
        if (promedio < 0.0 || promedio > 5.0) {
            throw new IllegalArgumentException("Promedio debe estar entre 0.0 y 5.0");
        }
        this.promedio = promedio;
    }
    
    @Override
    public String toString() {
        return String.format("Estudiante[ID=%s, Nombre=%s, Edad=%d, Promedio=%.2f]",
            identificacion, nombre, edad, promedio);
    }
}
```

---

## Casos Especiales

### 1. Atributos de Solo Lectura (Read-Only)

```java
public class Factura {
    private final String numero; // final = no puede cambiar
    private final LocalDateTime fecha;
    
    public Factura(String numero) {
        this.numero = numero;
        this.fecha = LocalDateTime.now();
    }
    
    // Solo getters, NO setters
    public String getNumero() {
        return numero;
    }
    
    public LocalDateTime getFecha() {
        return fecha;
    }
}
```

### 2. Getters con Transformación

```java
public class Persona {
    private String nombre;
    private String apellido;
    
    public String getNombre() {
        return nombre;
    }
    
    // Getter calculado (no es un atributo directo)
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    // Getter con transformación
    public String getNombreMayusculas() {
        return nombre.toUpperCase();
    }
}
```

### 3. Setters Fluidos (Method Chaining)

```java
public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;
    
    // Setters que retornan this
    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }
    
    public Persona setCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }
}

// Uso encadenado
Persona p = new Persona()
    .setNombre("Juan")
    .setEdad(30)
    .setCiudad("Bogotá");
```

### 4. Getters que Retornan Copias (Para Colecciones)

```java
public class Curso {
    private List<String> estudiantes;
    
    public Curso() {
        this.estudiantes = new ArrayList<>();
    }
    
    // ❌ MAL: Expone referencia interna
    public List<String> getEstudiantes() {
        return estudiantes; // Alguien puede modificar la lista
    }
    
    // ✅ BIEN: Retorna copia
    public List<String> getEstudiantes() {
        return new ArrayList<>(estudiantes);
    }
    
    // ✅ MEJOR: Retorna lista inmutable
    public List<String> getEstudiantes() {
        return Collections.unmodifiableList(estudiantes);
    }
}
```

---

## Cuándo NO Usar Getters/Setters

### 1. Clases DTO (Data Transfer Objects) Simples

```java
// A veces está bien tener atributos públicos en DTOs
public class ConfiguracionDTO {
    public String host;
    public int puerto;
    public boolean ssl;
}
```

### 2. Clases Inmutables

```java
// Clase inmutable: solo constructor y getters
public final class Punto {
    private final int x;
    private final int y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
    // NO hay setters
}
```

### 3. Cuando Exponen Demasiado

```java
// ❌ MAL: Expone todo sin razón
public class Motor {
    private int rpm;
    private double temperatura;
    
    public int getRpm() { return rpm; }
    public void setRpm(int rpm) { this.rpm = rpm; }
    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double t) { this.temperatura = t; }
}

// ✅ MEJOR: Expone comportamiento, no datos
public class Motor {
    private int rpm;
    private double temperatura;
    
    public void acelerar() {
        rpm += 100;
        temperatura += 5;
    }
    
    public void enfriar() {
        temperatura -= 10;
    }
    
    public boolean estaCaliente() {
        return temperatura > 100;
    }
}
```

---

## Buenas Prácticas

### ✅ DO's (Hacer)

1. **Siempre valida en setters**
```java
public void setEdad(int edad) {
    if (edad >= 0) {
        this.edad = edad;
    }
}
```

2. **Usa `this` para claridad**
```java
public void setNombre(String nombre) {
    this.nombre = nombre; // Clarifica que es el atributo
}
```

3. **Documenta getters/setters públicos**
```java
/**
 * Establece el precio del producto.
 * @param precio debe ser mayor o igual a 0
 * @throws IllegalArgumentException si precio es negativo
 */
public void setPrecio(double precio) {
    if (precio < 0) {
        throw new IllegalArgumentException("Precio no puede ser negativo");
    }
    this.precio = precio;
}
```

4. **Usa excepciones para errores graves**
```java
public void setEmail(String email) {
    if (email == null || !email.contains("@")) {
        throw new IllegalArgumentException("Email inválido");
    }
    this.email = email;
}
```

### ❌ DON'Ts (No Hacer)

1. **No hagas atributos públicos**
```java
// ❌ MAL
public class Persona {
    public String nombre;
}
```

2. **No uses getters/setters para todo sin pensar**
```java
// ❌ Innecesario si no hay lógica adicional en un DTO simple
```

3. **No dejes setters sin validación**
```java
// ❌ MAL: Acepta cualquier valor
public void setEdad(int edad) {
    this.edad = edad; // ¿Y si es negativo?
}
```

---

## Ejercicio Práctico

Implementa una clase `CuentaBancaria` con:
- Atributos: numeroCuenta, titular, saldo
- Getters para todos
- Setter para titular (validar no vacío)
- Setter para saldo (validar >= 0)
- Métodos: depositar(), retirar()

---

## Referencias

- [JavaBeans Specification](https://www.oracle.com/java/technologies/javase/javabeans-spec.html)
- Effective Java (Joshua Bloch) - Item 16: "In public classes, use accessor methods, not public fields"

---

**Próximo tema:** [Constructores](./04-constructores.md)

