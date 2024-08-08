import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int question = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        String[] Dstr = br.readLine().split(" ");
        String[] Pstr = br.readLine().split(" ");
        int[] D = new int[N];
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            D[i] = Integer.parseInt(Dstr[i]);
            P[i] = Integer.parseInt(Pstr[i]);
        }

        Arrays.sort(D);
        Arrays.sort(P);

        int sum = 0;
        if (question == 1) {
            for (int i = 0; i < N; i++) {
                sum += Math.max(D[N - i - 1], P[N - i - 1]);
            }
        }
        else if (question == 2) {
            int d = N-1;
            int p = N-1;
            for (int i = 0; i < N; i++ ) {
                sum += Math.max(D[d],P[p]);
                if (D[d] > P[p]) {
                    d -= 1;
                }
                else {
                    p -= 1;
                }
            }
        }
        System.out.println(sum);
    }
}
