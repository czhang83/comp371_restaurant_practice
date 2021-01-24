import java.util.ArrayList;
import java.util.HashMap;

// take orders from incoming customers
//deliver orders to the chef
// bring food to customer
// keeping and tab and generating checks
// keep a manual, dish name and price
public class Robot {
    //customers waiting for...
    private ArrayList<Customer> customers_take_order = new ArrayList<>();
    private ArrayList<Customer> customers_deliver_order = new ArrayList<>();
    private ArrayList<Customer> customers_deliver_dish = new ArrayList<>();

    private HashMap<Customer, ArrayList<Dish>> waiting_dishes = new HashMap<>();
    public Robot(){

    }

    public void new_customer(Customer customer){
        this.customers_take_order.add(customer);
    }

    public void take_order(Customer customer){
        this.customers_take_order.remove(customer);
        this.customers_deliver_order.add(customer);
    }

    //send orders of a customer to a chef
    //record the orders as dishes waiting to be delivered
    public void deliver_orders(Customer customer, Chef chef){
        this.customers_deliver_order.remove(customer);
        this.customers_deliver_dish.add(customer);
        ArrayList<Dish> customer_order = new ArrayList<>(customer.get_order());
        this.waiting_dishes.put(customer, customer_order); //need to make a copy of the order list
        chef.take_order(customer.get_order());
    }

    public void deliver_dish(ArrayList<Dish> dishes){
        for (Dish dish : dishes){
            for (Customer customer: waiting_dishes.keySet()){
                if(waiting_dishes.get(customer).contains(dish)){
                    //give the dish to this customer
                    //remove the dish from waiting list
                    waiting_dishes.get(customer).remove(dish);
                }
                break;
            };
            // if a customer have all dishes order, remove from waiting list
            waiting_dishes.entrySet().removeIf(entry -> entry.getValue().isEmpty());
        }
    }

    public double give_check(Customer customer){
        double price = 0;
        for (Dish dish: customer.get_order()){
            price = price + dish.get_price();
        }
        return price;
    }
}
