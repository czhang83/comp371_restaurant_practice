import java.util.Arrays;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        Dish meat = new Dish(3.99);
        Dish salad = new Dish(2.00);
        Dish dessert = new Dish(3.50);
        ArrayList<Dish> manuel = new ArrayList<>(Arrays.asList(meat, salad, dessert));
        Chef chef = new Chef(manuel);
        Robot robot = new Robot();

        ArrayList<Dish> order1 = new ArrayList<>(Arrays.asList(meat, salad));
        Customer customer1 = new Customer(order1);
        robot.new_customer(customer1);
        ArrayList<Dish> order2 = new ArrayList<>(Arrays.asList(salad, dessert));
        Customer customer2 = new Customer(order2);
        robot.new_customer(customer1);
        robot.new_customer(customer2);
        robot.take_order(customer1);
        robot.take_order(customer2);

        robot.deliver_orders(customer1, chef);
        robot.deliver_orders(customer2, chef);

        chef.cook();
        chef.cook();
        chef.cook();
        chef.cook();

        robot.deliver_dish(chef.give_robot());

        System.out.println(robot.give_check(customer1));
        System.out.println(robot.give_check(customer2));
    }
}

