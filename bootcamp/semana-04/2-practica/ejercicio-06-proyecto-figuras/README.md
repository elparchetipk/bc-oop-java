# Ejercicio 6: Proyecto Integrador - Sistema de Figuras Geométricas

## 📋 Información del Ejercicio

- **Dificultad:** ⭐⭐⭐⭐⭐ Proyecto Integrador
- **Duración estimada:** 90-120 minutos
- **Objetivo:** Aplicar TODOS los conceptos de herencia en un proyecto completo y funcional

---

## 🎯 Objetivos de Aprendizaje

Al completar este ejercicio, habrás dominado:

1. ✅ Diseño de jerarquías complejas multicapa
2. ✅ Herencia multinivel y multirrama
3. ✅ Uso avanzado de `super()` y `super.metodo()`
4. ✅ Polimorfismo en arrays y colecciones
5. ✅ Sobrescritura de métodos con `@Override`
6. ✅ Encapsulación apropiada (public, protected, private)
7. ✅ Creación de sistemas completos y funcionales

---

## 📝 Descripción del Proyecto

Desarrollarás un **Sistema de Gestión de Figuras Geométricas** que permita:

- Crear y gestionar diferentes tipos de figuras (2D y 3D)
- Calcular áreas y perímetros/volúmenes automáticamente
- Comparar figuras entre sí
- Generar reportes de figuras
- Aplicar transformaciones (escalar, rotar conceptualmente)

### Jerarquía Completa

```
                    FiguraGeometrica
                           │
           ┌───────────────┴───────────────┐
           │                               │
      Figura2D                         Figura3D
           │                               │
    ┌──────┼──────┐              ┌────────┼────────┐
    │      │      │              │        │        │
Circulo Rectangulo Triangulo  Esfera  Cilindro  Cubo
```

---

## 📋 Especificaciones Técnicas Completas

### Clase FiguraGeometrica (Raíz)

**Atributos protected:**
- `nombre` (String)
- `color` (String)
- `id` (int) - ID único autogenerado

**Atributo static:**
- `contadorFiguras` (int) - Para generar IDs únicos

**Constructor:**
```java
public FiguraGeometrica(String nombre, String color)
```

**Métodos:**
```java
public void mostrarInfo()
    // Muestra información básica: ID, nombre, color
    
public String obtenerTipo()
    // Retorna el tipo de figura (2D o 3D)
    
@Override
public String toString()
    // Retorna representación en String
```

---

### Clase Figura2D extends FiguraGeometrica

**Atributos protected:**
- `PI` (final double) = 3.14159265359

**Constructor:**
```java
public Figura2D(String nombre, String color)
```

**Métodos:**
```java
public double calcularArea()
    // DEBE ser sobrescrito en clases hijas
    // Por defecto retorna 0.0
    
public double calcularPerimetro()
    // DEBE ser sobrescrito en clases hijas
    // Por defecto retorna 0.0
    
@Override
public String obtenerTipo()
    // Retorna "2D"
    
@Override
public void mostrarInfo()
    // super.mostrarInfo() + área y perímetro
```

---

### Clase Figura3D extends FiguraGeometrica

**Atributos protected:**
- `PI` (final double) = 3.14159265359

**Constructor:**
```java
public Figura3D(String nombre, String color)
```

**Métodos:**
```java
public double calcularVolumen()
    // DEBE ser sobrescrito en clases hijas
    // Por defecto retorna 0.0
    
public double calcularSuperficie()
    // DEBE ser sobrescrito en clases hijas
    // Por defecto retorna 0.0
    
@Override
public String obtenerTipo()
    // Retorna "3D"
    
@Override
public void mostrarInfo()
    // super.mostrarInfo() + volumen y superficie
```

---

### Figuras 2D

#### Clase Circulo extends Figura2D

**Atributos private:**
- `radio` (double)

**Constructor:**
```java
public Circulo(String color, double radio)
```

**Métodos:**
```java
@Override
public double calcularArea()
    // πr²
    
@Override
public double calcularPerimetro()
    // 2πr
    
public void escalar(double factor)
    // Multiplica el radio por el factor
```

---

#### Clase Rectangulo extends Figura2D

**Atributos private:**
- `base` (double)
- `altura` (double)

**Constructor:**
```java
public Rectangulo(String color, double base, double altura)
```

**Métodos:**
```java
@Override
public double calcularArea()
    // base × altura
    
@Override
public double calcularPerimetro()
    // 2(base + altura)
    
public boolean esCuadrado()
    // Retorna true si base == altura
```

---

#### Clase Triangulo extends Figura2D

**Atributos private:**
- `lado1` (double)
- `lado2` (double)
- `lado3` (double)

**Constructor:**
```java
public Triangulo(String color, double lado1, double lado2, double lado3)
```

**Métodos:**
```java
@Override
public double calcularArea()
    // Usa fórmula de Herón: √[s(s-a)(s-b)(s-c)]
    // donde s = (a+b+c)/2
    
@Override
public double calcularPerimetro()
    // lado1 + lado2 + lado3
    
public String clasificarTriangulo()
    // "Equilátero", "Isósceles" o "Escaleno"
    
public boolean esValido()
    // Verifica si los lados pueden formar un triángulo
    // (suma de dos lados > tercer lado)
```

---

### Figuras 3D

#### Clase Esfera extends Figura3D

**Atributos private:**
- `radio` (double)

**Métodos:**
```java
@Override
public double calcularVolumen()
    // (4/3)πr³
    
@Override
public double calcularSuperficie()
    // 4πr²
```

---

#### Clase Cilindro extends Figura3D

**Atributos private:**
- `radio` (double)
- `altura` (double)

**Métodos:**
```java
@Override
public double calcularVolumen()
    // πr²h
    
@Override
public double calcularSuperficie()
    // 2πr(r + h)
```

---

#### Clase Cubo extends Figura3D

**Atributos private:**
- `lado` (double)

**Métodos:**
```java
@Override
public double calcularVolumen()
    // lado³
    
@Override
public double calcularSuperficie()
    // 6 × lado²
```

---

## 📂 Estructura de Archivos

```
ejercicio-06-proyecto-figuras/
├── README.md
├── FiguraGeometrica.java
├── Figura2D.java
├── Figura3D.java
├── Circulo.java
├── Rectangulo.java
├── Triangulo.java
├── Esfera.java
├── Cilindro.java
├── Cubo.java
├── GestorFiguras.java (clase auxiliar)
└── Main.java
```

---

## 🔨 Implementación Guiada

### Paso 1: FiguraGeometrica (Completo)

```java
public class FiguraGeometrica {
    protected String nombre;
    protected String color;
    protected int id;
    private static int contadorFiguras = 0;
    
    public FiguraGeometrica(String nombre, String color) {
        this.id = ++contadorFiguras;
        this.nombre = nombre;
        this.color = color;
    }
    
    public void mostrarInfo() {
        System.out.println("=== " + nombre.toUpperCase() + " ===");
        System.out.println("ID: " + id);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + obtenerTipo());
    }
    
    public String obtenerTipo() {
        return "Genérica";
    }
    
    @Override
    public String toString() {
        return String.format("[%d] %s (%s)", id, nombre, color);
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getColor() { return color; }
    public int getId() { return id; }
    public static int getTotalFiguras() { return contadorFiguras; }
}
```

### Paso 2: Figura2D (Completo)

```java
public class Figura2D extends FiguraGeometrica {
    protected final double PI = 3.14159265359;
    
    public Figura2D(String nombre, String color) {
        super(nombre, color);
    }
    
    public double calcularArea() {
        return 0.0;  // Debe ser sobrescrito
    }
    
    public double calcularPerimetro() {
        return 0.0;  // Debe ser sobrescrito
    }
    
    @Override
    public String obtenerTipo() {
        return "2D";
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Área: " + String.format("%.2f", calcularArea()) + " unidades²");
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()) + " unidades");
    }
}
```

### Paso 3: Circulo (Plantilla)

```java
public class Circulo extends Figura2D {
    private double radio;
    
    public Circulo(String color, double radio) {
        super("Círculo", color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        // TODO: Implementar π × r²
        return 0.0;
    }
    
    @Override
    public double calcularPerimetro() {
        // TODO: Implementar 2 × π × r
        return 0.0;
    }
    
    public void escalar(double factor) {
        // TODO: Multiplicar radio por factor
        System.out.println("Radio escalado de " + radio + " a " + (radio * factor));
        // TODO: Actualizar radio
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Radio: " + radio);
    }
    
    public double getRadio() { return radio; }
}
```

---

## ✅ Solución Completa de Figuras 2D

<details>
<summary>Click para ver Circulo.java completo</summary>

```java
public class Circulo extends Figura2D {
    private double radio;
    
    public Circulo(String color, double radio) {
        super("Círculo", color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
    
    public void escalar(double factor) {
        System.out.println("Escalando círculo de radio " + radio + " a " + (radio * factor));
        this.radio *= factor;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Radio: " + radio);
    }
    
    public double getRadio() { return radio; }
}
```

</details>

<details>
<summary>Click para ver Rectangulo.java completo</summary>

```java
public class Rectangulo extends Figura2D {
    private double base;
    private double altura;
    
    public Rectangulo(String color, double base, double altura) {
        super("Rectángulo", color);
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
    
    public boolean esCuadrado() {
        return base == altura;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        if (esCuadrado()) {
            System.out.println("¡Es un cuadrado!");
        }
    }
    
    public double getBase() { return base; }
    public double getAltura() { return altura; }
}
```

</details>

<details>
<summary>Click para ver Triangulo.java completo</summary>

```java
public class Triangulo extends Figura2D {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(String color, double lado1, double lado2, double lado3) {
        super("Triángulo", color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public boolean esValido() {
        return (lado1 + lado2 > lado3) && 
               (lado1 + lado3 > lado2) && 
               (lado2 + lado3 > lado1);
    }
    
    @Override
    public double calcularArea() {
        if (!esValido()) return 0.0;
        
        // Fórmula de Herón
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public String clasificarTriangulo() {
        if (!esValido()) return "Inválido";
        
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Clasificación: " + clasificarTriangulo());
        System.out.println("Válido: " + (esValido() ? "Sí" : "No"));
    }
    
    public double getLado1() { return lado1; }
    public double getLado2() { return lado2; }
    public double getLado3() { return lado3; }
}
```

</details>

---

## ✅ Solución Completa de Figuras 3D

<details>
<summary>Click para ver Figura3D.java, Esfera.java, Cilindro.java, Cubo.java</summary>

### Figura3D.java

```java
public class Figura3D extends FiguraGeometrica {
    protected final double PI = 3.14159265359;
    
    public Figura3D(String nombre, String color) {
        super(nombre, color);
    }
    
    public double calcularVolumen() {
        return 0.0;  // Debe ser sobrescrito
    }
    
    public double calcularSuperficie() {
        return 0.0;  // Debe ser sobrescrito
    }
    
    @Override
    public String obtenerTipo() {
        return "3D";
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Volumen: " + String.format("%.2f", calcularVolumen()) + " unidades³");
        System.out.println("Superficie: " + String.format("%.2f", calcularSuperficie()) + " unidades²");
    }
}
```

### Esfera.java

```java
public class Esfera extends Figura3D {
    private double radio;
    
    public Esfera(String color, double radio) {
        super("Esfera", color);
        this.radio = radio;
    }
    
    @Override
    public double calcularVolumen() {
        return (4.0 / 3.0) * PI * Math.pow(radio, 3);
    }
    
    @Override
    public double calcularSuperficie() {
        return 4 * PI * radio * radio;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Radio: " + radio);
    }
    
    public double getRadio() { return radio; }
}
```

### Cilindro.java

```java
public class Cilindro extends Figura3D {
    private double radio;
    private double altura;
    
    public Cilindro(String color, double radio, double altura) {
        super("Cilindro", color);
        this.radio = radio;
        this.altura = altura;
    }
    
    @Override
    public double calcularVolumen() {
        return PI * radio * radio * altura;
    }
    
    @Override
    public double calcularSuperficie() {
        return 2 * PI * radio * (radio + altura);
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Radio: " + radio);
        System.out.println("Altura: " + altura);
    }
    
    public double getRadio() { return radio; }
    public double getAltura() { return altura; }
}
```

### Cubo.java

```java
public class Cubo extends Figura3D {
    private double lado;
    
    public Cubo(String color, double lado) {
        super("Cubo", color);
        this.lado = lado;
    }
    
    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
    
    @Override
    public double calcularSuperficie() {
        return 6 * lado * lado;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Lado: " + lado);
    }
    
    public double getLado() { return lado; }
}
```

</details>

---

## 🔧 Clase GestorFiguras (Opcional pero Recomendado)

<details>
<summary>Click para ver GestorFiguras.java</summary>

```java
public class GestorFiguras {
    private FiguraGeometrica[] figuras;
    private int cantidad;
    
    public GestorFiguras(int capacidad) {
        figuras = new FiguraGeometrica[capacidad];
        cantidad = 0;
    }
    
    public void agregarFigura(FiguraGeometrica figura) {
        if (cantidad < figuras.length) {
            figuras[cantidad++] = figura;
            System.out.println("✓ Figura agregada: " + figura);
        } else {
            System.out.println("✗ Capacidad máxima alcanzada");
        }
    }
    
    public void mostrarTodasLasFiguras() {
        System.out.println("\n=== LISTADO DE FIGURAS ===");
        for (int i = 0; i < cantidad; i++) {
            figuras[i].mostrarInfo();
            System.out.println();
        }
    }
    
    public double calcularAreaTotal2D() {
        double total = 0.0;
        for (int i = 0; i < cantidad; i++) {
            if (figuras[i] instanceof Figura2D) {
                total += ((Figura2D) figuras[i]).calcularArea();
            }
        }
        return total;
    }
    
    public double calcularVolumenTotal3D() {
        double total = 0.0;
        for (int i = 0; i < cantidad; i++) {
            if (figuras[i] instanceof Figura3D) {
                total += ((Figura3D) figuras[i]).calcularVolumen();
            }
        }
        return total;
    }
    
    public void generarReporte() {
        System.out.println("\n=== REPORTE GENERAL ===");
        System.out.println("Total de figuras: " + cantidad);
        
        int count2D = 0, count3D = 0;
        for (int i = 0; i < cantidad; i++) {
            if (figuras[i] instanceof Figura2D) count2D++;
            else if (figuras[i] instanceof Figura3D) count3D++;
        }
        
        System.out.println("Figuras 2D: " + count2D);
        System.out.println("Figuras 3D: " + count3D);
        System.out.println("Área total 2D: " + String.format("%.2f", calcularAreaTotal2D()));
        System.out.println("Volumen total 3D: " + String.format("%.2f", calcularVolumenTotal3D()));
    }
}
```

</details>

---

## 🎮 Main.java Completo

<details>
<summary>Click para ver Main.java con demostración completa</summary>

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║  SISTEMA DE FIGURAS GEOMÉTRICAS      ║");
        System.out.println("╚═══════════════════════════════════════╝\n");
        
        // Crear gestor
        GestorFiguras gestor = new GestorFiguras(10);
        
        // Crear figuras 2D
        System.out.println(">>> Creando figuras 2D...\n");
        Circulo c1 = new Circulo("Rojo", 5.0);
        Rectangulo r1 = new Rectangulo("Azul", 4.0, 6.0);
        Rectangulo r2 = new Rectangulo("Verde", 5.0, 5.0);  // Cuadrado
        Triangulo t1 = new Triangulo("Amarillo", 3.0, 4.0, 5.0);  // Triángulo rectángulo
        
        gestor.agregarFigura(c1);
        gestor.agregarFigura(r1);
        gestor.agregarFigura(r2);
        gestor.agregarFigura(t1);
        
        // Crear figuras 3D
        System.out.println("\n>>> Creando figuras 3D...\n");
        Esfera e1 = new Esfera("Morado", 3.0);
        Cilindro cil1 = new Cilindro("Naranja", 2.0, 7.0);
        Cubo cu1 = new Cubo("Gris", 4.0);
        
        gestor.agregarFigura(e1);
        gestor.agregarFigura(cil1);
        gestor.agregarFigura(cu1);
        
        // Mostrar todas las figuras
        gestor.mostrarTodasLasFiguras();
        
        // Pruebas específicas
        System.out.println("\n>>> Pruebas específicas...\n");
        
        System.out.println("-- Escalar círculo --");
        c1.mostrarInfo();
        c1.escalar(2.0);
        c1.mostrarInfo();
        
        System.out.println("\n-- Verificar si es cuadrado --");
        System.out.println("R1 es cuadrado: " + r1.esCuadrado());
        System.out.println("R2 es cuadrado: " + r2.esCuadrado());
        
        System.out.println("\n-- Clasificar triángulo --");
        System.out.println("T1 es: " + t1.clasificarTriangulo());
        
        // Polimorfismo
        System.out.println("\n>>> Demostración de polimorfismo...\n");
        FiguraGeometrica[] arrayPoli = {c1, r1, e1, cu1};
        for (FiguraGeometrica fig : arrayPoli) {
            System.out.println(fig.toString() + " - Tipo: " + fig.obtenerTipo());
        }
        
        // Reporte final
        gestor.generarReporte();
        
        System.out.println("\n>>> Total de figuras creadas: " + FiguraGeometrica.getTotalFiguras());
    }
}
```

</details>

---

## 🧪 Casos de Prueba

### Test 1: IDs Únicos
```java
Circulo c1 = new Circulo("Rojo", 5);
Circulo c2 = new Circulo("Azul", 3);
// c1.getId() != c2.getId()
```

### Test 2: Cálculos Correctos
```java
Circulo c = new Circulo("Rojo", 2.0);
// Área debe ser aproximadamente 12.57
// Perímetro debe ser aproximadamente 12.57
```

### Test 3: Herencia Multinivel
```java
Circulo c = new Circulo("Rojo", 5);
// c ES UN Figura2D
// c ES UN FiguraGeometrica
// c.obtenerTipo() retorna "2D"
```

---

## ✅ Criterios de Evaluación

| Criterio | Puntos | Descripción |
|----------|--------|-------------|
| **Jerarquía completa** | 20 | Todas las 9 clases implementadas correctamente |
| **Cálculos matemáticos** | 25 | Áreas, perímetros, volúmenes correctos |
| **Sobrescritura** | 20 | Uso apropiado de @Override y super |
| **Encapsulación** | 10 | Modificadores de acceso apropiados |
| **Polimorfismo** | 10 | Arrays polimórficos funcionan |
| **GestorFiguras** | 10 | Clase auxiliar completa (opcional) |
| **Main demostrativo** | 5 | Prueba todas las funcionalidades |

**Total:** 100 puntos

---

## 🚀 Desafíos Extra

### Nivel 1: Método comparar()
```java
public boolean mayorQue(FiguraGeometrica otra) {
    if (this instanceof Figura2D && otra instanceof Figura2D) {
        return this.calcularArea() > otra.calcularArea();
    }
    // Similar para 3D
}
```

### Nivel 2: Excepciones personalizadas
```java
class FiguraInvalidaException extends Exception {
    public FiguraInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// En Triangulo:
if (!esValido()) {
    throw new FiguraInvalidaException("Los lados no forman un triángulo válido");
}
```

### Nivel 3: Interfaz Dibujable
```java
interface Dibujable {
    void dibujar();
}

class Circulo extends Figura2D implements Dibujable {
    public void dibujar() {
        // Dibujo ASCII del círculo
    }
}
```

---

## 💡 Conceptos Aplicados

Este proyecto integra:

✅ **Herencia multinivel** (3 niveles)  
✅ **Herencia multirrama** (múltiples hijos)  
✅ **Sobrescritura de métodos**  
✅ **Polimorfismo**  
✅ **Encapsulación**  
✅ **Atributos static**  
✅ **Uso de super()**  
✅ **Métodos abstractos simulados**  
✅ **Arrays polimórficos**  
✅ **Casting de objetos (instanceof)**  

---

## 📚 Recursos Relacionados

- **Teoría:** Todos los archivos en `/1-teoria/`
- **Referencia:** `/3-recursos/cheatsheet-herencia.md`
- **Todos los ejercicios anteriores** (1-5)

---

## 🎯 Reflexión Final

### Preguntas de Cierre
1. ¿Cómo ayuda la herencia a evitar código duplicado en este proyecto?
2. ¿Por qué es útil tener una clase base `FiguraGeometrica`?
3. ¿Qué ventajas tiene usar polimorfismo en el `GestorFiguras`?
4. ¿Cómo extenderías este sistema para agregar más figuras?

---

**¡FELICITACIONES!** 🎉

Has completado el proyecto integrador de la Semana 4. Este ejercicio demuestra tu dominio completo de los conceptos de **herencia** en Java.

**Próximos pasos:**
- Revisa el código de tus compañeros
- Implementa los desafíos extra
- Prepárate para **Polimorfismo (Semana 5)**

---

**Tiempo estimado de desarrollo:** 90-120 minutos  
**Complejidad:** ⭐⭐⭐⭐⭐  
**Valor educativo:** ⭐⭐⭐⭐⭐
