
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String znaki = scan.nextLine();
        System.out.println("Give an integer:");
        int calkowita = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double przecinkowa = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean prawdafalsz = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string "+znaki);
        System.out.println("You gave the integer "+calkowita);
        System.out.println("You gave the double "+przecinkowa);
        System.out.println("You gave the boolean "+prawdafalsz);
    }
}