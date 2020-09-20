package modelos;

import beans.InsumoVendido;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tablas.TablaInsumoVendido;

public class ModeloInsumoVendido extends AbstractTableModel {

    String columnas[] = {"N°", "Nombre Insumo","U.M.", "Suma","Stock","Cantidad Original"};

    List<InsumoVendido> insumosVendidos = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("#0.00");
 
    public ModeloInsumoVendido(String modo,Date fecha) {
        establecerDatos(modo,fecha);
    }

    public void establecerDatos(String modo,Date fecha) {

        try {
            insumosVendidos = TablaInsumoVendido.listaInsumosVendidos(modo,fecha);
        } catch (SQLException e) {
        }

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return insumosVendidos.size();
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
                valor = insumosVendidos.get(rowIndex).getInsumo();
                break;

            case 2:
                valor = insumosVendidos.get(rowIndex).getUm()==null?"No definido":insumosVendidos.get(rowIndex).getUm();
                break;
                
            case 3: 
                
                String a=df.format(Double.parseDouble(insumosVendidos.get(rowIndex).getSuma()));
                
                valor = insumosVendidos.get(rowIndex).getSuma()==null?"No definido":a;
                break;
                
            case 4: 
                valor = insumosVendidos.get(rowIndex).getStock()==null?"No definido":insumosVendidos.get(rowIndex).getStock();
                break;
                
            case 5: 
                valor = insumosVendidos.get(rowIndex).getOriginal()==null?"No definido":insumosVendidos.get(rowIndex).getOriginal();
                break;

        }

        return valor;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

}
