# Auto-commit Setup for Fedora 42

## Instalación del Systemd Timer

### 1. Dar permisos de ejecución al script
```bash
chmod +x /home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.sh
```

### 2. Copiar archivos de systemd al directorio de usuario
```bash
mkdir -p ~/.config/systemd/user/
cp /home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.service ~/.config/systemd/user/
cp /home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.timer ~/.config/systemd/user/
```

### 3. Recargar systemd y habilitar el timer
```bash
systemctl --user daemon-reload
systemctl --user enable auto-commit.timer
systemctl --user start auto-commit.timer
```

### 4. Verificar el estado del timer
```bash
systemctl --user status auto-commit.timer
systemctl --user list-timers
```

### 5. Ver los logs
```bash
journalctl --user -u auto-commit.service -f
# O ver el log del script:
tail -f /home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.log
```

## Comandos útiles

### Detener el timer
```bash
systemctl --user stop auto-commit.timer
```

### Deshabilitar el timer
```bash
systemctl --user disable auto-commit.timer
```

### Ejecutar manualmente el servicio (para probar)
```bash
systemctl --user start auto-commit.service
```

### Reiniciar el timer
```bash
systemctl --user restart auto-commit.timer
```

## Formato de Commits

El script genera commits en formato Conventional Commits con la estructura:

```
<type>: <what> | Why: <why> | Impact: <impact>
```

### Tipos de commit:
- **feat**: Nuevos archivos o funcionalidades
- **docs**: Actualizaciones de documentación
- **refactor**: Eliminación de archivos obsoletos
- **chore**: Mantenimiento general

### Ejemplos:
```
feat: add new Java code examples | Why: demonstrate POO concepts | Impact: practical code reference

docs: update evaluation rubrics | Why: define clear assessment criteria | Impact: better student evaluation framework

chore: update multiple files (3 added, 2 modified) | Why: maintain project consistency | Impact: incremental progress on bootcamp materials
```

## Troubleshooting

Si el timer no funciona:

1. Verificar que systemd de usuario esté habilitado:
```bash
loginctl enable-linger $USER
```

2. Verificar permisos del script:
```bash
ls -l /home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.sh
```

3. Verificar que git esté configurado:
```bash
git config --global user.name
git config --global user.email
```
