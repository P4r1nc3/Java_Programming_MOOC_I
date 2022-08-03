
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Points points = new Points();
        System.out.println("Enter point totals, -1 stops: ");

        while (true) {
            int point = Integer.parseInt(scanner.nextLine());

            if (point == -1) {
                break;
            }

            points.add(point);
        }
        System.out.println("Point average (all): " + points.average());
        double passingAverage = points.averagePassing();
        if (passingAverage == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage);
        }
        System.out.println("Pass percentage: " + points.passingPercentage());
        System.out.println("Grade distribution:");
        points.gradeDistribution();
    }
}
