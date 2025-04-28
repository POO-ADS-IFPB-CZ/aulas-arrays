import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[][] = new int[3][];
        array[0] = new int[5];
        array[1] = new int[6];
        array[2] = new int[3];

        int array2[][] = new int[3][4];

        int array3[][] = {{3,4,5}, {4,5,7,8},{4,1,0,7}};

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}