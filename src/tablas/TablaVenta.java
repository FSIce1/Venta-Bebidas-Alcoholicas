
package tablas;

import CADO.Cado;
import beans.Venta;
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

public class TablaVenta {
    
    //private static List<Venta> ventasestaticas = new ArrayList<>();
    
    public int insertarVenta(Venta venta) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "INSERT INTO tb_venta (codigo_venta,"
                + "total_venta,"
                + "fecha_venta,"
                + "hora_venta) VALUES (?,?,?,?)";
        
            try {
            
            Object[] parametros = new Object[4];

            parametros[0]=venta.getCodigo_venta();
            parametros[1]=venta.getTotal_venta();
            parametros[2]=new java.sql.Date(venta.getFecha_venta().getTime());
            parametros[3]=venta.getHora_venta();
            
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
   
    public int eliminarventa(int codigo){
        
        String sql="delete from tb_venta where id_venta="+codigo+"";
        
        Cado cado = new Cado(); 
        
        try {
            
            if(cado.ejecutarEliminar(sql)==1)
                return 1;
            
            return 0;
        } catch (SQLException e) {
            return 0;
        }
    }
    
        // LISTA DE VENTAS
    public static List<Venta> listaVentas(String modo,Date dia) throws SQLException{
        
        SimpleDateFormat simpleC = new SimpleDateFormat("yyyy-MM-dd");

        String sql="";
        
        switch (modo) {
            case "DIADEHOY":
                
                Calendar calenda = GregorianCalendar.getInstance();
                Date fecha = calenda.getTime();        
                
                sql="select * from tb_venta WHERE fecha_venta='"+simpleC.format(fecha)+"'";//fechaAsistencia='"+simpleC.format(fecha)+"'"
                break;
            case "DIASELECCIONADO":
                sql="select * from tb_venta WHERE fecha_venta='"+simpleC.format(dia)+"'";
                break;
            case "TODOS":
                sql="select * from tb_venta";
                break;
            default:
                break;
        }
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        List<Venta> ventas = new ArrayList<>();
        
        Connection c = cado.conexion();

        try {
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {                
                
                Venta venta = new Venta();
                
                venta.setId_venta(re.getInt("id_venta"));
                venta.setCodigo_venta(re.getString("codigo_venta"));
                venta.setTotal_venta(re.getDouble("total_venta"));
                venta.setFecha_venta(re.getDate("fecha_venta"));
                venta.setHora_venta(re.getString("hora_venta"));
                
                ventas.add(venta);
            }
              
            return ventas;
            
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
    
        // BUSCAR VENTA
    public static Venta buscaVenta(int codigo,String codCorrelativo) throws SQLException{
        String sql;
        
        if(codCorrelativo.equals(""))
            sql="select * from tb_venta WHERE id_venta="+codigo;
        else
            sql="select * from tb_venta WHERE codigo_venta='"+codCorrelativo+"'";

        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        Connection c = cado.conexion();

        try {

            Venta venta = null;
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {
                    
                venta = new Venta();
                   
                venta.setId_venta(re.getInt("id_venta"));
                venta.setCodigo_venta(re.getString("codigo_venta"));
                venta.setTotal_venta(re.getDouble("total_venta"));
                venta.setFecha_venta(re.getDate("fecha_venta"));
                venta.setHora_venta(re.getString("hora_venta"));
                
            }
              
            return venta;
            
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
    
    public static int existeVenta(String cuenta) throws SQLException{

        String sql;
        
        ResultSet re = null;
        
        try {

            Cado cd = new Cado();
            
            sql="SELECT COUNT(codigo_venta) FROM tb_venta WHERE codigo_venta='"+cuenta+"'";

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
    
    /*
    public static void actualiza(){
        try {
            ventasestaticas=TablaVenta.listaVentas();   
        } catch (SQLException e) {
        }
    }
    */
    
    /*
    public static List<Venta> seleccionar(String filtro){
        
        actualiza();
        
        List<Venta> resultado=new ArrayList<>();
        
        for (int i = 0; i < ventasestaticas.size(); i++) {
            if(ventasestaticas.get(i).getoInsumo().getNombre_insumo().length()>filtro.length()){
                if(ventasestaticas.get(i).getoInsumo().getNombre_insumo().toUpperCase().trim().substring(0, filtro.length()).equals(filtro)){
                    resultado.add(ventasestaticas.get(i));
                }
            }
        }
        
        return resultado;
    } 
    */
}
