import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int numerator = Integer.parseInt(br.readLine());
    int denominator = Integer.parseInt(br.readLine());

    int whole = numerator / denominator;
    int remainder = numerator % denominator;

    for (int i = 2; i <= Math.min(remainder, denominator); i++) {
      if (remainder % i == 0 && denominator % i == 0) {
        remainder /= i;
        denominator /= i;
        i = 1;
      }
    }
    if (remainder == 0) {
      System.out.println(whole);
    } else {
      if (whole == 0) {
        System.out.println(remainder + "/" + denominator);
      } else {
        System.out.println(whole + " " + remainder + "/" + denominator);
      }
    }
  }
}
