# 📊 Recursos Gráficos - Semana 0

Este directorio contiene recursos visuales en formato SVG para complementar el material teórico de la Semana 0 (Fundamentos de Java).

## 🎨 Características de los Gráficos

- **Formato**: SVG (Scalable Vector Graphics)
- **Tema**: Oscuro (#1a1a1a background)
- **Estilo**: Sin degradados, colores sólidos
- **Resolución**: Escalable sin pérdida de calidad
- **Compatibilidad**: Visualizable en navegadores modernos y editores Markdown

## 📁 Archivos Disponibles

### 1. jdk-jre-jvm.svg
**Descripción**: Arquitectura de la plataforma Java  
**Temas relacionados**: 01-introduccion-java.md  
**Conceptos visualizados**:
- Jerarquía JDK → JRE → JVM
- Componentes de cada capa
- Herramientas de desarrollo (javac, javadoc, jar, jdb)
- Bibliotecas y APIs de Java

**Colores**:
- JDK: Azul (#4a9eff)
- JRE: Verde (#00d4aa)
- JVM: Rojo (#ff6b6b)

---

### 2. tipos-datos-primitivos.svg
**Descripción**: Tipos de datos primitivos en Java  
**Temas relacionados**: 03-tipos-datos.md  
**Conceptos visualizados**:
- 8 tipos primitivos clasificados por categoría
- Tamaños en bits de cada tipo
- Rangos de valores
- Comparación visual de tamaños en memoria

**Categorías**:
- Tipos enteros: byte, short, int, long
- Tipos punto flotante: float, double
- Tipo carácter: char
- Tipo booleano: boolean

---

### 3. operadores-java.svg
**Descripción**: Operadores y precedencia en Java  
**Temas relacionados**: 04-operadores.md  
**Conceptos visualizados**:
- Operadores aritméticos (+, -, *, /, %, ++, --)
- Operadores relacionales (==, !=, >, <, >=, <=)
- Operadores lógicos (&&, ||, !)
- Operadores de asignación (=, +=, -=, *=, /=, %=)
- Tabla de verdad para operadores lógicos
- Jerarquía de precedencia completa

**Colores por categoría**:
- Aritméticos: Azul (#4a9eff)
- Relacionales: Naranja (#ff9f43)
- Lógicos: Púrpura (#a29bfe)
- Asignación: Verde (#00d4aa)

---

### 4. estructuras-control.svg
**Descripción**: Diagramas de flujo de estructuras de control  
**Temas relacionados**: 05-estructuras-control.md  
**Conceptos visualizados**:
- Estructura if-else (flujo condicional)
- Estructura switch (selección múltiple)
- Bucle for (iteración controlada)
- Bucle while (condición previa)
- Bucle do-while (condición posterior)
- Sentencias break y continue

**Elementos visuales**:
- Rombos para condiciones (#ff9f43)
- Rectángulos para acciones (#00d4aa / #ff6b6b)
- Elipses para inicio/fin (#00d4aa)
- Flechas de flujo con indicadores true/false

---

### 5. arrays-memoria.svg
**Descripción**: Estructura y representación en memoria de arrays  
**Temas relacionados**: 06-arrays.md  
**Conceptos visualizados**:
- Array unidimensional (1D) con índices
- Array bidimensional (2D) - matriz
- Acceso a elementos por índice
- Propiedad length
- Representación visual de la memoria

**Ejemplos incluidos**:
- Array de 5 elementos con índices [0-4]
- Matriz 3x4 con acceso fila-columna
- Sintaxis de declaración e inicialización

---

### 6. metodos-java.svg
**Descripción**: Anatomía de métodos y pila de llamadas  
**Temas relacionados**: 07-metodos.md  
**Conceptos visualizados**:
- Componentes de un método:
  - Modificador de acceso (public)
  - Tipo de retorno (int)
  - Nombre del método (sumar)
  - Parámetros (int a, int b)
  - Cuerpo del método
- Tipos de métodos (con/sin retorno, con/sin parámetros)
- Call Stack (pila de llamadas)
- Flujo de ejecución de métodos

**Colores por componente**:
- Modificador: Púrpura (#a29bfe)
- Tipo retorno: Verde (#00d4aa)
- Nombre: Naranja (#ff9f43)
- Parámetros: Azul (#4a9eff)
- Cuerpo: Rojo (#ff6b6b)

---

### 7. compilacion-ejecucion.svg
**Descripción**: Proceso completo de compilación y ejecución en Java  
**Temas relacionados**: 01-introduccion-java.md  
**Conceptos visualizados**:
- Paso 1: Código fuente (.java)
- Paso 2: Compilador Java (javac)
- Paso 3: Bytecode (.class)
- Paso 4: JVM con componentes (Class Loader, Verifier, Interpreter, JIT)
- Paso 5: Ejecución multiplataforma (Windows, Linux, macOS)
- Características: Portabilidad, Seguridad, Rendimiento

**Flujo completo**:
```
.java → javac → .class → java → JVM → Ejecución
```

---

## 🚀 Uso de los Gráficos

### En Documentos Markdown
```markdown
![Descripción](../0-assets/nombre-archivo.svg)
```

### En Archivos HTML
```html
<img src="../0-assets/nombre-archivo.svg" alt="Descripción" />
```

### Visualización Local
- Abrir directamente en navegador web
- Visualizar en VS Code con extensión SVG Preview
- Incluir en presentaciones (mantienen calidad al escalar)

## 📐 Especificaciones Técnicas

| Característica | Valor |
|---------------|-------|
| Formato | SVG (XML) |
| Codificación | UTF-8 |
| Viewbox | Variable según contenido |
| Tema | Dark (#1a1a1a) |
| Fuentes | Arial, monospace |
| Compatibilidad | Todos los navegadores modernos |

## 🎯 Paleta de Colores

```css
/* Colores principales */
--background: #1a1a1a;
--container: #2d2d2d;
--text-primary: #ffffff;
--text-secondary: #aaaaaa;
--text-muted: #888888;

/* Colores de énfasis */
--blue: #4a9eff;
--green: #00d4aa;
--orange: #ff9f43;
--purple: #a29bfe;
--red: #ff6b6b;
```

## 📝 Notas de Diseño

1. **Accesibilidad**: Alto contraste entre fondo oscuro y textos claros
2. **Consistencia**: Misma paleta de colores en todos los gráficos
3. **Claridad**: Sin elementos decorativos innecesarios
4. **Educativo**: Enfoque en la comprensión de conceptos
5. **Escalabilidad**: Funcionan bien tanto en pantallas pequeñas como grandes

## 🔄 Actualizaciones

- **v1.0** (2025-01-XX): Creación inicial de 7 gráficos para Semana 0
- Próximas versiones incluirán gráficos para Semanas 1-9

---

**Licencia**: Mismo que el repositorio principal  
**Autor**: Bootcamp POO Java - SENA  
**Contacto**: [Información del instructor]
