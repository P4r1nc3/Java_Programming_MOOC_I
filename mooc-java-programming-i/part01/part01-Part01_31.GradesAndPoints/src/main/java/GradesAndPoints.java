
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give point [0-100]:");
        int points = Integer.valueOf(scan.nextLine());

        if(points < 0){
            System.out.println("Grade: impossible!");
        }else if(points >= 0 && points <= 49){
            System.out.println("Grade: failed");
        }else if(points >= 50 && points <= 59){
            System.out.println("Grade: 1");
        }else if(points >= 60 && points <= 69){
            System.out.println("Grade: 2");
        }else if(points >= 70 && points <= 79){
            System.out.println("Grade: 3");
        }else if(points >= 80 && points <= 89){
            System.out.println("Grade: 4");
        }else if(points >= 90 && points <= 100){
            System.out.println("Grade: 5");
        }else{
            System.out.println("Grade: incredible!");
        }
    }
}
