# Ejercicios Semanales - Semana 05

## 🎭 Polimorfismo

### Tema Central
Aplicar polimorfismo mediante sobrecarga y sobrescritura de métodos para crear código flexible y reutilizable.

---

## 🎯 Objetivo de la Semana

Profundizar en polimorfismo aplicando:
- **Sobrecarga de métodos** (Overloading): Múltiples versiones de un método con diferentes parámetros
- **Sobrescritura de métodos** (Overriding): Redefinición de métodos heredados con `@Override`
- **Polimorfismo dinámico**: Referencias de superclase que ejecutan métodos de subclases
- **Métodos genéricos**: Métodos que trabajan con la superclase

---

## 📊 Estructura de Ejercicios

Esta semana **refinamos el uso de polimorfismo** en la jerarquía existente.

| Ejercicio | Descripción | Puntos |
|-----------|-------------|--------|
| **1** | Sobrecarga de métodos en clases | 25 pts |
| **2** | Sobrescritura avanzada con super | 25 pts |
| **3** | Métodos polimórficos en gestor | 25 pts |
| **4** | Demostración completa y análisis | 25 pts |
| **TOTAL** | | **100 pts** |

---

## 🔄 Continuidad con Semanas Anteriores

### Semana 01
✅ Creaste 2 clases básicas de tu dominio

### Semana 02
✅ Agregaste 3ra clase + Sistema/Gestor con arrays

### Semana 03
✅ Refactorizaste aplicando encapsulación y constructores

### Semana 04
✅ Agregaste jerarquías con herencia (1 superclase + 2 subclases)

### Semana 05 ⬅️ ESTAMOS AQUÍ
🎯 Aprovechas al máximo el polimorfismo en tu jerarquía existente

---

## 💡 Enfoque de la Semana

**Pregunta clave:** ¿Cómo puedo hacer que mis métodos sean más flexibles y reutilizables?

### Conceptos a Aplicar

#### 1. Sobrecarga (Overloading)
```java
// Múltiples versiones del mismo método
public void registrar(String nombre)
public void registrar(String nombre, String email)
public void registrar(String nombre, String email, int edad)
```

#### 2. Sobrescritura (Overriding)
```java
// En superclase
public double calcularCosto() { ... }

// En subclase
@Override
public double calcularCosto() { 
    return super.calcularCosto() * 1.2; // Agrega lógica específica
}
```

#### 3. Polimorfismo Dinámico
```java
Curso c = new CursoVirtual(...);  // Referencia de superclase
c.calcularCosto();  // Ejecuta método de CursoVirtual (polimórfico)
```

---

## 🎨 Lo Nuevo Esta Semana

### Antes (Semana 04)
- Jerarquía básica implementada
- Métodos sobrescritos simples
- toString() polimórfico básico

### Después (Semana 05)
- Métodos sobrecargados en múltiples clases
- Sobrescritura avanzada con cálculos complejos
- Gestor con métodos 100% polimórficos
- Comparadores y ordenamiento polimórfico

---

## 📝 Vista Previa de Ejercicios

### Ejercicio 1: Sobrecarga de Métodos (25 pts)
- Agregar 3+ métodos sobrecargados en superclase
- Agregar 2+ métodos sobrecargados en cada subclase
- Constructores adicionales sobrecargados
- Validaciones específicas por sobrecarga

### Ejercicio 2: Sobrescritura Avanzada (25 pts)
- Sobrescribir mínimo 2 métodos adicionales
- Usar super() en métodos sobrescritos
- Agregar equals() y hashCode()
- Implementar compareTo() para ordenamiento

### Ejercicio 3: Métodos Polimórficos en Gestor (25 pts)
- Métodos que aceptan superclase
- Operaciones polimórficas (búsqueda, filtrado, ordenamiento)
- Cálculos que usan polimorfismo
- Estadísticas por tipo usando instanceof

### Ejercicio 4: Demostración y Análisis (25 pts)
- Main mostrando todos los tipos de polimorfismo
- Análisis de ventajas del polimorfismo
- Comparación con código sin polimorfismo
- Documentación de patrones aplicados

---

## ⚙️ Pesos de Evaluación

```
Ejercicios Semanales: 70%
├─ Ejercicio 1: 25 pts (17.5%)
├─ Ejercicio 2: 25 pts (17.5%)
├─ Ejercicio 3: 25 pts (17.5%)
└─ Ejercicio 4: 25 pts (17.5%)

Otras evidencias: 30%
└─ Quiz, taller en clase, participación
```

---

## 📦 Entregables

1. **Código:**
   - `semana-05/src/` con polimorfismo refinado
   - Superclase con métodos sobrecargados
   - Subclases con sobrescritura avanzada
   - Gestor completamente polimórfico
   - Main demostrativo

2. **Documentación:**
   - `semana-05/docs/ANALISIS.md` con:
     - Ejemplos de cada tipo de polimorfismo
     - Comparación con código no polimórfico
     - Ventajas medibles
     - Patrones identificados

3. **README.md:**
   - Descripción de polimorfismo aplicado
   - Instrucciones de compilación

---

## 🚀 Preparación

### Antes de Empezar

1. ✅ Asegúrate de tener `semana-04` completa y funcionando
2. ✅ Revisa los métodos que ya tienes sobrescritos
3. ✅ Identifica qué métodos podrían ser sobrecargados

### Comandos Iniciales

```bash
# Copiar semana-04 como base
cp -r semana-04 semana-05

# Entrar a la nueva carpeta
cd semana-05

# Ahora sí, agregar polimorfismo avanzado...
```

---

## 📚 Recursos

- Ver archivo `EJERCICIOS_SEMANALES.md` para especificaciones detalladas
- Ver archivo `FORMATO_ENTREGA.md` para estructura de entrega
- Revisar material teórico en `semana-05/1-teoria/`

---

## 💬 Nota del Instructor

Esta semana consolidarás tu comprensión de polimorfismo, uno de los pilares más poderosos de la POO. El código de semana-04 (con herencia bien implementada) es la base perfecta para explotar polimorfismo al máximo.

**Recuerda:** 
- **Sobrecarga** = Mismo nombre, diferentes parámetros (tiempo de compilación)
- **Sobrescritura** = Mismo nombre y parámetros, diferente implementación (tiempo de ejecución)

---

**¡Es hora de dominar el polimorfismo!** 🎭
