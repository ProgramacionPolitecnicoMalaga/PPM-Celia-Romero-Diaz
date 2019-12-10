public class Pila {
    Robot[] pila;
    int cima, longitudPila;
    public Pila(int longitud){
        longitudPila = longitud;
        cima = -1;
        pila = new int [longitud];
    }

    public void insertar(Robot robot){
        if(cima < longitudPila-1){
            cima++;
            pila[cima] = robot;
        }
    }

    public int extraer(){
        Robot elemento= null;
        if(cima >0){
            elemento=pila[cima];
        }
    }

}
