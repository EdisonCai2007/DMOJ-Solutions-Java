import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int c = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());

    ArrayList<Integer> xHistory = new ArrayList<Integer>();
    ArrayList<Integer> yHistory = new ArrayList<Integer>();

    int a=-1,b=-1,x=0,y=0;
    while (a != 0 || b != 0) {
      st = new StringTokenizer(br.readLine());

      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());

      if (x + a < 0) {
        x = 0;
      } else if (x + a > c) {
        x = c;
      } else {
        x += a;
      }

      if (y + b < 0) {
        y = 0;
      } else if (y + b > r) {
        y = r;
      } else {
        y += b;
      }

      if (a != 0 || b != 0) {
        xHistory.add(x);
        yHistory.add(y);
      }
    }

    for (int i = 0; i < xHistory.size(); i++) {
      System.out.println(xHistory.get(i) + " " + yHistory.get(i));
    }
  }
}
