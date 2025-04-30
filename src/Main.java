import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Escreva um programa que lê as notas de X alunos.
        Notas do tipo double, 0 até 10;
        Apresentar as notas ordenadas.
        Maior nota, Menor nota, média.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos: ");
        int quantidade = scanner.nextInt();
        double notas[] = new double[quantidade];
        for(int i=0;i<quantidade;i++){
            System.out.println("Informe a nota:");
            notas[i] = scanner.nextDouble();
        }
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));
        System.out.println("Menor: "+notas[0]);
        System.out.println("Maior: "+notas[quantidade-1]);
        double soma = 0;
        for(double nota: notas) soma+=nota;
        System.out.println("Média da turma: "+(soma/quantidade));
    }
}