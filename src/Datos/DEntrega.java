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
public class DEntrega extends Template {
    
    private int id;
    private String codigo;
    private Date fecha_registro;
    private Date fecha_entrega;
    private String destino;
    private String estado;
    private int administrativoID;
    private int notaVentaID;
    private int tipoEntregaID;

    
    
    public DEntrega() throws Exception {}
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
     * @return the fecha_registro
     */
    public Date getFecha_registro() {
        return fecha_registro;
    }

    /**
     * @param fecha_registro the fecha_registro to set
     */
    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    /**
     * @return the fecha_entrega
     */
    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    /**
     * @param fecha_entrega the fecha_entrega to set
     */
    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
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
     * @return the administrativoID
     */
    public int getAdministrativoID() {
        return administrativoID;
    }

    /**
     * @param administrativoID the administrativoID to set
     */
    public void setAdministrativoID(int administrativoID) {
        this.administrativoID = administrativoID;
    }

    /**
     * @return the notaVentaID
     */
    public int getNotaVentaID() {
        return notaVentaID;
    }

    /**
     * @param notaVentaID the notaVentaID to set
     */
    public void setNotaVentaID(int notaVentaID) {
        this.notaVentaID = notaVentaID;
    }

    /**
     * @return the tipoEntregaID
     */
    public int getTipoEntregaID() {
        return tipoEntregaID;
    }

    /**
     * @param tipoEntregaID the tipoEntregaID to set
     */
    public void setTipoEntregaID(int tipoEntregaID) {
        this.tipoEntregaID = tipoEntregaID;
    }
    

    @Override
    protected String addT() throws Exception {
      return "INSERT INTO entrega(codigo, fecha_registro, fecha_entrega, destino, estado, administrativoID, notaVentaID, tipoEntregaID) VALUES(" +
              getCodigo() + ", " + getFecha_registro() + ", " + getFecha_entrega() + ", " + getDestino() + ", " + getEstado() + ", " + getAdministrativoID() + ", " + getNotaVentaID() + ", " + getTipoEntregaID() + ");";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE entrega SET fecha_entrega= " + getFecha_entrega() + ", destino= " + getDestino() + ", estado= " + getEstado() + " where id= " + getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
      return "UPDATE entrega SET estado = 'eliminado' where id= " + getId() + ";";
    }

    @Override
    protected String getAllT() throws Exception {
      return "Select e.codigo, e.fecha_registro, e.destino, e.estado, t.descripcion, c.nombre from entrega e, TipoEntrega t, cliente c, NotaVenta n where e.tipoEntregaID = t.id and e.notaVentaID = n.id and n.clienteID = c.id"; 
    }

    @Override
    protected int currentColumn() throws Exception {
      return 14;  
    }
    
}
