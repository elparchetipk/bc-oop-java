/**
 * Programa que demuestra las diferencias entre una clase
 * SIN encapsulación y una clase CON encapsulación.
 *
 * Muestra los problemas que surgen cuando los datos no están protegidos
 * y las ventajas de usar encapsulación correctamente.
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class DemostracionEncapsulacion {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("DEMOSTRACIÓN: SIN ENCAPSULACIÓN");
        System.out.println("========================================\n");

        demostrarSinEncapsulacion();

        System.out.println("\n========================================");
        System.out.println("DEMOSTRACIÓN: CON ENCAPSULACIÓN");
        System.out.println("========================================\n");

        demostrarConEncapsulacion();

        System.out.println("\n========================================");
        System.out.println("CONCLUSIÓN");
        System.out.println("========================================");
        System.out.println("✓ Con encapsulación, los datos están protegidos");
        System.out.println("✓ La validación evita estados inválidos");
        System.out.println("✓ El comportamiento está controlado mediante métodos");
    }

    /**
     * Demuestra los problemas de NO usar encapsulación.
     */
    private static void demostrarSinEncapsulacion() {
        // Crear cuenta sin encapsulación
        CuentaBancariaSinEncapsulacion cuenta =
            new CuentaBancariaSinEncapsulacion("123456", "Juan Pérez", 1000.0);

        System.out.println("Cuenta creada:");
        cuenta.mostrarInfo();

        // PROBLEMA 1: Podemos asignar valores inválidos directamente
        System.out.println("\nPROBLEMA 1: Asignando saldo negativo directamente...");
        cuenta.saldo = -500.0;  // ⚠️ ¡Nadie nos detiene!
        System.out.println("cuenta.saldo = -500.0");
        cuenta.mostrarInfo();
        System.out.println("¡DATO INVÁLIDO! El saldo es negativo.");

        // PROBLEMA 2: Podemos dejar el titular vacío
        System.out.println("\nPROBLEMA 2: Asignando titular vacío...");
        cuenta.titular = "";  // ⚠️ ¡Nadie nos detiene!
        System.out.println("cuenta.titular = \"\"");
        cuenta.mostrarInfo();
        System.out.println("¡DATO INVÁLIDO! El titular está vacío.");

        // PROBLEMA 3: Podemos modificar el número de cuenta
        System.out.println("\nPROBLEMA 3: Modificando número de cuenta...");
        cuenta.numeroCuenta = "999999";
        System.out.println("cuenta.numeroCuenta = \"999999\"");
        cuenta.mostrarInfo();
        System.out.println("¡PROBLEMA! El número de cuenta no debería cambiar.");
    }

    /**
     * Demuestra las ventajas de usar encapsulación.
     */
    private static void demostrarConEncapsulacion() {
        // Crear cuenta con encapsulación
        CuentaBancariaConEncapsulacion cuenta =
            new CuentaBancariaConEncapsulacion("789012", "Ana López", 1000.0);

        System.out.println("Cuenta creada:");
        cuenta.mostrarInfo();

        // VENTAJA 1: No podemos acceder directamente a los atributos
        System.out.println("\nNo podemos hacer: cuenta.saldo = -500");
        System.out.println("(Daría error de compilación)");

        // VENTAJA 2: El setter valida los datos
        System.out.println("\nIntentando establecer saldo negativo con setter...");
        cuenta.setSaldo(-500.0);  // ✅ El setter rechaza el valor

        // VENTAJA 3: Los métodos controlan las operaciones
        System.out.println("\nIntentando retirar más de lo disponible...");
        cuenta.retirar(2000.0);  // ✅ El método rechaza la operación

        // VENTAJA 4: Las operaciones válidas funcionan correctamente
        System.out.println("\nDepositando $500...");
        cuenta.depositar(500.0);

        System.out.println("\nRetirando $300...");
        cuenta.retirar(300.0);

        System.out.println("\nEstado final:");
        cuenta.mostrarInfo();

        // VENTAJA 5: Solo podemos leer el número de cuenta, no modificarlo
        System.out.println("\nNúmero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("(No hay setter para el número de cuenta - es de solo lectura)");
    }
}
# Ejercicio 1: Comparación - Con y Sin Encapsulación

## 🎯 Objetivo

Comparar el comportamiento y las ventajas de una clase **con encapsulación** versus una clase **sin encapsulación**, entendiendo por qué es importante proteger los datos.

---

## 📝 Descripción

Implementarás dos versiones de la misma clase `CuentaBancaria`:

1. **Sin encapsulación**: Atributos públicos, sin validación
2. **Con encapsulación**: Atributos privados, getters/setters con validación

Luego crearás un programa que demuestre las diferencias y problemas que surgen sin encapsulación.

---

## 📋 Requisitos

### Clase 1: `CuentaBancariaSinEncapsulacion`

- **Atributos públicos**:
  - `numeroCuenta` (String)
  - `titular` (String)
  - `saldo` (double)

- **Constructor**: Inicializa los tres atributos

- **Método**: `mostrarInfo()` - Imprime la información de la cuenta

### Clase 2: `CuentaBancariaConEncapsulacion`

- **Atributos privados**:
  - `numeroCuenta` (String)
  - `titular` (String)
  - `saldo` (double)

- **Constructor**: Inicializa los tres atributos con validación

- **Getters**: Para todos los atributos

- **Setters con validación**:
  - `setTitular()`: No debe estar vacío
  - `setSaldo()`: No debe ser negativo

- **Métodos de negocio**:
  - `depositar(double monto)`: Suma al saldo si monto > 0
  - `retirar(double monto)`: Resta del saldo si hay fondos suficientes
  - `mostrarInfo()`: Imprime la información

### Clase 3: `DemostracionEncapsulacion`

Programa principal que:
1. Crea una cuenta sin encapsulación
2. Muestra los problemas de acceso directo
3. Crea una cuenta con encapsulación
4. Demuestra las ventajas de la validación

---

## 🔍 Ejemplo de Salida Esperada

```
========================================
DEMOSTRACIÓN: SIN ENCAPSULACIÓN
========================================
Cuenta creada:
Cuenta[123456, Juan Pérez, $1000.00]

PROBLEMA 1: Asignando saldo negativo directamente...
cuenta.saldo = -500.0
Cuenta[123456, Juan Pérez, $-500.00]
¡DATO INVÁLIDO! El saldo es negativo.

PROBLEMA 2: Asignando titular vacío...
cuenta.titular = ""
Cuenta[123456, , $-500.00]
¡DATO INVÁLIDO! El titular está vacío.

========================================
DEMOSTRACIÓN: CON ENCAPSULACIÓN
========================================
Cuenta creada:
Cuenta[789012, Ana López, $1000.00]

Intentando establecer saldo negativo con setter...
Error: El saldo no puede ser negativo

Intentando retirar más de lo disponible...
No se puede retirar: fondos insuficientes

Depositando $500...
Depósito exitoso. Nuevo saldo: $1500.00

Retirando $300...
Retiro exitoso. Nuevo saldo: $1200.00

Estado final:
Cuenta[789012, Ana López, $1200.00]

========================================
CONCLUSIÓN
========================================
✓ Con encapsulación, los datos están protegidos
✓ La validación evita estados inválidos
✓ El comportamiento está controlado mediante métodos
```

---

## ✅ Criterios de Evaluación

| Criterio | Puntos |
|----------|--------|
| `CuentaBancariaSinEncapsulacion` correcta | 20% |
| `CuentaBancariaConEncapsulacion` correcta | 30% |
| Validación en setters | 20% |
| Demostración clara de diferencias | 20% |
| Código limpio y comentado | 10% |

---

## 💡 Pistas

1. En la versión sin encapsulación, puedes asignar directamente: `cuenta.saldo = -1000;`
2. En la versión con encapsulación, usa `if` en los setters para validar
3. Los métodos `depositar()` y `retirar()` deben validar antes de modificar el saldo
4. Usa `System.out.println()` para mostrar claramente cada problema

---

## 🚀 Desafío Extra (Opcional)

- Agrega un método `transferir()` en la versión con encapsulación
- Implementa un contador de transacciones
- Crea un historial de movimientos

---

**Archivos a crear**:
1. `CuentaBancariaSinEncapsulacion.java`
2. `CuentaBancariaConEncapsulacion.java`
3. `DemostracionEncapsulacion.java`

**¡Comienza a codificar!** 💻

