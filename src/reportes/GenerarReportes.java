
package reportes;

import CADO.Cado;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GenerarReportes {

    public static void reporte(String tipo,Date date){
        
        try {
            
            Cado cad=new Cado();
            
            String mensaje;
            String titulo;
            
            Map parametros = new HashMap();
            
            switch (tipo) {
                case "REPORTE_BEBIDAS":
                    mensaje="ReporteDeBebidas.jasper";
                    titulo="Reporte De Bebidas";
                    
                    // Pasamos los parámetros
                   
                    //parametros.put("diahoy", date);
                    
                    break;
                case "REPORTE":
                    mensaje="Reporte.jasper";
                    titulo="Reporte de bebidas";
                    break;
                default:
                    mensaje="";
                    titulo="";
                    break;
            }
            
            JasperReport reporte = (JasperReport) JRLoader.loadObject(mensaje);
            
            JasperPrint js = JasperFillManager.fillReport(reporte, parametros,cad.conexion());
            JasperViewer jv = new JasperViewer(js,false);
            
            jv.setTitle(titulo);

            jv.setVisible(true);
            
        } catch (JRException e) {
            //new alertas.ErrorAlert(null, true, "Hubo un error en el repore").setVisible(true);
        }
        
    }
    
    
    public static void reportes(String modo, int cod,Date dia){
        
            
        try {
            Cado cad=new Cado();
            String reporte="";
            String titulo="";
            
            Map parametros= new HashMap();
            
            switch(modo){
                case "REPORTE_BEBIDAS":
                    titulo="Reporte de Bebidas";
                    reporte="ReporteDeBebidas.jrxml";
                    break;
                    
                case "REPORTE_INSUMOS":
                    titulo="Reporte de Insumos";
                    reporte="ReporteDeInsumos.jrxml";
                    break;
                    
                case "REPORTE_RECETAS":
                    titulo="Reporte de Recetas";
                    reporte="ReporteDeRecetas.jrxml";
                    break;
                
                case "REPORTE_EQUIVALENCIA":
                    titulo="Reporte de Equivalencias";
                    reporte="ReporteEquivalencia.jrxml";
                    break;
                    
                case "REPORTE_VENTAS":
                    titulo="Reporte de Venta";
                    parametros.put("cod_venta", cod);
                    reporte="ReporteVenta.jrxml";
                    break;
                    
                case "REPORTE_INSUMOS_UTILIZADOS":
                    titulo="Reporte de Insumos Utilizados";
                    parametros.put("diaA", dia);
                    parametros.put("dia", new Date());
                    reporte="ReporteConciliacion.jrxml";
                    break;
                    
            }
            
            //String report="D:\\USB - FELIPE\\Universidad\\c\\Proyectos\\Proyecto Escritorio\\Proyecto Bass-Recuerdos\\Proyecto Bass-Recuerdos\\src\\reportes\\"+reporte;
            String rutaAbsoluta=(new File("src\\reportes\\"+reporte).getAbsolutePath());
            
            System.out.println("RUTA: "+rutaAbsoluta);
            
            JasperReport JAS_REP=JasperCompileManager.compileReport(rutaAbsoluta);
            JasperPrint JAS_PRINT=JasperFillManager.fillReport(JAS_REP, parametros, cad.conexion());
            
            //JasperViewer.viewReport(JAS_PRINT);
            
            JasperViewer jv = new JasperViewer(JAS_PRINT,false);
            
            jv.setTitle(titulo);
            jv.setVisible(true);
            
        } catch (JRException e) {
            System.out.println(""+e.getMessage());
        }
        
    }

}
