
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;
        System.out.println("Give numbers:");

        while(true){
            int number = scanner.nextInt();
            if (number == -1){
                break;
            }else{
                counter++;
                sum += number;
                if(number % 2 == 0){
                    evenNumbers++;
                }else{
                    oddNumbers++;
                }
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+counter);
        System.out.println("Average: "+((double)sum/counter));
        System.out.println("Even: "+evenNumbers);
        System.out.println("Odd: "+oddNumbers);
    }
}
