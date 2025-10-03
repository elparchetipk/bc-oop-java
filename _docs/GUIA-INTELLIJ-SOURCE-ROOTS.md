# 🚀 Guía Rápida: IntelliJ IDEA con Estructura Actual

## 📋 Objetivo

Configurar IntelliJ IDEA para trabajar con la estructura actual de ejercicios **sin necesidad de migración**.

---

## ✅ Ventajas de Esta Opción

- ✅ **Sin migración**: Mantiene estructura de carpetas actual
- ✅ **Simple**: Cada ejercicio en su carpeta independiente
- ✅ **Fácil navegación**: Ejercicios separados físicamente
- ✅ **Ideal para aprendizaje**: Los estudiantes ven claramente cada ejercicio
- ✅ **Flexible**: Fácil agregar o eliminar ejercicios

---

## 🎯 Estructura Actual (Mantener)

```
oop_java/
└── bootcamp/
    └── semana-00/
        ├── 0-assets/              # Recursos gráficos SVG
        ├── 1-teoria/              # Documentación teórica
        ├── 2-practica/
        │   ├── README.md          # Índice de ejercicios
        │   ├── ejercicio-01-hola-mundo/
        │   │   ├── HolaMundo.java
        │   │   ├── MiPrimerPrograma.java
        │   │   └── README.md
        │   ├── ejercicio-02-variables/
        │   │   ├── Calculadora.java
        │   │   ├── ConversionTemperatura.java
        │   │   └── README.md
        │   ├── ejercicio-03-control/
        │   ├── ejercicio-04-arrays/
        │   ├── ejercicio-05-metodos/
        │   └── ejercicio-06-integrador/
        └── 3-recursos/
            └── glosario.md
```

---

## 🛠️ Configuración Paso a Paso

### Paso 1: Abrir Proyecto en IntelliJ IDEA

1. Iniciar IntelliJ IDEA
2. `File` → `Open`
3. Navegar a: `/home/epti/Documentos/sena/4T25/oop_java`
4. Seleccionar la carpeta raíz `oop_java`
5. Click `OK`
6. Esperar que IntelliJ indexe el proyecto

### Paso 2: Configurar JDK 21

1. `File` → `Project Structure` (Ctrl + Alt + Shift + S)
2. Sección **Project**:
   - **SDK**: Seleccionar JDK 21
   - **Language level**: 21 - Record patterns, pattern matching for switch
3. Click `Apply`

### Paso 3: Marcar Carpetas de Ejercicios como Source Roots

Para **cada carpeta de ejercicio**, hacer lo siguiente:

#### Opción A: Marcar la carpeta completa

1. Navegar a `bootcamp/semana-00/2-practica/ejercicio-01-hola-mundo/`
2. Click derecho en la carpeta `ejercicio-01-hola-mundo`
3. `Mark Directory as` → **`Sources Root`**
4. La carpeta se verá con **ícono azul** 📁🔵

Repetir para:
- `ejercicio-02-variables/`
- `ejercicio-03-control/`
- `ejercicio-04-arrays/`
- `ejercicio-05-metodos/`
- `ejercicio-06-integrador/`

#### Opción B: Automatizar con Script (RECOMENDADO)

Crear archivo `mark-sources.sh`:

```bash
#!/bin/bash

echo "🔵 Marcando carpetas de ejercicios como Source Roots en IntelliJ IDEA"
echo ""
echo "Instrucciones:"
echo "1. Abre IntelliJ IDEA"
echo "2. File → Open → Selecciona oop_java/"
echo "3. Para cada carpeta de ejercicio:"
echo "   - Click derecho en la carpeta"
echo "   - Mark Directory as → Sources Root"
echo ""
echo "📂 Carpetas a marcar:"
echo ""

SEMANA_DIR="bootcamp/semana-00/2-practica"

for dir in "$SEMANA_DIR"/ejercicio-*/; do
    if [ -d "$dir" ]; then
        dirname=$(basename "$dir")
        echo "   ✓ $dirname"
    fi
done

echo ""
echo "💡 Tip: Las carpetas marcadas se verán con ícono azul"
echo ""
```

### Paso 4: Excluir Carpetas No Compilables

1. Click derecho en `bootcamp/semana-00/0-assets/`
2. `Mark Directory as` → **`Excluded`**
3. Repetir para:
   - `1-teoria/`
   - `3-recursos/`
   - `2-practica/README.md` (mantener solo las carpetas de ejercicios)

---

## ▶️ Ejecutar Ejercicios

### Método 1: Ejecutar Directamente (MÁS SIMPLE)

1. Abrir archivo Java (ej: `HolaMundo.java`)
2. Buscar el método `main`:
   ```java
   public static void main(String[] args) {
       // código
   }
   ```
3. Click en el **ícono verde ▶️** en el margen izquierdo
4. Seleccionar `Run 'HolaMundo.main()'`

### Método 2: Usando el Menú

1. Abrir archivo Java
2. `Run` → `Run...`
3. Seleccionar la clase con `main()`

### Método 3: Atajo de Teclado

1. Posicionar cursor en el archivo Java
2. Presionar `Shift + F10`
3. Si hay múltiples configuraciones, seleccionar la correcta

---

## 🎨 Configuración Recomendada para Estudiantes

### 1. Estilo de Código

`File` → `Settings` → `Editor` → `Code Style` → `Java`

**Configuración:**
- **Tab size**: 4
- **Indent**: 4
- **Continuation indent**: 4
- ☑️ **Use spaces** (no tabs)

### 2. Auto-Import

`File` → `Settings` → `Editor` → `General` → `Auto Import`

**Activar:**
- ☑️ Add unambiguous imports on the fly
- ☑️ Optimize imports on the fly

### 3. Fuente de Código

`File` → `Settings` → `Editor` → `Font`

**Recomendado:**
- **Font**: JetBrains Mono, Fira Code, o Consolas
- **Size**: 14-16
- **Line spacing**: 1.2

### 4. Mostrar Números de Línea

`File` → `Settings` → `Editor` → `General` → `Appearance`

- ☑️ Show line numbers

---

## ⌨️ Atajos Esenciales (Top 15)

| Acción | Atajo | Para qué sirve |
|--------|-------|----------------|
| **Ejecutar** | `Shift + F10` | Ejecutar programa |
| **Formatear** | `Ctrl + Alt + L` | Auto-formatear código |
| **Autocompletar** | `Ctrl + Space` | Sugerencias de código |
| **Guardar todo** | `Ctrl + S` | Guardar cambios |
| **Duplicar línea** | `Ctrl + D` | Copiar línea actual |
| **Eliminar línea** | `Ctrl + Y` | Borrar línea completa |
| **Comentar** | `Ctrl + /` | Comentar/descomentar |
| **Buscar** | `Ctrl + F` | Buscar en archivo |
| **Reemplazar** | `Ctrl + R` | Buscar y reemplazar |
| **Ir a línea** | `Ctrl + G` | Saltar a número de línea |
| **Deshacer** | `Ctrl + Z` | Deshacer cambio |
| **Rehacer** | `Ctrl + Shift + Z` | Rehacer cambio |
| **Cerrar pestaña** | `Ctrl + F4` | Cerrar archivo actual |
| **Terminal** | `Alt + F12` | Abrir terminal |
| **Estructura** | `Alt + 7` | Ver estructura del código |

---

## 📂 Organización de Archivos por Ejercicio

### Estructura Típica

```
ejercicio-XX-nombre/
├── README.md           # Instrucciones del ejercicio
├── Clase1.java        # Archivo principal
├── Clase2.java        # Clase auxiliar (si aplica)
└── out/               # Compilados (crear automáticamente)
```

### Buenas Prácticas

1. **Un archivo por clase pública**
2. **Nombre de archivo = Nombre de clase**
3. **Usar comentarios Javadoc**
4. **README.md en cada ejercicio** con:
   - Objetivo
   - Instrucciones
   - Ejemplo de salida esperada

---

## 🎯 Convenciones de Código (Sin Paquetes)

### Estructura de Archivo Java

```java
/**
 * Programa que imprime "Hola Mundo" en consola.
 * 
 * @author Nombre del Estudiante
 * @version 1.0
 * @since 2025-10-03
 */
public class HolaMundo {
    
    /**
     * Método principal que inicia el programa.
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
}
```

### Nomenclatura

```java
// Clases: PascalCase
public class MiPrimerPrograma { }

// Métodos y variables: camelCase
public void calcularPromedio() { }
int numeroEstudiantes = 30;

// Constantes: UPPER_SNAKE_CASE
public static final int MAX_INTENTOS = 3;
```

---

## 🐛 Debugging Básico

### Configurar Breakpoint

1. Click en el margen izquierdo (al lado del número de línea)
2. Aparece un círculo rojo 🔴
3. `Shift + F9` para ejecutar en modo debug
4. El programa se pausa en el breakpoint

### Ventana de Debug

- **Variables**: Ver valores actuales
- **Console**: Salida del programa
- **Debugger**: Controles de navegación

### Controles

| Acción | Atajo | Descripción |
|--------|-------|-------------|
| **Step Over** | `F8` | Ejecutar línea |
| **Step Into** | `F7` | Entrar en método |
| **Resume** | `F9` | Continuar |

---

## 🔧 Solución de Problemas Comunes

### Problema 1: "Cannot find or load main class"

**Causas:**
- Carpeta no está marcada como Source Root
- Nombre de archivo no coincide con nombre de clase

**Solución:**
1. Verificar que carpeta esté marcada como Source Root (azul)
2. `Build` → `Rebuild Project`

### Problema 2: Cambios no se reflejan al ejecutar

**Solución:**
```
Build → Build Project (Ctrl + F9)
```
Luego ejecutar de nuevo.

### Problema 3: IntelliJ no reconoce código Java

**Solución:**
1. `File` → `Invalidate Caches`
2. Seleccionar: `Invalidate and Restart`

### Problema 4: Error "SDK is not defined"

**Solución:**
1. `File` → `Project Structure`
2. `Project` → `Project SDK` → Seleccionar JDK 21
3. `Apply` → `OK`

---

## 📊 Vista de Proyecto Recomendada

### Configurar Panel Lateral

1. Presionar `Alt + 1` para abrir/cerrar Project View
2. En la parte superior del panel, cambiar a **Project View** (no Package view)
3. Ver estructura de carpetas tal como está en disco

### Ocultar Archivos Innecesarios

1. Ícono de engranaje ⚙️ en panel de proyecto
2. `File Nesting` → Configurar para colapsar archivos relacionados
3. `Excluded Files` → Agregar patrones para ocultar:
   - `*.class`
   - `out/`
   - `.git/`

---

## 🔄 Flujo de Trabajo Típico

### Para el Instructor

1. **Crear nuevo ejercicio**:
   ```bash
   cd bootcamp/semana-00/2-practica
   mkdir ejercicio-07-nuevo
   cd ejercicio-07-nuevo
   touch README.md ClasePrincipal.java
   ```

2. **En IntelliJ**:
   - Click derecho en `ejercicio-07-nuevo`
   - `Mark Directory as` → `Sources Root`
   - Editar archivos Java

3. **Probar**:
   - Ejecutar con `Shift + F10`
   - Verificar salida

4. **Compartir**:
   ```bash
   git add .
   git commit -m "feat(semana-00): agregar ejercicio 07"
   git push
   ```

### Para el Estudiante

1. **Obtener ejercicio**:
   ```bash
   git pull origin main
   ```

2. **Abrir en IntelliJ**:
   - IntelliJ detecta cambios automáticamente
   - Si no: Click derecho en carpeta → `Mark Directory as` → `Sources Root`

3. **Trabajar en ejercicio**:
   - Abrir archivo `.java`
   - Implementar solución
   - Ejecutar y probar

4. **Entregar** (si aplica):
   ```bash
   git add bootcamp/semana-00/2-practica/ejercicio-XX-nombre/
   git commit -m "feat(semana-00): completar ejercicio XX"
   git push
   ```

---

## 🎓 Tips de Productividad

### 1. Usar Live Templates

Escribir `psvm` + `Tab` → Genera `public static void main(String[] args)`

Escribir `sout` + `Tab` → Genera `System.out.println();`

### 2. Formato Automático al Guardar

`File` → `Settings` → `Tools` → `Actions on Save`
- ☑️ Reformat code
- ☑️ Optimize imports

### 3. Usar TODO Comments

```java
// TODO: Implementar validación de entrada
// FIXME: Corregir cálculo de promedio
```

Ver todos los TODOs: `View` → `Tool Windows` → `TODO`

### 4. Comparar Archivos

1. Seleccionar dos archivos
2. Click derecho → `Compare Files`
3. Ver diferencias lado a lado

---

## 📚 Recursos de Aprendizaje

### IntelliJ IDEA

- [Documentación Oficial](https://www.jetbrains.com/idea/documentation/)
- [Tutorial Interactivo](https://www.jetbrains.com/idea/guide/)
- [Atajos de Teclado PDF](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)

### Java

- [Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- [Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)
- Material del bootcamp en `bootcamp/semana-XX/1-teoria/`

---

## ✅ Checklist de Configuración

**Primera vez:**
- [ ] IntelliJ IDEA instalado
- [ ] JDK 21 configurado
- [ ] Proyecto `oop_java` abierto
- [ ] Carpetas de ejercicios marcadas como Source Roots (azul)
- [ ] Ejecutado primer programa exitosamente

**Cada sesión:**
- [ ] `git pull` para obtener últimos cambios
- [ ] Verificar que carpetas nuevas estén marcadas como Source Root
- [ ] Probar compilación antes de empezar

**Antes de entregar:**
- [ ] Código formateado (Ctrl + Alt + L)
- [ ] Sin errores de compilación
- [ ] Programa ejecuta correctamente
- [ ] Comentarios y documentación agregados

---

## 🆘 Soporte

### Obtener Ayuda

1. **Documentación del proyecto**: Ver `_docs/GUIA-INTELLIJ-IDEA.md` (guía completa)
2. **IntelliJ Help**: `Help` → `Help`
3. **Instructor**: Durante las sesiones del bootcamp
4. **GitHub Issues**: Reportar problemas técnicos

---

**Última actualización**: 3 de octubre de 2025  
**Configuración**: IntelliJ IDEA con Source Roots  
**Versión Java**: 21 LTS
