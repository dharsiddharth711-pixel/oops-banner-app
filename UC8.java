import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized repository for character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Method to initialize all patterns
    static void initializePatterns() {

        patternMap.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patternMap.put('P', new String[]{
                "PPP  ",
                "P  P ",
                "PPP  ",
                "P    ",
                "P    "
        });

        patternMap.put('S', new String[]{
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        });
    }

    public static void main(String[] args) {

        // Load patterns
        initializePatterns();

        String word = "OOPS";

        // Render banner
        for (int line = 0; line < 5; line++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    System.out.print(pattern[line] + "  ");
                }

            }

            System.out.println();
        }
    }
}
