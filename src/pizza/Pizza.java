package pizza;

import enms.PizzaType;

public class Pizza {
    PizzaType pizzaType;
    int dimension;

    public Pizza() {
    }

    public Pizza(PizzaType pizzaType, int dimension){
        this.pizzaType=pizzaType;
        this.dimension=dimension;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaType=" + pizzaType +
                ", dimensiune=" + dimension +
                '}';
    }

}
