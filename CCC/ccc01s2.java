import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(scanner.readLine());
        int max = Integer.parseInt(scanner.readLine());
        int num = min;
        int increment = 1;
        int posy = 4;
        int posx = 4;

        int[][] array = new int[10][10];
        array[posy][posx] = min;
        num++;
        while (num <= max) {
            //Down
            for (int j = 0; j < increment; j++) {
                posy++;
                array[posy][posx] = num++;
                if (num > max) break;
            }
            if (num > max) break;

            //Right
            for (int j = 0; j < increment; j++) {
                posx++;
                array[posy][posx] = num++;
                if (num > max) break;
            }
            if (num > max) break;

            increment++;

            //Up
            for (int j = 0; j < increment; j++) {
                posy--;
                array[posy][posx] = num++;
                if (num > max) break;
            }
            if (num > max) break;

            //Left
            for (int j = 0; j < increment; j++) {
                posx--;
                array[posy][posx] = num++;
                if (num > max) break;
            }
            if (num > max) break;

            increment++;
        }

        for (int[] i:array) {
            int n = 0;
            for (int j:i) {
                if (j != 0) System.out.print(j+" ");
                else n++;
            }
            if (n != 10) System.out.print("\n");
        }
    }
}
