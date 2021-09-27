import java.util.Scanner;

class w3Oppgave1
{
public void main(String[] args)
    {
        int slutt = 0;
        do
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start:");
        int start = sc.nextInt();
        System.out.println("Slutt:");
        slutt = sc.nextInt();

        if (slutt < 0)
        {
            continue;
        }

        for (int i = start; i <= slutt; i++)
        {
            System.out.println(i + "-gangen:");

            for (int j = 1; j <= 10; j++)
            {
            int produkt = i * j;
            System.out.println(i + " x " + j + " = " + produkt);
            }
        }
        }
        while (slutt > 0);
    }
        
}
