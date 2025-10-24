# Assets Visuales - Semana 4: Herencia

## 📊 Recursos Visuales SVG

Esta carpeta contiene diagramas en formato SVG (Scalable Vector Graphics) que ilustran los conceptos clave de herencia en Java. Todos los diagramas están diseñados con tema oscuro para facilitar la visualización en presentaciones y pantallas.

---

## 🎨 Lista de Assets

### 1. `1-concepto-herencia.svg`
**Concepto de Herencia y Relación "es-un"**

**Contenido:**
- Diagrama que muestra la relación de herencia entre clases
- Ilustración de la relación "es-un" (is-a)
- Ejemplo: Animal → Perro, Gato, Pájaro
- Flechas indicando la dirección de herencia
- Atributos y métodos heredados

**Conceptos ilustrados:**
- Superclase (clase padre)
- Subclases (clases hijas)
- Relación "es-un"
- Herencia de atributos y métodos

---

### 2. `2-extends-sintaxis.svg`
**Palabra Clave `extends` y Sintaxis**

**Contenido:**
- Sintaxis completa de herencia con `extends`
- Código de ejemplo visual
- Comparación: sin herencia vs con herencia
- Estructura de clase padre e hija
- Resaltado de sintaxis de la palabra clave

**Conceptos ilustrados:**
- Sintaxis: `class Hijo extends Padre`
- Declaración de atributos en cada clase
- Constructores y uso de `super()`
- Métodos heredados vs propios

---

### 3. `3-jerarquia-clases.svg`
**Jerarquía de Clases (Árbol de Herencia)**

**Contenido:**
- Árbol visual de jerarquía de clases
- Ejemplo de múltiples niveles
- Jerarquía de figuras geométricas o vehículos
- Relaciones padre-hijo en varios niveles
- Flujo de herencia de arriba hacia abajo

**Conceptos ilustrados:**
- Herencia multinivel
- Herencia jerárquica
- Raíz de jerarquía (clase base)
- Hojas del árbol (clases más específicas)

**Ejemplo de jerarquía:**
```
        Vehiculo
       /        \
VehiculoTerrestre  VehiculoAcuatico
    /      \           |
Automovil Moto      Barco
```

---

### 4. `4-palabra-super.svg`
**Uso de la Palabra Clave `super`**

**Contenido:**
- Tres usos principales de `super`
- `super()` para constructores
- `super.metodo()` para métodos
- `super.atributo` para atributos
- Ejemplos de código visual
- Flujo de ejecución con `super()`

**Conceptos ilustrados:**
- `super()` debe ser primera línea en constructor
- Llamada a métodos del padre con `super.metodo()`
- Acceso a atributos del padre con `super.atributo`
- Diferencia entre `this` y `super`

---

### 5. `5-herencia-atributos-metodos.svg`
**Herencia de Atributos y Métodos**

**Contenido:**
- Tabla visual de qué se hereda y qué no
- Modificadores de acceso y herencia
- Flujo de atributos de padre a hijo
- Métodos heredados disponibles en la subclase
- Indicadores de accesibilidad (✅/❌)

**Conceptos ilustrados:**
- Atributos `public`, `protected`, `private`
- Qué es accesible en la subclase
- Métodos heredados vs métodos propios
- Encapsulación en contexto de herencia

**Tabla incluida:**
| Modificador | ¿Se hereda? | ¿Accesible en subclase? |
|-------------|-------------|-------------------------|
| public      | ✅          | ✅                      |
| protected   | ✅          | ✅                      |
| default     | ✅*         | ✅* (mismo paquete)     |
| private     | ❌          | ❌                      |

---

### 6. `6-constructores-jerarquia.svg`
**Constructores en Jerarquías de Herencia**

**Contenido:**
- Orden de ejecución de constructores
- Flujo de llamadas con `super()`
- Ejemplo de jerarquía de 3 niveles
- Secuencia numérica de ejecución
- Constructores con y sin parámetros

**Conceptos ilustrados:**
- Orden: Abuelo → Padre → Hijo
- `super()` como primera línea
- Paso de parámetros a través de la jerarquía
- Constructor por defecto vs explícito

**Ejemplo de flujo:**
```
1. Constructor Abuelo()
2. Constructor Padre() llama super()
3. Constructor Hijo() llama super()
```

---

## 🎨 Características de los SVG

### Estilo Visual

- **Tema:** Oscuro (fondo dark, texto claro)
- **Paleta de colores:**
  - Fondo: `#1e1e1e`, `#2d2d2d`
  - Texto: `#e0e0e0`, `#ffffff`
  - Acentos: `#4a9eff` (azul), `#4ec9b0` (verde), `#ce9178` (naranja)
  - Resaltado de sintaxis: Colores tipo VS Code Dark
- **Tipografía:** Fuentes monoespaciadas para código (Consolas, Monaco, 'Courier New')
- **Sin degradados:** Colores sólidos para mejor legibilidad

### Dimensiones

- **Ancho estándar:** 1200px
- **Alto variable:** Según contenido (800-1000px típicamente)
- **Formato:** SVG (escalable sin pérdida de calidad)

### Compatibilidad

- ✅ Navegadores modernos
- ✅ Markdown (GitHub, GitLab)
- ✅ Presentaciones (PowerPoint, Google Slides)
- ✅ Documentación (PDF export)
- ✅ Impresión

---

## 📖 Uso en el Bootcamp

### En Presentaciones

```html
<!-- Incluir en HTML -->
<img src="./0-assets/1-concepto-herencia.svg" alt="Concepto de Herencia" width="800">
```

### En Markdown

```markdown
![Concepto de Herencia](./0-assets/1-concepto-herencia.svg)
```

### En Material Teórico

Los diagramas complementan el material en `/1-teoria/` y deben usarse para:
- Explicaciones en clase
- Material de estudio autónomo
- Refuerzo visual de conceptos
- Documentación de proyectos

---

## 🛠️ Herramientas de Edición

Si necesitas modificar los SVG:

1. **Editor Online:** [SVG Edit](https://svg-edit.github.io/svgedit/)
2. **Editor de Escritorio:** [Inkscape](https://inkscape.org/) (GRATIS)
3. **Editor Profesional:** Adobe Illustrator
4. **Editor de Código:** Cualquier editor de texto (los SVG son XML)

---

## 📝 Convenciones de Diseño

### Código en Diagramas

```java
// Formato de código en SVG
public class Ejemplo extends Padre {
    private String atributo;  // Comentarios en línea
    
    public Ejemplo() {
        super();  // ← Indicadores visuales
    }
}
```

### Flechas y Conectores

- **→** Herencia (apunta de hijo a padre)
- **--** Asociación
- **···** Dependencia
- **◆** Composición
- **◇** Agregación

### Íconos y Símbolos

- ✅ Permitido / Correcto
- ❌ No permitido / Incorrecto
- ⚠️ Advertencia / Precaución
- 💡 Tip / Sugerencia
- 📝 Nota importante

---

## 🎓 Propósito Pedagógico

Cada diagrama está diseñado para:

1. **Visualizar conceptos abstractos:** Hacer tangible la herencia
2. **Complementar teoría:** No reemplazar, sino reforzar
3. **Facilitar comparaciones:** Mostrar "antes/después", "correcto/incorrecto"
4. **Acelerar comprensión:** "Una imagen vale más que mil palabras"
5. **Servir como referencia:** Material de consulta rápida

---

## 📊 Mapping con Material Teórico

| SVG | Archivo de Teoría | Sección |
|-----|-------------------|---------|
| `1-concepto-herencia.svg` | `01-concepto-herencia.md` | ¿Qué es herencia? |
| `2-extends-sintaxis.svg` | `02-palabra-extends.md` | Sintaxis básica |
| `3-jerarquia-clases.svg` | `03-jerarquias-clases.md` | Tipos de jerarquías |
| `4-palabra-super.svg` | `04-palabra-super.md` | Usos de super |
| `5-herencia-atributos-metodos.svg` | `02-palabra-extends.md` | Qué se hereda |
| `6-constructores-jerarquia.svg` | `04-palabra-super.md` | Orden de ejecución |

---

## 🔄 Actualización de Assets

**Versión actual:** 1.0  
**Última actualización:** Octubre 2025

Si necesitas actualizar o crear nuevos assets:

1. Mantén el estilo visual consistente (tema dark)
2. Usa la misma paleta de colores
3. Asegura legibilidad en pantalla y papel
4. Exporta en SVG para escalabilidad
5. Nombra archivos descriptivamente
6. Actualiza este README

---

## 📱 Accesibilidad

Los SVG incluyen:
- Texto alternativo (atributo `alt`)
- Alto contraste (tema dark)
- Tamaño de fuente legible (≥14px)
- Escalables sin pérdida de calidad

---

## 🔗 Referencias de Diseño

- [Google Material Design](https://material.io/design)
- [VS Code Color Theme](https://code.visualstudio.com/docs/getstarted/themes)
- [UML Notation Guide](https://www.uml-diagrams.org/)

---

**Última actualización:** Octubre 2025  
**Creado por:** Equipo Pedagógico SENA
