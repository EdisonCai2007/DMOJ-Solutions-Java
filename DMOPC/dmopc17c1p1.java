import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FujoNeko {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        ArrayList<Integer> xRows = new ArrayList<>();
        ArrayList<Integer> xCols = new ArrayList<>();

        for (int i = 0; i < R; i++) {
            String row = br.readLine();
            for (int j = 0; j < C; j++) {
                if (row.charAt(j) == 'X') {
                    xCols.add(j);
                    xRows.add(i);
                }
            }
        }

//        System.out.println(xRows);
//        System.out.println(xCols);

        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            if (xCols.contains(x) || xRows.contains(y)) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
