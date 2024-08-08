import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            str = str.charAt(str.length()-1) + str.substring(0,str.length()-1);
            if (text.contains(str)) {
                System.out.println("yes");
                break;
            }
            if (i == str.length()-1) {
                System.out.println("no");
            }
        }

    }
}
