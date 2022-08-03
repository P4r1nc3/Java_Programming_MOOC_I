import java.util.ArrayList;

public class Suitcase {
    private int weightLimit;
    private ArrayList<Item> items;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.items = new ArrayList<>();
    }

    public void addItem(Item newItem) {
        int totalWeight = this.totalWeight();

        if (totalWeight + newItem.getWeight() <= weightLimit) {
            this.items.add(newItem);
        }
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        else if (this.items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + "kg)";
        }

        else if (this.items.size() > 1) {
            int totalWeight = this.totalWeight();

            return this.items.size() + " items (" + totalWeight + "kg)";
        } else {
            return null;
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public void printItems() {
        String returnString = "";
        for (Item item : this.items) {
            returnString = item.getName() + " (" + item.getWeight() + " kg)";
            System.out.println(returnString);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item returnItem = this.items.get(0);

        for (Item item : items) {
            if (returnItem.getWeight() < item.getWeight()) {
                returnItem = item;
            }
        }

        return returnItem;
    }
}