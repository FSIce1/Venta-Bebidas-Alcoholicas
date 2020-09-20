
package tablas;

import CADO.Cado;
import beans.BebidaVenta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class TablaBebidaVenta {
    
    private static List<BebidaVenta> bebidasventasestaticas = new ArrayList<>();
    
    public int insertarBebidaVenta(BebidaVenta bebidaVenta, int codVenta) {
        
        String sql;
        
        Cado cado = new Cado(); 
        
        sql = "INSERT INTO tb_bebida_venta (id_venta_fk,"
                + "id_trago_fk,"
                + "cantidad) VALUES (?,?,?)";
        
            try {
            
            Object[] parametros = new Object[3];

            //parametros[0]=bebidaVenta.getId_venta_fk().getId_venta();
            parametros[0]=codVenta;
            parametros[1]=bebidaVenta.getId_trago_fk().getId_trago();
            parametros[2]=bebidaVenta.getCantidad();
            
            if(cado.ejecutar1(sql,parametros)==1)
                return 1;
            
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
   
    public int eliminarventa(int codigo){
        
        String sql="delete from tb_bebida_venta where id_venta_fk="+codigo+"";
        
        Cado cado = new Cado(); 
        
        try {
            
            if(cado.ejecutarEliminar(sql)==1)
                return 1;
            
            return 0;
        } catch (SQLException e) {
            return 0;
        }
    }
    
        // LISTA DE BEBIDA_VENTA
    public static List<BebidaVenta> listaBebidasVentas(int codVenta) throws SQLException{
        
        String sql="select * from tb_bebida_venta WHERE id_venta_fk="+codVenta;
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        List<BebidaVenta> bebidas_ventas = new ArrayList<>();
        
        Connection c = cado.conexion();

        try {
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {                
                
                BebidaVenta bebidaVenta = new BebidaVenta();
                
                bebidaVenta.setId_bebida_venta(re.getInt("id_bebida_venta"));
                //bebidaVenta.setId_venta_fk(TablaVenta.buscaVenta(re.getInt("id_venta_fk")));
                bebidaVenta.setId_trago_fk(TablaTrago.buscaTrago(re.getInt("id_trago_fk")));
                bebidaVenta.setCantidad(re.getInt("cantidad"));
                
                bebidas_ventas.add(bebidaVenta);
            }
              
            return bebidas_ventas;
            
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
    
        // BUSCAR BEBIDA_VENTA
    public static BebidaVenta buscaBebidaVenta(int codigo) throws SQLException{
        
        String sql="select * from tb_bebida_venta WHERE id_bebida_venta="+codigo;
        
        Cado cado = new Cado(); 
        
        Statement st = null;
        ResultSet re = null;
        
        Connection c = cado.conexion();

        try {

            BebidaVenta bebidaVenta = null;
            
            st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            re = st.executeQuery(sql);
            
            while (re.next()) {
                    
                bebidaVenta = new BebidaVenta();
                
                bebidaVenta.setId_bebida_venta(re.getInt("id_bebida_venta"));
                //bebidaVenta.setId_venta_fk(TablaVenta.buscaVenta(re.getInt("id_venta_fk")));
                bebidaVenta.setId_trago_fk(TablaTrago.buscaTrago(re.getInt("id_trago_fk")));
                bebidaVenta.setCantidad(re.getInt("cantidad"));
                
            }
              
            return bebidaVenta;
            
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
    
    // UBICAR - POR ID
    
    public static BebidaVenta UbicarPorId(int bebidaVenta){
        for (int i = 0; i < bebidasventasestaticas.size(); i++) {
            if(bebidasventasestaticas.get(i).getId_bebida_venta()==bebidaVenta)
                return bebidasventasestaticas.get(i);
        }
        return null;
    }
    
    // UBICAR - ESTÁTICO 
    private static int Ubicar(BebidaVenta bebidaVenta){
        
        int pos=-1;
        
        for (int i = 0; i < bebidasventasestaticas.size(); i++) {
            if(String.valueOf(bebidasventasestaticas.get(i).getId_bebida_venta()).equals(String.valueOf(bebidaVenta.getId_bebida_venta()))){
                pos=i; // Lo encontró
                break;
            }
        }
        
        return pos;
    }
    
    // NUEVO - ESTÁTICO 
    public static boolean nuevaBebidaVentaEstatico(BebidaVenta bebidaVenta){
        
        if(Ubicar(bebidaVenta)==-1){
            bebidasventasestaticas.add(bebidaVenta);
            return true;
        }
        
        return false;
    }
    
    // ELIMINAR - ESTÁTICO 
    public static boolean eliminarBebidaVentaEstatico(BebidaVenta bebidaVenta) {
        boolean resultado;
        int posicion;
        
        resultado = false;

        posicion = Ubicar(bebidaVenta);
        if(posicion != -1) {
            bebidasventasestaticas.remove(posicion);
            resultado = true;
        }
        
        return resultado;                
    }
    
    public static List<BebidaVenta> listaestatica(){
        return bebidasventasestaticas;
    }
    
    public static void vaciarlistaestatica(){
        bebidasventasestaticas = new ArrayList<>();
    }
    
    /*
    public static void actualiza(){
        try {
            bebidasventasestaticas=TablaBebidaVenta.listaVentas();   
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
