# Ejercicio 4: Jerarquía de Vehículos

## 📋 Información del Ejercicio

- **Dificultad:** ⭐⭐⭐ Intermedio-Avanzado
- **Duración estimada:** 45 minutos
- **Objetivo:** Crear una jerarquía compleja con múltiples ramas y polimorfismo

---

## 🎯 Objetivos de Aprendizaje

Al completar este ejercicio, podrás:

1. Diseñar jerarquías con múltiples ramas
2. Aplicar herencia en un contexto realista
3. Implementar polimorfismo básico
4. Usar arrays de tipo padre para almacenar hijos
5. Practicar encapsulación y herencia juntas

---

## 📝 Enunciado

Crea un sistema de gestión de vehículos para una empresa de transporte con la siguiente jerarquía:

```
                    Vehiculo
                       │
        ┌──────────────┼──────────────┐
        │              │              │
    Terrestre      Acuatico        Aereo
        │              │              │
   ┌────┴────┐         │         ┌────┴────┐
Auto    Motocicleta  Barco    Avion   Helicoptero
```

### Especificaciones de Clases

#### Clase Vehiculo (Raíz)
- **Atributos protected:**
  - `marca` (String)
  - `modelo` (String)
  - `año` (int)
  - `velocidadMaxima` (double) en km/h

- **Constructor:** Inicializa todos los atributos

- **Métodos:**
  - `mostrarInfo()`: Muestra toda la información básica
  - `acelerar()`: "{marca} {modelo} está acelerando"
  - `frenar()`: "{marca} {modelo} está frenando"

#### Clase Terrestre extends Vehiculo
- **Atributos protected:**
  - `numeroDeLlantas` (int)
  - `tipoCombustible` (String)

- **Constructor:** Usa super() + inicializa atributos propios

- **Métodos:**
  - `mostrarInfo()`: Override, llama a super + muestra llantas y combustible
  - `conducir()`: "Conduciendo por carretera con {numeroDeLlantas} llantas"

#### Clase Auto extends Terrestre
- **Atributos private:**
  - `numeroDePuertas` (int)
  - `tieneAireAcondicionado` (boolean)

- **Constructor:** Inicializa todo (usa super)

- **Métodos:**
  - `mostrarInfo()`: Override completo
  - `abrirPuertas()`: "Abriendo {numeroDePuertas} puertas"

#### Clase Motocicleta extends Terrestre
- **Atributos private:**
  - `tipo` (String) - deportiva, touring, etc.
  - `tieneMaletero` (boolean)

- **Constructor:** Inicializa todo

- **Métodos:**
  - `mostrarInfo()`: Override completo
  - `hacerCaballito()`: "¡Haciendo caballito!"

#### Clase Acuatico extends Vehiculo
- **Atributos protected:**
  - `capacidadPasajeros` (int)
  - `tipoPropulsion` (String)

- **Constructor:** Usa super()

- **Métodos:**
  - `mostrarInfo()`: Override
  - `navegar()`: "Navegando con propulsión {tipoPropulsion}"

#### Clase Barco extends Acuatico
- **Atributos private:**
  - `tieneVelas` (boolean)
  - `eslora` (double) en metros

- **Métodos:**
  - `mostrarInfo()`: Override completo
  - `anclar()`: "Echando ancla"

#### Clase Aereo extends Vehiculo
- **Atributos protected:**
  - `altitudMaxima` (double) en metros
  - `autonomia` (double) en km

- **Métodos:**
  - `mostrarInfo()`: Override
  - `despegar()`: "Despegando hacia {altitudMaxima}m"
  - `aterrizar()`: "Aterrizando"

#### Clase Avion extends Aereo
- **Atributos private:**
  - `numeroDeMotores` (int)
  - `clase` (String) - comercial, carga, privado

- **Métodos:**
  - `mostrarInfo()`: Override completo

#### Clase Helicoptero extends Aereo
- **Atributos private:**
  - `numeroDeRotores` (int)
  - `capacidadCarga` (double) en kg

- **Métodos:**
  - `mostrarInfo()`: Override completo
  - `volarEstacionario()`: "Volando en punto fijo"

---

## 📂 Estructura de Archivos

```
ejercicio-04-jerarquia-vehiculos/
├── README.md
├── Vehiculo.java
├── Terrestre.java
├── Auto.java
├── Motocicleta.java
├── Acuatico.java
├── Barco.java
├── Aereo.java
├── Avion.java
├── Helicoptero.java
└── Main.java
```

---

## 🔨 Plantilla de Código

### Vehiculo.java (Completo)

```java
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double velocidadMaxima;
    
    public Vehiculo(String marca, String modelo, int año, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL VEHÍCULO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
    
    public void acelerar() {
        System.out.println(marca + " " + modelo + " está acelerando");
    }
    
    public void frenar() {
        System.out.println(marca + " " + modelo + " está frenando");
    }
    
    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
    public double getVelocidadMaxima() { return velocidadMaxima; }
}
```

### Auto.java (Plantilla)

```java
public class Auto extends Terrestre {
    private int numeroDePuertas;
    private boolean tieneAireAcondicionado;
    
    // TODO: Constructor completo
    public Auto(String marca, String modelo, int año, double velocidadMaxima,
                int numeroDeLlantas, String tipoCombustible,
                int numeroDePuertas, boolean tieneAireAcondicionado) {
        // TODO: Llamar a super()
        // TODO: Inicializar atributos propios
    }
    
    @Override
    public void mostrarInfo() {
        // TODO: Llamar a super.mostrarInfo()
        // TODO: Mostrar puertas y aire acondicionado
    }
    
    public void abrirPuertas() {
        // TODO: Implementar
    }
    
    // Getters
}
```

---

## ✅ Solución Parcial (Clases Clave)

<details>
<summary>Click para ver solución de Terrestre y Auto</summary>

### Terrestre.java

```java
public class Terrestre extends Vehiculo {
    protected int numeroDeLlantas;
    protected String tipoCombustible;
    
    public Terrestre(String marca, String modelo, int año, double velocidadMaxima,
                     int numeroDeLlantas, String tipoCombustible) {
        super(marca, modelo, año, velocidadMaxima);
        this.numeroDeLlantas = numeroDeLlantas;
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de llantas: " + numeroDeLlantas);
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }
    
    public void conducir() {
        System.out.println("Conduciendo por carretera con " + numeroDeLlantas + " llantas");
    }
    
    public int getNumeroDeLlantas() { return numeroDeLlantas; }
    public String getTipoCombustible() { return tipoCombustible; }
}
```

### Auto.java

```java
public class Auto extends Terrestre {
    private int numeroDePuertas;
    private boolean tieneAireAcondicionado;
    
    public Auto(String marca, String modelo, int año, double velocidadMaxima,
                int numeroDeLlantas, String tipoCombustible,
                int numeroDePuertas, boolean tieneAireAcondicionado) {
        super(marca, modelo, año, velocidadMaxima, numeroDeLlantas, tipoCombustible);
        this.numeroDePuertas = numeroDePuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroDePuertas);
        System.out.println("Aire acondicionado: " + (tieneAireAcondicionado ? "Sí" : "No"));
    }
    
    public void abrirPuertas() {
        System.out.println("Abriendo " + numeroDePuertas + " puertas");
    }
    
    public int getNumeroDePuertas() { return numeroDePuertas; }
    public boolean isTieneAireAcondicionado() { return tieneAireAcondicionado; }
}
```

### Motocicleta.java

```java
public class Motocicleta extends Terrestre {
    private String tipo;
    private boolean tieneMaletero;
    
    public Motocicleta(String marca, String modelo, int año, double velocidadMaxima,
                       int numeroDeLlantas, String tipoCombustible,
                       String tipo, boolean tieneMaletero) {
        super(marca, modelo, año, velocidadMaxima, numeroDeLlantas, tipoCombustible);
        this.tipo = tipo;
        this.tieneMaletero = tieneMaletero;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: " + tipo);
        System.out.println("Maletero: " + (tieneMaletero ? "Sí" : "No"));
    }
    
    public void hacerCaballito() {
        System.out.println("¡Haciendo caballito!");
    }
    
    public String getTipo() { return tipo; }
    public boolean isTieneMaletero() { return tieneMaletero; }
}
```

</details>

<details>
<summary>Click para ver Main.java completo</summary>

```java
public class Main {
    public static void main(String[] args) {
        // Crear vehículos de cada tipo
        Auto auto = new Auto("Toyota", "Corolla", 2023, 180.0, 4, "Gasolina", 4, true);
        Motocicleta moto = new Motocicleta("Yamaha", "R1", 2022, 280.0, 2, "Gasolina", "Deportiva", false);
        Barco barco = new Barco("Beneteau", "Oceanis", 2021, 25.0, 8, "Motor", true, 15.5);
        Avion avion = new Avion("Boeing", "737", 2020, 850.0, 12000.0, 6000.0, 2, "Comercial");
        Helicoptero heli = new Helicoptero("Bell", "407", 2019, 240.0, 4500.0, 500.0, 1, 1500.0);
        
        // Array polimórfico
        Vehiculo[] flota = {auto, moto, barco, avion, heli};
        
        System.out.println("=== FLOTA DE VEHÍCULOS ===\n");
        
        for (int i = 0; i < flota.length; i++) {
            System.out.println("\n--- Vehículo " + (i + 1) + " ---");
            flota[i].mostrarInfo();
            flota[i].acelerar();
            flota[i].frenar();
            System.out.println();
        }
        
        // Pruebas específicas
        System.out.println("=== ACCIONES ESPECÍFICAS ===\n");
        
        System.out.println("Auto:");
        auto.conducir();
        auto.abrirPuertas();
        
        System.out.println("\nMotocicleta:");
        moto.conducir();
        moto.hacerCaballito();
        
        System.out.println("\nBarco:");
        barco.navegar();
        barco.anclar();
        
        System.out.println("\nAvión:");
        avion.despegar();
        avion.aterrizar();
        
        System.out.println("\nHelicóptero:");
        heli.despegar();
        heli.volarEstacionario();
        heli.aterrizar();
    }
}
```

</details>

---

## 🧪 Casos de Prueba

### Test 1: Polimorfismo
```java
Vehiculo v1 = new Auto(...);
Vehiculo v2 = new Barco(...);
Vehiculo v3 = new Avion(...);

v1.mostrarInfo();  // ✅ Llama a Auto.mostrarInfo()
v2.acelerar();     // ✅ Método heredado de Vehiculo
```

### Test 2: Cadena de Herencia
```java
Auto auto = new Auto(...);
// auto ES UN Terrestre
// auto ES UN Vehiculo
// Tiene acceso a métodos de ambos
```

### Test 3: Array Polimórfico
```java
Vehiculo[] flota = new Vehiculo[3];
flota[0] = new Auto(...);
flota[1] = new Barco(...);
flota[2] = new Avion(...);

for (Vehiculo v : flota) {
    v.mostrarInfo();  // ✅ Polimorfismo en acción
}
```

---

## ✅ Criterios de Evaluación

| Criterio | Puntos | Descripción |
|----------|--------|-------------|
| **Jerarquía correcta** | 25 | Todas las clases heredan correctamente |
| **Constructores con super()** | 20 | Todos llaman apropiadamente a super() |
| **Sobrescritura** | 20 | Métodos sobrescritos correctamente con @Override |
| **Encapsulación** | 15 | Modificadores de acceso apropiados |
| **Polimorfismo** | 10 | Array de Vehiculo funciona correctamente |
| **Funcionalidad** | 10 | Todos los métodos implementados |

**Total:** 100 puntos

---

## 📊 Diagrama de Clases Completo

```
                      Vehiculo
                    ┌──────────────┐
                    │ - marca      │
                    │ - modelo     │
                    │ - año        │
                    │ - velocidadMax│
                    └───────┬──────┘
                            │
          ┌─────────────────┼─────────────────┐
          │                 │                 │
      Terrestre         Acuatico           Aereo
    ┌───────────┐     ┌───────────┐    ┌───────────┐
    │ - llantas │     │ - pasajeros│    │ - altitud │
    │ - combustible│   │ - propulsion│   │ - autonomia│
    └─────┬─────┘     └─────┬─────┘    └─────┬─────┘
          │                 │                 │
    ┌─────┴─────┐           │           ┌─────┴─────┐
    │           │           │           │           │
  Auto    Motocicleta    Barco       Avion    Helicoptero
```

---

## 🚀 Desafíos Extra

### Nivel 1: Método calcularCostoMantenimiento()
Implementa en cada clase según el tipo:
- Auto: $500 base
- Motocicleta: $300 base
- Barco: $1000 base
- Avión: $5000 base
- Helicóptero: $3000 base

### Nivel 2: Interface Electrico
```java
interface Electrico {
    double getBateriaCapacidad();
    void cargarBateria();
}

class AutoElectrico extends Auto implements Electrico {
    // Implementación
}
```

### Nivel 3: Sistema de Alquiler
Crea una clase `SistemaAlquiler` que gestione la flota:
- `alquilarVehiculo(String tipo)`
- `devolverVehiculo(Vehiculo v)`
- `mostrarDisponibles()`

---

## 💡 Conceptos Clave

### Jerarquía Multinivel y Multirrama
Este ejercicio demuestra:
1. **Multinivel**: Vehiculo → Terrestre → Auto (3 niveles)
2. **Multirrama**: Vehiculo tiene 3 hijos directos

### Polimorfismo
```java
Vehiculo v = new Auto(...);  // ✅ Auto ES UN Vehiculo
v.mostrarInfo();             // Llama a Auto.mostrarInfo()
```

### Ventajas de esta Jerarquía
- **Reutilización**: Código común en clases padres
- **Organización**: Estructura lógica clara
- **Extensibilidad**: Fácil agregar nuevos vehículos
- **Polimorfismo**: Tratar todos como Vehiculo cuando sea necesario

---

## 📚 Recursos Relacionados

- **Teoría:** `/1-teoria/03-jerarquias-clases.md`
- **Teoría:** `/1-teoria/05-buenas-practicas-herencia.md`
- **Ejercicio anterior:** `ejercicio-03-uso-super`

---

**¡Éxito con el ejercicio!** 🚗🚤✈️

Este es uno de los ejercicios más completos de la semana. Tómate tu tiempo y construye cada clase paso a paso.
