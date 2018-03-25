package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

        con.ejecutar("INSERT INTO producto VALUES(null, '" + p.getNombre() + "', " + p.getValor() + ", " + p.getCantidad() + ")");

    }

    public void registrarVenta(Venta v) throws SQLException {

        con.ejecutar("INSERT INTO venta VALUES (null, "
                + v.getNumVenta()+ ", "
                + v.getPkProducto()+ ", "
                + v.getCantidad() + ", "
                + v.getValor() + ")");
    }

    public List<Producto> ListarProductos() throws SQLException {
        query = "select * from producto";
        producto = new ArrayList<>();
        Producto p = null;

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

    public List<Producto> buscarProducto(String buscador) throws SQLException{//Por si buscamos productos ;-;
        query = "select * from producto where nombre like '%"+buscador+"%'";
        producto = new ArrayList<>();
        Producto p;
        
        rs = con.ejecutarSelect(query);
        while(rs.next()){//por si hay mas de un producto ;-; ..si no, IF
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
    
    public List<Venta> ListarVenta() throws SQLException {
        query = "select * from venta";
        venta = new ArrayList<>();
        Venta v = null;

        rs = con.ejecutarSelect(query);
        while (rs.next()) {
            v = new Venta();

           // v.setId(rs.getInt(1));
            v.setNumVenta(rs.getInt(1));
            v.setPkProducto(2);
            v.setValor(rs.getInt(3));
            v.setCantidad(rs.getInt(4));
            venta.add(v);
        }
        con.close();
        return venta;
    }
    
    
    
}
