import java.util.Scanner;

public class CCC_16_S1_Ragaman {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		
		System.out.println(isAnagram(line1,line2));
	}
	
	private static String isAnagram(String line1,String line2) {
		for (int i = 0; i < line1.length(); i++) {
			if (line2.contains(line1.substring(i,i+1))) {
				line2 = line2.substring(0,line2.indexOf(line1.substring(i,i+1))) + line2.substring(line2.indexOf(line1.substring(i,i+1))+1,line2.length());
			}
			else if (line2.contains("*")) {
				line2 = line2.substring(0,line2.indexOf("*")) + line2.substring(line2.indexOf("*")+1,line2.length());
			}
			else {
				return("N");
			}
		}
		return("A");
	}

}
