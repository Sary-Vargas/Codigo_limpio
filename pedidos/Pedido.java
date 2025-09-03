package pedidos;

import java.util.List;

public class Pedido {
    private final String nombreCliente;
    private final String direccionCliente;
    private final List<DetallePedido> detalles;
    private final boolean descuento;
    private final double porcentajeDescuento;
    private final boolean envioExpress;
    private final String metodoPago;

    public Pedido(String nombreCliente, String direccionCliente,
                  List<DetallePedido> detalles,
                  boolean descuento, double porcentajeDescuento,
                  boolean envioExpress, String metodoPago) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.detalles = detalles;
        this.descuento = descuento;
        this.porcentajeDescuento = porcentajeDescuento;
        this.envioExpress = envioExpress;
        this.metodoPago = metodoPago;
    }

    public String getNombreCliente() { return nombreCliente; }
    public String getDireccionCliente() { return direccionCliente; }
    public List<DetallePedido> getDetalles() { return detalles; }
    public boolean tieneDescuento() { return descuento; }
    public double getPorcentajeDescuento() { return porcentajeDescuento; }
    public boolean esEnvioExpress() { return envioExpress; }
    public String getMetodoPago() { return metodoPago; }
}
