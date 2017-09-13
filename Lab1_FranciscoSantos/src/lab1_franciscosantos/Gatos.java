
package lab1_franciscosantos;

import java.util.Date;


public class Gatos extends Mascota{
    private boolean pelaje;

    public Gatos() {
        super();
    }

    public Gatos(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public Gatos(boolean pelaje, String nombre, String raza, Date nacimiento, String enfermedad, int visitas) {
        super(nombre, raza, nacimiento, enfermedad, visitas);
        this.pelaje = pelaje;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Gatos{" + "pelaje=" + pelaje + '}';
    }
    
    
}
