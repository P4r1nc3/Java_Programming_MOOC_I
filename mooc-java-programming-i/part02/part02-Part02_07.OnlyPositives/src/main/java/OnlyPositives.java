
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number:");

            int num  = Integer.valueOf(scanner.nextLine());

            if(num == 0) {
                break;
            }else if(num > 0){
                int pow = num*num;
                System.out.println(pow);
            }else{
                System.out.println("Unsuitable number");
            }
        }
    }
}
