import java.util.Objects;

public class ClaseDePrueba implements Comparable<ClaseDePrueba> {
    private int valor;
    private String cadena;

    public ClaseDePrueba(int valor, String cadena) {
        this.valor = valor;
        this.cadena = cadena;
    }
    public int getValor() {
        return valor;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena){
        this.cadena = cadena;
    }


    @Override
    public String toString() {+
        return "CP{" +
                "V=" + valor +
                ", C='" + cadena + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        return ((ClaseDePrueba) o).getCadena().equalsIgnoreCase(cadena);
    }

    @Override
    public int compareTo(ClaseDePrueba o) {
        return ClaseDePrueba.compareTo(o2);
    }
}
