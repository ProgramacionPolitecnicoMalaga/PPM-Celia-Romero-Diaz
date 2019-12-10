public class MainPila {

    private final static int LONGITUD_MAXIMA = 100;

    public static void main(String[] args) {
        Pila pila = new Pila(LONGITUD_MAXIMA);
        Robot nano = new NanoBot();
        Robot mega = new Megabot();
        Robot mid = new MidBot();

        pila.insertar(nano);
        pila.insertar(mega);
        pila.insertar(mid);
    }
}
