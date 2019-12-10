public class PorHoras extends Empleado {

    private double sueldoPorHora;
    private double horasTrabajadas;

    public PorHoras(String nombre, String apellidos, String DNI,
                    double sueldoPorHora, double horasTrabajadas){
        super(nombre,apellidos,DNI);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double getSueldo() {
        return horasTrabajadas * sueldoPorHora;
    }
}
