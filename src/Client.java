
import pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String name;
    int noTable;
   Command command;
    PizzaFactory pizzaFactory;



    public Client(String name, int noTable, Command command, PizzaFactory pizzaFactory) {
        this.name = name;
        this.noTable = noTable;
        this.command = command;
        this.pizzaFactory=pizzaFactory;
    }

    public Client(String name, int noTable, PizzaFactory pizzaFactory) {

        this.name = name;
        this.noTable = noTable;
        this.pizzaFactory=pizzaFactory;
    }


    public void notifyClient(){

            command.receiveNotification("Your pizza "+pizzaFactory.getPizzaTypes());

    }
    public void notifyClientDecorator(){

        command.receiveNotification("Your pizza "+pizzaFactory.getPizzaTypesDecorated());

    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", noTable=" + noTable +
                ", pizzaFactory=" + pizzaFactory.getPizzaTypesDecorated() +
                '}';
    }
}
class Command {
   List<Pizza>pizzas=new ArrayList<>();



    public Command() {
    }

    public Command(List<Pizza>pizzas) {
        this.pizzas=pizzas;

    }


    public void receiveNotification(String notification){
        System.out.println(notification+" is backed");
    }



}
