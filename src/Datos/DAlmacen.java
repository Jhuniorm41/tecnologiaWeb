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
public class DAlmacen extends Template {

    private int id;
    private String codigo;

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

    public DAlmacen() throws Exception {
    }

    public DAlmacen(String codigo) throws Exception {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Almacen"
                + "id" + id
                + ", codigo=" + codigo
                + '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO almacen(codigo) VALUES(" + this.codigo + ");";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE almacen SET codigo= " + this.codigo + "where id= " + this.getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
        throw new UnsupportedOperationException("No requiere."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getAllT() throws Exception {
        return "select * from almacen order by id asc";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 5;
    }

}
