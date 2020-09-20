package modelos;

import beans.Receta;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tablas.TablaReceta;

public class ModeloReceta extends AbstractTableModel {

    String columnas[] = {"N°", "Id", "Cod. Insumo","Insumo", "Cantidad a Utilizar","U.M", "Stock","U.M.", "*Tragos*","*Insumos*"};

    List<Receta> recetas = new ArrayList<>();

    DecimalFormat formato1 = new DecimalFormat("#0.00");


    public ModeloReceta(String modo) {
        establecerDatos(0);
    }

    public void establecerDatos(int codTrago) {

        try {
            recetas = TablaReceta.listaRecetas(codTrago);
        } catch (SQLException e) {
        }

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return recetas.size();
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
                valor = recetas.get(rowIndex).getId_receta();
                break;

            case 2:
                valor = recetas.get(rowIndex).getoInsumo().getCodigo_p__insumo();
                break;
                
            case 3:
                valor = recetas.get(rowIndex).getoInsumo().getNombre_insumo();
                break;
            
            case 4:
                
                Double cantidadReceta = recetas.get(rowIndex).getCantidad_receta(); // TOTAL DE ONZAS QUE SE USAN PARA EL TRAGO
                
                valor=formato1.format(cantidadReceta);
                
                break;
            
            case 5:
                
                switch(recetas.get(rowIndex).getUm_receta()){
                    case 0: // ONZAS
                        valor="ONZ";
                        break;
                        
                    case 1: // UNIDADES
                        valor="UND";
                         break;
                        
                    case 2: // ML --> 
                        valor="ML";
                        break;
                }
                
                break;
                
            case 6:
                
                Double cantidadStock = recetas.get(rowIndex).getoInsumo().getCantidad_insumo(); 
                
                valor=formato1.format(cantidadStock);
                
                break;

            case 7:

                switch( recetas.get(rowIndex).getoInsumo().getUm_insumo()){
                    case 0: // ONZAS
                        valor="ONZ";
                        break;
                        
                    case 1: // UNIDADES
                        valor="UND";
                         break;
                        
                    case 2: // ML --> 
                        valor="ML";
                        break;
                }

                break;
                
            case 8:
                
                Double cantidad = recetas.get(rowIndex).getoTrago().getCantidad_trago();
                
                valor=formato1.format(cantidad);
                
                break;
            
            case 9:
                Double insumo = recetas.get(rowIndex).getoTrago().getCantidad_trago()*recetas.get(rowIndex).getCantidad_receta();
                
                valor = formato1.format(insumo);
                
                break;

        }

        return valor;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

}
