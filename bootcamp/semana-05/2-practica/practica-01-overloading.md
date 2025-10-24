# Práctica 01 - Sobrecarga de Métodos (Overloading)

## 🎯 Objetivo
Implementar métodos sobrecargados correctamente, comprendiendo las reglas de sobrecarga y aplicándolas en situaciones prácticas.

**Duración estimada:** 45 minutos

---

## 📚 Conceptos Previos

### ¿Qué es la Sobrecarga?
Definir múltiples métodos con el mismo nombre pero diferentes parámetros en la misma clase.

### Reglas de Sobrecarga
1. ✅ Mismo nombre de método
2. ✅ Diferente cantidad de parámetros, O
3. ✅ Diferente tipo de parámetros, O
4. ✅ Diferente orden de parámetros
5. ❌ El tipo de retorno por sí solo NO es suficiente

---

## 🛠️ Ejercicio 1: Calculadora con Sobrecarga (15 min)

### Paso 1: Crear la clase base

```java
/**
 * Calculadora con métodos sobrecargados
 * @author Tu Nombre
 */
public class Calculadora {
    
    /**
     * Suma dos números enteros
     * @param a Primer número
     * @param b Segundo número
     * @return Suma de a y b
     */
    public int sumar(int a, int b) {
        System.out.println("→ Sumando dos enteros");
        return a + b;
    }
    
    // TODO: Agregar más versiones sobrecargadas
}
```

### Paso 2: Agregar sobrecarga con double

```java
    /**
     * Suma dos números decimales
     * @param a Primer número
     * @param b Segundo número
     * @return Suma de a y b
     */
    public double sumar(double a, double b) {
        System.out.println("→ Sumando dos decimales");
        return a + b;
    }
```

### Paso 3: Agregar sobrecarga con tres parámetros

```java
    /**
     * Suma tres números enteros
     * @param a Primer número
     * @param b Segundo número
     * @param c Tercer número
     * @return Suma de a, b y c
     */
    public int sumar(int a, int b, int c) {
        System.out.println("→ Sumando tres enteros");
        return a + b + c;
    }
```

### Paso 4: Agregar sobrecarga con array

```java
    /**
     * Suma un array de números enteros
     * @param numeros Array de números a sumar
     * @return Suma de todos los elementos
     */
    public int sumar(int[] numeros) {
        System.out.println("→ Sumando array de enteros");
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }
```

### Paso 5: Probar la sobrecarga

```java
public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Probar cada versión sobrecargada
        System.out.println("Resultado: " + calc.sumar(5, 3));           // int, int
        System.out.println("Resultado: " + calc.sumar(5.5, 3.2));       // double, double
        System.out.println("Resultado: " + calc.sumar(5, 3, 2));        // int, int, int
        System.out.println("Resultado: " + calc.sumar(new int[]{1,2,3,4,5})); // array
    }
}
```

**Salida esperada:**
```
→ Sumando dos enteros
Resultado: 8
→ Sumando dos decimales
Resultado: 8.7
→ Sumando tres enteros
Resultado: 10
→ Sumando array de enteros
Resultado: 15
```

---

## 🛠️ Ejercicio 2: Sobrecarga en Tu Dominio (15 min)

### Contexto
Aplica sobrecarga a tu proyecto del dominio asignado (Cursos, Biblioteca, Restaurante, etc.)

### Ejemplo con Curso

```java
public class Curso {
    private String codigo;
    private String nombre;
    private int duracionHoras;
    private double costoBase;
    
    // Constructores...
    
    /**
     * Actualiza solo el nombre del curso
     * @param nombre Nuevo nombre
     */
    public void actualizar(String nombre) {
        this.nombre = nombre;
        System.out.println("✓ Nombre actualizado");
    }
    
    /**
     * Actualiza nombre y duración
     * @param nombre Nuevo nombre
     * @param duracion Nueva duración en horas
     */
    public void actualizar(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracionHoras = duracion;
        System.out.println("✓ Nombre y duración actualizados");
    }
    
    /**
     * Actualiza información completa
     * @param nombre Nuevo nombre
     * @param duracion Nueva duración
     * @param costo Nuevo costo base
     */
    public void actualizar(String nombre, int duracion, double costo) {
        this.nombre = nombre;
        this.duracionHoras = duracion;
        this.costoBase = costo;
        System.out.println("✓ Información completa actualizada");
    }
}
```

### 📝 Tarea: Implementa en tu dominio

Crea **mínimo 3 métodos sobrecargados** para una operación común en tu clase principal.

**Ideas:**
- `registrar()` con diferentes parámetros
- `buscar()` por diferentes criterios
- `calcular()` con diferentes datos
- `generar()` con diferentes configuraciones

---

## 🛠️ Ejercicio 3: Sobrecarga con Diferentes Tipos (15 min)

### Concepto: Orden de Parámetros

```java
public class Notificacion {
    
    /**
     * Envía notificación con mensaje simple
     * @param mensaje Contenido del mensaje
     */
    public void enviar(String mensaje) {
        System.out.println("📧 Mensaje: " + mensaje);
    }
    
    /**
     * Envía notificación con destinatario y mensaje
     * @param destinatario Email del destinatario
     * @param mensaje Contenido del mensaje
     */
    public void enviar(String destinatario, String mensaje) {
        System.out.println("📧 A: " + destinatario);
        System.out.println("📧 Mensaje: " + mensaje);
    }
    
    /**
     * Envía notificación con prioridad
     * @param mensaje Contenido del mensaje
     * @param prioridad Nivel de prioridad (1-5)
     */
    public void enviar(String mensaje, int prioridad) {
        System.out.println("📧 Prioridad " + prioridad + ": " + mensaje);
    }
    
    /**
     * Envía notificación completa
     * @param destinatario Email del destinatario
     * @param mensaje Contenido
     * @param prioridad Nivel de prioridad
     */
    public void enviar(String destinatario, String mensaje, int prioridad) {
        System.out.println("📧 A: " + destinatario);
        System.out.println("📧 Prioridad " + prioridad + ": " + mensaje);
    }
    
    /**
     * Envía notificación con adjunto
     * @param mensaje Contenido
     * @param archivoAdjunto Ruta del archivo
     * @param enviarConCopia Enviar copia al remitente
     */
    public void enviar(String mensaje, String archivoAdjunto, boolean enviarConCopia) {
        System.out.println("📧 Mensaje: " + mensaje);
        System.out.println("📎 Adjunto: " + archivoAdjunto);
        System.out.println("↩️ Copia: " + (enviarConCopia ? "Sí" : "No"));
    }
}
```

### Probar

```java
public static void main(String[] args) {
    Notificacion notif = new Notificacion();
    
    notif.enviar("Hola mundo");
    System.out.println();
    
    notif.enviar("user@email.com", "Tienes un mensaje");
    System.out.println();
    
    notif.enviar("Urgente: Revisar", 5);
    System.out.println();
    
    notif.enviar("admin@email.com", "Informe mensual", 3);
    System.out.println();
    
    notif.enviar("Documentos adjuntos", "informe.pdf", true);
}
```

---

## ⚠️ Errores Comunes

### Error 1: Confundir con Sobrescritura

```java
// ❌ INCORRECTO - Esto NO es sobrecarga
public class Animal {
    public void hacerSonido() { }
}

public class Perro extends Animal {
    public void hacerSonido() { }  // Esto es SOBRESCRITURA, no sobrecarga
}
```

```java
// ✅ CORRECTO - Sobrecarga en la misma clase
public class Animal {
    public void hacerSonido() { 
        System.out.println("Sonido genérico");
    }
    
    public void hacerSonido(int volumen) {  // Sobrecarga
        System.out.println("Sonido a volumen " + volumen);
    }
}
```

---

### Error 2: Solo Cambiar el Tipo de Retorno

```java
// ❌ INCORRECTO - Error de compilación
public class Calculadora {
    public int calcular(int a, int b) {
        return a + b;
    }
    
    public double calcular(int a, int b) {  // ERROR: misma firma
        return a + b;
    }
}
```

```java
// ✅ CORRECTO - Cambiar parámetros
public class Calculadora {
    public int calcular(int a, int b) {
        return a + b;
    }
    
    public double calcular(double a, double b) {  // OK: diferentes tipos
        return a + b;
    }
}
```

---

### Error 3: Sobrecarga Ambigua

```java
// ⚠️ PUEDE SER CONFUSO
public class Procesador {
    public void procesar(String dato1, String dato2) { }
    public void procesar(String nombre, String email) { }  // Misma firma
}
```

**Solución:** Usa nombres de métodos más específicos si los parámetros son del mismo tipo pero representan cosas diferentes:

```java
// ✅ MEJOR
public class Procesador {
    public void procesarDatos(String dato1, String dato2) { }
    public void procesarUsuario(String nombre, String email) { }
}
```

---

## ✅ Checklist de Verificación

- [ ] Entiendo que la sobrecarga ocurre en la misma clase
- [ ] Sé que debo cambiar la cantidad o tipo de parámetros
- [ ] Comprendo que el tipo de retorno solo no es suficiente
- [ ] Puedo explicar cuándo Java elige cada versión
- [ ] He probado todas las versiones sobrecargadas
- [ ] Documenté cada versión con JavaDoc
- [ ] Los nombres de parámetros son claros y descriptivos

---

## 🎯 Desafío Extra

Crea una clase `FormatoTexto` con métodos sobrecargados para formatear texto:

```java
public class FormatoTexto {
    // formatear(String texto) → en mayúsculas
    // formatear(String texto, boolean mayusculas) → mayúsculas o minúsculas
    // formatear(String texto, int longitudMaxima) → truncar si es muy largo
    // formatear(String texto, String prefijo, String sufijo) → agregar antes/después
}
```

---

## 📝 Reflexión

1. ¿En qué situaciones de tu proyecto usarías sobrecarga?
2. ¿Qué ventaja tiene sobre crear métodos con nombres diferentes?
3. ¿Cómo decide Java cuál versión ejecutar?

---

## ➡️ Próximo Paso

Continúa con **Práctica 02 - Sobrescritura (Overriding)** para aprender el otro tipo de polimorfismo.

---

**Bootcamp POO Java - SENA | Semana 05 - Práctica 01**
