
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String printOutput = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            return printOutput + " is empty.";
        } else if (this.elements.size() == 1) {
            printOutput += " has 1 element:\n";
            for (String element : elements) {
                printOutput = printOutput + element;
            }
        } else if (this.elements.size() > 1) {
            printOutput += " has " + this.elements.size() + " elements:\n";
            for (String element : elements) {
                if (element.equals(this.elements.get(elements.size() - 1))) {
                    printOutput += element;
                } else {
                    printOutput += element + "\n";
                }
            }
        }
        return printOutput;
    }
}
