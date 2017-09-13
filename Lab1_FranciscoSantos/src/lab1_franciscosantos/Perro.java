
package lab1_franciscosantos;

import java.util.Date;


public class Perro extends Mascota{
    private String tamaño;

    public Perro() {
        super();
    }

    public Perro(String tamaño) {
        this.tamaño = tamaño;
    }

    public Perro(String tamaño, String nombre, String raza, Date nacimiento, String enfermedad, int visitas) {
        super(nombre, raza, nacimiento, enfermedad, visitas);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "tama\u00f1o=" + tamaño + '}';
    }
    
    
}
