import enms.PizzaType;
import enms.Topping;
import pizza.*;


public class PizzaFactory {
    private static PizzaFactory uniqueInstance;
    PizzaType pizzaTypes;
    Topping toppingTypes;
    public Observer observer;
    Client client;
    Command command;
    ToppingDecorator pizza;

    public PizzaFactory() {

    }

    public PizzaType getPizzaTypes() {
        return pizzaTypes;
    }

    public ToppingDecorator getPizzaTypesDecorated() {
        return pizza;
    }

    public void setPizzaTypes(PizzaType pizzaTypes, Client client) {
        this.pizzaTypes = pizzaTypes;
        this.client=client;
        client.notifyClient();
        command=new Command();

    }
    public void setPizza(ToppingDecorator pizza, Client client) {
        this.pizza = pizza;
        this.client=client;
        client.notifyClientDecorator();
        command=new Command();

    }


    public static PizzaFactory instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PizzaFactory();
        }
        return uniqueInstance;
    }

    public void attacheObserver(Observer observer){
        this.observer=observer;
    }

    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CAPRICIOSA:
                return new Capriciosa();
            case PROSCIUTTO_FUNGHI:
                return new ProsciuttoFunghi();
            case QUATRO_STAGIONI:
                return new QuatroStagioni();
            case MARGUERITA:
                return new Marguerita();
        }
        return null;
    }

    @Override
    public String toString() {
        return "PizzaFactory{" +
                "pizzaTypes=" + pizzaTypes +
                ", toppingTypes=" + toppingTypes +
                ", observer=" + observer +
                '}';
    }
}

class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return "PizzaDecorator{" +
                "pizza=" + pizza +
                '}';
    }
}

class ToppingDecorator extends PizzaDecorator {
    Topping topping;
    public ToppingDecorator(Pizza pizza, Topping topping) {
        super(pizza);
        this.topping=topping;
    }

    @Override
    public String toString() {
        return "ToppingDecorator{" +
                "pizza=" + pizza +
                ", topping=" + topping +
                '}';
    }
}
 class Observer{
    PizzaFactory pizzaFactory;

    public Observer(PizzaFactory pizzaFactory){
        this.pizzaFactory=pizzaFactory;
        this.pizzaFactory.attacheObserver(this);

    }

    public void receiveUpdate(){

    }



}
