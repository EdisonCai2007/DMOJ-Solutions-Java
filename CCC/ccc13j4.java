import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int[] chores = new int[C];

        for (int i = 0; i < C; i++) {
            chores[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(chores);

        int choresDone = 0;
        for (int chore: chores) {
            T -= chore;
            if (T < 0) {
                break;
            } else if (T == 0) {
                choresDone++;
                break;
            }
            choresDone++;
        }
        System.out.println(choresDone);
    }
}
