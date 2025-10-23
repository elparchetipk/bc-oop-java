# 04 - Palabra Clave `super`

## 📚 Introducción

La palabra clave `super` es una referencia a la clase padre (superclase) desde una clase hija. Permite acceder a constructores, métodos y atributos de la clase padre, siendo fundamental para trabajar con herencia en Java.

---

## 🎯 ¿Qué es `super`?

### Definición

> **`super`** es una palabra clave en Java que hace referencia a la superclase inmediata, permitiendo:
> 1. Llamar al constructor de la clase padre
> 2. Acceder a métodos de la clase padre
> 3. Acceder a atributos de la clase padre

---

## 💻 Usos de `super`

### 1. `super()` - Llamar al Constructor del Padre

El uso más común y **obligatorio** en muchos casos.

```java
class Vehiculo {
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("Constructor de Vehículo");
    }
}

class Automovil extends Vehiculo {
    private int numPuertas;
    
    public Automovil(String marca, String modelo, int numPuertas) {
        super(marca, modelo);  // ✅ Llama al constructor del padre
        this.numPuertas = numPuertas;
        System.out.println("Constructor de Automóvil");
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla", 4);
        // Salida:
        // Constructor de Vehículo
        // Constructor de Automóvil
    }
}
```

**Reglas importantes:**
- `super()` **debe ser la primera línea** en el constructor
- Si no llamas a `super()` explícitamente, Java llama automáticamente a `super()` (constructor sin parámetros)
- Si la clase padre no tiene constructor sin parámetros, **debes** llamar a `super()` con parámetros

---

### 2. `super.metodo()` - Llamar a Métodos del Padre

Útil cuando sobrescribes un método pero quieres usar la funcionalidad original.

```java
class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario() {
        return salarioBase;
    }
    
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}

class Gerente extends Empleado {
    private double bono;
    
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
    
    @Override
    public double calcularSalario() {
        // Usa el cálculo del padre y le suma el bono
        return super.calcularSalario() + bono;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llama al método del padre
        System.out.println("Bono: $" + bono);
        System.out.println("Salario total: $" + calcularSalario());
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana García", 5000, 2000);
        gerente.mostrarInfo();
        // Salida:
        // Empleado: Ana García
        // Salario: $7000.0
        // Bono: $2000.0
        // Salario total: $7000.0
    }
}
```

---

### 3. `super.atributo` - Acceder a Atributos del Padre

Útil cuando hay atributos con el mismo nombre en padre e hijo.

```java
class Padre {
    protected String mensaje = "Mensaje del padre";
    
    public void mostrar() {
        System.out.println(mensaje);
    }
}

class Hijo extends Padre {
    private String mensaje = "Mensaje del hijo";  // Oculta el del padre
    
    public void mostrarAmbos() {
        System.out.println("Hijo: " + mensaje);           // Del hijo
        System.out.println("Padre: " + super.mensaje);    // Del padre
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Hijo h = new Hijo();
        h.mostrarAmbos();
        // Salida:
        // Hijo: Mensaje del hijo
        // Padre: Mensaje del padre
    }
}
```

---

## 🔍 `super()` vs Constructor Implícito

### Cuando NO llamas a `super()` explícitamente:

```java
class Padre {
    public Padre() {
        System.out.println("Constructor Padre sin parámetros");
    }
}

class Hijo extends Padre {
    public Hijo() {
        // Java automáticamente añade: super();
        System.out.println("Constructor Hijo");
    }
}
```

Equivalente a:
```java
class Hijo extends Padre {
    public Hijo() {
        super();  // ✅ Explícito
        System.out.println("Constructor Hijo");
    }
}
```

### Cuando DEBES llamar a `super()` explícitamente:

```java
class Padre {
    private String nombre;
    
    // No hay constructor sin parámetros
    public Padre(String nombre) {
        this.nombre = nombre;
    }
}

class Hijo extends Padre {
    public Hijo(String nombre) {
        // ✅ OBLIGATORIO: debe llamar al constructor que existe
        super(nombre);
    }
    
    // ❌ Error de compilación:
    // public Hijo() {
    //     // No puede llamar a super() porque Padre no tiene constructor sin parámetros
    // }
}
```

---

## ⚙️ Orden de Ejecución de Constructores

### Ejemplo con Jerarquía de 3 Niveles

```java
class Abuelo {
    public Abuelo() {
        System.out.println("1. Constructor Abuelo");
    }
}

class Padre extends Abuelo {
    public Padre() {
        super();  // Llama al constructor de Abuelo
        System.out.println("2. Constructor Padre");
    }
}

class Hijo extends Padre {
    public Hijo() {
        super();  // Llama al constructor de Padre
        System.out.println("3. Constructor Hijo");
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Hijo h = new Hijo();
        // Salida:
        // 1. Constructor Abuelo
        // 2. Constructor Padre
        // 3. Constructor Hijo
    }
}
```

**Regla:** Los constructores se ejecutan de arriba hacia abajo en la jerarquía.

---

## 💡 Ejemplo Práctico Completo

```java
// ========== Clase Base ==========
public class Figura {
    protected String color;
    protected boolean rellena;
    
    public Figura(String color, boolean rellena) {
        this.color = color;
        this.rellena = rellena;
        System.out.println("Constructor de Figura");
    }
    
    public void dibujar() {
        System.out.println("Dibujando una figura " + color);
    }
    
    public void mostrarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Rellena: " + (rellena ? "Sí" : "No"));
    }
}

// ========== Clase Intermedia ==========
public class Figura2D extends Figura {
    protected double perimetro;
    
    public Figura2D(String color, boolean rellena, double perimetro) {
        super(color, rellena);  // ✅ Llama constructor del padre
        this.perimetro = perimetro;
        System.out.println("Constructor de Figura2D");
    }
    
    @Override
    public void dibujar() {
        super.dibujar();  // ✅ Usa método del padre primero
        System.out.println("Es una figura en 2D");
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // ✅ Llama método del padre
        System.out.println("Perímetro: " + perimetro);
    }
}

// ========== Clase Específica ==========
public class Rectangulo extends Figura2D {
    private double base;
    private double altura;
    
    public Rectangulo(String color, boolean rellena, double base, double altura) {
        super(color, rellena, 2 * (base + altura));  // ✅ Llama constructor del padre
        this.base = base;
        this.altura = altura;
        System.out.println("Constructor de Rectángulo");
    }
    
    public double calcularArea() {
        return base * altura;
    }
    
    @Override
    public void dibujar() {
        super.dibujar();  // ✅ Llama método del padre
        System.out.println("Es un rectángulo de " + base + "x" + altura);
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // ✅ Llama método del padre
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
    }
}

// ========== Uso ==========
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Creando Rectángulo ===");
        Rectangulo rect = new Rectangulo("Azul", true, 5.0, 3.0);
        
        System.out.println("\n=== Dibujando ===");
        rect.dibujar();
        
        System.out.println("\n=== Información ===");
        rect.mostrarInfo();
    }
}
```

**Salida:**
```
=== Creando Rectángulo ===
Constructor de Figura
Constructor de Figura2D
Constructor de Rectángulo

=== Dibujando ===
Dibujando una figura Azul
Es una figura en 2D
Es un rectángulo de 5.0x3.0

=== Información ===
Color: Azul
Rellena: Sí
Perímetro: 16.0
Base: 5.0
Altura: 3.0
Área: 15.0
```

---

## 🆚 `this` vs `super`

| Aspecto | `this` | `super` |
|---------|--------|---------|
| **Referencia** | Objeto actual | Clase padre |
| **Constructor** | `this()` llama otro constructor de la misma clase | `super()` llama constructor del padre |
| **Método** | `this.metodo()` llama método de la clase actual | `super.metodo()` llama método del padre |
| **Atributo** | `this.atributo` accede atributo de la clase actual | `super.atributo` accede atributo del padre |
| **Posición** | Puede usarse en cualquier parte | `super()` debe ser primera línea en constructor |

### Ejemplo Comparativo:

```java
class Padre {
    protected int valor = 100;
    
    public void mostrar() {
        System.out.println("Método del padre");
    }
}

class Hijo extends Padre {
    private int valor = 200;  // Oculta el del padre
    
    public void mostrar() {
        System.out.println("Método del hijo");
    }
    
    public void demostrar() {
        // Usando this
        System.out.println("this.valor = " + this.valor);      // 200 (del hijo)
        this.mostrar();                                         // "Método del hijo"
        
        // Usando super
        System.out.println("super.valor = " + super.valor);    // 100 (del padre)
        super.mostrar();                                        // "Método del padre"
    }
}
```

---

## ⚠️ Errores Comunes

### 1. `super()` no en primera línea

```java
// ❌ Error de compilación
public class Hijo extends Padre {
    public Hijo(String nombre) {
        System.out.println("Hola");
        super(nombre);  // Error: debe ser la primera línea
    }
}

// ✅ Correcto
public class Hijo extends Padre {
    public Hijo(String nombre) {
        super(nombre);  // Primera línea
        System.out.println("Hola");
    }
}
```

### 2. No llamar a `super()` cuando es obligatorio

```java
class Padre {
    public Padre(String nombre) {  // No hay constructor sin parámetros
        // ...
    }
}

// ❌ Error: implicit super constructor Padre() is undefined
class Hijo extends Padre {
    public Hijo() {
        // Falta super(nombre)
    }
}

// ✅ Correcto
class Hijo extends Padre {
    public Hijo(String nombre) {
        super(nombre);
    }
}
```

### 3. Confundir `super` con `this`

```java
public class Hijo extends Padre {
    public Hijo(String nombre) {
        this(nombre);   // ❌ Llamaría a otro constructor de Hijo (recursión infinita)
        super(nombre);  // ✅ Llama al constructor de Padre
    }
}
```

---

## 📝 Buenas Prácticas

1. **Siempre llama a `super()` explícitamente en constructores**
   ```java
   public Hijo(String param) {
       super(param);  // Claro y explícito
   }
   ```

2. **Usa `super.metodo()` cuando extiendes funcionalidad**
   ```java
   @Override
   public void mostrar() {
       super.mostrar();  // Mantiene funcionalidad del padre
       // Añade funcionalidad nueva
   }
   ```

3. **Documenta cuando usas `super`**
   ```java
   @Override
   public double calcular() {
       // Usa el cálculo base del padre y le añade el bono
       return super.calcular() + bono;
   }
   ```

---

## 📌 Resumen

- **`super()`**: Llama al constructor de la clase padre (debe ser primera línea)
- **`super.metodo()`**: Llama a un método de la clase padre
- **`super.atributo`**: Accede a un atributo de la clase padre
- **Orden**: Constructores se ejecutan de padre a hijo
- **Diferencia**: `this` → clase actual, `super` → clase padre
- **Obligatorio**: Cuando el padre no tiene constructor sin parámetros

---

## 🔗 Próximo Tema

En el siguiente tema veremos **Buenas Prácticas en Herencia** para diseñar jerarquías efectivas y mantenibles.

---

**Última actualización:** Octubre 2025
