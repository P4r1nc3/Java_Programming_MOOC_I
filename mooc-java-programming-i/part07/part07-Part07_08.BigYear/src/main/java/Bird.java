
public class Bird {
    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addObservation() {
        this.observation++;
    }

    public int getObservation() {
        return observation;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    @Override
    public String toString() {
        return this.getName() + "(" + this.getLatinName() + ")" + ": " + this.getObservation() + " observations";
    }
}