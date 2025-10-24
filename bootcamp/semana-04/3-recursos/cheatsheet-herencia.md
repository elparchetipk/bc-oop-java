# Cheat Sheet - Herencia en Java

## 🎯 Referencia Rápida

### Sintaxis Básica

```java
// Herencia simple
public class Hijo extends Padre {
    // Contenido
}
```

---

## 📋 Palabras Clave

### `extends`
```java
class Animal { }
class Perro extends Animal { }  // Perro hereda de Animal
```

### `super()`
```java
class Hijo extends Padre {
    public Hijo(String param) {
        super(param);  // DEBE ser primera línea
    }
}
```

### `super.metodo()`
```java
@Override
public void metodo() {
    super.metodo();  // Llama método del padre
    // Código adicional
}
```

### `@Override`
```java
@Override  // ← SIEMPRE usa esta anotación
public void metodo() {
    // Nueva implementación
}
```

---

## 🔐 Modificadores de Acceso

| Modificador | Misma Clase | Mismo Paquete | Subclase | Todo |
|-------------|-------------|---------------|----------|------|
| `private` | ✅ | ❌ | ❌ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

**Para herencia:** Usa `protected` para miembros que subclases necesitan.

---

## ✅ Qué SE Hereda

- ✅ Atributos `public`, `protected`, `default` (mismo paquete)
- ✅ Métodos `public`, `protected`, `default` (mismo paquete)
- ✅ Clases internas `public`, `protected`

## ❌ Qué NO se Hereda

- ❌ Constructores
- ❌ Miembros `private` (existen pero no son accesibles)
- ❌ Bloques estáticos

---

## 🎨 Patrones Comunes

### Constructor con super()
```java
public class Empleado {
    protected String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
}

public class Gerente extends Empleado {
    private double bono;
    
    public Gerente(String nombre, double bono) {
        super(nombre);  // ← Primera línea
        this.bono = bono;
    }
}
```

### Sobrescribir Método
```java
class Padre {
    public void saludar() {
        System.out.println("Hola desde Padre");
    }
}

class Hijo extends Padre {
    @Override
    public void saludar() {
        super.saludar();  // Opcional: llamar al padre
        System.out.println("Hola desde Hijo");
    }
}
```

### Extender Funcionalidad
```java
@Override
public void mostrarInfo() {
    super.mostrarInfo();  // Mantiene funcionalidad del padre
    System.out.println("Info adicional del hijo");
}
```

---

## 🔍 this vs super

| Aspecto | `this` | `super` |
|---------|--------|---------|
| **Referencia** | Objeto actual | Clase padre |
| **Constructor** | `this(params)` | `super(params)` |
| **Método** | `this.metodo()` | `super.metodo()` |
| **Atributo** | `this.atributo` | `super.atributo` |

```java
class Ejemplo extends Padre {
    private int valor = 20;
    
    public Ejemplo() {
        super();        // Constructor del padre
        this.init();    // Método de esta clase
    }
    
    public void demo() {
        System.out.println(this.valor);   // 20 (de esta clase)
        System.out.println(super.valor);  // Valor del padre
    }
}
```

---

## 📐 Jerarquías

### Un Nivel
```
    Padre
   /     \
Hijo1   Hijo2
```

### Multinivel
```
Abuelo
   ↓
Padre
   ↓
Hijo
```

### Compleja
```
        Base
       /    \
   Clase1  Clase2
    /  \     |
  C1a  C1b  C2a
```

---

## ⚠️ Errores Comunes

### 1. super() no en primera línea
```java
// ❌ ERROR
public Hijo() {
    System.out.println("Hola");
    super();  // Debe ser primera línea
}

// ✅ CORRECTO
public Hijo() {
    super();
    System.out.println("Hola");
}
```

### 2. No llamar a super() cuando es obligatorio
```java
class Padre {
    public Padre(String x) { }  // No hay constructor sin parámetros
}

// ❌ ERROR
class Hijo extends Padre {
    public Hijo() {
        // Falta super(x)
    }
}

// ✅ CORRECTO
class Hijo extends Padre {
    public Hijo(String x) {
        super(x);
    }
}
```

### 3. Olvidar @Override
```java
class Padre {
    public void metodo() { }
}

// ⚠️ Sin @Override - no detecta errores
class Hijo extends Padre {
    public void metodo() { }  // Typo no detectado
}

// ✅ Con @Override - compilador verifica
class Hijo extends Padre {
    @Override
    public void metodo() { }
}
```

---

## 🎯 Regla de Oro

### "es-un" vs "tiene-un"

```java
// ✅ HERENCIA: "es-un"
class Perro extends Animal { }
// Un Perro ES UN Animal

// ✅ COMPOSICIÓN: "tiene-un"
class Coche {
    private Motor motor;  // Un Coche TIENE UN Motor
}
```

---

## 🔒 Clases y Métodos Final

### Clase Final
```java
final class NoHeredable { }

// ❌ Error de compilación
class Intento extends NoHeredable { }
```

### Método Final
```java
class Padre {
    public final void noSobrescribir() { }
}

class Hijo extends Padre {
    // ❌ Error
    @Override
    public void noSobrescribir() { }
}
```

---

## 📊 Clase Object

Toda clase hereda de `Object` implícitamente:

```java
class MiClase {
    // Implícitamente: extends Object
}
```

**Métodos heredados:**
- `toString()`
- `equals(Object obj)`
- `hashCode()`
- `getClass()`

---

## 🎨 Clases Abstractas

```java
abstract class Figura {
    protected String color;
    
    // Método abstracto - sin implementación
    public abstract double calcularArea();
    
    // Método concreto
    public void setColor(String color) {
        this.color = color;
    }
}

class Circulo extends Figura {
    private double radio;
    
    // DEBE implementar métodos abstractos
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

---

## 📝 Checklist Rápido

Al crear una subclase:

- [ ] ¿Relación "es-un" válida?
- [ ] ¿Constructor llama a `super()` como primera línea?
- [ ] ¿Métodos sobrescritos tienen `@Override`?
- [ ] ¿Modificadores de acceso apropiados?
- [ ] ¿Se mantiene contrato de la clase padre?

Al sobrescribir métodos:

- [ ] `@Override` presente
- [ ] Misma firma (nombre, parámetros, retorno)
- [ ] ¿Necesito llamar a `super.metodo()`?
- [ ] ¿Mantiene comportamiento esperado?

---

## 💡 Ejemplos Completos

### Ejemplo Básico
```java
class Animal {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
}

class Perro extends Animal {
    private String raza;
    
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }
    
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
    
    @Override
    public void comer() {
        System.out.println(nombre + " come croquetas");
    }
}

// Uso
Perro perro = new Perro("Max", "Labrador");
perro.comer();   // "Max come croquetas"
perro.ladrar();  // "Max dice: ¡Guau!"
```

### Ejemplo Avanzado
```java
abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularSalario();
    
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}

class Gerente extends Empleado {
    private double bono;
    
    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bono: $" + bono);
    }
}
```

---

## 🔗 Recursos

- [Oracle Java Docs - Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- Material teórico completo en `/1-teoria/`
- Ejercicios prácticos en `/2-practica/`

---

**Versión:** 1.0 | **Semana:** 4 | **Última actualización:** Octubre 2025
