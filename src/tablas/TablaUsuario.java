
package tablas;

import CADO.Cado;
import beans.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TablaUsuario {
    
        // BUSCAR USUARIO
    public static Usuario buscaUsuario(int codigo,String usu,String contra) throws SQLException{
        
        String sql;
        
        if(codigo==-1)
            sql="select * from tb_usuario WHERE cuenta_usuario='"+usu+"' AND contra_usuario='"+contra+"'";
        else
            sql="select * from tb_usuario WHERE id_usuario="+codigo;
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        Connection c = cado.conexion();

        try {

                
            Usuario usuario = null;
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {
                
                usuario = new Usuario();
                
                usuario.setId_usuario(re.getInt("id_usuario"));
                usuario.setCuenta_usuario(re.getString("cuenta_usuario"));
                usuario.setContra_usuario(re.getString("contra_usuario"));
            }
              
            return usuario;
            
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
    
    public static int existeUser(String usu, String contra) throws SQLException{

        String sql;
        
        ResultSet re = null;
        
        try {

            Cado cd = new Cado();
            
            if(contra.equals("")){ // BUSCAR EL USUARIO POR SU ID

                sql="SELECT COUNT(cuenta_usuario) FROM tb_usuario WHERE cuenta_usuario='"+usu+"'";

            } else {
            
               sql="SELECT COUNT(cuenta_usuario) FROM tb_usuario WHERE cuenta_usuario='"+usu+"' "
                         + "AND contra_usuario='"+contra+"'";

            }
            
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
    
}
