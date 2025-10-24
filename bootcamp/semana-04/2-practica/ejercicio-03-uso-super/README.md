# Ejercicio 3: Uso Avanzado de `super`

## 📋 Información del Ejercicio

- **Dificultad:** ⭐⭐ Intermedio
- **Duración estimada:** 35 minutos
- **Objetivo:** Dominar el uso de `super()`, `super.metodo()` y `super.atributo`

---

## 🎯 Objetivos de Aprendizaje

Al completar este ejercicio, podrás:

1. Usar `super()` para llamar constructores del padre
2. Usar `super.metodo()` para llamar métodos sobrescritos
3. Entender cuándo y por qué usar `super`
4. Practicar la sobrescritura consciente de métodos
5. Aplicar herencia multinivel

---

## 📝 Enunciado

Crea un sistema de personas con herencia multinivel que demuestre todos los usos de `super`:

**Jerarquía:**
```
Persona → Empleado → Gerente
```

### Clase Persona (Abuelo)
- Atributos: nombre (String), edad (int)
- Constructor con parámetros
- Métodos:
  - `presentarse()`: "Hola, soy {nombre} y tengo {edad} años"
  - `trabajar()`: "{nombre} está realizando una tarea"

### Clase Empleado (Padre)
- Atributos adicionales: salario (double), departamento (String)
- Constructor que use `super()`
- Métodos:
  - `presentarse()`: Llama a `super.presentarse()` y agrega: "Trabajo en {departamento}"
  - `trabajar()`: Llama a `super.trabajar()` y agrega: "con un salario de ${salario}"
  - `recibirPago()`: "{nombre} ha recibido ${salario}"

### Clase Gerente (Hijo)
- Atributos adicionales: bono (double), equipoACargo (int)
- Constructor que use `super()`
- Métodos:
  - `presentarse()`: Llama a `super.presentarse()` y agrega: "Dirijo un equipo de {equipoACargo} personas"
  - `trabajar()`: Llama a `super.trabajar()` y agrega: "y gestiono {equipoACargo} empleados"
  - `recibirPago()`: Sobrescribe para incluir el bono
  - `dirigirReunion()`: "{nombre} está dirigiendo una reunión"

---

## 📂 Estructura de Archivos

```
ejercicio-03-uso-super/
├── README.md (este archivo)
├── Persona.java
├── Empleado.java
├── Gerente.java
└── Main.java
```

---

## 🔨 Plantilla de Implementación

### Persona.java

```java
public class Persona {
    protected String nombre;
    protected int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("→ Constructor Persona ejecutado");
    }
    
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }
    
    public void trabajar() {
        System.out.print(nombre + " está realizando una tarea");
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
}
```

### Empleado.java

```java
public class Empleado extends Persona {
    // TODO: Declarar atributos protected salario y departamento
    
    // TODO: Constructor que reciba nombre, edad, salario y departamento
    //       Debe llamar a super(nombre, edad)
    //       Imprimir "→ Constructor Empleado ejecutado"
    
    // TODO: Sobrescribir presentarse()
    //       Llamar a super.presentarse()
    //       Agregar información del departamento
    
    // TODO: Sobrescribir trabajar()
    //       Llamar a super.trabajar()
    //       Agregar información del salario (sin salto de línea)
    
    // TODO: Método recibirPago()
    
    // Getters
}
```

### Gerente.java

```java
public class Gerente extends Empleado {
    // TODO: Declarar atributos privados bono y equipoACargo
    
    // TODO: Constructor que reciba todos los parámetros necesarios
    //       Debe llamar a super() con los parámetros correspondientes
    //       Imprimir "→ Constructor Gerente ejecutado"
    
    // TODO: Sobrescribir presentarse()
    //       Llamar a super.presentarse()
    //       Agregar información del equipo
    
    // TODO: Sobrescribir trabajar()
    //       Llamar a super.trabajar()
    //       Agregar información de gestión
    
    // TODO: Sobrescribir recibirPago()
    //       Calcular salario + bono
    //       Mostrar desglose
    
    // TODO: Método dirigirReunion()
    
    // Getters
}
```

### Main.java

```java
public class Main {
    public static void main(String[] args) {
        // TODO: Crear un objeto Persona
        // TODO: Crear un objeto Empleado
        // TODO: Crear un objeto Gerente
        
        // TODO: Probar presentarse() de cada uno
        // TODO: Probar trabajar() de cada uno
        // TODO: Probar recibirPago() donde aplique
    }
}
```

---

## ✅ Solución Completa

<details>
<summary>Click para ver la solución (intenta resolverlo primero)</summary>

### Empleado.java

```java
public class Empleado extends Persona {
    protected double salario;
    protected String departamento;
    
    public Empleado(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad);  // Llama al constructor de Persona
        this.salario = salario;
        this.departamento = departamento;
        System.out.println("→ Constructor Empleado ejecutado");
    }
    
    @Override
    public void presentarse() {
        super.presentarse();  // Llama al método de Persona
        System.out.println("Trabajo en " + departamento);
    }
    
    @Override
    public void trabajar() {
        super.trabajar();  // Llama al método de Persona
        System.out.println(" con un salario de $" + salario);
    }
    
    public void recibirPago() {
        System.out.println(nombre + " ha recibido $" + salario);
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getDepartamento() {
        return departamento;
    }
}
```

### Gerente.java

```java
public class Gerente extends Empleado {
    private double bono;
    private int equipoACargo;
    
    public Gerente(String nombre, int edad, double salario, String departamento, 
                   double bono, int equipoACargo) {
        super(nombre, edad, salario, departamento);  // Llama al constructor de Empleado
        this.bono = bono;
        this.equipoACargo = equipoACargo;
        System.out.println("→ Constructor Gerente ejecutado");
    }
    
    @Override
    public void presentarse() {
        super.presentarse();  // Llama al método de Empleado (que llama al de Persona)
        System.out.println("Dirijo un equipo de " + equipoACargo + " personas");
    }
    
    @Override
    public void trabajar() {
        super.trabajar();  // Llama al método de Empleado
        System.out.println("y gestiono " + equipoACargo + " empleados");
    }
    
    @Override
    public void recibirPago() {
        double pagoTotal = salario + bono;
        System.out.println(nombre + " ha recibido:");
        System.out.println("  Salario base: $" + salario);
        System.out.println("  Bono:         $" + bono);
        System.out.println("  Total:        $" + pagoTotal);
    }
    
    public void dirigirReunion() {
        System.out.println(nombre + " está dirigiendo una reunión");
    }
    
    public double getBono() {
        return bono;
    }
    
    public int getEquipoACargo() {
        return equipoACargo;
    }
}
```

### Main.java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== CREANDO OBJETOS ===\n");
        
        System.out.println("1. Creando Persona:");
        Persona persona = new Persona("Ana", 25);
        
        System.out.println("\n2. Creando Empleado:");
        Empleado empleado = new Empleado("Carlos", 30, 3000.0, "IT");
        
        System.out.println("\n3. Creando Gerente:");
        Gerente gerente = new Gerente("María", 40, 5000.0, "Ventas", 1500.0, 10);
        
        // Presentaciones
        System.out.println("\n=== PRESENTACIONES ===\n");
        
        System.out.println("Persona:");
        persona.presentarse();
        
        System.out.println("\nEmpleado:");
        empleado.presentarse();
        
        System.out.println("\nGerente:");
        gerente.presentarse();
        
        // Trabajando
        System.out.println("\n=== TRABAJANDO ===\n");
        
        System.out.println("Persona:");
        persona.trabajar();
        System.out.println();
        
        System.out.println("\nEmpleado:");
        empleado.trabajar();
        
        System.out.println("\nGerente:");
        gerente.trabajar();
        
        // Recibiendo pago
        System.out.println("\n=== RECIBIENDO PAGO ===\n");
        
        empleado.recibirPago();
        System.out.println();
        gerente.recibirPago();
        
        // Método específico de Gerente
        System.out.println("\n=== ACCIONES ESPECÍFICAS ===\n");
        gerente.dirigirReunion();
    }
}
```

### Salida Esperada

```
=== CREANDO OBJETOS ===

1. Creando Persona:
→ Constructor Persona ejecutado

2. Creando Empleado:
→ Constructor Persona ejecutado
→ Constructor Empleado ejecutado

3. Creando Gerente:
→ Constructor Persona ejecutado
→ Constructor Empleado ejecutado
→ Constructor Gerente ejecutado

=== PRESENTACIONES ===

Persona:
Hola, soy Ana y tengo 25 años

Empleado:
Hola, soy Carlos y tengo 30 años
Trabajo en IT

Gerente:
Hola, soy María y tengo 40 años
Trabajo en Ventas
Dirijo un equipo de 10 personas

=== TRABAJANDO ===

Persona:
Ana está realizando una tarea

Empleado:
Carlos está realizando una tarea con un salario de $3000.0

Gerente:
María está realizando una tarea con un salario de $5000.0
y gestiono 10 empleados

=== RECIBIENDO PAGO ===

Carlos ha recibido $3000.0

María ha recibido:
  Salario base: $5000.0
  Bono:         $1500.0
  Total:        $6500.0

=== ACCIONES ESPECÍFICAS ===

María está dirigiendo una reunión
```

</details>

---

## 🧪 Casos de Prueba

### Test 1: Orden de Constructores
```java
Gerente g = new Gerente("Luis", 45, 6000, "TI", 2000, 15);
// Debe imprimir:
// → Constructor Persona ejecutado
// → Constructor Empleado ejecutado
// → Constructor Gerente ejecutado
```

### Test 2: Cadena de Llamadas super.presentarse()
```java
gerente.presentarse();
// Debe mostrar información de los 3 niveles:
// - Datos de Persona (nombre, edad)
// - Datos de Empleado (departamento)
// - Datos de Gerente (equipo)
```

### Test 3: Sobrescritura Correcta
```java
empleado.trabajar();  // Llama a super.trabajar() + salario
gerente.trabajar();   // Llama a super.trabajar() de Empleado + gestión
```

---

## 📊 Diagrama de Flujo de `super`

```
┌─────────────────────────────────────────┐
│   gerente.presentarse()                 │
└──────────────┬──────────────────────────┘
               │
               ▼
┌─────────────────────────────────────────┐
│   Gerente.presentarse() {               │
│     super.presentarse();  ───────┐      │
│     // info gerente              │      │
│   }                              │      │
└──────────────────────────────────┼──────┘
                                   │
                                   ▼
               ┌─────────────────────────────────────────┐
               │   Empleado.presentarse() {              │
               │     super.presentarse();  ───────┐      │
               │     // info empleado             │      │
               │   }                              │      │
               └──────────────────────────────────┼──────┘
                                                  │
                                                  ▼
                              ┌─────────────────────────────────────┐
                              │   Persona.presentarse() {           │
                              │     // info persona                 │
                              │   }                                 │
                              └─────────────────────────────────────┘
```

---

## 📚 Conceptos Clave Demostrados

### 1. `super()` en Constructores

```java
public Gerente(...) {
    super(...);  // DEBE ser la primera línea
    // inicialización propia
}
```

**Importante:** `super()` SIEMPRE debe ser la primera instrucción.

### 2. `super.metodo()` para Extender Funcionalidad

```java
@Override
public void presentarse() {
    super.presentarse();  // Reutiliza código del padre
    // Agrega funcionalidad adicional
}
```

### 3. Herencia Multinivel

```
Persona (abuelo)
   ↓
Empleado (padre) ← puede usar super para acceder a Persona
   ↓
Gerente (hijo) ← puede usar super para acceder a Empleado
```

---

## ✅ Criterios de Evaluación

| Criterio | Puntos | Descripción |
|----------|--------|-------------|
| **Constructores con super()** | 25 | Todos los constructores llaman correctamente a super() |
| **Sobrescritura con super.metodo()** | 30 | Métodos sobrescritos usan super para extender funcionalidad |
| **Orden de ejecución** | 15 | Se respeta el orden correcto de constructores |
| **Modificadores de acceso** | 10 | `protected` usado apropiadamente |
| **@Override correcto** | 10 | Todos los métodos sobrescritos tienen la anotación |
| **Programa Main completo** | 10 | Demuestra todas las funcionalidades |

**Total:** 100 puntos

---

## 🚀 Desafíos Extra

### Nivel 1: Agregar validaciones
```java
public Empleado(...) {
    super(nombre, edad);
    if (salario < 0) {
        throw new IllegalArgumentException("Salario no puede ser negativo");
    }
    this.salario = salario;
}
```

### Nivel 2: Método toString()
Sobrescribe `toString()` en cada clase usando `super.toString()`:
```java
@Override
public String toString() {
    return super.toString() + ", Departamento: " + departamento;
}
```

### Nivel 3: Herencia de 4 niveles
Agrega `GerenteRegional extends Gerente` con:
- Atributo: `region` (String)
- Método: `gestionarGerentes()`

---

## 💡 Preguntas de Reflexión

1. ¿Qué pasa si no pones `super()` en el constructor de `Empleado`?
2. ¿Por qué es útil llamar a `super.metodo()` en lugar de reescribir todo?
3. ¿En qué orden se ejecutan los constructores en herencia multinivel?
4. ¿Cuándo NO deberías usar `super.metodo()` en un método sobrescrito?

---

## ⚠️ Errores Comunes

### Error 1: super() no es la primera línea
```java
// ❌ ERROR
public Empleado(...) {
    this.salario = salario;  // Esto va DESPUÉS de super()
    super(nombre, edad);
}

// ✅ CORRECTO
public Empleado(...) {
    super(nombre, edad);
    this.salario = salario;
}
```

### Error 2: No usar super en método sobrescrito
```java
// ⚠️ Pierde funcionalidad del padre
@Override
public void presentarse() {
    System.out.println("Trabajo en " + departamento);
    // Falta la presentación básica de Persona
}

// ✅ CORRECTO
@Override
public void presentarse() {
    super.presentarse();  // Mantiene funcionalidad del padre
    System.out.println("Trabajo en " + departamento);
}
```

### Error 3: Confundir this con super
```java
// this → referencia a la clase actual
// super → referencia a la clase padre

this.salario   // ✅ Atributo de esta clase
super.nombre   // ✅ Atributo heredado del padre
```

---

## 📚 Recursos Relacionados

- **Teoría:** `/1-teoria/04-palabra-super.md`
- **Teoría:** `/1-teoria/03-jerarquias-clases.md`
- **Referencia:** `/3-recursos/cheatsheet-herencia.md`

---

**¡Éxito con el ejercicio!** 🚀

Recuerda: `super` es tu mejor amigo para reutilizar código y extender funcionalidad en herencia.
