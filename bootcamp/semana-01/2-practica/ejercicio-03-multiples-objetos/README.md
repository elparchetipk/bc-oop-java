# Ejercicio 03: Múltiples Objetos

## 🎯 Objetivo

Trabajar con múltiples instancias de una clase y comprender que cada objeto mantiene su propio estado independiente.

---

## 📋 Descripción del Problema

Crea una clase `Libro` para gestionar una biblioteca personal. Debes poder crear múltiples libros y realizar operaciones sobre cada uno de forma independiente.

### Atributos Requeridos

- `titulo` (String)
- `autor` (String)
- `numeroPaginas` (int)
- `paginaActual` (int)
- `prestado` (boolean)

### Métodos Requeridos

1. `leerPaginas(int cantidad)` - Avanza páginas leídas
2. `prestar()` - Marca el libro como prestado
3. `devolver()` - Marca el libro como disponible
4. `estaPrestado()` - Retorna si está prestado
5. `porcentajeLeido()` - Retorna % del libro leído
6. `mostrarInformacion()` - Muestra todos los datos

---

## 📤 Salida Esperada

```
═══════════════════════════════
📖 Don Quijote de la Mancha
Autor: Miguel de Cervantes
Páginas: 863 (Actual: 0)
Progreso: 0.0%
Estado: Disponible
═══════════════════════════════

Leyendo 100 páginas de Don Quijote de la Mancha...
Progreso: 11.6%

Prestando Don Quijote de la Mancha...
✅ Libro prestado exitosamente

[Similar para otros libros...]
```

---

## ✅ Criterios de Aceptación

- [ ] Clase `Libro` con 5 atributos
- [ ] 6 métodos implementados
- [ ] Crear al menos 3 libros diferentes
- [ ] Demostrar independencia de objetos
- [ ] Validaciones (no leer más páginas de las disponibles)

---

**Tiempo estimado:** 45 minutos  
**Dificultad:** ⭐⭐ Intermedio
