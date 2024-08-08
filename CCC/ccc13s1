import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year_OLD = scanner.nextInt();
        int year = year_OLD;

        for (int i = 0; i < String.valueOf(year).length()-1; i++) {
            int currentNum = Integer.parseInt(String.valueOf(year).substring(i,i+1));
            for (int j = i+1; j < String.valueOf(year).length(); j++) {
                if (currentNum == Integer.parseInt(String.valueOf(year).substring(j,j+1))) {
                    year = (int) (Math.ceil((year+1)/Math.pow(10,String.valueOf(year).length()-j-1)) * Math.pow(10,String.valueOf(year).length()-j-1));
                    i = -1;
                    break;
                }
            }

            if (i == String.valueOf(year).length()-2 && year == year_OLD) {
                year++;
                i = -1;
            }
        }
        
        if (year < 10) {
            year++;
        }
        
        System.out.println(year);
    }
}
