package models;

import controllers.Secure;
import java.util.Date;
import javax.persistence.Entity;
import play.*;
import play.data.validation.*;
import play.db.jpa.Model;
import play.mvc.*;


/**
 *
 * @author jesus
 */
@Entity
@With(Secure.class)
public class Usuario extends Model{
    @Required
    public String usuario;
    @Password
    public String password;
    public String primerApellido;
    public String segundoApellido;
    public String nombre;
    public Date fechaNacimiento;
    public Boolean administrador;

    @Override
    public String toString() {
        return String.format("%s %s ", this.nombre, this.primerApellido);
    }


}
