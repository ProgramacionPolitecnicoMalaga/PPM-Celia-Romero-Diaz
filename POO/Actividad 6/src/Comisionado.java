public class Comisionado extends Empleado {

    private int sueldoPorVenta;
    private double numeroVentas;
    private double sueldoBase;


    public Comisionado(String nombre, String apellidos, String DNI,
                       double numeroVentas, double sueldoBase, int sueldoPorVenta){
        super(nombre,apellidos,DNI);
        this.sueldoPorVenta = sueldoPorVenta;
        this.numeroVentas = numeroVentas;
        this.sueldoBase = sueldoBase;

    }

    @Override
    public double getSueldo() {
        return sueldoBase + (double) numeroVentas * sueldoPorVenta;
    }
}
