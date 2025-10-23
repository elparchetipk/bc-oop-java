# 03 - Jerarquías de Clases

## 📚 Introducción

Una **jerarquía de clases** es la estructura organizacional que se forma cuando múltiples clases están relacionadas mediante herencia. Es como un árbol genealógico de clases, donde cada rama representa una especialización de la clase padre.

---

## 🌳 ¿Qué es una Jerarquía de Clases?

### Definición

> Una **jerarquía de clases** es la organización estructurada de clases relacionadas mediante herencia, formando niveles de generalización (arriba) a especialización (abajo).

### Visualización

```
       [Clase más general]
              ↓
       [Clase intermedia]
         ↙         ↘
[Especialización A] [Especialización B]
```

---

## 📊 Tipos de Jerarquías

### 1. Herencia de Un Solo Nivel

La forma más simple: una clase padre, una o más clases hijas directas.

```java
// Padre
class Vehiculo {
    protected String marca;
    
    public void arrancar() {
        System.out.println("Arrancando vehículo");
    }
}

// Hijos directos
class Coche extends Vehiculo {
    private int numPuertas;
}

class Moto extends Vehiculo {
    private boolean tieneSidecar;
}
```

**Diagrama:**
```
        Vehiculo
       /        \
    Coche      Moto
```

---

### 2. Herencia Multinivel (Cadena)

Varios niveles de herencia, uno tras otro.

```java
// Nivel 0 - Más general
class Animal {
    public void respirar() {
        System.out.println("Respirando...");
    }
}

// Nivel 1
class Mamifero extends Animal {
    public void amamantar() {
        System.out.println("Amamantando crías...");
    }
}

// Nivel 2
class Perro extends Mamifero {
    public void ladrar() {
        System.out.println("¡Guau!");
    }
}

// Nivel 3 - Más específico
class Chihuahua extends Perro {
    public void temblar() {
        System.out.println("Temblando...");
    }
}
```

**Diagrama:**
```
    Animal
      ↓
   Mamífero
      ↓
    Perro
      ↓
  Chihuahua
```

**Nota:** Un `Chihuahua` tiene acceso a todos los métodos:
- `respirar()` (de Animal)
- `amamantar()` (de Mamifero)
- `ladrar()` (de Perro)
- `temblar()` (propio)

---

### 3. Herencia Jerárquica (Árbol)

Una clase padre con múltiples clases hijas, y estas a su vez pueden tener sus propias hijas.

```java
// Raíz
class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public double calcularSalario() {
        return salarioBase;
    }
}

// Nivel 1
class EmpleadoTiempoCompleto extends Empleado {
    private double bono;
    
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}

class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;
    
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaHora;
    }
}

class Contratista extends Empleado {
    private double tarifaProyecto;
    
    @Override
    public double calcularSalario() {
        return tarifaProyecto;
    }
}

// Nivel 2
class Gerente extends EmpleadoTiempoCompleto {
    private double bonoGerencial;
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }
}
```

**Diagrama:**
```
                 Empleado
           /        |        \
EmpleadoTC  EmpleadoTP  Contratista
    |
 Gerente
```

---

## 🎯 Diseño de Jerarquías Efectivas

### Principios Fundamentales

#### 1. **De General a Específico**

Coloca las características comunes en la clase más alta posible.

```java
// ✅ Bueno: Características comunes en la clase base
class Figura {
    protected String color;          // Común a todas
    protected boolean rellena;       // Común a todas
}

class Circulo extends Figura {
    private double radio;            // Específico de círculo
}

class Rectangulo extends Figura {
    private double base, altura;     // Específico de rectángulo
}
```

```java
// ❌ Malo: Duplicación de características comunes
class Circulo {
    private String color;            // Duplicado
    private boolean rellena;         // Duplicado
    private double radio;
}

class Rectangulo {
    private String color;            // Duplicado
    private boolean rellena;         // Duplicado
    private double base, altura;
}
```

#### 2. **Relación "es-un" en Cada Nivel**

Cada nivel debe mantener la relación "es-un".

```java
// ✅ Correcto
Animal → Mamífero → Perro
// Un Perro ES UN Mamífero
// Un Mamífero ES UN Animal

// ❌ Incorrecto
Animal → Motor → Perro
// Un Motor NO ES UN Animal ❌
```

#### 3. **Evitar Jerarquías Demasiado Profundas**

**Recomendación:** Máximo 3-4 niveles

```java
// ✅ Aceptable (3 niveles)
Vehiculo → VehiculoTerrestre → Automovil

// ⚠️ Cuestionable (5 niveles)
SerVivo → Animal → Vertebrado → Mamifero → Carnivoro → Felino → Gato
```

**Problemas de jerarquías profundas:**
- Difíciles de entender
- Difíciles de mantener
- Cambios en la base afectan muchas clases
- Complican el debugging

---

## 💻 Ejemplo Completo: Sistema de Figuras Geométricas

```java
// ========== NIVEL 0: Clase Base ==========
public abstract class Figura {
    protected String color;
    protected boolean rellena;
    
    public Figura(String color, boolean rellena) {
        this.color = color;
        this.rellena = rellena;
    }
    
    public abstract double calcularArea();
    
    public void mostrarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Rellena: " + rellena);
    }
}

// ========== NIVEL 1: Categorías ==========
public abstract class Figura2D extends Figura {
    public Figura2D(String color, boolean rellena) {
        super(color, rellena);
    }
    
    public abstract double calcularPerimetro();
    
    public void dibujar2D() {
        System.out.println("Dibujando figura en 2D");
    }
}

public abstract class Figura3D extends Figura {
    public Figura3D(String color, boolean rellena) {
        super(color, rellena);
    }
    
    public abstract double calcularVolumen();
    
    public void dibujar3D() {
        System.out.println("Dibujando figura en 3D");
    }
}

// ========== NIVEL 2: Figuras Específicas ==========

// Figuras 2D
public class Circulo extends Figura2D {
    private double radio;
    
    public Circulo(String color, boolean rellena, double radio) {
        super(color, rellena);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class Rectangulo extends Figura2D {
    private double base;
    private double altura;
    
    public Rectangulo(String color, boolean rellena, double base, double altura) {
        super(color, rellena);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

// Figuras 3D
public class Esfera extends Figura3D {
    private double radio;
    
    public Esfera(String color, boolean rellena, double radio) {
        super(color, rellena);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }
    
    @Override
    public double calcularVolumen() {
        return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
    }
}

public class Cubo extends Figura3D {
    private double lado;
    
    public Cubo(String color, boolean rellena, double lado) {
        super(color, rellena);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return 6 * lado * lado;  // Área superficial
    }
    
    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
}

// ========== USO ==========
public class Main {
    public static void main(String[] args) {
        // Crear figuras 2D
        Circulo circulo = new Circulo("Rojo", true, 5.0);
        Rectangulo rect = new Rectangulo("Azul", false, 4.0, 6.0);
        
        // Crear figuras 3D
        Esfera esfera = new Esfera("Verde", true, 3.0);
        Cubo cubo = new Cubo("Amarillo", false, 2.0);
        
        // Usar métodos heredados y propios
        System.out.println("=== CÍRCULO ===");
        circulo.mostrarInfo();                          // De Figura
        circulo.dibujar2D();                            // De Figura2D
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        
        System.out.println("\n=== ESFERA ===");
        esfera.mostrarInfo();                           // De Figura
        esfera.dibujar3D();                             // De Figura3D
        System.out.println("Área: " + esfera.calcularArea());
        System.out.println("Volumen: " + esfera.calcularVolumen());
    }
}
```

**Jerarquía:**
```
               Figura
              /      \
        Figura2D    Figura3D
         /    \      /    \
    Círculo Rect Esfera  Cubo
```

---

## 📐 Navegando la Jerarquía

### Acceso a Miembros Heredados

```java
class Abuelo {
    protected String apellido = "García";
    
    public void metodoAbuelo() {
        System.out.println("Método del abuelo");
    }
}

class Padre extends Abuelo {
    protected String nombre = "Carlos";
    
    public void metodoPadre() {
        System.out.println("Método del padre");
        System.out.println("Apellido heredado: " + apellido);  // ✅ De Abuelo
    }
}

class Hijo extends Padre {
    private int edad = 10;
    
    public void metodoHijo() {
        System.out.println("Método del hijo");
        System.out.println("Nombre heredado: " + nombre);      // ✅ De Padre
        System.out.println("Apellido heredado: " + apellido);  // ✅ De Abuelo
        
        // Puede llamar métodos de toda la jerarquía
        metodoAbuelo();  // ✅
        metodoPadre();   // ✅
    }
}
```

---

## ⚖️ Balance en el Diseño

### ✅ Jerarquía Bien Diseñada

```java
// Clara, lógica, no muy profunda
Empleado
├── EmpleadoRegular
│   ├── EmpleadoTiempoCompleto
│   └── EmpleadoTiempoParcial
└── Contratista
```

**Características:**
- Máximo 2-3 niveles
- Cada nivel añade valor
- Relación "es-un" clara
- Fácil de entender y mantener

### ❌ Jerarquía Mal Diseñada

```java
// Demasiado profunda, confusa
Objeto
└── SerVivo
    └── Organismo
        └── Animal
            └── Vertebrado
                └── Mamifero
                    └── Primate
                        └── Simio
                            └── Humano
                                └── Empleado  // 9 niveles! ❌
```

---

## 🎨 Patrones Comunes de Jerarquías

### 1. Jerarquía por Comportamiento
```
Vehiculo
├── VehiculoMotorizado
└── VehiculoNoMotorizado
```

### 2. Jerarquía por Categoría
```
Producto
├── ProductoFisico
└── ProductoDigital
```

### 3. Jerarquía por Rol
```
Usuario
├── Administrador
├── Moderador
└── UsuarioRegular
```

---

## 📌 Resumen

- **Jerarquía**: Estructura de clases relacionadas por herencia
- **Tipos**: Un nivel, multinivel, jerárquica
- **Diseño**: De general a específico
- **Profundidad**: Máximo 3-4 niveles recomendados
- **Principio**: Mantener relación "es-un" en cada nivel
- **Balance**: Entre reutilización y complejidad

---

## 🔗 Próximo Tema

En el siguiente tema aprenderemos sobre la **palabra clave `super`**, fundamental para trabajar con jerarquías y constructores.

---

**Última actualización:** Octubre 2025
