import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }
    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void find(String name) {
        for (Recipe recipe : recipes ) {
            if (recipe.nameContains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void searchCookingTimes(int time) {
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= time ) {
                System.out.println(recipe);
            }
        }
    }

    public void searchIngredients(String ingredient) {
        for (Recipe recipe : recipes) {
            if (recipe.ingredientListContains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    public void print() {
        for (Recipe recipe : recipes ) {
            System.out.println(recipe);
        }
    }
}