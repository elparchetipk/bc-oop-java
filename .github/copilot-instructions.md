# Instrucciones para GitHub Copilot - Bootcamp POO Java

## Contexto del Proyecto
Este es un bootcamp de **9 semanas** de duración con **1 sesión de 4 horas por semana** (36 horas totales) enfocado en **Diseño y Programación Orientada a Objetos con Java**.

## Objetivo General
Desarrollar competencias en análisis y diseño orientado a objetos, modelado UML, y programación Java aplicando los principios fundamentales de la POO.

---

## Estructura del Bootcamp

### Organización por Semanas
Cada semana debe tener la siguiente estructura de carpetas:
```
bootcamp/
  semana-XX/
    ├── RUBRICA_EVALUACION.md
    ├── 1-teoria/
    ├── 2-practica/
    ├── 3-recursos/
    │   └── glosario.md
    └── 4. asignación_dominios/ (solo cuando aplique)
```

### Componentes de Cada Semana

#### 1. `RUBRICA_EVALUACION.md`
- Contiene los criterios de evaluación específicos de la semana
- Incluye tres tipos de evidencias:
  - **Conocimiento**: Cuestionarios, exámenes, preguntas escritas
  - **Desempeño**: Ejercicios en clase, talleres prácticos, implementaciones
  - **Producto**: Entregables (código, documentación, diagramas)

#### 2. `1-teoria/`
- Material teórico de la semana
- Presentaciones, apuntes, diagramas conceptuales
- Referencias a documentación oficial
- Videos y recursos externos

#### 3. `2-practica/`
- Ejercicios prácticos guiados
- Talleres paso a paso
- Ejemplos de código
- Proyectos semanales

#### 4. `3-recursos/`
- `glosario.md`: Términos y conceptos clave de la semana
- Material complementario
- Enlaces útiles
- Cheat sheets

#### 5. `4. asignación_dominios/` (obligatorio)
- Asignaciones específicas por estudiante por ficha
- Dominios de trabajo para estudiantes

---

## Temario del Bootcamp (9 Semanas)

### **Semana 1 – Introducción a Java y Paradigma Orientado a Objetos**
**Duración**: 4 horas

**Temas**:
- Historia y características de Java
- Diferencias entre programación estructurada y POO
- Configuración del entorno (JDK, IDEs: IntelliJ, VS Code)
- Primer programa en Java (Hello World)
- Sintaxis básica: tipos de datos, operadores, estructuras de control

**Evidencias**:
- **Conocimiento**: Cuestionario sobre historia de Java, POO vs estructurado y sintaxis básica
- **Desempeño**: Instalación del entorno (JDK + IDE) y ejecución de "Hello World"
- **Producto**: Documento con capturas del entorno configurado y código comentado

**Estrategias**: Clase invertida, codificación en vivo

---

### **Semana 2 – Fundamentos de Clases y Objetos**
**Duración**: 4 horas

**Temas**:
- Conceptos: clase, objeto, atributos, métodos
- Instanciación de objetos
- Encapsulación básica
- Modelar objetos del mundo real en Java

**Evidencias**:
- **Conocimiento**: Examen corto sobre conceptos de clase, objeto, atributos y métodos
- **Desempeño**: Ejercicio en clase creando una clase con atributos y métodos
- **Producto**: Archivo `.java` con modelo de objeto del mundo real (Persona, Coche, Libro)

**Estrategias**: Aprendizaje basado en problemas, pair programming

---

### **Semana 3 – Principios de Encapsulación y Constructores**
**Duración**: 4 horas

**Temas**:
- Modificadores de acceso (public, private, protected)
- Métodos get y set
- Constructores y sobrecarga de constructores
- Buenas prácticas en encapsulación

**Evidencias**:
- **Conocimiento**: Preguntas escritas sobre modificadores de acceso y buenas prácticas
- **Desempeño**: Implementar métodos get/set y constructores sobrecargados
- **Producto**: Código con clase completa (atributos privados, getters/setters, constructores)

**Estrategias**: Talleres prácticos guiados, evaluaciones formativas

---

### **Semana 4 – Herencia**
**Duración**: 4 horas

**Temas**:
- Concepto de herencia y reutilización de código
- Palabra clave `extends`
- Jerarquías de clases y uso de `super`
- Ejercicios: jerarquía de animales, vehículos o empleados

**Evidencias**:
- **Conocimiento**: Cuestionario sobre herencia, extends y super
- **Desempeño**: Taller práctico con jerarquía de clases (Animal → Perro, Gato)
- **Producto**: Proyecto con diagrama de jerarquía y código con clases heredadas

**Estrategias**: Aprendizaje basado en proyectos, estudio de casos

---

### **Semana 5 – Polimorfismo**
**Duración**: 4 horas

**Temas**:
- Concepto de polimorfismo (tiempo de compilación y ejecución)
- Sobrecarga de métodos
- Sobrescritura de métodos (`@Override`)
- Uso de polimorfismo en colecciones y métodos genéricos

**Evidencias**:
- **Conocimiento**: Preguntas sobre tipos de polimorfismo, diferencias sobrecarga vs sobrescritura
- **Desempeño**: Ejercicio implementando métodos sobrecargados y sobrescritos
- **Producto**: Proyecto mostrando polimorfismo aplicado (empleados con roles y salarios)

**Estrategias**: Codificación colaborativa, gamificación con retos

---

### **Semana 6 – Abstracción e Interfaces**
**Duración**: 4 horas

**Temas**:
- Clases abstractas: definición y uso
- Interfaces en Java
- Diferencias entre clases abstractas e interfaces
- Ejercicios de modelado aplicando abstracción

**Evidencias**:
- **Conocimiento**: Evaluación escrita sobre diferencias entre clases abstractas e interfaces
- **Desempeño**: Taller definiendo clase abstracta y una interfaz con implementaciones
- **Producto**: Código de sistema simple usando abstracción (figuras geométricas con área)

**Estrategias**: Role play técnico, debates técnicos

---

### **Semana 7 – Manejo de Paquetes y Excepciones**
**Duración**: 4 horas

**Temas**:
- Organización de código en paquetes (package, import)
- Manejo de excepciones (try-catch-finally, throw, throws)
- Jerarquía de excepciones (Exception vs RuntimeException)
- Creación de excepciones personalizadas

**Evidencias**:
- **Conocimiento**: Prueba teórica sobre jerarquía de excepciones y sintaxis
- **Desempeño**: Ejercicio creando paquete, importando clases y manejando excepciones
- **Producto**: Proyecto con mínimo un paquete y excepciones personalizadas

**Estrategias**: Talleres prácticos guiados, foros de discusión

---

### **Semana 8 – Colecciones y Programación Genérica**
**Duración**: 4 horas

**Temas**:
- Arrays vs Colecciones
- API de Colecciones: List, Set, Map
- Iteradores y bucles mejorados
- Introducción a Generics (`<>`)
- Ejercicios: sistema de inventario, agenda de contactos

**Evidencias**:
- **Conocimiento**: Cuestionario sobre diferencias entre arrays, List, Set y Map
- **Desempeño**: Taller manipulando colecciones (agregar, eliminar, recorrer)
- **Producto**: Proyecto de agenda de contactos usando ArrayList y HashMap

**Estrategias**: Aprendizaje basado en problemas, evaluaciones formativas

---

### **Semana 9 – Proyecto Final Aplicado**
**Duración**: 4 horas

**Temas**:
- Diseño de un mini sistema aplicando todos los principios de POO
- Integración de: encapsulación, herencia, polimorfismo, abstracción
- Manejo de excepciones y colecciones
- Documentación y diagramas UML

**Evidencias**:
- **Conocimiento**: Presentación individual sobre principios de POO aplicados
- **Desempeño**: Desarrollo de mini sistema integrando POO, excepciones y colecciones
- **Producto**: Proyecto completo con documentación y diagrama UML

**Estrategias**: Aprendizaje basado en proyectos, evaluación integral

---

## Saberes de Conceptos y Principios

Al generar contenido, considera estos conceptos fundamentales:
1. Análisis, interpretación y toma de decisiones
2. Análisis Orientado a Objetos: objeto, clase, instancia, multiplicidad, asociación, agregación, composición
3. Actor, caso de uso, mensajes, excepciones, condiciones, post-condiciones, focos de control
4. Herramientas CASE: definición, tipos, uso
5. UML: definición, notación, elementos, relaciones, diagramas, clasificación
6. Diagramas UML: casos de uso, actividades, modelo de dominio
7. Modelo de datos: fundamentos de bases de datos, modelo entidad relación

## Saberes de Proceso

Los estudiantes deben ser capaces de:
1. Interpretar informe de requisitos
2. Diagramar casos de uso
3. Generar plantillas extendidas de casos de uso
4. Realizar diagramas de actividades
5. Construir el modelo de dominio del sistema
6. Crear informe de análisis
7. Elaborar el modelo entidad relación

## Criterios de Evaluación

Al crear contenido evaluativo, verifica que:
1. Se interprete el informe de requisitos para modelar funciones del software
2. Se elaboren diagramas de casos de uso según estándares actuales (UML)
3. Se generen plantillas extendidas expresando la intención de las acciones
4. Se realicen diagramas de actividades exponiendo detalles de casos de uso
5. Se elabore el modelo entidad relación según requisitos del software
6. Se represente el negocio en clases abstractas (modelo de dominio consistente)
7. Se documenten las actividades de análisis mediante informes

---

## Estrategias Didácticas Activas

Al generar actividades, utiliza estas estrategias:
1. **Aprendizaje Basado en Proyectos (ABP)**: construcción progresiva de sistemas
2. **Aprendizaje Basado en Problemas**: casos prácticos del mundo real
3. **Clase invertida (Flipped Classroom)**: teoría previa, práctica en clase
4. **Codificación colaborativa (Pair Programming)**: trabajo en parejas
5. **Gamificación**: retos semanales con puntos o insignias
6. **Estudio de casos**: análisis de proyectos reales con POO
7. **Role play técnico**: roles de arquitecto, desarrollador, tester
8. **Foros de discusión/debates técnicos**: comparación de enfoques
9. **Evaluaciones formativas**: quizzes con retroalimentación inmediata
10. **Talleres prácticos guiados**: codificación en vivo paso a paso

---

## Herramientas y Recursos

### Software y Herramientas
- **JDK** (Java Development Kit)
- **IDEs**: IntelliJ IDEA, VS Code con extensión Java
- **Git y GitHub**: control de versiones y trabajo colaborativo
- **Compiladores online**: Replit, JDoodle

### Recursos Digitales
- Documentación oficial de Java (Oracle Docs)
- Tutoriales: W3Schools, GeeksforGeeks, JavaPoint
- Videos: YouTube, cursos MOOC
- Repositorios de ejemplo en GitHub

### Material de Apoyo
- Guías de instalación y configuración
- Manual de sintaxis básica de Java
- Plantillas de proyectos
- Glosario de términos de POO

### Herramientas Didácticas
- Presentaciones (PowerPoint/Canva)
- Tablero digital para diagramas UML (Miro, Jamboard)
- Cuestionarios en línea (Kahoot, Quizizz)
- Foros/grupos (Teams, Slack, Discord)

---

## Guías para Generar Contenido

### Al crear material teórico (`1-teoria/`):
- Usa ejemplos claros y del mundo real
- Incluye diagramas visuales
- Proporciona analogías para conceptos complejos
- Enlaza con documentación oficial
- Estructura: introducción, desarrollo, ejemplos, conclusión

### Al crear prácticas (`2-practica/`):
- Ejercicios progresivos (de simple a complejo)
- Incluye código de inicio (boilerplate)
- Proporciona casos de prueba
- Agrega soluciones comentadas
- Plantea desafíos opcionales para estudiantes avanzados

### Al crear glosarios (`3-recursos/glosario.md`):
- Define términos en lenguaje claro
- Usa ejemplos cortos de código cuando sea relevante
- Incluye sinónimos y términos relacionados
- Ordena alfabéticamente
- Relaciona términos con los temas de la semana

### Al crear rúbricas (`RUBRICA_EVALUACION.md`):
- Define niveles claros: Excelente, Bueno, Suficiente, Insuficiente
- Especifica criterios medibles
- Incluye pesos/ponderaciones
- Alinea con los criterios de evaluación del curso
- Diferencia entre evidencias de conocimiento, desempeño y producto

---

## Consideraciones Técnicas

### Estilo de Código
- Sigue las convenciones de Java (camelCase, PascalCase para clases)
- Usa nombres descriptivos en español o inglés (consistente)
- Incluye comentarios explicativos
- Implementa validaciones básicas
- Maneja excepciones apropiadamente

### Nivel de Complejidad
- **Semanas 1-3**: Fundamentos, sintaxis básica
- **Semanas 4-6**: Conceptos intermedios de POO
- **Semanas 7-8**: Características avanzadas
- **Semana 9**: Integración y proyecto final

### Buenas Prácticas
- Código limpio y legible
- Separación de responsabilidades
- Reutilización de código
- Documentación mediante comentarios Javadoc
- Testing básico (opcional en semanas finales)

---

## Formato de Archivos

### Markdown
- Usa headers apropiados (H1, H2, H3)
- Bloques de código con sintaxis highlighting: ```java
- Listas y tablas cuando sea necesario
- Enlaces a recursos externos

### Código Java
- Archivos `.java` con estructura completa
- Incluye package cuando aplique
- Comentarios de autor y descripción
- Ejemplos de uso en comentarios o clase Main

---

## Progresión del Aprendizaje

Asegúrate de que cada semana:
1. **Construya sobre conocimientos previos**
2. **Introduzca 1-2 conceptos nuevos máximo**
3. **Incluya tiempo para práctica (mínimo 50% del tiempo)**
4. **Proporcione feedback inmediato**
5. **Prepare para la semana siguiente**

---

## Notas Finales

- **Enfoque práctico**: El 60% del tiempo debe ser práctica, 40% teoría
- **Contexto SENA**: Formación técnica y tecnológica con énfasis en competencias laborales
- **Evaluación continua**: Cada semana incluye evidencias evaluables
- **Proyecto integrador**: La semana 9 integra todos los conocimientos
- **Trabajo colaborativo**: Fomentar trabajo en equipo y code review entre pares

---

## Estructura de Referencia

```
bootcamp/
  semana-01/ → Introducción a Java y POO
  semana-02/ → Clases y Objetos
  semana-03/ → Encapsulación y Constructores
  semana-04/ → Herencia
  semana-05/ → Polimorfismo
  semana-06/ → Abstracción e Interfaces
  semana-07/ → Paquetes y Excepciones
  semana-08/ → Colecciones y Genéricos
  semana-09/ → Proyecto Final Aplicado
```

---

**Recuerda**: El objetivo es formar desarrolladores Java competentes que dominen los principios de POO y puedan aplicarlos en proyectos reales del mundo laboral.
