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
    private DCliente cliente;

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

    public DCliente getCliente() {
        return cliente;
    }

    public void setCliente(DCliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "PEDIDO{"
                + "codigo=" + codigo
                + ", descripcion=" + descripcion
                + ", monto=" + montoTotal
                + ", cliente=" + cliente.getNombre()
                + '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO pedido(" +
                "codigo, fecha_registro, descripcion, estado, monto_total, clienteID) " +
                "VALUES ("
                + getCodigo() +", "
                + getFechaRegistro() +", "
                + getDescripcion() +", "
                + getEstado() +", "
                + getMontoTotal() +", "
                + getCliente().getId() + ");";
    }

    @Override
    protected String updateT() throws Exception {
                return "UPDATE pedido " +
                "SET descripcion= "+ getDescripcion() +", monto= "+ getMontoTotal() +
                "WHERE id ="+ getId() +";";
    }

    @Override
    protected String deleteT() throws Exception {
       return "UPDATE pedido" +
                " SET estado = 'eliminado" +
                " WHERE id ="+ getId() +";";
    }

    @Override
    protected String getAllT() throws Exception {
          return "SELECT p.codigo, p.monto_total, c.nombre" +
                " FROM pedido p, cliente c " +
                " WHERE p.estado <> 'eliminado' and p.clienteID = c.id" +
                " ORDER BY id ASC;";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 4;
    }

}
