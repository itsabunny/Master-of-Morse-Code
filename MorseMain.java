import java.util.Scanner;

public class MorseMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n\nWelcome to this morse converter!\n");
        startMenu();
    }

    private static void startMenu() {
        System.out.println("************************************");
        System.out.println("* 1. Convert English to Morse code *");
        System.out.println("* 2. Convert Morse code to English *");
        System.out.println("* Q. Quit the program              *");
        System.out.println("************************************\n");
        String menuChoice = scan.nextLine();

        switch (menuChoice.toLowerCase()) {
            case "1", "1.", "one" -> menuEnglishToMorse();
            case "2", "2.", "two" -> menuMorseToEnglish();
            case "q", "quit", "exit" -> goodbyeMsg();
            default -> {
                System.out.println("Unknown menu choice. Please try again!");
                startMenu();
            }
        }
    }

    private static void menuMorseToEnglish() {
        MorseLogic morseLogic = new MorseLogic();
        System.out.println("Write your sentence in Morse code. Write a single space between each letter,");
        System.out.println("and a \" + \" (plus sign surrounded by a single space) between each word):");
        String morseSequence = scan.nextLine();
        String answer = morseLogic.morseToEnglish(morseSequence);
        if(answer.contains("null")){
            System.out.println("Something in your text was impossible to translate and was replaced by \"null\".\nBut here's my answer:");
            System.out.println(answer);
        }else {
            System.out.println(answer);}
        returnToStartMenu();
    }

    private static void menuEnglishToMorse() {
        MorseLogic morseLogic = new MorseLogic();
        System.out.println("Write your English sentence:");
        String text = scan.nextLine();
        String answer = morseLogic.englishToMorse(text);
        if(answer.contains("null")){
            System.out.println("Something in your text was impossible to translate and was replaced by \"null\".\nBut here's my answer:");
            System.out.println(answer);
        }else {
            System.out.println(answer);
        }
        returnToStartMenu();
    }



    private static void goodbyeMsg() {
        System.out.println("      _____          __  __ ______     ______      ________ _____  ");
        System.out.println("     / ____|   /\\   |  \\/  |  ____|   / __ \\ \\    / /  ____|  __ \\ ");
        System.out.println("    | |       /  \\  | \\  / | |__     | |  | \\ \\  / /| |__  | |__) |");
        System.out.println("    | |      / /\\ \\ | |\\/| |  __|    | |  | |\\ \\/ / |  __| |  _  / ");
        System.out.println("    | |____ / ____ \\| |  | | |____   |  |__| | \\  / | |____| | \\ \\ ");
        System.out.println("     \\_____/_/    \\_\\_|  |_|______|   \\____/    \\/  |______|_|  \\_\\");
        System.out.println("");
        System.out.println("Goodbye! We hope to see you again soon.");
        System.out.println("Thank you for using our program. Goodbye!");
    }

    private static void returnToStartMenu() {
        scan.nextLine();
        System.out.println("\n\n ...and back to menu... \n\n");
        startMenu();
    }
}
