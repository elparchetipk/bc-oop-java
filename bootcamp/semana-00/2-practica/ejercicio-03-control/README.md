# Ejercicio 03: Estructuras de Control

## 🎯 Objetivos
- Implementar estructuras condicionales (if-else, switch)
- Utilizar bucles (for, while, do-while)
- Combinar estructuras de control
- Validar entrada de usuario
- Crear menús interactivos

---

## 📋 Requisitos

### Parte 1: EstructurasDecision.java
Programa que evalúa calificaciones y determina categorías.

### Parte 2: Bucles.java
Programa que demuestra el uso de for, while y do-while.

### Parte 3: MenuInteractivo.java
Sistema de menú con opciones múltiples y validación.

---

## 📝 Instrucciones Detalladas

### Parte 1: EstructurasDecision.java

Crea un programa que evalúe calificaciones:

**Requisitos**:
- [ ] Solicitar una calificación (0-100)
- [ ] Validar que esté en el rango correcto
- [ ] Usar if-else para determinar la letra (A, B, C, D, F)
- [ ] Usar switch para mostrar un mensaje según la letra
- [ ] Indicar si aprobó o reprobó

**Criterios de calificación**:
- A: 90-100 (Excelente)
- B: 80-89 (Muy bien)
- C: 70-79 (Bien)
- D: 60-69 (Suficiente)
- F: 0-59 (Insuficiente - Reprobado)

**Salida esperada**:
```
=== EVALUADOR DE CALIFICACIONES ===

Ingresa tu calificación (0-100): 85

Tu calificación: 85
Letra: B
Estado: Muy bien
Resultado: ¡APROBADO!
```

### Parte 2: Bucles.java

Crea un programa que demuestre diferentes bucles:

**Requisitos**:
- [ ] Usar for para imprimir tabla de multiplicar
- [ ] Usar while para calcular factorial
- [ ] Usar do-while para validar entrada
- [ ] Implementar búsqueda con break
- [ ] Filtrar con continue

**Funcionalidades**:
1. **Tabla de multiplicar** (for): Usuario elige número, se muestra tabla del 1-10
2. **Factorial** (while): Calcular factorial de un número
3. **Validación** (do-while): Pedir número entre 1-10 hasta que sea válido
4. **Búsqueda** (for + break): Buscar número en array y salir al encontrar
5. **Filtro** (for + continue): Imprimir solo números pares

**Salida esperada**:
```
=== DEMOSTRACIÓN DE BUCLES ===

1. TABLA DE MULTIPLICAR (for)
Número: 5
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50

2. FACTORIAL (while)
Número: 5
5! = 120

3. VALIDACIÓN (do-while)
Ingresa número (1-10): 15
Error. Intenta de nuevo.
Ingresa número (1-10): 7
¡Correcto!

...
```

### Parte 3: MenuInteractivo.java

Crea un sistema de gestión de estudiantes con menú:

**Requisitos**:
- [ ] Menú con do-while que se repite hasta salir
- [ ] Switch para manejar opciones
- [ ] Almacenar datos en variables
- [ ] Validar todas las entradas
- [ ] Opción para salir

**Opciones del menú**:
1. Registrar nombre del estudiante
2. Registrar calificación
3. Mostrar información completa
4. Calcular promedio (si hay múltiples calificaciones)
5. Salir

**Salida esperada**:
```
=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===

1. Registrar nombre
2. Registrar calificación
3. Mostrar información
4. Calcular promedio
0. Salir

Opción: 1
Nombre del estudiante: Juan Pérez
¡Nombre registrado!

Opción: 2
Calificación: 85
¡Calificación registrada!

Opción: 3
--- INFORMACIÓN DEL ESTUDIANTE ---
Nombre: Juan Pérez
Calificación: 85.0

Opción: 0
¡Hasta luego!
```

---

## ✅ Criterios de Éxito

### EstructurasDecision.java
- [ ] Valida rango de calificación (0-100)
- [ ] Usa if-else para determinar letra
- [ ] Usa switch para mensajes
- [ ] Indica aprobado/reprobado correctamente

### Bucles.java
- [ ] Implementa los 3 tipos de bucles
- [ ] Usa break correctamente
- [ ] Usa continue correctamente
- [ ] Valida entradas del usuario

### MenuInteractivo.java
- [ ] Menú se repite hasta elegir salir
- [ ] Switch maneja todas las opciones
- [ ] Valida datos ingresados
- [ ] Maneja opción inválida
- [ ] Muestra información correctamente

---

## 🔍 Conceptos Clave

### Estructura if-else-if

```java
if (calificacion >= 90) {
    letra = 'A';
} else if (calificacion >= 80) {
    letra = 'B';
} else if (calificacion >= 70) {
    letra = 'C';
} else if (calificacion >= 60) {
    letra = 'D';
} else {
    letra = 'F';
}
```

### Switch-case

```java
switch (letra) {
    case 'A':
        System.out.println("Excelente");
        break;
    case 'B':
        System.out.println("Muy bien");
        break;
    // ...
    default:
        System.out.println("Desconocido");
}
```

### Bucles

```java
// FOR - iteraciones conocidas
for (int i = 1; i <= 10; i++) {
    System.out.println(numero + " x " + i + " = " + (numero * i));
}

// WHILE - iteraciones desconocidas
int factorial = 1;
int n = 5;
while (n > 0) {
    factorial *= n;
    n--;
}

// DO-WHILE - al menos una ejecución
int numero;
do {
    System.out.print("Número (1-10): ");
    numero = sc.nextInt();
} while (numero < 1 || numero > 10);
```

### Control de Flujo

```java
// BREAK - salir del bucle
for (int i = 0; i < array.length; i++) {
    if (array[i] == buscar) {
        System.out.println("Encontrado en posición " + i);
        break;  // Sale del bucle
    }
}

// CONTINUE - siguiente iteración
for (int i = 1; i <= 10; i++) {
    if (i % 2 != 0) {
        continue;  // Salta los impares
    }
    System.out.println(i);  // Solo imprime pares
}
```

---

## 🧪 Pruebas y Validación

### EstructurasDecision.java

Prueba con:
- Calificación 95 → A, Excelente, Aprobado
- Calificación 85 → B, Muy bien, Aprobado
- Calificación 55 → F, Insuficiente, Reprobado
- Calificación -5 → Error (fuera de rango)
- Calificación 105 → Error (fuera de rango)

### Bucles.java

Verifica:
- Tabla del 5 → 5, 10, 15, ..., 50
- Factorial de 5 → 120
- Factorial de 0 → 1
- Validación rechaza números fuera de rango

### MenuInteractivo.java

Prueba:
- Registrar nombre y luego mostrar información
- Registrar múltiples calificaciones
- Calcular promedio de varias calificaciones
- Intentar mostrar info sin registrar datos
- Opciones inválidas (números negativos, letras)

---

## 🎨 Ejercicios Adicionales

### Nivel 1: Básico
1. Agrega más categorías de calificación (A+, A-, B+, etc.)
2. En Bucles.java, agrega cálculo de potencia con bucle

### Nivel 2: Intermedio
3. Crea un juego de "Adivina el Número" con intentos limitados
4. Implementa validación de contraseña (mínimo 8 caracteres, etc.)

### Nivel 3: Avanzado
5. Sistema de menú con historial de calificaciones (array)
6. Calculadora completa con menú y todas las operaciones
7. Juego de piedra-papel-tijera contra la computadora

---

## 🐛 Errores Comunes

### Error 1: Bucle Infinito
```java
// ❌ Mal - bucle infinito
int i = 0;
while (i < 10) {
    System.out.println(i);
    // Falta: i++
}

// ✅ Bien
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

### Error 2: Olvidar break en switch
```java
// ❌ Mal - cae al siguiente case
switch (opcion) {
    case 1:
        System.out.println("Uno");
        // Falta break, ejecuta también case 2
    case 2:
        System.out.println("Dos");
}

// ✅ Bien
switch (opcion) {
    case 1:
        System.out.println("Uno");
        break;
    case 2:
        System.out.println("Dos");
        break;
}
```

### Error 3: Condiciones Incorrectas
```java
// ❌ Mal - rango incorrecto
if (nota >= 90 && nota <= 100) {
    // ...
} else if (nota >= 80) {  // Incluye 100, 101...
    // ...
}

// ✅ Bien
if (nota >= 90 && nota <= 100) {
    // ...
} else if (nota >= 80 && nota < 90) {
    // ...
}
```

---

## 🏆 Reto Final

Crea `SistemaVotacion.java` que:

1. Pida edad del votante
2. Valide si puede votar (>= 18 años)
3. Si puede votar:
   - Mostrar menú de candidatos (3 candidatos)
   - Registrar voto con switch
   - Preguntar si hay más votantes
4. Al finalizar:
   - Mostrar total de votos por candidato
   - Declarar ganador

**Conceptos a usar**: if-else, switch, do-while, contadores, validación

---

## 📊 Autoevaluación

- [ ] Uso if-else para decisiones múltiples
- [ ] Implemento switch correctamente
- [ ] Domino los 3 tipos de bucles
- [ ] Uso break y continue apropiadamente
- [ ] Valido todas las entradas del usuario
- [ ] Creo menús interactivos funcionales
- [ ] Combino estructuras de control

**Escala**:
- 7/7: ¡Excelente! Dominas las estructuras de control
- 5-6/7: Muy bien, practica los conceptos pendientes
- <5/7: Revisa teoría y practica más

---

## 💡 Consejos

1. **Siempre valida**: No asumas que el usuario ingresará datos correctos
2. **Usa break**: En switch y cuando encuentres lo que buscas
3. **Evita bucles infinitos**: Asegura que la condición cambiará
4. **Indenta bien**: Facilita leer estructuras anidadas
5. **Prueba casos límite**: 0, negativos, valores máximos
6. **Mensajes claros**: Usuario debe saber qué ingresar

---

**¡Domina las estructuras de control y tendrás el poder sobre el flujo de tus programas! 💪**

[⬅️ Anterior: Ejercicio 02](../ejercicio-02-variables/README.md) | [➡️ Siguiente: Ejercicio 04](../ejercicio-04-arrays/README.md)
