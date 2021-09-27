import java.text.MessageFormat;
import java.util.Scanner;

class w5oppgave1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teller:");
        int teller = sc.nextInt();
        System.out.println("Nevner:");
        int nevner = sc.nextInt();
        Brøk brøk1 = new Brøk(teller, nevner);

        System.out.println("Hva vil du gjøre?\n" + "1: multiplisere\n" + "2: dividere\n" + "3: addere\n" + "4: subtrahere\n" + "5: avslutt");
        int valg = sc.nextInt();

        System.out.println("Teller (den andre brøken):");
        int andreTeller = sc.nextInt();
        System.out.println("Nevner (den andre brøken):");
        int andreNevner = sc.nextInt();

        if (valg == 1)
        {
            brøk1.multiplisere(andreTeller, andreNevner);
            int nyTeller = brøk1.getTeller();
            int nyNevner = brøk1.getNevner();
            String sluttsetning = MessageFormat.format("den nye brøken er nå: {0} / {1}",nyTeller, nyNevner);
            System.out.println(sluttsetning);
        }
        if (valg == 2)
        {
            brøk1.dividere(andreTeller, andreNevner);
            int nyTeller = brøk1.getTeller();
            int nyNevner = brøk1.getNevner();
            String sluttsetning = MessageFormat.format("den nye brøken er nå: {0} / {1}",nyTeller, nyNevner);
            System.out.println(sluttsetning);
        }
        else if (valg == 3)
        {
            brøk1.addere(andreTeller, andreNevner);
            int nyTeller = brøk1.getTeller();
            int nyNevner = brøk1.getNevner();
            String sluttsetning = MessageFormat.format("den nye brøken er nå: {0} / {1}",nyTeller, nyNevner);
            System.out.println(sluttsetning);
        }
        else if (valg == 4)
        {
            brøk1.subtrahere(andreTeller, andreNevner);
            int nyTeller = brøk1.getTeller();
            int nyNevner = brøk1.getNevner();
            String sluttsetning = MessageFormat.format("den nye brøken er nå: {0} / {1}",nyTeller, nyNevner);
            System.out.println(sluttsetning);
        }

        else if (valg > 4)
        {
            System. exit(0);
        }

        System.out.println("Vil du forkorte brøken?\n" + " 1. ja\n" + "2. nei\n");
        int forkorte = sc.nextInt();

        if (forkorte == 1)
        {
            brøk1.forkort();
            int nyTeller = brøk1.getTeller();
            int nyNevner = brøk1.getNevner();
            String sluttsetning = MessageFormat.format("den nye brøken er nå: {0} / {1}",nyTeller, nyNevner);
            System.out.println(sluttsetning);
        }
        else
        {
            System.out.println("takk for meg");
        }

    }
}