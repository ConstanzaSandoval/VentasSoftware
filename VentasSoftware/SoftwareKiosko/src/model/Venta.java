package model;

public class Venta {
    /* pkProducto int,
    numVenta int,
    cantProducto int,
    valorTotal int,*/
    
    private int id;
    private int numVenta;
    private int pkProducto;
    private int valor;
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    private int cantidad;


    public Venta() {
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public int getPkProducto() {
        return pkProducto;
    }

    public void setPkProducto(int pkProducto) {
        this.pkProducto = pkProducto;
    }
      
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
