
package tablas;

import CADO.Cado;
import beans.Trago;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class TablaTrago {
    
    private static List<Trago> tragosestaticos = new ArrayList<>();
    
    public int insertarTrago(Trago trago) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "INSERT INTO tb_trago (descripcion_trago,"
                + "id_cod_trago,"
                + "unidadmd_trago,"
                + "cantidad_trago,"
                + "costo_trago) VALUES (?,?,?,?,?)";
        
            try {
            
            Object[] parametros = new Object[5];

            parametros[0]=trago.getDescripcion_trago().toUpperCase().trim();
            parametros[1]=trago.getId_cod_trago().toUpperCase();
            parametros[2]=trago.getUnidadmd_trago();
            parametros[3]=trago.getCantidad_trago();
            parametros[4]=trago.getCosto_trago();
            
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public int modificarTrago(Trago trago) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "UPDATE tb_trago set descripcion_trago=?,"
                + "id_cod_trago=?,"
                + "unidadmd_trago=?,"
                + "cantidad_trago=?,"
                + "costo_trago=? WHERE id_trago=?";
        
            try {
            
            Object[] parametros = new Object[6];

            parametros[0]=trago.getDescripcion_trago().toUpperCase().trim();
            parametros[1]=trago.getId_cod_trago().toUpperCase();
            parametros[2]=trago.getUnidadmd_trago();
            parametros[3]=trago.getCantidad_trago();
            parametros[4]=trago.getCosto_trago();
            parametros[5]=trago.getId_trago();
        
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
   
    public int eliminarTrago(int codigo){
        
        String sql="delete from tb_trago where id_trago="+codigo+"";
        
        Cado cado = new Cado(); 
        
        try {
            
            if(cado.ejecutarEliminar(sql)==1)
                return 1;
            
            return 0;
        } catch (SQLException e) {
            return 0;
        }
    }
    
        // LISTA DE TRAGOS
    public static List<Trago> listaTragos() throws SQLException{
        
        String sql="select * from tb_trago";
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        List<Trago> tragos = new ArrayList<>();
        
        Connection c = cado.conexion();

        try {
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {                
                
                Trago trago = new Trago();
                
                trago.setId_trago(re.getInt("id_trago"));
                trago.setDescripcion_trago(re.getString("descripcion_trago"));
                trago.setId_cod_trago(re.getString("id_cod_trago"));
                trago.setUnidadmd_trago(re.getInt("unidadmd_trago"));
                trago.setCantidad_trago(re.getDouble("cantidad_trago"));
                trago.setCosto_trago(re.getDouble("costo_trago"));
                
                tragos.add(trago);
            }
              
            return tragos;
            
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
    
        // BUSCAR TRAGO
    public static Trago buscaTrago(int codigo) throws SQLException{
        
        String sql="select * from tb_trago WHERE id_trago="+codigo;
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        Connection c = cado.conexion();

        try {

            Trago trago = null;
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {
                    
                trago = new Trago();
                   
                trago.setId_trago(re.getInt("id_trago"));
                trago.setDescripcion_trago(re.getString("descripcion_trago"));
                trago.setId_cod_trago(re.getString("id_cod_trago"));
                trago.setUnidadmd_trago(re.getInt("unidadmd_trago"));
                trago.setCantidad_trago(re.getDouble("cantidad_trago"));
                trago.setCosto_trago(re.getDouble("costo_trago"));
                
            }
              
            return trago;
            
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
    
    public static int existeTrago(String codigo) throws SQLException{

        ResultSet re = null;
        
        try {

            Cado cd = new Cado();
            
                String sql="SELECT COUNT(id_cod_trago) FROM tb_trago WHERE id_cod_trago='"+codigo+"'";

            re=cd.Recuperar(sql);
            
            re.next();
            
            return re.getInt(1);
            
        } catch (SQLException e) {
            return 0;
        } finally {

            if (re != null) {
                re.close();
            }

        }

    }
    
    public static void actualiza(){
        try {
            tragosestaticos=TablaTrago.listaTragos();   
        } catch (SQLException e) {
        }
    }
    
    public static List<Trago> seleccionar(String filtro){
        
        actualiza();
        
        List<Trago> resultado=new ArrayList<>();
        
        for (int i = 0; i < tragosestaticos.size(); i++) {
            if(tragosestaticos.get(i).getDescripcion_trago().length()>filtro.length()){
                if(tragosestaticos.get(i).getDescripcion_trago().toUpperCase().trim().substring(0, filtro.length()).equals(filtro)){
                    resultado.add(tragosestaticos.get(i));
                }
            }
        }
        
        return resultado;
    } 
    
}
