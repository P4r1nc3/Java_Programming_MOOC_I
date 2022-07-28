
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(2);
        System.out.println(counter.value());

        counter.decrease();
        System.out.println(counter.value());

        counter.increase(10);
        System.out.println(counter.value());
    }
}
