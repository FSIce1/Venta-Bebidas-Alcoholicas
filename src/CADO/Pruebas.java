
package CADO;

import java.sql.SQLException;
import reportes.GenerarReportes;

// ML = ONZ / 0.033814
// ONZ A gr --> /0.035274

public class Pruebas {

    public static void main(String[] args) throws SQLException {
        
        try {
            
            //GenerarReportes.reportes("REPORTE_VENTAS",48,null);
            
            Cado c = new Cado();
            
            System.out.println(c.cn);
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
    }
    
}
