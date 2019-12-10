import java.util.Scanner;

public class GeneradorDatosTemperatura implements FuenteDeTemperatura {
    private double ultimaTemperaturaRegistrada;
    private int ultimaHoraRegistrada;
    private ConsumidorDeTemperatura[] consumidores;
    private final static int MAX_CONSUMIDORES = 100;
    private int numeroConsumidores;

    public GeneradorDatosTemperatura(){
        numeroConsumidores = 0;
        consumidores = new ConsumidorDeTemperatura[MAX_CONSUMIDORES];
    }

    @Override
    public void registrarConsumidor(ConsumidorDeTemperatura consumidor) {
        consumidores[numeroConsumidores] = consumidor;
        numeroConsumidores++;
    }

    @Override
    public void informarAConsumidores() {
        for (int i = 0; i < numeroConsumidores; i++)
        consumidores[i].setNuevaTemperatura(ultimaTemperaturaRegistrada, ultimaHoraRegistrada);
    }

    public void nuevaLecturaDeTemperatura(double temperatura, int hora){
        this.ultimaHoraRegistrada = hora;
        this.ultimaTemperaturaRegistrada = temperatura;
        informarAConsumidores();
    }
}
