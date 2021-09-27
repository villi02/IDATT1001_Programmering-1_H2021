import java.text.MessageFormat;
import java.util.Scanner;
public class w6oppgave1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int valg;
        int utfall;
        int forekomster[] = new int[10];
        java.util.Random random = new java.util.Random();

        System.out.println("Hvor mange ganger vil du kjøre loopen?");
        valg = sc.nextInt();


        for (int i = 0; i < valg; i++)
        {
            utfall = random.nextInt(10);
            forekomster[utfall]++;

        }

        for (int i = 0; i < 10; i++)
        {
            String setning = MessageFormat.format("{0} forekom {1} ganger", i, forekomster[i]);
            System.out.println(setning);
        }
    }
}