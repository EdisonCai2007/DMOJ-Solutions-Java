import java.io.*;
import java.util.*;

public class KnittingScarves {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] next = new int[N+2];
        int[] prev = new int[N+2];

        for (int i = 0; i < N+1; i++) {
            next[i] = i + 1;
            prev[i] = i - 1;
        }

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            if (prev[L] != K) {
                int X = next[K];
                int A = prev[L];
                int B = next[R];

                next[K] = L;
                prev[L] = K;
                next[R] = X;
                prev[X] = R;
                next[A] = B;
                prev[B] = A;
            }
        }

        int colour = 0;
        while (next[colour] != N+1) {
            colour = next[colour];
            System.out.print(colour + " ");
        }
    }
}
