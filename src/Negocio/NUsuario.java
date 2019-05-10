package Negocio;

import Datos.DUsers;

import java.util.ArrayList;
import java.util.List;

public class NUsuario {

    private DUsers o;

    public NUsuario() throws Exception{
        this.o = new DUsers();
    }

    public DUsers getInfo(){
        return o;
    }

    public void add(String name, String email, String password, int type, String speciality, String about_me, String phone, int grupo_id) throws Exception{
        try{
            o.setName(name);
            o.setEmail(email);
            o.setPassword(password);
            o.setType(type);
            o.setSpeciality(speciality);
            o.setAbout_me(about_me);
            o.setPhone(phone);
            o.setGrupo_id(grupo_id);
            o.add();
        } catch (Exception e){
            throw e;
        }
    }

    public void update(int id, String name, String email, String password, int type, String speciality, String about_me, String phone) throws Exception {
        try{
            o.setId(id);
            o.setName(name);
            o.setEmail(email);
            o.setPassword(password);
            o.setType(type);
            o.setSpeciality(speciality);
            o.setAbout_me(about_me);
            o.setPhone(phone);
            o.update();
        } catch (Exception e){
            throw e;
        }
    }

    public void delete(int id) throws Exception {
        try{
            o.setId(id);
            o.delete();
        } catch (Exception e){
            throw e;
        }
    }

    private List<DUsers> getAll() throws Exception{
        List<DUsers> ob = new ArrayList<>();
        List<Object> lista = (List<Object>) this.o.getAll();
        try {
            for (Object objecto : lista) {
                List<Object> obj = (List<Object>) objecto;
                DUsers oo = new DUsers();

                oo.setId(Integer.valueOf(obj.get(0).toString()));
                oo.setName(obj.get(1).toString());
                oo.setEmail(obj.get(2).toString());
                oo.setPassword(obj.get(3).toString());
                oo.setType(Integer.valueOf(obj.get(4).toString()));
                oo.setSpeciality(obj.get(5).toString());
                oo.setAbout_me(obj.get(6).toString());
                oo.setPhone(obj.get(7).toString());
                oo.setGrupo_id(Integer.valueOf(obj.get(8).toString()));

                ob.add(oo);
            }
        } catch (Exception e) {
            throw e;
        }
        return ob;
    }

    public String Mostrar() throws Exception {
        String rx = "USUARIOS \n\n";
        try {
            List<DUsers> lObj = this.getAll();

            rx = "<center><h2>LISTA DE USUARIOS</h2></center><br>";
            rx += " <table style=\"width:100%; border-style: outset; text-align: left;\" >" +
                    "             <thead>\n" +
                    "                   <tr >\n" +
                    "                         <th>#</th>\n" +
                    "                         <th>NOMBRE</th>\n" +
                    "                         <th>EMAIL</th>\n" +
                    "                         <th>PASSWORD</th>\n" +
                    "                         <th>TIPO</th>\n" +
                    "                         <th>ESPECIALIDAD</th>\n" +
                    "                         <th>ACERCA DE</th>\n" +
                    "                         <th>TELEFONO</th>\n" +
                    "                         <th>ID GRUPO</th>\n" +
                    "                   </tr>\n" +
                    "             </thead>\n" +
                    "                  <tbody> ";
            for (DUsers obj : lObj) {
                rx = rx +
                        "<tr style=\"\">\n" +
                        "   <td>"+ obj.getId() + "</td>\n" +
                        "   <td>"+ obj.getName() + "</td>\n" +
                        "   <td>"+ obj.getEmail() + "</td>\n" +
                        "   <td>"+ obj.getPassword() + "</td>\n" +
                        "   <td>"+ obj.getType() + "</td>\n" +
                        "   <td>"+ obj.getSpeciality() + "</td>\n" +
                        "   <td>"+ obj.getAbout_me() + "</td>\n" +
                        "   <td>"+ obj.getPhone() + "</td>\n" +
                        "   <td>"+ obj.getGrupo_id() + "</td>\n" +
                        "</tr>\n"
                ;
            }
            rx  +=   "  </tbody>\n" +
                    "</table>\n"
            ;
        } catch (Exception e){
            throw e;
        }
        return rx;
    }
}
