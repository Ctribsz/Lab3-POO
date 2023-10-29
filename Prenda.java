public class Prenda {
    int id;
    int cantd;
    int cantv;
    String estado;
    double precio;
    String categoria;

    public Prenda(int id, int cantd, int cantv, String estado, double precio, String categoria) {
        this.id = id;
        this.cantd = cantd;
        this.cantv = cantv;
        this.estado = estado;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantd() {
        return cantd;
    }

    public void setCantd(int cantd) {
        this.cantd = cantd;
    }

    public int getCantv() {
        return cantv;
    }

    public void setCantv(int cantv) {
        this.cantv = cantv;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   
}
