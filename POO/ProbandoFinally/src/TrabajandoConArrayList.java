import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class TrabajandoConArrayList {

    public static boolean predicado(ClaseDePrueba elemento){
        return elemento.getValor() < 100;
    }

    public static void main(String[] args) {
        ClaseDePrueba elementoABorrar = new ClaseDePrueba(100, "e1");
        ArrayList<ClaseDePrueba> array = new ArrayList<>();

        array.add(new ClaseDePrueba(1,"e1"));
        array.add(new ClaseDePrueba(2,"e2"));
        array.add(new ClaseDePrueba(3,"e3"));
        array.add(1, new ClaseDePrueba(0, "e0"));
        array.add(1, new ClaseDePrueba(100, "e100"));
        array.add(new ClaseDePrueba(100, "e200"));
        array.add(new ClaseDePrueba(3,"E1"));
        // array.remove(elementoABorrar);

       /*  Iterator<ClaseDePrueba> it = array.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

        /*ArrayList<ClaseDePrueba> array2 = new ArrayList<>();
        array2.add(new ClaseDePrueba(200, "e200"));
        array2.add(new ClaseDePrueba(201, "e201"));
        array2.add(new ClaseDePrueba(202, "e202"));

        array2.addAll(array);
        System.out.println(array2);*/

        /* array.forEach(elemento -> {elemento.setCadena("-" + elemento.getCadena() + "-");});
        array.removeIf(elemento -> (elemento.getValor() < 100)); //predicado(elemento));
        System.out.println(array);*/
        /*System.out.printf("", array.indexOf(new ClaseDePrueba(100, "e0"))); //IndexOf te dice donde está la primera posición de ese elemento
        System.out.printf("", array.lastIndexOf(array.lastIndexOf(new ClaseDePrueba(100, "e0"))));*/
        ClaseDePrueba elementoBuscado = new ClaseDePrueba(100, "e100");
        Iterator<ClaseDePrueba> it = array.iterator();
        int i = 0;
        while(it.hasNext()){
            i++;
            if(elementoBuscado.equals(it.next()))
                System.out.println(i);

        MiComparador miComparador = new MiComparador();
        array.sort(miComparador);
        System.out.println(array);
        array.sort(new ComparadorAlfabético());
        System.out.println(array);
        array.sort((a,b) -> a.compareTo(b));
        System.out.println(array);
        }
    }
}
