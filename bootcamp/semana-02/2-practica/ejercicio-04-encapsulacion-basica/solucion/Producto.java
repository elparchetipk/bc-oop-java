/**
 * Clase que representa un producto de tienda con encapsulación completa
 * Demuestra el uso de modificadores private, getters, setters y validaciones
 * 
 * @author SENA - Bootcamp POO Java
 * @version 1.0
 */
public class Producto {
  // ===== ATRIBUTOS PRIVADOS =====
  private String codigo;
  private String nombre;
  private double precio;
  private int stock;
  private String categoria;

  // ===== CONSTRUCTOR =====
  /**
   * Constructor que inicializa un producto validando todos los datos
   * 
   * @param codigo    Código del producto
   * @param nombre    Nombre del producto
   * @param precio    Precio unitario
   * @param stock     Cantidad en inventario
   * @param categoria Categoría del producto
   */
  public Producto(String codigo, String nombre, double precio, int stock, String categoria) {
    // Usar setters para aplicar validaciones
    setCodigo(codigo);
    setNombre(nombre);
    setPrecio(precio);
    setStock(stock);
    setCategoria(categoria);
  }

  // ===== GETTERS =====

  /**
   * Obtiene el código del producto
   * 
   * @return Código del producto
   */
  public String getCodigo() {
    return codigo;
  }

  /**
   * Obtiene el nombre del producto
   * 
   * @return Nombre del producto
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Obtiene el precio del producto
   * 
   * @return Precio unitario
   */
  public double getPrecio() {
    return precio;
  }

  /**
   * Obtiene el stock del producto
   * 
   * @return Cantidad en inventario
   */
  public int getStock() {
    return stock;
  }

  /**
   * Obtiene la categoría del producto
   * 
   * @return Categoría del producto
   */
  public String getCategoria() {
    return categoria;
  }

  // ===== SETTERS CON VALIDACIÓN =====

  /**
   * Establece el código del producto con validación
   * 
   * @param codigo Nuevo código (no puede estar vacío)
   */
  public void setCodigo(String codigo) {
    if (codigo != null && !codigo.trim().isEmpty()) {
      this.codigo = codigo;
    } else {
      System.out.println("✗ Error: El código no puede estar vacío");
    }
  }

  /**
   * Establece el nombre del producto con validación
   * 
   * @param nombre Nuevo nombre (mínimo 3 caracteres)
   */
  public void setNombre(String nombre) {
    if (nombre != null && nombre.trim().length() >= 3) {
      this.nombre = nombre;
    } else {
      System.out.println("✗ Error: El nombre debe tener al menos 3 caracteres");
    }
  }

  /**
   * Establece el precio del producto con validación
   * 
   * @param precio Nuevo precio (debe ser positivo)
   */
  public void setPrecio(double precio) {
    if (precio > 0) {
      this.precio = precio;
    } else {
      System.out.println("✗ Error: El precio debe ser positivo");
    }
  }

  /**
   * Establece el stock del producto con validación
   * 
   * @param stock Nueva cantidad (no puede ser negativa)
   */
  public void setStock(int stock) {
    if (stock >= 0) {
      this.stock = stock;
    } else {
      System.out.println("✗ Error: El stock no puede ser negativo");
    }
  }

  /**
   * Establece la categoría del producto con validación
   * 
   * @param categoria Nueva categoría (no puede estar vacía)
   */
  public void setCategoria(String categoria) {
    if (categoria != null && !categoria.trim().isEmpty()) {
      this.categoria = categoria;
    } else {
      System.out.println("✗ Error: La categoría no puede estar vacía");
    }
  }

  // ===== MÉTODOS DE NEGOCIO =====

  /**
   * Aplica un descuento al precio del producto
   * 
   * @param porcentaje Porcentaje de descuento (0-100)
   * @return true si se aplicó el descuento, false si el porcentaje es inválido
   */
  public boolean aplicarDescuento(double porcentaje) {
    if (porcentaje > 0 && porcentaje <= 100) {
      double descuento = precio * (porcentaje / 100);
      precio -= descuento;
      System.out.printf("✓ Descuento de %.1f%% aplicado. Nuevo precio: $%.2f\n", porcentaje, precio);
      return true;
    } else {
      System.out.println("✗ Error: El porcentaje debe estar entre 0 y 100");
      return false;
    }
  }

  /**
   * Realiza una venta reduciendo el stock
   * 
   * @param cantidad Cantidad a vender
   * @return true si la venta fue exitosa, false si no hay stock suficiente
   */
  public boolean vender(int cantidad) {
    if (cantidad <= 0) {
      System.out.println("✗ Error: La cantidad debe ser positiva");
      return false;
    }

    if (stock >= cantidad) {
      stock -= cantidad;
      System.out.printf("✓ Venta exitosa. Stock restante: %d unidades\n", stock);
      return true;
    } else {
      System.out.printf("✗ Error: Stock insuficiente. Disponible: %d\n", stock);
      return false;
    }
  }

  /**
   * Reabastecer el inventario
   * 
   * @param cantidad Cantidad a agregar
   * @return true si el reabastecimiento fue exitoso
   */
  public boolean reabastecer(int cantidad) {
    if (cantidad > 0) {
      stock += cantidad;
      System.out.printf("✓ Reabastecimiento exitoso. Nuevo stock: %d unidades\n", stock);
      return true;
    } else {
      System.out.println("✗ Error: La cantidad debe ser positiva");
      return false;
    }
  }

  /**
   * Calcula el valor total del inventario
   * 
   * @return Precio multiplicado por stock
   */
  public double obtenerValorInventario() {
    return precio * stock;
  }

  /**
   * Muestra toda la información del producto
   */
  public void mostrarInformacion() {
    System.out.println("========== INFORMACIÓN DEL PRODUCTO ==========");
    System.out.println("Código: " + codigo);
    System.out.println("Nombre: " + nombre);
    System.out.printf("Precio: $%.2f\n", precio);
    System.out.println("Stock: " + stock + " unidades");
    System.out.println("Categoría: " + categoria);
    System.out.printf("Valor Total en Inventario: $%.2f\n", obtenerValorInventario());
    System.out.println("==============================================");
  }
}
