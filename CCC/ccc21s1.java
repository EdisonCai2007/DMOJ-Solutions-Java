import java.util.Scanner;
import java.lang.Integer;
import java.lang.Float;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numFences = Integer.valueOf(scanner.nextLine());
		String heights[] = scanner.nextLine().split("\\s+");
		String widths[] = scanner.nextLine().split("\\s+");

		double totalArea = 0;
		for(int i = 0; i < numFences; i++) {
			totalArea = totalArea + ((Float.valueOf(heights[i]) + Float.valueOf(heights[i+1])) /2.0) * Float.valueOf(widths[i]);
		}

		System.out.println(totalArea);
	}
}
