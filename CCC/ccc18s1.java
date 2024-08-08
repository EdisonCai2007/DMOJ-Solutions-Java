import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class CCC_18_S1_VoronoiVillages {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		double [] villages = new double[scanner.nextInt()];
		
		for (int i = 0; i < villages.length; i++) {
			villages[i] = scanner.nextInt();
		}
		Arrays.sort(villages);
		
		double smallestSize = Double.MAX_VALUE;
		for(int i = 1; i < villages.length; i++) {
			if (i == 1) {
				smallestSize = villages[i]-(villages[i] + villages[i-1]/2) + (villages[i] + villages[i+1]/2)-villages[i];
			}
			if (i < villages.length-1) {
				
				if (villages[i]-((villages[i] + villages[i-1])/2) + ((villages[i] + villages[i+1])/2)-villages[i] < smallestSize) {
					smallestSize = villages[i]-((villages[i] + villages[i-1])/2) + ((villages[i] + villages[i+1])/2)-villages[i];
				}
				
			} else {
				break;
			}
		}
		
		System.out.println(new DecimalFormat("0.0").format(smallestSize));
	}

}
