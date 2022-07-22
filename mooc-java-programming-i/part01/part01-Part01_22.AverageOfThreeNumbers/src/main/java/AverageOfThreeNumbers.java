
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int int1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int int2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int int3 = Integer.valueOf(scanner.nextLine());

        double sum = int1 + int2 + int3;
        System.out.println("The average is "+((double)sum/3.0));
    }
}
