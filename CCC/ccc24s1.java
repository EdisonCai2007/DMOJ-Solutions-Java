import java.io.*;

public class HatCircle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int N = Integer.parseInt(br.readLine());
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N/2; i++) {
            if(H[i] == H[i + N/2]) {
                count += 2;
            }
        }

        System.out.println(count);
    }
}
