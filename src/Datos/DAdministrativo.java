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
    private String cargo;
    private Date fechaIngreso;
    private DPersona persona;

    public DAdministrativo() throws Exception {
    }

    public DAdministrativo(int id) throws Exception {
        this.id = id;
    }

    public DAdministrativo(int id, String codigo, String cargo, Date fechaIngreso) throws Exception {
        this.id = id;
        this.codigo = codigo;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public DPersona getPersona() {
        return persona;
    }

    public void setPersona(DPersona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Administrativo"
                + "cargo" + this.cargo
                + ", codigo=" + this.codigo
                + '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO administrativo("
                + "id, codigo, cargo, fecha_ingreso) "
                + "VALUES ("
                + this.getPersona().getId() + ", "
                + this.getCargo() + ", "
                + this.getFechaIngreso() + ");";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE administrativo "
                + "SET cargo= " + this.getCargo() + ", fecha_ingreso= " + this.getFechaIngreso()
                + "WHERE id= " + this.getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
        return "UPDATE persona "
                + "SET estado= 'eliminado' "
                + "WHERE id= " + this.getId() + ";";
    }

    @Override
    protected String getAllT() throws Exception {
        return "SELECT *"
                + " FROM persona p, administrativo a "
                + " WHERE estado <> 'eliminado' and p.id = a.id"
                + " ORDER BY p.id ASC;";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 3;
    }

}
