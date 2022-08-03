import java.util.ArrayList;

public class Hold {
    private int weightLimit;
    private ArrayList<Suitcase> suitcases;

    public Hold(int weightLimit) {
        this.weightLimit = weightLimit;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = this.getCurrentWeight();
        if (weight + suitcase.totalWeight() <= this.weightLimit) {
            this.suitcases.add(suitcase);
        }
    }

    public int getCurrentWeight() {
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }
    public String toString() {
        int weight = this.getCurrentWeight();
        return this.suitcases.size() + " suitcases (" + weight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}