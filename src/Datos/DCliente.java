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
    private int nit;
    private DPersona persona;

    public DCliente() throws Exception {
    }

    public DCliente(int id) throws Exception {
        this.id = id;
    }

    public DCliente(int id, int nit) throws Exception {
        this.id = id;
        this.nit = nit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public DPersona getPersona() {
        return persona;
    }

    public void setPersona(DPersona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
             return "Clientes{" +
                "Nit =" + nit +
                ", Nombre=" + persona.getNombre() +
                '}';
    }
    
    
    @Override
    protected String addT() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String updateT() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
