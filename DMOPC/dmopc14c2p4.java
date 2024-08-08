import java.util.Arrays;
import java.util.Scanner;

public class DMOPC_14_P4_Deforestation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int [] mass = new int[N];
		
		for (int i = 0; i < N; i++) {
			mass[i] = scanner.nextInt();
		}
		
		int [] psa = new int[N];
		psa[0] = mass[0];
		for (int i = 1; i < N; i++) {
			psa[i] = psa[i-1] + mass[i];
		}
		
		int Q = scanner.nextInt();
				
		for (int i = 0; i < Q; i++) {
			int small = scanner.nextInt();
			int large = scanner.nextInt();
			
			if (small == 0) System.out.println(psa[large]);
			else System.out.println(psa[large] - psa[small - 1]);
		}
	}
}
