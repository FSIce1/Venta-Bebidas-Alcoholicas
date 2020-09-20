
package colorTablas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorTablas extends DefaultTableCellRenderer{
    
    private Component componente;
    private static Color color1=new Color(102, 255, 255);// POR DEFECTO
    private static Color color2= new Color(10, 97, 135); // POR DEFECTO
    
    public static void cambiaColor(Color COLOR1,Color COLOR2){
        color1=COLOR1;
        color2=COLOR2;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus, int row,int column){
    
        componente=super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if(row%2==0)    
            componente.setBackground(color1);
        else 
            componente.setBackground(color2);
        
        return componente;
    }
    
}
