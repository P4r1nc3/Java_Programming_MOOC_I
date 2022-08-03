
import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<String> ingredientList;
    private int cookingTime;

    public Recipe(String name, ArrayList<String> ingredientList, int cookingTime) {
        this.name=name;
        this.ingredientList = ingredientList;
        this.cookingTime = cookingTime;
    }

    public boolean nameContains(String name) {
        if (this.name.contains(name)) {
            return true;
        }
        return false;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public boolean ingredientListContains(String ingredient) {
        if (this.ingredientList.contains(ingredient)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}