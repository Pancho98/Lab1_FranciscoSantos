
package lab1_franciscosantos;

import java.util.Date;


public class Persona {
    private int ID;
    private Date fecha;
    private String nombre;

    public Persona() {
    }

    public Persona(int ID, Date fecha, String nombre) {
        this.ID = ID;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    
}
