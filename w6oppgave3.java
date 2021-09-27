import java.util.Scanner;
public class w6oppgave3 
{ 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Matrix A = new Matrix();
        Matrix temp = new Matrix(2, 2);
        for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 2; j++)
                {
                    temp.assignValue(i, j, A.getValue(i, j));
                }
            }
        int valg = 0;

        do
        {
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 2; j++)
                {
                    A.assignValue(i, j, temp.getValue(i, j));
                }
            }


            System.out.printf("Hva vil du gjøre?\n" + "1: Addere \n" + "2: Multiplisere\n" + "3: Transponere\n" + "4: Avslutte\n");
            valg = sc.nextInt();

            if (valg == 1)
            {
                System.out.println("Mekk en ny matrise til å addere med");
                Matrix B = new Matrix();
                System.out.println("din gamle matrise");
                for (int i = 0; i < 2; i++)
                {
                    for (int j = 0; j < 2; j++)
                    {
                        System.out.printf("[" + A.getValue(i, j) + "]");
                    }
                    System.out.printf("\n");
                }
                A.addere(A, B);
                System.out.println("din nye matrise");
                for (int i = 0; i < 2; i++)
                {
                    for (int j = 0; j < 2; j++)
                    {
                        System.out.printf("[" + A.getValue(i, j) + "]");
                    }
                    System.out.printf("\n");
                }
            }

            if (valg == 2)
            {
                System.out.println("Mekk en ny matrise til å addere med");
                Matrix B = new Matrix();
                System.out.println("din gamle matrise");
                for (int i = 0; i < 2; i++)
                {
                    for (int j = 0; j < 2; j++)
                    {
                        System.out.printf("[" + A.getValue(i, j) + "]");
                    }
                    System.out.printf("\n");
                }
                A.multiply(A, B);
                System.out.println("din nye matrise");
                for (int i = 0; i < 2; i++)
                {
                    for (int j = 0; j < 2; j++)
                    {
                        System.out.printf("[" + A.getValue(i, j) + "]");
                    }
                    System.out.printf("\n");
                }
            }
            if (valg == 3)
            {
                System.out.println("din gamle matrise");
                for (int i = 0; i < 2; i++)
                {
                    for (int j = 0; j < 2; j++)
                    {
                        System.out.printf("[" + A.getValue(i, j) + "]");
                    }
                    System.out.printf("\n");
                }
                A.transponer();
                System.out.println("din nye matrise");
                for (int i = 0; i < 2; i++)
                {
                    for (int j = 0; j < 2; j++)
                    {
                        System.out.printf("[" + A.getValue(i, j) + "]");
                    }
                    System.out.printf("\n");
                }

            }

            if (valg == 4)
            {
                System.exit(0);
                sc.close();
            }

        } while (valg < 4);
        sc.close();

    }    
}

