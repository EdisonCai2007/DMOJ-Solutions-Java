import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vertCount = 0;
        int horCount = 0;

        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine();

        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == 'V') {
                vertCount++;
            }
            else {
                horCount++;
            }
        }

        if (vertCount % 2 == 0 && horCount % 2 == 0) {
            System.out.println("1 2\n3 4");
        }
        else if (vertCount % 2 == 0) {
            System.out.println("3 4\n1 2");
        }
        else if (horCount % 2 == 0) {
            System.out.println("2 1\n4 3");
        }
        else {
            System.out.println("4 3\n2 1");
        }
    }
}
