import java.io.*;
import java.util.*;

public class ConspicuousCrypticChecklist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            items.add(br.readLine());
        }

        int pass = 0;
        for (int i = 0; i < M; i++) {
            boolean fail = false;
            int T = Integer.parseInt(br.readLine());
            for (int j = 0; j < T; j++) {
                if (!items.contains(br.readLine())) {
                    fail = true;
                }
            }
            
            if (!fail) {
                pass++;
            }
        }

        System.out.println(pass);
    }
}
