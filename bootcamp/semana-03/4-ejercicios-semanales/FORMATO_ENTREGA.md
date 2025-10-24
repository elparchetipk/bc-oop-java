# Formato de Entrega - Semana 03

## 📋 Información General

**Semana:** 03 - Encapsulación y Constructores  
**Tipo de trabajo:** Refactorización  
**Repositorio:** MISMO repositorio de semanas anteriores  
**Rama:** `main`

---

## ⚠️ IMPORTANTE

Esta semana **NO creas un nuevo repositorio**. Trabajas en el **mismo repositorio** que has usado en semanas 01 y 02.

**Pasos:**
1. Copia la carpeta `semana-02` completa
2. Renómbrala a `semana-03`
3. Refactoriza el código dentro de `semana-03`
4. **NO modifiques** los archivos de `semana-02` (se quedan como histórico)

---

## 📁 Estructura de Carpetas

Tu repositorio debe verse así:

```
bc-poo-java-[nombre]-[apellido]/
├── .gitignore
├── README.md
├── semana-01/
│   ├── README.md
│   ├── src/
│   │   ├── [Clase1].java
│   │   ├── [Clase2].java
│   │   └── Main.java
│   └── docs/
│       └── ANALISIS.md
├── semana-02/
│   ├── README.md
│   ├── src/
│   │   ├── [Clase1].java
│   │   ├── [Clase2].java
│   │   ├── [Clase3].java
│   │   ├── Sistema[X].java
│   │   └── Main.java
│   └── docs/
│       └── ANALISIS.md
└── semana-03/              ⬅️ NUEVA carpeta esta semana
    ├── README.md
    ├── src/
    │   ├── [Clase1].java       # REFACTORIZADA ✅
    │   ├── [Clase2].java       # REFACTORIZADA ✅
    │   ├── [Clase3].java       # REFACTORIZADA ✅
    │   ├── Sistema[X].java     # REFACTORIZADA ✅
    │   └── Main.java           # Actualizado para probar validaciones
    └── docs/
        └── ANALISIS.md         # Documenta las mejoras
```

---

## 🔧 Pasos de Trabajo

### 1. Copiar y Preparar

```bash
# Desde la raíz de tu repositorio
cd bc-poo-java-[tu-nombre]-[tu-apellido]

# Copiar semana-02 a semana-03
cp -r semana-02 semana-03

# Entrar a la nueva carpeta
cd semana-03
```

### 2. Actualizar README.md

Edita `semana-03/README.md`:

```markdown
# Semana 03 - Encapsulación y Constructores

## Descripción
Refactorización del código de semana 02 aplicando:
- Encapsulación estricta (todos los atributos private)
- Getters y setters con validaciones
- Constructores sobrecargados
- Mejoras en robustez y manejo de errores

## Dominio
[Tu dominio asignado]

## Clases
- `[Clase1].java` - [Descripción breve]
- `[Clase2].java` - [Descripción breve]
- `[Clase3].java` - [Descripción breve]
- `Sistema[X].java` - Gestor con arrays
- `Main.java` - Pruebas de validaciones

## Mejoras Implementadas
1. **Encapsulación**: Todos los atributos son private
2. **Validaciones**: Mínimo 3 setters validados por clase
3. **Constructores**: Mínimo 3 constructores por clase principal
4. **Documentación**: JavaDoc completo

## Compilación
```bash
# Compilar
javac src/*.java

# Ejecutar
java -cp src Main
```

## Autor
[Tu nombre completo]  
Ficha: [Número de ficha]  
Fecha: [DD/MM/AAAA]
```

### 3. Refactorizar Clases

Para **cada archivo** en `semana-03/src/`:

#### a) Encapsulación

```java
// ANTES (semana-02)
public class MiClase {
    public String codigo;      // ❌
    String nombre;             // ❌
    private double precio;     // ✅
}

// DESPUÉS (semana-03)
public class MiClase {
    private final String codigo;  // ✅ Private + final
    private String nombre;        // ✅ Private
    private double precio;        // ✅ Ya era correcto
    
    // Constantes del sistema
    private static final double IVA = 0.19;
}
```

#### b) Getters y Setters

```java
// Getter simple
public String getCodigo() {
    return codigo;
}

// Setter con validación
public void setNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
        throw new IllegalArgumentException("Nombre requerido");
    }
    if (nombre.length() < 3) {
        throw new IllegalArgumentException("Nombre muy corto (mínimo 3 caracteres)");
    }
    this.nombre = nombre;
}

// Getter con cálculo
public double getPrecioConIVA() {
    return precio * (1 + IVA);
}
```

#### c) Constructores

```java
/**
 * Constructor completo
 * @param codigo Código único (no modificable)
 * @param nombre Nombre descriptivo
 * @param precio Precio base (positivo)
 */
public MiClase(String codigo, String nombre, double precio) {
    if (codigo == null || codigo.isEmpty()) {
        throw new IllegalArgumentException("Código requerido");
    }
    if (precio <= 0) {
        throw new IllegalArgumentException("Precio debe ser positivo");
    }
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
}

/**
 * Constructor sin precio (valor por defecto)
 * @param codigo Código único
 * @param nombre Nombre descriptivo
 */
public MiClase(String codigo, String nombre) {
    this(codigo, nombre, 0.0);  // Llama al constructor completo
}

/**
 * Constructor copia
 * @param otro Objeto a copiar
 */
public MiClase(MiClase otro) {
    this(otro.codigo + "_COPIA", otro.nombre, otro.precio);
}
```

### 4. Actualizar Main.java

Tu `Main.java` debe probar **casos válidos E inválidos**:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pruebas de Validación - Semana 03 ===\n");
        
        // ===== CASOS VÁLIDOS =====
        System.out.println("--- Casos Válidos ---");
        try {
            MiClase obj1 = new MiClase("COD001", "Nombre Válido", 100.0);
            System.out.println("✅ Objeto creado: " + obj1.getCodigo());
            
            obj1.setNombre("Otro Nombre");
            System.out.println("✅ Nombre actualizado: " + obj1.getNombre());
            
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());
        }
        
        // ===== CASOS INVÁLIDOS =====
        System.out.println("\n--- Casos Inválidos ---");
        
        // Test 1: Nombre vacío
        try {
            MiClase obj2 = new MiClase("COD002", "", 50.0);
            System.out.println("❌ ERROR: Debió lanzar excepción");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Excepción correcta: " + e.getMessage());
        }
        
        // Test 2: Precio negativo
        try {
            MiClase obj3 = new MiClase("COD003", "Nombre", -10.0);
            System.out.println("❌ ERROR: Debió lanzar excepción");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Excepción correcta: " + e.getMessage());
        }
        
        // Test 3: Setter con null
        try {
            MiClase obj4 = new MiClase("COD004", "Inicial", 20.0);
            obj4.setNombre(null);
            System.out.println("❌ ERROR: Debió lanzar excepción");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Excepción correcta: " + e.getMessage());
        }
        
        System.out.println("\n=== Fin de Pruebas ===");
    }
}
```

### 5. Crear Documentación

Crea el archivo `semana-03/docs/ANALISIS.md` documentando todas las mejoras. Ver sección completa en `EJERCICIOS_SEMANALES.md`.

---

## ✅ Checklist Pre-Entrega

### Estructura
- [ ] Carpeta `semana-03` creada
- [ ] Carpeta `semana-03/src` con todos los archivos `.java`
- [ ] Carpeta `semana-03/docs` con `ANALISIS.md`
- [ ] `README.md` actualizado en `semana-03`

### Encapsulación
- [ ] **TODOS** los atributos son `private`
- [ ] Atributos inmutables usan `final`
- [ ] Constantes usan `private static final NOMBRE_CONSTANTE`
- [ ] JavaDoc en todos los atributos

### Getters y Setters
- [ ] Todos los atributos tienen `getters`
- [ ] **Mínimo 3 setters con validaciones** por clase
- [ ] Validaciones lanzan `IllegalArgumentException`
- [ ] Mensajes de error claros y descriptivos
- [ ] JavaDoc en todos los getters/setters

### Constructores
- [ ] **Mínimo 3 constructores** por clase principal
- [ ] Uso correcto de `this()` para llamar entre constructores
- [ ] Validaciones en el constructor principal
- [ ] JavaDoc en cada constructor

### Main.java
- [ ] Prueba casos **válidos** (deben funcionar)
- [ ] Prueba casos **inválidos** (deben lanzar excepciones)
- [ ] Usa `try-catch` para capturar excepciones
- [ ] Imprime resultados claros

### Documentación
- [ ] `ANALISIS.md` completo con todas las secciones
- [ ] Tabla comparativa antes/después
- [ ] Ejemplos de código
- [ ] Reflexión sobre mejoras

### Compilación
- [ ] Código compila sin errores: `javac src/*.java`
- [ ] Programa ejecuta correctamente: `java -cp src Main`
- [ ] Sin advertencias (warnings)

---

## 🚀 Comandos Git para Entrega

```bash
# 1. Verificar estado
git status

# 2. Agregar la nueva carpeta semana-03
git add semana-03/

# 3. Commit con mensaje descriptivo
git commit -m "refactor(semana-03): aplicar encapsulación y constructores

What? 
- Todos los atributos refactorizados a private
- Getters/setters con validaciones implementados
- Constructores sobrecargados (mínimo 3 por clase)
- Documentación completa de mejoras

For? 
Mejorar robustez del código aplicando principios de encapsulación

Impact? 
Código más seguro, mantenible y profesional"

# 4. Subir a GitHub
git push origin main

# 5. Verificar en GitHub
# Abre tu repositorio en el navegador y verifica que semana-03 esté visible
```

---

## 📊 Criterios de Evaluación

| Aspecto | Puntos | Detalles |
|---------|--------|----------|
| **Encapsulación completa** | 25 | Todos los atributos private, uso de final, constantes, JavaDoc |
| **Getters/Setters validados** | 25 | Validaciones apropiadas, excepciones, mensajes claros |
| **Constructores sobrecargados** | 25 | Mínimo 3, uso de this(), validaciones, JavaDoc |
| **Documentación** | 25 | ANALISIS.md completo, comparaciones, reflexión |
| **TOTAL** | **100** | |

---

## 💡 Tips Importantes

### ¿Qué validar?

| Tipo | Validaciones Comunes |
|------|---------------------|
| `String` | `!= null`, `.trim().isEmpty()`, longitud mínima/máxima |
| `int/double` | Rango válido, no negativo (si aplica) |
| `boolean` | Sin validación necesaria |
| Objetos | `!= null` |

### Ejemplo de Validación Completa

```java
public void setPrecio(double precio) {
    // Validación 1: No negativo
    if (precio < 0) {
        throw new IllegalArgumentException(
            "El precio no puede ser negativo. Valor recibido: " + precio);
    }
    
    // Validación 2: Límite máximo (regla de negocio)
    if (precio > 1000000) {
        throw new IllegalArgumentException(
            "El precio excede el límite máximo de $1,000,000");
    }
    
    // Si pasa todas las validaciones
    this.precio = precio;
}
```

### Patrón de Constructores

```java
// Constructor 1: COMPLETO (tiene todas las validaciones)
public Clase(p1, p2, p3, p4) {
    // Validaciones aquí
    this.atributo1 = p1;
    this.atributo2 = p2;
    this.atributo3 = p3;
    this.atributo4 = p4;
}

// Constructor 2: Parcial (llama al completo)
public Clase(p1, p2, p3) {
    this(p1, p2, p3, "default_value");  // ⬅️ Primera línea
}

// Constructor 3: Mínimo (llama al completo)
public Clase(p1, p2) {
    this(p1, p2, "default", 0);  // ⬅️ Primera línea
}
```

---

## ❓ Preguntas Frecuentes

### ¿Debo modificar los archivos de semana-02?

**No.** Los archivos de `semana-02` se quedan como histórico. Solo trabajas en la copia (`semana-03`).

### ¿Debo agregar nuevas funcionalidades?

**No.** Esta semana es de **refactorización**. El programa hace lo mismo, pero mejor escrito.

### ¿Todos los setters necesitan validación?

Idealmente sí, pero **mínimo 3 por clase** es obligatorio para cumplir con la rúbrica.

### ¿Puedo crear excepciones personalizadas?

Sí, pero no es obligatorio. `IllegalArgumentException` es suficiente para esta semana.

### ¿El Main debe fallar?

No. El Main debe **capturar** las excepciones con `try-catch` y mostrar que las validaciones funcionan.

### Mi código no compila, ¿qué hago?

```bash
# Ver errores de compilación
javac src/*.java

# Errores comunes:
# 1. Atributo final sin inicializar → Inicializar en constructor
# 2. Variable no usada → Eliminar o usar
# 3. Falta return → Agregar return en método
```

---

## 🔗 Referencias

- **Formato Completo (Semana 01)**: Ver `semana-01/4. asignación_dominios/FORMATO_ENTREGA.md`
- **Ejercicios Detallados**: Ver `EJERCICIOS_SEMANALES.md` en esta carpeta
- **Convenciones Java**: [Oracle Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)
- **JavaDoc Guide**: [How to Write Doc Comments](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)

---

## 📧 Contacto

Si tienes dudas sobre el formato de entrega, consulta con tu instructor o revisa los ejemplos en clase.

---

**Recuerda:** La calidad del código es más importante que la cantidad. Enfócate en hacer **refactorizaciones significativas** que demuestren comprensión de encapsulación. 🎯
