import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = {4,5,6};
        //Chamada por valor, mas passa a referência ao objeto
        incrementarNumero(numeros);
        for(int i: numeros) System.out.println(i);
    }

    private static void incrementarNumero(int array[]) {
        array[0]++;
    }
}