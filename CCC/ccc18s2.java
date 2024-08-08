import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimension = scanner.nextInt();
        int[][] array = new int[dimension][dimension];

        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                array[row][col] = scanner.nextInt();
            }
        }

        int smallestValue = Integer.MAX_VALUE;
        int[][] smallestArray = new int[dimension][dimension];
        for (int i = 0; i < 4; i++) {
            int[][] newArray = new int[dimension][dimension];
            if (i == 0) {
                smallestArray = array;
            }

            for (int col = 0; col < dimension; col++) {
                int[] coloumn = new int[dimension];
                for (int j = 0; j < dimension; j++) {
                    coloumn[j] = array[j][col];
                }
                newArray[dimension-1-col] = coloumn;
            }

            if (newArray[0][0] < smallestArray[0][0]) {
                smallestArray = newArray;
            }

            array = newArray;
        }


        for (int row = 0; row < dimension; row++) {
            String output = "";
            for (int col = 0; col < dimension; col++) {
                output = output + smallestArray[row][col] + " ";
            }
            System.out.println(output);
        }
    }
}
