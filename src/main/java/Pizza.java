import java.util.ArrayList;

public abstract class Pizza implements Food {
     String name;
     ArrayList<Ingredients> Ingredients;

    public Pizza(String name, ArrayList<Ingredients> Ingredients) {
        this.name = name;
        this.Ingredients = Ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<Ingredients> getIngredients() {
        return Ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(ArrayList<Ingredients> Ingredients) {
        this.Ingredients = Ingredients;
    }

}
