package exe01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Digite o primeiro número inteiro: ");
			int num1 = sc.nextInt();
			
			System.out.print("Digite o segundo número inteiro: ");
			int num2 = sc.nextInt();
			
			if(num1 == num2) {
				System.out.print("Números iguais");
			} else if(num1 > num2) {
				System.out.print("Primeiro número é maior");
			} else {
				System.out.print("Segundo número é maior");
			}
		} catch(InputMismatchException e) {
			System.out.print("Erro: você deve digitar apenas números inteiros!");
		}
	}
}
