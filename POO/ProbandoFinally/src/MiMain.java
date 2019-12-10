public class MiMain {

    public static void main(String[] args) {
        try{
            int dividendo = 3;
            int divisor = 0;
            int division = dividendo/divisor;
            int[] array = new int[5];
            array[5] = 3;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Índice fuera de rango");
        } catch (ArithmeticException e){
            System.out.println("División por 0");
        } finally {
            System.out.println("Y otra cosa más...");
        }
    }
}
