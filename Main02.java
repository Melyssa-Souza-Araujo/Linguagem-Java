package exemplo;

import java.util.Scanner;

public class Main02 {
    private static final double PI = 3.14159;

    static double areaCirculo(double raio) {
        return PI * raio * raio;
    }

    static double perimetroCirculo(double raio) {
        return PI * raio * raio;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        double r = entrada.nextDouble();

        double area = Main.areaCirculo(r);
        double perimetro = Main.perimetroCirculo(r);

        System.out.println("Área do círculo = " + area);
        System.out.println("Perímetro do círculo = " + perimetro);
        System.out.println("Valor de pi...: " + Main.PI);
    }
}
