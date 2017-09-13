
package lab1_franciscosantos;

import java.util.Date;


public class Empleado extends Persona{
    private String rol;
    private Date horario;
    private int Sueldo;
    private String username;
    private String contraseña;

    public Empleado() {
        super();
    }

    public Empleado(String rol, Date horario, int Sueldo, String username, String contraseña) {
        this.rol = rol;
        this.horario = horario;
        this.Sueldo = Sueldo;
        this.username = username;
        this.contraseña = contraseña;
    }

    public Empleado(String rol, Date horario, int Sueldo, String username, String contraseña, int ID, Date fecha, String nombre) {
        super(ID, fecha, nombre);
        this.rol = rol;
        this.horario = horario;
        this.Sueldo = Sueldo;
        this.username = username;
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rol=" + rol + ", horario=" + horario + ", Sueldo=" + Sueldo + ", username=" + username + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
