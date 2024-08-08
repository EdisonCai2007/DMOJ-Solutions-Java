import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt()+1;
        String output = "";

        for (int i = 0; i < N; i++) {
            String phoneNumber = scanner.nextLine();
            for (int j = 0; j < phoneNumber.length(); j++) {
                if (phoneNumber.charAt(j) != '-') {
                    switch (phoneNumber.charAt(j)){
                        case 'A':
                        case 'B':
                        case 'C':
                            output += "2";
                            break;
                        case 'D':
                        case 'E':
                        case 'F':
                            output += "3";
                            break;
                        case 'G':
                        case 'H':
                        case 'I':
                            output += "4";
                            break;
                        case 'J':
                        case 'K':
                        case 'L':
                            output += "5";
                            break;
                        case 'M':
                        case 'N':
                        case 'O':
                            output += "6";
                            break;
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                            output += "7";
                            break;
                        case 'T':
                        case 'U':
                        case 'V':
                            output += "8";
                            break;
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                            output += "9";
                            break;
                        default:
                            output += phoneNumber.charAt(j);
                            break;
                    }

                    if (output.length() == 3 || output.length() == 7) {
                        output += "-";
                    }

                    if (output.length() == 12) {
                        break;
                    }
                }
            }

            System.out.println(output);
            output = "";
        }
    }
}
