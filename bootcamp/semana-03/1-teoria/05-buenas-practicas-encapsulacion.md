# Buenas Prácticas en Encapsulación

## 📋 Contenido

1. [Principios Fundamentales](#principios-fundamentales)
2. [Reglas de Oro](#reglas-de-oro)
3. [Patrones Comunes](#patrones-comunes)
4. [Anti-patrones a Evitar](#anti-patrones-a-evitar)
5. [Checklist de Buenas Prácticas](#checklist-de-buenas-prácticas)
6. [Ejemplos Completos](#ejemplos-completos)

---

## Principios Fundamentales

### 1. Principio de Mínima Visibilidad

> "Haz todo tan privado como sea posible, y hazlo público solo cuando sea absolutamente necesario"

```java
// ✅ BIEN: Empieza restrictivo
public class Clase {
  private int dato;           // Privado por defecto

  private void metodo() {
  }   // Privado por defecto

  // Solo expón lo necesario
  public void operacionPublica() {
    metodo(); // Usa métodos privados internamente
  }
}

// ❌ MAL: Todo público sin razón
public class Clase {
  public int dato;

  public void metodo() {
  }
}
```

### 2. Principio de Única Responsabilidad

> "Una clase debe tener una sola razón para cambiar"

```java
// ✅ BIEN: Responsabilidad única
public class Empleado {
  private String nombre;
  private double salario;

  public double calcularSalarioMensual() {
    return salario;
  }
}

// Otra clase para persistencia
public class EmpleadoRepository {
  public void guardar(Empleado empleado) {
    // Lógica de base de datos
  }
}

// ❌ MAL: Múltiples responsabilidades
public class Empleado {
  private String nombre;

  public void calcularSalario() {
  }

  public void guardarEnBaseDatos() {
  }  // ❌ No es su responsabilidad

  public void enviarEmail() {
  }          // ❌ No es su responsabilidad
}
```

### 3. Principio Tell, Don't Ask

> "Dile al objeto qué hacer, no le preguntes por sus datos para hacerlo tú"

```java
// ❌ MAL: Pregunta y hace
CuentaBancaria cuenta = new CuentaBancaria();
double saldo = cuenta.getSaldo();
if(saldo >=100){
    cuenta.

setSaldo(saldo -100);
}

// ✅ BIEN: Le dice qué hacer
CuentaBancaria cuenta = new CuentaBancaria();
boolean exito = cuenta.retirar(100); // La cuenta decide internamente
```

---

## Reglas de Oro

### Regla 1: Atributos Siempre Privados

```java
public class Producto {
  // ✅ CORRECTO
  private String codigo;
  private double precio;
  private int stock;

  // ❌ INCORRECTO
  // public String codigo;
  // public double precio;
}
```

**Excepción**: Constantes públicas

```java
public class Constantes {
  public static final double PI = 3.14159;  // ✅ OK para constantes
  public static final int MAX_INTENTOS = 3;
}
```

### Regla 2: Getters y Setters Solo Cuando Sean Necesarios

```java
// ❌ MAL: Expone todo sin razón
public class Motor {
  private int rpm;

  public int getRpm() {
    return rpm;
  }

  public void setRpm(int rpm) {
    this.rpm = rpm;
  }
}

// ✅ MEJOR: Expone comportamiento
public class Motor {
  private int rpm;

  public void acelerar() {
    rpm += 100;
  }

  public void frenar() {
    rpm -= 50;
    if (rpm < 0) rpm = 0;
  }

  public boolean estaEnMarcha() {
    return rpm > 0;
  }
}
```

### Regla 3: Validación en Todos los Puntos de Entrada

```java
public class Estudiante {
  private String nombre;
  private double promedio;

  // Validación en constructor
  public Estudiante(String nombre, double promedio) {
    setNombre(nombre);      // Usa setter con validación
    setPromedio(promedio);
  }

  // Validación en setter
  public void setNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
      throw new IllegalArgumentException("Nombre no puede estar vacío");
    }
    this.nombre = nombre.trim();
  }

  public void setPromedio(double promedio) {
    if (promedio < 0.0 || promedio > 5.0) {
      throw new IllegalArgumentException("Promedio debe estar entre 0.0 y 5.0");
    }
    this.promedio = promedio;
  }
}
```

### Regla 4: Retornar Copias de Colecciones

```java
public class Curso {
  private final List<String> estudiantes;

  public Curso() {
    this.estudiantes = new ArrayList<>();
  }

  // ❌ MAL: Expone referencia interna
  public List<String> getEstudiantes() {
    return estudiantes; // Alguien puede modificar la lista
  }

  // ✅ BIEN: Retorna copia defensiva
  public List<String> getEstudiantes() {
    return new ArrayList<>(estudiantes);
  }

  // ✅ MEJOR: Retorna lista inmutable
  public List<String> getEstudiantes() {
    return Collections.unmodifiableList(estudiantes);
  }

  // ✅ MEJOR AÚN: Proporciona métodos específicos
  public void agregarEstudiante(String estudiante) {
    estudiantes.add(estudiante);
  }

  public int getCantidadEstudiantes() {
    return estudiantes.size();
  }

  public boolean tieneEstudiante(String nombre) {
    return estudiantes.contains(nombre);
  }
}
```

### Regla 5: Inmutabilidad Cuando Sea Posible

```java
// ✅ Clase inmutable
public final class Punto {
  private final int x;
  private final int y;

  public Punto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  // NO hay setters

  // Para "modificar", crea un nuevo objeto
  public Punto mover(int dx, int dy) {
    return new Punto(x + dx, y + dy);
  }
}

// Uso
Punto p1 = new Punto(5, 10);
Punto p2 = p1.mover(3, 2); // Nuevo objeto
System.out.

println(p1.getX() +", "+p1.

getY()); // 5, 10 (sin cambios)
    System.out.

println(p2.getX() +", "+p2.

getY()); // 8, 12
```

### Regla 6: Documentación de la API Pública

```java
public class CuentaBancaria {
  private double saldo;

  /**
   * Retira dinero de la cuenta.
   *
   * @param monto Cantidad a retirar, debe ser mayor a 0
   * @return true si la operación fue exitosa, false si no hay saldo suficiente
   * @throws IllegalArgumentException si el monto es negativo o cero
   */
  public boolean retirar(double monto) {
    if (monto <= 0) {
      throw new IllegalArgumentException("Monto debe ser mayor a 0");
    }
    if (monto > saldo) {
      return false;
    }
    saldo -= monto;
    return true;
  }
}
```

---

## Patrones Comunes

### Patrón 1: Validación Centralizada

```java
public class Empleado {
  private String email;

  public Empleado(String email) {
    setEmail(email); // Usa setter con validación
  }

  public void setEmail(String email) {
    if (!validarEmail(email)) {
      throw new IllegalArgumentException("Email inválido: " + email);
    }
    this.email = email;
  }

  private boolean validarEmail(String email) {
    // Validación centralizada
    return email != null
        && email.contains("@")
        && email.contains(".")
        && email.indexOf("@") < email.lastIndexOf(".");
  }
}
```

### Patrón 2: Builder para Objetos Complejos

```java
public class Persona {
  private final String nombre;
  private final String apellido;
  private final int edad;
  private final String email;
  private final String telefono;

  private Persona(Builder builder) {
    this.nombre = builder.nombre;
    this.apellido = builder.apellido;
    this.edad = builder.edad;
    this.email = builder.email;
    this.telefono = builder.telefono;
  }

  public static class Builder {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;

    public Builder nombre(String nombre) {
      this.nombre = nombre;
      return this;
    }

    public Builder apellido(String apellido) {
      this.apellido = apellido;
      return this;
    }

    public Builder edad(int edad) {
      this.edad = edad;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder telefono(String telefono) {
      this.telefono = telefono;
      return this;
    }

    public Persona build() {
      return new Persona(this);
    }
  }
}

// Uso
Persona persona = new Persona.Builder()
    .nombre("Juan")
    .apellido("Pérez")
    .edad(30)
    .email("juan@example.com")
    .build();
```

### Patrón 3: Lazy Initialization

```java
public class Reporte {
  private String contenido;
  private String resumen; // Se calcula bajo demanda

  public String getResumen() {
    if (resumen == null) {
      resumen = calcularResumen(); // Lazy initialization
    }
    return resumen;
  }

  private String calcularResumen() {
    // Proceso costoso
    return contenido.substring(0, Math.min(100, contenido.length()));
  }
}
```

### Patrón 4: Singleton

```java
public class ConfiguracionSistema {
  private static ConfiguracionSistema instancia;

  private final String configuracion;

  // Constructor privado
  private ConfiguracionSistema() {
    configuracion = "Config por defecto";
  }

  public static ConfiguracionSistema getInstancia() {
    if (instancia == null) {
      instancia = new ConfiguracionSistema();
    }
    return instancia;
  }

  public String getConfiguracion() {
    return configuracion;
  }
}
```

---

## Anti-patrones a Evitar

### Anti-patrón 1: God Class (Clase Dios)

```java
// ❌ MAL: Clase que hace todo
public class Sistema {
  public void gestionarUsuarios() {
  }

  public void procesarPagos() {
  }

  public void generarReportes() {
  }

  public void enviarEmails() {
  }

  public void conectarBaseDatos() {
  }
  // ... 50 métodos más
}

// ✅ BIEN: Separar responsabilidades
public class GestorUsuarios {
  public void crear() {
  }

  public void actualizar() {
  }
}

public class ProcesadorPagos {
  public void procesar() {
  }
}

public class GeneradorReportes {
  public void generar() {
  }
}
```

### Anti-patrón 2: Anemic Domain Model

```java
// ❌ MAL: Clase sin comportamiento (solo getters/setters)
public class Pedido {
  private double total;

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }
}

// La lógica está fuera
public class ServicioPedido {
  public void aplicarDescuento(Pedido pedido, double descuento) {
    double total = pedido.getTotal();
    pedido.setTotal(total - descuento);
  }
}

// ✅ BIEN: Clase con comportamiento
public class Pedido {
  private double total;

  public void aplicarDescuento(double descuento) {
    if (descuento > 0 && descuento <= total) {
      total -= descuento;
    }
  }

  public double getTotal() {
    return total;
  }
}
```

### Anti-patrón 3: Exceso de Getters/Setters

```java
// ❌ MAL: Expone todo
public class CuentaBancaria {
  private double saldo;
  private List<String> transacciones;

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public List<String> getTransacciones() {
    return transacciones;
  }

  public void setTransacciones(List<String> t) {
    this.transacciones = t;
  }
}

// ✅ BIEN: API orientada a comportamiento
public class CuentaBancaria {
  private double saldo;
  private List<String> transacciones;

  public boolean depositar(double monto) {
    if (monto > 0) {
      saldo += monto;
      transacciones.add("Depósito: " + monto);
      return true;
    }
    return false;
  }

  public boolean retirar(double monto) {
    if (monto > 0 && monto <= saldo) {
      saldo -= monto;
      transacciones.add("Retiro: " + monto);
      return true;
    }
    return false;
  }

  public double consultarSaldo() {
    return saldo;
  }

  public List<String> obtenerHistorial() {
    return Collections.unmodifiableList(transacciones);
  }
}
```

### Anti-patrón 4: Feature Envy

```java
// ❌ MAL: Una clase accede demasiado a datos de otra
public class CalculadoraFactura {
  public double calcular(Cliente cliente) {
    double subtotal = cliente.getSubtotal();
    double descuento = cliente.getDescuento();
    double impuesto = cliente.getImpuesto();
    return subtotal - descuento + impuesto;
  }
}

// ✅ BIEN: La clase se encarga de sus propios datos
public class Cliente {
  private double subtotal;
  private double descuento;
  private double impuesto;

  public double calcularTotal() {
    return subtotal - descuento + impuesto;
  }
}
```

---

## Checklist de Buenas Prácticas

### Al Diseñar una Clase

- [ ] ¿Todos los atributos son privados?
- [ ] ¿La clase tiene una responsabilidad clara y única?
- [ ] ¿Los nombres de la clase y métodos son descriptivos?
- [ ] ¿Hay constantes que deberían ser `static final`?
- [ ] ¿Los getters/setters son realmente necesarios?

### Al Implementar Constructores

- [ ] ¿Hay validación de parámetros?
- [ ] ¿Se usan múltiples constructores apropiadamente?
- [ ] ¿Se usa `this()` para evitar duplicación?
- [ ] ¿El constructor inicializa todos los atributos?
- [ ] ¿Se documentan los constructores públicos?

### Al Crear Getters/Setters

- [ ] ¿Los setters validan los datos?
- [ ] ¿Los getters de colecciones retornan copias?
- [ ] ¿Los nombres siguen la convención Java?
- [ ] ¿Se usa `is` para booleanos?
- [ ] ¿Se necesitan realmente o debería ser un método de negocio?

### Al Exponer API Pública

- [ ] ¿Los métodos públicos están documentados con Javadoc?
- [ ] ¿Los métodos auxiliares son privados?
- [ ] ¿Se validan los argumentos de métodos públicos?
- [ ] ¿Se usan excepciones para errores graves?
- [ ] ¿La API es intuitiva y fácil de usar?

### Al Validar Datos

- [ ] ¿Se valida en constructores Y setters?
- [ ] ¿Se lanzan excepciones apropiadas?
- [ ] ¿Los mensajes de error son descriptivos?
- [ ] ¿Se validan nulos cuando aplica?
- [ ] ¿Se validan rangos de valores?

---

## Ejemplos Completos

### Ejemplo 1: Clase Bien Encapsulada

```java
/**
 * Representa un vehículo en un sistema de gestión de flota.
 */
public class Vehiculo {
  // Atributos privados
  private String placa;
  private String marca;
  private String modelo;
  private int anio;
  private double kilometraje;
  private boolean disponible;

  // Constructor con validación
  public Vehiculo(String placa, String marca, String modelo, int anio) {
    setPlaca(placa);
    setMarca(marca);
    setModelo(modelo);
    setAnio(anio);
    this.kilometraje = 0.0;
    this.disponible = true;
  }

  // Getters
  public String getPlaca() {
    return placa;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAnio() {
    return anio;
  }

  public double getKilometraje() {
    return kilometraje;
  }

  public boolean isDisponible() {
    return disponible;
  }

  // Setters con validación
  public void setPlaca(String placa) {
    if (placa == null || placa.trim().length() != 6) {
      throw new IllegalArgumentException("Placa debe tener 6 caracteres");
    }
    this.placa = placa.trim().toUpperCase();
  }

  public void setMarca(String marca) {
    if (marca == null || marca.trim().isEmpty()) {
      throw new IllegalArgumentException("Marca no puede estar vacía");
    }
    this.marca = marca.trim();
  }

  public void setModelo(String modelo) {
    if (modelo == null || modelo.trim().isEmpty()) {
      throw new IllegalArgumentException("Modelo no puede estar vacío");
    }
    this.modelo = modelo.trim();
  }

  public void setAnio(int anio) {
    int anioActual = java.time.Year.now().getValue();
    if (anio < 1900 || anio > anioActual + 1) {
      throw new IllegalArgumentException("Año inválido: " + anio);
    }
    this.anio = anio;
  }

  // Métodos de negocio
  public void registrarViaje(double kilometros) {
    if (kilometros <= 0) {
      throw new IllegalArgumentException("Kilómetros debe ser positivo");
    }
    if (!disponible) {
      throw new IllegalStateException("Vehículo no está disponible");
    }
    this.kilometraje += kilometros;
  }

  public void marcarComoOcupado() {
    this.disponible = false;
  }

  public void marcarComoDisponible() {
    this.disponible = true;
  }

  public int calcularEdad() {
    return java.time.Year.now().getValue() - anio;
  }

  public boolean necesitaMantenimiento() {
    return kilometraje > 10000;
  }

  @Override
  public String toString() {
    return String.format("Vehículo[%s %s %s (%d), %.1f km, %s]",
        marca, modelo, placa, anio, kilometraje,
        disponible ? "Disponible" : "Ocupado");
  }
}
```

### Ejemplo 2: Clase Inmutable

```java
/**
 * Representa una fecha inmutable.
 */
public record Fecha(int dia, int mes, int anio) {
  public Fecha {
    if (!esValida(dia, mes, anio)) {
      throw new IllegalArgumentException("Fecha inválida");
    }
  }

  // No hay setters - objeto inmutable

  public Fecha agregarDias(int dias) {
    // Crea nueva instancia
    int nuevoDia = dia + dias;
    // Lógica simplificada
    return new Fecha(nuevoDia, mes, anio);
  }

  private boolean esValida(int d, int m, int a) {
    return d >= 1 && d <= 31 && m >= 1 && m <= 12 && a > 0;
  }

  @Override
  public String toString() {
    return String.format("%02d/%02d/%04d", dia, mes, anio);
  }
}
```

---

## Resumen

### Las 10 Reglas de Oro

1. **Atributos privados** siempre
2. **Validar** en constructores y setters
3. **Mínima visibilidad** por defecto
4. **Documentar** API pública
5. **Retornar copias** de colecciones
6. **Evitar** getters/setters innecesarios
7. **Preferir métodos de negocio** sobre getters/setters
8. **Usar `this()`** para evitar duplicación
9. **Inmutabilidad** cuando sea posible
10. **Responsabilidad única** por clase

---

**Siguiente:** [Ejercicios Prácticos](../2-practica/README.md)

