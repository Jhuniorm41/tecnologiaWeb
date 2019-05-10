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
public class DCliente extends Template {
    
    
    private int id;
    private String codigo;
    private int nit;
    private String nombre;
    private String telefono;
    private String estado;

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
     * @return the nit
     */
    public int getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * @return the nomnbre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nomnbre the nomnbre to set
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
 

    public DCliente() throws Exception {
    }

    public DCliente(int id) throws Exception {
        this.id = id;
    }

    public DCliente(int id, String codigo, int nit, String nombre, String telefono, String estado) throws Exception {
        this.id = id;
        this.codigo = codigo;
        this.nit = nit;
        this.telefono = telefono;
        this.estado = estado;
    }


    @Override
    public String toString() {
             return "Clientes{" +
                "Nit =" + nit +
                ", Nombre=" + nombre +
                ", telefono=" + telefono +
                '}';
    }
    
    
    @Override
    protected String addT() throws Exception {
        return "INSERT INTO cliente("
                + "codigo, nit, nombre, telefono, estado) "
                + "VALUES ("
                + getCodigo() + ", "
                + getNit() + ", "
                + getNombre() + ", "
                + getTelefono()+ ", "
                + "'activo');"; 
    }

    @Override
    protected String updateT() throws Exception {
       return "UPDATE cliente " +
                "SET nit= "+ getNit() +", nombre= " + getNombre() + ", telefono= " + getTelefono() +
                "WHERE id ="+ getId() +";";
    }

    @Override
    protected String deleteT() throws Exception {
         return "UPDATE cliente" +
                " SET estado= 'eliminado" +
                " WHERE id ="+ getId() + ";";
    }

    @Override
    protected String getAllT() throws Exception {
       return "SELECT id, codigo, nombre, telefono" +
                " FROM cliente " +
                " WHERE estado <> 'eliminado" +
                " ORDER BY id ASC;";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 3;
    }
    
}
