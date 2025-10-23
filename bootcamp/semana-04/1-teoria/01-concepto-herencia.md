# 01 - Concepto de Herencia

## 📚 Introducción

La **herencia** es uno de los cuatro pilares fundamentales de la Programación Orientada a Objetos, junto con la encapsulación, el polimorfismo y la abstracción. Es un mecanismo que permite crear nuevas clases basadas en clases existentes, reutilizando código y estableciendo relaciones jerárquicas entre clases.

---

## 🎯 ¿Qué es la Herencia?

### Definición

> **Herencia** es el mecanismo mediante el cual una clase (clase hija o subclase) puede heredar atributos y métodos de otra clase (clase padre o superclase), permitiendo la reutilización de código y el establecimiento de relaciones "es-un" (is-a).

### Analogía del Mundo Real

Piensa en la biología: los hijos heredan características de sus padres (color de ojos, estatura, etc.). De manera similar, en POO, una clase puede heredar características (atributos y métodos) de otra clase.

**Ejemplo:**
```
Animal (clase padre)
├── Perro (clase hija) - hereda de Animal
├── Gato (clase hija) - hereda de Animal
└── Pájaro (clase hija) - hereda de Animal
```

Un perro **es un** animal, un gato **es un** animal. Esta relación "es-un" es la clave de la herencia.

---

## 🔑 Conceptos Clave

### 1. Superclase (Clase Padre / Clase Base)

La clase de la cual se heredan atributos y métodos.

```java
public class Animal {
    // Atributos comunes a todos los animales
    private String nombre;
    private int edad;
    
    // Métodos comunes
    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
}
```

### 2. Subclase (Clase Hija / Clase Derivada)

La clase que hereda de otra clase, obteniendo sus atributos y métodos.

```java
public class Perro extends Animal {
    // Atributos específicos del perro
    private String raza;
    
    // Métodos específicos
    public void ladrar() {
        System.out.println("¡Guau guau!");
    }
}
```

### 3. Relación "es-un" (is-a)

La herencia establece una relación "es-un":
- Un Perro **es un** Animal ✅
- Un Gato **es un** Animal ✅
- Un Animal **es un** Perro ❌ (no siempre)

---

## 💡 ¿Para Qué Sirve la Herencia?

### 1. **Reutilización de Código**

No necesitas escribir el mismo código una y otra vez.

**Sin herencia:**
```java
class Perro {
    private String nombre;
    private int edad;
    public void comer() { /* código */ }
}

class Gato {
    private String nombre;  // ¡Código duplicado!
    private int edad;       // ¡Código duplicado!
    public void comer() { /* código duplicado */ }
}
```

**Con herencia:**
```java
class Animal {
    protected String nombre;
    protected int edad;
    public void comer() { /* código una sola vez */ }
}

class Perro extends Animal {
    // Ya tiene nombre, edad y comer()
    private String raza;
}

class Gato extends Animal {
    // Ya tiene nombre, edad y comer()
    private String colorPelaje;
}
```

### 2. **Organización Jerárquica**

Estructura tu código de manera lógica y organizada.

```
Vehículo
├── VehículoTerrestre
│   ├── Automóvil
│   ├── Motocicleta
│   └── Bicicleta
└── VehículoAcuático
    ├── Barco
    └── Submarino
```

### 3. **Facilita el Mantenimiento**

Si cambias algo en la clase padre, todos los hijos se actualizan automáticamente.

```java
class Animal {
    // Si añades un método aquí...
    public void dormir() {
        System.out.println("Zzz...");
    }
}

// ...todas las subclases lo tienen disponible
Perro miPerro = new Perro();
miPerro.dormir(); // ✅ Funciona sin modificar la clase Perro
```

### 4. **Polimorfismo (Próxima Semana)**

La herencia es la base del polimorfismo, que permite tratar objetos de diferentes clases de manera uniforme.

---

## 📊 Ejemplo Completo

```java
// Clase padre
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public void arrancar() {
        System.out.println("El vehículo está arrancando...");
    }
    
    public void detener() {
        System.out.println("El vehículo se está deteniendo...");
    }
    
    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " (" + año + ")");
    }
}

// Clase hija 1
public class Automovil extends Vehiculo {
    private int numeroPuertas;
    
    public Automovil(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);  // Llama al constructor del padre
        this.numeroPuertas = numeroPuertas;
    }
    
    public void abrirMaletero() {
        System.out.println("Abriendo maletero...");
    }
}

// Clase hija 2
public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;
    
    public Motocicleta(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }
    
    public void hacerCaballito() {
        System.out.println("¡Haciendo caballito!");
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla", 2023, 4);
        auto.arrancar();        // ✅ Heredado de Vehiculo
        auto.mostrarInfo();     // ✅ Heredado de Vehiculo
        auto.abrirMaletero();   // ✅ Específico de Automovil
        
        Motocicleta moto = new Motocicleta("Yamaha", "R1", 2023, false);
        moto.arrancar();        // ✅ Heredado de Vehiculo
        moto.hacerCaballito();  // ✅ Específico de Motocicleta
    }
}
```

**Salida:**
```
El vehículo está arrancando...
Toyota Corolla (2023)
Abriendo maletero...
El vehículo está arrancando...
¡Haciendo caballito!
```

---

## ✅ Ventajas de la Herencia

| Ventaja | Descripción | Ejemplo |
|---------|-------------|---------|
| **Reutilización** | No duplicas código | Método `comer()` en Animal |
| **Organización** | Código estructurado lógicamente | Jerarquía de vehículos |
| **Mantenibilidad** | Cambios en un solo lugar | Actualizar Animal actualiza todos |
| **Extensibilidad** | Fácil agregar nuevas clases | Agregar clase `Pajaro extends Animal` |
| **Polimorfismo** | Base para polimorfismo | `Animal a = new Perro();` |

---

## ⚠️ Desventajas y Precauciones

| Desventaja | Descripción | Solución |
|------------|-------------|----------|
| **Acoplamiento fuerte** | Cambios en padre afectan hijos | Diseñar cuidadosamente jerarquías |
| **Jerarquías profundas** | Difícil seguir el código | Mantener jerarquías simples (2-3 niveles) |
| **Rigidez** | Difícil cambiar estructura después | Planificar bien desde el inicio |
| **Herencia incorrecta** | Usar herencia donde no aplica | Verificar relación "es-un" |

---

## 🔍 Cuándo Usar Herencia

### ✅ Usa herencia cuando:

1. **Existe relación "es-un" clara**
   - Un Perro **es un** Animal ✅
   - Un Empleado **es una** Persona ✅

2. **Necesitas reutilizar código común**
   - Varias clases comparten atributos/métodos

3. **Quieres polimorfismo**
   - Tratar objetos de diferentes clases uniformemente

### ❌ NO uses herencia cuando:

1. **Solo quieres reutilizar código**
   - Usa composición: `Coche tiene un Motor`

2. **No hay relación "es-un"**
   - Un Coche **tiene un** Motor (no **es un** Motor)

3. **La relación es "tiene-un"**
   - Preferir composición sobre herencia

---

## 🌍 Ejemplos del Mundo Real

### 1. Sistema de Empleados
```
Empleado
├── EmpleadoTiempoCompleto
├── EmpleadoTiempoParcial
└── Contratista
```

### 2. Figuras Geométricas
```
Forma
├── Forma2D
│   ├── Círculo
│   ├── Rectángulo
│   └── Triángulo
└── Forma3D
    ├── Esfera
    ├── Cubo
    └── Cilindro
```

### 3. Sistema Bancario
```
CuentaBancaria
├── CuentaAhorros
├── CuentaCorriente
└── CuentaNomina
```

### 4. Aplicación de Mensajería
```
Mensaje
├── MensajeTexto
├── MensajeMultimedia
└── MensajeVoz
```

---

## 🎓 Conceptos Importantes

### La Clase Object

En Java, **todas las clases** heredan implícitamente de la clase `Object`.

```java
class MiClase {
    // Implícitamente: class MiClase extends Object
}
```

Métodos heredados de Object:
- `toString()`
- `equals()`
- `hashCode()`
- `getClass()`

### Herencia Simple

Java solo permite **herencia simple**: una clase solo puede heredar de UNA clase padre.

```java
// ✅ Correcto
class Perro extends Animal { }

// ❌ Incorrecto - herencia múltiple no permitida
class Perro extends Animal, Mascota { }  // Error de compilación
```

**Nota:** Para simular herencia múltiple, Java usa **interfaces** (verás esto en Semana 6).

---

## 💻 Ejercicio Rápido

**Identifica si las siguientes relaciones son apropiadas para herencia (es-un):**

1. Estudiante → Persona
2. Coche → Motor
3. Smartphone → DispositivoElectronico
4. Casa → Puerta
5. Profesor → Empleado

**Respuestas:**
1. ✅ Sí - Un estudiante **es una** persona
2. ❌ No - Un coche **tiene un** motor (composición)
3. ✅ Sí - Un smartphone **es un** dispositivo electrónico
4. ❌ No - Una casa **tiene una** puerta (composición)
5. ✅ Sí - Un profesor **es un** empleado

---

## 📌 Resumen

- **Herencia**: Mecanismo para reutilizar código y establecer jerarquías
- **Superclase**: Clase que provee atributos y métodos
- **Subclase**: Clase que hereda de otra
- **Relación "es-un"**: Criterio para usar herencia
- **Palabra clave**: `extends` (veremos en siguiente tema)
- **Ventajas**: Reutilización, organización, mantenibilidad
- **Precaución**: Usar solo cuando hay relación "es-un" real

---

## 🔗 Próximo Tema

En el siguiente tema aprenderemos sobre la **palabra clave `extends`** y cómo implementar herencia en Java con sintaxis práctica.

---

## 📖 Referencias

- [Oracle Java Tutorial - Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [W3Schools - Java Inheritance](https://www.w3schools.com/java/java_inheritance.asp)
- [GeeksforGeeks - Inheritance in Java](https://www.geeksforgeeks.org/inheritance-in-java/)

---

**Última actualización:** Octubre 2025
