import java.util.Scanner;
import java.text.MessageFormat;
public class w6oppgave2
{
    public static void main(String[] args)
    {
        int valg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in teksten din:");
        String tekst = sc.nextLine();
        Tekst chill = new Tekst(tekst);
        chill.regnAntall();
        do
        {
            

            System.out.println("Hva vil du vite?" + "\n" + "1: Antall forskjellige bokstaver?\n" + "2: Antall bokstaver?\n" + "3: Antall forekomster av en bestemt bokstaver \n" + "4: Hvilke bokstaver det er mest av?\n" + "5: Avslutte?");
            valg = sc.nextInt();

            if (valg == 1)
            {
                System.out.printf("Antall forskjellige bokstaver:" + " ");
                System.out.println(chill.antallForskjellige());
            }

            if (valg == 2)
            {
                System.out.println(MessageFormat.format("Det er {0} bokstaver", chill.antallbokstaver));
            }
            if (valg == 3)
            { 
                String bokstav;
                do
                {
                    System.out.println("Bokstav:");
                    bokstav = sc.next();
                    if (bokstav.length() > 1)
                    {
                        System.out.println("Feil, ta en bokstav");
                    }
                    else
                    {
                        System.out.println(MessageFormat.format("Det er {0} av bokstaven {1}", chill.getAntallforekomster(bokstav.charAt(0) - 97), bokstav));
                    }
                {

                }
                } while(bokstav.length() != 1);
            }

            if (valg == 4)
            {
                int[] mestav = chill.mestAv();
                System.out.println("Det er mest av følgende bokstaver:");
                for (int i = 0; i < mestav.length; i++)
                {
                    if (mestav[i] != 0)
                    System.out.println((char)mestav[i]);
                }
            }
            if (valg > 4)
            {
                System.exit(0);
            }
        } while(valg < 5);
    }

    
}
