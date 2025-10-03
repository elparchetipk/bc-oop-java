# Ejercicio 01: Hola Mundo y Sintaxis Básica

## 🎯 Objetivos
- Escribir tu primer programa en Java
- Compilar y ejecutar código Java
- Entender la estructura básica de un programa
- Familiarizarte con comentarios y salida de datos

---

## 📋 Requisitos

### Parte 1: HolaMundo.java
Crear un programa que imprima "¡Hola, Mundo!" en la consola.

### Parte 2: MiPrimerPrograma.java
Crear un programa más completo que:
1. Imprima tu nombre
2. Imprima tu edad
3. Imprima tu ciudad
4. Use diferentes tipos de comentarios

---

## 📝 Instrucciones Detalladas

### Parte 1: HolaMundo.java

1. Crea un archivo llamado `HolaMundo.java`
2. Escribe el siguiente código:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

3. Compila el programa:
```bash
javac HolaMundo.java
```

4. Ejecuta el programa:
```bash
java HolaMundo
```

5. Deberías ver en consola:
```
¡Hola, Mundo!
```

### Parte 2: MiPrimerPrograma.java

Crea un programa que use comentarios y múltiples líneas de salida:

```java
/**
 * Este es mi primer programa Java completo
 * Autor: [Tu Nombre]
 * Fecha: [Fecha Actual]
 */
public class MiPrimerPrograma {
    
    public static void main(String[] args) {
        // Este es un comentario de una línea
        System.out.println("=== MI INFORMACIÓN ===");
        
        /* 
         * Este es un comentario
         * de múltiples líneas
         */
        System.out.println("Nombre: [Tu Nombre]");
        System.out.println("Edad: [Tu Edad]");
        System.out.println("Ciudad: [Tu Ciudad]");
        System.out.println("Ficha SENA: [Tu Ficha]");
        
        System.out.println("\n¡Primer programa completado!");
    }
}
```

---

## ✅ Criterios de Éxito

### HolaMundo.java
- [ ] El programa compila sin errores
- [ ] El programa imprime "¡Hola, Mundo!"
- [ ] El nombre de la clase coincide con el nombre del archivo

### MiPrimerPrograma.java
- [ ] El programa compila sin errores
- [ ] Incluye comentarios de documentación (/** */)
- [ ] Incluye comentarios de línea (//)
- [ ] Incluye comentarios multilínea (/* */)
- [ ] Imprime tu información personal
- [ ] Usa `System.out.println()` correctamente

---

## 🔍 Conceptos Clave

### Estructura de un Programa Java

```java
public class NombreClase {           // Declaración de clase
    public static void main(String[] args) {  // Método main
        // Código aquí
    }
}
```

### Elementos Importantes

1. **Clase**: Contenedor principal del código
   - Debe tener el mismo nombre que el archivo
   - Usa PascalCase: `MiClase`, `HolaMundo`

2. **Método main**: Punto de entrada del programa
   - Siempre es: `public static void main(String[] args)`
   - Es donde comienza la ejecución

3. **Comentarios**:
   - `//` para una línea
   - `/* */` para múltiples líneas
   - `/** */` para documentación (Javadoc)

4. **System.out.println()**: Imprime texto en consola
   - `println`: Imprime y salta de línea
   - `print`: Imprime sin saltar de línea

---

## 🧪 Pruebas y Validación

### Paso 1: Compilación
```bash
javac HolaMundo.java
javac MiPrimerPrograma.java
```

**Salida esperada**: Ningún mensaje (compilación exitosa)  
**Archivos generados**: `HolaMundo.class` y `MiPrimerPrograma.class`

### Paso 2: Ejecución
```bash
java HolaMundo
```

**Salida esperada**:
```
¡Hola, Mundo!
```

```bash
java MiPrimerPrograma
```

**Salida esperada**:
```
=== MI INFORMACIÓN ===
Nombre: Juan Pérez
Edad: 20
Ciudad: Bogotá
Ficha SENA: 1234567

¡Primer programa completado!
```

---

## 🎨 Ejercicios Adicionales

### Nivel 1: Básico
1. Modifica `HolaMundo.java` para saludar en inglés y español
2. Agrega más información personal a `MiPrimerPrograma.java` (correo, teléfono)

### Nivel 2: Intermedio
3. Crea `MiPresentacion.java` que:
   - Imprima tu nombre en arte ASCII
   - Muestre una línea de separación
   - Liste 3 hobbies

**Ejemplo de salida**:
```
     ┌─────────────────┐
     │   JUAN PÉREZ    │
     └─────────────────┘
================================
Mis hobbies:
1. Programación
2. Deportes
3. Música
```

### Nivel 3: Avanzado
4. Crea `InfoCompleta.java` que use caracteres especiales:
   - Tabulaciones (`\t`)
   - Saltos de línea (`\n`)
   - Comillas dobles (`\"`)

**Ejemplo**:
```java
System.out.println("Nombre:\t\tJuan Pérez");
System.out.println("Edad:\t\t20 años");
System.out.println("Frase:\t\t\"Aprender Java es genial\"");
```

---

## 🐛 Errores Comunes y Soluciones

### Error 1: "cannot find symbol"
```
error: cannot find symbol
System.out.println("Hola");
```
**Causa**: Escribiste mal `System` o `println`  
**Solución**: Verifica la ortografía exacta (Java es case-sensitive)

### Error 2: "class NombreClase is public, should be declared in a file named..."
```
error: class HolaMundo is public, should be declared in a file named HolaMundo.java
```
**Causa**: El nombre de la clase no coincide con el archivo  
**Solución**: Renombra el archivo para que coincida con la clase

### Error 3: Missing semicolon
```
error: ';' expected
System.out.println("Hola")
                          ^
```
**Causa**: Falta punto y coma al final de la línea  
**Solución**: Agrega `;` al final de cada sentencia

### Error 4: "Could not find or load main class"
```
Error: Could not find or load main class HolaMundo
```
**Causa**: Estás en el directorio incorrecto o el archivo .class no existe  
**Solución**: 
1. Asegúrate de estar en el directorio correcto
2. Compila primero con `javac`

---

## 📚 Recursos Adicionales

### Secuencias de Escape

| Secuencia | Efecto | Ejemplo |
|-----------|--------|---------|
| `\n` | Nueva línea | `"Hola\nMundo"` |
| `\t` | Tabulación | `"Nombre:\tJuan"` |
| `\"` | Comilla doble | `"Dijo: \"Hola\""` |
| `\\` | Barra invertida | `"C:\\Usuario"` |

### Comandos Útiles

```bash
# Compilar
javac NombreArchivo.java

# Ejecutar
java NombreClase

# Ver archivos generados
ls *.class

# Eliminar archivos .class
rm *.class
```

---

## 🏆 Reto Final

Crea un programa `ArtePalabras.java` que imprima tu nombre usando asteriscos.

**Ejemplo para "JAVA"**:
```
   *     *     *     *     *
   *     *    * *    *     *
   *     *   *   *   *     *
*  *  *     *******   *   *
 ** **     *     *     * *
```

---

## 📊 Autoevaluación

Marca lo que hayas logrado:

- [ ] Compilé exitosamente `HolaMundo.java`
- [ ] Ejecuté exitosamente `HolaMundo.java`
- [ ] Creé `MiPrimerPrograma.java` con mi información
- [ ] Usé los 3 tipos de comentarios
- [ ] Entiendo la diferencia entre `print` y `println`
- [ ] Experimenté con secuencias de escape
- [ ] Completé al menos un ejercicio adicional

**Calificación**:
- 7/7: ¡Excelente! Listo para el siguiente ejercicio
- 5-6/7: Buen trabajo, revisa los pendientes
- <5/7: Repasa los conceptos básicos

---

## 💡 Consejos

1. **Escribe el código tú mismo**: No copies y pegues, escribe cada carácter
2. **Experimenta**: Cambia mensajes, agrega líneas, ve qué pasa
3. **Lee los errores**: Los mensajes de error te dicen exactamente qué está mal
4. **Guarda frecuentemente**: Usa Ctrl+S en tu editor
5. **Compila a menudo**: No esperes a escribir todo el código

---

**¡Felicitaciones por dar tus primeros pasos en Java! 🎉**

[⬅️ Volver a Prácticas](../README.md) | [➡️ Siguiente: Ejercicio 02](../ejercicio-02-variables/README.md)
