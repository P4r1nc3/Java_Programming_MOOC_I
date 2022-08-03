import java.util.Scanner;

public class TextUI {

    private SimpleDictionary simpleDictionary;
    private Scanner scanner;

    public TextUI (Scanner scanner, SimpleDictionary simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            else if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
                continue;
            }
            else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String translate = scanner.nextLine();
                String translated = this.simpleDictionary.translate(translate);

                if (translated == null) {
                    System.out.println("Word " + translate + " was not found");
                } else {
                    System.out.println(translated);
                }
            } else
                System.out.println("Unknown command");
        }
        System.out.print("Bye bye!");
    }
}
