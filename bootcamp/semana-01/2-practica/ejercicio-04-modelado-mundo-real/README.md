# Ejercicio 04: Modelado del Mundo Real

## 🎯 Objetivo

Aplicar todos los conceptos aprendidos para modelar un sistema completo del mundo real.

---

## 📋 Descripción del Problema

Elige **UNO** de los siguientes dominios y modela el sistema completo:

### Opción A: Sistema de Vehículos 🚗

Crea una clase `Vehiculo` para gestionar un taller mecánico.

**Atributos:**
- `placa`, `marca`, `modelo`, `anio`, `kilometraje`, `nivelCombustible`

**Métodos:**
- `conducir(int km)` - Aumenta kilometraje, reduce combustible
- `repostar(int litros)` - Agrega combustible
- `necesitaMantenimiento()` - true si km > 10000
- `calcularAniosUso()` - Años desde fabricación
- `mostrarInformacion()`

---

### Opción B: Sistema de Productos 📦

Crea una clase `Producto` para gestionar un inventario de tienda.

**Atributos:**
- `codigo`, `nombre`, `precio`, `stock`, `categoria`

**Métodos:**
- `aplicarDescuento(double porcentaje)` - Reduce precio
- `vender(int cantidad)` - Reduce stock
- `reabastecer(int cantidad)` - Aumenta stock
- `hayStock()` - true si stock > 0
- `calcularValorInventario()` - precio * stock
- `mostrarInformacion()`

---

### Opción C: Sistema de Cuentas Bancarias 💰

Crea una clase `CuentaBancaria` para gestionar transacciones.

**Atributos:**
- `numeroCuenta`, `titular`, `saldo`, `tipoCuenta`

**Métodos:**
- `depositar(double monto)` - Agrega dinero
- `retirar(double monto)` - Quita dinero (validar saldo)
- `transferir(CuentaBancaria destino, double monto)` - Transfiere entre cuentas
- `consultarSaldo()` - Retorna saldo actual
- `aplicarInteres(double tasa)` - Aplica interés al saldo
- `mostrarInformacion()`

---

## 💻 Requisitos Técnicos

1. **Validaciones:** Todos los métodos deben validar datos
2. **Mensajes:** Mensajes claros al usuario
3. **Múltiples objetos:** Crear al menos 3 instancias
4. **Interacción:** Objetos deben interactuar entre sí
5. **Documentación:** Comentarios Javadoc

---

## 📤 Ejemplo de Salida (Opción A)

```
🚗 SISTEMA DE VEHÍCULOS - TALLER MECÁNICO

═══════════════════════════════
Placa: ABC-123
Marca: Toyota
Modelo: Corolla
Año: 2020
Kilometraje: 5000 km
Combustible: 50 L
Años de uso: 5 años
Mantenimiento: No requerido
═══════════════════════════════

Conduciendo 150 km...
Combustible consumido: 7 L

⚠️ Se requiere mantenimiento (11000 km alcanzados)

Repostando 30 litros...
Combustible actual: 73 L
```

---

## ✅ Criterios de Evaluación

| Criterio | Puntos |
|----------|--------|
| Clase completa con todos los atributos | 20 |
| Todos los métodos implementados | 30 |
| Validaciones y manejo de errores | 20 |
| Interacción entre objetos | 15 |
| Código limpio y documentado | 15 |

---

## 🚀 Desafíos Adicionales

1. Agrega un método para comparar dos objetos
2. Implementa un sistema de historial de operaciones
3. Crea un menú interactivo con Scanner

---

**Tiempo estimado:** 60 minutos  
**Dificultad:** ⭐⭐⭐ Avanzado
