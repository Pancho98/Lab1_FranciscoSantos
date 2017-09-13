
package lab1_franciscosantos;

import java.io.Serializable;
import java.util.Date;


public class Empleado extends Persona implements Serializable{
    private String rol;
    private int entrada;
    private int salida;
    private int Sueldo;
    private String username;
    private String contraseña;
    
    private static final long SerialVersionUID=888L;

    public Empleado() {
        super();
    }

    public Empleado(String rol, int entrada, int salida, int Sueldo, String username, String contraseña) {
        this.rol = rol;
        this.entrada = entrada;
        this.salida = salida;
        this.Sueldo = Sueldo;
        this.username = username;
        this.contraseña = contraseña;
    }

    public Empleado(String rol, int entrada, int salida, int Sueldo, String username, String contraseña, int ID, Date fecha, String nombre) {
        super(ID, fecha, nombre);
        this.rol = rol;
        this.entrada = entrada;
        this.salida = salida;
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

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
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
        return "Empleado{" + "rol=" + rol + ", entrada=" + entrada + ", salida=" + salida + ", Sueldo=" + Sueldo + ", username=" + username + ", contrase\u00f1a=" + contraseña + '}';
    }
}
