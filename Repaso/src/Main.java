import gt.edu.miumg.cafeteria.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Empleado empleado = new Empleado("Juan Perez", "Gerente", 1500);
        System.out.println("empleado" + empleado);
        Empleado empleado2 = new Empleado("Juan Mejía", "Supervisor", 2000);
        System.out.println("empleado2" + empleado2);

        Equipo equipo = new Equipo("Cocina", "Apagado");
        System.out.println("equipo =" + equipo);

        Ingrediente grano = new Grano("Cafe");
        System.out.println("ingrediente1 = " + grano);
        Ingrediente Leche = new Leche( 10);
        System.out.println("ingrediente2 = " + Leche);
        Ingrediente agua = new Agua( 20);
        System.out.println("ingrediente3 = " + agua);

        Cafe colombiano = new CafeColombiano("Cafe colombiano", 10, 5);
        System.out.println("cafe = " + colombiano);
        Cafe espresso = new EspressoItaliano(7,10,5);
        System.out.println("espresso = " + espresso);

        Sucursal sucursalColombia = new Sucursal("Sucursal Colombia", "Zona 10");
        System.out.println("Sucursal Colombia = " + sucursalColombia);
        sucursalColombia.agregarEmpleado(empleado);
        sucursalColombia.agregarEmpleado(empleado2);
        sucursalColombia.agregarEquipo(equipo);
        sucursalColombia.agregarEspecialidad(colombiano);
        System.out.println("Sucursal Colombia = " + sucursalColombia);

        Sucursal sucursalItalia = new Sucursal("Sucursal Italia", "Zona 10");
        System.out.println("Sucursal Italia = " + sucursalItalia);
        sucursalItalia.agregarEmpleado(empleado);
        sucursalItalia.agregarEmpleado(empleado2);
        sucursalItalia.agregarEquipo(equipo);
        sucursalItalia.agregarEspecialidad(espresso);
        System.out.println("Sucursal Italia = " + sucursalItalia);

    }
}