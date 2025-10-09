# Assets Visuales - Semana 03

## 📊 Recursos Gráficos

Esta carpeta contiene recursos visuales (diagramas SVG) para complementar el material teórico de la Semana 03 sobre *
*Principios de Encapsulación y Constructores**.

---

## 🎨 Diagramas Disponibles

### 1. `1-modificadores-acceso.svg`

**Descripción:** Comparación completa de los 4 modificadores de acceso en Java

**Contenido:**

- **4 cajas superiores** con los modificadores:
  - `public` 🌍 (verde): Acceso global desde cualquier lugar
  - `protected` 👨‍👩‍👧 (naranja): Acceso en familia (paquete y subclases)
  - `default` 📦 (azul): Acceso en el mismo paquete
  - `private` 🔒 (rojo): Acceso solo dentro de la clase
- **Ejemplo de código** mostrando los 4 modificadores en una clase Persona
- **Tabla comparativa de visibilidad** con 4 contextos:
  - Misma clase
  - Mismo paquete
  - Subclases
  - Otros paquetes
- Marcas ✓ y ✗ indicando accesibilidad en cada caso

**Uso recomendado:** Explicar el alcance y restricciones de cada modificador de acceso

---

### 2. `2-getters-setters.svg`

**Descripción:** Funcionamiento de los métodos getters y setters

**Contenido:**

- **Diagrama central** con tres componentes:
  - Atributo privado en el centro (🔒 no accesible directamente)
  - GETTER arriba (azul): lee el valor del atributo
  - SETTER abajo (rojo): modifica el valor con validación
- **Flechas indicando flujo**:
  - Getter → LEER (flecha azul hacia el atributo)
  - Setter → ESCRIBIR (flecha roja hacia el atributo)
- Usuario/Cliente a la izquierda usando ambos métodos
- **Ejemplo completo** de clase Producto con:
  - Atributo privado: `private double precio;`
  - Getter: `public double getPrecio()`
  - Setter con validación: `public void setPrecio(double p)`
- **Convenciones de nomenclatura** en barra inferior

**Uso recomendado:** Introducir el patrón getter/setter y su importancia en encapsulación

---

### 3. `3-constructores.svg`

**Descripción:** Concepto y funcionamiento de constructores en Java

**Contenido:**

- **Definición de constructor** en recuadro morado:
  - Se ejecuta automáticamente con `new`
  - Mismo nombre que la clase
  - Sin tipo de retorno
  - Inicializa atributos
- **Proceso de creación en 3 pasos**:
  1. CÓDIGO: `Persona p = new Persona("Juan", 25);`
  2. CONSTRUCTOR: Se ejecuta automáticamente
  3. OBJETO LISTO: Con atributos inicializados
- **Dos tipos de constructores**:
  - Constructor por defecto (azul): sin parámetros
  - Constructor parametrizado (verde): con parámetros
- **Características clave** con reglas importantes:
  - Nombre igual a la clase
  - Sin tipo de retorno

**Uso recomendado:** Introducir el concepto de constructor y su propósito

---

### 4. `4-sobrecarga-constructores.svg`

**Descripción:** Sobrecarga de constructores (múltiples constructores en una clase)

**Contenido:**

- **Concepto de sobrecarga** en recuadro morado superior
- **Ejemplo completo de clase Producto** con 3 constructores:
  - Constructor 1 (azul): Sin parámetros - valores por defecto
  - Constructor 2 (verde): Solo nombre - otros valores por defecto
  - Constructor 3 (morado): Todos los parámetros
- **Formas de crear objetos** mostrando los 3 usos:
  - `new Producto()` → usa constructor 1
  - `new Producto("Laptop")` → usa constructor 2
  - `new Producto("Mouse", 25.99, "Electrónica")` → usa constructor 3
- **Optimización con this()**: Llamada entre constructores
  - Ejemplo de cómo un constructor llama a otro
  - Flecha mostrando la delegación
- **Ventajas** en barra inferior: flexibilidad y código limpio

**Uso recomendado:** Explicar la sobrecarga y la reutilización de código entre constructores

---

### 5. `5-palabra-this.svg`

**Descripción:** Uso de la palabra clave "this" en Java

**Contenido:**

- **Concepto principal** en recuadro morado:
  - `this` es referencia al objeto actual
  - Dos usos principales
- **Uso 1: Diferenciar atributos de parámetros**:
  - Lado izquierdo (rojo): ❌ SIN "this" - ambiguo
  - Lado derecho (verde): ✓ CON "this" - claro
  - Comparación de `nombre = nombre` vs `this.nombre = nombre`
- **Diagrama visual**: `this` apunta al objeto en memoria
  - Código del constructor a la izquierda
  - Objeto en memoria a la derecha
  - Flecha morada mostrando que `this` apunta al objeto
- **Uso 2: Llamar a otro constructor**:
  - Ejemplo con `this("Sin nombre", 0.0);`
  - Delegación entre constructores
- **Resumen** en barras inferiores:
  - `this.atributo` → accede al atributo
  - `this(parametros)` → llama a otro constructor

**Uso recomendado:** Aclarar las dos funciones principales de "this"

---

## 🛠️ Cómo Usar los Diagramas

### En Documentación Markdown

```markdown
![Modificadores de Acceso](./0-assets/1-modificadores-acceso.svg)
```

### En Presentaciones

- Importar directamente el archivo SVG
- Escala sin pérdida de calidad (formato vectorial)
- Compatible con PowerPoint, Google Slides, Canva

### En Clases Presenciales

- Proyectar en pantalla grande para explicaciones
- Imprimir en alta calidad (A3 recomendado para tablas)
- Compartir en plataformas LMS
- Usar como material de referencia rápida

### En Repositorios GitHub

```markdown
<img src="./0-assets/3-constructores.svg" width="800" alt="Constructores"/>
```

---

## 📐 Especificaciones Técnicas

**Formato:** SVG (Scalable Vector Graphics)

**Dimensiones:**

- Diagramas 1-3, 5: 900x700 px
- Diagrama 4: 900x750 px (más alto por contenido adicional)

**Paleta de colores (tema oscuro):**

- **Fondo:** `#121212` (negro profundo)
- **Texto principal:** `#e0e0e0` (gris claro)
- **Texto secundario:** `#9e9e9e` (gris medio)
- **Verde (public, correcto):** `#22c55e`, `#14532d`
- **Azul (default, getters):** `#3b82f6`, `#1e3a8a`
- **Naranja (protected):** `#f59e0b`, `#713f12`
- **Rojo (private, error):** `#ef4444`, `#7f1d1d`
- **Morado (constructores, this):** `#a78bfa`, `#6d28d9`

**Fuentes:**

- Títulos y texto: Arial, sans-serif
- Código: 'Courier New', monospace

**Accesibilidad:**

- Alto contraste texto/fondo
- Iconos visuales complementarios (🔒, 🌍, 📦)
- Colores codificados por significado

---

## 🔄 Relación con Contenido Teórico

| Diagrama                         | Archivo de Teoría            | Sección                             |
|----------------------------------|------------------------------|-------------------------------------|
| `1-modificadores-acceso.svg`     | `02-modificadores-acceso.md` | public, private, protected, default |
| `2-getters-setters.svg`          | `03-metodos-get-set.md`      | Nomenclatura y convenciones         |
| `3-constructores.svg`            | `04-constructores.md`        | Tipos de constructores              |
| `4-sobrecarga-constructores.svg` | `04-constructores.md`        | Sobrecarga y this()                 |
| `5-palabra-this.svg`             | `04-constructores.md`        | Palabra clave this                  |

---

## 📚 Recomendaciones de Uso Didáctico

### Estrategia 1: Comparación Visual

- Usar diagrama 1 para comparar modificadores lado a lado
- Pedir a estudiantes identificar cuál usar en casos prácticos

### Estrategia 2: Construcción Progresiva

- Empezar con diagrama 2 (getters/setters básicos)
- Avanzar a diagrama 3 (constructores simples)
- Culminar con diagramas 4-5 (sobrecarga y this)

### Estrategia 3: Coding Dojo

- Proyectar diagrama 4 (sobrecarga)
- Pedir implementar los constructores en vivo
- Discutir ventajas y desventajas

### Estrategia 4: Depuración Visual

- Usar diagrama 5 (this) para explicar errores comunes
- Mostrar casos donde falta "this" y causa bugs

---

## 🎯 Objetivos de Aprendizaje por Diagrama

**Diagrama 1 (Modificadores):** Seleccionar el modificador apropiado según el contexto

**Diagrama 2 (Getters/Setters):** Implementar acceso controlado a atributos privados

**Diagrama 3 (Constructores):** Crear constructores para inicializar objetos

**Diagrama 4 (Sobrecarga):** Aplicar sobrecarga de constructores eficientemente

**Diagrama 5 (This):** Usar "this" correctamente en constructores y métodos

---

## 📝 Notas para Instructores

- **Diagrama 1** tiene una tabla completa, ideal para imprimir como referencia
- **Diagrama 2** muestra el flujo bidireccional (lectura/escritura)
- **Diagrama 3** explica el proceso paso a paso de instanciación
- **Diagrama 4** es el más complejo, recomendado para mitad/final de sesión
- **Diagrama 5** resuelve una confusión común en estudiantes novatos

### Errores Comunes que Previenen

1. **Modificadores:** Usar public en todos los atributos (vulnerabilidad)
2. **Getters/Setters:** Acceder directamente a atributos sin validación
3. **Constructores:** Olvidar inicializar atributos
4. **Sobrecarga:** Código repetitivo en múltiples constructores
5. **This:** Ambigüedad entre parámetros y atributos

---

## 🔗 Recursos Adicionales

- [Documentación oficial de Java - Modificadores](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- [Tutorial de constructores](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- [Convenciones de código Java](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)
- [Encapsulación - Oracle](https://docs.oracle.com/javase/tutorial/java/concepts/object.html)

---

## 💡 Ejercicios Sugeridos con los Diagramas

### Ejercicio 1: Análisis de Modificadores

- Mostrar diagrama 1
- Presentar código con errores de acceso
- Pedir identificar qué modificador falta o sobra

### Ejercicio 2: Implementar Getters/Setters

- Usar diagrama 2 como referencia
- Dar clase con atributos públicos
- Pedir refactorizar a privados con getters/setters

### Ejercicio 3: Cadena de Constructores

- Proyectar diagrama 4
- Pedir implementar 3 constructores con this()
- Validar que no haya código duplicado

### Ejercicio 4: Debug con "this"

- Mostrar código con bugs de "this"
- Usar diagrama 5 para explicar el error
- Pedir corregir el código

---

## 🎨 Estilo Visual Consistente

Todos los diagramas siguen el mismo sistema de colores:

- **Verde** = Correcto, público, permitido
- **Rojo** = Incorrecto, privado, restringido
- **Azul** = Lectura, default, información
- **Naranja** = Advertencia, protegido, intermedio
- **Morado** = Constructores especiales, "this"

Este código de colores facilita el aprendizaje visual y la retención.

---

**Última actualización:** Semana 03 - Bootcamp POO Java  
**Licencia:** Uso educativo libre para el programa SENA  
**Tema:** Dark mode sin degradados (siguiendo directrices del proyecto)

