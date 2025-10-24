# Práctica 03 - Implementación de equals() y hashCode()

## 🎯 Objetivo
Implementar correctamente los métodos equals() y hashCode() respetando su contrato, entendiendo su importancia en colecciones y comparaciones.

**Duración estimada:** 60 minutos

---

## 📚 Conceptos Previos

### ¿Por qué son importantes?

```java
Estudiante est1 = new Estudiante("1001", "Ana López");
Estudiante est2 = new Estudiante("1001", "Ana López");

System.out.println(est1 == est2);        // false (referencias diferentes)
System.out.println(est1.equals(est2));    // ¿true o false?
```

**Sin sobrescribir equals():** `false` (compara referencias)  
**Sobrescribiendo equals():** `true` (compara contenido)

### El Contrato equals() y hashCode()

1. **Reflexividad:** `x.equals(x)` debe ser `true`
2. **Simetría:** Si `x.equals(y)` entonces `y.equals(x)`
3. **Transitividad:** Si `x.equals(y)` y `y.equals(z)`, entonces `x.equals(z)`
4. **Consistencia:** Múltiples llamadas devuelven el mismo resultado
5. **null:** `x.equals(null)` debe ser `false`
6. **Regla de oro:** Si dos objetos son iguales según equals(), deben tener el mismo hashCode()

---

## 🛠️ Ejercicio 1: Implementación Básica de equals() (20 min)

### Paso 1: Clase sin equals()

```java
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getters...
}
```

### Prueba del problema:

```java
public class TestProductoSinEquals {
    public static void main(String[] args) {
        Producto p1 = new Producto("P001", "Laptop", 2500000);
        Producto p2 = new Producto("P001", "Laptop", 2500000);
        
        System.out.println("¿Son iguales con ==? " + (p1 == p2));         // false
        System.out.println("¿Son iguales con equals()? " + p1.equals(p2)); // false ❌
        
        // Problema con colecciones
        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        
        System.out.println("¿Contiene p2? " + productos.contains(p2));    // false ❌
        // Aunque p1 y p2 tienen el mismo código, no los reconoce como iguales
    }
}
```

---

### Paso 2: Implementar equals() correctamente

```java
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    /**
     * Implementación correcta de equals()
     * Dos productos son iguales si tienen el mismo código
     */
    @Override
    public boolean equals(Object obj) {
        // 1. Verificar si es la misma referencia
        if (this == obj) {
            return true;
        }
        
        // 2. Verificar si es null
        if (obj == null) {
            return false;
        }
        
        // 3. Verificar si es de la misma clase
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        // 4. Hacer cast y comparar atributos
        Producto otro = (Producto) obj;
        
        // Usar Objects.equals() para manejar nulls
        return Objects.equals(this.codigo, otro.codigo);
    }
    
    // Getters...
}
```

### Prueba con equals() implementado:

```java
public class TestProductoConEquals {
    public static void main(String[] args) {
        Producto p1 = new Producto("P001", "Laptop", 2500000);
        Producto p2 = new Producto("P001", "Laptop Dell", 2600000);
        
        System.out.println("¿Son iguales? " + p1.equals(p2));  // true ✅
        
        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        
        System.out.println("¿Contiene p2? " + productos.contains(p2));  // true ✅
    }
}
```

---

## 🛠️ Ejercicio 2: Implementar hashCode() (20 min)

### El Problema sin hashCode()

```java
public class TestHashCodeProblema {
    public static void main(String[] args) {
        Producto p1 = new Producto("P001", "Laptop", 2500000);
        Producto p2 = new Producto("P001", "Laptop", 2500000);
        
        Set<Producto> productos = new HashSet<>();
        productos.add(p1);
        productos.add(p2);
        
        System.out.println("Tamaño del Set: " + productos.size());  // 2 ❌ (Debería ser 1)
        // Aunque equals() dice que son iguales, hashCode() es diferente
    }
}
```

---

### Implementación Correcta: equals() + hashCode()

```java
import java.util.Objects;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    /**
     * Dos productos son iguales si tienen el mismo código
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Producto otro = (Producto) obj;
        return Objects.equals(codigo, otro.codigo);
    }
    
    /**
     * hashCode() debe usar los mismos atributos que equals()
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigo);  // Usar solo 'codigo' porque equals() usa solo codigo
    }
    
    @Override
    public String toString() {
        return String.format("Producto[%s - %s - $%.2f]", codigo, nombre, precio);
    }
    
    // Getters...
}
```

### Prueba con ambos implementados:

```java
public class TestProductoCompleto {
    public static void main(String[] args) {
        Producto p1 = new Producto("P001", "Laptop", 2500000);
        Producto p2 = new Producto("P001", "Laptop Dell", 2600000);
        Producto p3 = new Producto("P002", "Mouse", 50000);
        
        // Verificar equals()
        System.out.println("p1.equals(p2): " + p1.equals(p2));  // true ✅
        System.out.println("p1.equals(p3): " + p1.equals(p3));  // false ✅
        
        // Verificar hashCode()
        System.out.println("\nHashCodes:");
        System.out.println("p1: " + p1.hashCode());
        System.out.println("p2: " + p2.hashCode());  // Igual a p1 ✅
        System.out.println("p3: " + p3.hashCode());  // Diferente ✅
        
        // Probar con HashSet
        Set<Producto> productos = new HashSet<>();
        productos.add(p1);
        productos.add(p2);  // No se agrega porque p1.equals(p2)
        productos.add(p3);
        
        System.out.println("\nSet de productos:");
        System.out.println("Tamaño: " + productos.size());  // 2 ✅
        for (Producto p : productos) {
            System.out.println("  " + p);
        }
    }
}
```

**Salida esperada:**
```
p1.equals(p2): true
p1.equals(p3): false

HashCodes:
p1: 64955891
p2: 64955891
p3: 64955892

Set de productos:
Tamaño: 2
  Producto[P001 - Laptop - $2500000.00]
  Producto[P002 - Mouse - $50000.00]
```

---

## 🛠️ Ejercicio 3: Implementar en Tu Dominio (20 min)

### Ejemplo con Estudiante

```java
import java.util.Objects;

public class Estudiante {
    private String documento;
    private String nombre;
    private String programa;
    private double promedio;
    
    public Estudiante(String documento, String nombre, String programa) {
        this.documento = documento;
        this.nombre = nombre;
        this.programa = programa;
        this.promedio = 0.0;
    }
    
    /**
     * Dos estudiantes son iguales si tienen el mismo documento
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Estudiante otro = (Estudiante) obj;
        return Objects.equals(documento, otro.documento);
    }
    
    /**
     * hashCode basado en documento (mismo criterio que equals)
     */
    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
    
    @Override
    public String toString() {
        return String.format("Estudiante[%s - %s]", documento, nombre);
    }
    
    // Getters y setters...
}
```

### 📝 Tarea: Implementa en tu clase principal

Implementa equals() y hashCode() en tu clase de dominio:

1. Identifica el(los) atributo(s) que definen la identidad
2. Implementa equals() usando esos atributos
3. Implementa hashCode() con los mismos atributos
4. Crea pruebas con HashSet y HashMap

---

## ⚠️ Errores Comunes

### Error 1: No verificar null

```java
// ❌ INCORRECTO - NullPointerException
@Override
public boolean equals(Object obj) {
    Producto otro = (Producto) obj;  // Si obj es null, lanza excepción
    return this.codigo.equals(otro.codigo);
}

// ✅ CORRECTO - Verificar null primero
@Override
public boolean equals(Object obj) {
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    
    Producto otro = (Producto) obj;
    return Objects.equals(this.codigo, otro.codigo);  // Maneja nulls
}
```

---

### Error 2: No verificar la clase

```java
// ❌ INCORRECTO - ClassCastException
@Override
public boolean equals(Object obj) {
    if (obj == null) return false;
    Producto otro = (Producto) obj;  // Falla si obj no es Producto
    return this.codigo.equals(otro.codigo);
}

// ✅ CORRECTO - Verificar clase
@Override
public boolean equals(Object obj) {
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;  // Verificar clase
    
    Producto otro = (Producto) obj;
    return Objects.equals(this.codigo, otro.codigo);
}
```

---

### Error 3: equals() y hashCode() inconsistentes

```java
// ❌ INCORRECTO - Usan diferentes atributos
@Override
public boolean equals(Object obj) {
    Producto otro = (Producto) obj;
    return Objects.equals(this.codigo, otro.codigo);  // Usa solo codigo
}

@Override
public int hashCode() {
    return Objects.hash(codigo, nombre, precio);  // Usa codigo, nombre, precio ❌
}

// ✅ CORRECTO - Ambos usan los mismos atributos
@Override
public boolean equals(Object obj) {
    Producto otro = (Producto) obj;
    return Objects.equals(this.codigo, otro.codigo);  // Usa solo codigo
}

@Override
public int hashCode() {
    return Objects.hash(codigo);  // Usa solo codigo ✅
}
```

---

### Error 4: Comparar doubles directamente

```java
// ❌ INCORRECTO - Problemas de precisión
@Override
public boolean equals(Object obj) {
    Producto otro = (Producto) obj;
    return this.precio == otro.precio;  // Mal para doubles
}

// ✅ CORRECTO - Usar Double.compare()
@Override
public boolean equals(Object obj) {
    Producto otro = (Producto) obj;
    return Double.compare(this.precio, otro.precio) == 0;
}
```

---

## 💡 Casos Especiales

### Múltiples Atributos en equals()

```java
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Libro otro = (Libro) obj;
        return Objects.equals(isbn, otro.isbn) &&
               Objects.equals(titulo, otro.titulo) &&
               Objects.equals(autor, otro.autor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(isbn, titulo, autor);  // Mismos atributos
    }
}
```

### Usar IDE para Generar

En IntelliJ IDEA:
1. Click derecho en la clase
2. `Generate...` (Alt + Insert)
3. Seleccionar `equals() and hashCode()`
4. Elegir los atributos
5. Elegir template: `java.util.Objects.equals and hashCode`

---

## 🧪 Pruebas Completas

```java
public class TestEqualsHashCode {
    public static void main(String[] args) {
        Producto p1 = new Producto("P001", "Laptop", 2500000);
        Producto p2 = new Producto("P001", "Laptop", 2500000);
        Producto p3 = new Producto("P002", "Mouse", 50000);
        Producto p4 = p1;  // Misma referencia
        
        System.out.println("=== PRUEBAS EQUALS ===\n");
        
        // Reflexividad
        System.out.println("p1.equals(p1): " + p1.equals(p1));  // true ✅
        
        // Simetría
        System.out.println("p1.equals(p2): " + p1.equals(p2));  // true
        System.out.println("p2.equals(p1): " + p2.equals(p1));  // true ✅
        
        // Transitividad (p1 = p2, p2 = p4, entonces p1 = p4)
        System.out.println("p1.equals(p4): " + p1.equals(p4));  // true ✅
        
        // null
        System.out.println("p1.equals(null): " + p1.equals(null));  // false ✅
        
        // Diferentes
        System.out.println("p1.equals(p3): " + p1.equals(p3));  // false ✅
        
        System.out.println("\n=== PRUEBAS HASHCODE ===\n");
        
        // Objetos iguales → mismo hashCode
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("¿Iguales? " + (p1.hashCode() == p2.hashCode()));  // true ✅
        
        System.out.println("\n=== PRUEBA CON HASHMAP ===\n");
        
        Map<Producto, Integer> stock = new HashMap<>();
        stock.put(p1, 10);
        stock.put(p2, 5);   // Actualiza el valor de p1 (porque p1.equals(p2))
        stock.put(p3, 20);
        
        System.out.println("Tamaño del mapa: " + stock.size());  // 2 ✅
        System.out.println("Stock de p1: " + stock.get(p1));     // 5 ✅
        System.out.println("Stock de p2: " + stock.get(p2));     // 5 ✅
        System.out.println("Stock de p3: " + stock.get(p3));     // 20 ✅
    }
}
```

---

## ✅ Checklist de Verificación

- [ ] equals() verifica `this == obj` primero
- [ ] equals() verifica si obj es null
- [ ] equals() verifica si las clases son iguales
- [ ] equals() usa Objects.equals() para comparar atributos
- [ ] hashCode() usa los mismos atributos que equals()
- [ ] hashCode() usa Objects.hash()
- [ ] He probado con HashSet/HashMap
- [ ] He probado con null
- [ ] Documenté qué hace que dos objetos sean "iguales"

---

## 🎯 Desafío Extra

Crea una clase `CuentaBancaria` que:
- Tiene: número de cuenta, titular, saldo
- Dos cuentas son iguales si tienen el mismo número
- Implementa equals() y hashCode()
- Prueba agregando cuentas a un HashSet
- Verifica que no se permitan cuentas duplicadas

```java
CuentaBancaria c1 = new CuentaBancaria("0001", "Juan", 1000000);
CuentaBancaria c2 = new CuentaBancaria("0001", "Juan Pérez", 500000);

Set<CuentaBancaria> cuentas = new HashSet<>();
cuentas.add(c1);
cuentas.add(c2);  // No se debe agregar

System.out.println("Cuentas únicas: " + cuentas.size());  // Debe ser 1
```

---

## 📝 Reflexión

1. ¿Por qué equals() y hashCode() deben usar los mismos atributos?
2. ¿Qué pasaría si solo implementas equals() pero no hashCode()?
3. ¿En qué situaciones es crucial tener equals() bien implementado?
4. ¿Cuándo usarías Objects.equals() vs equals() directo?

---

## ➡️ Próximo Paso

Continúa con **Práctica 04 - Polimorfismo Completo** para integrar todos los conceptos de la semana.

---

**Bootcamp POO Java - SENA | Semana 05 - Práctica 03**
