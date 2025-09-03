package pedidos;

public class ProcesadorPedidos {

    public void procesarPedido(Pedido pedido) {
        double total = calcularTotal(pedido);

        procesarPago(pedido.getMetodoPago(), total);
        enviarConfirmacion(pedido, total);
        actualizarInventario(pedido);
    }

    private double calcularTotal(Pedido pedido) {
        double total = 0;

        for (DetallePedido detalle : pedido.getDetalles()) {
            double precio = obtenerPrecioProducto(detalle.getIdProducto());
            total += precio * detalle.getCantidad();
        }

        if (pedido.tieneDescuento()) {
            total -= total * pedido.getPorcentajeDescuento();
        }

        if (pedido.esEnvioExpress()) {
            total += 10.0;
        }

        return total;
    }

    private double obtenerPrecioProducto(int idProducto) {
        return idProducto * 10.0; // Simulación de precios
    }

    private void procesarPago(String metodoPago, double total) {
    switch (metodoPago) {
        case "tarjeta":
            System.out.println("Procesando pago con tarjeta por $" + total);
            break;
        case "paypal":
            System.out.println("Procesando pago con PayPal por $" + total);
            break;
        default:
            throw new IllegalArgumentException("Método de pago no soportado: " + metodoPago);
    }
}


    private void enviarConfirmacion(Pedido pedido, double total) {
        System.out.println("📧 Enviando email a: " + pedido.getNombreCliente());
        System.out.println("📦 Dirección de envío: " + pedido.getDireccionCliente());
        System.out.println("💲 Total de la compra: $" + total);
    }

    private void actualizarInventario(Pedido pedido) {
        for (DetallePedido detalle : pedido.getDetalles()) {
            System.out.println("Reduciendo stock de producto " + detalle.getIdProducto() +
                    " en " + detalle.getCantidad() + " unidades");
        }
    }
}
