# 📦 Formato de Entrega - Ejercicios Semanales

## 🎯 Objetivo

Este documento define **de forma específica y obligatoria** el formato, nomenclatura y estructura para la entrega de ejercicios semanales en GitHub.

---

## 📁 Estructura de Repositorio GitHub

### Nombre del Repositorio

```
bc-poo-java-[TU_PRIMER_NOMBRE]-[TU_PRIMER_APELLIDO]
```

**Ejemplos:**
- `bc-poo-java-alvaro-espejo`
- `bc-poo-java-andres-gutierrez`
- `bc-poo-java-ivone-grisales`

**Reglas:**
- ✅ Todo en minúsculas
- ✅ Separado por guiones `-`
- ✅ Solo primer nombre y primer apellido
- ✅ Sin tildes ni caracteres especiales
- ❌ NO usar números de ficha
- ❌ NO usar apodos o nicknames

---

## 📂 Estructura de Carpetas del Repositorio

```
bc-poo-java-[nombre]-[apellido]/
├── README.md
├── .gitignore
├── semana-01/
│   ├── README.md
│   ├── src/
│   │   ├── [DominioPrincipal].java
│   │   ├── [DominioSecundario].java
│   │   └── Main.java
│   └── docs/
│       └── ANALISIS.md
├── semana-02/
│   ├── README.md
│   ├── src/
│   └── docs/
├── semana-03/
│   └── ...
└── semana-04/
    └── ...
```

---

## 📝 Nomenclatura de Archivos

### 1. Clases Java

**Formato:** `PascalCase` (Primera letra de cada palabra en mayúscula)

**Patrón según tu dominio:**

| Dominio Asignado | Clase Principal | Clase Secundaria | Archivo Main |
|------------------|-----------------|------------------|--------------|
| Agencia de Viajes | `Reserva.java` | `Cliente.java` | `Main.java` |
| Restaurante | `Pedido.java` | `Producto.java` | `Main.java` |
| Biblioteca | `Libro.java` | `Autor.java` | `Main.java` |
| Tienda de Mascotas | `Mascota.java` | `Propietario.java` | `Main.java` |
| Hospital | `Cita.java` | `Paciente.java` | `Main.java` |
| Hotel | `Habitacion.java` | `Huesped.java` | `Main.java` |
| Cafetería | `Orden.java` | `Cliente.java` | `Main.java` |
| Librería | `Libro.java` | `Cliente.java` | `Main.java` |

**Reglas estrictas:**
- ✅ Nombre de clase = Nombre de archivo
- ✅ Primera letra MAYÚSCULA
- ✅ Una clase por archivo
- ✅ Sin espacios (usar `CamelCase` si es compuesto: `ProductoAlimenticio.java`)
- ❌ NO usar guiones bajos: ~~`producto_alimenticio.java`~~
- ❌ NO usar todo minúsculas: ~~`producto.java`~~

### 2. Archivo Main

**Nombre obligatorio:** `Main.java`

```java
public class Main {
    public static void main(String[] args) {
        // Tu código de demostración
    }
}
```

**NO usar:**
- ❌ `Prueba.java`
- ❌ `Test.java`
- ❌ `PruebaAgenciaViajes.java`
- ❌ `Demo.java`

### 3. Documento de Análisis

**Nombre obligatorio:** `ANALISIS.md`

**Ubicación:** `semana-XX/docs/ANALISIS.md`

**Contenido mínimo:**
```markdown
# Análisis del Dominio: [Tu Dominio]

## 1. Identificación de Objetos

### Objeto Principal: [Nombre]
- **Justificación:** ...
- **Atributos identificados:** ...
- **Comportamientos:** ...

### Objeto Secundario: [Nombre]
- **Justificación:** ...
- **Relación con objeto principal:** ...

## 2. Diagrama de Clases (opcional)
[Insertar diagrama o descripción textual]

## 3. Decisiones de Diseño
- ¿Por qué elegí estos atributos?
- ¿Qué validaciones implementé?
- ¿Qué relaciones identifiqué?

## 4. Dificultades Encontradas
[Opcional: problemas y soluciones]
```

### 4. README del Repositorio

**Nombre:** `README.md` (raíz del repositorio)

**Contenido mínimo:**

```markdown
# Bootcamp POO Java - [Tu Nombre Completo]

## 📋 Información

- **Estudiante:** [Nombre Completo]
- **Ficha:** [Número de Ficha]
- **Dominio Asignado:** [Tu Dominio]
- **Instructor:** [Nombre del Instructor]

## 📁 Estructura del Repositorio

- `semana-01/`: Introducción a POO
- `semana-02/`: Clases y Objetos
- `semana-03/`: Encapsulación y Constructores
- `semana-04/`: Herencia

## 🚀 Cómo Ejecutar

### Semana 01
```bash
cd semana-01/src
javac *.java
java Main
```

## 📝 Progreso

- [x] Semana 01 - Completada
- [ ] Semana 02 - En progreso
- [ ] Semana 03 - Pendiente
- [ ] Semana 04 - Pendiente
```

### 5. README por Semana

**Nombre:** `README.md` (dentro de cada carpeta `semana-XX/`)

**Contenido mínimo:**

```markdown
# Semana [XX] - [Tema de la Semana]

## 📝 Descripción

[Breve descripción de lo implementado esta semana]

## 🎯 Objetivos Cumplidos

- [x] Implementar clase principal del dominio
- [x] Implementar clase secundaria relacionada
- [x] Crear programa de demostración
- [x] Documentar análisis del dominio

## 📂 Archivos Entregados

- `src/[ClasePrincipal].java` - [Descripción breve]
- `src/[ClaseSecundaria].java` - [Descripción breve]
- `src/Main.java` - Programa de demostración
- `docs/ANALISIS.md` - Análisis del dominio

## 🚀 Instrucciones de Ejecución

```bash
cd src
javac *.java
java Main
```

## 📊 Salida Esperada

```
[Copia aquí la salida de tu programa]
```

## 🔍 Conceptos Aplicados

- Concepto 1
- Concepto 2
- Concepto 3
```

---

## 🔧 Archivo .gitignore

**Ubicación:** Raíz del repositorio

**Contenido obligatorio:**

```gitignore
# Compiled class files
*.class

# Package Files
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# IDE specific files
.idea/
*.iml
.vscode/
*.swp
*.swo
*~

# OS specific files
.DS_Store
Thumbs.db

# Build directories
out/
target/
build/
bin/

# Logs
*.log
```

---

## 📌 Convenciones de Código Java

### Variables y Atributos

**Formato:** `camelCase` (primera palabra minúscula, siguientes con mayúscula)

```java
private String nombreCompleto;
private double precioTotal;
private boolean estaActivo;
private int numeroIdentificacion;
```

### Métodos

**Formato:** `camelCase`

```java
public void mostrarInformacion() { }
public double calcularTotal() { }
public boolean esValido() { }
public String obtenerNombre() { }
```

### Constantes

**Formato:** `UPPER_SNAKE_CASE` (todo mayúsculas con guiones bajos)

```java
public static final double IVA = 0.19;
public static final int MAX_INTENTOS = 3;
public static final String NOMBRE_EMPRESA = "Mi Empresa";
```

### Clases

**Formato:** `PascalCase`

```java
public class ClienteFrecuente { }
public class PedidoEspecial { }
public class ProductoAlimenticio { }
```

---

## 📤 Proceso de Entrega en GitHub

### Paso 1: Crear Repositorio

1. Ir a GitHub → **New Repository**
2. **Repository name:** `bc-poo-java-[nombre]-[apellido]`
3. **Description:** "Ejercicios del Bootcamp POO Java - SENA"
4. **Visibility:** Public
5. **Initialize with README:** ✅ Marcado
6. **Add .gitignore:** Java
7. Click **Create repository**

### Paso 2: Clonar Repositorio

```bash
git clone https://github.com/[tu-usuario]/bc-poo-java-[nombre]-[apellido].git
cd bc-poo-java-[nombre]-[apellido]
```

### Paso 3: Crear Estructura de Semana 01

```bash
mkdir -p semana-01/src semana-01/docs
```

### Paso 4: Agregar Archivos

```bash
# Copiar tus archivos .java a semana-01/src/
# Copiar tu ANALISIS.md a semana-01/docs/

# Crear README de la semana
touch semana-01/README.md
```

### Paso 5: Commit y Push

```bash
git add .
git commit -m "feat(semana-01): implementar clases del dominio [TuDominio]"
git push origin main
```

---

## ✅ Checklist de Entrega

Antes de hacer tu entrega, verifica:

### Estructura del Repositorio
- [ ] Repositorio con nombre correcto: `bc-poo-java-[nombre]-[apellido]`
- [ ] README.md en la raíz del repositorio
- [ ] .gitignore configurado
- [ ] Carpeta `semana-01/` creada
- [ ] Subcarpetas `src/` y `docs/` dentro de `semana-01/`

### Archivos de Código
- [ ] Clase principal con nombre correcto (PascalCase)
- [ ] Clase secundaria con nombre correcto (PascalCase)
- [ ] Archivo `Main.java` presente
- [ ] Todos los archivos `.java` compilan sin errores
- [ ] El programa se ejecuta correctamente
- [ ] No hay archivos `.class` en el repositorio

### Documentación
- [ ] `ANALISIS.md` completo en `docs/`
- [ ] `README.md` en `semana-01/` con instrucciones
- [ ] Comentarios en el código (JavaDoc recomendado)
- [ ] Salida esperada documentada

### Convenciones
- [ ] Clases en PascalCase
- [ ] Métodos y variables en camelCase
- [ ] Constantes en UPPER_SNAKE_CASE
- [ ] Indentación consistente (4 espacios o 1 tab)
- [ ] Sin código comentado innecesario

### Git
- [ ] Commits con mensajes descriptivos
- [ ] No hay archivos compilados (.class) en el repo
- [ ] No hay carpetas del IDE (.idea, .vscode)
- [ ] Repositorio público y accesible

---

## 📊 Ejemplo Completo de Estructura

### Repositorio: `bc-poo-java-alvaro-espejo`

```
bc-poo-java-alvaro-espejo/
│
├── README.md
├── .gitignore
│
└── semana-01/
    ├── README.md
    │
    ├── src/
    │   ├── Reserva.java
    │   ├── Cliente.java
    │   └── Main.java
    │
    └── docs/
        └── ANALISIS.md
```

### Contenido de `Reserva.java`

```java
/**
 * Clase que representa una reserva en la agencia de viajes
 * @author Alvaro Espejo
 * @version 1.0
 */
public class Reserva {
    // Atributos privados
    private String codigoReserva;
    private String nombreCliente;
    private String destino;
    private double precio;
    private boolean confirmada;
    
    // Constructor
    public Reserva(String codigoReserva, String nombreCliente, 
                   String destino, double precio) {
        this.codigoReserva = codigoReserva;
        this.nombreCliente = nombreCliente;
        this.destino = destino;
        this.precio = precio;
        this.confirmada = false;
    }
    
    // Métodos públicos
    public void mostrarInformacion() {
        System.out.println("=== RESERVA ===");
        System.out.println("Código: " + codigoReserva);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Destino: " + destino);
        System.out.println("Precio: $" + precio);
        System.out.println("Estado: " + (confirmada ? "CONFIRMADA" : "PENDIENTE"));
    }
    
    public double calcularPrecioConImpuesto() {
        final double IVA = 0.19;
        return precio + (precio * IVA);
    }
    
    // Getters y Setters
    public String getCodigoReserva() {
        return codigoReserva;
    }
    
    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }
    
    // ... más getters/setters según necesidad
}
```

---

## 🔗 Enlace de Entrega

Una vez completada tu entrega, debes compartir el enlace del repositorio:

**Formato del enlace:**
```
https://github.com/[tu-usuario]/bc-poo-java-[nombre]-[apellido]
```

**Ejemplo:**
```
https://github.com/alvaro-espejo/bc-poo-java-alvaro-espejo
```

---

## ❓ Preguntas Frecuentes

### ¿Puedo usar otro nombre para el repositorio?
❌ No, el nombre debe seguir el formato especificado para facilitar la evaluación automatizada.

### ¿Puedo tener el repositorio privado?
❌ No, debe ser público para que el instructor pueda acceder.

### ¿Qué hago si mi dominio tiene espacios?
Usa PascalCase: "Agencia de Viajes" → archivos: `Reserva.java`, `Cliente.java`

### ¿Puedo usar paquetes (packages)?
✅ Opcional para semana-01. Será obligatorio desde semana-07.

### ¿Qué IDE puedo usar?
✅ IntelliJ IDEA, VS Code, Eclipse, NetBeans - cualquiera es válido.

### ¿Debo incluir archivos .class?
❌ NO. Usa .gitignore para excluirlos.

### ¿Puedo trabajar en otra rama que no sea main?
✅ Sí, pero la entrega final debe estar en `main`.

---

## 📞 Soporte

Si tienes dudas sobre el formato de entrega:

1. Revisa este documento completo
2. Consulta el archivo `EJERCICIOS_SEMANALES.md`
3. Pregunta en el foro del curso
4. Contacta al instructor

---

**Fecha de última actualización:** 23 de octubre de 2025  
**Versión:** 1.0
