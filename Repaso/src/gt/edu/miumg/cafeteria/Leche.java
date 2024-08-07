package gt.edu.miumg.cafeteria;

public class Leche implements Ingrediente{
    private String tipo;
    private int cantidad;

    public Leche(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String ObtenerNombre() {
        return "Leche" + tipo;
    }

    @Override
    public int ObtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Leche{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
