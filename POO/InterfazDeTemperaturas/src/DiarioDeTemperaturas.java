public class DiarioDeTemperaturas implements ConsumidorDeTemperatura {
    private double temperaturasPorHoras[];

    public DiarioDeTemperaturas(){
            temperaturasPorHoras = new double[24];
    }

    @Override
    public void setNuevaTemperatura(double temperatura, int hora) {
        temperaturasPorHoras[hora] = temperatura;
        temperatura++;
    }

    @Override
    public String toString() {
        String cadena = "";
        for(int i=0; i<temperaturasPorHoras.length; i++){
            cadena += i + "(" + temperaturasPorHoras[i] + ") - ";
        }
        return cadena;
    }
}
