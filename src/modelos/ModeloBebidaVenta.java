package modelos;

import beans.BebidaVenta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tablas.TablaBebidaVenta;

public class ModeloBebidaVenta extends AbstractTableModel {

    String columnas[] = {"N°", "Id", "Bebida","Costo de la Bebida","Cantidad","Costo Total"};
    
    List<BebidaVenta> bebidaVentas = new ArrayList<>();
    private Double total;
    
    public ModeloBebidaVenta() {
        establecerDatos("",0);
    }

    public void establecerDatos(String modo,int codVenta) {

        try {
            
            if(modo.equals("ESTATICOS"))
                bebidaVentas = TablaBebidaVenta.listaestatica();
            else
                bebidaVentas = TablaBebidaVenta.listaBebidasVentas(codVenta);
                
        } catch (SQLException e) {
        }

        fireTableDataChanged();
    }
    
    public Double total(Double reci){
        this.total=reci;
        return this.total;
    }
    
    public Double re(){
        return total;
    }

    @Override
    public int getRowCount() {
        return bebidaVentas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object valor = "";

        switch (columnIndex) {
            case 0:
                valor = rowIndex + 1;
                break;

            case 1:
                valor = bebidaVentas.get(rowIndex).getId_bebida_venta();
                break;

            case 2:
                valor = bebidaVentas.get(rowIndex).getId_trago_fk().getDescripcion_trago()!=null?bebidaVentas.get(rowIndex).getId_trago_fk().getDescripcion_trago():"Bebida eliminada";
                break;
            
            case 3:
                valor = bebidaVentas.get(rowIndex).getId_trago_fk().getCosto_trago();
                break;

            case 4:
                valor = bebidaVentas.get(rowIndex).getCantidad();
                break;
            
            case 5:
                valor = bebidaVentas.get(rowIndex).getCantidad()*bebidaVentas.get(rowIndex).getId_trago_fk().getCosto_trago();
                
                /*
                String reci=""+valor;
                total=total+Double.parseDouble(reci);
                total(Double.parseDouble(""+total));
                */
                break;
                
        }

        return valor;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

}
