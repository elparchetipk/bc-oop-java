# Práctica 02 - Sobrescritura de Métodos (Overriding)

## 🎯 Objetivo
Implementar sobrescritura de métodos correctamente usando @Override, comprendiendo el binding dinámico y el uso de super.

**Duración estimada:** 60 minutos

---

## 📚 Conceptos Previos

### ¿Qué es la Sobrescritura?
Redefinir un método heredado en una subclase para cambiar su comportamiento.

### Reglas de Sobrescritura
1. ✅ Requiere herencia (extends)
2. ✅ Mismo nombre de método
3. ✅ Mismos parámetros (tipo, orden, cantidad)
4. ✅ Mismo tipo de retorno (o covariante)
5. ✅ Acceso igual o menos restrictivo
6. ✅ Usar anotación @Override (recomendado)

---

## 🛠️ Ejercicio 1: Sobrescritura Básica con Animales (20 min)

### Paso 1: Crear la superclase

```java
/**
 * Clase base Animal
 * @author Tu Nombre
 */
public class Animal {
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * Método que será sobrescrito
     */
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico");
    }
    
    public void mostrarInfo() {
        System.out.println("Animal: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
    
    public void dormir() {
        System.out.println(nombre + " está durmiendo...");
    }
}
```

### Paso 2: Crear subclase Perro

```java
/**
 * Subclase Perro que sobrescribe métodos
 */
public class Perro extends Animal {
    private String raza;
    
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);  // Llamar constructor de Animal
        this.raza = raza;
    }
    
    /**
     * Sobrescribe hacerSonido()
     */
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra: ¡Guau guau!");
    }
    
    /**
     * Sobrescribe mostrarInfo() y extiende funcionalidad
     */
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llamar al método de la superclase
        System.out.println("Raza: " + raza);
        System.out.println("Tipo: Perro");
    }
    
    // dormir() NO se sobrescribe, se hereda tal cual
}
```

### Paso 3: Crear subclase Gato

```java
/**
 * Subclase Gato
 */
public class Gato extends Animal {
    private boolean esInterior;
    
    public Gato(String nombre, int edad, boolean esInterior) {
        super(nombre, edad);
        this.esInterior = esInterior;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maúlla: ¡Miau miau!");
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("¿Interior?: " + (esInterior ? "Sí" : "No"));
        System.out.println("Tipo: Gato");
    }
    
    @Override
    public void dormir() {
        System.out.println(nombre + " duerme 16 horas al día 😴");
    }
}
```

### Paso 4: Probar polimorfismo dinámico

```java
public class TestAnimales {
    public static void main(String[] args) {
        // Polimorfismo: variable de Animal, objetos de subclases
        Animal animal1 = new Perro("Max", 3, "Labrador");
        Animal animal2 = new Gato("Luna", 2, true);
        Animal animal3 = new Animal("Genérico", 5);
        
        System.out.println("=== POLIMORFISMO EN ACCIÓN ===\n");
        
        // Cada uno ejecuta su versión de hacerSonido()
        animal1.hacerSonido();  // Ejecuta de Perro
        animal2.hacerSonido();  // Ejecuta de Gato
        animal3.hacerSonido();  // Ejecuta de Animal
        
        System.out.println("\n=== INFORMACIÓN DETALLADA ===\n");
        
        animal1.mostrarInfo();
        System.out.println();
        
        animal2.mostrarInfo();
        System.out.println();
        
        System.out.println("=== DORMIR ===\n");
        
        animal1.dormir();  // Heredado de Animal
        animal2.dormir();  // Sobrescrito en Gato
    }
}
```

**Salida esperada:**
```
=== POLIMORFISMO EN ACCIÓN ===

Max ladra: ¡Guau guau!
Luna maúlla: ¡Miau miau!
Genérico hace un sonido genérico

=== INFORMACIÓN DETALLADA ===

Animal: Max
Edad: 3 años
Raza: Labrador
Tipo: Perro

Animal: Luna
Edad: 2 años
¿Interior?: Sí
Tipo: Gato

=== DORMIR ===

Max está durmiendo...
Luna duerme 16 horas al día 😴
```

---

## 🛠️ Ejercicio 2: Sobrescritura en Tu Dominio (20 min)

### Aplicar a tu proyecto

Usando tu jerarquía de la semana-04, sobrescribe métodos importantes.

**Ejemplo con Curso:**

```java
// Superclase
public class Curso {
    protected String codigo;
    protected String nombre;
    protected int duracionHoras;
    protected double costoBase;
    
    public double calcularCosto() {
        return costoBase * duracionHoras;
    }
    
    public void mostrarInformacion() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("  INFORMACIÓN DEL CURSO");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Costo: $" + calcularCosto());
    }
}

// Subclase
public class CursoVirtual extends Curso {
    private String plataforma;
    private String enlaceAcceso;
    
    @Override
    public double calcularCosto() {
        // Descuento del 15% por ser virtual
        double costoBase = super.calcularCosto();
        return costoBase * 0.85;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Info común
        System.out.println("--- Información Virtual ---");
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Enlace: " + enlaceAcceso);
    }
}

// Otra subclase
public class CursoPresencial extends Curso {
    private String salon;
    private String sede;
    private double recargoInstalaciones = 50000;
    
    @Override
    public double calcularCosto() {
        return super.calcularCosto() + recargoInstalaciones;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("--- Información Presencial ---");
        System.out.println("Sede: " + sede);
        System.out.println("Salón: " + salon);
    }
}
```

### 📝 Tarea: Implementa en tu dominio

Sobrescribe **mínimo 2 métodos** en cada subclase:
1. Un método de cálculo (precio, costo, puntaje, etc.)
2. El método mostrarInformacion()

---

## 🛠️ Ejercicio 3: Uso Correcto de super (20 min)

### Concepto: Cuándo usar super

```java
public class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public double calcularSalario() {
        return salarioBase;
    }
    
    public String generarReporte() {
        return "Empleado: " + nombre + "\nSalario: $" + calcularSalario();
    }
}

public class EmpleadoConBonos extends Empleado {
    private double bonoDesempeno;
    private double bonoAntiguedad;
    
    @Override
    public double calcularSalario() {
        // Opción 1: Usar super para extender
        double salarioBase = super.calcularSalario();
        return salarioBase + bonoDesempeno + bonoAntiguedad;
    }
    
    @Override
    public String generarReporte() {
        // Opción 2: Usar super para reutilizar
        String reporteBase = super.generarReporte();
        return reporteBase + 
               "\nBono Desempeño: $" + bonoDesempeno +
               "\nBono Antigüedad: $" + bonoAntiguedad +
               "\nSalario Total: $" + calcularSalario();
    }
}
```

### Ejemplo: Sin super vs Con super

```java
// ❌ SIN SUPER - Código duplicado
@Override
public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Puesto: " + puesto);  // Nuevo
}

// ✅ CON SUPER - Reutilización
@Override
public void mostrarInfo() {
    super.mostrarInfo();  // Muestra nombre y edad
    System.out.println("Puesto: " + puesto);  // Agrega nuevo
}
```

---

## ⚠️ Errores Comunes

### Error 1: Olvidar @Override

```java
// ❌ SIN @Override - Error no detectado
public class Gato extends Animal {
    public void hacersonido() {  // ⚠️ Nombre mal escrito (minúscula)
        System.out.println("Miau");
    }
}
// Esto crea un NUEVO método, no sobrescribe
```

```java
// ✅ CON @Override - Error detectado
public class Gato extends Animal {
    @Override
    public void hacersonido() {  // ❌ Error de compilación
        System.out.println("Miau");
    }
}
// El compilador avisa que no hay método para sobrescribir
```

---

### Error 2: Cambiar la Firma

```java
// ❌ INCORRECTO - Parámetros diferentes
public class Perro extends Animal {
    @Override
    public void hacerSonido(int volumen) {  // ERROR: diferentes parámetros
        System.out.println("Guau con volumen " + volumen);
    }
}
```

```java
// ✅ CORRECTO - Misma firma
public class Perro extends Animal {
    @Override
    public void hacerSonido() {  // OK: misma firma
        System.out.println("Guau guau");
    }
}
```

---

### Error 3: Acceso Más Restrictivo

```java
// En la superclase
public class Animal {
    public void comer() {
        System.out.println("Comiendo...");
    }
}

// ❌ INCORRECTO - Más restrictivo
public class Perro extends Animal {
    @Override
    private void comer() {  // ERROR: public → private no permitido
        System.out.println("Perro comiendo");
    }
}

// ✅ CORRECTO - Mismo acceso o menos restrictivo
public class Perro extends Animal {
    @Override
    public void comer() {  // OK: public → public
        System.out.println("Perro comiendo");
    }
}
```

---

## 💡 Casos Especiales

### Covarianza en Tipo de Retorno

```java
public class Animal {
    public Animal clonar() {
        return new Animal();
    }
}

public class Perro extends Animal {
    @Override
    public Perro clonar() {  // ✅ OK: Perro es subclase de Animal
        return new Perro();
    }
}
```

### Métodos final (No Sobrescribibles)

```java
public class Animal {
    public final void respirar() {
        System.out.println("Respirando...");
    }
}

public class Perro extends Animal {
    @Override
    public void respirar() {  // ❌ ERROR: No se puede sobrescribir final
        System.out.println("Perro respirando");
    }
}
```

---

## ✅ Checklist de Verificación

- [ ] Uso @Override en todos los métodos sobrescritos
- [ ] La firma del método es exactamente igual
- [ ] El acceso es igual o menos restrictivo
- [ ] Uso super cuando necesito extender funcionalidad
- [ ] He probado el polimorfismo con variables de superclase
- [ ] Documenté por qué sobrescribo cada método

---

## 🎯 Desafío Extra

Crea una jerarquía de figuras geométricas:

```java
abstract class Figura {
    protected String color;
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public void mostrarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

class Circulo extends Figura {
    private double radio;
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;
    
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}
```

---

## 📝 Reflexión

1. ¿Cuál es la diferencia entre sobrecarga y sobrescritura?
2. ¿Por qué es importante usar @Override?
3. ¿Cuándo usarías super en un método sobrescrito?
4. ¿Cómo ayuda la sobrescritura al polimorfismo?

---

## ➡️ Próximo Paso

Continúa con **Práctica 03 - equals() y hashCode()** para implementar correctamente estos métodos cruciales.

---

**Bootcamp POO Java - SENA | Semana 05 - Práctica 02**
