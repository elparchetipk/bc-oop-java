/**
 * Clase CuentaBancaria CON encapsulación.
 * Demuestra las ventajas de proteger los datos y validar las operaciones.
 * <p>
 * VENTAJAS:
 * - Los datos están protegidos (privados)
 * - Validación en setters evita estados inválidos
 * - Control total sobre las operaciones
 * - Mantiene la integridad de los datos
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class CuentaBancariaConEncapsulacion {

  // ✅ BIEN: Atributos privados (protegidos)
  private String numeroCuenta;
  private String titular;
  private double saldo;

  /**
   * Constructor que inicializa la cuenta con validación.
   *
   * @param numeroCuenta Número de la cuenta
   * @param titular      Nombre del titular
   * @param saldo        Saldo inicial
   */
  public CuentaBancariaConEncapsulacion(String numeroCuenta, String titular, double saldo) {
    this.numeroCuenta = numeroCuenta;
    setTitular(titular);  // Usa setter con validación
    setSaldo(saldo);      // Usa setter con validación
  }

  // ========================================
  // GETTERS
  // ========================================

  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  public String getTitular() {
    return titular;
  }

  /**
   * Establece el titular de la cuenta.
   *
   * @param titular Nombre del titular (no puede estar vacío)
   */
  public void setTitular(String titular) {
    if (titular == null || titular.trim().isEmpty()) {
      System.out.println("Error: El titular no puede estar vacío");
      return;
    }
    this.titular = titular;
  }

  // ========================================
  // SETTERS CON VALIDACIÓN
  // ========================================

  public double getSaldo() {
    return saldo;
  }

  /**
   * Establece el saldo de la cuenta.
   *
   * @param saldo Nuevo saldo (no puede ser negativo)
   */
  public void setSaldo(double saldo) {
    if (saldo < 0) {
      System.out.println("Error: El saldo no puede ser negativo");
      return;
    }
    this.saldo = saldo;
  }

  // ========================================
  // MÉTODOS DE NEGOCIO
  // ========================================

  /**
   * Deposita dinero en la cuenta.
   *
   * @param monto Cantidad a depositar
   * @return true si el depósito fue exitoso, false en caso contrario
   */
  public boolean depositar(double monto) {
    if (monto <= 0) {
      System.out.println("Error: El monto debe ser mayor a 0");
      return false;
    }
    saldo += monto;
    System.out.printf("Depósito exitoso. Nuevo saldo: $%.2f%n", saldo);
    return true;
  }

  /**
   * Retira dinero de la cuenta.
   *
   * @param monto Cantidad a retirar
   * @return true si el retiro fue exitoso, false en caso contrario
   */
  public boolean retirar(double monto) {
    if (monto <= 0) {
      System.out.println("Error: El monto debe ser mayor a 0");
      return false;
    }
    if (monto > saldo) {
      System.out.println("No se puede retirar: fondos insuficientes");
      return false;
    }
    saldo -= monto;
    System.out.printf("Retiro exitoso. Nuevo saldo: $%.2f%n", saldo);
    return true;
  }

  /**
   * Muestra la información de la cuenta.
   */
  public void mostrarInfo() {
    System.out.printf("Cuenta[%s, %s, $%.2f]%n", numeroCuenta, titular, saldo);
  }
}

