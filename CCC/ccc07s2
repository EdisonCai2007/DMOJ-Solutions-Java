import java.io.*;
import java.util.*;

public class Boxes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] standard = new int[N][4];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            standard[i][0] = Integer.parseInt(st.nextToken());
            standard[i][1] = Integer.parseInt(st.nextToken());
            standard[i][2] = Integer.parseInt(st.nextToken());
            standard[i][3] = standard[i][0] * standard[i][1] * standard[i][2];

            Arrays.sort(standard[i]);
        }
        Arrays.sort(standard, (x,y) -> Integer.compare(x[0],y[0]));

        int M = Integer.parseInt(br.readLine());

        int[] box = new int[3];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            box[0] = Integer.parseInt(st.nextToken());
            box[1] = Integer.parseInt(st.nextToken());
            box[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(box);

            int min = 1000000001;
            for (int[] s : standard) {
                if (box[0] <= s[0]) {
                    if (box[1] <= s[1] && box[2] <= s[2] && s[3] < min) {
                        min = s[3];
                    }
                }
            }
            if (min <= 1000000000) {
                System.out.println(min);
            } else {
                System.out.println("Item does not fit.");
            }
        }
    }
}
