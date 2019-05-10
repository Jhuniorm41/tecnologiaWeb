/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Collection;

/**
 *
 * @author Junior Guzman
 */
public class DProveedor extends Template {

    /**
     * @return the codigo
     */
    private int id;
    private String codigo;
    private String nombre;
    private String telefono;
    private String direccion;
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public DProveedor() throws Exception {
    }

    public DProveedor(int id) throws Exception {
        this.id = id;
    }

    public DProveedor(int id, String codigo, String nombre, String telefono, String direccion, String ci, String estado) throws Exception {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Proveedor{"
                + "nombre=" + nombre
                + ", codigo=" + codigo
                + ", direccion=" + direccion
                + '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO proveedor("
                + "codigo, nombre, telefono, direccion, ci, estado) "
                + "VALUES ("
                + getCodigo() + ", "
                + getNombre() + ", "
                + getTelefono() + ", "
                + getDireccion() + ", "
                + "'activo');";
    }

    @Override
    protected String updateT() throws Exception {
         return "UPDATE proveedor " +
                "SET codigo= "+ getMonto() +", updated_at= NOW() " +
                "WHERE id ="+ getId() +";";
    }

    @Override
    protected String deleteT() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getAllT() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected int currentColumn() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
