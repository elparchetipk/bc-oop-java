# Principio de Encapsulación

## 📋 Contenido

1. [¿Qué es la Encapsulación?](#qué-es-la-encapsulación)
2. [Ventajas de la Encapsulación](#ventajas-de-la-encapsulación)
3. [Ocultamiento de Información](#ocultamiento-de-información)
4. [Interfaz Pública vs Implementación Privada](#interfaz-pública-vs-implementación-privada)
5. [Ejemplos del Mundo Real](#ejemplos-del-mundo-real)
6. [Encapsulación en Java](#encapsulación-en-java)

---

## ¿Qué es la Encapsulación?

La **encapsulación** es uno de los cuatro pilares fundamentales de la Programación Orientada a Objetos (junto con herencia, polimorfismo y abstracción).

### Definición

> **Encapsulación** es el proceso de ocultar los detalles internos de implementación de un objeto y exponer solo lo necesario a través de una interfaz pública controlada.

En términos simples:
- **Agrupar** datos (atributos) y métodos en una unidad llamada clase
- **Proteger** los datos de acceso directo desde fuera de la clase
- **Controlar** cómo se accede y modifica la información

### Metáfora

Piensa en una **cápsula de medicamento**:
- El contenido (ingredientes activos) está protegido dentro
- Solo puedes interactuar con ella de formas específicas (tragar, no abrir)
- No necesitas saber exactamente qué hay dentro para usarla correctamente

---

## Ventajas de la Encapsulación

### 1. Control de Acceso a los Datos

```java
public class CuentaBancaria {
    private double saldo; // No se puede modificar directamente
    
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false; // Operación no válida
    }
}
```

**Beneficio**: Evitas que alguien asigne valores inválidos directamente.

---

### 2. Flexibilidad y Mantenibilidad

Puedes cambiar la implementación interna sin afectar el código que usa la clase:

```java
// Versión 1: Saldo simple
public class Cuenta {
    private double saldo;
    
    public double getSaldo() {
        return saldo;
    }
}

// Versión 2: Saldo con centavos separados (cambio interno)
public class Cuenta {
    private long saldoPesos;
    private int saldoCentavos;
    
    public double getSaldo() {
        return saldoPesos + (saldoCentavos / 100.0);
    }
}
```

**Beneficio**: Los usuarios de la clase no necesitan cambiar su código.

---

### 3. Validación de Datos

```java
public class Persona {
    private int edad;
    
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 150) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
```

**Beneficio**: Garantizas que los datos siempre sean consistentes y válidos.

---

### 4. Facilita el Trabajo en Equipo

```java
// Developer A trabaja en la clase
public class Articulo {
    private double precio;
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

// Developer B usa la clase sin conocer detalles internos
Articulo articulo = new Articulo();
articulo.setPrecio(100.0);
System.out.println(articulo.getPrecio());
```

**Beneficio**: Separación clara de responsabilidades.

---

### 5. Seguridad

Proteges información sensible de modificaciones no autorizadas:

```java
public class Usuario {
    private String password; // Nadie puede acceder directamente
    
    public boolean verificarPassword(String intento) {
        return this.password.equals(intento);
    }
    
    // NO hay getPassword() por seguridad
}
```

---

### 6. Facilita Debugging y Testing

```java
public class Contador {
    private int valor;
    
    public void incrementar() {
        valor++; // Solo un lugar donde se modifica
        System.out.println("Contador incrementado a: " + valor); // Debug
    }
}
```

**Beneficio**: Sabes exactamente dónde y cómo se modifican los datos.

---

## Ocultamiento de Información

El **ocultamiento de información** (information hiding) es el principio detrás de la encapsulación.

### Principio

> "Un módulo debe ocultar decisiones de diseño importantes, revelando solo lo necesario"

### Niveles de Ocultamiento

#### Nivel 1: Ocultar Atributos

```java
public class Rectangulo {
    // ❌ MAL: Atributos públicos
    public double ancho;
    public double alto;
}

// Cualquiera puede hacer:
Rectangulo r = new Rectangulo();
r.ancho = -5; // ¡Valor inválido!
```

```java
public class Rectangulo {
    // ✅ BIEN: Atributos privados
    private double ancho;
    private double alto;
    
    public void setAncho(double ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }
}
```

---

#### Nivel 2: Ocultar Detalles de Implementación

```java
public class ListaTareas {
    // Implementación oculta: podría ser array, ArrayList, LinkedList
    private ArrayList<String> tareas;
    
    // Interfaz pública: no revela la implementación
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }
    
    public int cantidadTareas() {
        return tareas.size();
    }
}
```

**Ventaja**: Puedes cambiar de ArrayList a LinkedList sin afectar a los usuarios.

---

#### Nivel 3: Ocultar Algoritmos

```java
public class CalculadoraImpuestos {
    private double tasaBase = 0.19;
    
    // El usuario no sabe cómo se calcula, solo usa el resultado
    public double calcularImpuesto(double monto) {
        // Algoritmo complejo oculto
        double descuento = calcularDescuento(monto);
        double tasaAjustada = ajustarTasa(monto);
        return monto * tasaAjustada - descuento;
    }
    
    private double calcularDescuento(double monto) {
        // Lógica privada
        return monto > 1000 ? 50 : 0;
    }
    
    private double ajustarTasa(double monto) {
        // Lógica privada
        return monto > 500 ? tasaBase * 1.1 : tasaBase;
    }
}
```

---

## Interfaz Pública vs Implementación Privada

### Conceptos

| Aspecto | Interfaz Pública | Implementación Privada |
|---------|------------------|------------------------|
| **Visibilidad** | `public` | `private` |
| **Propósito** | Qué hace la clase | Cómo lo hace |
| **Estabilidad** | Debe ser estable | Puede cambiar |
| **Usuarios** | Otros programadores | Solo la clase misma |
| **Documentación** | Debe estar documentada | Opcional |

---

### Ejemplo: Reloj Digital

```java
/**
 * Reloj digital de 24 horas.
 */
public class RelojDigital {
    // ========================================
    // IMPLEMENTACIÓN PRIVADA (OCULTA)
    // ========================================
    
    private int horas;      // 0-23
    private int minutos;    // 0-59
    private int segundos;   // 0-60
    
    /**
     * Incrementa el reloj en un segundo.
     * Lógica privada que maneja desbordamientos.
     */
    private void incrementarSegundo() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                horas++;
                if (horas >= 24) {
                    horas = 0;
                }
            }
        }
    }
    
    // ========================================
    // INTERFAZ PÚBLICA (VISIBLE)
    // ========================================
    
    /**
     * Constructor que inicializa el reloj.
     */
    public RelojDigital(int horas, int minutos, int segundos) {
        setHora(horas, minutos, segundos);
    }
    
    /**
     * Establece la hora del reloj.
     */
    public void setHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24) this.horas = horas;
        if (minutos >= 0 && minutos < 60) this.minutos = minutos;
        if (segundos >= 0 && segundos < 60) this.segundos = segundos;
    }
    
    /**
     * Avanza el reloj el número de segundos especificado.
     */
    public void avanzar(int segundos) {
        for (int i = 0; i < segundos; i++) {
            incrementarSegundo();
        }
    }
    
    /**
     * Retorna la hora en formato HH:MM:SS.
     */
    public String getHoraFormateada() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
```

### Uso desde Fuera

```java
public class PruebaReloj {
    public static void main(String[] args) {
        // Usuario solo ve la interfaz pública
        RelojDigital reloj = new RelojDigital(14, 30, 0);
        
        System.out.println(reloj.getHoraFormateada()); // 14:30:00
        
        reloj.avanzar(90); // Avanza 90 segundos
        
        System.out.println(reloj.getHoraFormateada()); // 14:31:30
        
        // ❌ No puede hacer esto (es privado):
        // reloj.horas = 25; // ERROR de compilación
        // reloj.incrementarSegundo(); // ERROR de compilación
    }
}
```

---

## Ejemplos del Mundo Real

### 1. Automóvil

```java
public class Automovil {
    // IMPLEMENTACIÓN PRIVADA (Motor, transmisión, etc.)
    private Motor motor;
    private int velocidadActual;
    private boolean encendido;
    
    // INTERFAZ PÚBLICA (Lo que el conductor usa)
    public void encender() {
        motor.iniciar();
        encendido = true;
    }
    
    public void acelerar() {
        if (encendido) {
            velocidadActual += 10;
            motor.aumentarRPM();
        }
    }
    
    public void frenar() {
        velocidadActual -= 10;
        if (velocidadActual < 0) velocidadActual = 0;
    }
}
```

**Analogía**: No necesitas saber cómo funciona el motor para conducir.

---

### 2. Cajero Automático

```java
public class CajeroAutomatico {
    // PRIVADO: Conexión a banco, dinero disponible
    private ConexionBanco banco;
    private int dineroDisponible;
    
    // PÚBLICO: Operaciones que el usuario puede hacer
    public boolean retirar(String cuenta, int pin, double monto) {
        if (banco.verificarPin(cuenta, pin)) {
            if (monto <= dineroDisponible) {
                banco.descontarDeCuenta(cuenta, monto);
                dineroDisponible -= monto;
                entregarDinero(monto);
                return true;
            }
        }
        return false;
    }
    
    public double consultarSaldo(String cuenta, int pin) {
        if (banco.verificarPin(cuenta, pin)) {
            return banco.obtenerSaldo(cuenta);
        }
        return 0;
    }
}
```

---

### 3. Teléfono Móvil

```java
public class TelefonoMovil {
    // PRIVADO: Componentes internos
    private Bateria bateria;
    private ProcesadorSenal procesador;
    private Antena antena;
    
    // PÚBLICO: Interfaz simple
    public void llamar(String numero) {
        if (bateria.tieneCarga()) {
            procesador.establecerConexion(numero);
            antena.transmitir();
        }
    }
    
    public void colgar() {
        procesador.terminarConexion();
    }
    
    public int getNivelBateria() {
        return bateria.getPorcentaje();
    }
}
```

---

## Encapsulación en Java

### Reglas Básicas

1. **Declarar atributos como `private`**
2. **Proporcionar métodos `public` para acceso controlado**
3. **Validar datos en los setters**
4. **Usar `this` para claridad**
5. **Documentar la interfaz pública**

### Template de Clase Encapsulada

```java
/**
 * Descripción de la clase.
 * 
 * @author Tu Nombre
 * @version 1.0
 */
public class NombreClase {
    
    // ==========================================
    // ATRIBUTOS (siempre privados)
    // ==========================================
    
    private TipoA atributo1;
    private TipoB atributo2;
    
    // ==========================================
    // CONSTRUCTORES
    // ==========================================
    
    public NombreClase() {
        // Constructor por defecto
    }
    
    public NombreClase(TipoA atributo1, TipoB atributo2) {
        setAtributo1(atributo1);
        setAtributo2(atributo2);
    }
    
    // ==========================================
    // GETTERS Y SETTERS
    // ==========================================
    
    public TipoA getAtributo1() {
        return atributo1;
    }
    
    public void setAtributo1(TipoA atributo1) {
        if (/* validación */) {
            this.atributo1 = atributo1;
        }
    }
    
    // ==========================================
    // MÉTODOS DE NEGOCIO (públicos)
    // ==========================================
    
    public void metodoPublico() {
        // Lógica que usa métodos privados
        metodoPrivadoAuxiliar();
    }
    
    // ==========================================
    // MÉTODOS AUXILIARES (privados)
    // ==========================================
    
    private void metodoPrivadoAuxiliar() {
        // Lógica interna
    }
}
```

---

## Principios SOLID Relacionados

### Single Responsibility Principle (SRP)

Una clase debe tener una sola razón para cambiar.

```java
// ✅ BIEN: Clase con responsabilidad única
public class Empleado {
    private String nombre;
    private double salario;
    
    // Solo maneja datos del empleado
}

// ❌ MAL: Múltiples responsabilidades
public class Empleado {
    private String nombre;
    
    public void guardarEnBaseDatos() { } // Responsabilidad de persistencia
    public void generarReporte() { }     // Responsabilidad de reportes
    public void enviarEmail() { }        // Responsabilidad de comunicación
}
```

---

## Errores Comunes

### ❌ Error 1: Atributos Públicos

```java
public class Persona {
    public String nombre; // MAL
    public int edad;      // MAL
}
```

### ❌ Error 2: Getters que Rompen Encapsulación

```java
public class Clase {
    private ArrayList<String> lista;
    
    // MAL: Expone referencia interna
    public ArrayList<String> getLista() {
        return lista; // ¡Alguien puede modificarla!
    }
    
    // BIEN: Retorna copia
    public ArrayList<String> getLista() {
        return new ArrayList<>(lista);
    }
}
```

### ❌ Error 3: Setters sin Validación

```java
public void setEdad(int edad) {
    this.edad = edad; // MAL: Acepta cualquier valor
}

public void setEdad(int edad) {
    if (edad >= 0 && edad <= 150) { // BIEN: Valida
        this.edad = edad;
    }
}
```

---

## Conclusión

La encapsulación es fundamental para:
- ✅ Proteger la integridad de los datos
- ✅ Facilitar el mantenimiento del código
- ✅ Permitir evolución sin romper código existente
- ✅ Mejorar la seguridad
- ✅ Facilitar el trabajo en equipo

### Regla de Oro

> "Haz todo tan privado como sea posible, y públicalo solo cuando sea absolutamente necesario"

---

## Ejercicios Prácticos

1. Identificar violaciones de encapsulación en código dado
2. Refactorizar clase con atributos públicos a privados
3. Implementar clase completamente encapsulada
4. Comparar versiones con y sin encapsulación

---

## Referencias

- Java Documentation: [Controlling Access to Members of a Class](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- Effective Java (Joshua Bloch) - Capítulo sobre encapsulación
- Clean Code (Robert Martin) - Principles of OOP

---

**Próximo tema:** [Modificadores de Acceso](./02-modificadores-acceso.md)

