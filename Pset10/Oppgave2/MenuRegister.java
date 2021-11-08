import java.util.ArrayList;

public class MenuRegister {
    private int nrDish = 0;
    public ArrayList<Dish> dishes = new ArrayList<Dish>();
    public Menu menu;
    public Dish theOne;

    public void newDish(int dishID, String name,String type,int price){
        Dish newDish = new Dish(nrDish,name, type, price);
        this.dishes.add(newDish);
        nrDish++;
    }

    public Dish findDish (String name)
    {
        for (int i = 0; i < dishes.size(); i++)
        {
            if (dishes.get(i).getName().equals(name))
            {
                theOne = dishes.get(i);
                break;
            }
        }
        if (theOne == null){
            throw new IllegalArgumentException("Fant ingen med det navnet");
        }
        return theOne;
    }

    public ArrayList<Dish> findByType(String Type)
    {
        ArrayList<Dish> foundType = new ArrayList<Dish>();
        for (int i = 0; i < dishes.size(); i++)
        {
            if (dishes.get(i).getType().equals(Type)){
                foundType.add(dishes.get(i));
            }
        }
        if (foundType.size() < 1){
            throw new IllegalArgumentException("Fant ingen av den typen");
        }

     return foundType;
    }

    public void getDishes(ArrayList<Dish> alle) {
        for (int i = 0; i < alle.size(); i++)
        {
            System.out.println(alle.get(i).toString());
        }
    }

    public ArrayList<Dish> findPriceIntervall(int priceMax, int priceMin )
    {
        ArrayList<Dish> intervall = new ArrayList<Dish>();
        for (int i = 0; i < dishes.size(); i++)
        {
            if (dishes.get(i).getPrice() >= priceMin && dishes.get(i).getPrice() <= priceMax)
            {
                intervall.add(dishes.get(i));
            }
        }
        if (intervall.size() < 1)
        {
            throw new IllegalArgumentException("Fant ingen i det intervallet");
        }
        return intervall;
    }

    public void newMenu(ArrayList<Dish> Items, String name)
    {
        this.menu = new Menu(Items, name);
    }

}
