import java.io.*;
import java.util.*;

public class TheGenevaConfection {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> mountain;
        Stack<Integer> branch;

        int T = Integer.parseInt(br.readLine()); // Num queries
        for (int i = 0; i < T; i++) {
            String result = "Y";
            int N = Integer.parseInt(br.readLine());

            int numNeeded = 1;
            mountain = new Stack<>();
            branch = new Stack<>();
            for (int j = 0; j < N; j++) {
                mountain.push(Integer.parseInt(br.readLine()));
            }
            while (numNeeded <= N) {
                if (!mountain.isEmpty() && mountain.peek() == numNeeded) {
                    mountain.pop();
                    numNeeded++;
                } else if (!branch.isEmpty() && branch.peek() == numNeeded) {
                    branch.pop();
                    numNeeded++;
                } else {
                    if (!branch.isEmpty() && mountain.peek() > branch.peek()) {
                        result = "N";
                        break;
                    } else {
                        branch.push(mountain.pop());
                    }
                }
            }

            System.out.println(result);
        }
    }
}
