# Semana 4 - Herencia

## 📋 Descripción

Esta semana introduce uno de los pilares fundamentales de la Programación Orientada a Objetos: la **Herencia**. Los estudiantes aprenderán a reutilizar código mediante la creación de jerarquías de clases, comprenderán las relaciones "es-un" (is-a), y dominarán el uso de la palabra clave `extends` y `super` para construir aplicaciones más mantenibles y escalables.

---

## 🎯 Objetivos de Aprendizaje

Al finalizar esta semana, el estudiante será capaz de:

1. ✅ Comprender el concepto de herencia y su importancia en POO
2. ✅ Identificar relaciones "es-un" (is-a) en el mundo real
3. ✅ Usar la palabra clave `extends` para crear jerarquías de clases
4. ✅ Comprender y utilizar la palabra clave `super` correctamente
5. ✅ Diseñar jerarquías de clases apropiadas
6. ✅ Heredar atributos y métodos de clases padre
7. ✅ Aplicar herencia en proyectos prácticos del mundo real

---

## 📚 Contenido Teórico

### 1. Concepto de Herencia
- ¿Qué es la herencia en POO?
- Reutilización de código mediante herencia
- Relación "es-un" (is-a relationship)
- Ventajas y desventajas de la herencia
- Ejemplos del mundo real

### 2. Palabra Clave `extends`
- Sintaxis de herencia en Java
- Clase padre (superclase) vs clase hija (subclase)
- Herencia simple en Java
- Jerarquías de múltiples niveles
- La clase Object como raíz de todas las clases

### 3. Jerarquías de Clases
- Diseño de jerarquías efectivas
- Niveles de herencia
- Árboles de herencia
- Buenas prácticas en diseño de jerarquías
- Cuándo usar y cuándo evitar la herencia

### 4. Palabra Clave `super`
- Propósito y uso de `super`
- `super()` para llamar al constructor padre
- `super.metodo()` para acceder a métodos padre
- `super.atributo` para acceder a atributos padre
- Diferencia entre `this` y `super`

### 5. Herencia de Atributos y Métodos
- Qué se hereda y qué no
- Modificadores de acceso en herencia
- Atributos privados vs protegidos vs públicos
- Métodos heredados y su visibilidad
- Sobrescritura de métodos (preview para semana 5)

---

## 💻 Contenido Práctico

### Ejercicio 1: Comparación Con/Sin Herencia
- **Objetivo**: Comprender la ventaja de usar herencia
- **Nivel**: Básico
- **Duración**: 20 minutos
- **Temas**: Duplicación de código vs reutilización

### Ejercicio 2: Jerarquía de Animales
- **Objetivo**: Crear una jerarquía simple Animal → Perro, Gato
- **Nivel**: Básico
- **Duración**: 30 minutos
- **Temas**: `extends`, herencia de atributos y métodos

### Ejercicio 3: Uso de super()
- **Objetivo**: Dominar el uso de super en constructores
- **Nivel**: Intermedio
- **Duración**: 25 minutos
- **Temas**: Constructores en jerarquías, `super()`

### Ejercicio 4: Jerarquía de Vehículos
- **Objetivo**: Diseñar una jerarquía de múltiples niveles
- **Nivel**: Intermedio
- **Duración**: 40 minutos
- **Temas**: Jerarquías multinivel, diseño de clases

### Ejercicio 5: Jerarquía de Empleados
- **Objetivo**: Modelar empleados con diferentes roles
- **Nivel**: Avanzado
- **Duración**: 45 minutos
- **Temas**: Herencia aplicada a dominio de negocio

### Ejercicio 6: Proyecto Integrador - Sistema de Figuras Geométricas
- **Objetivo**: Implementar un sistema completo con herencia
- **Nivel**: Avanzado
- **Duración**: 60 minutos
- **Temas**: Integración de todos los conceptos de herencia

---

## 📊 Evaluación

### Distribución de Evaluación

| Tipo de Evidencia | Peso | Descripción |
|-------------------|------|-------------|
| **Conocimiento** | 30% | Cuestionario sobre herencia, extends y super |
| **Desempeño** | 40% | Taller práctico con jerarquía de clases |
| **Producto** | 30% | Proyecto con diagrama de jerarquía y código |

**Nota mínima aprobatoria:** 3.0/5.0

### Criterios de Evaluación

**Conocimiento:**
- Comprensión del concepto de herencia
- Identificación de relaciones "es-un"
- Comprensión de `extends` y `super`
- Conocimiento de jerarquías de clases

**Desempeño:**
- Implementación correcta de herencia con `extends`
- Uso apropiado de `super()` en constructores
- Diseño de jerarquías coherentes
- Aplicación de buenas prácticas

**Producto:**
- Sistema funcional con jerarquía de clases
- Código limpio y bien estructurado
- Diagrama UML de jerarquía
- Documentación clara

---

## 🗂️ Estructura de Archivos

```
semana-04/
├── README.md                          # Este archivo
├── RUBRICA_EVALUACION.md             # Rúbrica detallada
├── rubrica_evaluacion.json           # Rúbrica en formato JSON
├── rubrica_evaluacion.yaml           # Rúbrica en formato YAML
├── 0-assets/                         # Recursos visuales
│   ├── 1-concepto-herencia.svg
│   ├── 2-extends-sintaxis.svg
│   ├── 3-jerarquia-clases.svg
│   ├── 4-palabra-super.svg
│   ├── 5-herencia-atributos-metodos.svg
│   ├── 6-constructores-jerarquia.svg
│   └── README.md
├── 1-teoria/                         # Material teórico
│   ├── 01-concepto-herencia.md
│   ├── 02-palabra-extends.md
│   ├── 03-jerarquias-clases.md
│   ├── 04-palabra-super.md
│   └── 05-buenas-practicas-herencia.md
├── 2-practica/                       # Ejercicios prácticos
│   ├── README.md
│   ├── ejercicio-01-comparacion-herencia/
│   ├── ejercicio-02-jerarquia-animales/
│   ├── ejercicio-03-uso-super/
│   ├── ejercicio-04-jerarquia-vehiculos/
│   ├── ejercicio-05-jerarquia-empleados/
│   └── ejercicio-06-proyecto-integrador/
├── 3-recursos/                       # Recursos adicionales
│   ├── glosario.md
│   ├── referencias.md
│   └── cheatsheet-herencia.md
└── 4. asignación_dominios/          # Asignaciones por ficha
    └── fichas/
```

---

## 📖 Recursos Adicionales

### Documentación Oficial
- [Java Inheritance (Oracle Docs)](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Java super Keyword](https://docs.oracle.com/javase/tutorial/java/IandI/super.html)
- [Understanding Class Members](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

### Tutoriales Recomendados
- W3Schools: Java Inheritance
- GeeksforGeeks: Inheritance in Java
- JavaPoint: Java Inheritance Tutorial

### Videos
- Herencia en Java - Conceptos Básicos
- Diseño de Jerarquías de Clases
- Super vs This en Java

---

## 🎯 Estrategias Didácticas

Esta semana utiliza las siguientes estrategias:

1. **Aprendizaje Basado en Problemas**: Modelado de situaciones reales
2. **Estudio de Casos**: Análisis de jerarquías en software conocido
3. **Codificación Colaborativa**: Pair programming en ejercicios
4. **Gamificación**: Reto de diseñar la mejor jerarquía de clases
5. **Talleres Prácticos Guiados**: Implementación paso a paso

---

## ⏱️ Planificación de la Sesión (4 horas)

| Tiempo | Actividad | Tipo |
|--------|-----------|------|
| 0:00 - 0:15 | Introducción y conceptos de herencia | Teoría |
| 0:15 - 0:45 | Palabra clave extends y jerarquías | Teoría |
| 0:45 - 1:15 | Ejercicio 1 y 2: Animales | Práctica |
| 1:15 - 1:30 | **DESCANSO** | - |
| 1:30 - 2:00 | Palabra clave super y constructores | Teoría |
| 2:00 - 2:45 | Ejercicio 3 y 4: Super y Vehículos | Práctica |
| 2:45 - 3:00 | Buenas prácticas en herencia | Teoría |
| 3:00 - 4:00 | Ejercicio 5 o 6: Proyecto integrador | Práctica |

---

## 🎓 Competencias SENA

Esta semana desarrolla las siguientes competencias:

- Interpretar el diseño orientado a objetos
- Aplicar principios de reutilización de código
- Modelar jerarquías de clases según requisitos
- Implementar relaciones de herencia en Java
- Documentar diseños mediante diagramas UML

---

## 📝 Notas para el Instructor

1. **Énfasis en conceptos**: Asegurar que los estudiantes comprenden **cuándo usar** herencia
2. **Evitar sobre-uso**: Advertir sobre jerarquías demasiado profundas
3. **Preparación para polimorfismo**: Esta semana sienta las bases para la semana 5
4. **Diagramas UML**: Introducir notación básica de herencia en UML
5. **Ejemplos del mundo real**: Usar ejemplos que los estudiantes puedan relacionar

### Errores Comunes a Prevenir
- Confundir herencia con composición
- No llamar al constructor padre con `super()`
- Crear jerarquías innecesariamente profundas
- No entender la diferencia entre `this` y `super`

---

## 🚀 Preparación Requerida

### Conocimientos Previos
- Semana 1: Conceptos de POO
- Semana 2: Clases y Objetos
- Semana 3: Encapsulación y Constructores

### Software Requerido
- JDK 11 o superior
- IDE (IntelliJ IDEA, Eclipse, VS Code con Java)
- Git para control de versiones

---

## 📅 Trabajo Autónomo

Después de la sesión, los estudiantes deben:

1. ✅ Completar todos los ejercicios prácticos
2. ✅ Revisar el material teórico y glosario
3. ✅ Crear diagramas UML de las jerarquías implementadas
4. ✅ Investigar ejemplos de herencia en bibliotecas Java
5. ✅ Preparar preguntas para la siguiente sesión

**Tiempo estimado**: 2-3 horas

---

## 🔗 Conexión con Otras Semanas

**⬅️ Semana Anterior (Semana 3)**
- Se utilizan conceptos de encapsulación
- Los constructores son fundamentales para herencia
- Modificadores de acceso cobran más importancia

**➡️ Semana Siguiente (Semana 5)**
- La herencia es base para el polimorfismo
- Sobrescritura de métodos se estudiará en detalle
- Uso de `@Override` y polimorfismo en tiempo de ejecución

---

**Última actualización**: Octubre 2025
**Versión**: 1.0
