import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer,String> cityTemp = new TreeMap<Integer,String>();

        while (true) {
            String [] info = scanner.nextLine().split(" ");
            cityTemp.put(Integer.parseInt(info[1]),info[0]);

            if (info[0].equals("Waterloo")) {
                break;
            }
        }

        System.out.println(cityTemp.get(cityTemp.firstKey()));
    }
}
