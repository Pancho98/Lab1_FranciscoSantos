
package lab1_franciscosantos;


public class Producto {
    private int precio;
    private String marca;

    public Producto() {
    }
    
    public Producto(int precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }
   
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", marca=" + marca + '}';
    }
    
    
}
