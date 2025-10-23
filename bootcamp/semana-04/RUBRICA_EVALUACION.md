# Rúbrica de Evaluación - Semana 4
## Herencia

---

## 📊 Distribución de la Evaluación

| Tipo de Evidencia | Peso | Instrumentos |
|-------------------|------|--------------|
| **Conocimiento** | 30% | Cuestionario, preguntas conceptuales |
| **Desempeño** | 40% | Taller práctico con jerarquía de clases |
| **Producto** | 30% | Proyecto con diagrama de jerarquía y código |
| **TOTAL** | 100% | |

**Nota mínima aprobatoria:** 3.0/5.0

---

## 1. EVIDENCIAS DE CONOCIMIENTO (30%)

### 1.1 Cuestionario sobre Herencia, Extends y Super (20%)

**Instrumento:** Cuestionario de 15 preguntas (opción múltiple y verdadero/falso)

**Temas evaluados:**
1. Concepto de herencia en POO
2. Relación "es-un" (is-a)
3. Sintaxis de `extends`
4. Uso de `super()` en constructores
5. Diferencia entre `this` y `super`
6. Jerarquías de clases
7. Qué se hereda y qué no
8. Modificadores de acceso en herencia
9. Clase Object como raíz
10. Ventajas y desventajas de herencia

**Preguntas tipo:**
- ¿Qué significa que una clase extienda a otra?
- ¿Cuál es la diferencia entre herencia y composición?
- ¿Cuándo se debe llamar a `super()` en un constructor?
- ¿Qué modificador de acceso permite herencia pero no acceso externo?
- ¿Puede una clase heredar de múltiples clases en Java?

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Comprensión conceptual** | Responde 14-15 correctas (93-100%) | Responde 12-13 correctas (80-86%) | Responde 10-11 correctas (67-73%) | Menos de 10 correctas (<67%) |
| **Claridad en respuestas** | Demuestra comprensión profunda | Demuestra comprensión sólida | Demuestra comprensión básica | Confusión en conceptos |
| **Aplicación de conceptos** | Relaciona conceptos entre sí | Identifica conceptos individuales | Conoce definiciones básicas | No relaciona conceptos |

**Ponderación:** 20% de la nota final

---

### 1.2 Preguntas Conceptuales Escritas (10%)

**Instrumento:** 5 preguntas de desarrollo corto

**Preguntas:**
1. Explique con sus propias palabras qué es la herencia y para qué sirve
2. ¿Cuál es la diferencia entre `super()` y `super.metodo()`?
3. Dibuje un diagrama de jerarquía con 3 niveles y explique las relaciones
4. ¿Por qué los atributos privados no son accesibles en las subclases?
5. Dé un ejemplo del mundo real de una relación "es-un" y modélela con herencia

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Claridad conceptual** | Explicaciones precisas y completas | Explicaciones correctas con detalles menores | Explicaciones básicas correctas | Explicaciones incorrectas o vagas |
| **Ejemplos y diagramas** | Ejemplos excelentes y diagramas correctos | Buenos ejemplos con diagramas claros | Ejemplos simples, diagramas básicos | Ejemplos incorrectos o faltantes |
| **Profundidad** | Demuestra comprensión avanzada | Demuestra comprensión sólida | Demuestra comprensión básica | Comprensión superficial |
| **Vocabulario técnico** | Usa terminología correcta consistentemente | Usa terminología correcta mayormente | Usa algunos términos técnicos | No usa vocabulario técnico |

**Ponderación:** 10% de la nota final

---

## 2. EVIDENCIAS DE DESEMPEÑO (40%)

### 2.1 Taller Práctico - Jerarquía Animal → Perro, Gato (20%)

**Instrumento:** Ejercicio de codificación en clase supervisado

**Descripción:**
Implementar una jerarquía de clases:
- Clase padre: `Animal` con atributos nombre, edad, sonido
- Clases hijas: `Perro` y `Gato` con atributos específicos
- Uso correcto de `extends` y `super()`
- Métodos heredados y específicos de cada clase

**Requisitos técnicos:**
- ✅ Clase `Animal` con constructor y métodos básicos
- ✅ Clases `Perro` y `Gato` que extiendan `Animal`
- ✅ Uso de `super()` en constructores de las subclases
- ✅ Atributos adicionales en subclases (ej: raza, colorPelaje)
- ✅ Método `hacerSonido()` implementado en todas las clases
- ✅ Método `main` que pruebe la jerarquía

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Uso correcto de extends** | Implementa herencia perfectamente | Implementa herencia con errores menores | Implementa herencia básica | No implementa herencia correctamente |
| **Uso de super()** | Usa super() correctamente en todos los constructores | Usa super() con pequeños errores | Usa super() básicamente | No usa super() o lo usa incorrectamente |
| **Diseño de jerarquía** | Jerarquía lógica y bien estructurada | Jerarquía correcta con mejoras posibles | Jerarquía funcional básica | Jerarquía mal diseñada |
| **Funcionalidad** | Código funciona perfectamente | Código funciona con errores menores | Código funciona parcialmente | Código no funciona |
| **Buenas prácticas** | Código limpio, nombrado correcto, encapsulación | Buenas prácticas con detalles menores | Algunas buenas prácticas | No sigue buenas prácticas |

**Ponderación:** 20% de la nota final

---

### 2.2 Implementación de Jerarquía de Vehículos (20%)

**Instrumento:** Ejercicio de codificación supervisado

**Descripción:**
Diseñar e implementar jerarquía de múltiples niveles:
```
Vehiculo
├── VehiculoTerrestre
│   ├── Automovil
│   └── Motocicleta
└── VehiculoAcuatico
    └── Barco
```

**Requisitos técnicos:**
- ✅ Jerarquía de mínimo 3 niveles
- ✅ Cada clase con atributos apropiados
- ✅ Constructores en cada nivel usando `super()`
- ✅ Métodos específicos de cada tipo
- ✅ Encapsulación correcta
- ✅ Programa de prueba funcional

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Jerarquía multinivel** | Jerarquía de 3+ niveles lógica y funcional | Jerarquía de 3 niveles con errores menores | Jerarquía de 2-3 niveles básica | Jerarquía de 1 nivel o incorrecta |
| **Constructores encadenados** | Todos los constructores usan super() correctamente | Mayoría usa super() correctamente | Algunos usan super() | No usa super() o incorrecto |
| **Atributos específicos** | Cada clase tiene atributos relevantes y únicos | Mayoría de clases con atributos apropiados | Atributos básicos presentes | Atributos faltantes o incorrectos |
| **Métodos específicos** | Métodos apropiados para cada tipo | Mayoría de métodos apropiados | Algunos métodos básicos | Métodos faltantes o incorrectos |
| **Compilación y ejecución** | Compila y ejecuta sin errores | Compila con warnings menores | Compila con errores corregibles | No compila |

**Ponderación:** 20% de la nota final

---

## 3. EVIDENCIAS DE PRODUCTO (30%)

### 3.1 Proyecto Integrador - Sistema de Empleados (30%)

**Instrumento:** Proyecto individual/parejas con entregable completo

**Descripción:**
Desarrollar un sistema de gestión de empleados con jerarquía de clases:
- Clase base: `Empleado`
- Subclases: `EmpleadoTiempoCompleto`, `EmpleadoTiempoParcial`, `Contratista`
- Cada tipo con cálculo de salario específico
- Diagrama UML de la jerarquía
- Documentación del código

**Entregables:**
1. **Código fuente** (.java):
   - Clase `Empleado` con atributos comunes
   - Mínimo 3 subclases con atributos y métodos específicos
   - Clase `Main` con pruebas del sistema
   - Código comentado y documentado

2. **Diagrama UML**:
   - Diagrama de clases mostrando la jerarquía
   - Relaciones de herencia claramente marcadas
   - Atributos y métodos de cada clase

3. **Documentación** (README.md):
   - Descripción del sistema
   - Explicación de la jerarquía diseñada
   - Instrucciones de compilación y ejecución
   - Ejemplos de uso

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Diseño de jerarquía (8 pts)** | Jerarquía excelente, lógica, extensible | Jerarquía correcta con mejoras menores | Jerarquía básica funcional | Jerarquía mal diseñada |
| **Implementación técnica (8 pts)** | Código impecable, usa herencia perfectamente | Código correcto con detalles menores | Código funcional básico | Código con errores graves |
| **Diagrama UML (5 pts)** | Diagrama profesional, completo, correcto | Diagrama correcto con detalles menores | Diagrama básico correcto | Diagrama incorrecto o faltante |
| **Funcionalidad (4 pts)** | Sistema completamente funcional con casos de prueba | Sistema funcional con pruebas básicas | Sistema parcialmente funcional | Sistema no funcional |
| **Documentación (3 pts)** | Documentación completa y profesional | Documentación adecuada | Documentación básica | Documentación insuficiente |
| **Código limpio (2 pts)** | Código excelente: nombrado, formato, comentarios | Código limpio con mejoras menores | Código legible básico | Código difícil de leer |

**Ponderación:** 30% de la nota final

---

## 4. CRITERIOS TRANSVERSALES

Estos criterios aplican a todas las evidencias:

### 4.1 Uso Correcto de Herencia

| Nivel | Descripción |
|-------|-------------|
| **Excelente** | Usa herencia solo cuando es apropiado, diseña jerarquías lógicas, evita sobre-ingeniería |
| **Bueno** | Usa herencia correctamente en la mayoría de casos |
| **Suficiente** | Usa herencia básicamente, con algunas decisiones cuestionables |
| **Insuficiente** | Usa herencia incorrectamente o no la usa cuando debería |

### 4.2 Encapsulación y Modificadores de Acceso

| Nivel | Descripción |
|-------|-------------|
| **Excelente** | Usa `private`, `protected`, `public` apropiadamente según necesidades de herencia |
| **Bueno** | Usa modificadores correctamente en la mayoría de casos |
| **Suficiente** | Usa modificadores básicamente |
| **Insuficiente** | No considera modificadores de acceso en herencia |

### 4.3 Constructores y Super

| Nivel | Descripción |
|-------|-------------|
| **Excelente** | Constructores bien diseñados, uso perfecto de `super()`, manejo correcto de parámetros |
| **Bueno** | Constructores correctos con uso adecuado de `super()` |
| **Suficiente** | Constructores básicos con `super()` presente |
| **Insuficiente** | Constructores incorrectos o sin `super()` |

### 4.4 Nomenclatura y Convenciones

| Nivel | Descripción |
|-------|-------------|
| **Excelente** | Sigue todas las convenciones Java: clases PascalCase, métodos camelCase, constantes UPPER_CASE |
| **Bueno** | Sigue convenciones con errores menores |
| **Suficiente** | Sigue algunas convenciones |
| **Insuficiente** | No sigue convenciones |

---

## 5. ESCALA DE CALIFICACIÓN

| Rango | Calificación | Descripción |
|-------|--------------|-------------|
| 4.5 - 5.0 | **Excelente** | Domina completamente los conceptos de herencia |
| 4.0 - 4.4 | **Sobresaliente** | Comprende y aplica herencia efectivamente |
| 3.5 - 3.9 | **Bueno** | Comprende herencia con algunas limitaciones |
| 3.0 - 3.4 | **Suficiente** | Comprensión básica de herencia |
| 0.0 - 2.9 | **Insuficiente** | No alcanza competencias mínimas |

---

## 6. RETROALIMENTACIÓN

### Aspectos a Evaluar en Retroalimentación

**Fortalezas identificadas:**
- Conceptos bien comprendidos
- Buenas prácticas aplicadas
- Creatividad en el diseño

**Áreas de mejora:**
- Conceptos que requieren refuerzo
- Errores comunes cometidos
- Sugerencias específicas de mejora

**Plan de mejora:**
- Ejercicios adicionales recomendados
- Lecturas complementarias
- Sesiones de tutoría si es necesario

---

## 7. CONSIDERACIONES ESPECIALES

### Plagio y Originalidad
- Se verificará la originalidad del código
- Colaboración permitida en ejercicios de clase
- Proyecto final debe ser individual o en parejas autorizadas
- Uso de IA debe ser declarado y el estudiante debe explicar el código

### Tiempo de Entrega
- **Ejercicios en clase**: Durante la sesión (4 horas)
- **Proyecto final**: 1 semana después de la sesión
- **Penalización por retraso**: -0.5 puntos por día hábil

### Recuperación
- Estudiantes con nota < 3.0 pueden presentar recuperación
- Recuperación consiste en nuevo proyecto integrador
- Máxima nota en recuperación: 3.5

---

## 8. FORMATO DE ENTREGA

### Estructura de Carpetas
```
apellido-nombre-semana04/
├── src/
│   ├── Empleado.java
│   ├── EmpleadoTiempoCompleto.java
│   ├── EmpleadoTiempoParcial.java
│   ├── Contratista.java
│   └── Main.java
├── docs/
│   ├── diagrama-uml.png (o .pdf)
│   └── README.md
└── pruebas/
    └── capturas-ejecucion/ (opcional)
```

### Formato de Nombres de Archivo
- Archivos Java: PascalCase (ej: `EmpleadoTiempoCompleto.java`)
- Documentos: kebab-case (ej: `diagrama-uml.png`)
- Sin espacios, sin caracteres especiales

### Medio de Entrega
- Repositorio Git (GitHub/GitLab)
- Carpeta compartida (Google Drive/OneDrive)
- Plataforma LMS del SENA
- Correo electrónico (como última opción)

---

## 9. LISTA DE VERIFICACIÓN PARA ESTUDIANTES

Antes de entregar, verificar:

**Código:**
- [ ] Todas las clases compilan sin errores
- [ ] El programa ejecuta correctamente
- [ ] Uso correcto de `extends` en todas las subclases
- [ ] Uso de `super()` en todos los constructores de subclases
- [ ] Atributos encapsulados apropiadamente
- [ ] Métodos con nombres descriptivos
- [ ] Código comentado en partes complejas

**Documentación:**
- [ ] Diagrama UML incluido y correcto
- [ ] README.md con descripción completa
- [ ] Instrucciones de compilación y ejecución
- [ ] Ejemplos de uso incluidos

**Formato:**
- [ ] Estructura de carpetas correcta
- [ ] Nombres de archivos según convenciones
- [ ] Sin archivos innecesarios (.class, .idea, etc.)

---

## 10. RECURSOS DE APOYO PARA EVALUACIÓN

### Para el Estudiante
- Glosario de términos (semana-04/3-recursos/glosario.md)
- Cheatsheet de herencia (semana-04/3-recursos/cheatsheet-herencia.md)
- Ejemplos de referencia en carpeta de prácticas
- Tutoriales en documentación oficial de Java

### Para el Instructor
- Soluciones de ejercicios
- Rúbricas automatizadas (JSON/YAML)
- Scripts de validación de código
- Banco de preguntas para cuestionarios

---

**Nota Final:** Esta rúbrica es una guía. El instructor puede hacer ajustes según las necesidades específicas del grupo, siempre manteniendo la equidad y transparencia en la evaluación.

---

**Versión:** 1.0  
**Fecha:** Octubre 2025  
**Revisado por:** Equipo Pedagógico SENA
