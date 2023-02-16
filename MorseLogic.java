import java.util.HashMap;

public class MorseLogic {
    HashMap<String, String> dictionary;

    public MorseLogic() {
        // Morse Code dictionary Morse To English
        dictionary = new HashMap<>();
        dictionary.put("a", ".- ");
        dictionary.put("b", "-... ");
        dictionary.put("c", "-.-. ");
        dictionary.put("d", "-.. ");
        dictionary.put("e", ". ");
        dictionary.put("f", "..-. ");
        dictionary.put("g", "--. ");
        dictionary.put("h", ".... ");
        dictionary.put("i", ".. ");
        dictionary.put("j", ".--- ");
        dictionary.put("k", "-.- ");
        dictionary.put("l", ".-.. ");
        dictionary.put("m", "-- ");
        dictionary.put("n", "-. ");
        dictionary.put("o", "--- ");
        dictionary.put("p", ".--. ");
        dictionary.put("q", "--.- ");
        dictionary.put("r", ".-. ");
        dictionary.put("s", "... ");
        dictionary.put("t", "- ");
        dictionary.put("u", "..- ");
        dictionary.put("v", "...- ");
        dictionary.put("w", ".-- ");
        dictionary.put("x", "-..- ");
        dictionary.put("y", "-.-- ");
        dictionary.put("z", "--.. ");
        dictionary.put("0", "----- ");
        dictionary.put("1", ".---- ");
        dictionary.put("2", "..--- ");
        dictionary.put("3", "...-- ");
        dictionary.put("4", "....- ");
        dictionary.put("5", "..... ");
        dictionary.put("6", "-.... ");
        dictionary.put("7", "--... ");
        dictionary.put("8", "---.. ");
        dictionary.put("9", "----. ");
        dictionary.put(".", ".-.-.- ");
        dictionary.put(",", "--..-- ");
        dictionary.put("?", "..--.. ");
        dictionary.put(".-", "a");
        dictionary.put("-...", "b");
        dictionary.put("-.-.", "c");
        dictionary.put("-..", "d");
        dictionary.put(".", "e");
        dictionary.put("..-.", "f");
        dictionary.put("--.", "g");
        dictionary.put("....", "h");
        dictionary.put("..", "i");
        dictionary.put(".---", "j");
        dictionary.put("-.-", "k");
        dictionary.put(".-..", "l");
        dictionary.put("--", "m");
        dictionary.put("-.", "n");
        dictionary.put("---", "o");
        dictionary.put(".--.", "p");
        dictionary.put("--.-", "q");
        dictionary.put(".-.", "r");
        dictionary.put("...", "s");
        dictionary.put("-", "t");
        dictionary.put("..-", "u");
        dictionary.put("...-", "v");
        dictionary.put(".--", "w");
        dictionary.put("-..-", "x");
        dictionary.put("-.--", "y");
        dictionary.put("--..", "z");
        dictionary.put("-----", "0");
        dictionary.put(".----", "1");
        dictionary.put("..---", "2");
        dictionary.put("...--", "3");
        dictionary.put("....-", "4");
        dictionary.put(".....", "5");
        dictionary.put("-....", "6");
        dictionary.put("--...", "7");
        dictionary.put("---..", "8");
        dictionary.put("----.", "9");
        dictionary.put(".-.-.-", ".");
        dictionary.put("--..--", ",");
        dictionary.put("..--..", "?");
        dictionary.put(" ", " ");
        dictionary.put("+"," ");
    }


    public String getCharacter(String character) {
        return dictionary.get(character);
    }

    public String englishToMorse(String englishText) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < englishText.length(); i++) {
            String letter = String.valueOf(englishText.charAt(i));
            String morseCode = getCharacter(letter.toLowerCase());
            output.append(morseCode);

        }
        return output.toString();
    }

    public String morseToEnglish(String morseSequence) {
        StringBuilder output = new StringBuilder();
        String[] morseCharacters = morseSequence.split(" ");
        for (String morseCharacter : morseCharacters) {
            String letter = getCharacter(morseCharacter);
            output.append(letter);
        }
        return output.toString();
    }
}

