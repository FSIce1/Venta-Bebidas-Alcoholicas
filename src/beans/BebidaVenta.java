
package beans;

public class BebidaVenta {
    
    private int id_bebida_venta;
    private Venta id_venta_fk;
    private Trago id_trago_fk;
    private int id_trago;
    private int cantidad;

    public BebidaVenta() {
    }

    public BebidaVenta(int id_bebida_venta, Venta id_venta_fk, Trago id_trago_fk, int id_trago, int cantidad) {
        this.id_bebida_venta = id_bebida_venta;
        this.id_venta_fk = id_venta_fk;
        this.id_trago_fk = id_trago_fk;
        this.id_trago = id_trago;
        this.cantidad = cantidad;
    }

    public int getId_bebida_venta() {
        return id_bebida_venta;
    }

    public void setId_bebida_venta(int id_bebida_venta) {
        this.id_bebida_venta = id_bebida_venta;
    }

    public Venta getId_venta_fk() {
        return id_venta_fk;
    }

    public void setId_venta_fk(Venta id_venta_fk) {
        this.id_venta_fk = id_venta_fk;
    }

    public Trago getId_trago_fk() {
        return id_trago_fk;
    }

    public void setId_trago_fk(Trago id_trago_fk) {
        this.id_trago_fk = id_trago_fk;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_trago() {
        return id_trago;
    }

    public void setId_trago(int id_trago) {
        this.id_trago = id_trago;
    }
    
}
