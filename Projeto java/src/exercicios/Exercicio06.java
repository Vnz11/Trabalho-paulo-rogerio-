package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Digite y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Digite y2: ");
        double y2 = scanner.nextDouble();


        double d = (double)(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));


        System.out.println("Ponto 1: (" + x1 + "," + y1 + ")");
        System.out.println("Ponto 2: (" + x2 + "," + y2 + ")");
        System.out.println("Distância: " + d);

        scanner.close();
    }
}