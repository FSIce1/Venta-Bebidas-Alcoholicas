
package tablas;

import CADO.Cado;
import beans.Insumo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class TablaInsumo {
    
    private static List<Insumo> insumosestaticos = new ArrayList<>();
    private static List<Insumo> insumosestaticosVIRTUAL = new ArrayList<>();
    
    public int insertarInsumo(Insumo insumo) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "INSERT INTO tb_insumo (codigo_p__insumo,"
                + "nombre__insumo,"
                + "cantidad_insumo,"
                + "um_insumo) VALUES (?,?,?,?)";
        
            try {
            
            Object[] parametros = new Object[4];

            parametros[0]=insumo.getCodigo_p__insumo();
            parametros[1]=insumo.getNombre_insumo();
            parametros[2]=insumo.getCantidad_insumo();
            parametros[3]=insumo.getUm_insumo();
            
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public int modificarInsumo(Insumo insumo) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "UPDATE tb_insumo set codigo_p__insumo=?,"
                + "nombre__insumo=?,"
                + "cantidad_insumo=?,"
                + "um_insumo=? WHERE id_insumo=?";
        
            try {
            
            Object[] parametros = new Object[5];

            parametros[0]=insumo.getCodigo_p__insumo();
            parametros[1]=insumo.getNombre_insumo();
            parametros[2]=insumo.getCantidad_insumo();
            parametros[3]=insumo.getUm_insumo();
            parametros[4]=insumo.getId_insumo();
        
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static int modificarCantidadInsumo(int cod,Double cantidadNueva) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "UPDATE tb_insumo set cantidad_insumo=? WHERE id_insumo=?";
        
            try {
            
            Object[] parametros = new Object[2];

            parametros[0]=((double)Math.round(cantidadNueva * 100d) / 100d);
            parametros[1]=cod;
        
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
   
    public int eliminarInsumo(int codigo){
        
        String sql="delete from tb_insumo where id_insumo="+codigo+"";
        
        Cado cado = new Cado(); 
        
        try {
            
            if(cado.ejecutarEliminar(sql)==1)
                return 1;
            
            return 0;
        } catch (SQLException e) {
            return 0;
        }
    }
    
        // LISTA DE INSUMOS
    public static List<Insumo> listaInsumos() throws SQLException{
        
        String sql="select * from tb_insumo";
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        List<Insumo> insumos = new ArrayList<>();
        
        Connection c = cado.conexion();

        try {
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {                
                
                Insumo insumo = new Insumo();
                
                insumo.setId_insumo(re.getInt("id_insumo"));
                insumo.setCodigo_p__insumo(re.getString("codigo_p__insumo"));
                insumo.setNombre_insumo(re.getString("nombre__insumo"));
                insumo.setUm_insumo(re.getInt("um_insumo"));
                insumo.setCantidad_insumo(re.getDouble("cantidad_insumo"));
                
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
    
        // BUSCAR INSUMO
    public static Insumo buscaInsumo(int codigo) throws SQLException{
        
        String sql="select * from tb_insumo WHERE id_insumo="+codigo;
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        Connection c = cado.conexion();

        try {

            Insumo insumo = null;
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {
                    
                insumo = new Insumo();
                   
                insumo.setId_insumo(re.getInt("id_insumo"));
                insumo.setCodigo_p__insumo(re.getString("codigo_p__insumo"));
                insumo.setNombre_insumo(re.getString("nombre__insumo"));
                insumo.setUm_insumo(re.getInt("um_insumo"));
                insumo.setCantidad_insumo(re.getDouble("cantidad_insumo"));
                
            }
              
            return insumo;
            
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
    
    public static int existeInsumo(String codigo) throws SQLException{

        ResultSet re = null;
        
        try {

            Cado cd = new Cado();
            
            String sql="SELECT COUNT(codigo_p__insumo) FROM tb_insumo WHERE codigo_p__insumo='"+codigo+"'";

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
            insumosestaticos=TablaInsumo.listaInsumos();   
        } catch (SQLException e) {
        }
    }
    
    public static List<Insumo> seleccionar(String filtro){
        
        actualiza();
        
        List<Insumo> resultado=new ArrayList<>();
        
        for (int i = 0; i < insumosestaticos.size(); i++) {
            if(insumosestaticos.get(i).getNombre_insumo().length()>filtro.length()){
                if(insumosestaticos.get(i).getNombre_insumo().toUpperCase().trim().substring(0, filtro.length()).equals(filtro)){
                    resultado.add(insumosestaticos.get(i));
                }
            }
        }
        
        return resultado;
    } 
    
    
    // PARTE ESTÁTICA
    
    public static void actualizaVIRTUAL(List<Insumo> lista){
        insumosestaticosVIRTUAL=lista; 
    }
    
    // UBICAR - ESTÁTICO 
    private static int Ubicar(Insumo insumo){
        
        int pos=-1;
        
        for (int i = 0; i < insumosestaticosVIRTUAL.size(); i++) {
            if(String.valueOf(insumosestaticosVIRTUAL.get(i).getId_insumo()).equals(String.valueOf(insumo.getId_insumo()))){
                pos=i; // Lo encontró
                break;
            }
        }
        
        return pos;
    }
    
    public static Insumo cambioAEstatico(int codigo){
        for (int i = 0; i < insumosestaticosVIRTUAL.size(); i++) {
            if(insumosestaticosVIRTUAL.get(i).getId_insumo()==codigo){
                return insumosestaticosVIRTUAL.get(i);
            }
        }
        return null;
    }
    
    // MODIFICAR _ ESTÁTICO
    public static boolean modificar(Insumo insumo){
        int pos=Ubicar(insumo);
        
        if(pos!=-1){
            insumosestaticosVIRTUAL.set(pos, insumo);
            return true;
        }
        
        return false;
    }
    
    
}
