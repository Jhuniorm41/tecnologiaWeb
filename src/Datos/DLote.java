/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author Junior Guzman
 */
public class DLote extends Template {

    private int id;
    private String codigo;
    private Date fechaIngreso;
    private int cantidad;
    private String estado;
    private int almacenID;
    private int proveedorID;

    public DLote() throws Exception {
    }

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
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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
     * @return the proveedorID
     */
    public int getProveedorID() {
        return proveedorID;
    }

    /**
     * @param proveedorID the proveedorID to set
     */
    public void setProveedorID(int proveedorID) {
        this.proveedorID = proveedorID;
    }

    @Override
    public String toString() {
        return "Lote{"
                + "codigo=" + codigo
                + ", fecha ingreso=" + fechaIngreso
                + '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO lote VALUES(" + getCodigo() + ", " + getFechaIngreso() + ", " + getCantidad() + ", " + getEstado() + ", " + getAlmacenID() + ", " + getProveedorID() + ");";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE lote SET almacenID= " + getAlmacenID() + ", proveedorID=" + getProveedorID() + "where id= " + getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
        return "UPDATE lote SET estado= 'eliminado' where id=" + getId()+ " ;";
    }

    @Override
    protected String getAllT() throws Exception {
       return "select l.codigo, l.fecha_ingreso, p.nombre from lote l, proveedor p, where l.proveedorID = p.id";         
    }

    @Override
    protected int currentColumn() throws Exception {
      return 8;
    }

}
