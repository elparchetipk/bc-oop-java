# Ejercicios Semanales Evaluables - Semana 05

## 📋 Información General

**Semana:** 05 - Polimorfismo  
**Tipo:** Refinamiento del polimorfismo en jerarquía existente  
**Peso en la evaluación:** 70% de la nota semanal  
**Fecha límite:** Domingo 23:59 de la Semana 05  
**Formato de entrega:** Repositorio GitHub (mismo repositorio)

---

## 🎯 Objetivo

Aplicar polimorfismo en profundidad mediante sobrecarga de métodos (overloading), sobrescritura avanzada (overriding), y métodos polimórficos en el gestor del sistema.

---

## 🔄 Continuidad del Proyecto

Esta semana **refinamos** el uso de polimorfismo en la jerarquía existente.

| Semana | Acción | Enfoque |
|--------|--------|---------|
| 01 | Crear 2 clases básicas | Fundamentos |
| 02 | Agregar 3ra clase + Gestor | Arrays y gestión |
| 03 | Refactorizar (encapsulación) | Calidad de código |
| 04 | Agregar herencia | Jerarquías |
| 05 | Refinar polimorfismo | Flexibilidad y reutilización |

---

## 📝 Ejercicios Obligatorios

### Ejercicio 1: Sobrecarga de Métodos (Overloading) (25 puntos)

**Descripción:**  
Implementa métodos sobrecargados en superclase y subclases para proporcionar múltiples formas de realizar operaciones.

**Concepto:** Sobrecarga = Mismo nombre de método, diferentes parámetros (cantidad o tipo).

---

#### 1.1 Sobrecarga en Superclase

**Ejemplo: Clase Curso**

```java
/**
 * Clase base con métodos sobrecargados
 * @author [Tu Nombre]
 * @version 4.0 (Semana 05)
 */
public class Curso {
    private final String codigoCurso;
    private String nombreCurso;
    private int duracionHoras;
    private String instructor;
    private double costoBase;
    private boolean activo;
    
    // Constructores existentes...
    
    // ===== MÉTODOS SOBRECARGADOS =====
    
    /**
     * Actualiza información básica (solo nombre)
     * @param nombre Nuevo nombre del curso
     */
    public void actualizar(String nombre) {
        setNombreCurso(nombre);
        System.out.println("✓ Nombre actualizado");
    }
    
    /**
     * Actualiza nombre e instructor
     * @param nombre Nuevo nombre
     * @param instructor Nuevo instructor
     */
    public void actualizar(String nombre, String instructor) {
        setNombreCurso(nombre);
        setInstructor(instructor);
        System.out.println("✓ Nombre e instructor actualizados");
    }
    
    /**
     * Actualiza información completa
     * @param nombre Nuevo nombre
     * @param instructor Nuevo instructor
     * @param horas Nueva duración
     */
    public void actualizar(String nombre, String instructor, int horas) {
        setNombreCurso(nombre);
        setInstructor(instructor);
        setDuracionHoras(horas);
        System.out.println("✓ Información completa actualizada");
    }
    
    // ===== SOBRECARGA CON DIFERENTES TIPOS =====
    
    /**
     * Aplica descuento en porcentaje
     * @param porcentaje Porcentaje de descuento (0-100)
     * @return Costo con descuento aplicado
     */
    public double aplicarDescuento(int porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("Porcentaje debe estar entre 0 y 100");
        }
        double descuento = calcularCosto() * (porcentaje / 100.0);
        return calcularCosto() - descuento;
    }
    
    /**
     * Aplica descuento en valor fijo
     * @param montoDescuento Monto fijo a descontar
     * @return Costo con descuento aplicado
     */
    public double aplicarDescuento(double montoDescuento) {
        if (montoDescuento < 0) {
            throw new IllegalArgumentException("Descuento no puede ser negativo");
        }
        double costoFinal = calcularCosto() - montoDescuento;
        return costoFinal > 0 ? costoFinal : 0;
    }
    
    /**
     * Aplica descuento personalizado (porcentaje + límite)
     * @param porcentaje Porcentaje de descuento
     * @param limiteMaximo Descuento máximo en pesos
     * @return Costo con descuento aplicado
     */
    public double aplicarDescuento(int porcentaje, double limiteMaximo) {
        double descuentoPorcentaje = calcularCosto() * (porcentaje / 100.0);
        double descuentoFinal = Math.min(descuentoPorcentaje, limiteMaximo);
        return calcularCosto() - descuentoFinal;
    }
    
    // ===== SOBRECARGA CON OBJETOS =====
    
    /**
     * Compara con otro curso por nombre
     * @param otro Curso a comparar
     * @return true si tienen el mismo nombre
     */
    public boolean esIgualA(Curso otro) {
        if (otro == null) return false;
        return this.nombreCurso.equalsIgnoreCase(otro.nombreCurso);
    }
    
    /**
     * Compara con otro curso según criterio
     * @param otro Curso a comparar
     * @param criterio "nombre", "duracion", "costo"
     * @return true si son iguales según el criterio
     */
    public boolean esIgualA(Curso otro, String criterio) {
        if (otro == null) return false;
        
        switch (criterio.toLowerCase()) {
            case "nombre":
                return this.nombreCurso.equalsIgnoreCase(otro.nombreCurso);
            case "duracion":
                return this.duracionHoras == otro.duracionHoras;
            case "costo":
                return Math.abs(this.calcularCosto() - otro.calcularCosto()) < 0.01;
            default:
                throw new IllegalArgumentException("Criterio inválido: " + criterio);
        }
    }
    
    // Métodos existentes (calcularCosto, toString, etc.)...
}
```

---

#### 1.2 Sobrecarga en Subclases

**Ejemplo: CursoVirtual**

```java
/**
 * Sobrecarga específica de cursos virtuales
 */
public class CursoVirtual extends Curso {
    private String plataforma;
    private String enlaceAcceso;
    private boolean requiereKit;
    private int limiteConexiones;
    
    // Constructores y métodos existentes...
    
    // ===== SOBRECARGA ESPECÍFICA =====
    
    /**
     * Genera enlace de acceso sin parámetros (genera automático)
     * @return Enlace generado
     */
    public String generarEnlace() {
        this.enlaceAcceso = "https://" + plataforma.toLowerCase() + 
                           ".com/j/" + System.currentTimeMillis();
        return this.enlaceAcceso;
    }
    
    /**
     * Genera enlace personalizado
     * @param sala Número de sala
     * @return Enlace generado
     */
    public String generarEnlace(int sala) {
        this.enlaceAcceso = "https://" + plataforma.toLowerCase() + 
                           ".com/j/" + sala;
        return this.enlaceAcceso;
    }
    
    /**
     * Genera enlace con contraseña
     * @param sala Número de sala
     * @param password Contraseña de acceso
     * @return Enlace con password
     */
    public String generarEnlace(int sala, String password) {
        this.enlaceAcceso = "https://" + plataforma.toLowerCase() + 
                           ".com/j/" + sala + "?pwd=" + password;
        return this.enlaceAcceso;
    }
    
    // ===== SOBRECARGA DE MÉTODOS HEREDADOS =====
    
    /**
     * Versión sobrecargada de actualizar con parámetro de plataforma
     * @param nombre Nuevo nombre
     * @param instructor Nuevo instructor
     * @param plataforma Nueva plataforma
     */
    public void actualizar(String nombre, String instructor, String plataforma) {
        super.actualizar(nombre, instructor);  // Llama versión de superclase
        setPlataforma(plataforma);
        System.out.println("✓ Plataforma también actualizada");
    }
}
```

**Ejemplo: CursoPresencial**

```java
/**
 * Sobrecarga específica de cursos presenciales
 */
public class CursoPresencial extends Curso {
    private String salon;
    private String sede;
    private int capacidadMaxima;
    private String horario;
    
    // ===== SOBRECARGA ESPECÍFICA =====
    
    /**
     * Asigna salón por código
     * @param codigoSalon Código del salón (ej: "S301")
     */
    public void asignarSalon(String codigoSalon) {
        this.salon = codigoSalon;
        System.out.println("✓ Salón asignado: " + codigoSalon);
    }
    
    /**
     * Asigna salón con sede
     * @param codigoSalon Código del salón
     * @param sede Sede donde está el salón
     */
    public void asignarSalon(String codigoSalon, String sede) {
        this.salon = codigoSalon;
        this.sede = sede;
        System.out.println("✓ Salón " + codigoSalon + " asignado en sede " + sede);
    }
    
    /**
     * Asigna salón completo con capacidad
     * @param codigoSalon Código del salón
     * @param sede Sede
     * @param capacidad Capacidad del salón
     */
    public void asignarSalon(String codigoSalon, String sede, int capacidad) {
        this.salon = codigoSalon;
        this.sede = sede;
        this.capacidadMaxima = capacidad;
        System.out.println("✓ Salón " + codigoSalon + " (" + capacidad + 
                          " personas) asignado en " + sede);
    }
    
    /**
     * Versión sobrecargada incluyendo horario
     */
    public void actualizar(String nombre, String instructor, String salon, String horario) {
        super.actualizar(nombre, instructor);
        this.salon = salon;
        this.horario = horario;
        System.out.println("✓ Salón y horario también actualizados");
    }
}
```

**Criterios de evaluación:**
- ✅ Mínimo 3 métodos sobrecargados en superclase (10 pts)
- ✅ Mínimo 2 métodos sobrecargados por subclase (10 pts)
- ✅ Sobrecarga con diferentes tipos de parámetros (3 pts)
- ✅ JavaDoc completo en métodos sobrecargados (2 pts)

**Total:** 25 puntos

---

### Ejercicio 2: Sobrescritura Avanzada con super (25 puntos)

**Descripción:**  
Sobrescribe métodos de forma avanzada, incluyendo equals(), hashCode() y métodos de comparación.

---

#### 2.1 Sobrescritura de equals() y hashCode()

**En Superclase:**

```java
public class Curso {
    private final String codigoCurso;
    private String nombreCurso;
    // ... otros atributos
    
    /**
     * Compara dos cursos por igualdad
     * Dos cursos son iguales si tienen el mismo código
     * @param obj Objeto a comparar
     * @return true si son el mismo curso
     */
    @Override
    public boolean equals(Object obj) {
        // 1. Verificar si es la misma referencia
        if (this == obj) return true;
        
        // 2. Verificar si es null o clase diferente
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // 3. Hacer cast y comparar atributos
        Curso otro = (Curso) obj;
        return codigoCurso.equals(otro.codigoCurso);
    }
    
    /**
     * Genera código hash basado en el código del curso
     * @return Código hash
     */
    @Override
    public int hashCode() {
        return codigoCurso.hashCode();
    }
}
```

**En Subclases:**

```java
public class CursoVirtual extends Curso {
    private String plataforma;
    private String enlaceAcceso;
    
    /**
     * Dos cursos virtuales son iguales si tienen mismo código Y misma plataforma
     */
    @Override
    public boolean equals(Object obj) {
        // Primero usar equals de la superclase
        if (!super.equals(obj)) return false;
        
        // Luego verificar atributos específicos
        if (!(obj instanceof CursoVirtual)) return false;
        
        CursoVirtual otro = (CursoVirtual) obj;
        return plataforma.equalsIgnoreCase(otro.plataforma);
    }
    
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + plataforma.hashCode();
        return result;
    }
}
```

---

#### 2.2 Implementar Comparable para Ordenamiento

**En Superclase:**

```java
public class Curso implements Comparable<Curso> {
    // Atributos...
    
    /**
     * Compara cursos por duración (para ordenamiento)
     * @param otro Curso a comparar
     * @return negativo si este es menor, 0 si igual, positivo si mayor
     */
    @Override
    public int compareTo(Curso otro) {
        // Ordenar por duración de horas
        return Integer.compare(this.duracionHoras, otro.duracionHoras);
    }
    
    /**
     * Compara por criterio específico
     * @param otro Curso a comparar
     * @param criterio "duracion", "costo", "nombre"
     * @return resultado de comparación
     */
    public int compararPor(Curso otro, String criterio) {
        switch (criterio.toLowerCase()) {
            case "duracion":
                return Integer.compare(this.duracionHoras, otro.duracionHoras);
            case "costo":
                return Double.compare(this.calcularCosto(), otro.calcularCosto());
            case "nombre":
                return this.nombreCurso.compareToIgnoreCase(otro.nombreCurso);
            default:
                throw new IllegalArgumentException("Criterio inválido: " + criterio);
        }
    }
}
```

---

#### 2.3 Sobrescritura de Métodos de Negocio

**Método avanzado de cálculo:**

```java
// En superclase
public class Curso {
    protected double costoBase;
    protected int duracionHoras;
    
    /**
     * Calcula costo total del curso
     * @return Costo base por horas
     */
    public double calcularCosto() {
        return costoBase * duracionHoras;
    }
    
    /**
     * Calcula costo con descuento por pronto pago
     * @param diasAnticipacion Días de anticipación del pago
     * @return Costo con descuento aplicado
     */
    public double calcularCostoConDescuento(int diasAnticipacion) {
        double costo = calcularCosto();
        
        if (diasAnticipacion >= 30) {
            return costo * 0.85;  // 15% descuento
        } else if (diasAnticipacion >= 15) {
            return costo * 0.92;  // 8% descuento
        } else if (diasAnticipacion >= 7) {
            return costo * 0.95;  // 5% descuento
        }
        
        return costo;
    }
}

// En CursoVirtual
public class CursoVirtual extends Curso {
    
    /**
     * Sobrescribe cálculo base (ya tiene 15% descuento por ser virtual)
     */
    @Override
    public double calcularCosto() {
        double costoBase = super.calcularCosto();
        return costoBase * 0.85;  // 15% descuento base por ser virtual
    }
    
    /**
     * Sobrescribe descuento - virtuales tienen mejor descuento
     */
    @Override
    public double calcularCostoConDescuento(int diasAnticipacion) {
        double costoBase = super.calcularCosto();  // Costo SIN descuento virtual
        double costoVirtual = calcularCosto();     // Costo CON descuento virtual
        
        // Aplicar descuento adicional sobre el ya reducido
        if (diasAnticipacion >= 30) {
            return costoVirtual * 0.80;  // 20% adicional
        } else if (diasAnticipacion >= 15) {
            return costoVirtual * 0.88;  // 12% adicional
        } else if (diasAnticipacion >= 7) {
            return costoVirtual * 0.93;  // 7% adicional
        }
        
        return costoVirtual;
    }
}

// En CursoPresencial
public class CursoPresencial extends Curso {
    private double recargoInstalaciones = 50000;
    
    @Override
    public double calcularCosto() {
        return super.calcularCosto() + recargoInstalaciones;
    }
    
    /**
     * Presenciales no tienen descuento extra, usan el de la superclase
     * pero calculado sobre el costo con recargo
     */
    @Override
    public double calcularCostoConDescuento(int diasAnticipacion) {
        // Usa la lógica de la superclase pero sobre el costo ajustado
        double costoConRecargo = calcularCosto();
        double costoBaseSinRecargo = super.calcularCosto();
        
        // Aplicar descuento solo sobre el costo base, no sobre el recargo
        double descuento = super.calcularCostoConDescuento(diasAnticipacion);
        double porcentajeDescuento = descuento / costoBaseSinRecargo;
        
        return costoConRecargo * porcentajeDescuento;
    }
}
```

---

#### 2.4 Método mostrarInformacion() Polimórfico

```java
// En superclase
public class Curso {
    /**
     * Muestra información básica del curso
     */
    public void mostrarInformacion() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("  INFORMACIÓN DEL CURSO");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println("Código: " + codigoCurso);
        System.out.println("Nombre: " + nombreCurso);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Instructor: " + instructor);
        System.out.println("Costo: $" + String.format("%.2f", calcularCosto()));
        System.out.println("Estado: " + (activo ? "Activo" : "Inactivo"));
    }
}

// En CursoVirtual
public class CursoVirtual extends Curso {
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Mostrar info común
        System.out.println("--- Información Virtual ---");
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Enlace: " + enlaceAcceso);
        System.out.println("Límite conexiones: " + limiteConexiones);
        System.out.println("Requiere kit: " + (requiereKit ? "Sí" : "No"));
        System.out.println("═══════════════════════════════════════");
    }
}

// En CursoPresencial
public class CursoPresencial extends Curso {
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Mostrar info común
        System.out.println("--- Información Presencial ---");
        System.out.println("Sede: " + sede);
        System.out.println("Salón: " + salon);
        System.out.println("Capacidad: " + capacidadMaxima + " personas");
        System.out.println("Horario: " + horario);
        System.out.println("═══════════════════════════════════════");
    }
}
```

**Criterios de evaluación:**
- ✅ equals() y hashCode() implementados correctamente (8 pts)
- ✅ Comparable implementado (5 pts)
- ✅ Mínimo 2 métodos adicionales sobrescritos con super (7 pts)
- ✅ Lógica de sobrescritura coherente y funcional (5 pts)

**Total:** 25 puntos

---

### Ejercicio 3: Métodos Polimórficos en Gestor (25 puntos)

**Descripción:**  
Actualiza el gestor para que todos sus métodos aprovechen polimorfismo al máximo.

---

#### 3.1 Métodos de Búsqueda Polimórficos

```java
public class SistemaCursos {
    private Curso[] cursos;
    private int cantidad;
    
    /**
     * Busca cursos que cumplan un criterio (método polimórfico)
     * @param criterio "economico", "extenso", "corto", "activo"
     * @return Array con cursos que cumplen el criterio
     */
    public Curso[] buscarPorCriterio(String criterio) {
        Curso[] resultados = new Curso[cantidad];
        int contador = 0;
        
        for (int i = 0; i < cantidad; i++) {
            boolean cumple = false;
            
            switch (criterio.toLowerCase()) {
                case "economico":
                    cumple = cursos[i].calcularCosto() < 500000;  // Polimórfico
                    break;
                case "extenso":
                    cumple = cursos[i].getDuracionHoras() > 80;
                    break;
                case "corto":
                    cumple = cursos[i].getDuracionHoras() < 40;
                    break;
                case "activo":
                    cumple = cursos[i].isActivo();
                    break;
                default:
                    throw new IllegalArgumentException("Criterio inválido");
            }
            
            if (cumple) {
                resultados[contador++] = cursos[i];
            }
        }
        
        // Crear array del tamaño exacto
        Curso[] cursosEncontrados = new Curso[contador];
        System.arraycopy(resultados, 0, cursosEncontrados, 0, contador);
        return cursosEncontrados;
    }
    
    /**
     * Busca cursos en un rango de costo (usa calcularCosto() polimórficamente)
     * @param costoMin Costo mínimo
     * @param costoMax Costo máximo
     * @return Cursos en ese rango
     */
    public Curso[] buscarPorRangoCosto(double costoMin, double costoMax) {
        Curso[] resultados = new Curso[cantidad];
        int contador = 0;
        
        for (int i = 0; i < cantidad; i++) {
            double costo = cursos[i].calcularCosto();  // ⬅️ POLIMÓRFICO
            if (costo >= costoMin && costo <= costoMax) {
                resultados[contador++] = cursos[i];
            }
        }
        
        Curso[] cursosEncontrados = new Curso[contador];
        System.arraycopy(resultados, 0, cursosEncontrados, 0, contador);
        return cursosEncontrados;
    }
```

---

#### 3.2 Métodos de Ordenamiento Polimórficos

```java
    /**
     * Ordena cursos usando Comparable (polimórfico)
     * @param criterio "duracion", "costo", "nombre"
     */
    public void ordenarPor(String criterio) {
        // Bubble sort usando compareTo polimórfico
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - i - 1; j++) {
                // Usa el método compararPor polimórfico
                if (cursos[j].compararPor(cursos[j + 1], criterio) > 0) {
                    // Intercambiar
                    Curso temp = cursos[j];
                    cursos[j] = cursos[j + 1];
                    cursos[j + 1] = temp;
                }
            }
        }
        System.out.println("✓ Cursos ordenados por " + criterio);
    }
    
    /**
     * Obtiene el curso más costoso (polimorfismo en calcularCosto)
     * @return Curso con mayor costo
     */
    public Curso obtenerMasCostoso() {
        if (cantidad == 0) return null;
        
        Curso masCostoso = cursos[0];
        double costoMaximo = cursos[0].calcularCosto();  // Polimórfico
        
        for (int i = 1; i < cantidad; i++) {
            double costo = cursos[i].calcularCosto();  // Polimórfico
            if (costo > costoMaximo) {
                costoMaximo = costo;
                masCostoso = cursos[i];
            }
        }
        
        return masCostoso;
    }
    
    /**
     * Obtiene el curso más económico
     */
    public Curso obtenerMasEconomico() {
        if (cantidad == 0) return null;
        
        Curso masEconomico = cursos[0];
        double costoMinimo = cursos[0].calcularCosto();
        
        for (int i = 1; i < cantidad; i++) {
            double costo = cursos[i].calcularCosto();
            if (costo < costoMinimo) {
                costoMinimo = costo;
                masEconomico = cursos[i];
            }
        }
        
        return masEconomico;
    }
```

---

#### 3.3 Estadísticas Polimórficas

```java
    /**
     * Calcula estadísticas usando polimorfismo
     * @return String con estadísticas detalladas
     */
    public String generarEstadisticas() {
        if (cantidad == 0) {
            return "No hay cursos registrados";
        }
        
        StringBuilder stats = new StringBuilder();
        stats.append("╔════════════════════════════════════════╗\n");
        stats.append("║       ESTADÍSTICAS DEL SISTEMA        ║\n");
        stats.append("╚════════════════════════════════════════╝\n\n");
        
        // Contadores por tipo
        int presenciales = 0;
        int virtuales = 0;
        double costoTotalPresenciales = 0;
        double costoTotalVirtuales = 0;
        
        // Recorrer usando polimorfismo
        for (int i = 0; i < cantidad; i++) {
            double costo = cursos[i].calcularCosto();  // Polimórfico
            
            if (cursos[i] instanceof CursoPresencial) {
                presenciales++;
                costoTotalPresenciales += costo;
            } else if (cursos[i] instanceof CursoVirtual) {
                virtuales++;
                costoTotalVirtuales += costo;
            }
        }
        
        // Construir reporte
        stats.append("Total de cursos: ").append(cantidad).append("\n");
        stats.append("  • Presenciales: ").append(presenciales).append("\n");
        stats.append("  • Virtuales: ").append(virtuales).append("\n\n");
        
        stats.append("Costos promedios:\n");
        if (presenciales > 0) {
            stats.append("  • Presenciales: $")
                 .append(String.format("%.2f", costoTotalPresenciales / presenciales))
                 .append("\n");
        }
        if (virtuales > 0) {
            stats.append("  • Virtuales: $")
                 .append(String.format("%.2f", costoTotalVirtuales / virtuales))
                 .append("\n");
        }
        
        // Curso más costoso y más económico
        Curso masCostoso = obtenerMasCostoso();
        Curso masEconomico = obtenerMasEconomico();
        
        stats.append("\nCurso más costoso:\n");
        stats.append("  ").append(masCostoso.getNombreCurso())
             .append(" - $").append(String.format("%.2f", masCostoso.calcularCosto()))
             .append("\n");
        
        stats.append("Curso más económico:\n");
        stats.append("  ").append(masEconomico.getNombreCurso())
             .append(" - $").append(String.format("%.2f", masEconomico.calcularCosto()))
             .append("\n");
        
        return stats.toString();
    }
    
    /**
     * Aplica descuento masivo a todos los cursos (polimórfico)
     * @param diasAnticipacion Días de anticipación
     */
    public void calcularDescuentoMasivo(int diasAnticipacion) {
        System.out.println("\n=== CÁLCULO DE DESCUENTOS ===");
        System.out.println("Pago anticipado: " + diasAnticipacion + " días\n");
        
        for (int i = 0; i < cantidad; i++) {
            Curso c = cursos[i];
            double costoOriginal = c.calcularCosto();
            double costoConDescuento = c.calcularCostoConDescuento(diasAnticipacion);
            double ahorro = costoOriginal - costoConDescuento;
            
            System.out.println(c.getNombreCurso());
            System.out.println("  Costo original: $" + String.format("%.2f", costoOriginal));
            System.out.println("  Con descuento: $" + String.format("%.2f", costoConDescuento));
            System.out.println("  Ahorro: $" + String.format("%.2f", ahorro));
            System.out.println();
        }
    }
}
```

**Criterios de evaluación:**
- ✅ Métodos de búsqueda polimórficos (7 pts)
- ✅ Métodos de ordenamiento polimórficos (6 pts)
- ✅ Estadísticas usando polimorfismo (7 pts)
- ✅ Código limpio y eficiente (5 pts)

**Total:** 25 puntos

---

### Ejercicio 4: Main Integrador y Análisis (25 puntos)

**Descripción:**  
Crea un Main que demuestre todos los tipos de polimorfismo y analiza las ventajas.

**Archivo: Main.java**

```java
/**
 * Demostración completa de polimorfismo
 * @author [Tu Nombre]
 * @version 4.0 (Semana 05)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║   SISTEMA DE GESTIÓN - POLIMORFISMO V4.0     ║");
        System.out.println("║          Semana 05 - Polimorfismo             ║");
        System.out.println("╚════════════════════════════════════════════════╝\n");
        
        SistemaCursos sistema = new SistemaCursos();
        
        // ===== 1. DEMOSTRACIÓN DE SOBRECARGA =====
        System.out.println("═══ 1. SOBRECARGA DE MÉTODOS (Overloading) ═══\n");
        
        CursoVirtual cv1 = new CursoVirtual("WEB301", "Desarrollo Web", 80, 
                                            "Ing. Torres", "Zoom", "");
        
        System.out.println("--- Sobrecarga de generarEnlace() ---");
        System.out.println("Sin parámetros: " + cv1.generarEnlace());
        System.out.println("Con sala: " + cv1.generarEnlace(12345));
        System.out.println("Con sala y password: " + cv1.generarEnlace(12345, "abc123"));
        
        System.out.println("\n--- Sobrecarga de aplicarDescuento() ---");
        Curso base = new Curso("BASE01", "Curso Base", 40, "Instructor");
        System.out.println("Costo original: $" + base.calcularCosto());
        System.out.println("Descuento 10%: $" + base.aplicarDescuento(10));
        System.out.println("Descuento $50,000: $" + base.aplicarDescuento(50000.0));
        System.out.println("Descuento 20% límite $100k: $" + base.aplicarDescuento(20, 100000));
        
        System.out.println("\n--- Sobrecarga de actualizar() ---");
        CursoPresencial cp1 = new CursoPresencial("POO101", "POO", 40, 
                                                  "Dr. García", "S301", "Norte", 30);
        cp1.actualizar("Programación Orientada a Objetos");
        cp1.actualizar("POO Avanzado", "Dr. Rodríguez");
        cp1.actualizar("POO", "Dr. García", "Lab201", "Lunes 14:00-18:00");
        
        // ===== 2. DEMOSTRACIÓN DE SOBRESCRITURA =====
        System.out.println("\n\n═══ 2. SOBRESCRITURA (Overriding) ═══\n");
        
        CursoPresencial cp2 = new CursoPresencial("BD201", "Bases de Datos", 60,
                                                  "Ing. Martínez", "Lab102", "Centro", 25);
        CursoVirtual cv2 = new CursoVirtual("IA401", "Inteligencia Artificial", 100,
                                            "PhD. López", "Teams", "https://teams.ms/abc"\)\;
        
        sistema.agregar(cp1);
        sistema.agregar(cp2);
        sistema.agregar(cv1);
        sistema.agregar(cv2);
        
        System.out.println("--- calcularCosto() sobrescrito ---");
        System.out.println("Presencial: $" + cp2.calcularCosto());  // Con recargo
        System.out.println("Virtual: $" + cv2.calcularCosto());     // Con descuento
        
        System.out.println("\n--- mostrarInformacion() sobrescrito ---");
        cp2.mostrarInformacion();
        cv2.mostrarInformacion();
        
        // ===== 3. POLIMORFISMO DINÁMICO =====
        System.out.println("\n\n═══ 3. POLIMORFISMO DINÁMICO ═══\n");
        
        System.out.println("--- Variable de superclase ---");
        Curso cursoGenerico;  // Variable polimórfica
        
        cursoGenerico = cp1;  // Apunta a CursoPresencial
        System.out.println("Tipo real: " + cursoGenerico.getClass().getSimpleName());
        System.out.println("Costo: $" + cursoGenerico.calcularCosto());  // Ejecuta de CursoPresencial
        
        cursoGenerico = cv1;  // Ahora apunta a CursoVirtual
        System.out.println("Tipo real: " + cursoGenerico.getClass().getSimpleName());
        System.out.println("Costo: $" + cursoGenerico.calcularCosto());  // Ejecuta de CursoVirtual
        
        // ===== 4. EQUALS Y HASHCODE =====
        System.out.println("\n\n═══ 4. EQUALS Y HASHCODE ═══\n");
        
        Curso c1 = new Curso("TEST01", "Test", 40, "Inst1");
        Curso c2 = new Curso("TEST01", "Otro Nombre", 60, "Inst2");
        Curso c3 = new Curso("TEST02", "Test", 40, "Inst1");
        
        System.out.println("c1.equals(c2): " + c1.equals(c2) + " (mismo código)");
        System.out.println("c1.equals(c3): " + c1.equals(c3) + " (diferente código)");
        System.out.println("c1.hashCode(): " + c1.hashCode());
        System.out.println("c2.hashCode(): " + c2.hashCode());
        
        // ===== 5. COMPARABLE Y ORDENAMIENTO =====
        System.out.println("\n\n═══ 5. COMPARABLE Y ORDENAMIENTO ═══\n");
        
        System.out.println("--- Antes de ordenar ---");
        sistema.listarTodosLosCursos();
        
        sistema.ordenarPor("costo");
        System.out.println("--- Después de ordenar por costo ---");
        sistema.listarTodosLosCursos();
        
        // ===== 6. MÉTODOS POLIMÓRFICOS DEL GESTOR =====
        System.out.println("\n\n═══ 6. MÉTODOS POLIMÓRFICOS DEL GESTOR ═══\n");
        
        System.out.println("--- Búsqueda por criterio ---");
        Curso[] economicos = sistema.buscarPorCriterio("economico");
        System.out.println("Cursos económicos: " + economicos.length);
        
        System.out.println("\n--- Rango de costo ---");
        Curso[] rango = sistema.buscarPorRangoCosto(500000, 800000);
        System.out.println("Cursos entre $500k y $800k: " + rango.length);
        
        System.out.println("\n--- Curso más costoso ---");
        Curso masCostoso = sistema.obtenerMasCostoso();
        System.out.println(masCostoso.getNombreCurso() + " - $" + 
                          masCostoso.calcularCosto());
        
        // ===== 7. DESCUENTOS POLIMÓRFICOS =====
        System.out.println("\n\n═══ 7. DESCUENTOS POLIMÓRFICOS ═══\n");
        sistema.calcularDescuentoMasivo(30);  // 30 días de anticipación
        
        // ===== 8. ESTADÍSTICAS =====
        System.out.println("\n═══ 8. ESTADÍSTICAS ═══\n");
        System.out.println(sistema.generarEstadisticas());
        
        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║              FIN DE DEMOSTRACIÓN              ║");
        System.out.println("╚════════════════════════════════════════════════╝");
    }
}
```

**Archivo: semana-05/docs/ANALISIS.md**

```markdown
# Análisis de Polimorfismo - Semana 05

## 1. Tipos de Polimorfismo Aplicados

### 1.1 Sobrecarga (Overloading) - Polimorfismo en Tiempo de Compilación

**Definición:** Múltiples métodos con el mismo nombre pero diferentes parámetros.

**Ejemplos implementados:**

| Clase | Método | Versiones |
|-------|--------|-----------|
| Curso | `aplicarDescuento()` | int, double, (int, double) |
| Curso | `actualizar()` | (String), (String, String), (String, String, int) |
| CursoVirtual | `generarEnlace()` | (), (int), (int, String) |
| CursoPresencial | `asignarSalon()` | (String), (String, String), (String, String, int) |

**Ventaja observada:** Flexibilidad al llamar métodos con diferentes niveles de información.

```java
// El programador elige la versión según lo que tenga disponible
curso.actualizar("Nuevo Nombre");
curso.actualizar("Nuevo Nombre", "Nuevo Instructor");
curso.actualizar("Nuevo Nombre", "Nuevo Instructor", 50);
```

### 1.2 Sobrescritura (Overriding) - Polimorfismo en Tiempo de Ejecución

**Definición:** Redefinición de métodos heredados en subclases.

**Métodos sobrescritos:**

| Método | Superclase | CursoPresencial | CursoVirtual |
|--------|------------|-----------------|--------------|
| `calcularCosto()` | Base × horas | Base + recargo | Base - 15% |
| `calcularCostoConDescuento()` | Descuento estándar | Descuento sobre base | Descuento acumulativo |
| `mostrarInformacion()` | Info básica | + Salón/Sede | + Plataforma/Enlace |
| `toString()` | Formato básico | + Info presencial | + Info virtual |
| `equals()` | Por código | Por código | Por código + plataforma |

**Ventaja observada:** Cada subclase se comporta de forma específica manteniendo interfaz común.

### 1.3 Polimorfismo Dinámico

**Ejemplo:**
```java
Curso c;  // Variable de tipo superclase

c = new CursoPresencial(...);
System.out.println(c.calcularCosto());  // Ejecuta versión de CursoPresencial

c = new CursoVirtual(...);
System.out.println(c.calcularCosto());  // Ejecuta versión de CursoVirtual
```

**Ventaja:** El método exacto se determina en tiempo de ejecución según el tipo real del objeto.

## 2. Comparación: Con vs Sin Polimorfismo

### Sin Polimorfismo (Código Repetitivo)

```java
// ❌ SIN POLIMORFISMO
public class SistemaCursos {
    private CursoPresencial[] presenciales;
    private CursoVirtual[] virtuales;
    
    public double calcularCostoTotal() {
        double total = 0;
        
        // Código duplicado para cada tipo
        for (CursoPresencial cp : presenciales) {
            total += cp.calcularCostoPresencial();
        }
        for (CursoVirtual cv : virtuales) {
            total += cv.calcularCostoVirtual();
        }
        
        return total;
    }
}
```

### Con Polimorfismo (Código Reutilizable)

```java
// ✅ CON POLIMORFISMO
public class SistemaCursos {
    private Curso[] cursos;  // Un solo array
    
    public double calcularCostoTotal() {
        double total = 0;
        
        // Un solo bucle, funciona con cualquier subclase
        for (Curso c : cursos) {
            total += c.calcularCosto();  // Polimórfico
        }
        
        return total;
    }
}
```

**Resultado:**
- Líneas de código: ↓ 60%
- Complejidad: ↓ 75%
- Mantenibilidad: ↑ 90%

## 3. Ventajas Medibles

### 3.1 Menos Código

**Métrica:**
- Sin polimorfismo: ~450 líneas
- Con polimorfismo: ~280 líneas
- **Reducción: 38%**

### 3.2 Mayor Extensibilidad

**Escenario:** Agregar un nuevo tipo `CursoHibrido`

**Sin polimorfismo:**
- Modificar 15+ métodos en el gestor
- Agregar nuevos arrays
- Duplicar lógica de cálculos
- **Tiempo estimado: 4 horas**

**Con polimorfismo:**
- Crear clase que extienda Curso
- Sobrescribir métodos necesarios
- El gestor funciona sin cambios
- **Tiempo estimado: 30 minutos**

### 3.3 Menos Errores

**Errores potenciales reducidos:**
- Olvidar actualizar un tipo: 0 (imposible con polimorfismo)
- Lógica inconsistente entre tipos: 0 (método único)
- Código duplicado con bugs: 0 (no hay duplicación)

## 4. Patrones Identificados

### 4.1 Patrón Template Method

```java
// Superclase define estructura, subclases detalles
public double calcularCostoConDescuento(int dias) {
    double base = calcularCosto();  // Polimórfico
    return aplicarDescuentoPorDias(dias, base);  // Común
}
```

### 4.2 Patrón Strategy (implícito)

```java
// Diferentes estrategias de cálculo según el tipo
Curso c = obtenerCurso();
double costo = c.calcularCosto();  // Estrategia determinada por el tipo
```

## 5. Casos de Uso del Polimorfismo

### Caso 1: Sistema de Descuentos

**Problema:** Cada tipo de curso tiene reglas de descuento diferentes.

**Solución con polimorfismo:**
```java
public void aplicarDescuentosMasivos(int dias) {
    for (Curso c : cursos) {
        // Cada subclase aplica su propia lógica
        double nuevo = c.calcularCostoConDescuento(dias);
    }
}
```

### Caso 2: Generación de Reportes

**Problema:** Mostrar información específica de cada tipo.

**Solución con polimorfismo:**
```java
public void generarReporteDetallado() {
    for (Curso c : cursos) {
        c.mostrarInformacion();  // Cada uno muestra lo suyo
    }
}
```

### Caso 3: Ordenamiento

**Problema:** Ordenar cursos por diferentes criterios.

**Solución con polimorfismo:**
```java
// Implementando Comparable
public int compareTo(Curso otro) {
    return Double.compare(this.calcularCosto(), otro.calcularCosto());
}

// Uso
Arrays.sort(cursos);  // Funciona automáticamente
```

## 6. Lecciones Aprendidas

### Lo que funcionó bien

1. **Métodos polimórficos en el gestor:** Redujo significativamente la complejidad
2. **Sobrecarga para flexibilidad:** Facilita el uso de métodos con diferentes parámetros
3. **equals() y hashCode():** Permiten comparaciones y uso en colecciones
4. **Comparable:** Ordenamiento natural sin código adicional

### Desafíos encontrados

1. **Decidir qué sobrescribir:** No todo debe ser sobrescrito
   **Solución:** Solo sobrescribir lo que varía entre subclases

2. **Sobrecarga vs Sobrescritura:** Confusión inicial
   **Solución:** Sobrecarga = diferentes parámetros, Sobrescritura = mismo método

3. **Uso correcto de super:** Cuándo llamar al método padre
   **Solución:** Llamar a super cuando se quiere extender, no reemplazar

## 7. Métricas de Calidad

### Antes de Polimorfismo (Semana 03)
- Complejidad ciclomática: 15
- Duplicación de código: 35%
- Acoplamiento: Alto
- Cohesión: Media

### Después de Polimorfismo (Semana 05)
- Complejidad ciclomática: 8 ↓ 47%
- Duplicación de código: 5% ↓ 86%
- Acoplamiento: Bajo ↓ 60%
- Cohesión: Alta ↑ 40%

## 8. Próximos Pasos

Con polimorfismo dominado, ahora se puede:
- **Semana 06:** Clases abstractas e interfaces
- **Semana 07:** Colecciones polimórficas (ArrayList, HashMap)
- **Semana 08:** Patrones de diseño basados en polimorfismo

## 9. Conclusión

El polimorfismo transformó el código de un diseño rígido a uno flexible y extensible:

✅ **Código más limpio:** 38% menos líneas  
✅ **Más mantenible:** Cambios centralizados  
✅ **Más extensible:** Nuevas subclases sin modificar código existente  
✅ **Menos errores:** Lógica unificada  

**El polimorfismo es el verdadero poder de la POO.** 🎭
```

**Criterios de evaluación:**
- ✅ Main demuestra los 3 tipos de polimorfismo (10 pts)
- ✅ Main incluye casos de uso variados (5 pts)
- ✅ ANALISIS.md completo y detallado (8 pts)
- ✅ Comparación con código no polimórfico (2 pts)

**Total:** 25 puntos

---

## 📦 Estructura de Entrega

```
bc-poo-java-[nombre]-[apellido]/
├── semana-01/
├── semana-02/
├── semana-03/
├── semana-04/
└── semana-05/              # NUEVA carpeta
    ├── README.md
    ├── src/
    │   ├── Curso.java              # Con métodos sobrecargados ✅
    │   ├── CursoPresencial.java    # Con sobrescritura avanzada ✅
    │   ├── CursoVirtual.java       # Con sobrescritura avanzada ✅
    │   ├── [Clase2].java           # Sin cambios
    │   ├── [Clase3].java           # Sin cambios
    │   ├── SistemaCursos.java      # Métodos 100% polimórficos ✅
    │   └── Main.java               # Demostración completa ✅
    └── docs/
        └── ANALISIS.md             # Análisis de polimorfismo 🆕
```

---

## ✅ Checklist de Verificación

### Sobrecarga (Overloading)
- [ ] Mínimo 3 métodos sobrecargados en superclase
- [ ] Mínimo 2 métodos sobrecargados por subclase
- [ ] Sobrecarga con diferentes tipos de parámetros
- [ ] JavaDoc explica diferencias entre versiones

### Sobrescritura (Overriding)
- [ ] equals() y hashCode() implementados
- [ ] Comparable<> implementado
- [ ] Mínimo 2 métodos adicionales sobrescritos
- [ ] Uso correcto de super en métodos sobrescritos
- [ ] @Override en todos los métodos sobrescritos

### Gestor Polimórfico
- [ ] Métodos de búsqueda polimórficos
- [ ] Método de ordenamiento polimórfico
- [ ] Estadísticas usando polimorfismo
- [ ] Sin instanceof innecesarios (usar polimorfismo)

### Main y Documentación
- [ ] Demuestra sobrecarga claramente
- [ ] Demuestra sobrescritura claramente
- [ ] Demuestra polimorfismo dinámico
- [ ] ANALISIS.md completo con comparaciones
- [ ] Código compila y ejecuta sin errores

---

## 📊 Tabla de Puntuación

| Ejercicio | Puntos | Descripción |
|-----------|--------|-------------|
| Ejercicio 1 | 25 | Sobrecarga de métodos |
| Ejercicio 2 | 25 | Sobrescritura avanzada |
| Ejercicio 3 | 25 | Gestor polimórfico |
| Ejercicio 4 | 25 | Main y análisis |
| **TOTAL** | **100** | |

---

## 🚀 Comandos Git

```bash
# 1. Copiar desde semana-04
cp -r semana-04 semana-05
cd semana-05

# 2. Desarrollar polimorfismo...

# 3. Commit
git add semana-05/
git commit -m "feat(semana-05): implementar polimorfismo avanzado

What? 
- Métodos sobrecargados en superclase y subclases
- Sobrescritura avanzada con equals, hashCode, Comparable
- Gestor con métodos 100% polimórficos
- Main demostrando todos los tipos de polimorfismo

For? 
Dominar polimorfismo mediante overloading y overriding

Impact? 
Código más flexible, extensible y con 38% menos líneas"

git push origin main
```

---

## ❓ FAQ

**P: ¿Cuál es la diferencia entre sobrecarga y sobrescritura?**  
R: **Sobrecarga** = Mismo método, diferentes parámetros (misma clase).  
   **Sobrescritura** = Mismo método y parámetros, diferente implementación (en subclase).

**P: ¿Debo sobrescribir todos los métodos?**  
R: No, solo los que necesitan comportamiento específico en cada subclase.

**P: ¿Cuándo usar super en métodos sobrescritos?**  
R: Cuando quieres **extender** la funcionalidad del padre, no reemplazarla completamente.

**P: ¿Es obligatorio implementar Comparable?**  
R: Sí, para esta semana es parte de los requerimientos.

**P: ¿Puedo agregar más métodos sobrecargados?**  
R: Sí, el mínimo es 3 en superclase y 2 por subclase, pero puedes agregar más.

---

**¡Domina el polimorfismo, domina la POO-rf /home/epti/Documentos/epti-dev/bc-channel/bc-oop-java/bootcamp/semana-04/4.\ asignación_dominios* 🎭
