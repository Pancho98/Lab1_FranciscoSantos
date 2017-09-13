package lab1_franciscosantos;

import java.awt.Color;


public class Collares extends Producto{
    private String material;
    private Color color;

    public Collares() {
        super();
    }

    public Collares(String material, Color color) {
        this.material = material;
        this.color = color;
    }

    public Collares(String material, Color color, int precio, String marca) {
        super(precio, marca);
        this.material = material;
        this.color = color;
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
        return "Collares{" + "material=" + material + ", color=" + color + '}';
    }
    
    
}
