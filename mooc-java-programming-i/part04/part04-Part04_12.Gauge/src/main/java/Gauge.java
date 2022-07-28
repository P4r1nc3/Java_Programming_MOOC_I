public class Gauge {

    private int value;

    public Gauge () {

    }

    public boolean full () {
        if (this.value == 5) {
            return true;
        } else {
            return false;
        }
    }

    public int value () {
        return this.value;
    }

    public void increase () {
        if (this.value < 5) {
            this.value++;
        }
    }

    public void decrease () {
        if (this.value > 0) {
            this.value--;
        }
    }
}
