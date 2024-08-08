import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    String[] words = new String[4];

    for (int i = 0; i < N; i++) { // Loops every poem
      
      for (int j = 0; j < 4; j++) { // Loops every line
        String line = br.readLine().toLowerCase();
        String lastWord = "";
        if (line.lastIndexOf(" ") != -1) {
          lastWord = line.substring(line.lastIndexOf(" "), line.length()); // Gets last word
        } else {
          lastWord = line;
        }
        for (int k = lastWord.length()-1; k >= 0; k--) { // Look for vowel
          char tempChar = lastWord.charAt(k);
          if (tempChar == 'a' || tempChar == 'e' || tempChar == 'i' || tempChar == 'o' || tempChar == 'u') {
            words[j] = lastWord.substring(k, lastWord.length());
            break;
          } else {
            words[j] = lastWord;
          }
        }
      }
      
      if (words[0].equals(words[1]) && words[1].equals(words[2]) && words[2].equals(words[3])) {
        System.out.println("perfect");
      } else if (words[0].equals(words[1]) && words[2].equals(words[3])) {
        System.out.println("even");
      } else if (words[0].equals(words[2]) && words[1].equals(words[3])) {
        System.out.println("cross");
      } else if (words[0].equals(words[3]) && words[1].equals(words[2])) {
        System.out.println("shell");
      } else {
        System.out.println("free");
      }
    }
  }
}
