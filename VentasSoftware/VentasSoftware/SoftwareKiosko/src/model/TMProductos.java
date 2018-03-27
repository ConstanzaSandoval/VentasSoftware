package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
/**
 *
 * @author Berny
 */
public class TMProductos implements TableModel {

    private List<Producto> productos;

    public TMProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto getProductos(int i) {
        return productos.get(i);
    }

    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0:
                return "ID";
            case 1:
                return "Producto";
            case 2:
                return "Valor ($)";
            default:
                return "Cantidad";
        }
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int filas, int columnas) {
        //para filas y columnas
        Producto p = productos.get(filas);
        
        switch(columnas){
            case 0 :
                return p.getId();
            case 1:
                return p.getNombre();
            case 2:
                return p.getValor();
            default:
                return p.getCantidad();      
        }        
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
    }

}
