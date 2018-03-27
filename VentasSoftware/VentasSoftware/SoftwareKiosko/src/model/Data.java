package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {

    private final Conexion con;
    private ResultSet rs;
    private String query;
    private List<Producto> producto;
    private List<Venta> venta;

    public Data() throws SQLException, ClassNotFoundException {
        con = new Conexion(
                "localhost",
                "bd_ventas",//nombre de ESTA BD xD
                "root",
                ""//Password
        );
    }

    public void agregarProductos(Producto p) throws SQLException {

        con.ejecutar("INSERT INTO producto VALUES(null, "
                + "'" + p.getNombre() + "', "
                + "" + p.getValor() + ", "
                + "" + p.getCantidad() + ")");

    }

    public void registrarVenta(Venta v) throws SQLException {

        con.ejecutar("INSERT INTO venta VALUES (null, "
                + v.getNumVenta() + ", "
                + "NOW(),"
                + v.getPkProducto() + ", "
                + v.getCantidad() + ", "
                + v.getValor() + ")");
    }

    public List<Producto> ListarProductos() throws SQLException {
        query = "SELECT * FROM producto";
        producto = new ArrayList<>();
        Producto p;

        rs = con.ejecutarSelect(query);
        while (rs.next()) {
            p = new Producto();

            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setValor(rs.getInt(3));
            p.setCantidad(rs.getInt(4));
            producto.add(p);
        }
        con.close();
        return producto;
    }

    public List<Producto> buscarProducto(String buscador) throws SQLException {//Por si buscamos productos ;-;
        query = "SELECT * FROM producto WHERE nombre LIKE '%" + buscador + "%'";
        producto = new ArrayList<>();
        Producto p;

        rs = con.ejecutarSelect(query);
        while (rs.next()) {//por si hay mas de un producto ;-; ..si no, IF
            p = new Producto();

            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setValor(rs.getInt(3));
            p.setCantidad(rs.getInt(4));
            producto.add(p);
        }
        con.close();
        return producto;
    }

    public List<Venta> BuscarVentaFecha(String fechaInicio, String fechaFin) throws SQLException {
        query = "SELECT * FROM venta WHERE venta.fecha BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "'";
        List<Venta> list = new ArrayList<>();
        Venta v;

        rs = con.ejecutarSelect(query);
        while (rs.next()) {
            v = new Venta();

            v.setId(rs.getInt(1));
            v.setNumVenta(rs.getInt(2));
            v.setFecha(rs.getString(3));
            v.setPkProducto(rs.getInt(4));
            v.setCantidad(rs.getInt(5));
            v.setValor(rs.getInt(6));

            venta.add(v);
        }
        con.close();
        return list;
    }

    public List<Venta> ListarVenta() throws SQLException {
        query = "SELECT * FROM venta ORDER BY venta.fecha ASC";
        venta = new ArrayList<>();
        Venta v;

        rs = con.ejecutarSelect(query);
        while (rs.next()) {
            v = new Venta();

            v.setId(rs.getInt(1));
            v.setNumVenta(rs.getInt(2));
            v.setFecha(rs.getString(3));
            v.setPkProducto(rs.getInt(4));
            v.setCantidad(rs.getInt(5));
            v.setValor(rs.getInt(6));

            venta.add(v);
        }
        con.close();
        return venta;
    }

    public List<Venta> ListarVentaPor(int idVenta) throws SQLException {
        query = "SELECT * FROM venta WHERE venta.numVenta = " + idVenta + "";
        venta = new ArrayList<>();
        Venta v;

        rs = con.ejecutarSelect(query);
        while (rs.next()) {
            v = new Venta();

            v.setId(rs.getInt(1));
            v.setNumVenta(rs.getInt(2));
            v.setFecha(rs.getString(3));
            v.setPkProducto(rs.getInt(4));
            v.setCantidad(rs.getInt(5));
            v.setValor(rs.getInt(6));

            venta.add(v);
        }
        con.close();
        return venta;
    }

    public List<Producto> rescatarNombreProducto(int id) throws SQLException {
        query = "SELECT producto.nombre FROM producto WHERE producto.id =" + id;
        producto = new ArrayList<>();
        Producto p;
        rs = con.ejecutarSelect(query);

        if (rs.next()) {
            p = new Producto();
            p.setNombre(rs.getString(1));

            producto.add(p);
        }

        con.close();
        return producto;
    }

    public int getUltimaVenta() throws SQLException {
        int ultimaVenta = 0;
        String lastVenta = "SELECT MAX(numVenta) FROM venta";
        rs = con.ejecutarSelect(lastVenta);
        Venta v;
        if (rs.next()) {
            v = new Venta();
            v.setNumVenta(rs.getInt(1));
            ultimaVenta = v.getNumVenta();
        }
        con.close();
        return ultimaVenta;

    }
//    //Construyendo xD
//    public void ActualizarStockVenta(int cantVendida){
//        
//        query= "UPDATE producto where ";
//    }

    public void quitarProductoVenta(int idP) throws SQLException {
        query = "DELETE FROM venta WHERE venta.id =" + idP;
        con.ejecutar(query);
    }

    public String transformarFecha(Date fecha) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date fechaActual = fecha;
        
        String fechaConFormato1 = sdf.format(fechaActual);
        return fechaConFormato1;
    }

}
