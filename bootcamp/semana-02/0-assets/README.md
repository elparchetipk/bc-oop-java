# Assets Visuales - Semana 02

## 📊 Recursos Gráficos

Esta carpeta contiene recursos visuales (diagramas SVG) para complementar el material teórico de la Semana 02 sobre **Fundamentos de Clases y Objetos**.

---

## 🎨 Diagramas Disponibles

### 1. `1-anatomia-clase.svg`
**Descripción:** Estructura completa de una clase Java

**Contenido:**
- Modificadores de acceso (public, private)
- Sección de atributos (estado del objeto)
- Sección de constructores
- Sección de métodos (comportamiento)
- Etiquetas explicativas identificando cada componente
- Sintaxis visual completa de una clase Persona

**Uso recomendado:** Introducción al concepto de clase, explicación de componentes

---

### 2. `2-objeto-vs-clase.svg`
**Descripción:** Diferencias visuales entre clase y objeto

**Contenido:**
- Lado izquierdo: Clase como plantilla abstracta
- Lado derecho: Múltiples objetos con valores específicos
- Flecha de instanciación con operador "new"
- Tabla comparativa con 5 aspectos clave:
  - Naturaleza (abstracta vs concreta)
  - Existencia (código vs memoria)
  - Cantidad (una vs muchas)
  - Valores (genéricos vs específicos)
  - Memoria (no ocupa vs ocupa)
- Analogía del molde de galletas

**Uso recomendado:** Explicar la diferencia fundamental entre clase y objeto

---

### 3. `3-instanciacion-memoria.svg`
**Descripción:** Proceso de instanciación en memoria (Stack y Heap)

**Contenido:**
- Paso 1: Código Java con operador "new"
- Paso 2: Organización de memoria:
  - **STACK (Pila)**: almacena referencias y variables locales
  - **HEAP (Montículo)**: almacena objetos completos
- Paso 3: Proceso detallado en 6 pasos (A-F):
  - Evaluación del operador new
  - Reserva de espacio en HEAP
  - Inicialización de atributos
  - Ejecución del constructor
  - Obtención de la dirección
  - Asignación a la variable
- Flecha de referencia mostrando cómo la variable apunta al objeto

**Uso recomendado:** Explicar qué sucede internamente cuando creamos un objeto

---

### 4. `4-atributos-vs-metodos.svg`
**Descripción:** Comparación entre atributos y métodos (Estado vs Comportamiento)

**Contenido:**
- Lado izquierdo: **ATRIBUTOS** 📊
  - Definición: Variables que definen el estado
  - Ejemplo de código con clase Coche
  - Características (qué ES, almacenan valores)
  - Ejemplo práctico de uso
- Lado derecho: **MÉTODOS** ⚙️
  - Definición: Funciones que definen el comportamiento
  - Ejemplo de código con acciones del Coche
  - Características (qué HACE, reciben parámetros)
  - Ejemplo práctico de invocación
- Resumen: Atributos = Sustantivos, Métodos = Verbos

**Uso recomendado:** Diferenciar estado y comportamiento de un objeto

---

### 5. `5-encapsulacion-visual.svg`
**Descripción:** Concepto visual de encapsulación

**Contenido:**
- Concepto de cápsula protectora:
  - Zona privada (interior): atributos private con candados 🔒
  - Zona pública (exterior): métodos public de acceso 🔓
- Comparación SIN vs CON encapsulación:
  - Problemas del acceso directo (valores inválidos)
  - Ventajas del acceso controlado (validación)
- Ejemplo completo con clase CuentaBancaria:
  - Atributo privado: saldo
  - Métodos públicos: getSaldo(), depositar()
  - Validación en el setter
- Beneficios: ocultar implementación, validar datos, proteger integridad

**Uso recomendado:** Introducir el concepto de encapsulación y modificadores de acceso

---

## 🛠️ Cómo Usar los Diagramas

### En Documentación Markdown

```markdown
![Anatomía de una Clase](./0-assets/1-anatomia-clase.svg)
```

### En Presentaciones

- Importar directamente el archivo SVG
- Escala sin pérdida de calidad (formato vectorial)
- Compatible con PowerPoint, Google Slides, Canva

### En Clases Presenciales

- Proyectar en pantalla grande
- Imprimir en alta calidad (A3 o A4)
- Compartir en plataformas LMS (Moodle, Blackboard)
- Usar como material de estudio individual

### En Repositorios GitHub

```markdown
<img src="./0-assets/2-objeto-vs-clase.svg" width="800" alt="Clase vs Objeto"/>
```

---

## 📐 Especificaciones Técnicas

**Formato:** SVG (Scalable Vector Graphics)

**Dimensiones:** 900x600 px (diagramas 1,2,4,5) / 900x700 px (diagrama 3)

**Paleta de colores:**
- Azul principal: `#3498db` (clases, atributos)
- Verde éxito: `#27ae60` (objetos, métodos públicos)
- Rojo alerta: `#e74c3c` (privado, problemas)
- Naranja acento: `#ff9800` / `#e67e22` (métodos, referencias)
- Gris texto: `#2c3e50`, `#34495e`
- Gris claro: `#7f8c8d`, `#95a5a6`
- Fondos: `#f8f9fa`, `#ecf0f1`

**Fuentes:**
- Títulos y texto: Arial, sans-serif
- Código: 'Courier New', monospace

**Accesibilidad:**
- Texto legible (tamaño mínimo 12px)
- Alto contraste
- Etiquetas descriptivas

---

## 🔄 Relación con Contenido Teórico

| Diagrama | Archivo de Teoría | Sección |
|----------|-------------------|---------|
| `1-anatomia-clase.svg` | `01-concepto-clase.md` | Componentes de una clase |
| `2-objeto-vs-clase.svg` | `01-concepto-clase.md` + `02-concepto-objeto.md` | Diferencias fundamentales |
| `3-instanciacion-memoria.svg` | `02-concepto-objeto.md` | Operador new y memoria |
| `4-atributos-vs-metodos.svg` | `03-atributos-metodos.md` | Estado vs Comportamiento |
| `5-encapsulacion-visual.svg` | `05-encapsulacion-basica.md` | Modificadores de acceso |

---

## 📚 Recomendaciones de Uso Didáctico

### Estrategia 1: Clase Invertida
1. Compartir diagramas como material previo
2. Estudiantes los analizan en casa
3. Sesión presencial para resolver dudas

### Estrategia 2: Aprendizaje Activo
1. Proyectar diagrama
2. Pedir a estudiantes identificar componentes
3. Discusión grupal

### Estrategia 3: Evaluación Formativa
1. Usar diagramas en quizzes
2. Pedir completar partes faltantes
3. Identificar errores conceptuales

---

## 🎯 Objetivos de Aprendizaje por Diagrama

**Diagrama 1 (Anatomía):** Identificar las partes de una clase Java

**Diagrama 2 (Clase vs Objeto):** Diferenciar entre plantilla e instancia

**Diagrama 3 (Memoria):** Comprender Stack y Heap

**Diagrama 4 (Atributos vs Métodos):** Distinguir estado y comportamiento

**Diagrama 5 (Encapsulación):** Aplicar modificadores de acceso

---

## 📝 Notas para Instructores

- Los diagramas están diseñados para imprimirse en **color**
- Se recomienda revisarlos antes de la sesión
- Pueden editarse con cualquier editor SVG (Inkscape, Adobe Illustrator)
- Los colores son consistentes con la semana anterior (semana-01)
- Incluyen ejemplos prácticos con código Java

---

## 🔗 Recursos Adicionales

- [Documentación oficial de Java](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Tutorial de clases y objetos](https://www.w3schools.com/java/java_classes.asp)
- [Visualización de memoria Java](https://pythontutor.com/java.html)

---

**Última actualización:** Semana 02 - Bootcamp POO Java
**Licencia:** Uso educativo libre para el programa SENA

