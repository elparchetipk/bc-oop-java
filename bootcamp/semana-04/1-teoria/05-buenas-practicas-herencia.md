# 05 - Buenas Prácticas en Herencia

## 📚 Introducción

La herencia es una herramienta poderosa, pero como dice el refrán: "un gran poder conlleva una gran responsabilidad". Usar herencia incorrectamente puede llevar a código difícil de mantener, rígido y propenso a errores. Esta guía te ayudará a usar herencia de manera efectiva.

---

## 🎯 Principio Fundamental: "es-un" vs "tiene-un"

### Regla de Oro

> **Usa herencia solo cuando exista una relación "es-un" (is-a) genuina.**  
> **Usa composición cuando exista una relación "tiene-un" (has-a).**

### ✅ Herencia Apropiada (es-un)

```java
// Un Perro ES UN Animal
class Animal { }
class Perro extends Animal { }  // ✅ Correcto

// Un Gerente ES UN Empleado
class Empleado { }
class Gerente extends Empleado { }  // ✅ Correcto

// Un Cuadrado ES UN Rectángulo (debatible, ver más abajo)
class Rectangulo { }
class Cuadrado extends Rectangulo { }  // ⚠️ Cuidado
```

### ❌ Herencia Incorrecta (tiene-un)

```java
// Un Coche TIENE UN Motor (no ES UN Motor)
class Motor { }
class Coche extends Motor { }  // ❌ Incorrecto

// Una Casa TIENE UNA Puerta
class Puerta { }
class Casa extends Puerta { }  // ❌ Incorrecto

// Usar composición:
class Coche {
    private Motor motor;  // ✅ Correcto
}

class Casa {
    private List<Puerta> puertas;  // ✅ Correcto
}
```

---

## 🏗️ Diseño de Jerarquías

### 1. Mantén Jerarquías Poco Profundas

**Recomendación:** Máximo 3-4 niveles

```java
// ✅ Bueno: 3 niveles
Vehiculo
└── VehiculoTerrestre
    └── Automovil

// ⚠️ Cuestionable: 5+ niveles
SerVivo
└── Animal
    └── Vertebrado
        └── Mamifero
            └── Primate
                └── Humano  // Demasiado profundo
```

**Por qué:**
- Fácil de entender
- Fácil de mantener
- Menor acoplamiento
- Menos bugs

### 2. Coloca Comportamiento Común en la Clase Base

```java
// ✅ Bueno: Lo común arriba
class Figura {
    protected String color;
    protected boolean rellena;
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Método abstracto para cálculos específicos
    public abstract double calcularArea();
}

class Circulo extends Figura {
    private double radio;
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// ❌ Malo: Duplicación
class Circulo {
    private String color;  // Duplicado
    private double radio;
    
    public void setColor(String color) { }  // Duplicado
}

class Rectangulo {
    private String color;  // Duplicado
    
    public void setColor(String color) { }  // Duplicado
}
```

### 3. Favorece Composición Sobre Herencia

**Principio:** "Composition over Inheritance"

```java
// ❌ Herencia rígida
class EmpleadoConReportes extends Empleado {
    private List<Reporte> reportes;
}

class EmpleadoConBeneficios extends Empleado {
    private List<Beneficio> beneficios;
}

// ¿Y si necesitas ambos? No puedes heredar de dos clases

// ✅ Composición flexible
class Empleado {
    private GestorReportes gestorReportes;     // Componente
    private GestorBeneficios gestorBeneficios; // Componente
    
    // Puede tener uno, otro, ambos o ninguno
}
```

---

## 🔐 Modificadores de Acceso

### Reglas de Visibilidad en Herencia

| Uso | Modificador | Razón |
|-----|-------------|-------|
| **API pública** | `public` | Acceso desde cualquier lugar |
| **Para subclases** | `protected` | Solo familia de clases |
| **Detalles internos** | `private` | Solo la clase actual |
| **Mismo paquete** | (default) | Solo dentro del paquete |

### Ejemplo:

```java
public class Empleado {
    // Público - parte de la API
    public String getNombre() {
        return nombre;
    }
    
    // Protegido - para uso de subclases
    protected double calcularSalarioBase() {
        return salarioBase;
    }
    
    // Privado - detalles de implementación
    private void validarNSS() {
        // Solo esta clase lo usa
    }
    
    // Atributos: preferir protected si las subclases necesitan acceso directo
    protected String nombre;
    protected double salarioBase;
    private String nss;  // Dato sensible, solo accesible vía getters
}
```

---

## 🎨 Sobrescritura de Métodos

### 1. Usa `@Override` Siempre

```java
class Animal {
    public void hacerSonido() {
        System.out.println("Algún sonido");
    }
}

class Perro extends Animal {
    // ✅ Bueno: Con @Override
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau!");
    }
}

// ❌ Malo: Sin @Override
class Gato extends Animal {
    // Typo: "hacerSonidos" en lugar de "hacerSonido"
    public void hacerSonidos() {  // Crea un método nuevo, no sobrescribe
        System.out.println("¡Miau!");
    }
}
```

**Ventajas de `@Override`:**
- El compilador verifica que estás sobrescribiendo
- Detecta errores de tipeo
- Mejora legibilidad

### 2. Llama a `super.metodo()` Cuando Corresponda

```java
// ✅ Bueno: Extiende funcionalidad del padre
@Override
public void mostrarInfo() {
    super.mostrarInfo();  // Mantiene funcionalidad del padre
    System.out.println("Información adicional del hijo");
}

// ⚠️ Cuidado: Reemplaza completamente
@Override
public void mostrarInfo() {
    // No llama a super, ignora funcionalidad del padre
    System.out.println("Solo info del hijo");
}
```

### 3. Mantén la Compatibilidad

**Principio de Sustitución de Liskov (LSP):**

> Una subclase debe poder sustituir a su superclase sin romper el funcionamiento del programa.

```java
class Rectangulo {
    protected int ancho;
    protected int alto;
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public int getArea() {
        return ancho * alto;
    }
}

// ❌ Violación de LSP
class Cuadrado extends Rectangulo {
    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
        this.alto = ancho;  // Rompe la expectativa del usuario
    }
    
    @Override
    public void setAlto(int alto) {
        this.ancho = alto;
        this.alto = alto;
    }
}

// Problema:
Rectangulo r = new Cuadrado();
r.setAncho(5);
r.setAlto(10);
// Usuario espera área = 50, pero obtiene 100 ❌

// ✅ Mejor: No heredar si rompe el contrato
class Cuadrado {
    private int lado;
    
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int getArea() {
        return lado * lado;
    }
}
```

---

## 🚫 Qué Evitar

### 1. No Heredar Solo para Reutilizar Código

```java
// ❌ Malo: Herencia solo para reutilizar código
class ArrayList { ... }
class Pila extends ArrayList { }  // ❌ Una pila NO ES una ArrayList

// ✅ Bueno: Composición
class Pila {
    private ArrayList datos = new ArrayList();  // TIENE UNA lista
    
    public void push(Object item) {
        datos.add(item);
    }
    
    public Object pop() {
        return datos.remove(datos.size() - 1);
    }
}
```

### 2. No Exponer Detalles de Implementación

```java
// ❌ Malo: Expone implementación
class EmpleadoConBD extends ConexionBD {
    // Ahora Empleado está acoplado a la BD
}

// ✅ Bueno: Usa composición
class Empleado {
    private ConexionBD db;  // Implementación oculta
}
```

### 3. Evita Herencia Múltiple de Comportamiento

Java no permite herencia múltiple de clases (solo de interfaces).

```java
// ❌ No permitido en Java
class Perro extends Animal, Mascota { }

// ✅ Solución: Una herencia + interfaces
class Perro extends Animal implements Mascota, Entrenable { }
```

---

## 📐 Diseño de Clases Base

### 1. Clases Abstractas para Clases Base

Si una clase solo existe para ser heredada:

```java
// ✅ Bueno: Clase abstracta
public abstract class Figura {
    protected String color;
    
    public abstract double calcularArea();
    
    public void mostrarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea());
    }
}

// No puedes hacer:
// Figura f = new Figura();  // Error: clase abstracta

// Pero sí:
class Circulo extends Figura {
    private double radio;
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

### 2. Métodos Final para Evitar Sobrescritura

```java
class Empleado {
    protected double salarioBase;
    
    // No se puede sobrescribir
    public final double getSalarioBase() {
        return salarioBase;
    }
    
    // Se puede sobrescribir
    public double calcularSalarioTotal() {
        return salarioBase;
    }
}

class Gerente extends Empleado {
    private double bono;
    
    // ❌ Error: no se puede sobrescribir un método final
    // @Override
    // public double getSalarioBase() { }
    
    // ✅ Correcto
    @Override
    public double calcularSalarioTotal() {
        return salarioBase + bono;
    }
}
```

### 3. Clases Final para Prevenir Herencia

```java
// Esta clase no puede ser heredada
public final class String {
    // ...
}

// ❌ Error de compilación
class MiString extends String { }
```

**Cuándo usar `final` en clases:**
- Clases de utilidad (ej: `Math`)
- Razones de seguridad
- Optimización de rendimiento
- Diseño inmutable

---

## 📋 Checklist de Buenas Prácticas

### Antes de Usar Herencia:

- [ ] ¿Existe una relación "es-un" genuina?
- [ ] ¿No sería mejor composición ("tiene-un")?
- [ ] ¿La jerarquía es poco profunda (≤ 3-4 niveles)?
- [ ] ¿Las subclases pueden sustituir a la superclase sin problemas? (LSP)

### Al Implementar Herencia:

- [ ] ¿Usaste `protected` para miembros que las subclases necesitan?
- [ ] ¿Los atributos sensibles están `private` con getters/setters?
- [ ] ¿Usaste `@Override` en todos los métodos sobrescritos?
- [ ] ¿Llamaste a `super()` en los constructores?
- [ ] ¿Documentaste la jerarquía y sus responsabilidades?

### Al Sobrescribir Métodos:

- [ ] ¿Usaste `@Override`?
- [ ] ¿Mantuviste el contrato del método padre?
- [ ] ¿Llamaste a `super.metodo()` si necesitas extender funcionalidad?
- [ ] ¿La firma es exactamente igual (nombre, parámetros, retorno)?

---

## 💡 Ejemplos de Buenas Prácticas

### Ejemplo 1: Sistema de Empleados Bien Diseñado

```java
// Clase base abstracta
public abstract class Empleado {
    protected String nombre;
    protected String id;
    protected double salarioBase;
    
    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }
    
    // Método abstracto - cada tipo calcula diferente
    public abstract double calcularSalarioMensual();
    
    // Método concreto - comportamiento común
    public final String getId() {  // final: no se puede modificar
        return id;
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + calcularSalarioMensual());
    }
}

public class EmpleadoTiempoCompleto extends Empleado {
    private double bonificacion;
    
    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase, double bonificacion) {
        super(nombre, id, salarioBase);
        this.bonificacion = bonificacion;
    }
    
    @Override
    public double calcularSalarioMensual() {
        return salarioBase + bonificacion;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Reutiliza comportamiento del padre
        System.out.println("Bonificación: $" + bonificacion);
    }
}

public class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;
    
    public EmpleadoTiempoParcial(String nombre, String id, int horas, double tarifa) {
        super(nombre, id, 0);  // Salario base no aplica
        this.horasTrabajadas = horas;
        this.tarifaPorHora = tarifa;
    }
    
    @Override
    public double calcularSalarioMensual() {
        return horasTrabajadas * tarifaPorHora;
    }
}
```

### Ejemplo 2: Composición Sobre Herencia

```java
// ❌ Herencia rígida
class EmpleadoConEmail extends Empleado {
    private String email;
}

class EmpleadoConTelefono extends Empleado {
    private String telefono;
}

// ¿Empleado con email Y teléfono? No puedes heredar de ambos

// ✅ Composición flexible
class Empleado {
    private String nombre;
    private ContactInfo contacto;  // Composición
}

class ContactInfo {
    private String email;
    private String telefono;
    private String direccion;
    
    // Puede tener todos, algunos o ninguno
}
```

---

## 📌 Resumen

### Principios Clave:

1. **"es-un" vs "tiene-un"**: Herencia para "es-un", composición para "tiene-un"
2. **Jerarquías poco profundas**: Máximo 3-4 niveles
3. **@Override siempre**: Para detectar errores
4. **protected para familia**: Para atributos que subclases necesitan
5. **LSP**: Las subclases deben poder sustituir a las superclases
6. **Composición sobre herencia**: Cuando tengas dudas

### Qué Evitar:

- ❌ Herencia solo para reutilizar código
- ❌ Jerarquías muy profundas
- ❌ Violar el principio de sustitución de Liskov
- ❌ Exponer detalles de implementación
- ❌ No usar `@Override`

---

## 🔗 Próxima Semana

La próxima semana estudiaremos **Polimorfismo**, que construye sobre los conceptos de herencia que has aprendido esta semana.

---

## 📖 Referencias

- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java/9780134686097/)
- [SOLID Principles](https://en.wikipedia.org/wiki/SOLID)
- [Liskov Substitution Principle](https://en.wikipedia.org/wiki/Liskov_substitution_principle)
- [Composition over Inheritance](https://en.wikipedia.org/wiki/Composition_over_inheritance)

---

**Última actualización:** Octubre 2025
