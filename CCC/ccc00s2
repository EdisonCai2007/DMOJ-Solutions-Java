import java.io.*;
import java.util.*;

public class BabblingBrooks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        LinkedList<Double> flow = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            flow.add(Double.parseDouble(br.readLine()));
        }

        int input;
        do {
            input = Integer.parseInt(br.readLine());
            if (input == 99) {
                int streamNum = Integer.parseInt(br.readLine())-1;
                double percentage = Double.parseDouble(br.readLine())/100.0;

                flow.add(streamNum+1,flow.get(streamNum) * (1-percentage));
                flow.set(streamNum, flow.get(streamNum) * percentage);
            } else if (input == 88) {
                int streamNum = Integer.parseInt(br.readLine())-1;
                flow.set(streamNum, flow.get(streamNum) + flow.get(streamNum+1));
                flow.remove(flow.get(streamNum+1));
            }
        } while (input != 77);

        for (double x : flow) {
            System.out.print(x + " ");
        }
    }
}
