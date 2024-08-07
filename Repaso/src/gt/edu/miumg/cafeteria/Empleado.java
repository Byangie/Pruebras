package gt.edu.miumg.cafeteria;

public class Empleado {
    private String nombre;
    private String puesto;
    private int precio;

    public Empleado(String nombre, String puesto, int precio) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.precio = precio;
    }

    public void trabajar(){}
    public void tomarOrden(){
        System.out.println("Tomar Orden...");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
