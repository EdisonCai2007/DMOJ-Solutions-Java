import java.io.*;
import java.util.*;


public class TroublesomeKeys {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pressed = br.readLine();
        String displayed = br.readLine();

        ArrayList<String> visited = new ArrayList<>();
        String ghostKey = "";
        int highScore = 0;

        if (pressed.length() != displayed.length()) {
            for (int i = 0; i < pressed.length(); i++) {
                String key = Character.toString(pressed.charAt(i));
                if (!visited.contains(key)) {
                    visited.add(key);
                    int score = checkMatches(pressed.replaceAll(key, ""),displayed);
                    if (score > highScore) {
                        highScore = score;
                        ghostKey = key;
                    }
                }
            }
        } else {
            ghostKey = "-";
        }
        //System.out.println(ghostKey);

        pressed = pressed.replaceAll(ghostKey, "");

        String replacedKey = "";
        String sillyKey = "";

        for (int i = 0; i < pressed.length(); i++) {
            if (pressed.charAt(i) != displayed.charAt(i)) {
                replacedKey = String.valueOf(pressed.charAt(i));
                sillyKey = String.valueOf(displayed.charAt(i));
                break;
            }
        }

        System.out.println(replacedKey + " " + sillyKey);
        System.out.println(ghostKey);
    }

    public static int checkMatches(String ghostedString, String displayed) {
        int index = 0;
        int score = 0;
        while (index < ghostedString.length() && index < displayed.length()) {
            if (ghostedString.charAt(index) == displayed.charAt(index)) {
                score++;
            }
            index++;
        }

        return score;
    }
}
