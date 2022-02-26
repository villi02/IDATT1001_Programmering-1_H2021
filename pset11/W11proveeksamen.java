import java.util.ArrayList;
import java.util.Scanner;

public class W11proveeksamen {


    public W11proveeksamen() {
    }

    /**
     * lager to skannere, en til integer (scInt) og en til string (scStr) fordi det er en bug som kommer noen ganger når du veksler mellom å ta string og int som input
     */
    Scanner scInt = new Scanner(System.in);
    Scanner scStr = new Scanner(System.in);
    PropertyRegister register = new PropertyRegister();

    public static void main(String[] args) {
        W11proveeksamen go = new W11proveeksamen();
        go.testData();
        while (true)
        {
            go.showMenu();
        }
    }

    /**
     * Legger inn testdata til programmet
     */
    public void testData()
        {
            register.newProperty(1445, "Gloppen", 77, 631, "N", 1017.6, "Jens Olsen" );
            register.newProperty(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
            register.newProperty(1445, "Gloppen", 75, 19, "Fugletun", 650.6,"Evilyn Jensen");
            register.newProperty(1445, "Gloppen", 74, 177, "N", 1457.2, "Karl Ove Bråten");
            register.newProperty(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");
        }

        int valg1;

    /**
     * Viser menyen og valgene, helt til brukeren velger 5
     */
        public void showMenu() {
            System.out.println("Hva vil du gjøre?");
            System.out.println("1: Registrere ny eiendom?");
            System.out.println("2: Skrive ut alle eiendomer som er registrert?");
            System.out.println("3: Søke etter eiendom basert på kommunenr,gnr og bnr (alle 3 samtidig)?");
            System.out.println("4: Regne ut og vise gjennomsnitts areal av alle eiendomene i registeret");
            System.out.println("5: Avslutte?");
            valg1 = scInt.nextInt();
            switch(valg1) {
                case 1:
                    newProperty();
                    break;
                case 2:
                    getAll();
                    break;

                case 3:
                    findProperty();
                    break;

                case 4:
                    System.out.println( "Gjennomsnittsareal: " + findAvgArea() + "m2");
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Du må skrive et tall fra 1-5");
            }


        }

    /**
     * Tar inn info og registrerer ny eiendom
     */
    public void newProperty()
        {
            System.out.println("KommuneNr:");
            int kommuneNr = scInt.nextInt();

            System.out.println("KommuneNavn:");
            String kommuneNavn = scStr.nextLine();

            System.out.println("Gårdsnr:");
            int gårdsNr = scInt.nextInt();

            System.out.println("BruksNr:");
            int bruksNr = scInt.nextInt();

            System.out.println("BruksNavn (Skriv 'N' om eiendommen ikke har Bruksnavn):");
            String bruksNavn = scStr.nextLine();

            System.out.println("Areal:");
            double areal = scInt.nextDouble();

            System.out.println("Eier:");
            String eier = scStr.nextLine();

            Property newProperty = register.newProperty(kommuneNr, kommuneNavn, gårdsNr, bruksNr, bruksNavn, areal, eier);
            System.out.println("Eiendom registrert: ");
            System.out.println(newProperty.toString());
        }

    /**
     * Printer ut alle eiendommer
     */
    public void getAll()
        {
            System.out.println("NB! om det står 'N' betyr det at eiendommen ikke har bruksnavn");
            System.out.println("Kommunenr, kommunenavn, gårdsnr, bruksnr, bruksnavn, areal, eier");
            for (int i = 0; i < register.properties.size(); i++)
            {
                System.out.println(register.properties.get(i).toString());
            }
            System.out.println("Ferdig");
        }

    /**
     * finner alle eiendommene i henhold til kommunenr, gårdsnr og bruksnr (alle 3 samtidig)
     */
    public void findProperty()
        {
            System.out.println("Kommunenr:");
            int kommuneNr = scInt.nextInt();

            System.out.println("Gårdsnr:");
            int gårdsNr = scInt.nextInt();

            System.out.println("BruksNr:");
            int bruksNr = scInt.nextInt();

            ArrayList<Property> found = register.findProperty(kommuneNr,gårdsNr,bruksNr);

            if (found.size() > 0) {
                System.out.println("Fant følgende eiendommer: ");
                for (int i = 0; i < found.size(); i++)
                {
                    System.out.println(found.get(i).toString());
                }
            }

            else
            {
                System.out.println("Fant ingen eiendommer");
            }

        }

    /**
     * finner gjennomsnitssarealet og returnerer det
     * @return arealet
     */
    public double findAvgArea()
        {
            return register.avgArea();
        }

    }

