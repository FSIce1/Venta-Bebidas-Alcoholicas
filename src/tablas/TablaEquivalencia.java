
package tablas;

import CADO.Cado;
import beans.Equivalencia;
import beans.Insumo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class TablaEquivalencia {
    
    private static List<Equivalencia> equivalenciasestaticos = new ArrayList<>();
    
    public int insertarEquivalencia(Equivalencia equivalencia) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "INSERT INTO tb_equivalencia (grupo_equivalencia,"
                + "id_insumo_fk,"
                + "peso_equivalencia,"
                + "peso_envase_equivalencia) VALUES (?,?,?,?)";
        
            try {
            
            Object[] parametros = new Object[4];

            parametros[0]=equivalencia.getGrupo_equivalencia();
            parametros[1]=equivalencia.getoInsumo().getId_insumo();
            parametros[2]=equivalencia.getPeso_equivalencia();
            parametros[3]=equivalencia.getPeso_envase_equivalencia();
            
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public int modificarEquivalencia(Equivalencia equivalencia) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "UPDATE tb_equivalencia set grupo_equivalencia=?,"
                + "id_insumo_fk=?,"
                + "peso_equivalencia=?,"
                + "peso_envase_equivalencia=? WHERE id_equivalencia=?";
        
            try {
            
            Object[] parametros = new Object[5];

            
            parametros[0]=equivalencia.getGrupo_equivalencia();
            parametros[1]=equivalencia.getoInsumo().getId_insumo();
            parametros[2]=equivalencia.getPeso_equivalencia();
            parametros[3]=equivalencia.getPeso_envase_equivalencia();
            parametros[4]=equivalencia.getId_equivalencia();
        
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
   
    public int eliminarInsumo(int codigo){
        
        String sql="delete from tb_equivalencia where id_equivalencia="+codigo+"";
        
        Cado cado = new Cado(); 
        
        try {
            
            if(cado.ejecutarEliminar(sql)==1)
                return 1;
            
            return 0;
        } catch (SQLException e) {
            return 0;
        }
    }
    
        // LISTA DE EQUIVALENCIAS
    public static List<Equivalencia> listaEquivalencias() throws SQLException{
        
        String sql="select * from tb_equivalencia";
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        List<Equivalencia> equivalencias = new ArrayList<>();
        
        Connection c = cado.conexion();

        try {
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {                
                
                Equivalencia equivalencia = new Equivalencia();
                
                equivalencia.setId_equivalencia(re.getInt("id_equivalencia"));
                equivalencia.setGrupo_equivalencia(re.getInt("grupo_equivalencia"));
                equivalencia.setoInsumo(TablaInsumo.buscaInsumo(re.getInt("id_insumo_fk")));
                equivalencia.setPeso_equivalencia(re.getDouble("peso_equivalencia"));
                equivalencia.setPeso_envase_equivalencia(re.getDouble("peso_envase_equivalencia"));
                
                equivalencias.add(equivalencia);
            }
              
            return equivalencias;
            
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
    
        // BUSCAR EQUIVALENCIA
    public static Equivalencia buscaEquivalencia(int codigo) throws SQLException{
        
        String sql="select * from tb_equivalencia WHERE id_equivalencia="+codigo;
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        Connection c = cado.conexion();

        try {

            Equivalencia equivalencia = null;
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {
                    
                equivalencia = new Equivalencia();
                   
                equivalencia.setId_equivalencia(re.getInt("id_equivalencia"));
                equivalencia.setGrupo_equivalencia(re.getInt("grupo_equivalencia"));
                equivalencia.setoInsumo(TablaInsumo.buscaInsumo(re.getInt("id_insumo_fk")));
                equivalencia.setPeso_equivalencia(re.getDouble("peso_equivalencia"));
                equivalencia.setPeso_envase_equivalencia(re.getDouble("peso_envase_equivalencia"));
                
                
            }
              
            return equivalencia;
            
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
    
    public static List<Insumo> listaInsumosSinEquivalencia() throws SQLException{

        List<Insumo> insumosConEquivalencias= new ArrayList<>();
        
        try {
            
            List<Insumo> insumos=TablaInsumo.listaInsumos();
            
            for (int i = 0; i < insumos.size(); i++) {
                if(existeEquivalencia(insumos.get(i).getId_insumo())==0)
                    insumosConEquivalencias.add(insumos.get(i));
            }
            
        } catch (SQLException e) {
            return null;
        }
                
        return insumosConEquivalencias;
    }
    
    public static int existeEquivalencia(int codigo) throws SQLException{

        ResultSet re = null;
        
        try {

            Cado cd = new Cado();
            
            String sql="SELECT COUNT(id_insumo_fk) FROM tb_equivalencia WHERE id_insumo_fk="+codigo;

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
            equivalenciasestaticos=TablaEquivalencia.listaEquivalencias();   
        } catch (SQLException e) {
        }
    }
    
    public static List<Equivalencia> seleccionar(String filtro){
        
        actualiza();
        
        List<Equivalencia> resultado=new ArrayList<>();
        
        for (int i = 0; i < equivalenciasestaticos.size(); i++) {
            if(equivalenciasestaticos.get(i).getoInsumo().getNombre_insumo().length()>filtro.length()){
                if(equivalenciasestaticos.get(i).getoInsumo().getNombre_insumo().toUpperCase().trim().substring(0, filtro.length()).equals(filtro)){
                    resultado.add(equivalenciasestaticos.get(i));
                }
            }
        }
        
        return resultado;
    } 
    
}
