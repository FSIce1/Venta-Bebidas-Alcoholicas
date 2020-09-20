package modelos;

import beans.Insumo;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tablas.TablaInsumo;

public class ModeloInsumo extends AbstractTableModel {

    String columnas[] = {"N°", "Id", "Código P.", "Nombre", "Cantidad (ONZ)", " Cantidad (ML)","Cantidad (UND)"};

    DecimalFormat formato1 = new DecimalFormat("#0.00");
    List<Insumo> insumos = new ArrayList<>();

    public ModeloInsumo(String modo) {
        establecerDatos("", modo);
    }

    public void establecerDatos(String filtro, String modo) {

        try {

            if (filtro.equals("")) {
                insumos = TablaInsumo.listaInsumos();
            } else {
                insumos = TablaInsumo.seleccionar(filtro);
            }

        } catch (SQLException e) {
        }

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return insumos.size();
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
                valor = insumos.get(rowIndex).getId_insumo();
                break;

            case 2:
                valor = insumos.get(rowIndex).getCodigo_p__insumo();
                break;

            case 3:
                valor = insumos.get(rowIndex).getNombre_insumo();
                break;
                
            case 4: // PARA ONZAS
                
                Double cantidadONZ;
                
                switch(insumos.get(rowIndex).getUm_insumo()){
                    case 0: // ONZAS
                        cantidadONZ=insumos.get(rowIndex).getCantidad_insumo(); // NO SE MODIFICA
                        valor=formato1.format(cantidadONZ);
                        break;
                        
                    case 1: // UNIDADES
                        valor="No existe conversión";
                        break;
                        
                    case 2: // ML --> 
                        cantidadONZ=(insumos.get(rowIndex).getCantidad_insumo())/(30.0); // SI ESTÁ EN ML SE PASA A ONZAS
                        valor=formato1.format(cantidadONZ);
                        break;
                }
                
                break;

            case 5: // PARA ML
                
                Double cantidadML;
                
                switch(insumos.get(rowIndex).getUm_insumo()){
                    case 0: // ONZAS
                        cantidadML=(insumos.get(rowIndex).getCantidad_insumo())*(30); // SI ESTÁ EN ONZAS SE PASA A ML
                        valor=formato1.format(cantidadML);
                        break;
                        
                    case 1: // UNIDADES
                        valor="No existe conversión";
                        break;
                        
                    case 2: // ML --> 
                        cantidadML=insumos.get(rowIndex).getCantidad_insumo(); // NO SE MODIFICA
                        valor=formato1.format(cantidadML);
                        break;
                }
                
                break;

            case 6: // PARA UND
                                
                switch(insumos.get(rowIndex).getUm_insumo()){
                    case 0: // ONZAS
                        valor="No existe conversión";
                        break;
                        
                    case 1: // UNIDADES
                        valor=insumos.get(rowIndex).getCantidad_insumo(); // NO SE MODIFICA
                         break;
                        
                    case 2: // ML --> 
                        valor="No existe conversión";
                        break;
                }
                
                break;

        }

        return valor;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

}
