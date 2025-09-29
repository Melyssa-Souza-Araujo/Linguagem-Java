package exeption;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int valor1 = 0;
			int valor2 = 0;
			int resultado = 0;
			System.out.print("Entre com o primeiro valor: ");
			valor1 = entrada.nextInt();
			System.out.print("Entre com o segundo valor: ");
			valor2 = entrada.nextInt();
			resultado = valor1 / valor2;
			System.out.print("A divisão dos valores é: " + resultado);
		}
	}
}
