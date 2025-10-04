# Ejercicio 02: Primera Clase

## 🎯 Objetivo

Crear tu primera clase completa desde cero, definiendo atributos, métodos y trabajando con objetos.

---

## 📋 Descripción del Problema

Crea una clase `Persona` que modele a una persona con sus datos básicos y comportamientos.

### Atributos Requeridos

- `nombre` (String)
- `edad` (int)
- `identificacion` (String)
- `profesion` (String)

### Métodos Requeridos

1. `presentarse()` - Muestra un saludo con el nombre
2. `cumplirAnios()` - Incrementa la edad en 1
3. `cambiarProfesion(String nuevaProfesion)` - Cambia la profesión
4. `esMayorDeEdad()` - Retorna true si edad >= 18
5. `mostrarInformacion()` - Muestra todos los datos

---

## 💻 Plantilla de Código

```java
public class Persona {
    // TODO: Define los atributos
    
    // TODO: Implementa los métodos
}

public class PruebaPersona {
    public static void main(String[] args) {
        // TODO: Crea objetos y prueba los métodos
    }
}
```

---

## 📤 Salida Esperada

```
Hola, soy Juan Pérez
════════════════════════
Nombre: Juan Pérez
Edad: 25 años
Identificación: 1234567890
Profesión: Programador
Mayor de edad: Sí
════════════════════════

¡Feliz cumpleaños Juan Pérez!
Ahora tienes 26 años

Juan Pérez ha cambiado de profesión a Ingeniero de Software
```

---

## ✅ Criterios de Aceptación

- [ ] Clase `Persona` con 4 atributos
- [ ] 5 métodos implementados correctamente
- [ ] Clase de prueba que crea al menos 2 objetos
- [ ] Código compila y ejecuta sin errores

---

**Tiempo estimado:** 45 minutos  
**Dificultad:** ⭐⭐ Intermedio
