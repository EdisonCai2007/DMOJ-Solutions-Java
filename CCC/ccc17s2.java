import java.io.*;
import java.util.*;


public class HigeTideLowTide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] tides = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tides[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tides);

        if (N % 2 == 0) {
            for (int i = 0; i < N / 2; i++) {
                System.out.print(tides[N / 2 - 1 - i] + " ");
                System.out.print(tides[N / 2 + i] + " ");
            }
        } else {
            for (int i = 0; i < N / 2; i++) {
                System.out.print(tides[N / 2 - i] + " ");
                System.out.print(tides[N / 2 + 1 + i] + " ");
            }
            System.out.print(tides[0] + " ");
        }
    }
}
