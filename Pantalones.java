public class Pantalones extends Prenda {
    int talla;
    String tipo;

    public Pantalones(int id, int cantd, int cantv, String estado, double precio, String categoria, int talla, String tipo) {
        super(id, cantd, cantv, estado, precio, categoria);
        this.talla = talla;
        this.tipo = tipo;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
