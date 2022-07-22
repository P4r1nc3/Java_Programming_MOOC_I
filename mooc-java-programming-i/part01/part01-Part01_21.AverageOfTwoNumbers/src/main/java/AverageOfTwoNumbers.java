import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int firstnumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        double secondnumber = Integer.parseInt(scanner.nextLine());

        System.out.println("The average is " + ((firstnumber + secondnumber) / 2));
    }
}