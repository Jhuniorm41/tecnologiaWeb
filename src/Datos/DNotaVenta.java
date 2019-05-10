/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Junior Guzman
 */
public class DNotaVenta extends Template{
    
    private int id;
    private String codigo;
    private Date fechaEmision;
    private BigDecimal montoTotal;
    private String estado;
    private int pedidoID;

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
     * @return the fechaEmision
     */
    public Date getFechaEmision() {
        return fechaEmision;
    }

    /**
     * @param fechaEmision the fechaEmision to set
     */
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * @return the montoTotal
     */
    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
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
     * @return the pedidoID
     */
    public int getPedidoID() {
        return pedidoID;
    }

    /**
     * @param pedidoID the pedidoID to set
     */
    public void setPedidoID(int pedidoID) {
        this.pedidoID = pedidoID;
    }
    
    
    public DNotaVenta() throws Exception {}
    

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO NotaVenta(codigo, fecha_emision, monto_total, estado, pedidoID) VALUES(" +
                getCodigo() + ", " + getFechaEmision() + ", " + getMontoTotal() + ", " + getEstado() + ", " + getPedidoID() + ");";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE NotaVenta SET estado = " + getEstado() + " where id=" + getId() + ";";
    }

    @Override
    protected String deleteT() throws Exception {
        return "UPDATE NotaVenta SET estado = 'eliminado' where id=" + getId() +";";
    }

    @Override
    protected String getAllT() throws Exception {
        return "Select c.nombre, n.codigo, n.monto_total, n.fecha_emision from cliente c, pedido p, NotaVenta n where n.pedidoID = p.id and p.clienteID = c.id;";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 12;
    }
    
}
