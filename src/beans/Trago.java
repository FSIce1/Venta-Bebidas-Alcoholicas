
package beans;

public class Trago {
    
    private int id_trago;
    private String descripcion_trago;
    private String id_cod_trago;
    private int unidadmd_trago;
    private Double cantidad_trago;
    private Double costo_trago;

    public Trago() {
    }

    public Trago(int id_trago, String descripcion_trago, String id_cod_trago, int unidadmd_trago, Double cantidad_trago, Double costo_trago) {
        this.id_trago = id_trago;
        this.descripcion_trago = descripcion_trago;
        this.id_cod_trago = id_cod_trago;
        this.unidadmd_trago = unidadmd_trago;
        this.cantidad_trago = cantidad_trago;
        this.costo_trago = costo_trago;
    }

    public int getId_trago() {
        return id_trago;
    }

    public void setId_trago(int id_trago) {
        this.id_trago = id_trago;
    }

    public String getDescripcion_trago() {
        return descripcion_trago;
    }

    public void setDescripcion_trago(String descripcion_trago) {
        this.descripcion_trago = descripcion_trago;
    }

    public String getId_cod_trago() {
        return id_cod_trago;
    }

    public void setId_cod_trago(String id_cod_trago) {
        this.id_cod_trago = id_cod_trago;
    }

    public int getUnidadmd_trago() {
        return unidadmd_trago;
    }

    public void setUnidadmd_trago(int unidadmd_trago) {
        this.unidadmd_trago = unidadmd_trago;
    }

    public Double getCantidad_trago() {
        return cantidad_trago;
    }

    public void setCantidad_trago(Double cantidad_trago) {
        this.cantidad_trago = cantidad_trago;
    }

    public Double getCosto_trago() {
        return costo_trago;
    }

    public void setCosto_trago(Double costo_trago) {
        this.costo_trago = costo_trago;
    }

    @Override
    public String toString() {
        return descripcion_trago;
    }
    
}
