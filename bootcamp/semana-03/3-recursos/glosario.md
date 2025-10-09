# Glosario - Semana 3: Encapsulación y Constructores

---

## A

### Acceso (Access)

Capacidad de leer o modificar un miembro (atributo o método) de una clase desde cierto contexto.

### API Pública (Public API)

Conjunto de métodos y atributos públicos de una clase que otros pueden usar. Define el "contrato" de la clase.

### Atributo (Attribute/Field)

Variable declarada dentro de una clase que almacena el estado del objeto. En encapsulación, generalmente son privados.

---

## C

### Constructor

Método especial que se ejecuta automáticamente cuando se crea un objeto. Inicializa el estado del objeto.

```java
public class Persona {
  public Persona() {
  } // Constructor
}
```

### Constructor por Defecto (Default Constructor)

Constructor sin parámetros. Si no defines ningún constructor, Java crea uno automáticamente.

### Constructor Sobrecargado (Overloaded Constructor)

Tener múltiples constructores en la misma clase con diferentes parámetros.

---

## E

### Encapsulación (Encapsulation)

Pilar de POO que consiste en ocultar los detalles de implementación y exponer solo lo necesario a través de una interfaz
pública controlada.

### Estado (State)

Valores actuales de los atributos de un objeto en un momento dado.

---

## G

### Getter (Accessor Method)

Método público que permite leer (obtener) el valor de un atributo privado.

```java
public String getNombre() {
  return nombre;
}
```

---

## I

### Información Oculta (Information Hiding)

Principio de diseño que establece que los detalles internos de una clase deben estar ocultos para otros objetos.

### Inicialización (Initialization)

Proceso de asignar un valor inicial a un atributo, generalmente en el constructor.

### Interfaz Pública (Public Interface)

Conjunto de miembros públicos de una clase que definen cómo otros objetos pueden interactuar con ella.

### Inmutabilidad (Immutability)

Propiedad de un objeto cuyos valores no pueden cambiar después de su creación. Solo tiene getters, no setters.

---

## M

### Miembro (Member)

Atributo o método que pertenece a una clase.

### Modificador de Acceso (Access Modifier)

Palabra clave que controla la visibilidad de clases, atributos y métodos: `public`, `private`, `protected`, o default (
sin palabra clave).

---

## O

### Ocultamiento de Datos (Data Hiding)

Práctica de hacer atributos privados para que no puedan ser accedidos directamente desde fuera de la clase.

### Overloading

Ver **Sobrecarga**.

---

## P

### Private (Privado)

Modificador de acceso que hace que un miembro sea accesible solo dentro de la misma clase.

```java
private int edad;
```

### Protected (Protegido)

Modificador de acceso que permite acceso en la misma clase, clases del mismo paquete, y subclases.

### Public (Público)

Modificador de acceso que hace que un miembro sea accesible desde cualquier lugar.

```java
public void metodoPublico() {
}
```

---

## S

### Setter (Mutator Method)

Método público que permite modificar (establecer) el valor de un atributo privado, generalmente con validación.

```java
public void setEdad(int edad) {
  if (edad >= 0) {
    this.edad = edad;
  }
}
```

### Sobrecarga (Overloading)

Tener múltiples métodos o constructores con el mismo nombre pero diferentes parámetros en la misma clase.

```java
public Persona() {
}

public Persona(String nombre) {
}

public Persona(String nombre, int edad) {
}
```

---

## T

### This

Palabra clave que hace referencia al objeto actual (la instancia que está ejecutando el método).

```java
public void setNombre(String nombre) {
  this.nombre = nombre; // this.nombre es el atributo
}
```

### This() - Constructor Call

Llamada a otro constructor de la misma clase. Debe ser la primera línea del constructor.

```java
public Persona() {
  this("Sin nombre"); // Llama a Persona(String)
}

public Persona(String nombre) {
  this.nombre = nombre;
}
```

---

## V

### Validación (Validation)

Proceso de verificar que los datos cumplen con ciertas reglas antes de ser asignados a un atributo.

```java
public void setEdad(int edad) {
  if (edad < 0 || edad > 150) {
    throw new IllegalArgumentException("Edad inválida");
  }
  this.edad = edad;
}
```

### Visibilidad (Visibility)

Alcance desde el cual un miembro de una clase puede ser accedido. Controlada por modificadores de acceso.

---

## Conceptos Clave Relacionados

### Principio de Mínima Visibilidad

Hacer todo tan privado como sea posible, exponiendo públicamente solo lo estrictamente necesario.

### Principio Tell, Don't Ask

Dile al objeto qué hacer, no le preguntes por sus datos para hacerlo tú.

### JavaBeans Convention

Convención estándar de Java para nombrar getters y setters:

- Getter: `getTipo()` o `isTipo()` para boolean
- Setter: `setTipo(valor)`

### Copy Defense / Defensive Copy

Técnica de retornar una copia de una colección en lugar de la referencia original para proteger el estado interno.

```java
public List<String> getLista() {
  return new ArrayList<>(lista); // Copia defensiva
}
```

### Method Chaining

Técnica donde los setters retornan `this` para permitir llamadas encadenadas.

```java
persona.setNombre("Juan")
       .

setEdad(30)
       .

setCiudad("Bogotá");
```

---

## Acrónimos y Abreviaturas

- **API**: Application Programming Interface (Interfaz de Programación de Aplicaciones)
- **DTO**: Data Transfer Object (Objeto de Transferencia de Datos)
- **POJO**: Plain Old Java Object (Objeto Java Simple)
- **SRP**: Single Responsibility Principle (Principio de Responsabilidad Única)
- **OOP**: Object-Oriented Programming (Programación Orientada a Objetos)

---

## Ejemplos Rápidos

### Clase Completamente Encapsulada

```java
public class CuentaBancaria {
  // Atributos privados
  private final String numero;
  private double saldo;

  // Constructor con validación
  public CuentaBancaria(String numero, double saldo) {
    if (saldo < 0) {
      throw new IllegalArgumentException("Saldo no puede ser negativo");
    }
    this.numero = numero;
    this.saldo = saldo;
  }

  // Getter
  public double getSaldo() {
    return saldo;
  }

  // Método de negocio (mejor que setter)
  public boolean depositar(double monto) {
    if (monto > 0) {
      saldo += monto;
      return true;
    }
    return false;
  }
}
```

### Los 4 Modificadores en Acción

```java
public class Ejemplo {
  public int publico;           // Accesible desde CUALQUIER LUGAR
  protected int protegido;      // Accesible: clase, paquete, subclases
  int defaultAccess;            // Accesible: clase, paquete
  private int privado;          // Accesible: SOLO esta clase
}
```

---

## Referencias para Profundizar

- **Documentación Java
  **: [Controlling Access to Members of a Class](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- **Libro**: Effective Java (Joshua Bloch) - Items sobre encapsulación
- **Libro**: Clean Code (Robert Martin) - Capítulo sobre Objetos y Estructuras de Datos

---

**Última actualización**: Semana 3  
**Relacionado con**: Teoría de Encapsulación, Modificadores de Acceso, Constructores

