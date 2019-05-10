package Email;

import Negocio.NUsuario;
import Nucleo.procesador.Anacom;
import Nucleo.utilidades.Herramientas;

public class MailUsuario extends TemplateMail {

    private NUsuario o;

    public MailUsuario() throws Exception{
        this.o = new NUsuario();
    }

    @Override
    protected boolean insertar(Anacom anacom, String correo) throws Exception {
        try {
            anacom.Avanzar();
            String name = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            String email = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            String password = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            int type = anacom.Preanalisis().getAtributo();
            anacom.Avanzar(); anacom.Avanzar();
            String speciality = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            String about_me = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            String phone = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            int grupo_id = anacom.Preanalisis().getAtributo();

            o.add(name, email, password, type, speciality, about_me, phone, grupo_id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    protected boolean modificar(Anacom anacom, String correo) throws Exception{
        try {
            anacom.Avanzar();
            int id = anacom.Preanalisis().getAtributo();
            anacom.Avanzar(); anacom.Avanzar();
            String name = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            String email = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            String password = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            int type = anacom.Preanalisis().getAtributo();
            anacom.Avanzar(); anacom.Avanzar();
            String speciality = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            String about_me = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();
            String phone = Herramientas.quitarComillas(anacom.Preanalisis().getToStr());
            anacom.Avanzar(); anacom.Avanzar();

            o.update(id, name, email, password, type, speciality, about_me, phone);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    protected boolean eliminar(Anacom anacom, String correo) throws Exception{
        try {
            anacom.Avanzar();
            int id = anacom.Preanalisis().getAtributo();
            o.delete(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    protected String listar() throws Exception {
        try {
            return o.Mostrar();
        } catch (Exception e){
            throw e;
        }
    }

    @Override
    protected String messageCreate(boolean sw) {
        return (sw) ? "Contenido registrado exitosamente con id: "  + o.getInfo().toString() : "No se pudo registrar el contenido";

    }

    @Override
    protected String messageEdit(boolean sw) {
        return (sw) ? "Contenido modificado exitosamente con id: " + o.getInfo().toString() : "No se pudo modificar el contenido";

    }

    @Override
    protected String messageRemove(boolean sw) {
        return (sw) ? "Contenido eliminado exitosamente con id: " + o.getInfo().toString() : "No se pudo eliminar el contenido";
    }

    @Override
    protected String messageFindAll(boolean sw) {
        return (sw) ? "Listado de contenidos: " : "No se pudo encontrar en listado de contenidos";
    }
}
