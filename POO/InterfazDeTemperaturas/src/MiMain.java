import java.util.Scanner;

public class MiMain {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");
        GeneradorDatosTemperatura generadorDatos = new GeneradorDatosTemperatura();

        DiarioDeTemperaturas diario = new DiarioDeTemperaturas();
        PromedioTemperaturas promedio = new PromedioTemperaturas();
        RegistroTemperaturasCriticas registro = new RegistroTemperaturasCriticas();

        generadorDatos.registrarConsumidor(diario);
        generadorDatos.registrarConsumidor(promedio);
        generadorDatos.registrarConsumidor(registro);

        boolean terminar = false;
        while (!terminar){
            System.out.println("Indica la hora: ");
            int hora = lectorTeclado.nextInt();
            System.out.println("Indica la temperatura: ");
            double temperatura = lectorTeclado.nextDouble();
            generadorDatos.nuevaLecturaDeTemperatura(temperatura, hora);
            System.out.println("==================================");
            System.out.println(diario);
            System.out.println(promedio);
            System.out.println(registro);
            System.out.println("¿Terminar?: ");
            String cadenaTerminar = lectorTeclado.next();
            if (cadenaTerminar.equalsIgnoreCase("S"))
                terminar = true;
        }
    }
}
