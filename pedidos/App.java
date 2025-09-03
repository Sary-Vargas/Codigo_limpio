package pedidos;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Creamos los detalles del pedido
        List<DetallePedido> detalles = Arrays.asList(
                new DetallePedido(1, 2),
                new DetallePedido(2, 1),
                new DetallePedido(3, 5)
        );

        // Creamos el pedido
        Pedido pedido = new Pedido(
                "Juan Pérez",
                "Calle 123",
                detalles,
                true,   // descuento
                0.1,    // 10% de descuento
                true,   // envío express
                "tarjeta"
        );

        // Procesamos el pedido
        ProcesadorPedidos procesador = new ProcesadorPedidos();
        procesador.procesarPedido(pedido);
    }
}
