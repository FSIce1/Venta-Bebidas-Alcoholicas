package modelos;

import beans.Equivalencia;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tablas.TablaEquivalencia;

public class ModeloEquivalencia extends AbstractTableModel {

    String columnas[] = {"N°", "Id", "Grupo", "Código P.", "Insumo", "Cantidad", "U.M.", "Ml", "Peso(gr)","Peso Envase(gr)","Densidad"};

    List<Equivalencia> equivalencias = new ArrayList<>();

    DecimalFormat formato1 = new DecimalFormat("#0.00000");
    DecimalFormat formato2 = new DecimalFormat("#0.00");


    public ModeloEquivalencia(String modo) {
        establecerDatos("", modo);
    }

    public void establecerDatos(String filtro, String modo) {

        try {

            if (filtro.equals("")) {
                equivalencias = TablaEquivalencia.listaEquivalencias();
            } else {
                equivalencias = TablaEquivalencia.seleccionar(filtro);
            }

            
        } catch (SQLException e) {
        }

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return equivalencias.size();
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
                valor = equivalencias.get(rowIndex).getId_equivalencia();
                break;

            case 2: 
                // BEBIDAS INSUMOS - 0
                // LICORES INSUMOS - 1
                // OTROS INSUMOS - 2

                switch (equivalencias.get(rowIndex).getGrupo_equivalencia()) {
                    case 0:
                        valor="BEBIDAS INSUMOS";
                        break;
                    case 1:
                        valor="LICORES INSUMOS";
                        break;
                    case 2:
                        valor="OTROS INSUMOS";
                        break;
                    default:
                        valor="NO DEFINIDO";
                        break;
                }
                
                break;

            case 3:
                valor = equivalencias.get(rowIndex).getoInsumo().getCodigo_p__insumo();
                break;
            
            case 4:
                valor = equivalencias.get(rowIndex).getoInsumo().getNombre_insumo();
                break;
                
            case 5:
                valor = equivalencias.get(rowIndex).getoInsumo().getCantidad_insumo();
                break;
                
            case 6:
                
                switch(equivalencias.get(rowIndex).getoInsumo().getUm_insumo()){
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
                
            case 7: // Ml
                
                if(equivalencias.get(rowIndex).getoInsumo().getUm_insumo()!=0 || equivalencias.get(rowIndex).getoInsumo().getUm_insumo()==2){
                    valor="No existe conversión";
                } else {
                    Double ml = (equivalencias.get(rowIndex).getoInsumo().getCantidad_insumo())*(30);
                    valor=formato2.format(ml);
                }
                break;

            case 8:
                valor = equivalencias.get(rowIndex).getPeso_equivalencia();
                break;                

            case 9:
                valor = equivalencias.get(rowIndex).getPeso_envase_equivalencia();
                break;

            case 10:
                
                Double densidad=(equivalencias.get(rowIndex).getoInsumo().getCantidad_insumo()*30)/(equivalencias.get(rowIndex).getPeso_equivalencia()-equivalencias.get(rowIndex).getPeso_envase_equivalencia());
                
                valor = formato1.format(densidad);
                
                break;
                
        }

        return valor;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

}
