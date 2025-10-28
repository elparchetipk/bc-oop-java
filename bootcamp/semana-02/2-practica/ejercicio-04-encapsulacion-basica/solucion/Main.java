/**
 * Clase principal que demuestra encapsulación y validación de datos
 * 
 * @author SENA - Bootcamp POO Java
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("=== TIENDA - Gestión de Productos ===\n");

    // ===== CREAR PRODUCTO VÁLIDO =====
    System.out.println("Creando producto válido...");
    Producto p1 = new Producto("P001", "Laptop HP Pavilion", 2500000, 15, "Electrónica");
    System.out.println("✓ Producto creado exitosamente\n");

    p1.mostrarInformacion();

    // ===== APLICAR DESCUENTO =====
    System.out.println("\n=== APLICANDO DESCUENTO ===");
    System.out.println("Aplicando 10% de descuento...");
    p1.aplicarDescuento(10);

    // ===== VENTAS =====
    System.out.println("\n=== VENTA ===");
    System.out.println("Vendiendo 5 unidades...");
    p1.vender(5);

    System.out.println("\nVendiendo 20 unidades...");
    p1.vender(20);

    // ===== REABASTECIMIENTO =====
    System.out.println("\n=== REABASTECIMIENTO ===");
    System.out.println("Reabasteciendo 25 unidades...");
    p1.reabastecer(25);

    // ===== VALIDACIONES =====
    System.out.println("\n=== VALIDACIONES ===");

    System.out.println("Intentando establecer precio negativo...");
    p1.setPrecio(-1000);

    System.out.println("\nIntentando establecer stock negativo...");
    p1.setStock(-5);

    System.out.println("\nIntentando establecer nombre corto...");
    p1.setNombre("XY");

    System.out.println("\nIntentando establecer código vacío...");
    p1.setCodigo("");

    System.out.println("\nIntentando establecer categoría vacía...");
    p1.setCategoria("   ");

    // ===== ESTADO FINAL =====
    System.out.println("\n=== ESTADO FINAL ===");
    System.out.println("Código: " + p1.getCodigo());
    System.out.printf("Precio: $%.2f\n", p1.getPrecio());
    System.out.println("Stock: " + p1.getStock() + " unidades");
    System.out.printf("Valor inventario: $%.2f\n", p1.obtenerValorInventario());

    // ===== SEGUNDO PRODUCTO (con datos inválidos) =====
    System.out.println("\n\n=== CREANDO PRODUCTO CON DATOS INVÁLIDOS ===");
    Producto p2 = new Producto("", "XY", -100, -5, "");
    System.out.println("\nProducto p2 creado (con errores de validación)");

    // Corregir datos
    System.out.println("\n=== CORRIGIENDO DATOS ===");
    p2.setCodigo("P002");
    p2.setNombre("Mouse Logitech");
    p2.setPrecio(50000);
    p2.setStock(100);
    p2.setCategoria("Periféricos");

    System.out.println("\n✓ Datos corregidos");
    p2.mostrarInformacion();

    // ===== MÚLTIPLES PRODUCTOS =====
    System.out.println("\n\n=== INVENTARIO COMPLETO ===");

    Producto p3 = new Producto("P003", "Teclado Mecánico", 180000, 30, "Periféricos");
    Producto p4 = new Producto("P004", "Monitor LG 24\"", 450000, 8, "Electrónica");

    Producto[] inventario = { p1, p2, p3, p4 };

    double valorTotal = 0;
    for (int i = 0; i < inventario.length; i++) {
      System.out.println("\nProducto " + (i + 1) + ":");
      System.out.println("  Código: " + inventario[i].getCodigo());
      System.out.println("  Nombre: " + inventario[i].getNombre());
      System.out.printf("  Precio: $%.2f\n", inventario[i].getPrecio());
      System.out.println("  Stock: " + inventario[i].getStock());
      System.out.printf("  Valor: $%.2f\n", inventario[i].obtenerValorInventario());

      valorTotal += inventario[i].obtenerValorInventario();
    }

    System.out.println("\n========================================");
    System.out.printf("VALOR TOTAL DEL INVENTARIO: $%.2f\n", valorTotal);
    System.out.println("========================================");

    // ===== DEMOSTRACIÓN DE ENCAPSULACIÓN =====
    System.out.println("\n\n=== DEMOSTRACIÓN DE ENCAPSULACIÓN ===");
    System.out.println("Los atributos son privados, por lo que:");
    System.out.println("✗ NO se puede hacer: p1.precio = -1000");
    System.out.println("✓ SOLO se puede modificar vía setters con validación");
    System.out.println("✓ Esto protege la integridad de los datos");

    // Intentar acceso directo causaría error de compilación:
    // p1.precio = -1000; // Error: precio has private access in Producto
  }
}
