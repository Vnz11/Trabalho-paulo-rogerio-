public class Sobrecarga {
    public void exibir(int x) {
        System.out.println("Valor inteiro: " + x);
    }

    public void exibir(String texto) {
        System.out.println("Texto: " + texto);
    }

    public void exibir(int x, String texto) {
        System.out.println(x + " - " + texto);
    }

    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga();
    }
}