package Datos;

import java.sql.ResultSet;

public class DOferta  extends Template{

    private int id;
    private String name;
    private String description;
    private String type_id;
    private double price;

    private String created_at;
    private String updated_at;
    private String deleted_at;

    public DOferta() throws Exception{}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    @Override
    public String toString() {
        return "DOferta{" +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type_id='" + type_id + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO offer(name, description, price, type, created_at)" +
                " VALUES ('"+ getName() +"', '"+ getDescription() +"', "+ getPrice() +", '"+ getType_id() +"', NOW());";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE offer " +
                " SET name='"+ getName() +"', description='"+ getDescription() +"', price= "+ getPrice() + ", updated_at= NOW() "+
                " WHERE id = "+ getId() +";";
    }

    @Override
    protected String deleteT() throws Exception {
        return "UPDATE offer" +
                " SET deleted_at= NOW()" +
                " WHERE id= "+ getId() + ";";
    }

    @Override
    protected String getAllT() throws Exception {
        return "SELECT id, name, description, price, type" +
                " FROM offer" +
                " WHERE deleted_at is null" +
                " ORDER BY id ASC;";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 5;
    }

    public ResultSet obtenerReporte(){
        String consulta = " select p.name as nombre, e.description as programa, COUNT(dv.id_persona) as Cantidad "
                + " from offer e, posgraduante_offer dv, users p"
                + " where dv.offer_id = e.id  AND  dv.posgraduante_id = p.id"
                + " group by p.name, e.description";
        return consultarDatos(consulta);
    }

}
