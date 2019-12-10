public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;

    public Empleado(String nombre, String apellidos, String DNI){
        this.nombre= nombre;
        this.apellidos= apellidos;
        this.DNI= DNI;
    }

    public abstract double getSueldo();

    public String toString(){
        return "\nNombre: " + nombre +
                "\nApellido: " + apellidos +
                "\nDNI: " + DNI +
                "\nSueldo: " + getSueldo();
    }
}
