/**
 * Clase de prueba para Sistema de Inventario
 * 
 * Demuestra el modelado de un sistema de inventario del mundo real
 * con productos, ventas y gestión de stock.
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class PruebaInventario {

  public static void main(String[] args) {
    System.out.println("╔═══════════════════════════════════════════════════════╗");
    System.out.println("║  EJERCICIO 04: MODELADO DEL MUNDO REAL - INVENTARIO  ║");
    System.out.println("╚═══════════════════════════════════════════════════════╝\n");

    // ===== CREAR PRODUCTOS =====
    System.out.println(">>> Creando productos...\n");

    Producto laptop = new Producto();
    laptop.codigo = "TECH-001";
    laptop.nombre = "Laptop Dell XPS 15";
    laptop.categoria = "Tecnología";
    laptop.precio = 3500000;
    laptop.stock = 8;
    laptop.stockMinimo = 5;
    laptop.proveedor = "Dell Colombia";

    Producto mouse = new Producto();
    mouse.codigo = "TECH-002";
    mouse.nombre = "Mouse Logitech MX Master";
    mouse.categoria = "Accesorios";
    mouse.precio = 250000;
    mouse.stock = 3;
    mouse.stockMinimo = 10;
    mouse.proveedor = "Logitech";

    Producto teclado = new Producto();
    teclado.codigo = "TECH-003";
    teclado.nombre = "Teclado Mecánico Keychron K2";
    teclado.categoria = "Accesorios";
    teclado.precio = 450000;
    teclado.stock = 15;
    teclado.stockMinimo = 8;
    teclado.proveedor = "Keychron";

    Producto monitor = new Producto();
    monitor.codigo = "TECH-004";
    monitor.nombre = "Monitor LG 27'' 4K";
    monitor.categoria = "Tecnología";
    monitor.precio = 1200000;
    monitor.stock = 0;
    monitor.stockMinimo = 3;
    monitor.proveedor = "LG Electronics";

    // ===== MOSTRAR CATÁLOGO =====
    System.out.println("═══════════════════════════════════════════════════");
    System.out.println("            CATÁLOGO DE PRODUCTOS");
    System.out.println("═══════════════════════════════════════════════════\n");

    System.out.println("1. " + laptop.nombre + " - $" + String.format("%.2f", laptop.precio) +
        " | Stock: " + laptop.stock);
    System.out.println("2. " + mouse.nombre + " - $" + String.format("%.2f", mouse.precio) +
        " | Stock: " + mouse.stock);
    System.out.println("3. " + teclado.nombre + " - $" + String.format("%.2f", teclado.precio) +
        " | Stock: " + teclado.stock);
    System.out.println("4. " + monitor.nombre + " - $" + String.format("%.2f", monitor.precio) +
        " | Stock: " + monitor.stock);

    // ===== APLICAR DESCUENTOS =====
    System.out.println("\n\n>>> Aplicando descuentos...\n");

    laptop.aplicarDescuento(10);
    System.out.println();

    teclado.aplicarDescuento(15);

    // ===== REALIZAR VENTAS =====
    System.out.println("\n\n>>> Procesando ventas...\n");

    laptop.vender(2);
    System.out.println();

    mouse.vender(1);
    System.out.println();

    teclado.vender(5);
    System.out.println();

    // Intentar vender sin stock
    monitor.vender(1);

    // ===== VERIFICAR ALERTAS =====
    System.out.println("\n\n>>> Verificando alertas de stock...\n");

    System.out.println("⚠️  PRODUCTOS QUE NECESITAN REPOSICIÓN:");
    if (laptop.necesitaReposicion()) {
      System.out.println("   - " + laptop.nombre + " (Stock: " + laptop.stock +
          ", Mínimo: " + laptop.stockMinimo + ")");
    }
    if (mouse.necesitaReposicion()) {
      System.out.println("   - " + mouse.nombre + " (Stock: " + mouse.stock +
          ", Mínimo: " + mouse.stockMinimo + ")");
    }
    if (teclado.necesitaReposicion()) {
      System.out.println("   - " + teclado.nombre + " (Stock: " + teclado.stock +
          ", Mínimo: " + teclado.stockMinimo + ")");
    }
    if (monitor.necesitaReposicion()) {
      System.out.println("   - " + monitor.nombre + " (Stock: " + monitor.stock +
          ", Mínimo: " + monitor.stockMinimo + ")");
    }

    // ===== REPONER STOCK =====
    System.out.println("\n\n>>> Reponiendo stock...\n");

    mouse.agregarStock(15);
    System.out.println();

    monitor.agregarStock(10);

    // ===== COMPARACIONES =====
    System.out.println("\n\n>>> Comparaciones...\n");

    if (laptop.esMasCaroQue(teclado)) {
      System.out.println("✓ " + laptop.nombre + " es más caro que " + teclado.nombre);
    }

    System.out.println("\n💰 Valor del inventario por producto:");
    System.out.println("   " + laptop.nombre + ": $" +
        String.format("%.2f", laptop.calcularValorInventario()));
    System.out.println("   " + mouse.nombre + ": $" +
        String.format("%.2f", mouse.calcularValorInventario()));
    System.out.println("   " + teclado.nombre + ": $" +
        String.format("%.2f", teclado.calcularValorInventario()));
    System.out.println("   " + monitor.nombre + ": $" +
        String.format("%.2f", monitor.calcularValorInventario()));

    // ===== DETALLE DE UN PRODUCTO =====
    System.out.println("\n\n>>> Mostrando detalle de un producto...");
    laptop.mostrarInformacion();

    // ===== ESTADÍSTICAS FINALES =====
    System.out.println("\n\n╔═══════════════════════════════════════════════╗");
    System.out.println("║         ESTADÍSTICAS DEL INVENTARIO           ║");
    System.out.println("╚═══════════════════════════════════════════════╝\n");

    int totalProductos = 4;
    int stockTotal = laptop.stock + mouse.stock + teclado.stock + monitor.stock;
    double valorTotal = laptop.calcularValorInventario() + mouse.calcularValorInventario() +
        teclado.calcularValorInventario() + monitor.calcularValorInventario();

    int disponibles = 0;
    if (laptop.estaDisponible())
      disponibles++;
    if (mouse.estaDisponible())
      disponibles++;
    if (teclado.estaDisponible())
      disponibles++;
    if (monitor.estaDisponible())
      disponibles++;

    System.out.println("Total de productos:        " + totalProductos);
    System.out.println("Productos disponibles:     " + disponibles);
    System.out.println("Stock total:               " + stockTotal + " unidades");
    System.out.println("Valor total del inventario: $" + String.format("%.2f", valorTotal));

    System.out.println("\n✓ Ejercicio completado exitosamente.");
  }
}
