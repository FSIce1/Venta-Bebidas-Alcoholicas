
package beans;

public class Equivalencia {
    
    private int id_equivalencia;
    private int grupo_equivalencia;
    private Insumo oInsumo;
    private int id_insumo_fk;
    private Double peso_equivalencia;
    private Double peso_envase_equivalencia;

    public Equivalencia() {
    }

    public Equivalencia(int id_equivalencia, int grupo_equivalencia, Insumo oInsumo, Double peso_equivalencia, Double peso_envase_equivalencia) {
        this.id_equivalencia = id_equivalencia;
        this.grupo_equivalencia = grupo_equivalencia;
        this.oInsumo = oInsumo;
        this.peso_equivalencia = peso_equivalencia;
        this.peso_envase_equivalencia = peso_envase_equivalencia;
    }

    public Equivalencia(int id_equivalencia, int grupo_equivalencia, int id_insumo_fk, Double peso_equivalencia, Double peso_envase_equivalencia) {
        this.id_equivalencia = id_equivalencia;
        this.grupo_equivalencia = grupo_equivalencia;
        this.id_insumo_fk = id_insumo_fk;
        this.peso_equivalencia = peso_equivalencia;
        this.peso_envase_equivalencia = peso_envase_equivalencia;
    }

    public int getId_equivalencia() {
        return id_equivalencia;
    }

    public void setId_equivalencia(int id_equivalencia) {
        this.id_equivalencia = id_equivalencia;
    }

    public int getGrupo_equivalencia() {
        return grupo_equivalencia;
    }

    public void setGrupo_equivalencia(int grupo_equivalencia) {
        this.grupo_equivalencia = grupo_equivalencia;
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

    public Double getPeso_equivalencia() {
        return peso_equivalencia;
    }

    public void setPeso_equivalencia(Double peso_equivalencia) {
        this.peso_equivalencia = peso_equivalencia;
    }

    public Double getPeso_envase_equivalencia() {
        return peso_envase_equivalencia;
    }

    public void setPeso_envase_equivalencia(Double peso_envase_equivalencia) {
        this.peso_envase_equivalencia = peso_envase_equivalencia;
    }
    
}
