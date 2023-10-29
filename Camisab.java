public class Camisab extends Prenda {
    String talla;
    String color;
    
    public Camisab(int id, int cantd, int cantv, String estado, double precio, String categoria, String talla,
            String color) {
        super(id, cantd, cantv, estado, precio, categoria);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
