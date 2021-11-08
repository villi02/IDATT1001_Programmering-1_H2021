
public class Dish {
    private int price, id;
    private String type, name;

    public Dish(int dishId, String name,String type,int price){
        this.id = dishId;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public String toString()
    {
        return "id: " + this.id + ", navn: " + this.name + ", type: " + this.type + ", pris: " + this.price;
    }
}
