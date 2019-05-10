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
public class DAdministrativo extends Template {

    private int id;
    private String codigo;
    private String nombre;
    private String telefono;
    private String estado;
    private String cargo;
    private Date fechaIngreso;

    public DAdministrativo() throws Exception {
    }

    public DAdministrativo(int id) throws Exception {
        this.id = id;
    }

    public DAdministrativo(int id, String codigo, String nombre, String telefono, String estado, String cargo, Date fechaIngreso) throws Exception {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado = telefono;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
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
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    @Override
    public String toString() {
        return "Administrativo"
                + "cargo" + cargo
                + "nombre" + nombre
                + ", codigo=" + codigo
                + '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO administrativo("
                + "codigo, nombre, telefono, estado, cargo, fecha_ingreso) "
                + "VALUES ("
                + this.getCodigo() + ", "
                + this.getNombre() + ", "
                + this.getTelefono() + ", "
                + this.getEstado() + ", "
                + this.getCargo() + ", "
                + this.getFechaIngreso() + ");";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE administrativo "
                + "SET cargo= " + this.getCargo() + ", fecha_ingreso= " + this.getFechaIngreso() + "nombre=" + this.getNombre() + "telefono= " + this.getTelefono()
                + "WHERE id= " + this.getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
        return "UPDATE administrativo "
                + "SET estado= 'eliminado' "
                + "WHERE id= " + this.getId() + ";";
    }

    @Override
    protected String getAllT() throws Exception {
        return "SELECT id, codigo, nombre, telefono, cargo"
                + " FROM administrativo"
                + " WHERE estado <> 'eliminado'"
                + " ORDER BY p.id ASC;";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 3;
    }

}
