import enms.PizzaType;
import enms.Topping;
import pizza.Marguerita;
import pizza.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionService;

public class Main {

    public static void main(String[] args) {
	 /*
        Implement a PizzaFactory that can create the following pizzas: Marguerita, ProsciuttoFunghi, Capriciosa and QuatroStagioni.
            • Make the PizzaFactory a singleton class
            • Implement a decorator that can add topping to each type of pizza
            • Add a Client class and implement an Observer inside PizzaFactory. Allow clients to be notified about new baked pizzas.
            • Add a Command pattern to allow clients to give orders to the PizzaFactory.
            • Test the class in a main method
         */


        PizzaFactory pizzaFactory=new PizzaFactory();
        Pizza pizza=new Pizza(PizzaType.CAPRICIOSA,32);
        Pizza pizza2=new Pizza(PizzaType.PROSCIUTTO_FUNGHI,64);
        PizzaDecorator pizzaDecorator=new PizzaDecorator(pizza);
        pizzaFactory.createPizza(PizzaType.MARGUERITA);
        ToppingDecorator toppingDecorator=new ToppingDecorator(pizza, Topping.CAULIFLAWER);
        System.out.println(toppingDecorator.toString());

        System.out.println(pizzaDecorator.toString());
        System.out.println(pizza.toString());
        List<Pizza>pizzas=new ArrayList<>();
        pizzas.add(pizza);
        pizzas.add(pizza2);
        Command command=new Command(pizzas);
        System.out.println("===Pizza decorator===");
        Client client1=new Client("Manea", 2,command, pizzaFactory);
        pizzaFactory.setPizza(toppingDecorator,client1 );

        Client client=new Client("DomnuCuCamasaRosie", 3,command, pizzaFactory);

        pizzaFactory.setPizzaTypes(PizzaType.CAPRICIOSA,client);
        pizzaFactory.setPizzaTypes(PizzaType.MARGUERITA,client);
        System.out.println(client.toString());

        Marguerita marguerita=new Marguerita();
        System.out.println(marguerita.getIngredients());





    }
}
