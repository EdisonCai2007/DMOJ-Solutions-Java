import java.io.*;
import java.util.*;

public class SurmisingASprintersSpeed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        double[][] stats = new double[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            stats[i][0] = Double.parseDouble(st.nextToken());
            stats[i][1] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(stats, (x,y) -> Double.compare(x[0], y[0]));

        double maxSpeed = 0;
        for (int i = 0; i < N-1; i++) {
            double speed = Math.abs((stats[i+1][1] - stats[i][1]) / (stats[i+1][0] - stats[i][0]));
            if (speed > maxSpeed) {
                maxSpeed = speed;
            }
        }

        System.out.println(maxSpeed);
    }
}
