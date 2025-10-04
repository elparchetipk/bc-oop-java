# Ejercicio 01: Comparación de Paradigmas

## 🎯 Objetivo

Comprender la diferencia entre **programación estructurada** y **programación orientada a objetos** implementando el mismo problema con ambos enfoques.

---

## 📋 Descripción del Problema

Necesitas crear un programa que gestione información de **estudiantes** y calcule su promedio de notas.

### Datos del Estudiante

- Nombre
- Código de estudiante
- Nota 1
- Nota 2
- Nota 3

### Funcionalidades Requeridas

1. Calcular el promedio de las 3 notas
2. Determinar si el estudiante aprobó (promedio >= 3.0)
3. Mostrar información completa del estudiante

---

## 🔧 Tareas

### Parte 1: Enfoque Estructurado

Implementa la solución usando **programación estructurada**:
- Variables globales para almacenar datos
- Funciones para procesar datos
- Archivo: `GestionEstudianteEstructurado.java`

### Parte 2: Enfoque POO

Implementa la misma solución usando **POO**:
- Clase `Estudiante` con atributos
- Métodos dentro de la clase
- Archivo: `Estudiante.java` y `PruebaEstudiante.java`

### Parte 3: Análisis Comparativo

Responde en comentarios dentro de tu código:
1. ¿Cuál enfoque es más fácil de entender?
2. ¿Cuál permite manejar múltiples estudiantes más fácilmente?
3. ¿Cuál es más escalable para un sistema grande?

---

## 💻 Código de Inicio

### Enfoque Estructurado (plantilla)

```java
public class GestionEstudianteEstructurado {
    // Variables globales
    static String nombre;
    static String codigo;
    static double nota1;
    static double nota2;
    static double nota3;
    
    // TODO: Implementa las funciones
    static double calcularPromedio() {
        // Tu código aquí
    }
    
    static boolean aprobo() {
        // Tu código aquí
    }
    
    static void mostrarInformacion() {
        // Tu código aquí
    }
    
    public static void main(String[] args) {
        // TODO: Inicializa datos y prueba las funciones
    }
}
```

### Enfoque POO (plantilla)

```java
public class Estudiante {
    // TODO: Define atributos
    
    // TODO: Implementa métodos
    public double calcularPromedio() {
        // Tu código aquí
    }
    
    public boolean aprobo() {
        // Tu código aquí
    }
    
    public void mostrarInformacion() {
        // Tu código aquí
    }
}

public class PruebaEstudiante {
    public static void main(String[] args) {
        // TODO: Crea objeto y prueba
    }
}
```

---

## 📤 Salida Esperada

```
=== ENFOQUE ESTRUCTURADO ===
Nombre: Juan Pérez
Código: 2025001
Nota 1: 4.5
Nota 2: 4.0
Nota 3: 4.2
Promedio: 4.23
Estado: APROBADO

=== ENFOQUE POO ===
Nombre: Juan Pérez
Código: 2025001
Nota 1: 4.5
Nota 2: 4.0
Nota 3: 4.2
Promedio: 4.23
Estado: APROBADO
```

---

## ✅ Criterios de Aceptación

- [ ] Ambos enfoques producen el mismo resultado
- [ ] Código estructurado usa variables globales
- [ ] Código POO usa clase con atributos privados
- [ ] Código compila sin errores
- [ ] Incluye análisis comparativo en comentarios

---

## 🚀 Desafíos Adicionales

1. **Básico:** Agrega validación (notas entre 0 y 5)
2. **Intermedio:** Maneja 3 estudiantes con el enfoque estructurado (verás la dificultad)
3. **Avanzado:** Agrega método para comparar dos estudiantes (POO)

---

## 📚 Conceptos Clave

- Programación estructurada vs POO
- Variables globales vs atributos de instancia
- Funciones vs métodos
- Escalabilidad del código

---

**Tiempo estimado:** 30 minutos  
**Dificultad:** ⭐ Básico
