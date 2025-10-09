# Semana 3 - Principios de Encapsulación y Constructores

## 📋 Descripción

Esta semana profundiza en uno de los pilares fundamentales de la POO: la **encapsulación**. Los estudiantes aprenderán a proteger los datos de sus clases usando modificadores de acceso, implementarán métodos get y set, y dominarán el uso de constructores para inicializar objetos de manera correcta y eficiente.

---

## 🎯 Objetivos de Aprendizaje

Al finalizar esta semana, el estudiante será capaz de:

1. ✅ Comprender y aplicar el principio de encapsulación
2. ✅ Usar correctamente los modificadores de acceso (public, private, protected)
3. ✅ Implementar métodos getters y setters siguiendo convenciones
4. ✅ Crear constructores para inicializar objetos
5. ✅ Aplicar sobrecarga de constructores
6. ✅ Validar datos en setters y constructores
7. ✅ Aplicar buenas prácticas de encapsulación en proyectos reales

---

## 📚 Contenido Teórico

### 1. Principio de Encapsulación
- ¿Qué es la encapsulación?
- Ventajas de encapsular datos
- Ocultamiento de información
- Interfaz pública vs implementación privada
- Ejemplos del mundo real

### 2. Modificadores de Acceso
- **public**: acceso desde cualquier lugar
- **private**: acceso solo dentro de la clase
- **protected**: acceso en la clase y subclases
- **default** (package-private): acceso en el mismo paquete
- Tabla comparativa de modificadores
- Buenas prácticas de visibilidad

### 3. Métodos Get y Set
- Propósito y convenciones de los getters
- Propósito y convenciones de los setters
- Nomenclatura estándar: `getNombre()`, `setNombre()`
- Getters/setters para tipos boolean: `isActivo()`, `setActivo()`
- Validación de datos en setters
- Cuándo usar o no usar getters/setters

### 4. Constructores
- ¿Qué es un constructor?
- Sintaxis y características de constructores
- Constructor por defecto
- Constructor con parámetros
- `this`: referencia al objeto actual
- Inicialización de atributos

### 5. Sobrecarga de Constructores
- Concepto de sobrecarga (overloading)
- Múltiples constructores en una clase
- Llamada entre constructores con `this()`
- Patrones comunes de sobrecarga
- Ventajas de tener múltiples constructores

### 6. Buenas Prácticas en Encapsulación
- Atributos siempre privados
- Métodos públicos para operaciones necesarias
- Validación en setters y constructores
- Inmutabilidad cuando sea apropiado
- Principio de mínima visibilidad
- Documentación con Javadoc

---

## 💻 Ejercicios Prácticos

### Ejercicio 1: Clase sin Encapsulación vs con Encapsulación
**Objetivo**: Comparar el comportamiento y ventajas de la encapsulación

**Clases a implementar**:
- `CuentaBancariaSinEncapsulacion.java`
- `CuentaBancariaConEncapsulacion.java`
- `DemostracionEncapsulacion.java`

**Conceptos aplicados**: Modificadores de acceso, validación de datos

---

### Ejercicio 2: Getters y Setters
**Objetivo**: Implementar correctamente métodos de acceso y modificación

**Clase a implementar**: `Producto`
- Atributos privados: código, nombre, precio, stock
- Getters y setters con validación
- Método para aplicar descuento
- Método para verificar disponibilidad

**Archivos**:
- `Producto.java`
- `PruebaProducto.java`
- `README.md`

---

### Ejercicio 3: Constructores Básicos
**Objetivo**: Crear y usar diferentes tipos de constructores

**Clase a implementar**: `Empleado`
- Constructor por defecto
- Constructor con todos los parámetros
- Métodos para mostrar información
- Validación de datos

**Archivos**:
- `Empleado.java`
- `PruebaEmpleado.java`
- `README.md`

---

### Ejercicio 4: Sobrecarga de Constructores
**Objetivo**: Aplicar sobrecarga de constructores con `this()`

**Clase a implementar**: `Rectangulo`
- Constructor sin parámetros (cuadrado unitario)
- Constructor con un parámetro (cuadrado)
- Constructor con dos parámetros (rectángulo)
- Métodos: calcularArea(), calcularPerimetro()

**Archivos**:
- `Rectangulo.java`
- `PruebaRectangulo.java`
- `README.md`

---

### Ejercicio 5: Validación en Constructores y Setters
**Objetivo**: Implementar validación robusta de datos

**Clase a implementar**: `Estudiante`
- Atributos: identificación, nombre, edad, promedio
- Validaciones específicas en cada setter
- Constructor con validación
- Manejo de valores inválidos

**Archivos**:
- `Estudiante.java`
- `PruebaEstudiante.java`
- `README.md`

---

### Ejercicio 6: Proyecto Integrador
**Objetivo**: Aplicar todos los conceptos de la semana

**Sistema a desarrollar**: Gestión de Vehículos
- Clase `Vehiculo` completamente encapsulada
- Múltiples constructores
- Validaciones en setters
- Métodos de negocio (calcular impuestos, depreciar, etc.)

**Archivos**:
- `Vehiculo.java`
- `SistemaVehiculos.java`
- `README.md`

---

## 🎨 Recursos Visuales

Los siguientes diagramas SVG están disponibles en la carpeta `0-assets/`:

1. **1-encapsulacion-concepto.svg**: Ilustración del principio de encapsulación
2. **2-modificadores-acceso.svg**: Tabla visual de modificadores y su alcance
3. **3-getters-setters.svg**: Flujo de acceso a datos mediante métodos
4. **4-constructores-tipos.svg**: Diferentes tipos de constructores
5. **5-sobrecarga-constructores.svg**: Ejemplo de sobrecarga con this()
6. **6-validacion-datos.svg**: Flujo de validación en setters
7. **7-buenas-practicas-encapsulacion.svg**: Checklist de buenas prácticas

---

## 📖 Material de Apoyo

### Teoría Completa
Ver carpeta `1-teoria/` con documentos detallados sobre cada tema.

### Glosario
Ver `3-recursos/glosario.md` con términos clave de la semana.

### Asignación de Dominios
Ver `4. asignación_dominios/` para ejercicios personalizados por estudiante.

---

## 📝 Evaluación

Ver `RUBRICA_EVALUACION.md` para conocer los criterios de evaluación detallados.

### Distribución de la Evaluación

| Tipo | Peso | Descripción |
|------|------|-------------|
| **Conocimiento** | 30% | Preguntas escritas sobre modificadores, getters/setters, constructores |
| **Desempeño** | 40% | Implementación de clases con encapsulación y constructores |
| **Producto** | 30% | Proyecto integrador con clase completamente encapsulada |

---

## ⏱️ Distribución del Tiempo (4 horas)

| Actividad | Duración | Descripción |
|-----------|----------|-------------|
| **Introducción y Teoría** | 60 min | Encapsulación, modificadores, getters/setters |
| **Práctica Guiada** | 45 min | Ejercicios 1, 2 y 3 |
| **Teoría Constructores** | 30 min | Constructores y sobrecarga |
| **Práctica Autónoma** | 60 min | Ejercicios 4, 5 y 6 |
| **Revisión y Cierre** | 25 min | Dudas, mejores prácticas, tarea |

---

## 🎯 Actividades de Aprendizaje

### Estrategias Didácticas Aplicadas

1. **Aprendizaje Basado en Problemas**: Resolver casos donde la falta de encapsulación causa problemas
2. **Codificación en Vivo**: Demostración paso a paso de implementación
3. **Pair Programming**: Trabajo en parejas para ejercicios 4 y 5
4. **Code Review**: Revisión entre pares de constructores y validaciones
5. **Evaluación Formativa**: Quiz rápido sobre modificadores de acceso

---

## 💡 Consejos para el Estudiante

1. 🔒 **Siempre haz los atributos privados** y expón solo lo necesario
2. ✅ **Valida datos** en setters y constructores para mantener consistencia
3. 📝 **Documenta** tus métodos públicos con comentarios Javadoc
4. 🔁 **Usa this()** para evitar duplicación en constructores sobrecargados
5. 🎯 **Principio de mínima visibilidad**: Si no necesitas que sea público, no lo hagas público

---

## 🔗 Referencias y Recursos Adicionales

### Documentación Oficial
- [Java Encapsulation - Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- [Java Constructors - Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)

### Tutoriales Recomendados
- W3Schools: Java Encapsulation
- GeeksforGeeks: Constructors in Java
- JavaPoint: Java Access Modifiers

### Videos
- Java Encapsulation Explained (YouTube)
- Constructor Overloading in Java (YouTube)

---

## 📋 Checklist de Aprendizaje

Al finalizar esta semana, verifica que puedas:

- [ ] Explicar qué es la encapsulación y por qué es importante
- [ ] Usar correctamente los modificadores public, private, protected
- [ ] Crear getters y setters siguiendo las convenciones de Java
- [ ] Implementar validación de datos en métodos setter
- [ ] Crear constructores con y sin parámetros
- [ ] Aplicar sobrecarga de constructores usando this()
- [ ] Documentar clases y métodos con comentarios Javadoc
- [ ] Diseñar clases completamente encapsuladas
- [ ] Identificar cuándo usar o no getters/setters

---

## 🚀 Preparación para la Próxima Semana

**Semana 4: Herencia**

La próxima semana aprenderemos sobre herencia, que nos permitirá reutilizar código y crear jerarquías de clases. La encapsulación aprendida esta semana será fundamental para proteger datos en clases heredadas.

**Temas a adelantar** (opcional):
- Leer sobre la palabra clave `extends`
- Pensar en ejemplos de jerarquías del mundo real (animales, vehículos, empleados)

---

**¡Éxito en tu aprendizaje de encapsulación y constructores!** 🎓

