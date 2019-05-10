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
public class DUsuario extends Template {

    private int id;
    private String usuario;
    private String contrasenia;
    private String estado;
    private DAdministrativo administrativo;

    public DUsuario() throws Exception {
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
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the codigo to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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
     * @return the administrativo
     */
    public DAdministrativo getAdministrativo() {
        return administrativo;
    }

    /**
     * @param administrativo the administrativo to set
     */
    public void setAdministrativo(DAdministrativo administrativo) {
        this.administrativo = administrativo;
    }

    @Override
    public String toString() {
        return "Usuario"
                + "usuario" + usuario
                + "nombre" + administrativo.getNombre()
                + '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSER INTO usuario(usuario, contrasenia, estado, administrativoID) VALUES (" + getUsuario() + ", " + getContrasenia() + ", " + getEstado() + ", " + getAdministrativo().getId() + ");";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE usuario SET contrasenia= " + getContrasenia() + "where id=" + this.getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
        return "UPDATE usuario SET estado= 'eliminado' where id= " + getId() + ";";
    }

    @Override
    protected String getAllT() throws Exception {
        return "select u.id, u.usuario, a.nombre from usuario u, administrativo u where u.administrativoID = a.id order by u.id";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 7;
    }

}
