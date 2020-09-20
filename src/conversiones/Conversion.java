
package conversiones;

public class Conversion {
    
    public static Double getML_A_ONZ(Double cantidad){
        return ((double)Math.round((cantidad/30.0) * 100d) / 100d);
    }
    
    public static Double getONZ_A_ML(Double cantidad){
        return ((double)Math.round((cantidad*30.0) * 100d) / 100d);
    }
    
}
