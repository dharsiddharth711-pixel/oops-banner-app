class UC7 {
    private char character;
    private String[] pattern;

    // Constructor
    public UC7(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class UC6 {

    // Method to build pattern for 'O'
    static String[] buildO() {
        return new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        };
    }

    // Method to build pattern for 'P'
    static String[] buildP() {
        return new String[]{
            "PPP  ",
            "P  P ",
            "PPP  ",
            "P    ",
            "P    "
        };
    }

    // Method to build pattern for 'S'
    static String[] buildS() {
        return new String[]{
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        };
    }

    public static void main(String[] args) {

        // Create CharacterPattern objects
        UC7 oPattern = new CharacterPattern('O', buildO());
        UC7 pPattern = new CharacterPattern('P', buildP());
        UC7 sPattern = new CharacterPattern('S', buildS());

        // Store mappings
        UC7[] patterns = {oPattern, pPattern, sPattern};

        // Word to display
        String word = "OOPS";

        // Banner printing
        for (int line = 0; line < 5; line++) {

            for (char c : word.toCharArray()) {

                for (CharacterPattern cp : patterns) {

                    if (cp.getCharacter() == c) {
                        System.out.print(cp.getPattern()[line] + "  ");
                    }

                }

            }

            System.out.println();
        }
    }
}
