

public class Dish {
    private Double price;
    private String name;
    public Dish(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Double get_price(){
        return this.price;
    }

    public String get_name() {
        return name;
    }
}
