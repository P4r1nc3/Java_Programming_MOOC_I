
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum=0;

        while(true){
            System.out.println("Give a number:");

            int number = scanner.nextInt();

            if(number == 0){
                break;
            }else {
                sum = sum + number;
                counter++;
            }
        }
        System.out.println("Number of numbers: "+counter);
        System.out.println("Sum of the numbers: "+sum);
    }
}
