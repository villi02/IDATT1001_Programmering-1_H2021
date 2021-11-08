import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> items;
    private String name;

    public Menu(ArrayList<Dish> menuItems, String name){
        this.items = menuItems;
        this.name = name;
    }

    public ArrayList<Dish> getMenu() {
        return items;
    }

    public int getTotalprice(){
        int sum = 0;
        for (int i = 0; i < items.size(); i++)
        {
            sum += items.get(i).getPrice();
        }
        return sum;
    }
}
