# Ejercicio 1: Comparación Con/Sin Herencia

## 📋 Información del Ejercicio

- **Dificultad:** ⭐ Básico
- **Duración estimada:** 20 minutos
- **Objetivo:** Comprender la ventaja de usar herencia vs duplicación de código

---

## 🎯 Objetivos de Aprendizaje

Al completar este ejercicio, podrás:

1. Identificar duplicación de código
2. Aplicar herencia para eliminar duplicación
3. Usar la palabra clave `extends`
4. Comprender la reutilización de código

---

## 📝 Enunciado

Tienes dos clases: `Perro` y `Gato`, ambas comparten atributos y métodos comunes (nombre, edad, comer, dormir), pero también tienen métodos específicos (ladrar, maullar).

**Parte 1:** Implementa las clases SIN herencia (con código duplicado)  
**Parte 2:** Refactoriza usando herencia con una clase `Animal`  
**Parte 3:** Compara ambas implementaciones

---

## 📂 Estructura del Ejercicio

```
ejercicio-01-comparacion-herencia/
├── README.md (este archivo)
├── SinHerencia.java (Parte 1)
├── ConHerencia.java (Parte 2)
└── Main.java (Programa de prueba)
```

---

## 🔨 Parte 1: SIN Herencia (Código Duplicado)

### Instrucciones

Crea un archivo `SinHerencia.java` con las siguientes clases:

**Clase Perro:**
- Atributos: `nombre` (String), `edad` (int)
- Constructor que inicialice los atributos
- Métodos: `comer()`, `dormir()`, `ladrar()`

**Clase Gato:**
- Atributos: `nombre` (String), `edad` (int) - ¡DUPLICADO!
- Constructor que inicialice los atributos - ¡DUPLICADO!
- Métodos: `comer()`, `dormir()` - ¡DUPLICADO!, `maullar()`

### Código Plantilla

```java
// SinHerencia.java

class Perro {
    // TODO: Implementar atributos
    
    // TODO: Implementar constructor
    
    // TODO: Implementar método comer()
    
    // TODO: Implementar método dormir()
    
    // TODO: Implementar método ladrar()
}

class Gato {
    // TODO: Implementar atributos (los mismos que Perro)
    
    // TODO: Implementar constructor (igual que Perro)
    
    // TODO: Implementar método comer() (igual que Perro)
    
    // TODO: Implementar método dormir() (igual que Perro)
    
    // TODO: Implementar método maullar()
}
```

---

## 🔨 Parte 2: CON Herencia (Sin Duplicación)

### Instrucciones

Crea un archivo `ConHerencia.java` con las siguientes clases:

**Clase Animal (Padre):**
- Atributos: `nombre`, `edad`
- Constructor
- Métodos: `comer()`, `dormir()`

**Clase Perro (Hija):**
- Extiende de `Animal`
- Constructor que use `super()`
- Método: `ladrar()`

**Clase Gato (Hija):**
- Extiende de `Animal`
- Constructor que use `super()`
- Método: `maullar()`

### Código Plantilla

```java
// ConHerencia.java

class Animal {
    // TODO: Implementar atributos protegidos
    
    // TODO: Implementar constructor
    
    // TODO: Implementar método comer()
    
    // TODO: Implementar método dormir()
}

class Perro extends Animal {
    // TODO: Implementar constructor con super()
    
    // TODO: Implementar método ladrar()
}

class Gato extends Animal {
    // TODO: Implementar constructor con super()
    
    // TODO: Implementar método maullar()
}
```

---

## 🧪 Parte 3: Programa de Prueba

### Instrucciones

Crea un archivo `Main.java` que:

1. Cree objetos de `Perro` y `Gato` (versión sin herencia)
2. Cree objetos de `Perro` y `Gato` (versión con herencia)
3. Pruebe todos los métodos
4. Compare ambas implementaciones

### Código Plantilla

```java
// Main.java

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIN HERENCIA ===");
        // TODO: Crear y probar objetos sin herencia
        
        System.out.println("\n=== CON HERENCIA ===");
        // TODO: Crear y probar objetos con herencia
        
        System.out.println("\n=== COMPARACIÓN ===");
        // TODO: Imprimir observaciones
    }
}
```

---

## ✅ Solución Propuesta

<details>
<summary>Click para ver la solución (intenta resolverlo primero)</summary>

### SinHerencia.java

```java
// SinHerencia.java

class PerroSinHerencia {
    private String nombre;
    private int edad;
    
    public PerroSinHerencia(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
    
    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
    
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
    
    public String getNombre() {
        return nombre;
    }
}

class GatoSinHerencia {
    private String nombre;  // ❌ DUPLICADO
    private int edad;       // ❌ DUPLICADO
    
    public GatoSinHerencia(String nombre, int edad) {  // ❌ DUPLICADO
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void comer() {  // ❌ DUPLICADO
        System.out.println(nombre + " está comiendo");
    }
    
    public void dormir() {  // ❌ DUPLICADO
        System.out.println(nombre + " está durmiendo");
    }
    
    public void maullar() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
    
    public String getNombre() {  // ❌ DUPLICADO
        return nombre;
    }
}
```

### ConHerencia.java

```java
// ConHerencia.java

class Animal {
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
    
    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
    
    public String getNombre() {
        return nombre;
    }
}

class PerroConHerencia extends Animal {
    public PerroConHerencia(String nombre, int edad) {
        super(nombre, edad);  // ✅ Llama al constructor del padre
    }
    
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}

class GatoConHerencia extends Animal {
    public GatoConHerencia(String nombre, int edad) {
        super(nombre, edad);  // ✅ Llama al constructor del padre
    }
    
    public void maullar() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
}
```

### Main.java

```java
// Main.java

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIN HERENCIA ===");
        PerroSinHerencia perro1 = new PerroSinHerencia("Max", 3);
        GatoSinHerencia gato1 = new GatoSinHerencia("Michi", 2);
        
        perro1.comer();
        perro1.dormir();
        perro1.ladrar();
        
        gato1.comer();
        gato1.dormir();
        gato1.maullar();
        
        System.out.println("\n=== CON HERENCIA ===");
        PerroConHerencia perro2 = new PerroConHerencia("Rex", 3);
        GatoConHerencia gato2 = new GatoConHerencia("Pelusa", 2);
        
        perro2.comer();
        perro2.dormir();
        perro2.ladrar();
        
        gato2.comer();
        gato2.dormir();
        gato2.maullar();
        
        System.out.println("\n=== COMPARACIÓN ===");
        System.out.println("SIN HERENCIA:");
        System.out.println("  - Código duplicado en Perro y Gato");
        System.out.println("  - Difícil de mantener");
        System.out.println("  - Cambios requieren modificar múltiples clases");
        System.out.println("\nCON HERENCIA:");
        System.out.println("  - Código común en la clase Animal");
        System.out.println("  - Fácil de mantener");
        System.out.println("  - Cambios en Animal afectan a todos los hijos");
        System.out.println("  - Menos líneas de código");
    }
}
```

### Salida Esperada

```
=== SIN HERENCIA ===
Max está comiendo
Max está durmiendo
Max dice: ¡Guau guau!
Michi está comiendo
Michi está durmiendo
Michi dice: ¡Miau miau!

=== CON HERENCIA ===
Rex está comiendo
Rex está durmiendo
Rex dice: ¡Guau guau!
Pelusa está comiendo
Pelusa está durmiendo
Pelusa dice: ¡Miau miau!

=== COMPARACIÓN ===
SIN HERENCIA:
  - Código duplicado en Perro y Gato
  - Difícil de mantener
  - Cambios requieren modificar múltiples clases

CON HERENCIA:
  - Código común en la clase Animal
  - Fácil de mantener
  - Cambios en Animal afectan a todos los hijos
  - Menos líneas de código
```

</details>

---

## 📊 Análisis de Resultados

### Comparación de Líneas de Código

| Aspecto | Sin Herencia | Con Herencia |
|---------|--------------|--------------|
| **Clases totales** | 2 | 3 |
| **Líneas duplicadas** | ~30 | 0 |
| **Mantenibilidad** | Baja | Alta |
| **Escalabilidad** | Baja | Alta |

### Preguntas de Reflexión

1. ¿Cuántas líneas de código evitaste duplicar?
2. Si ahora agregas un método `moverse()` a Animal, ¿cuántas clases tendrías que modificar en cada versión?
3. ¿Qué pasa si quieres agregar una clase `Pajaro`? ¿Cuál versión es más fácil de extender?

---

## ✅ Criterios de Evaluación

| Criterio | Puntos | Descripción |
|----------|--------|-------------|
| **Implementación sin herencia** | 20 | Clases Perro y Gato funcionan correctamente |
| **Implementación con herencia** | 30 | Clase Animal y herencia correcta |
| **Uso de super()** | 20 | Constructores llaman a super() |
| **Programa de prueba** | 15 | Main funciona y muestra resultados |
| **Análisis comparativo** | 15 | Comprende ventajas de herencia |

---

## 💡 Conceptos Clave Aprendidos

- ✅ Duplicación de código es mala práctica
- ✅ Herencia elimina duplicación
- ✅ Palabra clave `extends` establece herencia
- ✅ `super()` llama al constructor del padre
- ✅ `protected` permite acceso a subclases

---

## 🚀 Desafío Extra

Si terminas temprano:

1. Agrega una clase `Pajaro extends Animal` con método `volar()`
2. Agrega un método `hacerSonido()` abstracto en Animal
3. Crea un array de animales y recórrelo (polimorfismo preview)

---

**¡Éxito con el ejercicio!** 🎉
