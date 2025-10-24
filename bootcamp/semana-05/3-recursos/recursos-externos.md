# Recursos Externos - Videos y Material Complementario

## 🎥 Videos Recomendados (Dropbox)

### 1. Introducción al Polimorfismo en Java

**Descripción:** Video introductorio que explica el concepto de polimorfismo mediante ejemplos visuales y casos de uso del mundo real. Ideal para entender el "por qué" antes del "cómo".

**Temas cubiertos:**
- Definición de polimorfismo
- Tipos de polimorfismo (compilación vs ejecución)
- Ventajas del polimorfismo en el diseño de software
- Ejemplos con figuras geométricas

**Duración:** 15-20 minutos  
**Nivel:** Básico  
**📁 Enlace:** `[Dropbox] → Semana-05 → 01-introduccion-polimorfismo.mp4`

**Cuándo verlo:** Antes de iniciar la teoría de la semana

---

### 2. Sobrecarga vs Sobrescritura - Diferencias Clave

**Descripción:** Comparación detallada entre overloading y overriding, los dos tipos principales de polimorfismo. Incluye ejemplos de código en vivo y errores comunes.

**Temas cubiertos:**
- Overloading (sobrecarga de métodos)
- Overriding (sobrescritura de métodos)
- Tabla comparativa de diferencias
- Cuándo usar cada uno
- Anotación @Override y su importancia
- Uso de super en métodos sobrescritos

**Duración:** 25-30 minutos  
**Nivel:** Intermedio  
**📁 Enlace:** `[Dropbox] → Semana-05 → 02-overloading-vs-overriding.mp4`

**Cuándo verlo:** Después de leer la teoría, antes de las prácticas 01 y 02

---

### 3. Implementando equals() y hashCode() Correctamente

**Descripción:** Tutorial paso a paso para implementar equals() y hashCode() siguiendo las mejores prácticas. Incluye explicación del contrato entre ambos métodos y pruebas con colecciones.

**Temas cubiertos:**
- El contrato de equals() y hashCode()
- Reglas: reflexividad, simetría, transitividad
- Implementación correcta usando Objects.equals() y Objects.hash()
- Errores comunes y cómo evitarlos
- Uso en HashSet, HashMap y otras colecciones
- Generación automática con IDE

**Duración:** 20-25 minutos  
**Nivel:** Intermedio  
**📁 Enlace:** `[Dropbox] → Semana-05 → 03-equals-hashcode-tutorial.mp4`

**Cuándo verlo:** Antes de la Práctica 03

---

### 4. Polimorfismo Dinámico en Acción

**Descripción:** Demostración avanzada de polimorfismo dinámico (runtime polymorphism) con binding dinámico. Incluye un proyecto completo de sistema de pagos implementando herencia y sobrescritura.

**Temas cubiertos:**
- Binding estático vs dinámico
- Upcasting y downcasting
- instanceof y verificación de tipos
- Arrays y colecciones polimórficas
- Proyecto: Sistema de Pagos (TarjetaCredito, Efectivo, Transferencia)
- Patrón Strategy aplicado con polimorfismo

**Duración:** 35-40 minutos  
**Nivel:** Avanzado  
**📁 Enlace:** `[Dropbox] → Semana-05 → 04-polimorfismo-dinamico-avanzado.mp4`

**Cuándo verlo:** Después de completar las prácticas 01-03, antes del ejercicio semanal

---

### 5. Debugging de Polimorfismo en IntelliJ IDEA

**Descripción:** Video práctico mostrando cómo usar el debugger de IntelliJ IDEA para entender el flujo de ejecución en código polimórfico. Muy útil para visualizar qué método se ejecuta en runtime.

**Temas cubiertos:**
- Configuración de breakpoints en métodos sobrescritos
- Step Into vs Step Over con polimorfismo
- Visualizar la pila de llamadas (call stack)
- Inspeccionar objetos polimórficos
- Evaluación de expresiones en tiempo de ejecución

**Duración:** 15 minutos  
**Nivel:** Intermedio  
**📁 Enlace:** `[Dropbox] → Semana-05 → 05-debugging-polimorfismo-intellij.mp4`

**Cuándo verlo:** Durante las prácticas, cuando encuentres comportamientos inesperados

---

## 📋 Orden de Visualización Recomendado

```
┌──────────────────────────────────────────────┐
│ DÍA 1 (Antes de clase)                       │
├──────────────────────────────────────────────┤
│ 1. Introducción al Polimorfismo (15 min)    │
│ 2. Leer 01-introduccion-polimorfismo.md     │
└──────────────────────────────────────────────┘

┌──────────────────────────────────────────────┐
│ DÍA 2 (Durante prácticas)                    │
├──────────────────────────────────────────────┤
│ 1. Sobrecarga vs Sobrescritura (30 min)     │
│ 2. Realizar Práctica 01 y 02                 │
│ 3. Video de Debugging (si hay problemas)     │
└──────────────────────────────────────────────┘

┌──────────────────────────────────────────────┐
│ DÍA 3 (Conceptos avanzados)                  │
├──────────────────────────────────────────────┤
│ 1. equals() y hashCode() Tutorial (25 min)  │
│ 2. Realizar Práctica 03                      │
└──────────────────────────────────────────────┘

┌──────────────────────────────────────────────┐
│ DÍA 4 (Integración)                          │
├──────────────────────────────────────────────┤
│ 1. Polimorfismo Dinámico Avanzado (40 min)  │
│ 2. Realizar Ejercicio Semanal                │
└──────────────────────────────────────────────┘
```

---

## 🔗 Recursos Adicionales

### Documentación Oficial

- **Oracle Java Docs - Object Methods:**  
  https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
  
- **Java Tutorial - Overriding and Hiding Methods:**  
  https://docs.oracle.com/javase/tutorial/java/IandI/override.html

- **Effective Java (Item 10-12):**  
  Capítulos sobre equals(), hashCode() y toString()

### Artículos Recomendados

- **"Understanding Polymorphism in Java"** - Baeldung  
  https://www.baeldung.com/java-polymorphism

- **"Overriding equals() and hashCode() in Java"** - Medium  
  Guía completa con ejemplos y patrones

- **"Dynamic Binding in Java"** - GeeksforGeeks  
  Explicación técnica del mecanismo de binding

### Herramientas Interactivas

- **Java Visualizer:**  
  https://pythontutor.com/java.html  
  Visualiza paso a paso la ejecución de código Java

- **JDoodle - Java Compiler Online:**  
  https://www.jdoodle.com/online-java-compiler/  
  Para probar código rápidamente sin IDE

---

## 📖 Libros de Referencia

### Capítulos Relevantes

**"Head First Java" (3rd Edition)**
- Capítulo 7: Inheritance and Polymorphism
- Capítulo 16: Collections and Generics

**"Effective Java" (3rd Edition) - Joshua Bloch**
- Item 10: Obey the general contract when overriding equals
- Item 11: Always override hashCode when you override equals
- Item 12: Always override toString

**"Java: The Complete Reference" (12th Edition)**
- Capítulo 8: Inheritance
- Capítulo 9: Packages and Interfaces

---

## 🎓 Ejercicios Interactivos

### Plataformas Recomendadas

**1. HackerRank - Java Domain**
- Ejercicios de herencia y polimorfismo
- Desafíos de implementación de equals/hashCode
- URL: https://www.hackerrank.com/domains/java

**2. Codingbat - Java**
- Ejercicios cortos de lógica
- Práctica de métodos sobrecargados
- URL: https://codingbat.com/java

**3. LeetCode - Java Track**
- Problemas que requieren diseño orientado a objetos
- Uso de polimorfismo en soluciones
- URL: https://leetcode.com/

---

## 📝 Notas de Estudio

### Descarga el Paquete Completo

**Contenido del paquete:**
- Diagramas UML de todos los ejemplos
- Código fuente completo de las prácticas
- Cheat sheet de polimorfismo (1 página)
- Plantillas de código reutilizables
- Quiz de autoevaluación con respuestas

**📁 Enlace:** `[Dropbox] → Semana-05 → notas-estudio-polimorfismo.zip`

---

## 🎯 Checklist de Recursos

Marca los recursos que ya has revisado:

### Videos
- [ ] Introducción al Polimorfismo (15 min)
- [ ] Sobrecarga vs Sobrescritura (30 min)
- [ ] equals() y hashCode() Tutorial (25 min)
- [ ] Polimorfismo Dinámico Avanzado (40 min)
- [ ] Debugging en IntelliJ IDEA (15 min)

### Lecturas
- [ ] Teoría 01 - Introducción al Polimorfismo
- [ ] Glosario completo de la semana
- [ ] Documentación Oracle sobre Object methods
- [ ] Artículo de Baeldung sobre Polimorfismo

### Prácticas
- [ ] Práctica 01 - Sobrecarga de Métodos
- [ ] Práctica 02 - Sobrescritura de Métodos
- [ ] Práctica 03 - equals() y hashCode()
- [ ] Ejercicio Semanal completo

### Material Adicional
- [ ] Descargado paquete de notas de estudio
- [ ] Revisado ejemplos de código en Dropbox
- [ ] Realizado quiz de autoevaluación

---

## 💡 Consejos de Estudio

### Para Video-Aprendizaje Efectivo

1. **Toma notas activas:** No solo veas, escribe conceptos clave
2. **Pausa y practica:** Después de cada ejemplo, intenta replicarlo
3. **Velocidad variable:** Usa 1.25x para revisión, 0.75x para conceptos complejos
4. **Vuelve a ver:** Los videos de 15-20 min son ideales para repaso rápido

### Patrón de Estudio Recomendado

```
1. Ver video introductorio (15 min)
2. Leer teoría correspondiente (30 min)
3. Realizar práctica guiada (45 min)
4. Ver video avanzado (25 min)
5. Aplicar a tu dominio (60 min)
6. Autoevaluar con quiz (15 min)
```

**Tiempo total:** ~3 horas por concepto principal

---

## 🔄 Actualización de Recursos

**Última actualización:** Enero 2025

Los recursos de Dropbox se actualizan periódicamente. Si encuentras un enlace roto o deseas sugerir un recurso adicional:

📧 **Contacto:** instructor@bootcamp-java.sena.edu.co  
💬 **Foro:** Teams → Canal General → Pestaña Recursos

---

## ⚠️ Nota Importante

Los videos de Dropbox son **material exclusivo del bootcamp**. Por favor:
- ❌ No compartas los enlaces fuera del grupo
- ✅ Úsalos para tu aprendizaje personal
- ✅ Sugiere mejoras o correcciones
- ✅ Comparte tus dudas en el foro

---

**Bootcamp POO Java - SENA | Semana 05 - Recursos Externos**

> **Tip:** Los videos están organizados en carpetas por semana en Dropbox. Puedes descargarlos para verlos offline si tienes problemas de conectividad.
