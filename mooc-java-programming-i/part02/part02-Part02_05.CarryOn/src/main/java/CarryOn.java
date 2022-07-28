
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Should we carry on?");
            String ans = scanner.nextLine();
            if(ans.equals("no")){
                break;
            }
        }
    }
}
