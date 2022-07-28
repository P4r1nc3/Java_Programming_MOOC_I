
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count = count;
    }

    public int sum () {
        return this.sum = sum;
    }

    public double average() {
        if (this.count != 0) {
            return (double) this.sum / this.count;
        } else {
            return 0;
        }
    }
}
