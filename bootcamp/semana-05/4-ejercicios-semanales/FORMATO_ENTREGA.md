# Formato de Entrega - Semana 05: Polimorfismo

## 📦 Información de Entrega

**Asignatura:** Programación Orientada a Objetos con Java  
**Semana:** 05 - Polimorfismo (Overloading y Overriding)  
**Peso:** 70% de la nota semanal  
**Modalidad:** Repositorio GitHub  
**Fecha límite:** Domingo 23:59 de la Semana 05

---

## 🎯 Objetivo de la Semana

Esta semana **refinas el polimorfismo** en tu proyecto aplicando:

1. ✅ **Sobrecarga (Overloading)**: Múltiples versiones del mismo método
2. ✅ **Sobrescritura (Overriding)**: Métodos personalizados en subclases
3. ✅ **Polimorfismo dinámico**: Uso flexible de tipos

**⚠️ NO se agregan más clases**, solo se refinan las existentes.

---

## 📂 Estructura del Repositorio

```
bc-poo-java-[tu-nombre]-[tu-apellido]/
├── README.md                         # Actualizado con semana 05
├── semana-01/
│   ├── README.md
│   ├── src/
│   │   ├── [Clase1].java
│   │   ├── [Clase2].java
│   │   └── Main.java
│   └── docs/
│       └── ANALISIS_DOMINIO.md
├── semana-02/
│   ├── README.md
│   ├── src/
│   │   ├── [Clase1].java
│   │   ├── [Clase2].java
│   │   ├── [Clase3].java            # Agregada en S02
│   │   ├── Sistema[Dominio].java    # Gestor agregado en S02
│   │   └── Main.java
│   └── docs/
│       └── REFLEXION.md
├── semana-03/
│   ├── README.md
│   ├── src/
│   │   ├── [Clase1].java            # Encapsulada
│   │   ├── [Clase2].java            # Encapsulada
│   │   ├── [Clase3].java            # Encapsulada
│   │   ├── Sistema[Dominio].java    # Refactorizado
│   │   └── Main.java
│   └── docs/
│       └── COMPARATIVA.md
├── semana-04/
│   ├── README.md
│   ├── src/
│   │   ├── [ClasePadre].java        # Superclase creada en S04
│   │   ├── [SubClase1].java         # Heredada en S04
│   │   ├── [SubClase2].java         # Heredada en S04
│   │   ├── [Clase2].java            # Sin cambios
│   │   ├── [Clase3].java            # Sin cambios
│   │   ├── Sistema[Dominio].java    # Actualizado para herencia
│   │   └── Main.java
│   └── docs/
│       └── JERARQUIA.md
└── semana-05/                        # ⬅️ NUEVA ENTREGA
    ├── README.md                     # 🆕 Descripción semana 05
    ├── src/
    │   ├── [ClasePadre].java        # ✅ CON SOBRECARGA Y SOBRESCRITURA
    │   ├── [SubClase1].java         # ✅ CON SOBRESCRITURA AVANZADA
    │   ├── [SubClase2].java         # ✅ CON SOBRESCRITURA AVANZADA
    │   ├── [Clase2].java            # Sin cambios mayores
    │   ├── [Clase3].java            # Sin cambios mayores
    │   ├── Sistema[Dominio].java    # ✅ MÉTODOS 100% POLIMÓRFICOS
    │   └── Main.java                # ✅ DEMOSTRACIÓN POLIMORFISMO
    └── docs/
        └── ANALISIS.md               # 🆕 ANÁLISIS DE POLIMORFISMO
```

---

## ✅ Checklist de Entrega

### 1. Estructura de Carpetas
- [ ] Carpeta `semana-05/` creada en el repositorio
- [ ] Subcarpeta `src/` con todos los archivos `.java`
- [ ] Subcarpeta `docs/` con el archivo `ANALISIS.md`
- [ ] Archivo `README.md` en la raíz de `semana-05/`

### 2. Código Fuente

#### Clase Padre (Superclase)
- [ ] Implementa `Comparable<[ClasePadre]>`
- [ ] Sobrescribe `equals()` y `hashCode()`
- [ ] Mínimo 3 métodos sobrecargados
- [ ] Método `compareTo()` implementado
- [ ] Método `compararPor()` con criterios
- [ ] JavaDoc completo en métodos sobrecargados

#### Subclases
- [ ] Cada subclase sobrescribe `equals()` y `hashCode()`
- [ ] Mínimo 2 métodos sobrecargados por subclase
- [ ] Sobrescritura de `calcularCosto()` o método equivalente
- [ ] Sobrescritura de `mostrarInformacion()` usando `super`
- [ ] Mínimo 1 método adicional sobrescrito con lógica específica
- [ ] Anotación `@Override` en todos los métodos sobrescritos

#### Gestor (Sistema)
- [ ] Métodos de búsqueda polimórficos
- [ ] Método `ordenarPor(String criterio)` polimórfico
- [ ] Método `obtenerMasCostoso()` o equivalente
- [ ] Método `obtenerMasEconomico()` o equivalente
- [ ] Método `generarEstadisticas()` usando polimorfismo
- [ ] Método de operación masiva polimórfica (ej: descuentos)
- [ ] Uso mínimo de `instanceof` (preferir polimorfismo)

#### Main.java
- [ ] Sección 1: Demostración de sobrecarga
- [ ] Sección 2: Demostración de sobrescritura
- [ ] Sección 3: Demostración de polimorfismo dinámico
- [ ] Sección 4: Demostración de `equals()` y `hashCode()`
- [ ] Sección 5: Demostración de ordenamiento con `Comparable`
- [ ] Sección 6: Métodos polimórficos del gestor
- [ ] Sección 7: Operaciones masivas polimórficas
- [ ] Sección 8: Estadísticas generales
- [ ] Comentarios explicativos en cada sección
- [ ] Salida organizada y legible

### 3. Documentación

#### README.md (semana-05/)
- [ ] Título: "Semana 05 - Polimorfismo"
- [ ] Descripción de los cambios realizados
- [ ] Sección "Polimorfismo Aplicado" con ejemplos
- [ ] Instrucciones de compilación y ejecución
- [ ] Capturas de pantalla de la ejecución (opcional)

#### ANALISIS.md
- [ ] Sección 1: Tipos de polimorfismo aplicados
- [ ] Sección 2: Comparación con/sin polimorfismo
- [ ] Sección 3: Ventajas medibles (métricas)
- [ ] Sección 4: Patrones identificados
- [ ] Sección 5: Casos de uso del polimorfismo
- [ ] Sección 6: Lecciones aprendidas
- [ ] Sección 7: Métricas de calidad
- [ ] Sección 8: Próximos pasos
- [ ] Sección 9: Conclusión
- [ ] Ejemplos de código ilustrativos

### 4. Calidad del Código
- [ ] Código compila sin errores
- [ ] Código ejecuta correctamente
- [ ] Sin warnings del compilador
- [ ] Nombres descriptivos (variables, métodos, clases)
- [ ] Indentación consistente
- [ ] JavaDoc en todos los métodos públicos
- [ ] Comentarios en lógica compleja
- [ ] Sin código comentado innecesario

### 5. Control de Versiones (Git)
- [ ] Commits con mensajes descriptivos
- [ ] Formato de commit: `feat(semana-05): [descripción]`
- [ ] Historial de commits coherente
- [ ] Sin archivos compilados (`.class`) en el repositorio
- [ ] `.gitignore` configurado correctamente

---

## 📝 Ejemplo de README.md (semana-05/)

```markdown
# Semana 05 - Polimorfismo

## 🎯 Objetivo

Aplicar polimorfismo mediante sobrecarga y sobrescritura de métodos para crear un sistema flexible y extensible.

## 🔄 Cambios Realizados

### Sobrecarga (Overloading)

**Clase `Curso`:**
- `aplicarDescuento(int porcentaje)`: Descuento por porcentaje
- `aplicarDescuento(double monto)`: Descuento por monto fijo
- `aplicarDescuento(int porcentaje, double limite)`: Descuento con límite

**Clase `CursoVirtual`:**
- `generarEnlace()`: Genera enlace automático
- `generarEnlace(int sala)`: Genera enlace con sala específica
- `generarEnlace(int sala, String password)`: Genera enlace con contraseña

### Sobrescritura (Overriding)

**Métodos sobrescritos en subclases:**
- `calcularCosto()`: Cada subclase calcula según sus características
- `calcularCostoConDescuento()`: Descuentos diferenciados
- `mostrarInformacion()`: Información específica de cada tipo
- `equals()` y `hashCode()`: Comparación correcta de objetos
- `toString()`: Representación en String personalizada

### Gestor Polimórfico

**SistemaCursos refactorizado:**
- `buscarPorCriterio(String)`: Búsqueda flexible
- `ordenarPor(String)`: Ordenamiento por cualquier criterio
- `generarEstadisticas()`: Estadísticas usando polimorfismo
- `calcularDescuentoMasivo(int)`: Operación masiva polimórfica

## 📊 Ventajas Observadas

| Métrica | Antes | Después | Mejora |
|---------|-------|---------|--------|
| Líneas de código | 450 | 280 | ↓ 38% |
| Métodos en gestor | 15 | 9 | ↓ 40% |
| Complejidad | Alta | Media | ↓ 47% |
| Extensibilidad | Baja | Alta | ↑ 300% |

## 🚀 Compilación y Ejecución

### IntelliJ IDEA (Recomendado)

1. Abrir IntelliJ IDEA
2. File → Open → Seleccionar carpeta `semana-05`
3. Configurar Source Roots:
   - Clic derecho en `src` → Mark Directory as → Sources Root
   - Clic derecho en `docs` → Mark Directory as → Excluded
4. Ejecutar `Main.java`:
   - Clic derecho en Main.java → Run 'Main.main()'

### Terminal (Línea de Comandos)

```bash
cd semana-05/src

# Compilar todos los archivos
javac *.java

# Ejecutar
java Main
```

## 📚 Documentación

Ver `docs/ANALISIS.md` para análisis detallado del polimorfismo aplicado.

## 👤 Autor

**Nombre:** [Tu Nombre]  
**Ficha:** [Tu Ficha]  
**Dominio:** [Tu Dominio]  
**Fecha:** [Fecha de Entrega]

## 📜 Licencia

Este proyecto es parte del Bootcamp de POO con Java del SENA.
```

---

## 💡 Ejemplo de Commit Message

```bash
git add semana-05/
git commit -m "feat(semana-05): implementar polimorfismo avanzado

What? 
- Métodos sobrecargados en superclase (aplicarDescuento, actualizar, esIgualA)
- Métodos sobrecargados en subclases (generarEnlace, asignarSalon)
- Sobrescritura avanzada con equals, hashCode, Comparable
- Gestor 100% polimórfico (buscar, ordenar, estadísticas)
- Main demostrando overloading, overriding y polimorfismo dinámico
- Análisis comparativo con/sin polimorfismo

For? 
Dominar polimorfismo mediante sobrecarga y sobrescritura para crear código flexible

Impact? 
- Reducción de 38% en líneas de código
- Complejidad reducida en 47%
- Gestor extensible sin modificaciones
- Código más mantenible y reutilizable"

git push origin main
```

---

## 🎯 Criterios de Evaluación

| Criterio | Puntos | Descripción |
|----------|--------|-------------|
| **Sobrecarga** | 25 | Mínimo 3 en superclase, 2 por subclase |
| **Sobrescritura** | 25 | equals, hashCode, Comparable + 2 adicionales |
| **Gestor Polimórfico** | 25 | Búsqueda, ordenamiento, estadísticas |
| **Main y Análisis** | 25 | Demostración completa + ANALISIS.md |
| **TOTAL** | **100** | |

---

## ⚠️ Errores Comunes a Evitar

### ❌ Error 1: Confundir Sobrecarga con Sobrescritura

**Incorrecto:**
```java
// Esto NO es sobrecarga, es sobrescritura
public class Curso {
    public void calcular() { }
}

public class CursoVirtual extends Curso {
    @Override
    public void calcular() { }  // ⚠️ Sobrescritura, no sobrecarga
}
```

**Correcto:**
```java
// Sobrecarga = mismo método, diferentes parámetros EN LA MISMA CLASE
public class Curso {
    public void actualizar(String nombre) { }
    public void actualizar(String nombre, String instructor) { }  // ✅ Sobrecarga
}
```

### ❌ Error 2: Olvidar @Override

**Incorrecto:**
```java
public class CursoVirtual extends Curso {
    // Sin @Override, posibles errores no detectados
    public double calcularCosto() {
        return super.calcularCosto() * 0.85;
    }
}
```

**Correcto:**
```java
public class CursoVirtual extends Curso {
    @Override  // ✅ Detecta errores en firma del método
    public double calcularCosto() {
        return super.calcularCosto() * 0.85;
    }
}
```

### ❌ Error 3: No Usar super en equals/hashCode

**Incorrecto:**
```java
public class CursoVirtual extends Curso {
    @Override
    public boolean equals(Object obj) {
        // ⚠️ No llama a super.equals(), ignora código de curso
        CursoVirtual otro = (CursoVirtual) obj;
        return this.plataforma.equals(otro.plataforma);
    }
}
```

**Correcto:**
```java
public class CursoVirtual extends Curso {
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;  // ✅ Primero verificar superclase
        if (!(obj instanceof CursoVirtual)) return false;
        CursoVirtual otro = (CursoVirtual) obj;
        return this.plataforma.equals(otro.plataforma);
    }
}
```

### ❌ Error 4: Abuso de instanceof

**Incorrecto:**
```java
public void procesarCurso(Curso c) {
    if (c instanceof CursoPresencial) {
        CursoPresencial cp = (CursoPresencial) c;
        System.out.println("Costo: " + cp.calcularCostoPresencial());
    } else if (c instanceof CursoVirtual) {
        CursoVirtual cv = (CursoVirtual) c;
        System.out.println("Costo: " + cv.calcularCostoVirtual());
    }
}
```

**Correcto:**
```java
public void procesarCurso(Curso c) {
    // ✅ Polimorfismo, sin instanceof
    System.out.println("Costo: " + c.calcularCosto());
}
```

### ❌ Error 5: Sobrecarga Ambigua

**Incorrecto:**
```java
// Ambiguo, el compilador no sabe cuál elegir
public void actualizar(String dato1, String dato2) { }
public void actualizar(String nombre, String instructor) { }  // ⚠️ Misma firma
```

**Correcto:**
```java
// Diferente número o tipo de parámetros
public void actualizar(String nombre) { }
public void actualizar(String nombre, String instructor) { }
public void actualizar(String nombre, String instructor, int horas) { }  // ✅
```

---

## 📞 Contacto y Soporte

### Durante el Desarrollo

- **Foro del curso:** Para preguntas técnicas
- **Grupos de estudio:** Para apoyo entre compañeros
- **Horas de tutoría:** [Horario según instructor]

### Entrega

- **Plataforma:** GitHub
- **Formato:** URL del repositorio
- **Plazo:** Domingo 23:59 (Semana 05)

---

## 🏆 Buenas Prácticas

### 1. Sobrecarga Coherente

```java
// ✅ Versiones del mismo concepto
public void registrar(String nombre)
public void registrar(String nombre, String email)
public void registrar(String nombre, String email, String telefono)

// ❌ Métodos sin relación lógica
public void registrar(String nombre)
public void procesar(String nombre, String email)  // Cambió el nombre
```

### 2. Sobrescritura con super

```java
// ✅ Extender funcionalidad
@Override
public void mostrarInformacion() {
    super.mostrarInformacion();  // Mostrar info común
    System.out.println("Plataforma: " + plataforma);  // Agregar específico
}
```

### 3. JavaDoc en Sobrecarga

```java
/**
 * Aplica descuento por porcentaje
 * @param porcentaje Porcentaje de descuento (0-100)
 * @return Costo con descuento aplicado
 */
public double aplicarDescuento(int porcentaje) { }

/**
 * Aplica descuento por monto fijo
 * @param monto Monto en pesos a descontar
 * @return Costo con descuento aplicado
 */
public double aplicarDescuento(double monto) { }
```

### 4. equals() Robusto

```java
@Override
public boolean equals(Object obj) {
    // 1. Verificar referencia
    if (this == obj) return true;
    
    // 2. Verificar null y clase
    if (obj == null || getClass() != obj.getClass()) return false;
    
    // 3. Llamar a super
    if (!super.equals(obj)) return false;
    
    // 4. Comparar atributos específicos
    CursoVirtual otro = (CursoVirtual) obj;
    return plataforma.equals(otro.plataforma);
}
```

### 5. Polimorfismo en Arrays

```java
// ✅ Array polimórfico
Curso[] cursos = new Curso[capacidad];

// Agregar diferentes tipos
cursos[0] = new CursoPresencial(...);
cursos[1] = new CursoVirtual(...);

// Usar polimórficamente
for (Curso c : cursos) {
    System.out.println(c.calcularCosto());  // Cada uno ejecuta su versión
}
```

---

## 📚 Recursos Adicionales

### Documentación Oficial

- [Java Tutorials - Polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
- [Object Methods (equals, hashCode)](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
- [Comparable Interface](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)

### Videos Recomendados

- Overloading vs Overriding en Java
- Implementando equals() y hashCode()
- Polimorfismo dinámico explicado

### Artículos

- Effective Java: Overriding equals and hashCode
- SOLID Principles: Liskov Substitution (polimorfismo)
- Clean Code: Refactoring con polimorfismo

---

## ✅ Checklist Final Antes de Entregar

- [ ] ✅ Código compila sin errores
- [ ] ✅ Código ejecuta correctamente
- [ ] ✅ Mínimo 3 métodos sobrecargados en superclase
- [ ] ✅ Mínimo 2 métodos sobrecargados por subclase
- [ ] ✅ equals(), hashCode() y Comparable implementados
- [ ] ✅ @Override en todos los métodos sobrescritos
- [ ] ✅ Gestor con métodos polimórficos
- [ ] ✅ Main demuestra todos los tipos de polimorfismo
- [ ] ✅ ANALISIS.md completo con comparaciones
- [ ] ✅ README.md actualizado
- [ ] ✅ Sin archivos `.class` en el repositorio
- [ ] ✅ Commits con mensajes descriptivos
- [ ] ✅ Repositorio pusheado a GitHub
- [ ] ✅ URL del repositorio enviada al instructor

---

## 🎓 Reflexión Final

Antes de entregar, responde estas preguntas en tu `ANALISIS.md`:

1. **¿Qué diferencia real notaste entre sobrecarga y sobrescritura?**
2. **¿Cómo el polimorfismo redujo la complejidad de tu código?**
3. **¿Qué método te costó más trabajo sobrescribir y por qué?**
4. **¿Cómo cambiaría tu código si agregas un tercer tipo de curso?**
5. **¿Qué ventaja práctica viste al implementar Comparable?**

---

## 📊 Rúbrica Resumida

| Aspecto | Excelente (100%) | Bueno (80%) | Suficiente (60%) | Insuficiente (<60%) |
|---------|------------------|-------------|------------------|---------------------|
| **Sobrecarga** | 3+ métodos en superclase, 2+ en cada subclase, bien documentados | 2-3 en superclase, 1-2 en subclases | Solo en superclase o sin variedad | Sin sobrecarga o incorrecta |
| **Sobrescritura** | equals, hashCode, Comparable + 2 adicionales con super | equals, hashCode, Comparable | Solo algunos métodos | Sin sobrescritura correcta |
| **Gestor** | Métodos 100% polimórficos, sin instanceof innecesario | Mayoría polimórficos, algún instanceof | Algunos polimórficos | Sin polimorfismo en gestor |
| **Main** | Demuestra 3 tipos claramente con salida organizada | Demuestra 2-3 tipos | Demuestra 1-2 tipos | No demuestra polimorfismo |
| **Análisis** | Completo, con métricas y comparaciones | Completo sin métricas | Incompleto | Sin análisis |

---

**¡Éxito en tu entrega de la Semana 05!** 🎯🎭

*El polimorfismo es el corazón de la POO. Domínalo y dominarás el paradigma.*
