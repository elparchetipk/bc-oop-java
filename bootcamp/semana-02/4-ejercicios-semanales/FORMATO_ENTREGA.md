# 📦 Formato de Entrega - Semana 02

## 🔗 Referencia Principal

**Lee primero:** [`/semana-01/4. asignación_dominios/FORMATO_ENTREGA.md`](../../semana-01/4.%20asignación_dominios/FORMATO_ENTREGA.md)

La mayoría de las especificaciones son las mismas que en Semana 01.

---

## 📂 Estructura Específica Semana 02

### Repositorio Completo

```
bc-poo-java-[nombre]-[apellido]/
├── README.md                    # Actualizar progreso
├── .gitignore
├── semana-01/                   # Ya existe
│   ├── README.md
│   ├── src/
│   │   ├── [Clase1].java
│   │   ├── [Clase2].java
│   │   └── Main.java
│   └── docs/
│       └── ANALISIS.md
│
└── semana-02/                   # NUEVA carpeta
    ├── README.md                # Descripción de esta semana
    ├── src/
    │   ├── [Clase1].java        # Copiada/mejorada de sem-01
    │   ├── [Clase2].java        # Copiada/mejorada de sem-01
    │   ├── [Clase3].java        # NUEVA clase
    │   ├── Sistema[X].java      # NUEVA clase gestor
    │   └── Main.java            # Programa mejorado
    └── docs/
        └── ANALISIS.md          # Análisis de esta semana
```

---

## 📝 Archivos Nuevos de Semana 02

### 1. Tercera Clase

**Nombre:** `[Clase3].java` según tu dominio

**Ejemplos:**
- Agencia Viajes: `Destino.java`
- Restaurante: `Mesa.java`
- Biblioteca: `Prestamo.java`

### 2. Clase Sistema/Gestor

**Patrón de nombres:**
- `Sistema[Dominio].java`
- `Gestor[Dominio].java`
- `Administrador[Dominio].java`

**Ejemplos:**
- `SistemaAgenciaViajes.java`
- `GestorRestaurante.java`
- `AdministradorBiblioteca.java`

**Reglas:**
- ✅ Usa PascalCase
- ✅ Nombre descriptivo del dominio
- ❌ NO usar `Sistema.java` (muy genérico)
- ❌ NO usar `Main.java` para el gestor

---

## 🔄 Archivos que Copias y Mejoras

### Clases de Semana 01

**Proceso:**
1. Copia `semana-01/src/[Clase1].java` → `semana-02/src/[Clase1].java`
2. Copia `semana-01/src/[Clase2].java` → `semana-02/src/[Clase2].java`
3. **Opcional:** Mejora métodos, agrega validaciones

**⚠️ IMPORTANTE:**
- NO modifiques los archivos en `semana-01/`
- Mantenlos como estaban para registro histórico
- Las mejoras van en la copia de `semana-02/`

---

## 📄 README.md de Semana 02

**Ubicación:** `semana-02/README.md`

**Contenido mínimo:**

```markdown
# Semana 02 - Fundamentos de Clases y Objetos

## 📝 Descripción

En esta semana expandí mi modelo orientado a objetos agregando:
- Una tercera clase: [Nombre]
- Un sistema gestor con arrays
- Funcionalidades de búsqueda y listado

## 🎯 Objetivos Cumplidos

- [x] Implementar tercera clase del dominio
- [x] Crear sistema gestor con arrays
- [x] Gestionar múltiples objetos
- [x] Implementar métodos de búsqueda
- [x] Actualizar documentación

## 📂 Archivos Entregados

- `src/[Clase1].java` - Clase principal (de semana-01)
- `src/[Clase2].java` - Clase secundaria (de semana-01)
- `src/[Clase3].java` - ⭐ NUEVA clase
- `src/Sistema[X].java` - ⭐ NUEVO sistema gestor
- `src/Main.java` - Programa integrado
- `docs/ANALISIS.md` - Análisis actualizado

## 🚀 Cómo Ejecutar

```bash
cd semana-02/src
javac *.java
java Main
```

## 📊 Salida Esperada

```
[Copia aquí la salida de tu programa]
```

## 🔍 Nuevos Conceptos Aplicados

- Gestión de múltiples objetos con arrays
- Métodos de búsqueda
- Contadores y capacidad máxima
- Relaciones entre 3+ clases
```

---

## ✅ Checklist Específico Semana 02

### Estructura
- [ ] Carpeta `semana-02/` creada
- [ ] Subcarpetas `src/` y `docs/` dentro de `semana-02/`
- [ ] README.md en `semana-02/`
- [ ] Archivos de semana-01 NO modificados (originales intactos)

### Clases
- [ ] [Clase1].java copiada a semana-02/src/
- [ ] [Clase2].java copiada a semana-02/src/
- [ ] [Clase3].java creada (nueva)
- [ ] Sistema[X].java creada (nueva)
- [ ] Main.java actualizado

### Funcionalidades
- [ ] Sistema usa arrays (no ArrayList aún)
- [ ] Método agregar implementado
- [ ] Método buscar implementado
- [ ] Método listar implementado
- [ ] Contadores funcionan correctamente
- [ ] Main crea 8+ objetos

### Documentación
- [ ] ANALISIS.md actualizado en docs/
- [ ] README.md del repo actualizado (progreso)
- [ ] README.md de semana-02 creado
- [ ] Código comentado

### Compilación y Ejecución
- [ ] Todos los archivos compilan sin errores
- [ ] Programa ejecuta sin excepciones
- [ ] Salida es clara y legible
- [ ] No hay archivos .class en el repo

---

## 🚀 Comandos Git para Entrega

```bash
# 1. Crear estructura
cd bc-poo-java-[nombre]-[apellido]
mkdir -p semana-02/src semana-02/docs

# 2. Copiar archivos de semana-01
cp semana-01/src/*.java semana-02/src/

# 3. [Crear tus nuevas clases: Clase3.java y SistemaX.java]

# 4. Verificar estado
git status

# 5. Agregar archivos
git add semana-02/

# 6. Commit
git commit -m "feat(semana-02): agregar tercera clase y sistema gestor

What? Implementadas Clase3 y SistemaGestor con arrays
For? Expandir modelo OO y gestionar múltiples objetos
Impact? Dominio más completo con búsqueda y listado"

# 7. Push
git push origin main
```

---

## 📊 Diferencias vs Semana 01

| Aspecto | Semana 01 | Semana 02 |
|---------|-----------|-----------|
| **Clases** | 2 clases | 4 clases (2 viejas + 2 nuevas) |
| **Objetos** | 2-4 objetos | 8+ objetos |
| **Estructura de datos** | Variables simples | Arrays |
| **Métodos** | Básicos | Búsqueda y filtrado |
| **Complejidad** | Baja | Media |

---

## ⚠️ Errores Comunes a Evitar

### 1. Modificar semana-01
❌ **INCORRECTO:**
```bash
# Modificar archivos originales
nano semana-01/src/Reserva.java  # ¡NO HACER ESTO!
```

✅ **CORRECTO:**
```bash
# Copiar y modificar la copia
cp semana-01/src/Reserva.java semana-02/src/
nano semana-02/src/Reserva.java  # Modificar la copia
```

### 2. No usar arrays
❌ **INCORRECTO:**
```java
private Curso curso1, curso2, curso3; // Variables separadas
```

✅ **CORRECTO:**
```java
private Curso[] cursos = new Curso[50]; // Array
private int contador = 0;
```

### 3. No validar búsquedas
❌ **INCORRECTO:**
```java
public Curso buscar(String codigo) {
    for (int i = 0; i < cursos.length; i++) {
        if (cursos[i].getCodigo().equals(codigo)) { // NullPointerException!
            return cursos[i];
        }
    }
    return null;
}
```

✅ **CORRECTO:**
```java
public Curso buscar(String codigo) {
    for (int i = 0; i < contador; i++) { // Solo hasta contador
        if (cursos[i] != null && 
            cursos[i].getCodigo().equals(codigo)) {
            return cursos[i];
        }
    }
    return null;
}
```

---

## 💡 Tips de Implementación

### Copiar y Mejorar

Cuando copies tus clases de semana-01:

1. **Mantén lo que funciona** (atributos, constructor básico)
2. **Agrega validaciones** en setters
3. **Mejora el toString()** o mostrarInformacion()
4. **NO cambies la estructura** fundamental

### Sistema Gestor

```java
// Patrón recomendado
public class SistemaMiDominio {
    // Arrays
    private TipoA[] arrayA;
    private TipoB[] arrayB;
    
    // Contadores
    private int contadorA = 0;
    private int contadorB = 0;
    
    // Constantes
    private static final int MAX_A = 50;
    private static final int MAX_B = 50;
    
    // Constructor
    public SistemaMiDominio() {
        this.arrayA = new TipoA[MAX_A];
        this.arrayB = new TipoB[MAX_B];
    }
    
    // Métodos CRUD básicos
    public boolean agregarA(TipoA objeto) { /* ... */ }
    public TipoA buscarA(String id) { /* ... */ }
    public void listarA() { /* ... */ }
    public int contarA() { return contadorA; }
}
```

---

## 📞 Soporte

Si tienes dudas:

1. Revisa el FORMATO_ENTREGA.md de semana-01
2. Consulta EJERCICIOS_SEMANALES.md
3. Revisa los ejemplos didácticos
4. Pregunta al instructor

---

**Última actualización:** 23 de octubre de 2025  
**Versión:** 1.0 (Semana 02)
