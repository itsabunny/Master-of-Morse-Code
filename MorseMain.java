import java.util.Scanner;

public class MorseMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        MorseLogic morseLogic = new MorseLogic();

        System.out.println("Welcome to this morse converter!");

        startMenu();





        //this is temp test
        //while (true) {
        //    String tempChar = scan.nextLine();
        //    System.out.println(morseLogic.getCharacter(tempChar.toLowerCase()));
        //}
    }


    private static void startMenu() {
        MorseLogic morseLogic = new MorseLogic();

        System.out.println();
        System.out.println("1. Convert English to Morse code");
        System.out.println("2. Convert Morse code to English");
        System.out.println("Q. Quit the program");
        String menuChoice = scan.nextLine();

        switch (menuChoice.toLowerCase()) {
            case "1", "1.", "one":
                System.out.println("Write your English sentence:");
                String text = scan.nextLine();
                System.out.println(morseLogic.englishToMorse(text));
                break;
            case "2", "2.", "two":
                System.out.println("Write your sentence in Morse code write a single space between each letter,");
                System.out.println("and a \" + \" (plus sign surrounded by spaces) between each word):");
                String morseSequence = scan.nextLine();
                System.out.println(morseLogic.morseToEnglish(morseSequence));
                break;
            case "q", "quit", "exit":
                System.out.println("Bye bye!");
                break;
            default:
                System.out.println("Unknown menu choice. Please try again!");
                startMenu();
        }
    }
}

