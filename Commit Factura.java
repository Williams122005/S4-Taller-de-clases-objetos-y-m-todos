public class PruebaFactura {
    public static void main (String[] args) {
        String num = JOptionPane.showInputDialog("Ingrese el número de pieza:");
        String desc = JOptionPane.showInputDialog("Ingrese la descripción de la pieza:");

        int cant = JOptionPane.showInputDialog("Ingrese la cantidad:");
        double precio = JOptionPane.showInputDialog("Ingrese el precio por artículo:");

        Factura Factura1 = new Factura (num, desc, cant, precio);

        JOptionPane.showInputDialog(null, "El monto total dfe la factura es: " + factura1.obtenerMontoFactura());
    }
}