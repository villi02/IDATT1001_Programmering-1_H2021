import java.text.MessageFormat;
import java.util.Scanner;
public class w5oppgave2
{
    public static void main(String[] args)
    {
        int valg;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println(" Hva vil du ha?\n" + "1: tilfeldig heltall\n" + "2: tilfeldig desimaltall\n" + "3: jeg vil ha en avsluttning");
            valg = sc.nextInt();
            if (valg == 1)
            {
                System.out.printf("Øvre grense:");
                int ovre = sc.nextInt();
                System.out.printf("Nedre grense:");
                int nedre = sc.nextInt();

                MinRandom tilfeldigTall = new MinRandom();
                int tilfeldig = tilfeldigTall.nesteHeltall(nedre, ovre);
                System.out.println(MessageFormat.format("ditt nye tall er: {0}", tilfeldig));
            }

            else if (valg == 2)
            {
                System.out.printf("Øvre grense:");
                double ovre = sc.nextDouble();
                System.out.printf("Nedre grense:");
                double nedre = sc.nextDouble();

                MinRandom tilfeldigTall = new MinRandom();
                double tilfeldig = tilfeldigTall.nesteDesimaltall(nedre, ovre);
                System.out.println(MessageFormat.format("ditt nye tall er: {0}", tilfeldig));
            }

            else
            {
                System.exit(0);
            }

        } while (valg < 3);
    }
}
