import java.util.ArrayList;
import java.util.Scanner;
public class w10oppgave2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        MenuRegister register = new MenuRegister();
        int valg1;
        int dishNr = 0;
        do {
            System.out.println("Hva vil du gjøre?");
            System.out.println("1: Registrere en ny rett? (Må bli gjort første gangen)");
            System.out.println("2: Finne en rett, gitt navnet?");
            System.out.println("3: Finne alle retter av en gitt type");
            System.out.println("4: Registrere en ny meny?");
            System.out.println("5: Finne alle menyer med totalpris innenfor et intervall?");
            System.out.println("6: Avslutte?");
            valg1 = sc.nextInt();
            switch(valg1) {
                case 1:
                    System.out.println("navn:");
                    String denneTellesIkke = sc.nextLine();
                    String navn = sc.nextLine();

                    System.out.println("Type:");
                    String type = sc.nextLine();

                    System.out.println("Pris:");
                    int price = sc.nextInt();
                    register.newDish(dishNr, navn, type, price);
                    dishNr++;
                    break;

                case 2:
                    System.out.println("Navn:");
                    String telssikke = sc.nextLine();
                    String navnet = sc.nextLine();
                    Dish dishss = register.findDish(navnet);
                    System.out.println("Retten: " + dishss.toString());
                    break;

                case 3:
                    System.out.println("Type:");
                    String tellerikke = sc.nextLine();
                    String typen = sc.nextLine();
                    ArrayList<Dish> dishtype = register.findByType(typen);
                    register.getDishes(dishtype);
                    break;

                case 4:
                    ArrayList<Dish> dishes = new ArrayList<Dish>();
                    System.out.println("Hvor mange retter vil du ha på menyen?");
                    int itemAmount = Integer.parseInt(sc.nextLine());
                    System.out.println("Navn:");
                    String name = sc.nextLine();
                    System.out.println("Her er alle rettene:");
                    register.getDishes(register.dishes);

                    for (int i = 0; i < itemAmount; i++) {
                        System.out.println("Hvilken rett vil du legge til? (id)");
                        int choice = sc.nextInt();
                        dishes.add(register.dishes.get(i));
                    }
                    System.out.println("Din nye meny:");
                    register.getDishes(dishes);
                    register.newMenu(dishes, name);
                    break;

                case 5:
                    System.out.println("Minpris: ");
                    int minPrice = sc.nextInt();
                    System.out.println("Maxpris: ");
                    int maxPrice = sc.nextInt();
                    ArrayList<Dish> priceIntervalls = register.findPriceIntervall(maxPrice, minPrice);
                    register.getDishes(priceIntervalls);
                    break;
            }

        } while (valg1 < 6);
    }
}
