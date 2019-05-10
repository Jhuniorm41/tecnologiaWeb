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
public class DProducto extends Template {

    private int id;
    private String codigo;
    private String marca;
    private String modelo;
    private BigDecimal precio;
    private BigDecimal costo;
    private String estado;
    private int loteID;
    private int tipoProductoID;

    
    public DProducto() throws Exception{};
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the Modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    /**
     * @return the costo
     */
    public BigDecimal getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the loteID
     */
    public int getLoteID() {
        return loteID;
    }

    /**
     * @param loteID the loteID to set
     */
    public void setLoteID(int loteID) {
        this.loteID = loteID;
    }

    /**
     * @return the tipoProductoID
     */
    public int getTipoProductoID() {
        return tipoProductoID;
    }

    /**
     * @param tipoProductoID the tipoProductoID to set
     */
    public void setTipoProductoID(int tipoProductoID) {
        this.tipoProductoID = tipoProductoID;
    }

    
    
    
    @Override
    public String toString() {
        return "Producto{"
                + "codigo=" + codigo
                + ", marca=" + marca
                + ", modelo=" + modelo
                + ", precio=" + precio
                + ", costo=" + costo
                + ", tipo=" + tipoProductoID
                + '}';
    }
    @Override
    protected String addT() throws Exception {
      return "INSERT INTO producto(codigo, marca, modelo, precio, costo, estado, loteID, tipoProductoID) VALUES(" + getCodigo() + ", " + getMarca() + ", " + getModelo() + ", " + getPrecio() + ", " + getCosto() + ", " + getEstado() + ", " + getLoteID() + ", " + getTipoProductoID() + ");";
    }

    @Override
    protected String updateT() throws Exception {
        throw new UnsupportedOperationException("Proximamente"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String deleteT() throws Exception {
       return "UPDATE producto SET estado ='eliminado' where id=" + getId() + ";";
    }

    @Override
    protected String getAllT() throws Exception {
        return "select * from producto";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 9;
    }
}
