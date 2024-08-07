package gt.edu.miumg.cafeteria;

public class CafeColombiano extends Cafe{
    private String tipoGrano;


    public CafeColombiano(String tipoGrano, int tamaño, double precio) {
        super("Cafe Colombiano", tamaño, precio);
        this.tipoGrano = tipoGrano;
        ingredientes.add(new Grano("tostado"));
        ingredientes.add(new Agua(100));
    }

    @Override
    public String toString() {
        return "CafeColombiano{" +
                "tipoGrano='" + tipoGrano + '\'' +
                '}';
    }
}
