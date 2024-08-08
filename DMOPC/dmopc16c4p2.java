import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Systests {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int B = Integer.parseInt(br.readLine());

        int[][] batches = new int[B][3];
        for (int i = 0; i < B; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                batches[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int F = Integer.parseInt(br.readLine());
        int[] fails = new int[F];
        for (int i = 0; i < F; i++) {
            fails[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(fails);

        int score = 0;
        for (int[] batch : batches) {
            if (binarySearchFirst(batch[0],fails) == binarySearchSecond(batch[1],fails)) {
                score += batch[2];
            }
        }

        System.out.println(score);
    }

    public static int binarySearchFirst(int key, int[] fails) {
        int left = 0;
        int right = fails.length-1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (key > fails[mid]) {
                left = mid + 1;
            } else if (key < fails[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static int binarySearchSecond(int key, int[] fails) {
        int left = 0;
        int right = fails.length-1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (key >= fails[mid]) {
                left = mid + 1;
            } else if (key < fails[mid]) {
                right = mid - 1;
            }
        }
        return left;
    }
}
