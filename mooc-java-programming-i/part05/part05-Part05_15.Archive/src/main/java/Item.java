public class Item {
    private String identifier;
    private String name;

    public Item (String identifier,String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        Item item = (Item) compared;
        return this.identifier.equals(item.identifier);
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}