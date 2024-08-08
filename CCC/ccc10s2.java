import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, String> binary = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String tempName = st.nextToken();
            binary.put(st.nextToken(),tempName);
        }

        String string = br.readLine();
        int i = 0;
        while (!string.equals("")) {
            if (binary.containsKey(string.substring(0,i))) {
                //System.out.println(string.substring(i));
                System.out.print(binary.get(string.substring(0,i)));
                string = string.substring(i);
                i = 0;
            } else {
                i++;
            }
        }
    }
}
