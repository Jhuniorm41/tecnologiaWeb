/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Junior Guzman
 */
public class DStock extends Template{
    private int id;
    private int cantidad;
    private int almacenID;
    private int productoID;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the almacenID
     */
    public int getAlmacenID() {
        return almacenID;
    }

    /**
     * @param almacenID the almacenID to set
     */
    public void setAlmacenID(int almacenID) {
        this.almacenID = almacenID;
    }

    /**
     * @return the productoID
     */
    public int getProductoID() {
        return productoID;
    }

    /**
     * @param productoID the productoID to set
     */
    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    
    public DStock() throws Exception {}
    
    
    @Override
    protected String addT() throws Exception {
       return "INSERT INTO stock(cantidad, almacenID, productoID) VALUES(" + getCantidad() + ", " + getAlmacenID() + ", " + getProductoID() + ");";
    }

    @Override
    protected String updateT() throws Exception {
       return "UPDATE stock SET cantidad=" + getCantidad() + "where id = " + getId() + ";"; 
    }

    @Override
    protected String deleteT() throws Exception {
        throw new UnsupportedOperationException("No requiere."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getAllT() throws Exception {
      return "Select p.codigo, a.codigo, s.cantidad from producto p, almacen a, stock s where s.productoID = p.id and a.almacenID = a.id;"; 
    }

    @Override
    protected int currentColumn() throws Exception {
        return 10;
    }
    
}
