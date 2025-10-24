# Ejercicios Semanales Evaluables - Semana 03

## 📋 Información General

**Semana:** 03 - Encapsulación y Constructores  
**Tipo:** Refactorización del código existente  
**Peso en la evaluación:** 70% de la nota semanal  
**Fecha límite:** Domingo 23:59 de la Semana 03  
**Formato de entrega:** Repositorio GitHub (mismo repositorio)

---

## 🎯 Objetivo

Aplicar principios de encapsulación, crear getters/setters con validaciones, implementar constructores sobrecargados y mejorar la robustez del código existente.

---

## ⚠️ IMPORTANTE: Esta semana es de REFACTORIZACIÓN

**NO necesitas:**
- ❌ Crear nuevas clases
- ❌ Agregar más funcionalidades
- ❌ Cambiar la lógica de negocio

**SÍ debes:**
- ✅ Mejorar encapsulación (todos los atributos privados)
- ✅ Agregar getters/setters con validaciones
- ✅ Implementar múltiples constructores
- ✅ Validar datos de entrada
- ✅ Mejorar manejo de errores

---

## 📝 Ejercicios Obligatorios

### Ejercicio 1: Encapsulación Completa (25 puntos)

**Descripción:**  
Refactoriza TODAS tus clases para garantizar encapsulación estricta.

**Requerimientos:**
- **TODOS** los atributos deben ser `private`
- Eliminar cualquier atributo `public` o `protected`
- Agregar comentarios JavaDoc a los atributos
- Usar `final` donde sea apropiado (constantes)

**Antes (❌ Incorrecto):**

```java
public class Curso {
    public String codigoCurso;  // ❌ Public
    String nombreCurso;         // ❌ Default (package-private)
    private int duracionHoras;  // ✅ Correcto
    
    public Curso(String codigo, String nombre, int horas) {
        this.codigoCurso = codigo;
        this.nombreCurso = nombre;
        this.duracionHoras = horas;
    }
}
```

**Después (✅ Correcto):**

```java
/**
 * Representa un curso en el sistema educativo
 * @author [Tu Nombre]
 * @version 2.0 (Semana 03)
 */
public class Curso {
    /** Código único del curso (no modificable después de creación) */
    private final String codigoCurso;
    
    /** Nombre descriptivo del curso */
    private String nombreCurso;
    
    /** Duración en horas (debe ser positivo) */
    private int duracionHoras;
    
    /** Estado de actividad del curso */
    private boolean activo;
    
    /** Costo por hora (constante del sistema) */
    private static final double COSTO_POR_HORA = 15000.0;
    
    /**
     * Constructor principal del curso
     * @param codigo Código único del curso
     * @param nombre Nombre del curso
     * @param horas Duración en horas
     */
    public Curso(String codigo, String nombre, int horas) {
        this.codigoCurso = codigo;
        this.nombreCurso = nombre;
        this.duracionHoras = horas;
        this.activo = true;
    }
}
```

**Criterios de evaluación:**
- ✅ Todos los atributos son private (10 pts)
- ✅ Atributos tienen JavaDoc (5 pts)
- ✅ Constantes usan final y UPPER_CASE (5 pts)
- ✅ IDs/códigos usan final (5 pts)

**Total:** 25 puntos

---

### Ejercicio 2: Getters y Setters con Validaciones (25 puntos)

**Descripción:**  
Implementa getters/setters para TODOS los atributos con validaciones apropiadas.

**Reglas de validación según tipo:**

| Tipo de Dato | Validaciones Comunes |
|--------------|---------------------|
| `String` | No nulo, no vacío, longitud mínima/máxima |
| `int/double` | Rango válido, no negativo (si aplica) |
| `boolean` | Sin validación (acepta true/false) |
| Objetos | No nulo |

**Ejemplo completo:**

```java
public class Curso {
    private final String codigoCurso;
    private String nombreCurso;
    private int duracionHoras;
    private boolean activo;
    
    // Constructor...
    
    // GETTER (siempre simple)
    /**
     * Obtiene el código del curso
     * @return Código único del curso
     */
    public String getCodigoCurso() {
        return codigoCurso;
    }
    
    // GETTER con cálculo
    /**
     * Calcula el costo total del curso
     * @return Costo en pesos colombianos
     */
    public double getCostoTotal() {
        return duracionHoras * COSTO_POR_HORA;
    }
    
    // SETTER con validación de String
    /**
     * Establece el nombre del curso
     * @param nombre Nuevo nombre (no vacío, mínimo 5 caracteres)
     * @throws IllegalArgumentException si el nombre no es válido
     */
    public void setNombreCurso(String nombre) {
        // Validación 1: No nulo
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        
        // Validación 2: No vacío
        if (nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        
        // Validación 3: Longitud mínima
        if (nombre.length() < 5) {
            throw new IllegalArgumentException(
                "El nombre debe tener al menos 5 caracteres");
        }
        
        // Validación 4: Longitud máxima
        if (nombre.length() > 100) {
            throw new IllegalArgumentException(
                "El nombre no puede exceder 100 caracteres");
        }
        
        // Si pasa todas las validaciones, asignar
        this.nombreCurso = nombre;
    }
    
    // SETTER con validación de número
    /**
     * Establece la duración del curso
     * @param horas Duración en horas (debe ser entre 10 y 200)
     * @throws IllegalArgumentException si la duración no es válida
     */
    public void setDuracionHoras(int horas) {
        if (horas < 10) {
            throw new IllegalArgumentException(
                "La duración mínima es 10 horas");
        }
        
        if (horas > 200) {
            throw new IllegalArgumentException(
                "La duración máxima es 200 horas");
        }
        
        this.duracionHoras = horas;
    }
    
    // SETTER simple (boolean no necesita mucha validación)
    /**
     * Establece el estado de actividad del curso
     * @param activo true para activo, false para inactivo
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    // GETTER simple
    public boolean isActivo() {  // Nota: boolean usa "is" en lugar de "get"
        return activo;
    }
}
```

**Validaciones requeridas por clase:**
- Cada clase debe tener **mínimo 3 setters con validación**
- Cada setter validado debe lanzar `IllegalArgumentException` si falla
- Validaciones deben ser **apropiadas al contexto** del dominio

**Criterios de evaluación:**
- ✅ Todos los atributos tienen getters (5 pts)
- ✅ Setters tienen validaciones (10 pts)
- ✅ Validaciones son apropiadas al dominio (5 pts)
- ✅ Mensajes de error son claros (5 pts)

**Total:** 25 puntos

---

### Ejercicio 3: Constructores Sobrecargados (25 puntos)

**Descripción:**  
Implementa múltiples constructores en tus clases para diferentes escenarios de creación.

**Requerimientos:**
- Cada clase principal debe tener **mínimo 3 constructores**
- Usar `this()` para llamar entre constructores
- Documentar cada constructor con JavaDoc

**Ejemplo:**

```java
public class Curso {
    private final String codigoCurso;
    private String nombreCurso;
    private int duracionHoras;
    private String instructor;
    private boolean activo;
    
    /**
     * Constructor completo con todos los parámetros
     * @param codigo Código único del curso
     * @param nombre Nombre del curso
     * @param horas Duración en horas
     * @param instructor Nombre del instructor
     */
    public Curso(String codigo, String nombre, int horas, String instructor) {
        // Validaciones
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código requerido");
        }
        if (horas < 10 || horas > 200) {
            throw new IllegalArgumentException("Duración debe estar entre 10 y 200 horas");
        }
        
        this.codigoCurso = codigo;
        this.nombreCurso = nombre;
        this.duracionHoras = horas;
        this.instructor = instructor;
        this.activo = true;  // Por defecto activo
    }
    
    /**
     * Constructor sin instructor (será asignado después)
     * @param codigo Código único del curso
     * @param nombre Nombre del curso
     * @param horas Duración en horas
     */
    public Curso(String codigo, String nombre, int horas) {
        this(codigo, nombre, horas, "Por asignar");  // Llama al constructor completo
    }
    
    /**
     * Constructor mínimo (duración por defecto 40 horas)
     * @param codigo Código único del curso
     * @param nombre Nombre del curso
     */
    public Curso(String codigo, String nombre) {
        this(codigo, nombre, 40, "Por asignar");  // Llama al constructor completo
    }
    
    /**
     * Constructor copia (crea un curso basado en otro existente)
     * @param otro Curso a copiar
     */
    public Curso(Curso otro) {
        this(otro.codigoCurso + "_COPIA", 
             otro.nombreCurso, 
             otro.duracionHoras, 
             otro.instructor);
    }
}
```

**Uso de los constructores:**

```java
// Constructor completo
Curso c1 = new Curso("POO101", "Prog. Orientada a Objetos", 40, "Dr. García");

// Constructor sin instructor
Curso c2 = new Curso("WEB201", "Desarrollo Web", 60);

// Constructor mínimo
Curso c3 = new Curso("BD301", "Bases de Datos");

// Constructor copia
Curso c4 = new Curso(c1);
```

**Criterios de evaluación:**
- ✅ Mínimo 3 constructores por clase principal (10 pts)
- ✅ Usa this() correctamente (5 pts)
- ✅ Validaciones en constructores (5 pts)
- ✅ JavaDoc completo (5 pts)

**Total:** 25 puntos

---

### Ejercicio 4: Documentación de Mejoras (25 puntos)

**Descripción:**  
Documenta las mejoras realizadas y las decisiones de diseño.

**Archivo:** `semana-03/docs/ANALISIS.md`

**Estructura:**

```markdown
# Análisis de Refactorización - Semana 03

## 1. Resumen de Mejoras

### Antes (Semana 02)
- Atributos: [descripción del estado anterior]
- Validaciones: [qué validaciones había]
- Constructores: [cuántos y cuáles]

### Después (Semana 03)
- Encapsulación: [mejoras realizadas]
- Validaciones: [validaciones agregadas]
- Constructores: [constructores implementados]

## 2. Encapsulación Aplicada

### Clase: [Nombre Clase 1]

**Atributos refactorizados:**
| Atributo | Antes | Después | Justificación |
|----------|-------|---------|---------------|
| codigo | public String | private final String | No debe modificarse después de creación |
| nombre | String | private String | Debe ser privado con setter validado |
| precio | private double | private double | Ya era correcto |

**Constantes agregadas:**
- `COSTO_POR_HORA`: Valor fijo usado en cálculos
- `MAX_CAPACIDAD`: Límite máximo del sistema

### Clase: [Nombre Clase 2]
[Repetir análisis...]

## 3. Validaciones Implementadas

### Reglas de Negocio

**Clase: [Nombre]**

| Atributo | Validación | Razón |
|----------|-----------|-------|
| nombreCurso | Mín 5 chars, Max 100 | Nombres muy cortos no son descriptivos |
| duracionHoras | Entre 10 y 200 | Límites razonables para cursos |
| email | Contiene @ | Formato básico de email |
| precio | > 0 | No hay productos gratis |

### Ejemplos de Validación

```java
// Validación implementada en setNombreCurso()
public void setNombreCurso(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
        throw new IllegalArgumentException("Nombre requerido");
    }
    if (nombre.length() < 5) {
        throw new IllegalArgumentException("Nombre muy corto");
    }
    this.nombreCurso = nombre;
}
```

## 4. Constructores Sobrecargados

### Estrategia de Constructores

**Patrón usado:** Llamada en cadena con `this()`

**Ventajas:**
- Evita duplicación de código
- Validaciones centralizadas en un constructor
- Flexibilidad al crear objetos

### Ejemplo: Clase [Nombre]

```java
// Constructor completo (con todas las validaciones)
public Clase(param1, param2, param3, param4) { ... }

// Constructor parcial (llama al completo con defaults)
public Clase(param1, param2, param3) {
    this(param1, param2, param3, "default");
}

// Constructor mínimo
public Clase(param1, param2) {
    this(param1, param2, "default", 0);
}
```

## 5. Mejoras en Robustez

### Problemas Resueltos

1. **Problema:** Atributos podían ser null
   **Solución:** Validación en setters y constructores
   
2. **Problema:** Valores numéricos negativos
   **Solución:** Validación de rangos en setters
   
3. **Problema:** Strings vacíos
   **Solución:** Verificación de trim().isEmpty()

### Casos de Prueba

**Test 1: Validación de nombre**
```java
// Esto ahora lanza excepción
curso.setNombreCurso("");  // IllegalArgumentException
curso.setNombreCurso(null); // IllegalArgumentException
```

**Test 2: Rangos numéricos**
```java
// Esto ahora lanza excepción
curso.setDuracionHoras(-10);  // IllegalArgumentException
curso.setDuracionHoras(500);  // IllegalArgumentException
```

## 6. Comparación de Código

### Antes de Refactorizar

```java
public class Curso {
    public String codigo;  // ❌ Public
    String nombre;         // ❌ Sin validar
    
    public void setNombre(String n) {
        nombre = n;  // ❌ Sin validación
    }
}
```

### Después de Refactorizar

```java
public class Curso {
    private final String codigo;  // ✅ Private final
    private String nombre;         // ✅ Private
    
    public void setNombre(String n) {  // ✅ Con validación
        if (n == null || n.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre requerido");
        }
        this.nombre = n;
    }
}
```

## 7. Lecciones Aprendidas

### Ventajas Observadas
1. **Código más seguro**: Validaciones previenen errores
2. **Más flexible**: Múltiples formas de crear objetos
3. **Mejor documentado**: JavaDoc explica el uso
4. **Más mantenible**: Cambios centralizados

### Desafíos Encontrados
1. **Desafío**: Decidir qué validaciones aplicar
   **Solución**: Basarse en reglas de negocio del dominio
   
2. **Desafío**: Balancear número de constructores
   **Solución**: 3-4 constructores es un buen equilibrio

## 8. Próximos Pasos (Semana 04)

Con el código ahora más robusto, en semana 04 se puede:
- Implementar herencia entre clases
- Crear jerarquías de objetos
- Aplicar polimorfismo
- Usar clases abstractas

---

**Conclusión:** La refactorización mejoró significativamente la calidad del código sin cambiar su funcionalidad. El sistema es ahora más robusto, mantenible y profesional.
```

**Criterios de evaluación:**
- ✅ Documento completo con todas las secciones (10 pts)
- ✅ Ejemplos de código antes/después (5 pts)
- ✅ Tabla de validaciones (5 pts)
- ✅ Reflexión sobre mejoras (5 pts)

**Total:** 25 puntos

---

## 📦 Estructura de Entrega

```
bc-poo-java-[nombre]-[apellido]/
├── semana-01/
├── semana-02/
└── semana-03/              # NUEVA carpeta
    ├── README.md
    ├── src/
    │   ├── [Clase1].java   # REFACTORIZADA
    │   ├── [Clase2].java   # REFACTORIZADA
    │   ├── [Clase3].java   # REFACTORIZADA
    │   ├── Sistema[X].java # REFACTORIZADA
    │   └── Main.java       # Actualizado para probar validaciones
    └── docs/
        └── ANALISIS.md
```

---

## ✅ Checklist de Verificación

### Encapsulación
- [ ] Todos los atributos son private
- [ ] Constantes usan private static final
- [ ] IDs/códigos usan final
- [ ] JavaDoc en todos los atributos

### Getters y Setters
- [ ] Todos los atributos tienen getters
- [ ] Setters tienen validaciones apropiadas
- [ ] Excepciones con mensajes claros
- [ ] JavaDoc en getters y setters

### Constructores
- [ ] Mínimo 3 constructores por clase principal
- [ ] Uso correcto de this()
- [ ] Validaciones en constructores
- [ ] JavaDoc en cada constructor

### Documentación
- [ ] ANALISIS.md completo
- [ ] Comparación antes/después
- [ ] Tabla de validaciones
- [ ] Ejemplos de código

### Testing
- [ ] Código compila sin errores
- [ ] Validaciones funcionan correctamente
- [ ] Main prueba casos válidos e inválidos

---

## 📊 Tabla de Puntuación

| Ejercicio | Puntos | Descripción |
|-----------|--------|-------------|
| Ejercicio 1 | 25 | Encapsulación completa |
| Ejercicio 2 | 25 | Getters/Setters validados |
| Ejercicio 3 | 25 | Constructores sobrecargados |
| Ejercicio 4 | 25 | Documentación de mejoras |
| **TOTAL** | **100** | |

---

## 💡 Tips Importantes

### Validaciones Comunes

```java
// String no nulo ni vacío
if (valor == null || valor.trim().isEmpty()) {
    throw new IllegalArgumentException("Valor requerido");
}

// Número en rango
if (numero < minimo || numero > maximo) {
    throw new IllegalArgumentException("Valor fuera de rango");
}

// Email básico
if (!email.contains("@")) {
    throw new IllegalArgumentException("Email inválido");
}

// Longitud de String
if (texto.length() < min || texto.length() > max) {
    throw new IllegalArgumentException("Longitud inválida");
}
```

### Llamada entre Constructores

```java
// ✅ Correcto
public Clase(p1, p2, p3) {
    this(p1, p2, p3, "default");  // Primera línea
}

// ❌ Incorrecto
public Clase(p1, p2, p3) {
    int x = 5;  // ❌ No puede haber código antes de this()
    this(p1, p2, p3, "default");
}
```

---

## 🚀 Comandos Git

```bash
# Copiar desde semana-02 y refactorizar
cp -r semana-02 semana-03
cd semana-03/src

# Refactorizar archivos...

# Commit
git add semana-03/
git commit -m "refactor(semana-03): aplicar encapsulación y constructores

What? Atributos privados, getters/setters validados, constructores sobrecargados
For? Mejorar robustez y aplicar principios de encapsulación
Impact? Código más seguro, mantenible y profesional"

git push origin main
```

---

## ❓ FAQ

**P: ¿Debo cambiar la funcionalidad del programa?**  
R: No, la funcionalidad permanece igual. Solo mejoras cómo está escrito.

**P: ¿Todos los setters deben tener validación?**  
R: Mínimo 3 por clase, pero es buena práctica validar todo.

**P: ¿Puedo usar excepciones personalizadas?**  
R: Sí, pero no es obligatorio. IllegalArgumentException es suficiente.

**P: ¿El Main debe probar las validaciones?**  
R: Sí, demuestra casos válidos E inválidos (con try-catch).

---

**¡Calidad sobre cantidad! Esta semana se trata de código profesional.** 🎯
