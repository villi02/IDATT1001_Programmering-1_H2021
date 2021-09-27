import java.util.Scanner;

class w4Oppgave2 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);

    System.out.printf("Spiller 1 navn:");
    String navnSpiller1 = sc.nextLine();
    Spiller spiller1 = new Spiller(navnSpiller1);
    int spiller1Score = 0;
    
    System.out.printf("Spiller 2 navn:");
    String navnSpiller2 = sc.nextLine();
    Spiller spiller2 = new Spiller(navnSpiller2);
    int spiller2Score = 0;

    System.out.printf("første man til:");
    int vinnerscore = sc.nextInt();
    
    //* starter programmet
    int rundenr = 1;
    do
    { 
        System.out.println("runde " + rundenr);
        System.out.println("spiller 1 kastet " + spiller1.kastTerningen() + " spilleren har nå " + spiller1.getSumPoeng());

        System.out.println("spiller 2 kastet" + spiller2.kastTerningen() + "spilleren har nå " + spiller2.getSumPoeng());

        rundenr++;
    }
    while (!spiller1.erFerdig(vinnerscore) && !spiller2.erFerdig(vinnerscore));
    if (spiller1.erFerdig(vinnerscore))
    {
        System.out.println(spiller1.getName() + " vant!");
    }
    else
    {
        System.out.println(spiller2.getName() + " vant!");
    }
    }
}
