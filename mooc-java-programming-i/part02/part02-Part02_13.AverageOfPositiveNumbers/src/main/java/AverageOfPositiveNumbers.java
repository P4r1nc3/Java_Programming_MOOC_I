
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");

            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number < 0) {
                continue;
            } else {
                counter++;
                sum = sum + number;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum / counter);
        }

    }
}
