package codigos;
public class Codigo15_Ternario {
    public static void main(String[] args) {
        int num = 5;
        String resultado = (num % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(resultado);
    }
}