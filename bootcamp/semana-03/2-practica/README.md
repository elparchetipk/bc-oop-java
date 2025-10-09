# Ejercicios Prácticos - Semana 3

## Encapsulación y Constructores

---

## 📋 Descripción General

Esta carpeta contiene **6 ejercicios prácticos** diseñados para aplicar los conceptos de encapsulación, modificadores de
acceso, getters/setters y constructores.

---

## 🎯 Objetivos de los Ejercicios

Al completar estos ejercicios, podrás:

1. ✅ Comparar código sin encapsulación vs con encapsulación
2. ✅ Implementar getters y setters con validación
3. ✅ Crear y usar diferentes tipos de constructores
4. ✅ Aplicar sobrecarga de constructores con `this()`
5. ✅ Validar datos en constructores y setters
6. ✅ Desarrollar una clase completamente encapsulada

---

## 📂 Estructura de Ejercicios

```
2-practica/
├── README.md (este archivo)
├── ejercicio-01-comparacion-encapsulacion/
├── ejercicio-02-getters-setters/
├── ejercicio-03-constructores-basicos/
├── ejercicio-04-sobrecarga-constructores/
├── ejercicio-05-validacion/
└── ejercicio-06-proyecto-integrador/
```

---

## 📝 Lista de Ejercicios

### Ejercicio 1: Comparación - Con y Sin Encapsulación

**Dificultad**: ⭐ Básico  
**Tiempo estimado**: 20 minutos  
**Objetivo**: Comparar el comportamiento de una clase con y sin encapsulación

**Archivos**:

- `CuentaBancariaSinEncapsulacion.java`
- `CuentaBancariaConEncapsulacion.java`
- `DemostracionEncapsulacion.java`
- `README.md`

---

### Ejercicio 2: Getters y Setters

**Dificultad**: ⭐⭐ Básico-Intermedio  
**Tiempo estimado**: 30 minutos  
**Objetivo**: Implementar correctamente getters y setters con validación

**Archivos**:

- `Producto.java`
- `PruebaProducto.java`
- `README.md`

---

### Ejercicio 3: Constructores Básicos

**Dificultad**: ⭐⭐ Básico-Intermedio  
**Tiempo estimado**: 30 minutos  
**Objetivo**: Crear y usar constructores con y sin parámetros

**Archivos**:

- `Empleado.java`
- `PruebaEmpleado.java`
- `README.md`

---

### Ejercicio 4: Sobrecarga de Constructores

**Dificultad**: ⭐⭐⭐ Intermedio  
**Tiempo estimado**: 35 minutos  
**Objetivo**: Aplicar sobrecarga de constructores usando `this()`

**Archivos**:

- `Rectangulo.java`
- `PruebaRectangulo.java`
- `README.md`

---

### Ejercicio 5: Validación en Constructores y Setters

**Dificultad**: ⭐⭐⭐ Intermedio  
**Tiempo estimado**: 40 minutos  
**Objetivo**: Implementar validación robusta de datos

**Archivos**:

- `Estudiante.java`
- `PruebaEstudiante.java`
- `README.md`

---

### Ejercicio 6: Proyecto Integrador

**Dificultad**: ⭐⭐⭐⭐ Intermedio-Avanzado  
**Tiempo estimado**: 60 minutos  
**Objetivo**: Aplicar todos los conceptos en un proyecto completo

**Archivos**:

- `Vehiculo.java`
- `SistemaVehiculos.java`
- `README.md`

---

## 🚀 Cómo Usar estos Ejercicios

### Opción 1: IntelliJ IDEA

1. Abre IntelliJ IDEA
2. Navega a la carpeta del ejercicio
3. Click derecho en la carpeta → `Mark Directory as` → `Sources Root`
4. Abre los archivos `.java`
5. Ejecuta el archivo principal (el que tiene `main()`)

### Opción 2: Terminal

```bash
# Navegar a la carpeta del ejercicio
cd ejercicio-XX-nombre/

# Compilar
javac *.java

# Ejecutar (cambiar NombreClase por la clase con main)
java NombreClase
```

---

## 📊 Progresión Recomendada

```
Ejercicio 1 (Básico)
    ↓
Ejercicio 2 (Getters/Setters)
    ↓
Ejercicio 3 (Constructores)
    ↓
Ejercicio 4 (Sobrecarga)
    ↓
Ejercicio 5 (Validación)
    ↓
Ejercicio 6 (Integrador) ⭐
```

**Recomendación**: Realiza los ejercicios en orden, cada uno construye sobre conceptos del anterior.

---

## ✅ Checklist de Verificación

Antes de considerar un ejercicio completo, verifica:

- [ ] El código compila sin errores
- [ ] Todos los atributos son privados
- [ ] Los getters/setters siguen las convenciones de Java
- [ ] Hay validación en setters y constructores
- [ ] El código está comentado apropiadamente
- [ ] Has probado con diferentes casos (válidos e inválidos)
- [ ] El programa produce la salida esperada
- [ ] No hay warnings del compilador

---

## 🎓 Conceptos por Ejercicio

| Ejercicio | Encapsulación | Getters/Setters | Constructores | Validación | Sobrecarga |
|-----------|---------------|-----------------|---------------|------------|------------|
| 1         | ✅✅✅           | ✅               |               |            |            |
| 2         | ✅             | ✅✅✅             | ✅             | ✅✅         |            |
| 3         | ✅             | ✅               | ✅✅✅           | ✅          |            |
| 4         | ✅             | ✅               | ✅✅            | ✅          | ✅✅✅        |
| 5         | ✅             | ✅✅              | ✅✅            | ✅✅✅        | ✅          |
| 6         | ✅✅✅           | ✅✅✅             | ✅✅✅           | ✅✅✅        | ✅✅✅        |

---

## 💡 Consejos Generales

### Para Todos los Ejercicios

1. **Lee el README de cada ejercicio** antes de empezar
2. **Comenta tu código** para explicar la lógica
3. **Prueba con valores válidos e inválidos**
4. **Usa nombres descriptivos** para variables y métodos
5. **Formatea tu código** (Ctrl + Alt + L en IntelliJ)

### Errores Comunes a Evitar

❌ Olvidar hacer atributos privados  
❌ No validar datos en setters  
❌ Confundir getter/setter de boolean (`isActivo()` no `getActivo()`)  
❌ No usar `this` cuando el parámetro tiene el mismo nombre  
❌ Olvidar que `this()` debe ser la primera línea del constructor

---

## 🔧 Solución de Problemas

### Error: "Cannot find symbol"

- Verifica que el nombre de la clase coincida con el nombre del archivo
- Asegúrate de que los métodos estén correctamente declarados

### Error: "Constructor already defined"

- Dos constructores no pueden tener exactamente los mismos parámetros
- Verifica la firma de tus constructores

### Error: "Call to this must be first statement"

- `this()` debe ser la primera línea en el constructor

### Error: "Private access"

- No puedes acceder a atributos privados desde fuera de la clase
- Usa getters/setters en su lugar

---

## 📚 Recursos de Apoyo

- **Teoría**: Revisa `../1-teoria/` para conceptos
- **Glosario**: Consulta `../3-recursos/glosario.md` para términos
- **Documentación Java**: [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)

---

## 🎯 Evaluación

Cada ejercicio será evaluado considerando:

| Criterio                   | Peso |
|----------------------------|------|
| **Funcionalidad**          | 40%  |
| **Encapsulación correcta** | 20%  |
| **Validación de datos**    | 20%  |
| **Calidad del código**     | 10%  |
| **Documentación**          | 10%  |

---

## 📞 ¿Necesitas Ayuda?

1. Revisa el README del ejercicio específico
2. Consulta la teoría relacionada en `1-teoria/`
3. Revisa el glosario para términos confusos
4. Pregunta al instructor durante la clase
5. Discute con tus compañeros (pero no copies código)

---

## 🏆 Desafíos Adicionales (Opcional)

Si terminas antes y quieres practicar más:

1. **Mejora las validaciones** con reglas más complejas
2. **Agrega más métodos de negocio** a las clases
3. **Implementa toString()** personalizado en todas las clases
4. **Crea casos de prueba** para validar diferentes escenarios
5. **Documenta con Javadoc** todos los métodos públicos

---

**¡Éxito en tus ejercicios!** 🚀

---

**Siguiente**: [Ejercicio 1 - Comparación Encapsulación](./ejercicio-01-comparacion-encapsulacion/)

