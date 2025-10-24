# Introducción al Polimorfismo

## 🎯 Objetivos de Aprendizaje

Al finalizar esta lección, serás capaz de:
- Definir qué es el polimorfismo
- Identificar los tipos de polimorfismo en Java
- Comprender las ventajas del polimorfismo
- Reconocer situaciones donde aplicar polimorfismo

---

## 📖 ¿Qué es el Polimorfismo?

### Definición

**Polimorfismo** proviene del griego:
- **poly** = muchos
- **morphos** = formas

> "Es la capacidad de un objeto de tomar muchas formas"

En programación orientada a objetos, el polimorfismo permite que:
- Una misma operación se comporte de manera diferente en diferentes clases
- Un objeto pueda ser referenciado de múltiples formas
- El código sea más flexible y extensible

### Analogía del Mundo Real

Piensa en un **control remoto universal**:
- Tiene botones como "Encender", "Apagar", "Volumen+"
- Funciona con TV, reproductor DVD, equipo de sonido
- El botón "Encender" hace cosas diferentes según el dispositivo
- El control (interfaz) es el mismo, pero el comportamiento varía

```
Control Remoto (Interfaz común)
     ↓
Encender → TV: Pantalla se ilumina
         → DVD: Bandeja se abre
         → Sonido: Amplificador se activa
```

---

## 🎭 El Polimorfismo en Java

### Concepto General

```java
// Una variable de tipo Animal puede "tomar muchas formas"
Animal miAnimal;

miAnimal = new Perro();   // Ahora es un Perro
miAnimal = new Gato();    // Ahora es un Gato
miAnimal = new Pajaro();  // Ahora es un Pájaro

// Cada uno se comporta diferente
miAnimal.hacerSonido();   // Diferente según el objeto real
```

### Principio Fundamental

**"Una referencia de superclase puede apuntar a objetos de subclases"**

Esto significa que podemos escribir código que funciona con la superclase, pero que en realidad opera con objetos de las subclases.

---

## 🔢 Tipos de Polimorfismo en Java

Java soporta **tres tipos** principales de polimorfismo:

### 1. Polimorfismo en Tiempo de Compilación (Compile-time)

**También conocido como:** Sobrecarga (Overloading), Polimorfismo Estático

**Características:**
- Se resuelve en tiempo de compilación
- Múltiples métodos con el mismo nombre
- Diferentes parámetros

**Ejemplo:**
```java
class Calculadora {
    // Tres versiones del mismo método
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

// Uso
Calculadora calc = new Calculadora();
calc.sumar(5, 3);          // Llama a la primera versión
calc.sumar(5.5, 3.2);      // Llama a la segunda versión
calc.sumar(5, 3, 2);       // Llama a la tercera versión
```

**¿Cuándo se decide qué método usar?** Durante la compilación, Java analiza los tipos de los argumentos.

---

### 2. Polimorfismo en Tiempo de Ejecución (Runtime)

**También conocido como:** Sobrescritura (Overriding), Polimorfismo Dinámico

**Características:**
- Se resuelve en tiempo de ejecución
- Método heredado es redefinido en la subclase
- Mismo nombre, mismos parámetros, diferente implementación

**Ejemplo:**
```java
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau miau!");
    }
}

// Uso
Animal miAnimal;

miAnimal = new Perro();
miAnimal.hacerSonido();  // "¡Guau guau!" (decidido en runtime)

miAnimal = new Gato();
miAnimal.hacerSonido();  // "¡Miau miau!" (decidido en runtime)
```

**¿Cuándo se decide qué método usar?** Durante la ejecución, Java verifica el tipo real del objeto.

---

### 3. Polimorfismo con Referencias (Dynamic Binding)

**También conocido como:** Binding Dinámico, Late Binding

**Características:**
- Uso de variables de superclase
- El tipo real se determina en runtime
- Permite código genérico y reutilizable

**Ejemplo:**
```java
// Array polimórfico
Animal[] zoologico = new Animal[3];
zoologico[0] = new Perro();
zoologico[1] = new Gato();
zoologico[2] = new Pajaro();

// Procesar todos de forma uniforme
for (Animal animal : zoologico) {
    animal.hacerSonido();  // Cada uno hace su sonido específico
}

// Salida:
// ¡Guau guau!
// ¡Miau miau!
// ¡Pío pío!
```

---

## ✨ Ventajas del Polimorfismo

### 1. **Código más Flexible**

Sin polimorfismo:
```java
public void hacerSonarPerro(Perro perro) {
    perro.hacerSonido();
}

public void hacerSonarGato(Gato gato) {
    gato.hacerSonido();
}

public void hacerSonarPajaro(Pajaro pajaro) {
    pajaro.hacerSonido();
}
```

Con polimorfismo:
```java
public void hacerSonarAnimal(Animal animal) {
    animal.hacerSonido();  // ¡Funciona con cualquier Animal!
}
```

**Resultado:** Un solo método en lugar de muchos.

---

### 2. **Extensibilidad**

Agregar nuevos tipos sin modificar código existente:

```java
// Código existente
public void procesarAnimales(Animal[] animales) {
    for (Animal a : animales) {
        a.hacerSonido();
    }
}

// Agregar nuevo tipo (¡sin modificar el método!)
class Leon extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡ROAR!");
    }
}

// El método procesarAnimales() funciona automáticamente con Leon
```

---

### 3. **Reducción de Código Duplicado**

Sin polimorfismo:
```java
if (tipo.equals("Perro")) {
    Perro p = (Perro) animal;
    p.hacerSonido();
} else if (tipo.equals("Gato")) {
    Gato g = (Gato) animal;
    g.hacerSonido();
} else if (tipo.equals("Pajaro")) {
    Pajaro pa = (Pajaro) animal;
    pa.hacerSonido();
}
```

Con polimorfismo:
```java
animal.hacerSonido();  // ¡Listo!
```

---

### 4. **Mantenimiento Simplificado**

Cambios centralizados en la superclase afectan a todas las subclases:

```java
class Animal {
    private int energia = 100;
    
    public void hacerSonido() {
        System.out.println("Sonido genérico");
        energia -= 5;  // Cada sonido consume energía
    }
}

// Todas las subclases heredan este comportamiento automáticamente
```

---

### 5. **Facilita el Testing**

Puedes crear objetos mock o stub usando polimorfismo:

```java
// Producción
class BaseDatosReal implements BaseDatos {
    public void guardar(String datos) {
        // Conecta a base de datos real
    }
}

// Testing
class BaseDatosMock implements BaseDatos {
    public void guardar(String datos) {
        // Simula guardar sin conexión real
    }
}

// El código que usa BaseDatos funciona con ambas
```

---

## 🎯 Ejemplo Completo: Sistema de Figuras

### Sin Polimorfismo

```java
class Circulo {
    public double calcularAreaCirculo() { /* ... */ }
}

class Rectangulo {
    public double calcularAreaRectangulo() { /* ... */ }
}

class Triangulo {
    public double calcularAreaTriangulo() { /* ... */ }
}

// Cliente debe conocer cada tipo
public double calcularAreaTotal(Circulo c, Rectangulo r, Triangulo t) {
    return c.calcularAreaCirculo() + 
           r.calcularAreaRectangulo() + 
           t.calcularAreaTriangulo();
}
```

**Problemas:**
- Métodos diferentes para cada figura
- Difícil agregar nuevas figuras
- Cliente acoplado a implementaciones concretas

---

### Con Polimorfismo

```java
// Superclase
abstract class Figura {
    public abstract double calcularArea();
}

// Subclases
class Circulo extends Figura {
    private double radio;
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double ancho, alto;
    
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}

class Triangulo extends Figura {
    private double base, altura;
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Cliente polimórfico
public double calcularAreaTotal(Figura[] figuras) {
    double total = 0;
    for (Figura f : figuras) {
        total += f.calcularArea();  // ¡Polimorfismo en acción!
    }
    return total;
}

// Uso
Figura[] misFiguras = {
    new Circulo(5),
    new Rectangulo(4, 6),
    new Triangulo(3, 8)
};

double areaTotal = calcularAreaTotal(misFiguras);
```

**Ventajas:**
- ✅ Método único para todas las figuras
- ✅ Fácil agregar nuevas figuras (ej: Pentágono)
- ✅ Cliente desacoplado de implementaciones
- ✅ Código más limpio y mantenible

---

## 📊 Polimorfismo en la Práctica

### Caso de Uso 1: Sistema de Pagos

```java
abstract class MetodoPago {
    public abstract boolean procesar(double monto);
}

class TarjetaCredito extends MetodoPago {
    @Override
    public boolean procesar(double monto) {
        // Lógica específica de tarjeta
        return true;
    }
}

class PayPal extends MetodoPago {
    @Override
    public boolean procesar(double monto) {
        // Lógica específica de PayPal
        return true;
    }
}

// Procesador polimórfico
public void realizarPago(MetodoPago metodo, double monto) {
    if (metodo.procesar(monto)) {
        System.out.println("Pago exitoso");
    }
}
```

---

### Caso de Uso 2: Notificaciones

```java
interface Notificacion {
    void enviar(String mensaje);
}

class Email implements Notificacion {
    public void enviar(String mensaje) {
        // Enviar por email
    }
}

class SMS implements Notificacion {
    public void enviar(String mensaje) {
        // Enviar por SMS
    }
}

class PushNotification implements Notificacion {
    public void enviar(String mensaje) {
        // Enviar notificación push
    }
}

// Sistema polimórfico
public void notificarUsuario(Notificacion canal, String mensaje) {
    canal.enviar(mensaje);  // ¡Funciona con cualquier canal!
}
```

---

## 🔑 Conceptos Clave para Recordar

1. **Polimorfismo = Muchas Formas**
   - Un mismo mensaje, diferentes respuestas

2. **Tres Tipos Principales:**
   - Overloading (compilación)
   - Overriding (ejecución)
   - Dynamic Binding (referencias)

3. **Ventajas:**
   - Flexibilidad
   - Extensibilidad
   - Menos duplicación
   - Mantenimiento simplificado

4. **Requisito Principal:**
   - Herencia o interfaces

5. **Principio:**
   - "Programe para interfaces, no para implementaciones"

---

## 💡 Reflexión

Antes de continuar, reflexiona:

1. ¿Puedes pensar en situaciones de tu proyecto donde el polimorfismo sea útil?
2. ¿Qué problemas resuelve el polimorfismo?
3. ¿Cómo harías tu código más flexible con polimorfismo?

---

## ➡️ Próximos Pasos

En las siguientes lecciones profundizaremos en:
- **Sobrecarga (Overloading):** Detalles técnicos y mejores prácticas
- **Sobrescritura (Overriding):** Uso de @Override y super
- **equals() y hashCode():** Implementación correcta
- **Comparable:** Ordenamiento polimórfico

---

**¡El polimorfismo es el corazón de la POO!** 🎭

*Bootcamp POO Java - SENA | Semana 05 - Lección 01*
