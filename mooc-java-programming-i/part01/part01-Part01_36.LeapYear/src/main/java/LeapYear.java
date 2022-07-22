import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.print("The year is a leap year.");
        }else{
            System.out.print("The year is not a leap year.");
        }
    }
}
