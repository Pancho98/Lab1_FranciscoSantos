
package lab1_franciscosantos;

import java.io.Serializable;
import java.util.Date;


public class Mascota implements Serializable{
    private String nombre;
    private String raza;
    private Date nacimiento;
    private String enfermedad;
    private int visitas;
    
    private static final long SerialVersionUID=999L;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, Date nacimiento, String enfermedad, int visitas) {
        this.nombre = nombre;
        this.raza = raza;
        this.nacimiento = nacimiento;
        this.enfermedad = enfermedad;
        this.visitas = visitas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", raza=" + raza + ", nacimiento=" + nacimiento + ", enfermedad=" + enfermedad + ", visitas=" + visitas + '}';
    }
    
    
}
