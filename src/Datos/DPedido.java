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
public class DPedido extends Template {

    private int id;
    private String codigo;
    private Date fechaRegistro;
    private String descripcion;
    private String estado;
    private BigDecimal montoTotal;
    private DCliente clienteid;

    public DPedido() throws Exception {
    }

    public DPedido(int id) throws Exception {
        this.id = id;
    }

    public DPedido(int id, String codigo, Date fechaRegistro, String descripcion, String estado, BigDecimal montoTotal) throws Exception {
        this.id = id;
        this.codigo = codigo;
        this.fechaRegistro = fechaRegistro;
        this.descripcion = descripcion;
        this.estado = estado;
        this.montoTotal = montoTotal;
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public DCliente getClienteid() {
        return clienteid;
    }

    public void setClienteid(DCliente clienteid) {
        this.clienteid = clienteid;
    }

    @Override
    public String toString() {
        return "PEDIDO{"
                + "codigo=" + codigo
                + ", descripcion=" + descripcion
                + '}';
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
