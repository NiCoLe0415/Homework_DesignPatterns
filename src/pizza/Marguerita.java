package pizza;

import enms.PizzaType;

public class Marguerita extends Pizza{
    public final String ingredients="ingr1, ingr2";

    public Marguerita() {
    }

    public Marguerita(PizzaType pizzaType, int dimension) {
        super(pizzaType, dimension);
    }

    public String getIngredients() {
        return ingredients;
    }

}
