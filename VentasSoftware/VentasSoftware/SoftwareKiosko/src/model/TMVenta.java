package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMVenta implements TableModel {

    private List<Venta> ventas;

    public TMVenta(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Venta getVenta(int i) {
        return ventas.get(i);
    }

    @Override
    public int getRowCount() {
        return ventas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Num Venta";
            case 1:
                return "Fecha";

            case 2:
                return "Producto";

            case 3:
                return "Cantidad";

            default:
                return "Valor Total";

        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Venta v = ventas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return v.getNumVenta();
            case 1:
                return v.getFecha();

            case 2:
                return v.getPkProducto();

            case 3:
                return v.getCantidad();

            default:
                return v.getValor();

        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
