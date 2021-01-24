import java.util.ArrayList;

public class Customer {
    private ArrayList<Dish> order;
    private String name;

    public Customer(String name, ArrayList<Dish> order){
        this.name = name;
        this.order = order;
    }

    public ArrayList<Dish> get_order(){
        return this.order;
    }

    public String get_name() {
        return name;
    }
}
