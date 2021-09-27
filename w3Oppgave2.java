import java.util.Scanner;

class w3Oppgave2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tall:");
        int tall = sc.nextInt();

        for (int i = 2; i <= tall; i++)
        {
            if (i == tall)
            {
                System.out.println("Primtall!");
                return;
            }
            int test = tall % i;
            if (test == 0)
            {
                System.out.println("Ikke primtall!");
                return;
            }

            else 
            {
                continue;
            }
            
        }
        
    }

}
