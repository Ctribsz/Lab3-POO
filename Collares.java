public class Collares extends Prenda{
    String talla;
    String material;

    public Collares(int id, int cantd, int cantv, String estado, double precio, String categoria, String talla,
            String material) {
        super(id, cantd, cantv, estado, precio, categoria);
        this.talla = talla;
        this.material = material;
    }
    
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
