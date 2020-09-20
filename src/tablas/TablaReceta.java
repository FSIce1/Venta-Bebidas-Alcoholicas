
package tablas;

import CADO.Cado;
import beans.Receta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class TablaReceta {
    
    private static List<Receta> recetasestaticos = new ArrayList<>();
    
    public int InsertarReceta(Receta receta) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "INSERT INTO tb_receta (id_trago_fk,"
                + "id_insumo_fk,"
                + "um_receta,"
                + "cantidad_receta) VALUES (?,?,?,?)";
        
        try {
            
            Object[] parametros = new Object[4];

            parametros[0]=receta.getoTrago().getId_trago();//receta.getId_trago_fk();
            parametros[1]=receta.getoInsumo().getId_insumo();
            parametros[2]=receta.getUm_receta();
            parametros[3]=receta.getCantidad_receta();
            
            if(cado.ejecutar1(sql,parametros)==1){
                //TablaRecetas.actualiza(TablaReceta.listaObreros(""));
                return 1;
            }
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public int ModificarReceta(Receta receta) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "UPDATE tb_receta set id_trago_fk=?,"
                + "id_insumo_fk=?,"
                + "um_receta=?,"
                + "cantidad_receta=? WHERE id_receta=?";
        
        try {
            
            Object[] parametros = new Object[5];

            parametros[0]=receta.getoTrago().getId_trago();
            parametros[1]=receta.getoInsumo().getId_insumo();
            parametros[2]=receta.getUm_receta();
            parametros[3]=receta.getCantidad_receta();
            parametros[4]=receta.getId_receta();
            
            
            if(cado.ejecutar1(sql,parametros)==1){
                //TablaRecetas.actualiza(TablaReceta.listaObreros(""));
                return 1;
            }
            
            return 0;
            
        } catch (SQLException ex) {
            return 0;
        }
    }
   
    public int eliminarReceta(int codigo){
        
        String sql="delete from tb_receta where id_receta="+codigo+"";
        
        Cado cado = new Cado(); 
        
        try {
        
            if(cado.ejecutarEliminar(sql)==1){
                //TablaRecetas.actualiza(TablaReceta.listaObreros(""));
                return 1;
            }
            
            return 0;
            
        } catch (SQLException e) {
            return 0;
        }
        
    }

        // LISTA DE RECETAS
    public static List<Receta> listaRecetas(int codTrago) throws SQLException{
        
        String sql="select * from tb_receta where id_trago_fk="+codTrago;
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        List<Receta> recetas = new ArrayList<>();
        
        Connection c = cado.conexion();

        try {
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {                
                
                Receta receta = new Receta();
                
                receta.setId_receta(re.getInt("id_receta"));
                receta.setoTrago(TablaTrago.buscaTrago(re.getInt("id_trago_fk")));
                receta.setoInsumo(TablaInsumo.buscaInsumo(re.getInt("id_insumo_fk")));
                receta.setUm_receta(re.getInt("um_receta"));
                receta.setCantidad_receta(re.getDouble("cantidad_receta"));
                
                recetas.add(receta);
            }
              
            return recetas;
            
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
    
        // BUSCAR RECETA
    public static Receta buscaReceta(int codigo) throws SQLException{
        
        String sql="select * from tb_receta WHERE id_receta="+codigo;
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        Connection c = cado.conexion();

        try {

            Receta receta = null;
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {
                
                receta = new Receta();
                
                receta.setId_receta(re.getInt("id_receta"));
                receta.setoTrago(TablaTrago.buscaTrago(re.getInt("id_trago_fk")));
                receta.setoInsumo(TablaInsumo.buscaInsumo(re.getInt("id_insumo_fk")));
                receta.setUm_receta(re.getInt("um_receta"));
                receta.setCantidad_receta(re.getDouble("cantidad_receta"));
                
            }
              
            return receta;
            
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
    
    /*
    public static void actualiza(){
        try {
            recetasestaticos=TablaReceta.listaRecetas();   
        } catch (SQLException e) {
        }
    }
    */
    
    public static List<Receta> seleccionar(String filtro){
        
        //actualiza();
        
        System.out.println("El filtro es: "+filtro);
        
        List<Receta> resultado=new ArrayList<>();
        
        for (int i = 0; i < recetasestaticos.size(); i++) {
            
            System.out.println(""+recetasestaticos.get(i).getoTrago().getId_cod_trago());
            
            if(recetasestaticos.get(i).getoTrago()!=null){
                if(recetasestaticos.get(i).getoTrago().getId_cod_trago().equals(filtro))
                    resultado.add(recetasestaticos.get(i));
            } else {
                System.out.println("El trago ha sido eliminado de la base de datos");
            }
            
        }
        
        return resultado;
    } 
    
}
