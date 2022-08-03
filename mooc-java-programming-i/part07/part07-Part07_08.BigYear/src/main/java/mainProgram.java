
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BirdDatabase birdDatabase = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird newBird = new Bird(name, latinName);
                birdDatabase.add(newBird);
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                birdDatabase.addObservation(name);
            } else if (command.equals("All")) {
                birdDatabase.printAll();
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                birdDatabase.printOne(name);
            } else if (command.equals("Quit")) {
                break;
            }
        }
    }

}