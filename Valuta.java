import java.text.MessageFormat;
import java.util.Scanner;


public class Valuta
{
    private double kurs;
    private String valutta;

    public Valuta(double y, String currency)
    {
        this.kurs = y;
        this.valutta = currency;
    }

    public double tilNorske(double norskeKr)
    {
        return norskeKr * kurs;
    }

    public double fraNorske(double norskeKr)
    {
        return norskeKr / kurs;
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nVelg valuta:\n" + "1: dollar\n"  + "2: euro\n" + "3: svenske kroner\n" + "4: avslutt");
        int y = sc.nextInt();
        
        double dollar = 8.69;
        double euro = 10.25;
        double svenskeKroner = 1.00;
        String currencyy = "";
        Valuta fuckdette = new Valuta(0, "");
        int retning = 0;
        if (y == 1)
        { 
            fuckdette = new Valuta(dollar, "dollar");
            System.out.println("Til(1) eller fra(2) dollar");
            retning = sc.nextInt();
            currencyy = fuckdette.valutta;
        }
        else if (y == 2)
        {
            fuckdette = new Valuta(euro, "euro");
            System.out.println("Til(1) eller fra(2) euro");
            retning = sc.nextInt();
            currencyy = fuckdette.valutta;
        }
        else if (y == 3)
        {
            fuckdette = new Valuta(svenskeKroner, "svenske kroner");
            System.out.println("Til(1) eller fra(2) svenske kroner");
            retning = sc.nextInt();
            currencyy = fuckdette.valutta;
        }
        else
        {
            System. exit(0);
        }
        
        double norskeKroner = 0;
        //* Til norske
        if (retning == 1)
        {
            String beloptekst = MessageFormat.format("Beløp ({0}):", currencyy);
            System.out.printf(beloptekst);
            double beløp = sc.nextDouble();
            
            norskeKroner = fuckdette.tilNorske(beløp);
            String sluttsetning = MessageFormat.format("\n{0} {1} er {2} norske kroner \n",beløp, currencyy, norskeKroner);
            System.out.println(sluttsetning);
        }

        else
        {
            System.out.printf("beløp (Nok): ");
            double beløp = sc.nextDouble();
            norskeKroner = fuckdette.fraNorske(beløp);
            String sluttsetning = MessageFormat.format("\n{0} norske kroner er {1} {2} \n",beløp, norskeKroner, currencyy);
            System.out.println(sluttsetning);

        }

    }

}
