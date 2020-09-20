
package beans;

import conversiones.Conversion;

public class Insumo {
    
    private int id_insumo;
    private String codigo_p__insumo;
    private String nombre_insumo;
    private Double cantidad_insumo;
    private int um_insumo;
    
    
    private Double cantidadNecesaria;
    private int unidadReceta;

    public Insumo() {
        cantidadNecesaria=0.0;
        unidadReceta=-1;
    }

    public Insumo(int id_insumo, String codigo_p__insumo, String nombre_insumo, Double cantidad_insumo, int um_insumo) {
        this.id_insumo = id_insumo;
        this.codigo_p__insumo = codigo_p__insumo;
        this.nombre_insumo = nombre_insumo;
        this.cantidad_insumo = cantidad_insumo;
        this.um_insumo = um_insumo;
        
        cantidadNecesaria=0.0;
        unidadReceta=-1;
    }

    public int getId_insumo() {
        return id_insumo;
    }

    public void setId_insumo(int id_insumo) {
        this.id_insumo = id_insumo;
    }

    public String getCodigo_p__insumo() {
        return codigo_p__insumo;
    }

    public void setCodigo_p__insumo(String codigo_p__insumo) {
        this.codigo_p__insumo = codigo_p__insumo;
    }

    public String getNombre_insumo() {
        return nombre_insumo;
    }

    public void setNombre_insumo(String nombre_insumo) {
        this.nombre_insumo = nombre_insumo;
    }

    public Double getCantidad_insumo() {
        return cantidad_insumo;
    }

    public void setCantidad_insumo(Double cantidad_insumo) {
        this.cantidad_insumo = cantidad_insumo;
    }

    public int getUm_insumo() {
        return um_insumo;
    }

    public void setUm_insumo(int um_insumo) {
        this.um_insumo = um_insumo;
    }
    
    
    public Double getCantidadNecesaria(){
        return cantidadNecesaria;
    }
    
    public void setCantidadNecesaria(Double cantidad){
        this.cantidadNecesaria=cantidad;
    }
    
    public int getUnidadReceta(){
        return unidadReceta;
    }
    
    public void setUnidadReceta(int unidadReceta){
        this.unidadReceta=unidadReceta;
    }

    @Override
    public String toString() {
        
        //return this.nombre_insumo +" || N: "+cantidadNecesaria+" / T: "+cantidad_insumo;
        
        /*
        String cond;
        String unidad="";
        Double canti=0.0;
        
        switch(unidadReceta){
            case 0:
                unidad="ONZ";
                break;
            
            case 1:
                unidad="UND";
                break;
            
            case 2:
                unidad="ML";
                break;
        }
        if(um_insumo==unidadReceta){
            canti=cantidad_insumo;
        } else if(um_insumo==2 && unidadReceta==0){
            // CONVIERTO DE ML A ONZ
            canti=Conversion.getML_A_ONZ(cantidad_insumo);
        } else if(um_insumo==0 && unidadReceta==2){
            // CONVIERTO DE ONZ A ML
            canti=Conversion.getONZ_A_ML(cantidad_insumo);
        }

        if(canti-cantidadNecesaria<0)
            cond="- Stock insuficiente tienes "+canti+" "+unidad+" de "+cantidadNecesaria+" "+unidad;
        else
            cond="- Cantidad: "+cantidadNecesaria+" "+unidad;
                    
        return this.nombre_insumo+" "+cond;
        */
        
        return this.nombre_insumo;
    }
    
}