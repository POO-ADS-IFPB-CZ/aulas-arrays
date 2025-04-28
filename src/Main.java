import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de números:");
        int quantidade = scanner.nextInt();
        int array[] = new int[quantidade];

        for(int i=0;i<quantidade;i++){
            System.out.println("Informe o número:");
            array[i] = scanner.nextInt();
        }

        int soma = array[0];
        int maior = array[0];
        int menor = array[0];

        for(int i=1;i<quantidade;i++){
            soma+=array[i];
            if(array[i]>maior) maior = array[i];
            if(array[i]<menor) menor = array[i];
        }

        System.out.println("Soma:"+soma);
        System.out.println("Maior:"+maior);
        System.out.println("Menor:"+menor);

    }
}