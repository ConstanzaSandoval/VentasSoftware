package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {
    private final Conexion con;
    private ResultSet rs;
    private String query;
    
    
    public Data() throws SQLException, ClassNotFoundException {

        con = new Conexion(
            "localhost",
            "podcli",//nombre BD
            "root",
            "Nanika123"//Password
        );
    }
    
    public void agregarProductos(Producto p) throws SQLException{
    
        con.ejecutar("INSERT INTO producto VALUES(null, '"+p.getNombre()+"', "+p.getValor()+", "+p.getCantidad()+")");
    
    }
    
    public void registrarVenta(Venta v) throws SQLException{
        
        con.ejecutar("INSERT INTO venta VALUES (null, "
                +v.getPkProducto()+", "
                +v.getNumVenta()+", "
                +v.getCantidad()+", "
                +v.getValor()+")");
    }
}
