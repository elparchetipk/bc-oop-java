# Rúbrica de Evaluación - Semana 05: Polimorfismo

## 📋 Información General

**Semana:** 05 - Polimorfismo  
**Total de Puntos:** 100  
**Porcentaje del Bootcamp:** 10%  
**Fecha de Evaluación:** Domingo (Semana 05)

---

## 🎯 Distribución de la Evaluación

| Tipo de Evidencia | Peso | Puntos |
|-------------------|------|--------|
| Conocimiento | 30% | 30 |
| Desempeño | 30% | 30 |
| Producto | 40% | 40 |
| **TOTAL** | **100%** | **100** |

---

## 📚 Evidencias de Conocimiento (30 puntos)

### Criterio 1: Comprensión de Tipos de Polimorfismo (10 puntos)

| Nivel | Puntos | Descripción |
|-------|--------|-------------|
| **Excelente** | 9-10 | Explica claramente los 3 tipos de polimorfismo con ejemplos precisos. Diferencia perfectamente overloading de overriding. |
| **Bueno** | 7-8 | Explica los tipos de polimorfismo con algunos ejemplos. Diferencia overloading de overriding con claridad. |
| **Suficiente** | 5-6 | Identifica los tipos básicos de polimorfismo. Confunde ocasionalmente overloading con overriding. |
| **Insuficiente** | 0-4 | No distingue los tipos de polimorfismo o tiene conceptos erróneos fundamentales. |

**Evidencia:** Cuestionario teórico o exposición oral

---

### Criterio 2: Contrato equals() y hashCode() (10 puntos)

| Nivel | Puntos | Descripción |
|-------|--------|-------------|
| **Excelente** | 9-10 | Explica completamente el contrato entre equals() y hashCode(), incluidas todas las reglas y consecuencias. |
| **Bueno** | 7-8 | Explica el contrato básico y menciona la mayoría de las reglas. |
| **Suficiente** | 5-6 | Entiende que deben ir juntos pero no explica completamente el contrato. |
| **Insuficiente** | 0-4 | No comprende la relación entre equals() y hashCode(). |

**Evidencia:** Preguntas escritas o ejercicios de análisis

---

### Criterio 3: Binding Dinámico y Referencias Polimórficas (10 puntos)

| Nivel | Puntos | Descripción |
|-------|--------|-------------|
| **Excelente** | 9-10 | Explica el binding dinámico, upcasting, downcasting y cuándo usar cada uno. |
| **Bueno** | 7-8 | Explica el concepto de binding dinámico y referencias polimórficas. |
| **Suficiente** | 5-6 | Comprende referencias polimórficas básicas. |
| **Insuficiente** | 0-4 | Confunde referencias con objetos o no entiende el concepto. |

**Evidencia:** Análisis de código o resolución de problemas teóricos

---

## 🛠️ Evidencias de Desempeño (30 puntos)

### Criterio 4: Implementación de Sobrecarga (10 puntos)

| Nivel | Puntos | Descripción |
|-------|--------|-------------|
| **Excelente** | 9-10 | Implementa 3+ métodos sobrecargados en superclase y 2+ en cada subclase. Variedad en tipos de parámetros. JavaDoc completo. |
| **Bueno** | 7-8 | Implementa el mínimo requerido de métodos sobrecargados. JavaDoc en la mayoría. |
| **Suficiente** | 5-6 | Implementa algunos métodos sobrecargados, puede faltar en una subclase. JavaDoc incompleto. |
| **Insuficiente** | 0-4 | No implementa sobrecarga o lo hace incorrectamente. |

**Evidencia:** Código fuente con métodos sobrecargados

---

### Criterio 5: Sobrescritura Correcta con @Override (10 puntos)

| Nivel | Puntos | Descripción |
|-------|--------|-------------|
| **Excelente** | 9-10 | Sobrescribe correctamente equals(), hashCode(), compareTo() y métodos de negocio. Usa @Override y super apropiadamente. |
| **Bueno** | 7-8 | Sobrescribe la mayoría de los métodos requeridos. Usa @Override consistentemente. |
| **Suficiente** | 5-6 | Sobrescribe algunos métodos. Uso inconsistente de @Override o super. |
| **Insuficiente** | 0-4 | No sobrescribe métodos o lo hace incorrectamente. Falta @Override. |

**Evidencia:** Código fuente con métodos sobrescritos

---

### Criterio 6: Métodos Polimórficos en Gestor (10 puntos)

| Nivel | Puntos | Descripción |
|-------|--------|-------------|
| **Excelente** | 9-10 | Gestor 100% polimórfico: búsqueda, ordenamiento, estadísticas. Sin instanceof innecesario. Código limpio. |
| **Bueno** | 7-8 | Mayoría de métodos polimórficos. Algún instanceof justificado. |
| **Suficiente** | 5-6 | Algunos métodos polimórficos. Uso excesivo de instanceof. |
| **Insuficiente** | 0-4 | Gestor no aprovecha polimorfismo. if-else para tipos. |

**Evidencia:** Código del sistema/gestor

---

## 📦 Evidencias de Producto (40 puntos)

### Criterio 7: Proyecto Completo con Polimorfismo (20 puntos)

| Nivel | Puntos | Descripción |
|-------|--------|-------------|
| **Excelente** | 18-20 | Proyecto integra todos los tipos de polimorfismo. Código compila, ejecuta y demuestra todos los conceptos. Estructura clara. |
| **Bueno** | 14-17 | Proyecto integra la mayoría de conceptos. Código funcional con pequeños errores. |
| **Suficiente** | 10-13 | Proyecto con polimorfismo básico. Código funciona parcialmente. |
| **Insuficiente** | 0-9 | Proyecto incompleto o no funcional. No demuestra polimorfismo. |

**Evidencia:** Repositorio GitHub con carpeta semana-05/

**Componentes obligatorios:**
- ✅ Clases con métodos sobrecargados
- ✅ Subclases con sobrescritura
- ✅ equals(), hashCode() implementados
- ✅ Comparable implementado
- ✅ Gestor polimórfico
- ✅ Main demostrativo

---

### Criterio 8: Main Demostrativo (10 puntos)

| Nivel | Puntos | Descripción |
|-------|--------|-------------|
| **Excelente** | 9-10 | Main demuestra claramente: overloading, overriding, polimorfismo dinámico, equals/hashCode, Comparable. Salida organizada y comentada. |
| **Bueno** | 7-8 | Main demuestra la mayoría de conceptos. Salida clara. |
| **Suficiente** | 5-6 | Main demuestra algunos conceptos. Salida básica. |
| **Insuficiente** | 0-4 | Main no demuestra los conceptos o no ejecuta. |

**Evidencia:** Archivo Main.java ejecutable

---

### Criterio 9: Documentación y Análisis (10 puntos)

| Nivel | Puntos | Descripción |
|-------|--------|-------------|
| **Excelente** | 9-10 | ANALISIS.md completo con comparación antes/después, métricas, casos de uso, lecciones aprendidas. README.md actualizado. |
| **Bueno** | 7-8 | ANALISIS.md con la mayoría de secciones. README actualizado. |
| **Suficiente** | 5-6 | ANALISIS.md básico. README con info mínima. |
| **Insuficiente** | 0-4 | Sin ANALISIS.md o README desactualizado. |

**Evidencia:** Archivos semana-05/docs/ANALISIS.md y semana-05/README.md

---

## ✅ Checklist de Entrega

### Estructura de Carpetas
- [ ] Carpeta `semana-05/` en el repositorio
- [ ] Subcarpeta `src/` con archivos `.java`
- [ ] Subcarpeta `docs/` con ANALISIS.md
- [ ] README.md en raíz de semana-05

### Código Fuente
- [ ] Superclase con mínimo 3 métodos sobrecargados
- [ ] Cada subclase con mínimo 2 métodos sobrecargados
- [ ] equals() y hashCode() implementados en todas las clases
- [ ] Comparable<T> implementado
- [ ] @Override en todos los métodos sobrescritos
- [ ] Gestor con métodos polimórficos
- [ ] Main.java demostrativo

### Calidad del Código
- [ ] Código compila sin errores
- [ ] Código ejecuta correctamente
- [ ] JavaDoc en métodos públicos
- [ ] Nombres descriptivos
- [ ] Sin warnings del compilador

### Documentación
- [ ] README.md con descripción de cambios
- [ ] ANALISIS.md con análisis completo
- [ ] Comentarios en código complejo

### Control de Versiones
- [ ] Commits con mensajes descriptivos
- [ ] Formato de commit apropiado
- [ ] Sin archivos .class en el repo
- [ ] .gitignore configurado

---

## 📊 Tabla Resumen de Puntuación

| Criterio | Puntos Máximos |
|----------|----------------|
| 1. Comprensión de polimorfismo | 10 |
| 2. Contrato equals/hashCode | 10 |
| 3. Binding dinámico | 10 |
| **Subtotal Conocimiento** | **30** |
| 4. Sobrecarga | 10 |
| 5. Sobrescritura | 10 |
| 6. Gestor polimórfico | 10 |
| **Subtotal Desempeño** | **30** |
| 7. Proyecto completo | 20 |
| 8. Main demostrativo | 10 |
| 9. Documentación | 10 |
| **Subtotal Producto** | **40** |
| **TOTAL SEMANA 05** | **100** |

---

## 🎯 Criterios de Aprobación

| Calificación | Rango | Descripción |
|--------------|-------|-------------|
| **Excelente** | 90-100 | Domina polimorfismo completamente |
| **Bueno** | 75-89 | Comprende y aplica polimorfismo correctamente |
| **Suficiente** | 60-74 | Aplica polimorfismo básico |
| **Insuficiente** | 0-59 | Requiere refuerzo |

**Nota mínima de aprobación:** 60 puntos

---

## 📝 Observaciones Importantes

1. **Plagio:** Cualquier evidencia de copia resultará en nota de 0 para todos los involucrados.

2. **Entrega tardía:** Se penalizará con -10 puntos por día de retraso.

3. **Código no funcional:** Si el código no compila, el máximo puntaje es 50.

4. **Originalidad:** El proyecto debe ser tu trabajo en tu dominio asignado.

5. **Ayuda entre compañeros:** Permitido para aprender, pero cada quien entrega su código.

---

## 📞 Consultas

Si tienes dudas sobre los criterios de evaluación:
- Revisa la guía FORMATO_ENTREGA.md
- Consulta el archivo EJERCICIOS_SEMANALES.md
- Pregunta al instructor durante la sesión

---

**¡Éxito en tu evaluación de polimorfismo"✅ Archivo 1-tipos-polimorfismo.svg creado"* 🎭

*Bootcamp POO Java - SENA | Semana 05 de 10*
