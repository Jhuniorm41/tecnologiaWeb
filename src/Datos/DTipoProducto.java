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
public class DTipoProducto extends Template {

    private int id;
    private String descripcion;

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

    public DTipoProducto() throws Exception {
    }

    public DTipoProducto(String descripcion) throws Exception {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tipo producto"
                + "id" + id
                + "descripcion" + descripcion
                + '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO tipoProducto(descripcion) VALUES (" + this.descripcion + ");";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE tipoProducto SET descripcion= " + this.descripcion + "where id= " + this.getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
        throw new UnsupportedOperationException("No requerido."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getAllT() throws Exception {
        return "Select * from tipoProducto order by id asc";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 6;
    }

}
