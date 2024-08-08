import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    int[] swiftScore = new int[N];
    int[] semaScore = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      swiftScore[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      semaScore[i] = Integer.parseInt(st.nextToken());
    }

    int swiftSum = 0;
    int semaSum = 0;
    int max = 0;
    for (int i = 0; i < N; i++) {
      swiftSum += swiftScore[i];
      semaSum += semaScore[i];
      if (swiftSum == semaSum) {
        max = i + 1;
      }
    }

    System.out.println(max);
  }
}
