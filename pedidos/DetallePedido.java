package pedidos;

public class DetallePedido {
    private final int idProducto;
    private final int cantidad;

    public DetallePedido(int idProducto, int cantidad) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public int getIdProducto() { return idProducto; }
    public int getCantidad() { return cantidad; }
}
