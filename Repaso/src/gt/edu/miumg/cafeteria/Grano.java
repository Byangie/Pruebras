package gt.edu.miumg.cafeteria;

public class Grano implements Ingrediente{

    private String tipo;

    public Grano(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String ObtenerNombre() {
        return tipo;
    }

    @Override
    public int ObtenerCantidad() {
        return 1;
    }

    @Override
    public String toString() {
        return "Grano{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
