package pizza;

import enms.PizzaType;

public class QuatroStagioni extends Pizza{
    public final String ingredients="ingr1, ingr2";

    public QuatroStagioni() {
    }

    public QuatroStagioni(PizzaType pizzaType, int dimension) {
        super(pizzaType, dimension);
    }

    public String getIngredients() {
        return ingredients;
    }
}
