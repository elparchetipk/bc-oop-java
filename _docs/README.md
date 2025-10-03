# 📚 Documentación del Proyecto - Bootcamp POO Java

Este directorio contiene documentación técnica, guías y scripts para el desarrollo y gestión del bootcamp.

## 📁 Contenido

### 📖 Guías

#### [GUIA-INTELLIJ-IDEA.md](./GUIA-INTELLIJ-IDEA.md)
Guía completa para configurar y usar IntelliJ IDEA con el proyecto del bootcamp.

**Incluye:**
- ✅ Estructura recomendada de proyecto
- ✅ Configuración inicial paso a paso
- ✅ Importar y configurar módulos
- ✅ Atajos de teclado esenciales
- ✅ Plugins recomendados
- ✅ Debugging y troubleshooting
- ✅ Convenciones de código

**Audiencia:** Instructores y estudiantes

---

### 🛠️ Scripts

#### [scripts/migrate-to-intellij.sh](./scripts/migrate-to-intellij.sh)
Script bash para migrar la estructura actual de ejercicios a la estructura recomendada de IntelliJ IDEA.

**Funcionalidad:**
- Crea estructura `src/main/java/com/sena/bootcamp/semanaXX`
- Copia archivos Java agregando declaraciones de paquete
- Genera archivo `.iml` para el módulo
- Mantiene archivos originales como referencia

**Uso:**
```bash
cd /ruta/al/proyecto/oop_java
./_docs/scripts/migrate-to-intellij.sh
```

**Requisitos:** Bash 4.0+

---

### 📋 Documentos de Referencia

#### [tema.md](./tema.md)
Documento original con la estructura temática del bootcamp.

**Contenido:**
- Saberes de conceptos y principios
- Saberes de proceso
- Criterios de evaluación
- Actividades de aprendizaje por semana

---

## 🎯 Uso de la Documentación

### Para Instructores

1. **Configuración del Entorno**
   - Leer `GUIA-INTELLIJ-IDEA.md`
   - Ejecutar `migrate-to-intellij.sh` si es necesario
   - Configurar proyecto en IntelliJ

2. **Preparación de Material**
   - Consultar `tema.md` para objetivos de cada semana
   - Crear ejercicios siguiendo estructura recomendada
   - Documentar cambios aquí

3. **Soporte a Estudiantes**
   - Compartir `GUIA-INTELLIJ-IDEA.md`
   - Ayudar con configuración inicial
   - Referir a secciones específicas según necesidad

### Para Estudiantes

1. **Primer Día**
   - Leer sección "Configuración Inicial" en `GUIA-INTELLIJ-IDEA.md`
   - Instalar JDK 21 y IntelliJ IDEA
   - Clonar repositorio y abrir proyecto

2. **Desarrollo de Ejercicios**
   - Consultar sección "Ejecutar Ejercicios"
   - Usar atajos de teclado (sección "Atajos y Productividad")
   - Seguir convenciones de código

3. **Resolución de Problemas**
   - Ver sección "Solución de Problemas Comunes"
   - Consultar con instructor si persiste

---

## 🔄 Actualización de Documentación

### Agregar Nueva Guía

1. Crear archivo `.md` en este directorio
2. Seguir formato de `GUIA-INTELLIJ-IDEA.md`:
   - Índice al inicio
   - Secciones claras con emojis
   - Ejemplos de código cuando aplique
   - Capturas de pantalla si es necesario
3. Actualizar este README con enlace

### Modificar Guías Existentes

1. Mantener estructura de secciones
2. Agregar fecha de actualización al final
3. Hacer commit descriptivo:
   ```bash
   git commit -m "docs: actualizar guía IntelliJ con nueva sección X"
   ```

### Agregar Nuevo Script

1. Crear script en `scripts/`
2. Agregar comentarios explicativos
3. Incluir función de ayuda (`--help`)
4. Dar permisos de ejecución:
   ```bash
   chmod +x scripts/nuevo-script.sh
   ```
5. Documentar en este README

---

## 📊 Estructura de Carpetas

```
_docs/
├── README.md                      # Este archivo
├── GUIA-INTELLIJ-IDEA.md         # Guía de IntelliJ IDEA
├── tema.md                        # Documento temático original
└── scripts/
    └── migrate-to-intellij.sh     # Script de migración
```

---

## 🎓 Recursos Adicionales

### Documentación Oficial

- [IntelliJ IDEA Documentation](https://www.jetbrains.com/idea/documentation/)
- [Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- [Java Tutorials (Oracle)](https://docs.oracle.com/javase/tutorial/)

### Guías Externas

- [Effective Java (Joshua Bloch)](https://www.oreilly.com/library/view/effective-java/9780134686097/)
- [Clean Code (Robert C. Martin)](https://www.oreilly.com/library/view/clean-code-a/9780136083238/)
- [Java Design Patterns](https://java-design-patterns.com/)

### Comunidades

- [Stack Overflow - Java](https://stackoverflow.com/questions/tagged/java)
- [Reddit - r/learnjava](https://www.reddit.com/r/learnjava/)
- [Java Discord Communities](https://discord.gg/java)

---

## 📝 Contribuir a la Documentación

### Proceso

1. **Fork del repositorio** (si eres estudiante externo)
2. **Crear rama para documentación**
   ```bash
   git checkout -b docs/nombre-mejora
   ```
3. **Realizar cambios** en archivos `.md`
4. **Verificar formato** (usar preview de Markdown)
5. **Commit descriptivo**
   ```bash
   git commit -m "docs(intellij): agregar sección sobre debugging avanzado"
   ```
6. **Push y Pull Request**

### Estándares

- **Formato**: Markdown con sintaxis CommonMark
- **Idioma**: Español (castellano neutro)
- **Emojis**: Usar para mejorar legibilidad visual
- **Código**: Bloques con syntax highlighting
- **Enlaces**: Relativos dentro del repo, absolutos para externos

---

## 🐛 Reportar Problemas

Si encuentras errores o información desactualizada:

1. **Abrir Issue en GitHub**
   - Título descriptivo
   - Documento afectado
   - Sección específica
   - Sugerencia de corrección

2. **O Hacer Pull Request Directamente**
   - Seguir proceso de contribución
   - Incluir explicación del cambio

---

## 📅 Historial de Cambios

| Fecha | Cambio | Autor |
|-------|--------|-------|
| 2025-10-03 | Creación de GUIA-INTELLIJ-IDEA.md | Instructor |
| 2025-10-03 | Creación de migrate-to-intellij.sh | Instructor |
| 2025-10-03 | Creación de este README | Instructor |

---

## 📧 Contacto

Para preguntas sobre la documentación:
- **Instructor**: [Información de contacto]
- **GitHub Issues**: [Reportar problema](../../issues)
- **Discussions**: [Foro del bootcamp](../../discussions)

---

**Última actualización**: 3 de octubre de 2025  
**Versión**: 1.0
