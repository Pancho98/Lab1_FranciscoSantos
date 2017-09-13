
package lab1_franciscosantos;

import java.awt.Color;
import java.util.Date;


public class Canario extends Mascota{
    private Color plumaje;

    public Canario() {
        super();
    }

    public Canario(Color plumaje) {
        this.plumaje = plumaje;
    }

    public Canario(Color plumaje, String nombre, String raza, Date nacimiento, String enfermedad, int visitas) {
        super(nombre, raza, nacimiento, enfermedad, visitas);
        this.plumaje = plumaje;
    }

    public Color getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(Color plumaje) {
        this.plumaje = plumaje;
    }

    @Override
    public String toString() {
        return "Canario{" + "plumaje=" + plumaje + '}';
    }
    
    
}
