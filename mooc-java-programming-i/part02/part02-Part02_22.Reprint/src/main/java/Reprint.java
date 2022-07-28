
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int number = scanner.nextInt();
        int i = 1;
        while(i <= number){
            printText();
            i++;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
