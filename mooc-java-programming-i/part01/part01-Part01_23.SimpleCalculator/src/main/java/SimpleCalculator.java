
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        int sum = num1 + num2;
        int roz = num1 - num2;
        int mno = num1 * num2;

        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" - "+num2+" = "+roz);
        System.out.println(num1+" * "+num2+" = "+mno);
        System.out.println(num1+" / "+num2+" = "+((double)num1/num2));
    }
}