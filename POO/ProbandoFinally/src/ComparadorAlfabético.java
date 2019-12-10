import java.util.Comparator;

public class ComparadorAlfabético implements Comparator<ClaseDePrueba> {
    @Override
    public int compare(ClaseDePrueba o1, ClaseDePrueba o2) {
        return o1.getCadena().compareTo(o2.getCadena());
    }

}
