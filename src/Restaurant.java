import java.util.Arrays;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        // set up restaurant
        Dish meat = new Dish("meat", 3.99);
        Dish salad = new Dish("salad", 2.00);
        Dish dessert = new Dish("dessert", 3.50);
        ArrayList<Dish> manuel = new ArrayList<>(Arrays.asList(meat, salad, dessert));
        Chef chef = new Chef(manuel);
        Robot robot = new Robot();

        // creating customers with their order
        ArrayList<Dish> order1 = new ArrayList<>(Arrays.asList(meat, salad));
        Customer customer1 = new Customer("customer 1", order1);
        ArrayList<Dish> order2 = new ArrayList<>(Arrays.asList(salad, dessert));
        Customer customer2 = new Customer("customer 2", order2);

        // robot serve the customers
        robot.new_customer(customer1);
        robot.new_customer(customer2);
        robot.take_order(customer1);
        robot.take_order(customer2);
        robot.deliver_orders(customer1, chef);
        robot.deliver_orders(customer2, chef);

        // the chef cook the dishes
        chef.cook();
        chef.cook();
        chef.cook();
        chef.cook();

        // the robot deliver the dish from the chef to the customer
        robot.deliver_dish(chef.give_robot());

        // check out
        System.out.println(robot.give_check(customer1));
        System.out.println(robot.give_check(customer2));
    }
}

