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
public class DTipoEntrega extends Template {

    private int id;
    private String descripcion;

    public DTipoEntrega() throws Exception {
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

    @Override
    public String toString() {
        return "Tipo de Entrega{"
                + "id=" + id
                + ", descripcion=" + descripcion
                + '}';
    }

    @Override
    protected String addT() throws Exception {
      return "INSERT INTO TipoEntrega(descripcion) VALUES(" + getDescripcion() + ");";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE TipoEntrega SET descripcion= "+  getDescripcion() + " where id=" + getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
        throw new UnsupportedOperationException("No requerido."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getAllT() throws Exception {
     return "Select * from TipoEntrega";   
    }

    @Override
    protected int currentColumn() throws Exception {
     return 11;
    }

}
