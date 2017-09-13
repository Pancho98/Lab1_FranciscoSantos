
package lab1_franciscosantos;

import java.util.ArrayList;
import java.util.Date;


public class Cliente extends Persona{
    private ArrayList<Mascota> mct = new ArrayList();
    private ArrayList<Producto> pdt = new ArrayList();
    private int turnos;
    private int efectivo;

    public Cliente() {
        super();
    }

    public Cliente(int turnos, int efectivo) {
        this.turnos = turnos;
        this.efectivo = efectivo;
    }

    public Cliente(int turnos, int efectivo, int ID, Date fecha, String nombre) {
        super(ID, fecha, nombre);
        this.turnos = turnos;
        this.efectivo = efectivo;
    }

    public ArrayList<Mascota> getMct() {
        return mct;
    }

    public void setMct(ArrayList<Mascota> mct) {
        this.mct = mct;
    }

    public ArrayList<Producto> getPdt() {
        return pdt;
    }

    public void setPdt(ArrayList<Producto> pdt) {
        this.pdt = pdt;
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
        return "Cliente{" + "mct=" + mct + ", pdt=" + pdt + ", turnos=" + turnos + ", efectivo=" + efectivo + '}';
    }
    
    
}
