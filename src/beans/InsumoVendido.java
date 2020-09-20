
package beans;

public class InsumoVendido {

    private int id_insumo_vendido;
    private Insumo id_insumo_fk;
    private String insumo;
    private String um;
    private String suma;
    private String stock;
    private String original;
    private Double cantidad_insumo_vendido;
    private int um_insumo_vendido;

    public InsumoVendido() {
    }

    public InsumoVendido(int id_insumo_vendido, Insumo id_insumo_fk, Double cantidad_insumo_vendido, int um_insumo_vendido) {
        this.id_insumo_vendido = id_insumo_vendido;
        this.id_insumo_fk = id_insumo_fk;
        this.cantidad_insumo_vendido = cantidad_insumo_vendido;
        this.um_insumo_vendido = um_insumo_vendido;
    }

    public int getId_insumo_vendido() {
        return id_insumo_vendido;
    }

    public void setId_insumo_vendido(int id_insumo_vendido) {
        this.id_insumo_vendido = id_insumo_vendido;
    }

    public Insumo getId_insumo_fk() {
        return id_insumo_fk;
    }

    public void setId_insumo_fk(Insumo id_insumo_fk) {
        this.id_insumo_fk = id_insumo_fk;
    }

    public Double getCantidad_insumo_vendido() {
        return cantidad_insumo_vendido;
    }

    public void setCantidad_insumo_vendido(Double cantidad_insumo_vendido) {
        this.cantidad_insumo_vendido = cantidad_insumo_vendido;
    }

    public int getUm_insumo_vendido() {
        return um_insumo_vendido;
    }

    public void setUm_insumo_vendido(int um_insumo_vendido) {
        this.um_insumo_vendido = um_insumo_vendido;
    }

    public String getInsumo() {
        return insumo;
    }

    public void setInsumo(String insumo) {
        this.insumo = insumo;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public String getSuma() {
        return suma;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
    
    
    
}
