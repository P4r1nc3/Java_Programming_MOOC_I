
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }
        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }
        System.out.println("Average: " + ((double)sum/numbers.size()));
    }
}
