
package lab1_franciscosantos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class Cliente extends Persona implements Serializable{
    private String mascota;
    private String producto;
    private int turnos;
    private int efectivo;
    
    private static final long SerialVersionUID=777L;

    public Cliente() {
        super();
    }

    public Cliente(String mascota, String producto, int turnos, int efectivo) {
        this.mascota = mascota;
        this.producto = producto;
        this.turnos = turnos;
        this.efectivo = efectivo;
    }

    public Cliente(String mascota, String producto, int turnos, int efectivo, int ID, Date fecha, String nombre) {
        super(ID, fecha, nombre);
        this.mascota = mascota;
        this.producto = producto;
        this.turnos = turnos;
        this.efectivo = efectivo;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "mascota=" + mascota + ", producto=" + producto + ", turnos=" + turnos + ", efectivo=" + efectivo + '}';
    }
    
    
}
