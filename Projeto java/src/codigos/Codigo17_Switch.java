package codigos;
import java.util.Scanner;
public class Codigo17_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Hambúrguer");
                break;
            case 2:
                System.out.println("Pizza");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}