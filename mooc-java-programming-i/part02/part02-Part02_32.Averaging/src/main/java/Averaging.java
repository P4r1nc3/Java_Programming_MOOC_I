
public class Averaging {
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 +number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int total = sum(number1, number2, number3, number4);
        return total / 4.0;
    }

    public static void main(String[] args) {
        double result = average(1, 2, 3, 4);
        System.out.println("Average: " + result);
    }
}
