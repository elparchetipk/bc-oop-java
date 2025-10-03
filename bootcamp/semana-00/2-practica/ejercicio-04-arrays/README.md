# Ejercicio 04: Arrays (Arreglos)

## 🎯 Objetivos
- Declarar e inicializar arrays
- Recorrer arrays con diferentes bucles
- Realizar operaciones comunes (buscar, ordenar, estadísticas)
- Manipular arrays unidimensionales
- Aplicar algoritmos básicos

---

## 📋 Requisitos

### Parte 1: OperacionesArrays.java
Programa que demuestra operaciones básicas con arrays.

### Parte 2: EstadisticasNotas.java
Sistema de análisis estadístico de calificaciones.

### Parte 3: BusquedaOrdenamiento.java
Implementación de algoritmos de búsqueda y ordenamiento.

---

## 📝 Instrucciones Detalladas

### Parte 1: OperacionesArrays.java

Crea un programa que realice operaciones básicas:

**Requisitos**:
- [ ] Declarar array de enteros con valores iniciales
- [ ] Imprimir el array completo
- [ ] Calcular y mostrar suma de elementos
- [ ] Encontrar el máximo y mínimo
- [ ] Calcular el promedio
- [ ] Contar elementos pares e impares
- [ ] Invertir el array

**Salida esperada**:
```
=== OPERACIONES CON ARRAYS ===

Array original: [10, 25, 3, 47, 12, 8, 36, 5]

Suma total: 146
Promedio: 18.25
Máximo: 47
Mínimo: 3
Números pares: 5
Números impares: 3

Array invertido: [5, 36, 8, 12, 47, 3, 25, 10]
```

### Parte 2: EstadisticasNotas.java

Crea un sistema de análisis de calificaciones:

**Requisitos**:
- [ ] Solicitar cantidad de estudiantes
- [ ] Pedir calificaciones (validar 0-100)
- [ ] Almacenar en array
- [ ] Calcular estadísticas:
  - Promedio general
  - Nota máxima y mínima
  - Cantidad de aprobados/reprobados
  - Distribución por letras (A, B, C, D, F)
- [ ] Mostrar todas las calificaciones ordenadas

**Salida esperada**:
```
=== SISTEMA DE ESTADÍSTICAS DE NOTAS ===

¿Cuántos estudiantes? 5

Calificación estudiante 1: 85
Calificación estudiante 2: 92
Calificación estudiante 3: 78
Calificación estudiante 4: 65
Calificación estudiante 5: 88

--- ESTADÍSTICAS ---
Promedio general: 81.6
Nota máxima: 92
Nota mínima: 65
Aprobados (≥60): 5
Reprobados (<60): 0

--- DISTRIBUCIÓN ---
A (90-100): 1 estudiante(s)
B (80-89): 2 estudiante(s)
C (70-79): 1 estudiante(s)
D (60-69): 1 estudiante(s)
F (0-59): 0 estudiante(s)

Calificaciones ordenadas: [65, 78, 85, 88, 92]
```

### Parte 3: BusquedaOrdenamiento.java

Implementa algoritmos de búsqueda y ordenamiento:

**Requisitos**:
- [ ] Array de números aleatorios o ingresados
- [ ] Búsqueda lineal (secuencial)
- [ ] Ordenamiento burbuja (Bubble Sort)
- [ ] Mostrar array antes y después
- [ ] Contar comparaciones realizadas

**Salida esperada**:
```
=== BÚSQUEDA Y ORDENAMIENTO ===

Array original: [64, 34, 25, 12, 22, 11, 90]

1. BÚSQUEDA LINEAL
Buscar: 22
Resultado: Encontrado en posición 4
Comparaciones realizadas: 5

2. ORDENAMIENTO BURBUJA
Ordenando...
Array ordenado: [11, 12, 22, 25, 34, 64, 90]
Intercambios realizados: 8
```

---

## ✅ Criterios de Éxito

### OperacionesArrays.java
- [ ] Declara e inicializa array correctamente
- [ ] Calcula suma, promedio, max y min
- [ ] Cuenta pares e impares
- [ ] Invierte el array correctamente

### EstadisticasNotas.java
- [ ] Valida todas las calificaciones (0-100)
- [ ] Calcula estadísticas correctamente
- [ ] Muestra distribución por letras
- [ ] Ordena array de calificaciones

### BusquedaOrdenamiento.java
- [ ] Implementa búsqueda lineal
- [ ] Implementa ordenamiento burbuja
- [ ] Cuenta operaciones realizadas
- [ ] Muestra arrays antes y después

---

## 🔍 Conceptos Clave

### Declaración e Inicialización

```java
// Declaración y creación
int[] numeros = new int[5];

// Inicialización directa
int[] valores = {10, 20, 30, 40, 50};

// Tamaño del array
int longitud = valores.length;  // 5
```

### Recorrido de Arrays

```java
int[] array = {1, 2, 3, 4, 5};

// For tradicional
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}

// For-each
for (int elemento : array) {
    System.out.println(elemento);
}
```

### Operaciones Comunes

```java
// Suma
int suma = 0;
for (int num : array) {
    suma += num;
}

// Promedio
double promedio = (double) suma / array.length;

// Máximo
int max = array[0];
for (int num : array) {
    if (num > max) max = num;
}

// Búsqueda
boolean encontrado = false;
for (int i = 0; i < array.length; i++) {
    if (array[i] == buscar) {
        encontrado = true;
        break;
    }
}
```

### Ordenamiento Burbuja

```java
for (int i = 0; i < array.length - 1; i++) {
    for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
            // Intercambiar
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}
```

---

## 🧪 Pruebas y Validación

### OperacionesArrays.java

Verifica con:
- Array: {10, 25, 3, 47, 12, 8, 36, 5}
- Suma esperada: 146
- Promedio: 18.25
- Max: 47, Min: 3
- Pares: 5, Impares: 3

### EstadisticasNotas.java

Prueba con:
- 3 estudiantes: 90, 75, 85
- Promedio: 83.33
- Aprobados: 3
- Distribución: 1-A, 1-B, 1-C

### BusquedaOrdenamiento.java

Verifica:
- Búsqueda de elemento existente
- Búsqueda de elemento inexistente
- Ordenamiento correcto (menor a mayor)
- Array vacío o con un elemento

---

## 🎨 Ejercicios Adicionales

### Nivel 1: Básico
1. Agrega operación para calcular mediana
2. Implementa búsqueda de todos los índices de un valor

### Nivel 2: Intermedio
3. Crea método para eliminar duplicados
4. Implementa ordenamiento por selección
5. Array bidimensional: matriz y operaciones

### Nivel 3: Avanzado
6. Implementa búsqueda binaria (array ordenado)
7. Sistema de votación con conteo en array
8. Merge de dos arrays ordenados
9. Histograma de frecuencias

---

## 🐛 Errores Comunes

### Error 1: ArrayIndexOutOfBoundsException
```java
// ❌ Mal
int[] array = new int[5];
array[5] = 10;  // Error: índice 5 no existe

// ✅ Bien
array[4] = 10;  // Último índice es length-1
```

### Error 2: NullPointerException
```java
// ❌ Mal
int[] array;
array[0] = 10;  // Error: array no inicializado

// ✅ Bien
int[] array = new int[5];
array[0] = 10;
```

### Error 3: División Entera
```java
// ❌ Mal
int suma = 100;
int promedio = suma / 3;  // 33 (pierde decimales)

// ✅ Bien
double promedio = (double) suma / 3;  // 33.333...
```

### Error 4: Modificación Durante Recorrido
```java
// ❌ Mal - puede causar problemas
for (int num : array) {
    num = num * 2;  // No modifica el array
}

// ✅ Bien
for (int i = 0; i < array.length; i++) {
    array[i] = array[i] * 2;
}
```

---

## 🏆 Reto Final

Crea `GestorInventario.java` que:

1. Array de productos (nombres) y otro de cantidades
2. Menú con opciones:
   - Agregar producto
   - Buscar producto
   - Actualizar cantidad
   - Eliminar producto
   - Mostrar inventario completo
   - Producto con mayor/menor stock
3. Validaciones apropiadas
4. Uso de arrays paralelos

**Conceptos**: Arrays, búsqueda, validación, menú, métodos

---

## 📚 Recursos Adicionales

### Clase Arrays (java.util.Arrays)

```java
import java.util.Arrays;

int[] numeros = {5, 2, 8, 1, 9};

// Ordenar
Arrays.sort(numeros);

// Buscar (array debe estar ordenado)
int indice = Arrays.binarySearch(numeros, 5);

// Llenar
Arrays.fill(numeros, 0);

// Copiar
int[] copia = Arrays.copyOf(numeros, numeros.length);

// Comparar
boolean iguales = Arrays.equals(array1, array2);

// Imprimir
System.out.println(Arrays.toString(numeros));
```

---

## 📊 Autoevaluación

- [ ] Declaro e inicializo arrays correctamente
- [ ] Recorro arrays con for y for-each
- [ ] Calculo estadísticas (suma, promedio, max, min)
- [ ] Implemento búsqueda lineal
- [ ] Implemento ordenamiento burbuja
- [ ] Manejo correctamente los índices
- [ ] Valido límites del array

**Escala**:
- 7/7: ¡Excelente! Dominas arrays completamente
- 5-6/7: Muy bien, refuerza conceptos pendientes
- <5/7: Practica más con arrays

---

## 💡 Consejos

1. **Índices desde 0**: El primer elemento es array[0]
2. **Último índice**: array.length - 1
3. **For-each para leer**: Usa cuando solo leas valores
4. **For tradicional para modificar**: Necesitas el índice
5. **Valida límites**: Siempre verifica i < array.length
6. **Arrays.toString()**: Para depurar/imprimir rápido
7. **Inicialización**: Arrays numéricos empiezan en 0

---

**¡Domina los arrays y tendrás el poder de manejar colecciones de datos! 📊**

[⬅️ Anterior: Ejercicio 03](../ejercicio-03-control/README.md) | [➡️ Siguiente: Ejercicio 05](../ejercicio-05-metodos/README.md)
