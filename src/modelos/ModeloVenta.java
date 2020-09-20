package modelos;

import beans.Venta;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tablas.TablaVenta;

public class ModeloVenta extends AbstractTableModel {

    String columnas[] = {"N°", "Id", "Cod. Correlativo", "Total", "Fecha","Hora"};

    List<Venta> ventas = new ArrayList<>();

    public ModeloVenta(String modo) {
        establecerDatos(modo, null);
    }

    public void establecerDatos(String modo, Date dia) {

        try {
            ventas = TablaVenta.listaVentas(modo, dia);
        } catch (SQLException e) {
        }

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return ventas.size();
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
                valor = ventas.get(rowIndex).getId_venta();
                break;

            case 2:
                valor = ventas.get(rowIndex).getCodigo_venta();
                break;

            case 3:
                valor = ventas.get(rowIndex).getTotal_venta();
                break;

            case 4:
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    
                String v=dateFormat.format(ventas.get(rowIndex).getFecha_venta());
                
                valor=v;
                break;

            case 5:
                valor = ventas.get(rowIndex).getHora_venta();
                break;
                
        }

        return valor;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

}
