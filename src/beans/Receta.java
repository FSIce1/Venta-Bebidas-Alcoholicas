
package beans;

public class Receta {
    
    private int id_receta;
    private Trago oTrago;
    private int id_trago_fk;
    private Insumo oInsumo;
    private int id_insumo_fk;
    private Double cantidad_receta;
    private int um_receta;

    public Receta() {
    }

    public Receta(int id_receta, Trago oTrago, Insumo oinsumo, Double cantidad_receta,int um_receta) {
        this.id_receta = id_receta;
        this.oTrago = oTrago;
        this.oInsumo = oinsumo;
        this.cantidad_receta = cantidad_receta;
        this.um_receta=um_receta;
    }

    public Receta(int id_receta, int id_trago_fk, int id_receta_fk, Double cantidad_receta, int um_receta) {
        this.id_receta = id_receta;
        this.id_trago_fk = id_trago_fk;
        this.id_insumo_fk = id_receta_fk;
        this.cantidad_receta = cantidad_receta;
        this.um_receta=um_receta;
    }

    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public Trago getoTrago() {
        return oTrago;
    }

    public void setoTrago(Trago oTrago) {
        this.oTrago = oTrago;
    }

    public int getId_trago_fk() {
        return id_trago_fk;
    }

    public void setId_trago_fk(int id_trago_fk) {
        this.id_trago_fk = id_trago_fk;
    }

    public Insumo getoInsumo() {
        return oInsumo;
    }

    public void setoInsumo(Insumo oInsumo) {
        this.oInsumo = oInsumo;
    }

    public int getId_insumo_fk() {
        return id_insumo_fk;
    }

    public void setId_insumo_fk(int id_insumo_fk) {
        this.id_insumo_fk = id_insumo_fk;
    }

    public Double getCantidad_receta() {
        return cantidad_receta;
    }

    public void setCantidad_receta(Double cantidad_receta) {
        this.cantidad_receta = cantidad_receta;
    }

    public int getUm_receta() {
        return um_receta;
    }

    public void setUm_receta(int um_receta) {
        this.um_receta = um_receta;
    }
}
