# Ejercicio 2: Jerarquía de Animales

## 📋 Información del Ejercicio

- **Dificultad:** ⭐⭐ Básico-Intermedio
- **Duración estimada:** 30 minutos
- **Objetivo:** Crear una jerarquía simple Animal → Perro, Gato con atributos y métodos

---

## 🎯 Objetivos de Aprendizaje

Al completar este ejercicio, podrás:

1. Diseñar una clase base (`Animal`)
2. Crear múltiples subclases (`Perro`, `Gato`)
3. Usar `extends` correctamente
4. Implementar constructores con `super()`
5. Agregar métodos específicos por subclase

---

## 📝 Enunciado

Crea un sistema de animales con la siguiente jerarquía:

**Clase Animal (Padre):**
- Atributos: nombre (String), edad (int), sonido (String)
- Constructor que inicialice todos los atributos
- Métodos:
  - `comer()`: Imprime "{nombre} está comiendo"
  - `dormir()`: Imprime "{nombre} está durmiendo"
  - `hacerSonido()`: Imprime "{nombre} hace: {sonido}"
  - `mostrarInfo()`: Muestra toda la información del animal

**Clase Perro (Hijo):**
- Atributo adicional: raza (String)
- Constructor que use `super()` para inicializar atributos heredados
- Métodos específicos:
  - `ladrar()`: Imprime "¡Guau guau!"
  - `jugar()`: Imprime "{nombre} está jugando con la pelota"
  - `mostrarInfo()`: Sobrescribe para incluir la raza

**Clase Gato (Hijo):**
- Atributo adicional: colorPelaje (String)
- Constructor que use `super()`
- Métodos específicos:
  - `maullar()`: Imprime "¡Miau miau!"
  - `ronronear()`: Imprime "{nombre} está ronroneando"
  - `mostrarInfo()`: Sobrescribe para incluir el color

---

## 📂 Estructura de Archivos

```
ejercicio-02-jerarquia-animales/
├── README.md (este archivo)
├── Animal.java
├── Perro.java
├── Gato.java
└── Main.java
```

---

## 🔨 Implementación

### Paso 1: Clase Animal (Padre)

```java
// Animal.java

public class Animal {
    // TODO: Declarar atributos protected (nombre, edad, sonido)
    
    // TODO: Constructor que inicialice los tres atributos
    
    // TODO: Método comer()
    
    // TODO: Método dormir()
    
    // TODO: Método hacerSonido()
    
    // TODO: Método mostrarInfo()
    
    // Getters (opcional)
}
```

### Paso 2: Clase Perro (Hijo)

```java
// Perro.java

public class Perro extends Animal {
    // TODO: Declarar atributo privado raza
    
    // TODO: Constructor que reciba nombre, edad, sonido y raza
    //       Debe llamar a super(nombre, edad, sonido)
    
    // TODO: Método ladrar()
    
    // TODO: Método jugar()
    
    // TODO: Sobrescribir mostrarInfo() con @Override
    //       Debe llamar a super.mostrarInfo() y añadir la raza
}
```

### Paso 3: Clase Gato (Hijo)

```java
// Gato.java

public class Gato extends Animal {
    // TODO: Declarar atributo privado colorPelaje
    
    // TODO: Constructor que reciba nombre, edad, sonido y colorPelaje
    //       Debe llamar a super(nombre, edad, sonido)
    
    // TODO: Método maullar()
    
    // TODO: Método ronronear()
    
    // TODO: Sobrescribir mostrarInfo() con @Override
    //       Debe llamar a super.mostrarInfo() y añadir el color
}
```

### Paso 4: Programa Principal

```java
// Main.java

public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Perro
        
        // TODO: Crear un objeto Gato
        
        // TODO: Probar métodos heredados de Animal
        
        // TODO: Probar métodos específicos de cada clase
        
        // TODO: Mostrar información completa de cada animal
    }
}
```

---

## ✅ Solución Propuesta

<details>
<summary>Click para ver la solución (intenta resolverlo primero)</summary>

### Animal.java

```java
public class Animal {
    protected String nombre;
    protected int edad;
    protected String sonido;
    
    public Animal(String nombre, int edad, String sonido) {
        this.nombre = nombre;
        this.edad = edad;
        this.sonido = sonido;
    }
    
    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
    
    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " hace: " + sonido);
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Sonido: " + sonido);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
}
```

### Perro.java

```java
public class Perro extends Animal {
    private String raza;
    
    public Perro(String nombre, int edad, String sonido, String raza) {
        super(nombre, edad, sonido);  // Llama al constructor del padre
        this.raza = raza;
    }
    
    public void ladrar() {
        System.out.println("¡Guau guau!");
    }
    
    public void jugar() {
        System.out.println(nombre + " está jugando con la pelota");
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llama al método del padre
        System.out.println("Raza: " + raza);
    }
    
    public String getRaza() {
        return raza;
    }
}
```

### Gato.java

```java
public class Gato extends Animal {
    private String colorPelaje;
    
    public Gato(String nombre, int edad, String sonido, String colorPelaje) {
        super(nombre, edad, sonido);  // Llama al constructor del padre
        this.colorPelaje = colorPelaje;
    }
    
    public void maullar() {
        System.out.println("¡Miau miau!");
    }
    
    public void ronronear() {
        System.out.println(nombre + " está ronroneando");
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llama al método del padre
        System.out.println("Color de pelaje: " + colorPelaje);
    }
    
    public String getColorPelaje() {
        return colorPelaje;
    }
}
```

### Main.java

```java
public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Perro perro = new Perro("Max", 3, "Guau", "Labrador");
        Gato gato = new Gato("Michi", 2, "Miau", "Naranja");
        
        System.out.println("=== INFORMACIÓN DEL PERRO ===");
        perro.mostrarInfo();
        System.out.println("\n=== ACCIONES DEL PERRO ===");
        perro.comer();          // Heredado de Animal
        perro.dormir();         // Heredado de Animal
        perro.hacerSonido();    // Heredado de Animal
        perro.ladrar();         // Específico de Perro
        perro.jugar();          // Específico de Perro
        
        System.out.println("\n=== INFORMACIÓN DEL GATO ===");
        gato.mostrarInfo();
        System.out.println("\n=== ACCIONES DEL GATO ===");
        gato.comer();           // Heredado de Animal
        gato.dormir();          // Heredado de Animal
        gato.hacerSonido();     // Heredado de Animal
        gato.maullar();         // Específico de Gato
        gato.ronronear();       // Específico de Gato
    }
}
```

### Salida Esperada

```
=== INFORMACIÓN DEL PERRO ===
Nombre: Max
Edad: 3 años
Sonido: Guau
Raza: Labrador

=== ACCIONES DEL PERRO ===
Max está comiendo
Max está durmiendo
Max hace: Guau
¡Guau guau!
Max está jugando con la pelota

=== INFORMACIÓN DEL GATO ===
Nombre: Michi
Edad: 2 años
Sonido: Miau
Color de pelaje: Naranja

=== ACCIONES DEL GATO ===
Michi está comiendo
Michi está durmiendo
Michi hace: Miau
¡Miau miau!
Michi está ronroneando
```

</details>

---

## 🧪 Casos de Prueba

Verifica que tu implementación funcione correctamente:

### Test 1: Creación de Objetos
```java
Perro p = new Perro("Rex", 5, "Woof", "Pastor Alemán");
Gato g = new Gato("Luna", 1, "Meow", "Blanco");
// Deben crearse sin errores
```

### Test 2: Métodos Heredados
```java
p.comer();       // ✅ Debe funcionar
p.dormir();      // ✅ Debe funcionar
p.hacerSonido(); // ✅ Debe funcionar
```

### Test 3: Métodos Específicos
```java
p.ladrar();  // ✅ Debe funcionar
p.jugar();   // ✅ Debe funcionar
g.maullar(); // ✅ Debe funcionar
g.ronronear(); // ✅ Debe funcionar
```

### Test 4: Sobrescritura
```java
p.mostrarInfo(); // ✅ Debe mostrar info + raza
g.mostrarInfo(); // ✅ Debe mostrar info + color
```

---

## 📊 Diagrama de Clases

```
        ┌─────────────┐
        │   Animal    │
        ├─────────────┤
        │ - nombre    │
        │ - edad      │
        │ - sonido    │
        ├─────────────┤
        │ + comer()   │
        │ + dormir()  │
        │ + hacerSonido() │
        │ + mostrarInfo() │
        └──────┬──────┘
               │
       ┌───────┴───────┐
       │               │
┌──────▼──────┐ ┌─────▼──────┐
│    Perro    │ │    Gato    │
├─────────────┤ ├────────────┤
│ - raza      │ │ - colorPelaje │
├─────────────┤ ├────────────┤
│ + ladrar()  │ │ + maullar()│
│ + jugar()   │ │ + ronronear() │
│ + mostrarInfo() │ │ + mostrarInfo() │
└─────────────┘ └────────────┘
```

---

## ✅ Criterios de Evaluación

| Criterio | Puntos | Descripción |
|----------|--------|-------------|
| **Clase Animal** | 20 | Atributos y métodos correctos |
| **Clase Perro** | 25 | Extiende correctamente, usa super() |
| **Clase Gato** | 25 | Extiende correctamente, usa super() |
| **Uso de @Override** | 10 | Anotación presente en métodos sobrescritos |
| **Modificadores de acceso** | 10 | `protected` en Animal, `private` en hijos |
| **Programa Main** | 10 | Prueba todas las funcionalidades |

**Total:** 100 puntos

---

## 💡 Conceptos Clave

### Aprendidos en este Ejercicio

1. **Herencia simple:** Una clase hereda de otra con `extends`
2. **Atributos protected:** Accesibles en subclases
3. **Constructor con super():** Inicializa atributos del padre
4. **Sobrescritura con @Override:** Extender funcionalidad del padre
5. **Métodos heredados:** Perro y Gato tienen todos los métodos de Animal

### Diferencias Importantes

| Aspecto | Animal | Perro/Gato |
|---------|--------|------------|
| **Atributos** | `protected` | `private` |
| **Constructor** | Normal | Usa `super()` |
| **Métodos** | Comunes a todos | Específicos |

---

## 🚀 Desafíos Extra

### Nivel 1: Agregar más animales
Crea una clase `Pajaro extends Animal` con:
- Atributo: `envergaduraAlas` (double)
- Métodos: `volar()`, `cantar()`

### Nivel 2: Validaciones
Agrega validaciones en los constructores:
- Edad debe ser positiva
- Nombre no puede estar vacío
- Lanzar excepciones si no se cumplen

### Nivel 3: Array de Animales
```java
Animal[] animales = new Animal[3];
animales[0] = new Perro("Max", 3, "Guau", "Labrador");
animales[1] = new Gato("Michi", 2, "Miau", "Gris");
animales[2] = new Pajaro("Tweety", 1, "Pío", 20.5);

for (Animal animal : animales) {
    animal.mostrarInfo();
    animal.hacerSonido();
}
```

---

## 🔍 Preguntas de Reflexión

1. ¿Por qué usamos `protected` en los atributos de `Animal`?
2. ¿Qué pasa si no llamamos a `super()` en el constructor de `Perro`?
3. ¿Por qué es útil sobrescribir `mostrarInfo()` en las subclases?
4. ¿Podríamos tener un método `ladrar()` en `Animal`? ¿Por qué sí o no?

---

## 📝 Notas Importantes

### ⚠️ Errores Comunes

1. **Olvidar `super()` en constructor**
   ```java
   // ❌ Error
   public Perro(String nombre, int edad, String sonido, String raza) {
       this.raza = raza;  // Falta super()
   }
   ```

2. **No usar `@Override`**
   ```java
   // ⚠️ Sin protección
   public void mostrarInfo() { }
   
   // ✅ Con protección
   @Override
   public void mostrarInfo() { }
   ```

3. **Acceso incorrecto**
   ```java
   // En Perro:
   System.out.println(nombre);  // ✅ protected permite acceso
   System.out.println(raza);    // ✅ private pero en la misma clase
   ```

---

## 📚 Recursos Relacionados

- **Teoría:** `/1-teoria/02-palabra-extends.md`
- **Teoría:** `/1-teoria/04-palabra-super.md`
- **Referencia:** `/3-recursos/cheatsheet-herencia.md`

---

**¡Éxito con el ejercicio!** 🐕🐈

Recuerda: La herencia te permite crear familias de clases relacionadas donde el código común se escribe una sola vez.
