import java.util.Comparator;

public class MiComparador implements Comparator<ClaseDePrueba> {

    @Override
    public int compare(ClaseDePrueba o1, ClaseDePrueba o2) {
        return ClaseDePrueba.compareTo(o2);
    }

}
