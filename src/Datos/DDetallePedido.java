/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.math.BigDecimal;

/**
 *
 * @author Junior Guzman
 */
public class DDetallePedido extends Template{
    
    private int id;
    private int cantidad;
    private String descripcion;
    private BigDecimal total;
    private int pedidoID;
    private int productoID;
    
    public DDetallePedido() throws Exception {}
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * @return the pedidoID
     */
    public int getPedidoID() {
        return pedidoID;
    }

    /**
     * @param pedidoID the pedidoID to set
     */
    public void setPedidoID(int pedidoID) {
        this.pedidoID = pedidoID;
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
    

    @Override
    protected String addT() throws Exception {
      return "INSERT INTO DetallePedido(cantidad, descripcion, total, pedidoID, productoID) VALUES(" +
              getCantidad() + ", " + getDescripcion() + ", " + getTotal() + ", " + getPedidoID() + ", " + getProductoID() + ");";
    }

    @Override
    protected String updateT() throws Exception {
       return "UPDATE DetallePedido SET cantidad =" + getCantidad() + ", total= " + getTotal() + ", descripcion= " + getDescripcion() + " where id= " + getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
        throw new UnsupportedOperationException("No requerido"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getAllT() throws Exception {
     return "Select d.cantidad, p.codigo, d.total, d.pedidoID from DetallePedido d, producto p where d.productoID = p.id;";   
    }

    @Override
    protected int currentColumn() throws Exception {
        return 13;
    }
    
}
