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
        String output = "";
        for (int i = 0; i < englishText.length(); i++) {
            String letter = String.valueOf(englishText.charAt(i));
            String morseCode = getCharacter(letter.toLowerCase());
            output += morseCode;

        }
        return output;
    }

    public String morseToEnglish(String morseSequence) {
        String output = "";
        String[] morseCharacters = morseSequence.split(" ");
        for (int i = 0; i < morseCharacters.length; i++) {
            String morseCharacter = morseCharacters[i];
            String letter = getCharacter(morseCharacter);
            output += letter;
        }
        return output;
    }
}
