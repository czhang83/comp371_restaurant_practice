import java.util.ArrayList;

public class Customer {
    private ArrayList<Dish> order;
    public Customer(ArrayList<Dish> order){
        this.order = order;
    }

    public ArrayList<Dish> get_order(){
        return this.order;
    }
}
