import java.util.ArrayList;
import java.util.Iterator;


public class Recipe {
    private String name;
    private ArrayList<RecipeComponent> components;

    private static int count;

    public Recipe(String name){
        this.name = name;
        this.components = new ArrayList();
        count++;
    }

    public void addComponent() {
            System.out.println("Adding new component....");
            this.components.add(RecipeComponent.createRecipeComponent());
    }

    public void displayRecipe() {
        System.out.println(name + " (Recipe)");
        for(RecipeComponent rp: components){
            rp.displayRecipeComponent();
            System.out.println("------------");
        }
    }

    public static int showNumberOfRecipes(){
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
