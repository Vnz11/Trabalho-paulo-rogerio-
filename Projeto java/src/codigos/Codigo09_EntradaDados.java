package codigos;
import java.util.Scanner;
public class Codigo09_EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome);
    }
}