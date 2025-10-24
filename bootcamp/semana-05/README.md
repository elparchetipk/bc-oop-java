# Semana 05 - Polimorfismo 🎭

## 📋 Información General

**Duración:** 4 horas  
**Modalidad:** Presencial  
**Objetivo:** Dominar el polimorfismo mediante sobrecarga y sobrescritura de métodos

---

## 🎯 Objetivos de Aprendizaje

Al finalizar esta semana, el estudiante será capaz de:

1. **Distinguir** entre polimorfismo en tiempo de compilación y tiempo de ejecución
2. **Implementar** métodos sobrecargados (overloading) correctamente
3. **Sobrescribir** métodos heredados usando `@Override`
4. **Aplicar** equals(), hashCode() y Comparable
5. **Crear** sistemas flexibles usando polimorfismo dinámico

---

## 📚 Temario

### 1. Concepto de Polimorfismo (30 min)
- Definición: "muchas formas"
- Ventajas del polimorfismo
- Tipos de polimorfismo en Java

### 2. Sobrecarga de Métodos - Overloading (45 min)
- Mismo nombre, diferentes parámetros
- Reglas de sobrecarga
- Ejemplos prácticos
- Constructores sobrecargados

### 3. Sobrescritura de Métodos - Overriding (60 min)
- Anotación @Override
- Uso de super
- equals() y hashCode()
- toString() personalizado

### 4. Polimorfismo Dinámico (45 min)
- Variables de superclase
- Binding dinámico
- Arrays polimórficos
- instanceof y getClass()

### 5. Comparable y Comparación (30 min)
- Interfaz Comparable<T>
- Método compareTo()
- Ordenamiento natural
- Comparadores personalizados

### 6. Práctica Integradora (70 min)
- Aplicar todos los conceptos
- Código en vivo
- Resolución de ejercicios

---

## 📂 Estructura de la Semana

```
semana-05/
├── 0-assets/                      # Diagramas SVG
│   ├── 1-tipos-polimorfismo.svg
│   ├── 2-overloading-vs-overriding.svg
│   ├── 3-polimorfismo-dinamico.svg
│   └── 4-equals-hashcode.svg
├── 1-teoria/                      # Material teórico
│   ├── 01-introduccion-polimorfismo.md
│   ├── 02-sobrecarga-overloading.md
│   ├── 03-sobrescritura-overriding.md
│   ├── 04-polimorfismo-dinamico.md
│   └── 05-equals-hashcode-comparable.md
├── 2-practica/                    # Ejercicios guiados
│   ├── practica-01-overloading.md
│   ├── practica-02-overriding.md
│   ├── practica-03-equals-hashcode.md
│   └── practica-04-polimorfismo-completo.md
├── 3-recursos/                    # Material complementario
│   ├── glosario.md
│   ├── errores-comunes.md
│   └── recursos-externos.md
├── 4-ejercicios-semanales/        # Evaluación semanal
│   ├── README.md
│   ├── EJERCICIOS_SEMANALES.md
│   └── FORMATO_ENTREGA.md
├── README.md                      # Este archivo
└── RUBRICA_EVALUACION.md          # Criterios de evaluación
```

---

## 🔑 Conceptos Clave

### Sobrecarga (Overloading)
```java
// Mismo nombre, diferentes parámetros
public void actualizar(String nombre) { }
public void actualizar(String nombre, String email) { }
public void actualizar(String nombre, String email, int edad) { }
```

**Características:**
- ✅ Misma clase
- ✅ Mismo nombre de método
- ✅ Diferentes parámetros (cantidad o tipo)
- ✅ Decidido en tiempo de compilación

### Sobrescritura (Overriding)
```java
class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}
```

**Características:**
- ✅ Requiere herencia
- ✅ Mismo método (nombre, parámetros, retorno)
- ✅ Diferente implementación
- ✅ Decidido en tiempo de ejecución
- ✅ Usa anotación @Override

### Polimorfismo Dinámico
```java
Animal miAnimal;  // Variable de superclase

miAnimal = new Perro();
miAnimal.hacerSonido();  // "Guau guau!"

miAnimal = new Gato();
miAnimal.hacerSonido();  // "Miau miau!"
```

**Ventaja:** Flexibilidad y extensibilidad del código

---

## 💡 Diferencias Clave

| Aspecto | Overloading | Overriding |
|---------|-------------|------------|
| **Ubicación** | Misma clase | Subclase |
| **Firma del método** | Diferente | Igual |
| **Resolución** | Compilación | Ejecución |
| **Palabra clave** | Ninguna | @Override |
| **Herencia** | No requerida | Requerida |
| **super** | No aplica | Opcional |

---

## 🛠️ Herramientas y Recursos

### Software Necesario
- JDK 11 o superior
- IntelliJ IDEA / VS Code
- Git

### Recursos de Estudio
- [Documentación Oracle - Polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
- [Documentación Object.equals()](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-)
- [Comparable Interface](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)

### Videos Recomendados
- Polimorfismo en Java explicado
- Overloading vs Overriding
- Implementando equals() y hashCode()

---

## ✅ Criterios de Éxito

Al finalizar la semana, deberás:

- [ ] Explicar qué es polimorfismo y sus tipos
- [ ] Crear métodos sobrecargados correctamente
- [ ] Sobrescribir métodos usando @Override
- [ ] Implementar equals(), hashCode() y compareTo()
- [ ] Usar polimorfismo en arrays y colecciones
- [ ] Aplicar polimorfismo en el proyecto semanal

---

## 📊 Evaluación

### Evidencias de Conocimiento (30%)
- Cuestionario sobre tipos de polimorfismo
- Diferencias entre overloading y overriding
- Contrato entre equals() y hashCode()

### Evidencias de Desempeño (30%)
- Implementación de métodos sobrecargados
- Sobrescritura correcta con @Override
- Uso de super en métodos sobrescritos

### Evidencias de Producto (40%)
- Proyecto con polimorfismo completo
- Código funcional en GitHub
- Documentación y análisis

**Total:** 100 puntos

---

## 🚀 Actividades Prácticas

### Taller 1: Sobrecarga (1 hora)
Crear una clase con múltiples versiones de métodos sobrecargados

### Taller 2: Sobrescritura (1 hora)
Implementar jerarquía con métodos sobrescritos

### Taller 3: equals y hashCode (45 min)
Implementar correctamente ambos métodos

### Proyecto Integrador (1.5 horas)
Aplicar todos los conceptos en el proyecto del dominio asignado

---

## 📌 Consejos y Buenas Prácticas

### ✅ DO (Hacer)
- Usa @Override siempre que sobrescribas
- Implementa equals() y hashCode() juntos
- Documenta métodos sobrecargados con JavaDoc
- Usa nombres descriptivos en parámetros
- Aprovecha polimorfismo para simplificar código

### ❌ DON'T (No Hacer)
- No confundas overloading con overriding
- No olvides llamar a super cuando sea necesario
- No sobrecargues excesivamente (máximo 3-4 versiones)
- No uses instanceof innecesariamente
- No ignores las reglas de equals() y hashCode()

---

## 🔗 Relación con Otras Semanas

### Semanas Anteriores
- **Semana 02:** Arrays (ahora polimórficos)
- **Semana 03:** Encapsulación (getters/setters sobrecargados)
- **Semana 04:** Herencia (base para overriding)

### Semanas Siguientes
- **Semana 06:** Abstracción (métodos abstractos para sobrescribir)
- **Semana 07:** Excepciones (manejo en métodos polimórficos)
- **Semana 08:** Colecciones (polimorfismo con List, Set, Map)

---

## 📞 Soporte

- **Instructor:** Disponible durante la sesión
- **Foro:** Para dudas fuera de clase
- **Compañeros:** Trabajo colaborativo en talleres
- **Tutorías:** Horario según disponibilidad

---

## 📅 Cronograma de la Sesión

| Tiempo | Actividad |
|--------|-----------|
| 0:00 - 0:30 | Introducción al polimorfismo |
| 0:30 - 1:15 | Teoría: Overloading |
| 1:15 - 2:00 | Taller práctico: Sobrecarga |
| 2:00 - 2:15 | **DESCANSO** ☕ |
| 2:15 - 3:00 | Teoría: Overriding y equals() |
| 3:00 - 3:30 | Taller: Sobrescritura |
| 3:30 - 4:00 | Integración y cierre |

---

## 🎓 Reflexión Final

El polimorfismo es el **verdadero poder de la POO**. Permite:

- ✅ Código más flexible y extensible
- ✅ Reducción de duplicación
- ✅ Mantenimiento simplificado
- ✅ Facilita el testing
- ✅ Preparación para patrones de diseño

> "El polimorfismo transforma código rígido en código flexible"

---

**¡Éxito en tu aprendizaje del polimorfismo!** 🎭

---

*Bootcamp POO Java - SENA | Semana 05 de 10*
