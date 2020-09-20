
package beans;

import java.util.Date;

public class Venta {
    
    private int id_venta;
    private String codigo_venta;
    private Double total_venta;
    private Date fecha_venta;
    private String hora_venta;

    public Venta() {
    }

    public Venta(int id_venta, String codigo_venta, Double total_venta, Date fecha_venta, String hora_venta) {
        this.id_venta = id_venta;
        this.codigo_venta = codigo_venta;
        this.total_venta = total_venta;
        this.fecha_venta = fecha_venta;
        this.hora_venta = hora_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(Double total_venta) {
        this.total_venta = total_venta;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getHora_venta() {
        return hora_venta;
    }

    public void setHora_venta(String hora_venta) {
        this.hora_venta = hora_venta;
    }

    public String getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(String codigo_venta) {
        this.codigo_venta = codigo_venta;
    }
    
}
