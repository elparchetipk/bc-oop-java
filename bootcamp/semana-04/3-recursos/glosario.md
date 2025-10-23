# Glosario - Semana 4: Herencia

## 📖 Términos Fundamentales

### A

#### Abstracción
Proceso de ocultar detalles de implementación y mostrar solo funcionalidad esencial. En herencia, las clases abstractas son una forma de abstracción.

**Ejemplo:**
```java
abstract class Figura {
    abstract double calcularArea();  // Abstracción: no dice CÓMO
}
```

---

### C

#### Clase Abstracta
Clase que no se puede instanciar directamente y puede contener métodos abstractos. Diseñada para ser heredada.

**Ejemplo:**
```java
abstract class Animal {
    abstract void hacerSonido();
}
// Animal a = new Animal();  // ❌ Error
```

#### Clase Base
Sinónimo de **Superclase** o **Clase Padre**. La clase de la cual otras heredan.

#### Clase Derivada
Sinónimo de **Subclase** o **Clase Hija**. La clase que hereda de otra.

#### Clase Final
Clase que no puede ser heredada. Se declara con la palabra clave `final`.

**Ejemplo:**
```java
final class String { }
// class MiString extends String { }  // ❌ Error
```

#### Clase Hija
Ver **Subclase**.

#### Clase Padre
Ver **Superclase**.

#### Composición
Relación "tiene-un" donde un objeto contiene otros objetos como atributos.

**Ejemplo:**
```java
class Coche {
    private Motor motor;  // Coche TIENE UN motor
}
```

#### Constructor
Método especial que inicializa un objeto. En herencia, la subclase debe llamar al constructor de la superclase con `super()`.

---

### E

#### Encapsulación
Ocultar detalles de implementación usando modificadores de acceso. En herencia, `protected` permite acceso a la familia de clases.

#### `extends`
Palabra clave de Java que indica que una clase hereda de otra.

**Sintaxis:**
```java
class Hijo extends Padre { }
```

---

### H

#### Herencia
Mecanismo de POO que permite crear nuevas clases basadas en clases existentes, heredando atributos y métodos.

**Relación:** "es-un" (is-a)

#### Herencia Jerárquica
Estructura donde una clase padre tiene múltiples clases hijas.

**Ejemplo:**
```
    Animal
   /  |  \
Perro Gato Pájaro
```

#### Herencia Multinivel
Herencia en cadena donde una clase hereda de otra, que a su vez hereda de otra.

**Ejemplo:**
```
Animal → Mamífero → Perro → Chihuahua
```

#### Herencia Múltiple
Capacidad de una clase de heredar de múltiples clases. **No permitida en Java** (solo con interfaces).

#### Herencia Simple
Java solo permite herencia simple: una clase solo puede heredar de UNA clase padre.

---

### I

#### is-a (es-un)
Relación que indica herencia apropiada. Si A **es un** B, entonces A puede heredar de B.

**Ejemplos:**
- Un Perro **es un** Animal ✅
- Un Coche **tiene un** Motor ❌ (no es herencia)

---

### J

#### Jerarquía de Clases
Estructura organizacional de clases relacionadas mediante herencia, formando un árbol.

---

### L

#### Liskov Substitution Principle (LSP)
Principio que establece que una subclase debe poder sustituir a su superclase sin afectar el funcionamiento del programa.

---

### M

#### Método Abstracto
Método declarado sin implementación en una clase abstracta. Las subclases deben implementarlo.

**Ejemplo:**
```java
abstract class Figura {
    abstract double calcularArea();  // Sin implementación
}
```

#### Método Final
Método que no puede ser sobrescrito por subclases. Se declara con `final`.

**Ejemplo:**
```java
public final void metodoNoSobrescribible() { }
```

#### Modificador de Acceso
Palabra clave que controla la visibilidad de atributos y métodos:
- `public`: Accesible desde cualquier lugar
- `protected`: Accesible en la clase, subclases y mismo paquete
- `private`: Solo accesible en la clase
- `default` (sin modificador): Accesible en el mismo paquete

---

### O

#### Object
Clase raíz de todas las clases en Java. Todas las clases heredan implícitamente de `Object`.

**Métodos heredados de Object:**
- `toString()`
- `equals()`
- `hashCode()`
- `getClass()`

#### `@Override`
Anotación que indica que un método sobrescribe un método de la superclase. El compilador verifica que el método exista en el padre.

**Ejemplo:**
```java
@Override
public String toString() {
    return "Mi implementación";
}
```

---

### P

#### Polimorfismo
Capacidad de un objeto de tomar muchas formas. Permite que una variable de tipo padre pueda referir a objetos de tipos hijos. (Tema de Semana 5)

**Ejemplo:**
```java
Animal a = new Perro();  // Polimorfismo
```

#### `protected`
Modificador de acceso que permite acceso en:
- La clase actual
- Subclases (incluso en otros paquetes)
- Clases del mismo paquete

**Uso en herencia:**
```java
class Padre {
    protected String dato;  // Accesible en hijos
}
```

---

### R

#### Relación "es-un"
Ver **is-a**.

#### Relación "tiene-un"
Ver **has-a** / Composición.

#### Reutilización de Código
Uno de los objetivos principales de la herencia: evitar duplicación escribiendo código común una sola vez en la clase padre.

---

### S

#### Sobrecarga (Overloading)
Múltiples métodos con el mismo nombre pero diferentes parámetros. No está directamente relacionado con herencia.

**Ejemplo:**
```java
void metodo(int x) { }
void metodo(String x) { }  // Sobrecarga
```

#### Sobrescritura (Overriding)
Redefinir un método heredado de la superclase en la subclase con la misma firma.

**Ejemplo:**
```java
class Padre {
    void metodo() { }
}
class Hijo extends Padre {
    @Override
    void metodo() { }  // Sobrescritura
}
```

#### Subclase
Clase que hereda de otra clase (superclase). También llamada **clase hija** o **clase derivada**.

**Ejemplo:**
```java
class Perro extends Animal { }  // Perro es subclase de Animal
```

#### `super`
Palabra clave que hace referencia a la superclase inmediata.

**Usos:**
- `super()`: Llama al constructor del padre
- `super.metodo()`: Llama a un método del padre
- `super.atributo`: Accede a un atributo del padre

**Ejemplo:**
```java
class Hijo extends Padre {
    public Hijo() {
        super();  // Llama constructor del padre
    }
    
    public void metodo() {
        super.metodo();  // Llama método del padre
    }
}
```

#### Superclase
Clase de la cual otra clase hereda. También llamada **clase padre** o **clase base**.

**Ejemplo:**
```java
class Animal { }
class Perro extends Animal { }  // Animal es superclase de Perro
```

---

### T

#### `this`
Referencia al objeto actual. Se diferencia de `super` que referencia al objeto padre.

**Comparación:**
```java
this.atributo   // Atributo de la clase actual
super.atributo  // Atributo de la clase padre

this()          // Llama a otro constructor de la misma clase
super()         // Llama al constructor del padre
```

---

## 🔤 Términos en Inglés vs Español

| Inglés | Español | Descripción |
|--------|---------|-------------|
| **Inheritance** | Herencia | Mecanismo de POO |
| **Superclass** | Superclase / Clase padre | Clase de la que se hereda |
| **Subclass** | Subclase / Clase hija | Clase que hereda |
| **Base class** | Clase base | Sinónimo de superclase |
| **Derived class** | Clase derivada | Sinónimo de subclase |
| **Parent class** | Clase padre | Sinónimo de superclase |
| **Child class** | Clase hija | Sinónimo de subclase |
| **is-a relationship** | Relación "es-un" | Criterio para herencia |
| **has-a relationship** | Relación "tiene-un" | Criterio para composición |
| **Override** | Sobrescribir | Redefinir método heredado |
| **Overload** | Sobrecargar | Múltiples métodos con mismo nombre |
| **Abstract class** | Clase abstracta | Clase no instanciable |
| **Final class** | Clase final | Clase no heredable |
| **Protected** | Protegido | Modificador de acceso |
| **Hierarchy** | Jerarquía | Estructura de clases |

---

## 📊 Conceptos Relacionados

### Herencia vs Composición

| Aspecto | Herencia | Composición |
|---------|----------|-------------|
| **Relación** | "es-un" | "tiene-un" |
| **Acoplamiento** | Fuerte | Débil |
| **Flexibilidad** | Menor | Mayor |
| **Ejemplo** | Perro **es un** Animal | Coche **tiene un** Motor |

### Modificadores en Herencia

| Modificador | Misma Clase | Mismo Paquete | Subclase | Todo |
|-------------|-------------|---------------|----------|------|
| `private` | ✅ | ❌ | ❌ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

---

## 💡 Ejemplos Rápidos

### Herencia Básica
```java
class Animal {
    protected String nombre;
}

class Perro extends Animal {
    // Hereda 'nombre'
}
```

### Uso de super
```java
class Hijo extends Padre {
    public Hijo() {
        super();  // Constructor del padre
    }
}
```

### Sobrescritura
```java
class Padre {
    void metodo() { }
}

class Hijo extends Padre {
    @Override
    void metodo() { }  // Sobrescribe
}
```

---

## 📚 Referencias

- [Oracle Java Tutorial - Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Java Language Specification - Inheritance](https://docs.oracle.com/javase/specs/)

---

**Última actualización:** Octubre 2025
