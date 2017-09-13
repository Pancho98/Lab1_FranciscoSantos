
package lab1_franciscosantos;


public class Comida extends Producto{
    private String tipo;

    public Comida() {
        super();
    }

    public Comida(String tipo) {
        this.tipo = tipo;
    }

    public Comida(String tipo, int precio, String marca) {
        super(precio, marca);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Comida{" + "tipo=" + tipo + '}';
    }
    
    
}
