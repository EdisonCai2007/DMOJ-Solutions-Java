import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int t = 0;
        int s = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 't' || str.charAt(j) == 'T') {
                    t++;
                }
                else if (str.charAt(j) == 's' || str.charAt(j) == 'S') {
                    s++;
                }
            }
        }

        if (t > s) {
            System.out.println("English");
        }
        else if (s >= t) {
            System.out.println("French");
        }
    }
}
