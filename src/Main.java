import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Escreva um programa que lê os números de um jogo da mega sena
        Os jogos podem ter de 6 a 10 números de 1 a 60
        Ler os números e imprime o jogo ordenado e o preço
            6 números: R$ 5,00
            7 números: R$ 35,00
            8 números: R$ 140,00
            9 números: R$ 420,00
            10 números: R$ 1.050,00
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade números: ");
        int quantidade = scanner.nextInt();
        int numeros[] = new int[quantidade];
        for(int i=0;i<quantidade;i++){
            System.out.println("Informe o número:");
            numeros[i] = scanner.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println("Jogo: "+Arrays.toString(numeros));
        double preco = switch (quantidade){
            case 6 -> 5;
            case 7 -> 35;
            case 8 -> 140;
            case 9 -> 420;
            case 10 ->1050;
            default -> 0;
        };
        System.out.println("Preço: "+preco);

    }
}