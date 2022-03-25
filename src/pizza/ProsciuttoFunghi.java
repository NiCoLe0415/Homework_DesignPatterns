package pizza;

import enms.PizzaType;

public class ProsciuttoFunghi extends Pizza{
    public final String ingredients="ingr1, ingr2";

    public ProsciuttoFunghi() {
    }

    public ProsciuttoFunghi(PizzaType pizzaType, int dimension) {
        super(pizzaType, dimension);
    }

    public String getIngredients() {
        return ingredients;
    }
}
