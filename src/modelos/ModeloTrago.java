package modelos;

import beans.Trago;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tablas.TablaTrago;

public class ModeloTrago extends AbstractTableModel {

    String columnas[] = {"N°", "Id", "Código P.", "Nombre", "Costo", "Cantidad","UND"};

    List<Trago> tragos = new ArrayList<>();

    public ModeloTrago(String modo) {
        establecerDatos("", modo);
    }

    public void establecerDatos(String filtro, String modo) {

        try {

            if (filtro.equals("")) {
                tragos = TablaTrago.listaTragos();
            } else {
                tragos = TablaTrago.seleccionar(filtro);
            }

        } catch (SQLException e) {
        }

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return tragos.size();
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
                valor = tragos.get(rowIndex).getId_trago();
                break;

            case 2:
                valor = tragos.get(rowIndex).getId_cod_trago();
                break;

            case 3:
                valor = tragos.get(rowIndex).getDescripcion_trago();
                break;

            case 4:
                valor = tragos.get(rowIndex).getCosto_trago();
            break;

            case 5:
                valor = tragos.get(rowIndex).getCantidad_trago();
                break;

            case 6:
                valor = tragos.get(rowIndex).getUnidadmd_trago()==0?"ONZ":"UND";
                break;
                
        }

        return valor;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

}
