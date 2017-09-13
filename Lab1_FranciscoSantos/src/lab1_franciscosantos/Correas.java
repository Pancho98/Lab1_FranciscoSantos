
package lab1_franciscosantos;

import java.awt.Color;


public class Correas extends Producto{
    private int longitud;
    private String material;
    private Color color;

    public Correas() {
        super();
    }

    public Correas(int longitud, String material, Color color) {
        this.longitud = longitud;
        this.material = material;
        this.color = color;
    }

    public Correas(int longitud, String material, Color color, int precio, String marca) {
        super(precio, marca);
        this.longitud = longitud;
        this.material = material;
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Correas{" + "longitud=" + longitud + ", material=" + material + ", color=" + color + '}';
    }
    
    
}
