# 02 - Palabra Clave `extends`

## 📚 Introducción

La palabra clave `extends` es el mecanismo sintáctico en Java que nos permite implementar herencia. Es la forma de decirle al compilador "esta clase hereda de aquella clase".

---

## 🎯 Sintaxis Básica

### Estructura General

```java
public class ClaseHija extends ClasePadre {
    // Contenido de la clase hija
}
```

**Componentes:**
- `class ClaseHija`: La subclase que va a heredar
- `extends`: Palabra clave que indica herencia
- `ClasePadre`: La superclase de la cual se hereda

---

## 💻 Ejemplo Básico

### Sin Herencia (Código Duplicado)

```java
class Perro {
    private String nombre;
    private int edad;
    
    public void comer() {
        System.out.println("El perro está comiendo");
    }
    
    public void dormir() {
        System.out.println("El perro está durmiendo");
    }
}

class Gato {
    private String nombre;    // ❌ Duplicado
    private int edad;         // ❌ Duplicado
    
    public void comer() {     // ❌ Duplicado
        System.out.println("El gato está comiendo");
    }
    
    public void dormir() {    // ❌ Duplicado
        System.out.println("El gato está durmiendo");
    }
}
```

### Con Herencia (Usando `extends`)

```java
// Clase padre
class Animal {
    protected String nombre;
    protected int edad;
    
    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
    
    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
}

// Clase hija 1
class Perro extends Animal {
    private String raza;
    
    public void ladrar() {
        System.out.println(nombre + " está ladrando: ¡Guau!");
    }
}

// Clase hija 2
class Gato extends Animal {
    private String colorPelaje;
    
    public void maullar() {
        System.out.println(nombre + " está maullando: ¡Miau!");
    }
}
```

---

## 🔍 ¿Qué Hereda una Subclase?

### ✅ Lo que SÍ se hereda:

| Elemento | Modificador | ¿Se hereda? | Acceso desde subclase |
|----------|-------------|-------------|-----------------------|
| **Atributos públicos** | `public` | ✅ Sí | ✅ Acceso directo |
| **Atributos protegidos** | `protected` | ✅ Sí | ✅ Acceso directo |
| **Atributos default** | (sin modificador) | ✅ Sí (mismo paquete) | ✅ Acceso directo (mismo paquete) |
| **Métodos públicos** | `public` | ✅ Sí | ✅ Acceso directo |
| **Métodos protegidos** | `protected` | ✅ Sí | ✅ Acceso directo |
| **Métodos default** | (sin modificador) | ✅ Sí (mismo paquete) | ✅ Acceso directo (mismo paquete) |

### ❌ Lo que NO se hereda:

| Elemento | ¿Por qué no? |
|----------|--------------|
| **Atributos privados** | `private` son solo accesibles en la clase que los define |
| **Constructores** | Cada clase debe tener sus propios constructores |
| **Métodos privados** | Solo la clase que los define puede usarlos |
| **Bloques estáticos** | Son específicos de cada clase |

**Importante:** Los atributos `private` NO se heredan en el sentido de que la subclase no puede accederlos directamente, pero SÍ existen en el objeto hijo (se acceden mediante getters/setters públicos o protegidos).

---

## 📊 Ejemplo Detallado

```java
public class Empleado {
    // Público - accesible desde cualquier lugar
    public String nombreEmpresa = "TechCorp";
    
    // Protegido - accesible en la clase y subclases
    protected String nombre;
    protected double salarioBase;
    
    // Privado - solo accesible en esta clase
    private String numeroSeguroSocial;
    
    // Constructor
    public Empleado(String nombre, double salarioBase, String nss) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.numeroSeguroSocial = nss;
    }
    
    // Método público - heredable
    public void trabajar() {
        System.out.println(nombre + " está trabajando");
    }
    
    // Método protegido - heredable
    protected double calcularSalario() {
        return salarioBase;
    }
    
    // Método privado - NO heredable directamente
    private void validarNSS() {
        // Validación interna
    }
    
    // Getter para atributo privado
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }
}

public class Gerente extends Empleado {
    private double bono;
    
    public Gerente(String nombre, double salarioBase, String nss, double bono) {
        super(nombre, salarioBase, nss);
        this.bono = bono;
    }
    
    public void mostrarInfo() {
        // ✅ Acceso a atributo público
        System.out.println("Empresa: " + nombreEmpresa);
        
        // ✅ Acceso a atributos protected
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: " + salarioBase);
        
        // ❌ Error: no se puede acceder a atributo private
        // System.out.println("NSS: " + numeroSeguroSocial);  // Error de compilación
        
        // ✅ Pero sí mediante getter público
        System.out.println("NSS: " + getNumeroSeguroSocial());
        
        // ✅ Llamar método protected heredado
        double salarioTotal = calcularSalario() + bono;
        System.out.println("Salario total: " + salarioTotal);
    }
    
    public void dirigir() {
        System.out.println(nombre + " está dirigiendo el equipo");
    }
}
```

### Uso:
```java
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana García", 5000.0, "123-45-6789", 2000.0);
        
        // Métodos heredados de Empleado
        gerente.trabajar();           // ✅ "Ana García está trabajando"
        
        // Métodos propios de Gerente
        gerente.dirigir();            // ✅ "Ana García está dirigiendo el equipo"
        gerente.mostrarInfo();        // ✅ Muestra toda la información
    }
}
```

---

## 🔗 Herencia Simple en Java

Java **solo permite herencia simple**: una clase puede heredar de UNA sola clase.

### ✅ Correcto:
```java
class Animal { }
class Mamifero extends Animal { }
class Perro extends Mamifero { }  // ✅ Herencia en cadena
```

### ❌ Incorrecto:
```java
class Animal { }
class Mascota { }
class Perro extends Animal, Mascota { }  // ❌ Error de compilación
```

**Solución para múltiples "comportamientos":** Usar **interfaces** (Semana 6)

---

## 🌳 Jerarquías de Herencia

### Herencia Lineal (Cadena)
```java
class Vehiculo { }
class VehiculoTerrestre extends Vehiculo { }
class Automovil extends VehiculoTerrestre { }
class AutoDeportivo extends Automovil { }
```

```
Vehiculo
    ↓
VehiculoTerrestre
    ↓
Automovil
    ↓
AutoDeportivo
```

### Herencia Jerárquica (Árbol)
```java
class Animal { }
class Perro extends Animal { }
class Gato extends Animal { }
class Pajaro extends Animal { }
```

```
        Animal
       /  |  \
      /   |   \
  Perro Gato Pájaro
```

### Herencia Multinivel Combinada
```java
class Figura { }
class Figura2D extends Figura { }
class Figura3D extends Figura { }
class Circulo extends Figura2D { }
class Rectangulo extends Figura2D { }
class Esfera extends Figura3D { }
class Cubo extends Figura3D { }
```

```
          Figura
         /      \
    Figura2D   Figura3D
     /    \     /    \
Círculo Rect Esfera Cubo
```

---

## 💡 Ejemplo Práctico Completo

```java
// Clase base
public class Figura {
    protected String color;
    protected boolean rellena;
    
    public Figura(String color, boolean rellena) {
        this.color = color;
        this.rellena = rellena;
    }
    
    public void mostrarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Rellena: " + (rellena ? "Sí" : "No"));
    }
}

// Subclase nivel 1
public class Figura2D extends Figura {
    protected double perimetro;
    
    public Figura2D(String color, boolean rellena) {
        super(color, rellena);
    }
    
    public void dibujar() {
        System.out.println("Dibujando figura 2D");
    }
}

// Subclase nivel 2
public class Rectangulo extends Figura2D {
    private double base;
    private double altura;
    
    public Rectangulo(String color, boolean rellena, double base, double altura) {
        super(color, rellena);
        this.base = base;
        this.altura = altura;
        this.perimetro = 2 * (base + altura);
    }
    
    public double calcularArea() {
        return base * altura;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llama al método del padre
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + perimetro);
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo("Azul", true, 5.0, 3.0);
        
        // Métodos heredados de Figura
        rect.mostrarInfo();
        
        // Métodos heredados de Figura2D
        rect.dibujar();
        
        // Métodos propios de Rectangulo
        System.out.println("Área: " + rect.calcularArea());
    }
}
```

**Salida:**
```
Color: Azul
Rellena: Sí
Base: 5.0
Altura: 3.0
Área: 15.0
Perímetro: 16.0
Dibujando figura 2D
Área: 15.0
```

---

## ⚙️ Modificadores de Acceso y Herencia

### Tabla de Accesibilidad

| Modificador | Misma Clase | Mismo Paquete | Subclase (otro paquete) | Cualquier Clase |
|-------------|-------------|---------------|-------------------------|-----------------|
| `private` | ✅ | ❌ | ❌ | ❌ |
| `default` (sin modificador) | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

### Recomendación para Herencia:

```java
public class ClasePadre {
    // Para datos que deben ser privados
    private String datoPrivado;
    
    // Para datos que las subclases necesitan acceder
    protected String datoCompartido;
    
    // Para métodos públicos de la API
    public void metodoPublico() { }
    
    // Para métodos auxiliares solo para la familia de clases
    protected void metodoProtegido() { }
}
```

---

## 🎯 La Clase Object

**Importante:** En Java, si no especificas `extends`, tu clase automáticamente extiende de `Object`.

```java
// Estas dos declaraciones son equivalentes:
class MiClase { }
class MiClase extends Object { }
```

La clase `Object` es la raíz de todas las clases en Java y proporciona métodos como:
- `toString()`
- `equals(Object obj)`
- `hashCode()`
- `getClass()`

```java
class Persona {
    private String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    // Sobrescribiendo método heredado de Object
    @Override
    public String toString() {
        return "Persona: " + nombre;
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println(p.toString());  // "Persona: Juan"
        System.out.println(p);              // Llama automáticamente a toString()
    }
}
```

---

## ⚠️ Errores Comunes

### 1. Intentar Herencia Múltiple
```java
// ❌ Error de compilación
class Perro extends Animal, Mascota { }
```
**Solución:** Usar interfaces (Semana 6)

### 2. Clase Final
```java
final class ClaseFinal { }

// ❌ Error: no se puede heredar de una clase final
class MiClase extends ClaseFinal { }
```

### 3. Acceder a Miembros Privados
```java
class Padre {
    private int x = 10;
}

class Hijo extends Padre {
    public void mostrar() {
        System.out.println(x);  // ❌ Error: x es private
    }
}
```

---

## 📝 Buenas Prácticas

1. **Usa `protected` para miembros que las subclases necesiten**
   ```java
   protected String atributoParaHijos;
   ```

2. **Verifica la relación "es-un" antes de usar `extends`**
   - ✅ Un Perro **es un** Animal
   - ❌ Un Coche **tiene un** Motor (usar composición)

3. **No hagas jerarquías muy profundas**
   - Máximo 3-4 niveles
   - Más profundas = más difíciles de mantener

4. **Documenta la jerarquía**
   ```java
   /**
    * Clase base para todos los vehículos.
    * Subclases: Automovil, Motocicleta, Barco
    */
   public class Vehiculo { }
   ```

---

## 📌 Resumen

- **`extends`**: Palabra clave para implementar herencia
- **Sintaxis**: `class Hija extends Padre { }`
- **Herencia simple**: Solo una clase padre permitida
- **Se heredan**: Atributos y métodos `public`, `protected`, y `default` (mismo paquete)
- **NO se heredan**: Constructores, miembros `private`
- **Toda clase** hereda implícitamente de `Object`
- **`protected`**: Modificador ideal para herencia

---

## 🔗 Próximo Tema

En el siguiente tema profundizaremos en las **Jerarquías de Clases** y cómo diseñar sistemas complejos con múltiples niveles de herencia.

---

**Última actualización:** Octubre 2025
