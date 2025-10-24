# Ejercicios Semanales - Semana 04

## 📚 Herencia

### Tema Central
Aplicar herencia para crear jerarquías de clases, reutilizar código y especializar comportamientos.

---

## 🎯 Objetivo de la Semana

Extender el sistema desarrollado en semanas anteriores agregando **relaciones de herencia** entre clases, aplicando los conceptos de:
- Superclases y subclases
- Palabra clave `extends`
- Uso de `super` para llamar constructores y métodos de la clase padre
- Sobrescritura de métodos (`@Override`)
- Polimorfismo básico

---

## 📊 Estructura de Ejercicios

Esta semana **SÍ agregas nuevas clases**, pero basadas en las existentes mediante herencia.

| Ejercicio | Descripción | Puntos |
|-----------|-------------|--------|
| **1** | Identificar jerarquía y crear superclase | 20 pts |
| **2** | Crear dos subclases especializadas | 30 pts |
| **3** | Actualizar gestor para polimorfismo | 25 pts |
| **4** | Main integrado y documentación | 25 pts |
| **TOTAL** | | **100 pts** |

---

## 🔄 Continuidad con Semanas Anteriores

### Semana 01
✅ Creaste 2 clases básicas de tu dominio

### Semana 02
✅ Agregaste 3ra clase + Sistema/Gestor con arrays

### Semana 03
✅ Refactorizaste aplicando encapsulación y constructores

### Semana 04 ⬅️ ESTAMOS AQUÍ
🎯 Agregas jerarquías con herencia sobre el código bien encapsulado

---

## 💡 Enfoque de la Semana

**Pregunta clave:** ¿Cuál de mis clases existentes puede tener "tipos especiales" o "categorías"?

### Ejemplos por Dominio

| Dominio | Clase Base | Posibles Subclases |
|---------|------------|-------------------|
| Sistema Educativo | Curso | CursoPresencial, CursoVirtual |
| Biblioteca | Libro | LibroFisico, LibroDigital |
| Restaurante | Producto | ProductoCongelado, ProductoFresco |
| Tienda | Articulo | ArticuloPerecible, ArticuloNoPerecible |
| Hospital | Paciente | PacienteHospitalizado, PacienteConsultaExterna |
| Veterinaria | Animal | AnimalDomestico, AnimalExotico |

**Patrón:** Una clase existente se convierte en **superclase**, y creas **2 subclases** especializadas.

---

## 🎨 Lo Nuevo Esta Semana

### Antes (Semana 03)
```
Clase1 ━━━━━━━━ Independiente
Clase2 ━━━━━━━━ Independiente  
Clase3 ━━━━━━━━ Independiente
```

### Después (Semana 04)
```
        Clase1 (Superclase)
           ┃
    ┏━━━━━━╋━━━━━━┓
    ┃             ┃
Clase1A      Clase1B
(Subclase)   (Subclase)

Clase2 ━━━━━━━━ Sin cambios
Clase3 ━━━━━━━━ Sin cambios
```

---

## 📝 Vista Previa de Ejercicios

### Ejercicio 1: Jerarquía (20 pts)
- Identifica qué clase será la superclase
- Refactoriza para extraer atributos/métodos comunes
- Documenta la decisión de diseño

### Ejercicio 2: Subclases (30 pts)
- Crea 2 subclases especializadas
- Cada una agrega mínimo 2 atributos propios
- Implementa constructores usando `super()`
- Sobrescribe mínimo 1 método

### Ejercicio 3: Gestor Polimórfico (25 pts)
- Actualiza `Sistema[X].java` para manejar la superclase
- Arrays de tipo superclase pueden contener subclases
- Métodos funcionan con polimorfismo

### Ejercicio 4: Integración (25 pts)
- Main demuestra el uso de herencia
- Documentación completa con diagramas
- Análisis de ventajas de herencia

---

## ⚙️ Pesos de Evaluación

```
Ejercicios Semanales: 70%
├─ Ejercicio 1: 20 pts (14%)
├─ Ejercicio 2: 30 pts (21%)
├─ Ejercicio 3: 25 pts (17.5%)
└─ Ejercicio 4: 25 pts (17.5%)

Otras evidencias: 30%
└─ Quiz, taller en clase, participación
```

---

## 📦 Entregables

1. **Código:**
   - `semana-04/src/` con jerarquía implementada
   - Superclase refactorizada
   - 2 subclases nuevas
   - Gestor actualizado
   - Main integrador

2. **Documentación:**
   - `semana-04/docs/ANALISIS.md` con:
     - Diagrama de jerarquía UML
     - Justificación de diseño
     - Comparación antes/después
     - Ventajas observadas

3. **README.md:**
   - Descripción de la jerarquía
   - Instrucciones de compilación

---

## 🚀 Preparación

### Antes de Empezar

1. ✅ Asegúrate de tener `semana-03` completa y funcionando
2. ✅ Identifica cuál de tus 3 clases se puede especializar
3. ✅ Piensa en 2 "tipos" o "categorías" de esa clase

### Comandos Iniciales

```bash
# Copiar semana-03 como base
cp -r semana-03 semana-04

# Entrar a la nueva carpeta
cd semana-04

# Ahora sí, agregar jerarquía...
```

---

## 📚 Recursos

- Ver archivo `EJERCICIOS_SEMANALES.md` para especificaciones detalladas
- Ver archivo `FORMATO_ENTREGA.md` para estructura de entrega
- Revisar material teórico en `semana-04/1-teoria/`

---

## 💬 Nota del Instructor

Esta semana es emocionante porque finalmente **agregas nueva funcionalidad** mediante herencia. El código de semana-03 (bien encapsulado) es la base perfecta para aplicar herencia de forma profesional.

**Recuerda:** Herencia representa relación "ES-UN" (is-a). Pregúntate: ¿[Subclase] ES-UN [Superclase]? Si la respuesta es sí, es buen candidato para herencia.

---

**¡Es hora de construir jerarquías!** 🏗️
