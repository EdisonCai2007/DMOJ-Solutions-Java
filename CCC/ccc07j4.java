import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];
        String l1 = br.readLine().replaceAll("\\s+","");
        String l2 = br.readLine().replaceAll("\\s+","");

        for (int i = 0; i < l1.length(); i++) {
            alphabet[((char) l1.charAt(i))-65]++;
        }

        for (int i = 0; i < l2.length(); i++) {
            alphabet[((char) l2.charAt(i))-65]--;
            if (alphabet[((char) l2.charAt(i))-65] < 0) {
                System.out.println("Is not an anagram.");
                return;
            }
        }
        System.out.println("Is an anagram.");
    }
}
