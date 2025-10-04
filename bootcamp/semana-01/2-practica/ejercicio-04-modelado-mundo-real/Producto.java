/**
 * Clase Producto - Sistema de Inventario
 * 
 * Esta clase modela un producto de tienda con gestión de stock,
 * precios y descuentos.
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class Producto {
  // ===== ATRIBUTOS =====
  String codigo;
  String nombre;
  String categoria;
  double precio;
  int stock;
  int stockMinimo;
  String proveedor;

  // ===== MÉTODOS =====

  /**
   * Muestra la información completa del producto
   */
  public void mostrarInformacion() {
    System.out.println("\n╔═══════════════════════════════════════════════╗");
    System.out.println("║        INFORMACIÓN DEL PRODUCTO               ║");
    System.out.println("╠═══════════════════════════════════════════════╣");
    System.out.println("║ Código:     " + codigo);
    System.out.println("║ Nombre:     " + nombre);
    System.out.println("║ Categoría:  " + categoria);
    System.out.println("║ Precio:     $" + String.format("%.2f", precio));
    System.out.println("║ Stock:      " + stock + " unidades");
    System.out.println("║ Mín. Stock: " + stockMinimo + " unidades");
    System.out.println("║ Proveedor:  " + proveedor);

    if (necesitaReposicion()) {
      System.out.println("║ ⚠️  ALERTA:  Requiere reposición");
    }
    System.out.println("╚═══════════════════════════════════════════════╝");
  }

  /**
   * Aplica un descuento al precio del producto
   * 
   * @param porcentaje porcentaje de descuento (0-100)
   */
  public void aplicarDescuento(double porcentaje) {
    if (porcentaje > 0 && porcentaje <= 100) {
      double descuento = precio * (porcentaje / 100);
      double precioAnterior = precio;
      precio = precio - descuento;
      System.out.println("💰 Descuento aplicado a \"" + nombre + "\"");
      System.out.println("   Antes: $" + String.format("%.2f", precioAnterior));
      System.out.println("   Ahora: $" + String.format("%.2f", precio) + " (-" + porcentaje + "%)");
    } else {
      System.out.println("❌ Porcentaje de descuento inválido");
    }
  }

  /**
   * Vende una cantidad del producto
   * 
   * @param cantidad cantidad a vender
   * @return true si la venta fue exitosa, false si no hay stock
   */
  public boolean vender(int cantidad) {
    if (cantidad > 0 && cantidad <= stock) {
      stock -= cantidad;
      double total = cantidad * precio;
      System.out.println("✓ Venta registrada:");
      System.out.println("  Producto: " + nombre);
      System.out.println("  Cantidad: " + cantidad + " unidades");
      System.out.println("  Total: $" + String.format("%.2f", total));
      System.out.println("  Stock restante: " + stock);

      if (necesitaReposicion()) {
        System.out.println("  ⚠️ ALERTA: Stock bajo, necesita reposición");
      }
      return true;
    } else if (cantidad > stock) {
      System.out.println("❌ Stock insuficiente para \"" + nombre + "\"");
      System.out.println("   Solicitado: " + cantidad + " | Disponible: " + stock);
      return false;
    } else {
      System.out.println("❌ Cantidad inválida");
      return false;
    }
  }

  /**
   * Agrega stock al producto
   * 
   * @param cantidad cantidad a agregar
   */
  public void agregarStock(int cantidad) {
    if (cantidad > 0) {
      stock += cantidad;
      System.out.println("📦 Stock agregado a \"" + nombre + "\"");
      System.out.println("   + " + cantidad + " unidades");
      System.out.println("   Stock total: " + stock);
    } else {
      System.out.println("❌ Cantidad inválida");
    }
  }

  /**
   * Verifica si el producto necesita reposición
   * 
   * @return true si el stock está por debajo del mínimo
   */
  public boolean necesitaReposicion() {
    return stock < stockMinimo;
  }

  /**
   * Verifica si el producto está disponible
   * 
   * @return true si hay stock disponible
   */
  public boolean estaDisponible() {
    return stock > 0;
  }

  /**
   * Calcula el valor total del inventario de este producto
   * 
   * @return valor total (precio * stock)
   */
  public double calcularValorInventario() {
    return precio * stock;
  }

  /**
   * Compara si este producto es más caro que otro
   * 
   * @param otroProducto producto con el que se comparará
   * @return true si este producto es más caro
   */
  public boolean esMasCaroQue(Producto otroProducto) {
    return this.precio > otroProducto.precio;
  }
}
