package pizza;

import enms.PizzaType;

public class Capriciosa extends Pizza{
    public final String ingredients="ingr1, ingr2";

    public Capriciosa() {
    }

    public Capriciosa(PizzaType pizzaType, int dimension) {
        super(pizzaType, dimension);
    }

    public String getIngredients() {
        return ingredients;
    }
}
