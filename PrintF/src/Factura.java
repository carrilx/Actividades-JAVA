public class Factura {
    public static void main(String[] args) {
        // Datos de ejemplo
        String producto = "Laptop";
        int cantidad = 5;
        double precioUnitario = 899.99;
        double total = cantidad * precioUnitario;
        double iva = total * 0.16;
        double totalConIva = total + iva;

        // Encabezado
        System.out.println("=== FACTURA ===\n");

        // Cabecera de la tabla
        System.out.printf("%-12s %10s %15s %15s%n", "Producto", "Cantidad", "P. Unitario", "Total");
        System.out.println("---------------------------------------------------------------");

        // Línea de producto
        System.out.printf("%-12s %10d %15s%14.2f%n", producto, cantidad, "$", precioUnitario);
        System.out.printf("%-12s %10s %15s%14.2f%n", "", "", "$", total);

        // Espacio y totales
        System.out.println();
        System.out.printf("Subtotal: %15s$%.2f%n", "", total);
        System.out.printf("IVA (16%%): %14s$%.2f%n", "", iva);
        System.out.printf("Total a pagar: %8s$%.2f%n", "", totalConIva);
    }
}