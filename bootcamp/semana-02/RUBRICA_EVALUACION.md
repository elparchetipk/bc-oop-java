# Rúbrica de Evaluación - Semana 02
## Fundamentos de Clases y Objetos

---

## 📊 Distribución de Calificación

| Tipo de Evidencia | Peso | Descripción |
|-------------------|------|-------------|
| **Conocimiento** | 30% | Cuestionarios, exámenes, preguntas escritas |
| **Desempeño** | 40% | Ejercicios en clase, talleres prácticos |
| **Producto** | 30% | Entregables de código y documentación |

**Calificación mínima aprobatoria:** 3.0/5.0

---

## 1️⃣ EVIDENCIAS DE CONOCIMIENTO (30%)

### 1.1 Cuestionario: Conceptos de Clase y Objeto (15%)

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|----------------|-------------|------------------|---------------------|
| **Definición de clase** | Define clase correctamente con todos sus componentes (atributos, métodos, constructores) | Define clase correctamente pero omite algún componente | Define clase parcialmente con imprecisiones | No puede definir qué es una clase |
| **Definición de objeto** | Explica objeto como instancia con estado y comportamiento propios | Explica objeto correctamente pero sin profundidad | Explica objeto de forma confusa o incompleta | No distingue objeto de clase |
| **Diferencia clase-objeto** | Diferencia claramente y usa analogías correctas | Diferencia correctamente con explicación básica | Confunde algunos aspectos pero entiende lo general | No puede diferenciar clase de objeto |
| **Instanciación** | Explica proceso de instanciación incluyendo memoria | Explica instanciación correctamente | Explica instanciación superficialmente | No comprende qué es instanciar |

**Instrumento:** Cuestionario escrito de 10 preguntas (4 de selección múltiple, 3 de respuesta corta, 3 de desarrollo)

**Preguntas ejemplo:**
1. ¿Qué es una clase en Java?
2. ¿Cuál es la diferencia entre una clase y un objeto?
3. ¿Qué representa el operador `new` en Java?
4. Define con tus palabras qué es un atributo y qué es un método

---

### 1.2 Evaluación: Encapsulación y Modificadores (15%)

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|----------------|-------------|------------------|---------------------|
| **Modificadores de acceso** | Identifica y explica public, private, protected, default con ejemplos | Identifica correctamente los 4 modificadores | Identifica public y private solamente | No comprende modificadores de acceso |
| **Concepto encapsulación** | Define encapsulación y explica sus beneficios con ejemplos | Define encapsulación correctamente | Define encapsulación superficialmente | No comprende qué es encapsulación |
| **Aplicación práctica** | Identifica cuándo usar cada modificador apropiadamente | Identifica uso de public/private correctamente | Tiene dudas sobre cuándo usar cada modificador | No sabe cuándo usar modificadores |

**Instrumento:** Preguntas escritas y análisis de código

**Preguntas ejemplo:**
1. ¿Qué significa encapsular en POO?
2. ¿Cuándo debo usar `private` y cuándo `public`?
3. Analiza el siguiente código e identifica problemas de encapsulación:
```java
public class Cuenta {
    public double saldo;
    public String titular;
}
```

---

## 2️⃣ EVIDENCIAS DE DESEMPEÑO (40%)

### 2.1 Ejercicio en Clase: Creación de Clases Básicas (15%)

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|----------------|-------------|------------------|---------------------|
| **Sintaxis de clase** | Crea clase con sintaxis perfecta y convenciones Java | Crea clase con sintaxis correcta | Crea clase con errores menores de sintaxis | No puede crear estructura básica de clase |
| **Definición de atributos** | Define atributos con tipos apropiados y nombres descriptivos | Define atributos correctamente | Define atributos con tipos o nombres inadecuados | No define atributos o lo hace incorrectamente |
| **Definición de métodos** | Crea métodos con firma correcta, parámetros y retorno apropiados | Crea métodos funcionales básicos | Crea métodos con errores en firma o lógica | No puede crear métodos funcionales |
| **Convenciones de código** | Usa camelCase, PascalCase, indentación perfecta | Sigue mayoría de convenciones | Ignora algunas convenciones importantes | No sigue convenciones de código |

**Actividad:** Crear clase `CuentaBancaria` con atributos (numeroCuenta, titular, saldo) y métodos (depositar, retirar, consultarSaldo)

**Tiempo:** 30 minutos

---

### 2.2 Taller Práctico: Instanciación de Objetos (15%)

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|----------------|-------------|------------------|---------------------|
| **Uso del operador new** | Instancia objetos correctamente con sintaxis adecuada | Instancia objetos correctamente | Instancia objetos con errores menores | No puede instanciar objetos |
| **Asignación de valores** | Asigna valores a atributos de forma apropiada | Asigna valores correctamente | Asigna valores con algunos errores | No puede asignar valores a atributos |
| **Invocación de métodos** | Invoca métodos correctamente con parámetros adecuados | Invoca métodos correctamente | Invoca métodos con errores ocasionales | No puede invocar métodos |
| **Múltiples instancias** | Crea y manipula múltiples objetos independientes | Crea múltiples objetos correctamente | Confunde estado entre objetos | No comprende independencia de objetos |

**Actividad:** Crear 3 objetos de tipo `Estudiante`, asignarles valores diferentes, e invocar sus métodos

**Tiempo:** 25 minutos

---

### 2.3 Ejercicio: Aplicación de Encapsulación (10%)

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|----------------|-------------|------------------|---------------------|
| **Atributos privados** | Declara todos los atributos como private apropiadamente | Declara atributos como private | Olvida declarar algunos atributos private | Deja atributos públicos incorrectamente |
| **Métodos de acceso** | Crea getters/setters completos y correctos | Crea métodos de acceso funcionales | Crea métodos de acceso con errores | No implementa métodos de acceso |
| **Validaciones** | Incluye validaciones en setters apropiadamente | Incluye algunas validaciones básicas | Incluye validaciones insuficientes | No incluye validaciones |

**Actividad:** Refactorizar clase para aplicar encapsulación completa

**Tiempo:** 20 minutos

---

## 3️⃣ EVIDENCIAS DE PRODUCTO (30%)

### 3.1 Proyecto: Sistema de Gestión Simple (20%)

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|----------------|-------------|------------------|---------------------|
| **Diseño de clases** | Diseña mínimo 2 clases con estructura lógica y coherente | Diseña clases funcionales adecuadas | Diseña clases básicas funcionales | Clases mal diseñadas o no funcionales |
| **Implementación** | Código limpio, comentado, funcional y sin errores | Código funcional con buena estructura | Código funcional con errores menores | Código no funcional o con muchos errores |
| **Encapsulación** | Aplica encapsulación completa en todas las clases | Aplica encapsulación en mayoría de casos | Aplica encapsulación parcialmente | No aplica encapsulación |
| **Funcionalidad** | Sistema completo con todas las operaciones solicitadas | Sistema funcional con operaciones principales | Sistema con funcionalidad básica | Sistema incompleto o no funcional |
| **Pruebas** | Incluye clase main con pruebas exhaustivas de todos los casos | Incluye pruebas de casos principales | Incluye pruebas mínimas | No incluye pruebas o no funcionan |

**Entregable:**
- Crear sistema con 2 clases relacionadas (ej: `Tienda` y `Producto`)
- Implementar operaciones CRUD básicas
- Clase main con menú y pruebas
- Código comentado y documentado

**Opciones de proyecto:**
1. Sistema de Biblioteca (Biblioteca, Libro)
2. Sistema de Tienda (Tienda, Producto)
3. Sistema de Vehículos (Garaje, Vehiculo)
4. Sistema de Estudiantes (Curso, Estudiante)

---

### 3.2 Documentación del Código (10%)

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|----------------|-------------|------------------|---------------------|
| **Comentarios Javadoc** | Todas las clases y métodos públicos documentados con Javadoc completo | Mayoría de elementos documentados | Documentación básica presente | Sin documentación o insuficiente |
| **Comentarios explicativos** | Código con comentarios claros en lógica compleja | Comentarios presentes y útiles | Comentarios básicos | Sin comentarios o irrelevantes |
| **README del proyecto** | README completo con descripción, uso, ejemplos | README con información básica completa | README mínimo presente | Sin README |

**Entregable:**
- Comentarios Javadoc en clases y métodos
- Comentarios explicativos en código complejo
- Archivo README.md explicando el proyecto

---

## 📋 Formato de Entrega

### Archivos Requeridos
```
semana-02-entrega/
├── README.md (descripción del proyecto)
├── src/
│   ├── Clase1.java
│   ├── Clase2.java
│   └── Main.java (clase de prueba)
└── documentacion/
    └── analisis.md (opcional: análisis del diseño)
```

### Información de Entrega
- **Fecha límite:** [Definir según calendario]
- **Método:** Repositorio GitHub (proyecto estructurado y funcional)
- **Nombre del repositorio:** `apellido-nombre-semana02`
- **Requisitos:**
  - ❌ No se aceptan archivos sueltos (.zip, .rar)
  - ✅ Solo repositorios con estructura de proyecto completa
  - ✅ Código compilable y ejecutable
  - ✅ README.md con instrucciones claras

---

## 🎯 Criterios de Aprobación

| Calificación | Rango | Descripción |
|--------------|-------|-------------|
| **Excelente** | 4.6 - 5.0 | Dominio completo de conceptos y aplicación impecable |
| **Bueno** | 4.0 - 4.5 | Buen entendimiento con aplicación correcta |
| **Aceptable** | 3.5 - 3.9 | Comprensión adecuada con implementación funcional |
| **Suficiente** | 3.0 - 3.4 | Comprensión básica y código funcional mínimo |
| **Insuficiente** | < 3.0 | No alcanza los objetivos mínimos |

---

## 📝 Retroalimentación

La retroalimentación se proporcionará:
- ✅ **Inmediata:** Durante ejercicios en clase
- ✅ **Formativa:** Al revisar talleres y ejercicios
- ✅ **Sumativa:** Al calificar el proyecto final con rúbrica detallada

---

## ⚠️ Aspectos Importantes

1. **Originalidad:** El código debe ser propio. Trabajos copiados tendrán calificación de 0.0
2. **Compilación:** El código debe compilar sin errores. Código que no compile tendrá máximo 2.0
3. **Funcionalidad:** El código debe ejecutar las funciones requeridas
4. **Puntualidad:** Entregas tardías tendrán penalización del 10% por día
5. **Formato:** Seguir las convenciones de código Java

---

## 📞 Consultas sobre Evaluación

Si tienes dudas sobre la rúbrica o los criterios de evaluación:
- Consulta durante la sesión de clase
- Revisa los ejemplos en el material de práctica
- Solicita retroalimentación sobre borradores antes de la entrega final

---

**Recuerda:** Esta rúbrica es tu guía para el éxito. Úsala para autoevaluar tu trabajo antes de entregarlo.

*Bootcamp POO Java - SENA 2025*
