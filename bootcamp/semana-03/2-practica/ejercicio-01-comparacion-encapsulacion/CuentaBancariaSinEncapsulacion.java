/**
 * Clase CuentaBancaria SIN encapsulación.
 * Demuestra los problemas de tener atributos públicos sin protección.
 * <p>
 * PROBLEMAS:
 * - Los datos pueden ser modificados sin validación
 * - No hay control sobre los valores asignados
 * - Puede llevar a estados inválidos (saldo negativo, titular vacío)
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class CuentaBancariaSinEncapsulacion {

  // ⚠️ PROBLEMA: Atributos públicos (sin protección)
  public String numeroCuenta;
  public String titular;
  public double saldo;

  /**
   * Constructor que inicializa la cuenta.
   *
   * @param numeroCuenta Número de la cuenta
   * @param titular      Nombre del titular
   * @param saldo        Saldo inicial
   */
  public CuentaBancariaSinEncapsulacion(String numeroCuenta, String titular, double saldo) {
    this.numeroCuenta = numeroCuenta;
    this.titular = titular;
    this.saldo = saldo;
  }

  /**
   * Muestra la información de la cuenta.
   */
  public void mostrarInfo() {
    System.out.printf("Cuenta[%s, %s, $%.2f]%n", numeroCuenta, titular, saldo);
  }
}

