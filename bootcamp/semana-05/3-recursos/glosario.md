# Glosario - Semana 05: Polimorfismo

## 🔤 Términos Fundamentales

### Polimorfismo
**Definición:** Capacidad de un objeto de tomar muchas formas. Del griego *poly* (muchos) y *morphos* (formas).

**En Java:** Permite que un mismo método se comporte de manera diferente según el contexto.

**Ejemplo:**
```java
Animal a = new Perro();
a.hacerSonido(); // Ejecuta el método de Perro, no de Animal
```

---

### Sobrecarga (Overloading)
**Definición:** Definir múltiples métodos con el mismo nombre pero diferentes parámetros en la misma clase.

**También conocido como:** Method Overloading, polimorfismo en tiempo de compilación.

**Características:**
- Mismo nombre de método
- Diferente número o tipo de parámetros
- Puede tener diferente tipo de retorno (pero no es suficiente por sí solo)

**Ejemplo:**
```java
public int sumar(int a, int b) { return a + b; }
public double sumar(double a, double b) { return a + b; }
public int sumar(int a, int b, int c) { return a + b + c; }
```

---

### Sobrescritura (Overriding)
**Definición:** Redefinir un método heredado en una subclase con una implementación diferente.

**También conocido como:** Method Overriding, polimorfismo en tiempo de ejecución.

**Características:**
- Requiere herencia
- Mismo nombre, parámetros y tipo de retorno
- Usa @Override
- Se resuelve en tiempo de ejecución

**Ejemplo:**
```java
class Animal {
    public void moverse() {
        System.out.println("El animal se mueve");
    }
}

class Ave extends Animal {
    @Override
    public void moverse() {
        System.out.println("El ave vuela");
    }
}
```

---

### @Override
**Definición:** Anotación que indica que un método está sobrescribiendo un método de la superclase.

**Propósito:**
- Ayuda al compilador a detectar errores
- Mejora la legibilidad del código
- Evita errores de escritura

**Ejemplo:**
```java
@Override
public boolean equals(Object obj) {
    // implementación
}
```

---

### super
**Definición:** Palabra clave que referencia a la superclase inmediata.

**Usos:**
1. Llamar al constructor de la superclase: `super()`
2. Llamar a métodos de la superclase: `super.metodo()`
3. Acceder a atributos de la superclase: `super.atributo`

**Ejemplo:**
```java
@Override
public void mostrarInfo() {
    super.mostrarInfo();  // Llama al método de la superclase
    System.out.println("Info adicional");
}
```

---

### Polimorfismo Dinámico
**Definición:** Tipo de polimorfismo donde el método a ejecutar se determina en tiempo de ejecución, no en compilación.

**También conocido como:** Dynamic binding, late binding, runtime polymorphism.

**Ejemplo:**
```java
Animal miAnimal = new Perro();  // Referencia de Animal, objeto de Perro
miAnimal.hacerSonido();  // Ejecuta el método de Perro (decidido en runtime)
```

---

### Binding Dinámico
**Definición:** Proceso de vincular una llamada a método con el código del método en tiempo de ejecución.

**Contraste:** Binding estático ocurre en tiempo de compilación (overloading).

---

### equals()
**Definición:** Método heredado de Object que compara dos objetos por igualdad lógica.

**Firma:** `public boolean equals(Object obj)`

**Reglas:**
- Reflexivo: `x.equals(x)` debe ser true
- Simétrico: si `x.equals(y)` entonces `y.equals(x)`
- Transitivo: si `x.equals(y)` y `y.equals(z)` entonces `x.equals(z)`
- Consistente: múltiples llamadas devuelven el mismo resultado
- `x.equals(null)` debe ser false

**Ejemplo:**
```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Persona otra = (Persona) obj;
    return this.id == otra.id;
}
```

---

### hashCode()
**Definición:** Método que devuelve un valor hash (entero) del objeto.

**Firma:** `public int hashCode()`

**Contrato con equals():**
- Si `x.equals(y)` entonces `x.hashCode() == y.hashCode()`
- Si `x.hashCode() == y.hashCode()` NO garantiza `x.equals(y)`

**Ejemplo:**
```java
@Override
public int hashCode() {
    return Objects.hash(id, nombre);
}
```

---

### Comparable<T>
**Definición:** Interfaz que permite comparar objetos para ordenamiento natural.

**Método principal:** `int compareTo(T otro)`

**Valores de retorno:**
- Negativo: este objeto es "menor" que otro
- Cero: son iguales
- Positivo: este objeto es "mayor" que otro

**Ejemplo:**
```java
public class Persona implements Comparable<Persona> {
    @Override
    public int compareTo(Persona otra) {
        return this.edad - otra.edad;  // Ordena por edad
    }
}
```

---

### instanceof
**Definición:** Operador que verifica si un objeto es instancia de una clase o implementa una interfaz.

**Sintaxis:** `objeto instanceof Clase`

**Retorno:** boolean (true/false)

**Ejemplo:**
```java
if (animal instanceof Perro) {
    Perro perro = (Perro) animal;
    perro.ladrar();
}
```

**⚠️ Advertencia:** Usar con moderación, puede indicar mal diseño polimórfico.

---

### getClass()
**Definición:** Método que devuelve el objeto Class que representa la clase del objeto.

**Uso:** Obtener información sobre la clase en tiempo de ejecución.

**Ejemplo:**
```java
System.out.println(miObjeto.getClass().getName());
// Imprime: "com.ejemplo.MiClase"
```

---

### Covarianza
**Definición:** Propiedad que permite que el tipo de retorno de un método sobrescrito sea una subclase del tipo de retorno original.

**Ejemplo:**
```java
class Animal {
    public Animal clonar() { return new Animal(); }
}

class Perro extends Animal {
    @Override
    public Perro clonar() {  // ✅ Covarianza: Perro es subclase de Animal
        return new Perro();
    }
}
```

---

### Signatura del Método
**Definición:** Combinación única del nombre del método y sus parámetros (tipo y orden).

**Incluye:**
- Nombre del método
- Número de parámetros
- Tipo de parámetros
- Orden de parámetros

**NO incluye:**
- Tipo de retorno
- Modificadores de acceso
- Excepciones lanzadas

**Ejemplo:**
```java
// Estas dos firmas son diferentes (sobrecarga válida)
public void procesar(String texto, int numero)
public void procesar(int numero, String texto)
```

---

### Upcasting
**Definición:** Conversión de una referencia de subclase a superclase.

**Características:**
- Implícito (automático)
- Siempre seguro
- Restringe acceso a métodos específicos de la subclase

**Ejemplo:**
```java
Perro perro = new Perro();
Animal animal = perro;  // ✅ Upcasting implícito
```

---

### Downcasting
**Definición:** Conversión de una referencia de superclase a subclase.

**Características:**
- Explícito (requiere cast)
- Puede fallar en runtime (ClassCastException)
- Permite acceso a métodos específicos de la subclase

**Ejemplo:**
```java
Animal animal = new Perro();
Perro perro = (Perro) animal;  // ✅ Downcasting explícito
perro.ladrar();  // Ahora se puede usar método de Perro
```

---

### Static Binding
**Definición:** Resolución de llamadas a métodos en tiempo de compilación.

**Se aplica a:**
- Métodos estáticos
- Métodos privados
- Métodos final
- Sobrecarga de métodos

---

### Dynamic Binding
**Definición:** Resolución de llamadas a métodos en tiempo de ejecución.

**Se aplica a:**
- Métodos de instancia sobrescritos
- Métodos no privados, no estáticos, no finales

---

## 📊 Tabla Comparativa: Overloading vs Overriding

| Característica | Overloading | Overriding |
|----------------|-------------|------------|
| **Traducción** | Sobrecarga | Sobrescritura |
| **Ubicación** | Misma clase | Subclase |
| **Herencia** | No requerida | Requerida |
| **Firma** | Diferente | Igual |
| **Binding** | Estático (compile-time) | Dinámico (runtime) |
| **Palabra clave** | Ninguna | @Override (recomendado) |
| **Acceso** | Cualquiera | Igual o menos restrictivo |
| **Tipo retorno** | Puede variar | Igual o covariante |
| **super** | No aplica | Opcional |
| **Propósito** | Flexibilidad de uso | Comportamiento específico |

---

## 🔗 Términos Relacionados

### De Semanas Anteriores
- **Clase:** Plantilla para crear objetos
- **Objeto:** Instancia de una clase
- **Herencia:** Mecanismo para crear jerarquías
- **Encapsulación:** Ocultar detalles internos
- **Constructor:** Método especial para inicializar objetos

### Para Semanas Siguientes
- **Clase Abstracta:** Clase que no puede instanciarse
- **Interfaz:** Contrato de métodos a implementar
- **ArrayList:** Colección dinámica polimórfica
- **HashMap:** Estructura que usa hashCode()

---

## ✅ Checklist de Comprensión

Marca como completado cuando entiendas cada concepto:

- [ ] Puedo explicar qué es polimorfismo
- [ ] Distingo entre overloading y overriding
- [ ] Sé cuándo usar @Override
- [ ] Entiendo el uso de super
- [ ] Puedo implementar equals() correctamente
- [ ] Sé por qué equals() y hashCode() van juntos
- [ ] Entiendo Comparable y compareTo()
- [ ] Uso instanceof solo cuando es necesario
- [ ] Comprendo upcasting y downcasting
- [ ] Distingo binding estático de dinámico

---

## 📚 Referencias

- [Java Language Specification - Polymorphism](https://docs.oracle.com/javase/specs/jls/se17/html/jls-15.html)
- [Oracle Tutorial - Overriding and Hiding Methods](https://docs.oracle.com/javase/tutorial/java/IandI/override.html)
- [Effective Java by Joshua Bloch - Item 10-11](https://www.pearson.com/en-us/subject-catalog/p/effective-java/P200000000138)

---

*Este glosario es un recurso vivo. Si encuentras términos que no entiendes, pregunta al instructor.*

**Bootcamp POO Java - SENA | Semana 05**
