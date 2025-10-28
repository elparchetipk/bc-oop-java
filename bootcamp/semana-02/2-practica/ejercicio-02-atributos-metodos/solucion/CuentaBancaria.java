/**
 * Clase que representa una cuenta bancaria con operaciones básicas
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class CuentaBancaria {
  // ===== ATRIBUTOS =====
  String numeroCuenta;
  String titular;
  double saldo;
  boolean activa;

  // ===== MÉTODOS =====

  /**
   * Deposita dinero en la cuenta
   * 
   * @param monto Cantidad a depositar
   */
  public void depositar(double monto) {
    if (monto > 0) {
      saldo += monto;
      System.out.printf("✓ Depósito exitoso. Nuevo saldo: $%.2f\n", saldo);
    } else {
      System.out.println("✗ El monto debe ser positivo");
    }
  }

  /**
   * Retira dinero de la cuenta si hay fondos suficientes
   * 
   * @param monto Cantidad a retirar
   */
  public void retirar(double monto) {
    if (monto <= 0) {
      System.out.println("✗ El monto debe ser positivo");
    } else if (saldo >= monto) {
      saldo -= monto;
      System.out.printf("✓ Retiro exitoso. Nuevo saldo: $%.2f\n", saldo);
    } else {
      System.out.printf("✗ Fondos insuficientes. Saldo disponible: $%.2f\n", saldo);
    }
  }

  /**
   * Consulta el saldo actual de la cuenta
   * 
   * @return Saldo actual
   */
  public double consultarSaldo() {
    return saldo;
  }

  /**
   * Muestra toda la información de la cuenta
   */
  public void mostrarInformacion() {
    System.out.println("========== INFORMACIÓN DE LA CUENTA ==========");
    System.out.println("Número de Cuenta: " + numeroCuenta);
    System.out.println("Titular: " + titular);
    System.out.printf("Saldo: $%.2f\n", saldo);
    System.out.println("Estado: " + (activa ? "Activa" : "Inactiva"));
    System.out.println("==============================================");
  }

  /**
   * Verifica si la cuenta está activa
   * 
   * @return true si está activa, false si no
   */
  public boolean estaActiva() {
    return activa;
  }
}
