# Ejercicio 5: Sistema de Empleados con Jerarquía Compleja

## 📋 Información del Ejercicio

- **Dificultad:** ⭐⭐⭐⭐ Avanzado
- **Duración estimada:** 60 minutos
- **Objetivo:** Crear un sistema empresarial completo con cálculo de salarios y bonos

---

## 🎯 Objetivos de Aprendizaje

Al completar este ejercicio, podrás:

1. Diseñar sistemas orientados a objetos complejos
2. Implementar cálculos polimórficos (salarios variables)
3. Aplicar todos los conceptos de herencia en un proyecto realista
4. Practicar buenas prácticas de diseño orientado a objetos
5. Crear métodos abstractos simulados con sobrescritura obligatoria

---

## 📝 Enunciado

Desarrolla un **Sistema de Gestión de Empleados** para una empresa tecnológica que debe:

1. Gestionar diferentes tipos de empleados con diferentes esquemas de pago
2. Calcular salarios automáticamente según el rol
3. Generar reportes de nómina
4. Aplicar bonos y deducciones

### Jerarquía de Clases

```
                    Empleado
                       │
        ┌──────────────┼──────────────┐
        │              │              │
   Desarrollador   Designer      Gerente
                                      │
                              ┌───────┴───────┐
                              │               │
                       GerenteProyecto  GerenteArea
```

---

## 📋 Especificaciones Detalladas

### Clase Empleado (Base)

**Atributos protected:**
- `id` (String)
- `nombre` (String)
- `apellido` (String)
- `email` (String)
- `salarioBase` (double)
- `añosExperiencia` (int)

**Constructor:**
- Inicializa todos los atributos
- Genera email automáticamente: `nombre.apellido@empresa.com`

**Métodos:**
```java
public double calcularSalario()
    // Salario base + bono por experiencia (2% por año)
    
public void mostrarInfo()
    // Muestra información básica del empleado
    
public String generarReporte()
    // Retorna String con resumen del empleado
```

---

### Clase Desarrollador extends Empleado

**Atributos private:**
- `lenguajePrincipal` (String)
- `nivel` (String) - "Junior", "Semi-Senior", "Senior"
- `proyectosCompletados` (int)

**Constructor:**
- Llama a super()
- Inicializa atributos propios

**Métodos:**
```java
@Override
public double calcularSalario()
    // Salario base + experiencia + bono por nivel:
    // Junior: +10%
    // Semi-Senior: +25%
    // Senior: +50%
    // + $100 por proyecto completado
    
public void programar()
    // "{nombre} está programando en {lenguaje}"
    
@Override
public void mostrarInfo()
    // super.mostrarInfo() + datos específicos
```

---

### Clase Designer extends Empleado

**Atributos private:**
- `especialidad` (String) - "UI", "UX", "Gráfico"
- `herramientas` (String[]) - Array de herramientas que domina
- `portfolioURL` (String)

**Métodos:**
```java
@Override
public double calcularSalario()
    // Salario base + experiencia + bono por herramientas:
    // +5% por cada herramienta dominada
    
public void diseñar()
    // "{nombre} está diseñando con {especialidad}"
    
public void mostrarHerramientas()
    // Lista todas las herramientas
```

---

### Clase Gerente extends Empleado

**Atributos protected:**
- `departamento` (String)
- `equipoACargo` (int)
- `bonoGerencial` (double)

**Métodos:**
```java
@Override
public double calcularSalario()
    // Salario base + experiencia + bono gerencial
    // + $200 por cada miembro del equipo
    
public void dirigirReunion()
    // "Gerente {nombre} dirigiendo reunión de {departamento}"
    
public double calcularBonoEquipo()
    // Calcula bono basado en tamaño del equipo
```

---

### Clase GerenteProyecto extends Gerente

**Atributos private:**
- `proyectosActivos` (int)
- `presupuestoTotal` (double)

**Métodos:**
```java
@Override
public double calcularSalario()
    // super.calcularSalario() + 
    // $500 por proyecto activo +
    // 0.5% del presupuesto total
    
public void asignarTarea(String tarea)
    // "Asignando tarea: {tarea}"
```

---

### Clase GerenteArea extends Gerente

**Atributos private:**
- `numeroDeGerentes` (int) - Gerentes bajo su supervisión
- `presupuestoAnual` (double)

**Métodos:**
```java
@Override
public double calcularSalario()
    // super.calcularSalario() +
    // $1000 por gerente supervisado +
    // 1% del presupuesto anual
    
public void aprobarPresupuesto(double monto)
    // Verifica si está dentro del presupuesto anual
```

---

## 📂 Estructura de Archivos

```
ejercicio-05-sistema-empleados/
├── README.md
├── Empleado.java
├── Desarrollador.java
├── Designer.java
├── Gerente.java
├── GerenteProyecto.java
├── GerenteArea.java
├── Empresa.java (clase auxiliar)
└── Main.java
```

---

## 🔨 Implementación Guiada

### Paso 1: Clase Empleado

```java
public class Empleado {
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected double salarioBase;
    protected int añosExperiencia;
    
    public Empleado(String id, String nombre, String apellido, 
                    double salarioBase, int añosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosExperiencia = añosExperiencia;
        this.email = generarEmail();
    }
    
    private String generarEmail() {
        return nombre.toLowerCase() + "." + apellido.toLowerCase() + "@empresa.com";
    }
    
    public double calcularSalario() {
        // Bono: 2% por año de experiencia
        double bonoExperiencia = salarioBase * (añosExperiencia * 0.02);
        return salarioBase + bonoExperiencia;
    }
    
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL EMPLEADO ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Experiencia: " + añosExperiencia + " años");
        System.out.println("Salario total: $" + String.format("%.2f", calcularSalario()));
    }
    
    public String generarReporte() {
        return String.format("%s | %s %s | $%.2f", 
                            id, nombre, apellido, calcularSalario());
    }
    
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getEmail() { return email; }
    public double getSalarioBase() { return salarioBase; }
    public int getAñosExperiencia() { return añosExperiencia; }
}
```

### Paso 2: Clase Desarrollador (Plantilla)

```java
public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private String nivel;  // "Junior", "Semi-Senior", "Senior"
    private int proyectosCompletados;
    
    public Desarrollador(String id, String nombre, String apellido,
                        double salarioBase, int añosExperiencia,
                        String lenguajePrincipal, String nivel,
                        int proyectosCompletados) {
        // TODO: Llamar a super()
        // TODO: Inicializar atributos propios
    }
    
    @Override
    public double calcularSalario() {
        // TODO: Obtener salario base con super.calcularSalario()
        // TODO: Calcular bono por nivel (switch o if-else)
        // TODO: Agregar $100 por proyecto completado
        // TODO: Retornar total
        return 0.0;
    }
    
    public void programar() {
        // TODO: Implementar
    }
    
    @Override
    public void mostrarInfo() {
        // TODO: Llamar a super.mostrarInfo()
        // TODO: Mostrar lenguaje, nivel y proyectos
    }
    
    // Getters
}
```

---

## ✅ Solución Completa

<details>
<summary>Click para ver Desarrollador.java completo</summary>

```java
public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private String nivel;
    private int proyectosCompletados;
    
    public Desarrollador(String id, String nombre, String apellido,
                        double salarioBase, int añosExperiencia,
                        String lenguajePrincipal, String nivel,
                        int proyectosCompletados) {
        super(id, nombre, apellido, salarioBase, añosExperiencia);
        this.lenguajePrincipal = lenguajePrincipal;
        this.nivel = nivel;
        this.proyectosCompletados = proyectosCompletados;
    }
    
    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        
        // Bono por nivel
        double bonoNivel = 0;
        switch (nivel) {
            case "Junior":
                bonoNivel = salarioBase * 0.10;
                break;
            case "Semi-Senior":
                bonoNivel = salarioBase * 0.25;
                break;
            case "Senior":
                bonoNivel = salarioBase * 0.50;
                break;
        }
        
        // Bono por proyectos
        double bonoProyectos = proyectosCompletados * 100;
        
        return salario + bonoNivel + bonoProyectos;
    }
    
    public void programar() {
        System.out.println(nombre + " está programando en " + lenguajePrincipal);
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Lenguaje: " + lenguajePrincipal);
        System.out.println("Nivel: " + nivel);
        System.out.println("Proyectos completados: " + proyectosCompletados);
    }
    
    public String getLenguajePrincipal() { return lenguajePrincipal; }
    public String getNivel() { return nivel; }
    public int getProyectosCompletados() { return proyectosCompletados; }
}
```

</details>

<details>
<summary>Click para ver Designer.java completo</summary>

```java
public class Designer extends Empleado {
    private String especialidad;
    private String[] herramientas;
    private String portfolioURL;
    
    public Designer(String id, String nombre, String apellido,
                   double salarioBase, int añosExperiencia,
                   String especialidad, String[] herramientas,
                   String portfolioURL) {
        super(id, nombre, apellido, salarioBase, añosExperiencia);
        this.especialidad = especialidad;
        this.herramientas = herramientas;
        this.portfolioURL = portfolioURL;
    }
    
    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        
        // Bono: 5% por cada herramienta
        double bonoHerramientas = salarioBase * (herramientas.length * 0.05);
        
        return salario + bonoHerramientas;
    }
    
    public void diseñar() {
        System.out.println(nombre + " está diseñando con especialidad en " + especialidad);
    }
    
    public void mostrarHerramientas() {
        System.out.print("Herramientas: ");
        for (int i = 0; i < herramientas.length; i++) {
            System.out.print(herramientas[i]);
            if (i < herramientas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: " + especialidad);
        mostrarHerramientas();
        System.out.println("Portfolio: " + portfolioURL);
    }
    
    public String getEspecialidad() { return especialidad; }
    public String[] getHerramientas() { return herramientas; }
    public String getPortfolioURL() { return portfolioURL; }
}
```

</details>

<details>
<summary>Click para ver GerenteProyecto.java y GerenteArea.java</summary>

### GerenteProyecto.java

```java
public class GerenteProyecto extends Gerente {
    private int proyectosActivos;
    private double presupuestoTotal;
    
    public GerenteProyecto(String id, String nombre, String apellido,
                          double salarioBase, int añosExperiencia,
                          String departamento, int equipoACargo, double bonoGerencial,
                          int proyectosActivos, double presupuestoTotal) {
        super(id, nombre, apellido, salarioBase, añosExperiencia,
              departamento, equipoACargo, bonoGerencial);
        this.proyectosActivos = proyectosActivos;
        this.presupuestoTotal = presupuestoTotal;
    }
    
    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        double bonoProyectos = proyectosActivos * 500;
        double bonoPresupuesto = presupuestoTotal * 0.005;
        return salario + bonoProyectos + bonoPresupuesto;
    }
    
    public void asignarTarea(String tarea) {
        System.out.println("Asignando tarea: " + tarea);
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Proyectos activos: " + proyectosActivos);
        System.out.println("Presupuesto total: $" + presupuestoTotal);
    }
    
    public int getProyectosActivos() { return proyectosActivos; }
    public double getPresupuestoTotal() { return presupuestoTotal; }
}
```

### GerenteArea.java

```java
public class GerenteArea extends Gerente {
    private int numeroDeGerentes;
    private double presupuestoAnual;
    
    public GerenteArea(String id, String nombre, String apellido,
                      double salarioBase, int añosExperiencia,
                      String departamento, int equipoACargo, double bonoGerencial,
                      int numeroDeGerentes, double presupuestoAnual) {
        super(id, nombre, apellido, salarioBase, añosExperiencia,
              departamento, equipoACargo, bonoGerencial);
        this.numeroDeGerentes = numeroDeGerentes;
        this.presupuestoAnual = presupuestoAnual;
    }
    
    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        double bonoGerentes = numeroDeGerentes * 1000;
        double bonoPresupuesto = presupuestoAnual * 0.01;
        return salario + bonoGerentes + bonoPresupuesto;
    }
    
    public void aprobarPresupuesto(double monto) {
        if (monto <= presupuestoAnual) {
            System.out.println("Presupuesto de $" + monto + " APROBADO");
        } else {
            System.out.println("Presupuesto de $" + monto + " RECHAZADO (excede límite)");
        }
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Gerentes supervisados: " + numeroDeGerentes);
        System.out.println("Presupuesto anual: $" + presupuestoAnual);
    }
    
    public int getNumeroDeGerentes() { return numeroDeGerentes; }
    public double getPresupuestoAnual() { return presupuestoAnual; }
}
```

</details>

<details>
<summary>Click para ver Main.java con casos de uso</summary>

```java
public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Desarrollador dev1 = new Desarrollador(
            "DEV001", "Juan", "Pérez", 3000, 2, "Java", "Junior", 5
        );
        
        Desarrollador dev2 = new Desarrollador(
            "DEV002", "Ana", "García", 4000, 5, "Python", "Senior", 15
        );
        
        Designer des1 = new Designer(
            "DES001", "Carlos", "López", 3500, 3,
            "UI/UX", new String[]{"Figma", "Adobe XD", "Sketch"}, "carlos-portfolio.com"
        );
        
        GerenteProyecto gp1 = new GerenteProyecto(
            "GP001", "María", "Rodríguez", 5000, 7,
            "Desarrollo", 8, 1000, 3, 150000
        );
        
        GerenteArea ga1 = new GerenteArea(
            "GA001", "Luis", "Martínez", 7000, 10,
            "TI", 25, 2000, 5, 500000
        );
        
        // Array polimórfico
        Empleado[] empresa = {dev1, dev2, des1, gp1, ga1};
        
        // Mostrar información de todos
        System.out.println("=== NÓMINA DE LA EMPRESA ===\n");
        double totalNomina = 0;
        
        for (Empleado emp : empresa) {
            emp.mostrarInfo();
            totalNomina += emp.calcularSalario();
            System.out.println();
        }
        
        System.out.println("TOTAL NÓMINA: $" + String.format("%.2f", totalNomina));
        
        // Acciones específicas
        System.out.println("\n=== ACCIONES ESPECÍFICAS ===\n");
        
        dev1.programar();
        dev2.programar();
        des1.diseñar();
        gp1.dirigirReunion();
        gp1.asignarTarea("Implementar módulo de pagos");
        ga1.dirigirReunion();
        ga1.aprobarPresupuesto(450000);
        ga1.aprobarPresupuesto(550000);
        
        // Reporte simple
        System.out.println("\n=== REPORTE DE EMPLEADOS ===\n");
        for (Empleado emp : empresa) {
            System.out.println(emp.generarReporte());
        }
    }
}
```

</details>

---

## 🧪 Casos de Prueba

### Test 1: Cálculo de Salarios
```java
Desarrollador devJunior = new Desarrollador(..., "Junior", 0);
Desarrollador devSenior = new Desarrollador(..., "Senior", 10);

// Senior debe ganar más que Junior
assertTrue(devSenior.calcularSalario() > devJunior.calcularSalario());
```

### Test 2: Herencia Multinivel
```java
GerenteArea ga = new GerenteArea(...);
// ga ES UN Gerente
// ga ES UN Empleado
// Tiene acceso a métodos de ambos
```

### Test 3: Polimorfismo en Nómina
```java
Empleado[] nomina = {new Desarrollador(...), new Designer(...), new Gerente(...)};
for (Empleado e : nomina) {
    double salario = e.calcularSalario();  // ✅ Polimorfismo
}
```

---

## ✅ Criterios de Evaluación

| Criterio | Puntos | Descripción |
|----------|--------|-------------|
| **Jerarquía completa** | 20 | Todas las clases correctamente implementadas |
| **Cálculo de salarios** | 25 | Lógica correcta en cada clase |
| **Sobrescritura** | 20 | Uso apropiado de super en métodos sobrescritos |
| **Encapsulación** | 15 | Modificadores de acceso correctos |
| **Funcionalidad** | 10 | Todos los métodos implementados |
| **Main con pruebas** | 10 | Demuestra todas las capacidades |

**Total:** 100 puntos

---

## 🚀 Desafíos Extra

### Nivel 1: Clase Empresa
```java
class Empresa {
    private Empleado[] empleados;
    
    public double calcularNominaTotal() { ... }
    public Empleado empleadoMejorPagado() { ... }
    public void darAumento(String id, double porcentaje) { ... }
}
```

### Nivel 2: Validaciones
- Salario base no puede ser negativo
- Años de experiencia no pueden ser negativos
- Nivel de desarrollador solo puede ser "Junior", "Semi-Senior", "Senior"

### Nivel 3: Interfaz Bonificable
```java
interface Bonificable {
    double calcularBonoAnual();
}

class GerenteProyecto extends Gerente implements Bonificable {
    public double calcularBonoAnual() {
        return proyectosActivos * 5000;
    }
}
```

---

## 💡 Reflexión

### Preguntas
1. ¿Por qué es útil tener calcularSalario() en cada clase?
2. ¿Cómo ayuda el polimorfismo en el cálculo de nómina?
3. ¿Por qué algunos atributos son protected y otros private?
4. ¿Qué ventajas tiene generar el email automáticamente?

---

## 📚 Recursos Relacionados

- **Teoría:** `/1-teoria/01-concepto-herencia.md`
- **Teoría:** `/1-teoria/05-buenas-practicas-herencia.md`
- **Ejercicio anterior:** `ejercicio-04-jerarquia-vehiculos`

---

**¡Éxito con el ejercicio!** 💼

Este ejercicio simula un sistema real de gestión de empleados. ¡Excelente práctica para proyectos empresariales!
