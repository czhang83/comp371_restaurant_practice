import java.util.ArrayList;

public class Chef {
    private ArrayList<Dish> manual;
    private ArrayList<Dish> orders = new ArrayList<>();
    private ArrayList<Dish> cooked = new ArrayList<>();
    public Chef(ArrayList<Dish> manual){
        this.manual = manual;
    }

    public void change_manual(ArrayList<Dish> manual){
        this.manual = manual;
    }

    public void take_order(ArrayList<Dish> dishes){
        this.orders.addAll(dishes);
    }
    public ArrayList<Dish> get_orders(){
        return orders;
    }
    public void cook(){
        if(this.orders.size() == 0){
            return;
        }
        Dish cooked = this.orders.get(0);
        this.orders.remove(0);
        this.cooked.add(cooked);
    }

    //return all the cooked dish
    //delete the cooked list
    public ArrayList<Dish> give_robot(){
        ArrayList<Dish> give = this.cooked;
        this.cooked = new ArrayList<>();
        return give;
    }
}
