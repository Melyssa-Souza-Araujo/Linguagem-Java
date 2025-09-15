package notas;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, tamanhoVetor;
		tamanhoVetor = 3;
		float media = 0;
		float notas[] = new float[ tamanhoVetor ];
		Scanner entrada = new Scanner (System.in);
		
		for(i = 0; i < tamanhoVetor; i++) {
			System.out.print("Entre com a " + (i=1) + "ª nota: ");
			notas[i] = entrada.nextFloat();
			media += notas[i];
		}
		
		media /= tamanhoVetor;
		
		if(media >= 7) {
			System.out.print("Sua média é " + media + "\n Parabéns! Você foi aprovado!");
		} else {
			System.out.print("Sua média é " + media + "\n Terá que estudar mais! Você foi reprovado!");
		}
	}
}
