package exescanner;
import java.util.Scanner;

public class SomaDoisMaiores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int v1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int v2 = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int v3 = sc.nextInt();

        int soma;

        if (v1 <= v2 && v1 <= v3) {
            soma = v2 + v3;
        } else if (v2 <= v1 && v2 <= v3) {
            soma = v1 + v3;
        } else {
            soma = v1 + v2;
        }

        System.out.println("A soma dos dois maiores valores é: " + soma);

    }
}
