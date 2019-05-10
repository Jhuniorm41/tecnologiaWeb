package Datos;

public class DUsuario extends Template{

    private int id;
    private String name;
    private String email;
    private String password;
    private int type;
    private String speciality;
    private String about_me;
    private String phone;
    private int grupo_id;

    private String created_at;
    private String updated_at;
    private String deleted_at;

    public DUsuario() throws Exception{}

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAbout_me() {
        return about_me;
    }

    public void setAbout_me(String about_me) {
        this.about_me = about_me;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(int grupo_id) {
        this.grupo_id = grupo_id;
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
        return "DUsuario{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", speciality='" + speciality + '\'' +
                ", about_me='" + about_me + '\'' +
                ", phone='" + phone + '\'' +
                ", grupo_id=" + grupo_id +
                '}';
    }

    @Override
    protected String addT() throws Exception {
        return "INSERT INTO users(name, email, password, created_at, group_id, type, speciality, about_me, phone)" +
                " VALUES ("
                + "'" + getName() +"' , "
                + "'" + getEmail() +"' , "
                + "'" + getPassword() +"' , NOW(), "
                + getGrupo_id() +", "
                + getType() +", "
                + "'" + getSpeciality() +"', "
                + "'" + getAbout_me() +"', "
                + "'" + getPhone() +"');";
    }

    @Override
    protected String updateT() throws Exception {
        return "UPDATE users" +
                " SET name='"+ getName() +"', email='"+ getEmail() +"', password='"+ getEmail() +"', updated_at= NOW()," +
                "  type="+ getType() +", speciality='"+ getSpeciality() +"', about_me='"+ getAbout_me() +"', phone='" + getPhone() +"'"+
                "  WHERE id= "+ getId() +";";
    }

    @Override
    protected String deleteT() throws Exception {
        return "UPDATE users" +
                " SET deleted_at= NOW()"+
                " WHERE id= "+ getId() +";";
    }

    @Override
    protected String getAllT() throws Exception {
        return "SELECT id, name, email, password, type, speciality, about_me, phone, group_id" +
                " FROM users" +
                " WHERE deleted_at is null" +
                " ORDER BY id ASC;";
    }

    @Override
    protected int currentColumn() throws Exception {
        return 9;
    }
}
