# Ejercicios Prácticos - Semana 4: Herencia

## 📚 Descripción

Esta carpeta contiene 6 ejercicios prácticos progresivos para dominar los conceptos de herencia en Java. Los ejercicios van de simple a complejo, construyendo sobre el conocimiento previo.

---

## 🎯 Objetivos de Aprendizaje

Al completar estos ejercicios, serás capaz de:

1. ✅ Implementar herencia usando `extends`
2. ✅ Usar `super()` correctamente en constructores
3. ✅ Diseñar jerarquías de clases apropiadas
4. ✅ Sobrescribir métodos con `@Override`
5. ✅ Aplicar modificadores de acceso en herencia
6. ✅ Crear proyectos completos usando herencia

---

## 📋 Lista de Ejercicios

### Ejercicio 1: Comparación Con/Sin Herencia ⭐
**Dificultad:** Básico  
**Duración estimada:** 20 minutos  
**Objetivo:** Comprender la ventaja de usar herencia

**Temas:**
- Duplicación de código vs reutilización
- Sintaxis básica de `extends`
- Comparación directa

**Archivos:**
- `ejercicio-01-comparacion-herencia/`

---

### Ejercicio 2: Jerarquía de Animales ⭐⭐
**Dificultad:** Básico  
**Duración estimada:** 30 minutos  
**Objetivo:** Crear una jerarquía simple Animal → Perro, Gato

**Temas:**
- Clase base `Animal`
- Subclases `Perro` y `Gato`
- Herencia de atributos y métodos
- Métodos específicos de cada subclase

**Archivos:**
- `ejercicio-02-jerarquia-animales/`

---

### Ejercicio 3: Uso de super() ⭐⭐
**Dificultad:** Intermedio  
**Duración estimada:** 25 minutos  
**Objetivo:** Dominar el uso de super en constructores

**Temas:**
- Constructores en jerarquías
- `super()` con y sin parámetros
- Orden de ejecución
- Inicialización de objetos

**Archivos:**
- `ejercicio-03-uso-super/`

---

### Ejercicio 4: Jerarquía de Vehículos ⭐⭐⭐
**Dificultad:** Intermedio  
**Duración estimada:** 40 minutos  
**Objetivo:** Diseñar una jerarquía de múltiples niveles

**Temas:**
- Jerarquía multinivel (3 niveles)
- `Vehiculo` → `VehiculoTerrestre` → `Automovil`, `Motocicleta`
- Constructores encadenados
- Métodos específicos por nivel

**Archivos:**
- `ejercicio-04-jerarquia-vehiculos/`

---

### Ejercicio 5: Jerarquía de Empleados ⭐⭐⭐⭐
**Dificultad:** Avanzado  
**Duración estimada:** 45 minutos  
**Objetivo:** Modelar empleados con diferentes roles

**Temas:**
- Herencia aplicada a dominio de negocio
- Cálculo polimórfico de salarios
- Sobrescritura de métodos
- Encapsulación en jerarquías

**Archivos:**
- `ejercicio-05-jerarquia-empleados/`

---

### Ejercicio 6: Proyecto Integrador - Sistema de Figuras ⭐⭐⭐⭐⭐
**Dificultad:** Avanzado  
**Duración estimada:** 60 minutos  
**Objetivo:** Implementar un sistema completo con herencia

**Temas:**
- Clase abstracta `Figura`
- Jerarquía `Figura2D` y `Figura3D`
- Múltiples figuras específicas
- Cálculos de área, perímetro, volumen
- Programa completo con menú

**Archivos:**
- `ejercicio-06-proyecto-integrador/`

---

## 📊 Niveles de Dificultad

| Símbolo | Nivel | Descripción |
|---------|-------|-------------|
| ⭐ | Básico | Conceptos fundamentales, guía paso a paso |
| ⭐⭐ | Básico-Intermedio | Aplicación directa de conceptos |
| ⭐⭐⭐ | Intermedio | Requiere diseño y decisiones |
| ⭐⭐⭐⭐ | Avanzado | Proyecto complejo, múltiples conceptos |
| ⭐⭐⭐⭐⭐ | Muy Avanzado | Proyecto integrador completo |

---

## 🗂️ Estructura de Cada Ejercicio

Cada carpeta de ejercicio contiene:

```
ejercicio-XX-nombre/
├── README.md                  # Instrucciones del ejercicio
├── enunciado.md              # Descripción detallada del problema
├── solucion/                 # Solución propuesta (para instructores)
│   ├── *.java
│   └── README.md
├── plantilla/                # Código inicial (boilerplate)
│   ├── *.java
│   └── README.md
└── tests/                    # Casos de prueba (opcional)
    └── *.java
```

---

## 🎓 Metodología de Trabajo

### Modo Individual

1. **Lee el enunciado** completo antes de empezar
2. **Planifica** la estructura de clases
3. **Implementa** paso a paso
4. **Prueba** cada clase individualmente
5. **Integra** todas las clases
6. **Verifica** contra los casos de prueba

### Modo Pair Programming

1. **Navigator:** Lee el enunciado y guía
2. **Driver:** Escribe el código
3. **Intercambien roles** cada 15 minutos
4. **Discutan** decisiones de diseño
5. **Revisen** juntos el código final

---

## ✅ Checklist por Ejercicio

Antes de considerar un ejercicio completo:

- [ ] El código compila sin errores
- [ ] Todos los casos de prueba pasan
- [ ] Usaste `extends` correctamente
- [ ] Usaste `super()` en constructores
- [ ] Métodos sobrescritos tienen `@Override`
- [ ] Atributos con modificadores apropiados
- [ ] Código limpio y bien formateado
- [ ] Nombres descriptivos de clases y métodos
- [ ] Comentarios en partes complejas

---

## 🚀 Cómo Empezar

### Opción 1: Desde Cero
```bash
cd ejercicio-01-comparacion-herencia/
# Crea tus archivos .java
```

### Opción 2: Usando Plantilla
```bash
cd ejercicio-01-comparacion-herencia/plantilla/
# Completa el código proporcionado
```

### Opción 3: Revisar Solución (después de intentar)
```bash
cd ejercicio-01-comparacion-herencia/solucion/
# Estudia la solución propuesta
```

---

## 📝 Entrega de Ejercicios

### Para Evaluación

1. **Compila** y **prueba** tu código
2. **Organiza** archivos según estructura
3. **Documenta** con comentarios
4. **Comprime** en un .zip o sube a Git
5. **Entrega** según indicaciones del instructor

### Formato de Nombres

```
apellido-nombre-ejercicio-01.zip
apellido-nombre-ejercicio-02.zip
...
```

O en Git:
```
repositorio/semana-04/ejercicio-01/
repositorio/semana-04/ejercicio-02/
...
```

---

## 🎯 Criterios de Evaluación

Cada ejercicio será evaluado según:

| Criterio | Peso | Descripción |
|----------|------|-------------|
| **Funcionalidad** | 40% | ¿Funciona correctamente? |
| **Herencia** | 30% | ¿Usa herencia apropiadamente? |
| **Código Limpio** | 15% | ¿Es legible y mantenible? |
| **Buenas Prácticas** | 15% | ¿Sigue convenciones Java? |

---

## 💡 Tips para el Éxito

### Antes de Codificar

1. **Dibuja** un diagrama de clases
2. **Identifica** qué va en cada clase
3. **Planifica** la jerarquía
4. **Lista** atributos y métodos

### Durante la Codificación

1. **Empieza** por la clase padre
2. **Prueba** cada clase individualmente
3. **Compila** frecuentemente
4. **Usa** `@Override` siempre

### Después de Codificar

1. **Prueba** todos los casos
2. **Refactoriza** si es necesario
3. **Documenta** decisiones importantes
4. **Compara** con la solución (si disponible)

---

## 🐛 Errores Comunes

### 1. No llamar a super()
```java
// ❌ Error
public Hijo(String param) {
    this.atributo = param;  // Falta super()
}

// ✅ Correcto
public Hijo(String param) {
    super();
    this.atributo = param;
}
```

### 2. Olvidar @Override
```java
// ⚠️ Sin verificación
public void metodo() { }

// ✅ Con verificación
@Override
public void metodo() { }
```

### 3. Modificadores incorrectos
```java
// ❌ Atributos privados en clase base
class Padre {
    private String dato;  // Hijos no pueden acceder
}

// ✅ Protected para herencia
class Padre {
    protected String dato;  // Hijos pueden acceder
}
```

---

## 🔗 Recursos Relacionados

### Material Teórico
- `/1-teoria/01-concepto-herencia.md`
- `/1-teoria/02-palabra-extends.md`
- `/1-teoria/03-jerarquias-clases.md`
- `/1-teoria/04-palabra-super.md`
- `/1-teoria/05-buenas-practicas-herencia.md`

### Recursos Adicionales
- `/3-recursos/glosario.md` - Términos clave
- `/3-recursos/cheatsheet-herencia.md` - Referencia rápida
- `/3-recursos/referencias.md` - Links externos

---

## ❓ Ayuda y Soporte

### Durante la Clase
- Pregunta al instructor
- Trabaja con un compañero
- Usa los recursos del curso

### Fuera de Clase
- Revisa el material teórico
- Consulta las referencias
- Busca en Stack Overflow
- Participa en foros del curso

---

## 📈 Progreso Recomendado

### Sesión en Clase (4 horas)

| Tiempo | Ejercicios |
|--------|------------|
| 0:45 | Ejercicio 1 y 2 |
| 0:15 | **Descanso** |
| 0:45 | Ejercicio 3 y 4 |
| 0:15 | **Descanso** |
| 1:00 | Ejercicio 5 o 6 |

### Trabajo Autónomo (2-3 horas)

- Completar ejercicios iniciados
- Ejercicio 6 (proyecto integrador)
- Revisar soluciones
- Documentar aprendizajes

---

## 🏆 Desafíos Adicionales

Si terminas temprano, intenta:

1. **Añadir funcionalidad** a los ejercicios
2. **Crear tu propia jerarquía** (ej: Instrumentos Musicales)
3. **Implementar interfaces** además de herencia
4. **Crear tests unitarios** con JUnit
5. **Documentar con Javadoc**

---

## 📊 Autoevaluación

Después de cada ejercicio, pregúntate:

- [ ] ¿Entendí qué problema resuelve la herencia aquí?
- [ ] ¿Podría explicar mi diseño a un compañero?
- [ ] ¿Hay una forma más simple de lograr lo mismo?
- [ ] ¿Mi código es fácil de leer y mantener?
- [ ] ¿Qué aprendí nuevo con este ejercicio?

---

**¡Buena suerte con los ejercicios!** 🚀

**Recuerda:** El objetivo no es solo completar los ejercicios, sino **entender** los conceptos de herencia profundamente.

---

**Última actualización:** Octubre 2025  
**Versión:** 1.0
