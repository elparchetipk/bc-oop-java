# Rúbrica de Evaluación - Semana 3
## Principios de Encapsulación y Constructores

---

## 📊 Distribución de la Evaluación

| Tipo de Evidencia | Peso | Instrumentos |
|-------------------|------|--------------|
| **Conocimiento** | 30% | Preguntas escritas, cuestionario |
| **Desempeño** | 40% | Implementación de clases, ejercicios prácticos |
| **Producto** | 30% | Proyecto con clase completamente encapsulada |
| **TOTAL** | 100% | |

**Nota mínima aprobatoria:** 3.0/5.0

---

## 1. EVIDENCIAS DE CONOCIMIENTO (30%)

### 1.1 Preguntas Escritas sobre Modificadores de Acceso (15%)

**Instrumento:** Evaluación escrita con preguntas conceptuales

**Preguntas tipo:**
1. Explique qué es la encapsulación y por qué es importante en POO
2. Compare los modificadores de acceso: public, private, protected y default
3. ¿Cuándo debe usar getters/setters y cuándo no?
4. Explique la diferencia entre un constructor y un método normal
5. ¿Qué es la sobrecarga de constructores y cuál es su ventaja?

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Comprensión de encapsulación** | Explica claramente el concepto, ventajas y aplicaciones | Explica concepto y algunas ventajas | Explica concepto básico | Confunde o no comprende encapsulación |
| **Modificadores de acceso** | Diferencia claramente los 4 modificadores con ejemplos | Diferencia los modificadores principales | Conoce public y private | No diferencia modificadores |
| **Getters/Setters** | Explica propósito, convenciones y cuándo usar/no usar | Explica propósito y convenciones | Conoce propósito básico | No comprende su uso |
| **Constructores** | Explica tipos, sobrecarga y uso de this() | Explica tipos de constructores | Conoce concepto básico | Confunde con métodos |

**Ponderación:** 15% de la nota final

---

### 1.2 Cuestionario sobre Buenas Prácticas (15%)

**Instrumento:** Cuestionario de 10 preguntas (opción múltiple)

**Temas evaluados:**
- Visibilidad apropiada para atributos
- Nomenclatura de getters/setters
- Validación de datos
- Uso de this y this()
- Buenas prácticas de encapsulación

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Respuestas correctas** | 9-10 correctas (90-100%) | 7-8 correctas (70-80%) | 6 correctas (60%) | <6 correctas (<60%) |
| **Comprensión de prácticas** | Identifica y justifica buenas prácticas | Identifica buenas prácticas | Reconoce prácticas básicas | No identifica prácticas |

**Ponderación:** 15% de la nota final

---

## 2. EVIDENCIAS DE DESEMPEÑO (40%)

### 2.1 Ejercicio: Implementar Getters y Setters (15%)

**Clase asignada:** `Producto` o según dominio del estudiante

**Requerimientos:**
- Atributos privados: código, nombre, precio, stock (mínimo 4)
- Getters para todos los atributos
- Setters con validación apropiada
- Programa de prueba que demuestre validación

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Atributos privados** | Todos los atributos privados con tipos correctos | Atributos privados correctos | Mayoría de atributos privados | Atributos públicos o mal declarados |
| **Getters** | Todos los getters bien implementados y documentados | Getters funcionales correctamente | Getters básicos funcionales | Getters con errores o faltantes |
| **Setters con validación** | Setters validan datos apropiadamente (rangos, nulls) | Setters con validación básica | Setters sin validación completa | No valida o errores graves |
| **Nomenclatura** | Sigue perfectamente convenciones Java | Sigue convenciones principales | Nomenclatura aceptable | No sigue convenciones |

**Ponderación:** 15% de la nota final

---

### 2.2 Ejercicio: Constructores Sobrecargados (15%)

**Clase asignada:** `Rectangulo`, `Empleado` o similar según dominio

**Requerimientos:**
- Constructor sin parámetros
- Constructor con parámetros parciales
- Constructor con todos los parámetros
- Uso de this() para llamar entre constructores
- Validación en constructores

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Sobrecarga** | 3+ constructores bien diseñados y funcionales | 2-3 constructores funcionales | 2 constructores básicos | 1 constructor o con errores |
| **Uso de this()** | Usa this() correctamente evitando duplicación | Usa this() en algunos constructores | Intenta usar this() | No usa this() o incorrectamente |
| **Validación** | Valida datos en todos los constructores | Valida en constructor principal | Validación básica | No valida o errores |
| **Inicialización** | Inicializa correctamente todos los atributos | Inicializa atributos principales | Inicializa algunos atributos | No inicializa correctamente |

**Ponderación:** 15% de la nota final

---

### 2.3 Taller: Clase Completamente Encapsulada (10%)

**Requerimientos:**
- Implementar clase según dominio asignado
- Todos los atributos privados
- Getters/setters apropiados con validación
- Múltiples constructores
- Mínimo 2 métodos de negocio
- Documentación Javadoc

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Encapsulación completa** | Perfectamente encapsulada, sin fugas de datos | Bien encapsulada | Encapsulada básicamente | Violaciones de encapsulación |
| **Constructores** | Múltiples constructores con validación | 2 constructores funcionales | 1 constructor funcional | Constructores con errores |
| **Métodos de negocio** | 3+ métodos útiles y bien diseñados | 2 métodos funcionales | 1-2 métodos básicos | Sin métodos de negocio |
| **Documentación** | Javadoc completo en clase y métodos públicos | Documentación de métodos principales | Documentación básica | Sin documentación |

**Ponderación:** 10% de la nota final

---

## 3. EVIDENCIAS DE PRODUCTO (30%)

### 3.1 Proyecto Integrador: Sistema de Gestión con Encapsulación (30%)

**Descripción:** Desarrollar un sistema de gestión (vehículos, productos, empleados, cuentas bancarias, etc.) aplicando todos los principios de encapsulación y constructores aprendidos.

**Requerimientos funcionales:**

1. **Clase principal completamente encapsulada** (10 puntos)
   - Mínimo 5 atributos privados
   - Getters/setters con validación robusta
   - 3+ constructores sobrecargados con this()
   - 3+ métodos de negocio
   - Documentación Javadoc completa

2. **Programa de demostración** (8 puntos)
   - Instanciación usando diferentes constructores
   - Demostración de validación funcionando
   - Uso de getters/setters
   - Llamada a métodos de negocio
   - Salida clara y formateada

3. **Archivo README.md** (6 puntos)
   - Descripción del sistema
   - Instrucciones de uso
   - Ejemplos de ejecución
   - Explicación de validaciones implementadas

4. **Calidad del código** (6 puntos)
   - Código limpio y organizado
   - Nombres descriptivos
   - Comentarios apropiados
   - Sin código duplicado
   - Formato consistente

#### Rúbrica Detallada del Proyecto

| Criterio | Excelente (5.0) | Bueno (4.0) | Suficiente (3.0) | Insuficiente (<3.0) |
|----------|-----------------|-------------|------------------|---------------------|
| **Encapsulación** | Perfecta: atributos privados, interfaz pública bien diseñada | Muy buena: encapsulación correcta | Adecuada: encapsulación básica | Deficiente: violaciones de encapsulación |
| **Constructores** | 3+ constructores con sobrecarga y validación completa | 2-3 constructores funcionales | 1-2 constructores básicos | Constructores incompletos o con errores |
| **Validación** | Validación robusta en todos los puntos de entrada | Validación en setters principales | Validación básica | Sin validación o incorrecta |
| **Métodos de negocio** | 3+ métodos útiles, bien diseñados y documentados | 2-3 métodos funcionales | 1-2 métodos básicos | Métodos insuficientes o no funcionales |
| **Documentación** | Javadoc completo + README detallado | Documentación de métodos + README básico | Documentación mínima | Sin documentación |
| **Calidad código** | Código excelente: limpio, organizado, sin duplicación | Código bueno: legible y funcional | Código aceptable: funcional con problemas menores | Código deficiente: difícil de leer o con errores |
| **Funcionalidad** | Programa ejecuta perfectamente sin errores | Programa funciona con pequeños problemas | Programa funciona parcialmente | Programa no ejecuta o errores graves |

**Ponderación:** 30% de la nota final

---

## 4. CRITERIOS TRANSVERSALES

Estos criterios aplican a todas las evidencias:

| Criterio | Descripción | Impacto |
|----------|-------------|---------|
| **Puntualidad** | Entrega en tiempo y forma | -10% por día de retraso (máx. 3 días) |
| **Originalidad** | Código propio, no copiado | Nota 0.0 si hay plagio detectado |
| **Compilación** | El código debe compilar sin errores | -20% si no compila |
| **Convenciones** | Seguir convenciones de nomenclatura Java | -5% si no sigue convenciones |

---

## 5. ESCALA DE CALIFICACIÓN

| Rango | Calificación | Descripción |
|-------|--------------|-------------|
| 4.5 - 5.0 | Excelente | Dominio completo de encapsulación y constructores |
| 4.0 - 4.4 | Sobresaliente | Muy buen manejo de los conceptos |
| 3.5 - 3.9 | Bueno | Buen entendimiento con pequeñas oportunidades de mejora |
| 3.0 - 3.4 | Aprobado | Comprende conceptos básicos, necesita refuerzo |
| < 3.0 | No aprobado | No alcanza los objetivos mínimos |

---

## 6. RETROALIMENTACIÓN

Cada estudiante recibirá retroalimentación detallada sobre:

1. **Fortalezas identificadas** en su código
2. **Áreas de mejora** específicas
3. **Recomendaciones** para fortalecer conceptos
4. **Ejemplos** de cómo mejorar su código

---

## 7. CRITERIOS DE RECUPERACIÓN

Si un estudiante no alcanza la nota mínima (3.0), puede:

1. **Actividad de recuperación:** Implementar clase adicional con todos los requisitos
2. **Plazo:** 1 semana después de recibir retroalimentación
3. **Nota máxima de recuperación:** 3.5
4. **Requisitos:** Corregir todos los errores identificados + ejercicio adicional

---

## 8. AUTOEVALUACIÓN DEL ESTUDIANTE

El estudiante debe evaluar su propio trabajo antes de entregar:

- [ ] ¿Todos mis atributos son privados?
- [ ] ¿Tengo getters y setters con validación apropiada?
- [ ] ¿Implementé múltiples constructores usando this()?
- [ ] ¿Validé los datos en constructores y setters?
- [ ] ¿Documenté mis métodos públicos con Javadoc?
- [ ] ¿Mi código compila sin errores?
- [ ] ¿Probé todos los métodos con diferentes casos?
- [ ] ¿Incluí un README con instrucciones?
- [ ] ¿Seguí las convenciones de nomenclatura Java?
- [ ] ¿Mi código es fácil de leer y entender?

---

## 9. RECURSOS DE APOYO PARA LA EVALUACIÓN

### Antes de la Evaluación
- Revisar material teórico en `1-teoria/`
- Practicar con ejercicios en `2-practica/`
- Consultar glosario en `3-recursos/glosario.md`
- Revisar ejemplos de código bien encapsulado

### Durante la Evaluación
- Documentación Java permitida
- Consultar material del curso
- Usar IDE con autocompletado

### Después de la Evaluación
- Revisar retroalimentación detallada
- Comparar con soluciones propuestas
- Asistir a sesión de revisión grupal

---

## 10. EJEMPLO DE PROYECTO EXCELENTE (5.0)

Un proyecto excelente debe incluir:

```java
/**
 * Clase que representa una cuenta bancaria con encapsulación completa.
 * 
 * @author [Nombre del Estudiante]
 * @version 1.0
 * @since 2025-10-10
 */
public class CuentaBancaria {
    // Atributos privados
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private boolean activa;
    
    // Constructores sobrecargados
    public CuentaBancaria() {
        this("000000", "Sin titular", 0.0);
    }
    
    public CuentaBancaria(String numeroCuenta, String titular) {
        this(numeroCuenta, titular, 0.0);
    }
    
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        setNumeroCuenta(numeroCuenta);
        setTitular(titular);
        setSaldo(saldoInicial);
        this.activa = true;
    }
    
    // Getters y Setters con validación
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) {
            throw new IllegalArgumentException("Número de cuenta no válido");
        }
        this.numeroCuenta = numeroCuenta;
    }
    
    // ... más getters/setters con validación
    
    // Métodos de negocio
    public boolean depositar(double monto) {
        if (monto <= 0) {
            return false;
        }
        this.saldo += monto;
        return true;
    }
    
    public boolean retirar(double monto) {
        if (monto <= 0 || monto > saldo) {
            return false;
        }
        this.saldo -= monto;
        return true;
    }
}
```

---

## 📞 Contacto y Soporte

Para dudas sobre la evaluación:
- Durante la clase: preguntar al instructor
- Foro del curso: publicar dudas generales
- Correo: para consultas individuales

---

**Fecha de publicación:** Semana 3  
**Fecha de entrega:** Según cronograma del curso  
**Peso en la nota final del bootcamp:** 10%

---

**¡Éxito en tu evaluación!** 🎯

