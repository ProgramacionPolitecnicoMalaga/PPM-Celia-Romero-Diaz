public class Nominas {

    public static void main(String[] args) {
        Empleado e1 = new Asalariado("Juan", "González", "7384937M",
                                     1800.0);
        Empleado e2 = new PorHoras("Pedro", "Martínez", "937368J",
                                    80, 10);
        Empleado e3= new Comisionado("José", "Ramírez", "1949829R",
                                    50, 900, 50);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
