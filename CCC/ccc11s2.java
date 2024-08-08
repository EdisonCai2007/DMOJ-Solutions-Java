import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] responses = new String[N];
        String[] answers = new String[N];

        int o = 0;

        for (int i = 0; i < N; i++) {
            responses[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            answers[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            if (responses[i].equals(answers[i])) {
                o++;
            }
        }

        System.out.println(o);
    }
}
