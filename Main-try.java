package entradatry;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Digite um valor inteiro: ");
            Scanner entrada = new Scanner(System.in); // CORRIGIDO
            int valorInteiro = entrada.nextInt();
            int array[] = new int[valorInteiro];
 
            for (int i = 0; i < valorInteiro; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");
                array[i] = entrada.nextInt();
            }
 
        } catch (InputMismatchException ime) {
            System.out.println("\n\n***Cara, pedi para digitar um número, pô!\n");
        } catch (Exception e) {
            System.out.println("\n\n***Cara, bugou o sistema!\nEXCEPTION:");
            System.out.println("Class " + e.getClass() + "\n\n");
        }
    }
}
