import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void add(String value) {
        stack.add(value);
    }

    public  ArrayList<String> values() {
        return stack;
    }

    public String take() {
        return stack.remove(stack.size() - 1); // pop
    }
}