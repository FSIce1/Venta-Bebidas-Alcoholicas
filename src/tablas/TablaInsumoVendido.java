
package tablas;

import CADO.Cado;
import beans.InsumoVendido;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TablaInsumoVendido {
    
    public static int insertarInsumoVendido(int id_insumo,Double cantidad,int um_insumo,Date dia) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "INSERT INTO tb_insumo_vendido (id_insumo_fk,"
                + "cantidad_insumo_vendido,"
                + "um_insumo_vendido,"
                + "dia_insumo_vendido) VALUES (?,?,?,?)";
        
            try {
            
            Object[] parametros = new Object[4];

            parametros[0]=id_insumo;
            parametros[1]=cantidad;
            parametros[2]=um_insumo;
            parametros[3]=new java.sql.Date(dia.getTime());
            
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
        // LISTA DE INSUMOS VENDIDOS
    public static List<InsumoVendido> listaInsumosVendidos(String modo,Date dia) throws SQLException{
        
        SimpleDateFormat simpleC = new SimpleDateFormat("yyyy-MM-dd");
        String sql;
        
        if(modo.equals("DIADEHOY")){
            
            Calendar calenda = GregorianCalendar.getInstance();
            Date fecha = calenda.getTime();       
            
            sql="SELECT i.id_insumo,i.nombre__insumo,\n" +
"CASE v.um_insumo_vendido\n" +
"WHEN 0 THEN 'ONZ'\n" +
"WHEN 1 THEN 'UM'\n" +
"WHEN 2 THEN 'ML'\n" +
"END, \n" +
"SUM(v.cantidad_insumo_vendido), i.cantidad_insumo as stock, (SUM(v.cantidad_insumo_vendido)+i.cantidad_insumo) as Original\n" +
"FROM tb_insumo i LEFT JOIN tb_insumo_vendido v ON i.id_insumo=v.id_insumo_fk\n" +
"WHERE v.dia_insumo_vendido='"+simpleC.format(fecha)+"'\n" +
"GROUP BY i.id_insumo,i.nombre__insumo";
            
        } else {
            
        sql="SELECT i.id_insumo,i.nombre__insumo,\n" +
"CASE v.um_insumo_vendido\n" +
"WHEN 0 THEN 'ONZ'\n" +
"WHEN 1 THEN 'UM'\n" +
"WHEN 2 THEN 'ML'\n" +
"END, \n" +
"SUM(v.cantidad_insumo_vendido), i.cantidad_insumo as stock, (SUM(v.cantidad_insumo_vendido)+i.cantidad_insumo) as Original\n" +
"FROM tb_insumo i LEFT JOIN tb_insumo_vendido v ON i.id_insumo=v.id_insumo_fk\n" +
"WHERE v.dia_insumo_vendido='"+simpleC.format(dia)+"'\n" +
"GROUP BY i.id_insumo,i.nombre__insumo";
        
        }
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        List<InsumoVendido> insumos = new ArrayList<>();
        
        Connection c = cado.conexion();

        try {
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {                
                
                InsumoVendido insumo = new InsumoVendido();
                
                insumo.setId_insumo_vendido(re.getInt(1));
                insumo.setInsumo(re.getString(2));
                insumo.setUm(re.getString(3));
                insumo.setSuma(re.getString(4));
                insumo.setStock(re.getString(5));
                insumo.setOriginal(re.getString(6));
                
                insumos.add(insumo);
            }
              
            return insumos;
            
        } catch (SQLException e) {
            return null;
        } finally {

            if (re != null) {
                re.close();
            }

            if (st != null) {
                st.close();
            }

            cado.closeCnx(c);
        }
        
    }
    
}
