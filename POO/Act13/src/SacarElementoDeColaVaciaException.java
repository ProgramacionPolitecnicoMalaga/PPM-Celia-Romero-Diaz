class SacarElementoDeColaVaciaException extends ArrayIndexOutOfBoundsException {
    public SacarElementoDeColaVaciaException(String message, int head) {
        super(message);
        System.out.println("La cola ya esta vacia y la posicion de HEAD es " + head);
    }

    public String advertenciaExcepcion(){
        return "¡No podemos sacar mas elementos!";
    }
}
