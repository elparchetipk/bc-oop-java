/**
 * Clase principal para probar CuentaBancaria
 * 
 * @author SENA - Bootcamp POO Java
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("=== EJERCICIO 02 - Cuenta Bancaria ===\n");

    // Crear primera cuenta
    CuentaBancaria cuenta1 = new CuentaBancaria();
    cuenta1.numeroCuenta = "1001-2023";
    cuenta1.titular = "Ana Martínez";
    cuenta1.saldo = 0;
    cuenta1.activa = true;

    System.out.println("Creando cuenta...");
    cuenta1.mostrarInformacion();

    // Realizar operaciones
    System.out.println("\nDepositando $500000.00...");
    cuenta1.depositar(500000);

    System.out.println("\nDepositando $250000.00...");
    cuenta1.depositar(250000);

    System.out.println("\nRetirando $100000.00...");
    cuenta1.retirar(100000);

    System.out.println("\nIntentando retirar $800000.00...");
    cuenta1.retirar(800000);

    System.out.println("\nConsultando saldo...");
    double saldoActual = cuenta1.consultarSaldo();
    System.out.printf("Saldo final: $%.2f\n\n", saldoActual);

    cuenta1.mostrarInformacion();

    // Segunda cuenta para comparar
    System.out.println("\n\n=== SEGUNDA CUENTA ===\n");

    CuentaBancaria cuenta2 = new CuentaBancaria();
    cuenta2.numeroCuenta = "1002-2023";
    cuenta2.titular = "Pedro Gómez";
    cuenta2.saldo = 1000000;
    cuenta2.activa = true;

    cuenta2.mostrarInformacion();

    System.out.println("\nRetirando $300000.00...");
    cuenta2.retirar(300000);

    System.out.println("\nVerificando si la cuenta está activa...");
    if (cuenta2.estaActiva()) {
      System.out.println("✓ La cuenta está activa");
    } else {
      System.out.println("✗ La cuenta está inactiva");
    }

    System.out.println();
    cuenta2.mostrarInformacion();
  }
}
