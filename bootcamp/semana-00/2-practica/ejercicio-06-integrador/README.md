# Ejercicio 06: Proyecto Integrador - Sistema de Gestión Estudiantil

## 🎯 Objetivos
- Integrar todos los conceptos de la Semana 0
- Desarrollar un sistema completo y funcional
- Aplicar buenas prácticas de programación
- Crear código modular y bien documentado
- Demostrar dominio de Java fundamentals

---

## 📋 Descripción del Proyecto

Crear un **Sistema de Gestión de Estudiantes y Calificaciones** que permita:

1. Registrar estudiantes
2. Registrar calificaciones por materia
3. Calcular promedios y estadísticas
4. Buscar y consultar información
5. Generar reportes

---

## 🎨 Funcionalidades Requeridas

### Módulo 1: Gestión de Estudiantes
- [ ] Registrar nuevo estudiante (nombre, edad, ID)
- [ ] Buscar estudiante por ID o nombre
- [ ] Listar todos los estudiantes
- [ ] Actualizar información de estudiante
- [ ] Eliminar estudiante

### Módulo 2: Gestión de Calificaciones
- [ ] Registrar calificación (estudiante + materia + nota)
- [ ] Calcular promedio por estudiante
- [ ] Calcular promedio por materia
- [ ] Listar calificaciones de un estudiante
- [ ] Validar calificaciones (0-100)

### Módulo 3: Estadísticas y Reportes
- [ ] Mejor estudiante (mayor promedio)
- [ ] Estudiantes aprobados/reprobados
- [ ] Distribución de calificaciones
- [ ] Materia más difícil (menor promedio)
- [ ] Ranking de estudiantes

### Módulo 4: Menú Interactivo
- [ ] Menú principal bien organizado
- [ ] Submenús por módulo
- [ ] Validación de todas las entradas
- [ ] Mensajes claros y formateo apropiado

---

## 📝 Especificaciones Técnicas

### Estructura de Datos

```java
// Arrays paralelos para estudiantes
String[] nombresEstudiantes;
int[] edadesEstudiantes;
String[] idsEstudiantes;

// Matriz para calificaciones
// Filas: estudiantes, Columnas: materias
double[][] calificaciones;

// Array de nombres de materias
String[] nombresMaterias;

// Constantes
static final int MAX_ESTUDIANTES = 50;
static final int NUM_MATERIAS = 5;
static final double NOTA_APROBATORIA = 60.0;
```

### Métodos Requeridos (mínimo)

#### Gestión de Estudiantes
```java
public static int registrarEstudiante(...)
public static int buscarEstudiantePorID(...)
public static void listarEstudiantes(...)
public static boolean actualizarEstudiante(...)
public static boolean eliminarEstudiante(...)
```

#### Gestión de Calificaciones
```java
public static boolean registrarCalificacion(...)
public static double calcularPromedioEstudiante(...)
public static double calcularPromedioMateria(...)
public static void mostrarCalificacionesEstudiante(...)
public static boolean validarCalificacion(...)
```

#### Estadísticas
```java
public static int obtenerMejorEstudiante(...)
public static int contarAprobados(...)
public static int contarReprobados(...)
public static void mostrarRanking(...)
public static int obtenerMateriaMasDificil(...)
```

#### Utilidades
```java
public static void mostrarMenu(...)
public static void limpiarPantalla(...)
public static void pausar(...)
```

---

## ✅ Criterios de Evaluación

| Criterio | Peso | Descripción |
|----------|------|-------------|
| **Funcionalidad** | 35% | Todas las funciones operan correctamente |
| **Organización** | 20% | Código bien estructurado con métodos |
| **Validación** | 15% | Valida todas las entradas del usuario |
| **Documentación** | 15% | Comentarios y Javadoc apropiados |
| **Buenas Prácticas** | 15% | Nombres descriptivos, constantes, DRY |

### Escala de Calificación
- **Excelente (9-10)**: Cumple todos los requisitos + características adicionales
- **Muy Bien (8-8.9)**: Cumple todos los requisitos + buena calidad
- **Bien (7-7.9)**: Cumple requisitos mínimos + algunas mejoras
- **Suficiente (6-6.9)**: Cumple requisitos básicos
- **Insuficiente (<6)**: No cumple requisitos mínimos

---

## 🚀 Guía de Implementación

### Fase 1: Estructura Básica (30 min)
1. Crear clase principal
2. Declarar arrays y variables globales
3. Crear método main con menú básico
4. Implementar métodos para mostrar menú

### Fase 2: Gestión de Estudiantes (1 hora)
1. Método para registrar estudiante
2. Método para buscar estudiante
3. Método para listar estudiantes
4. Validaciones apropiadas

### Fase 3: Gestión de Calificaciones (1 hora)
1. Método para registrar calificación
2. Método para calcular promedios
3. Método para mostrar calificaciones
4. Validar notas (0-100)

### Fase 4: Estadísticas (45 min)
1. Método para mejor estudiante
2. Método para contar aprobados/reprobados
3. Método para ranking
4. Método para materia más difícil

### Fase 5: Pulido y Pruebas (45 min)
1. Mejorar mensajes y formato
2. Agregar validaciones faltantes
3. Documentar con Javadoc
4. Probar todas las funcionalidades

**Tiempo total estimado**: 4 horas

---

## 💡 Ejemplo de Salida

```
╔════════════════════════════════════════════╗
║   SISTEMA DE GESTIÓN ESTUDIANTIL          ║
╚════════════════════════════════════════════╝

=== MENÚ PRINCIPAL ===
1. Gestión de Estudiantes
2. Gestión de Calificaciones
3. Estadísticas y Reportes
4. Configuración
0. Salir

Opción: 1

=== GESTIÓN DE ESTUDIANTES ===
1. Registrar nuevo estudiante
2. Buscar estudiante
3. Listar todos los estudiantes
4. Actualizar estudiante
5. Eliminar estudiante
0. Volver

Opción: 1

--- REGISTRO DE ESTUDIANTE ---
Nombre: Juan Pérez
Edad: 20
ID: EST001

✓ Estudiante registrado exitosamente

Opción: 3

--- LISTA DE ESTUDIANTES ---
ID       | Nombre              | Edad | Promedio
---------|---------------------|------|----------
EST001   | Juan Pérez          | 20   | 85.5
EST002   | María García        | 19   | 92.0
EST003   | Carlos López        | 21   | 78.3

Total de estudiantes: 3
```

---

## 🎨 Características Adicionales (Opcionales)

### Nivel Básico (+1 punto)
- [ ] Sistema de búsqueda por nombre parcial
- [ ] Exportar reporte a archivo de texto
- [ ] Colores en consola (ANSI codes)

### Nivel Intermedio (+2 puntos)
- [ ] Ordenamiento de estudiantes por promedio
- [ ] Historial de calificaciones
- [ ] Sistema de asistencias

### Nivel Avanzado (+3 puntos)
- [ ] Persistencia de datos (guardar/cargar desde archivo)
- [ ] Gráfico de barras de promedios (ASCII art)
- [ ] Sistema de login con usuarios

---

## 🧪 Casos de Prueba

### Test 1: Registro de Estudiante
```
Input:
- Nombre: "Ana Torres"
- Edad: 19
- ID: "EST001"

Expected Output:
✓ Estudiante registrado exitosamente
```

### Test 2: Registro de Calificación
```
Input:
- ID Estudiante: "EST001"
- Materia: Matemáticas (0)
- Calificación: 85

Expected Output:
✓ Calificación registrada: Ana Torres - Matemáticas: 85.0
```

### Test 3: Cálculo de Promedio
```
Given:
- Estudiante con calificaciones: [85, 90, 78, 92, 88]

Expected Output:
Promedio: 86.6
```

### Test 4: Mejor Estudiante
```
Given:
- Est1: Promedio 85.5
- Est2: Promedio 92.0
- Est3: Promedio 78.3

Expected Output:
Mejor estudiante: María García (92.0)
```

---

## 🐛 Validaciones Requeridas

1. **Nombre**: No vacío, mínimo 3 caracteres, solo letras y espacios
2. **Edad**: Entre 15 y 100 años
3. **ID**: Único, formato válido (ej: EST001), no vacío
4. **Calificación**: Entre 0.0 y 100.0
5. **Índice de materia**: 0 a NUM_MATERIAS-1
6. **Capacidad**: No exceder MAX_ESTUDIANTES

---

## 📚 Conceptos Integrados

Este proyecto integra **TODOS** los conceptos de la Semana 0:

✅ **Variables y Tipos de Datos**: Diferentes tipos primitivos  
✅ **Operadores**: Aritméticos, relacionales, lógicos  
✅ **Estructuras de Control**: if-else, switch, for, while, do-while  
✅ **Arrays**: Unidimensionales y bidimensionales  
✅ **Métodos**: Con/sin parámetros, con/sin retorno, sobrecarga  
✅ **Validación**: Entrada de usuario  
✅ **Scanner**: Lectura de datos  
✅ **Buenas Prácticas**: Constantes, nombres descriptivos, modularización

---

## 🏆 Rúbrica Detallada

### Funcionalidad (35 puntos)
- [ ] Registro de estudiantes (5 pts)
- [ ] Búsqueda de estudiantes (5 pts)
- [ ] Registro de calificaciones (5 pts)
- [ ] Cálculo de promedios (5 pts)
- [ ] Estadísticas básicas (5 pts)
- [ ] Ranking y reportes (5 pts)
- [ ] Menú funcional (5 pts)

### Organización (20 puntos)
- [ ] Métodos bien definidos (8 pts)
- [ ] Código estructurado (6 pts)
- [ ] Sin código duplicado (6 pts)

### Validación (15 puntos)
- [ ] Validación de datos (10 pts)
- [ ] Manejo de errores (5 pts)

### Documentación (15 puntos)
- [ ] Javadoc en métodos (8 pts)
- [ ] Comentarios explicativos (7 pts)

### Buenas Prácticas (15 puntos)
- [ ] Nombres descriptivos (5 pts)
- [ ] Uso de constantes (5 pts)
- [ ] Formato y estilo (5 pts)

---

## 💡 Consejos Finales

1. **Empieza simple**: Implementa lo básico primero
2. **Prueba frecuentemente**: Después de cada método
3. **Modulariza**: Un método = una responsabilidad
4. **Valida todo**: No asumas datos correctos
5. **Comenta**: Explica la lógica compleja
6. **Refactoriza**: Mejora el código después de que funcione
7. **Sé organizado**: Agrupa métodos relacionados
8. **Usa constantes**: Para valores que no cambian
9. **Formatea bien**: Indentación consistente
10. **Pide ayuda**: Si te atascas más de 20 minutos

---

## 📊 Autoevaluación

Antes de entregar, verifica:

- [ ] Compila sin errores
- [ ] Todas las funcionalidades operan correctamente
- [ ] Validaciones funcionan
- [ ] No hay código duplicado
- [ ] Métodos están documentados
- [ ] Variables tienen nombres descriptivos
- [ ] Código está bien indentado
- [ ] Probé todos los casos de uso
- [ ] Manejo casos límite (arrays vacíos, etc.)
- [ ] El programa no se cuelga con entradas inválidas

---

## 🎓 Criterios de Excelencia

Un proyecto **excelente** (9-10) debe:

✨ Cumplir **todos** los requisitos funcionales  
✨ Tener código **limpio y organizado**  
✨ **Validar exhaustivamente** todas las entradas  
✨ Estar **completamente documentado**  
✨ Incluir al menos **2 características adicionales**  
✨ No tener **errores de ejecución**  
✨ Demostrar **creatividad** en la solución  
✨ Aplicar **todas** las buenas prácticas aprendidas

---

**¡Este es tu momento de brillar! Demuestra todo lo que has aprendido. 🌟**

**Recuerda**: Este proyecto representa la culminación de la Semana 0. Dale tu mejor esfuerzo y conviértelo en una pieza de portafolio.

---

[⬅️ Anterior: Ejercicio 05](../ejercicio-05-metodos/README.md) | [🏠 Volver a Semana 00](../../README.md)
