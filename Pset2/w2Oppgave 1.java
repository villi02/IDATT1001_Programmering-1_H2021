import java.util.Scanner;

class w2Oppgave1 {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Årstall:");
    int Årstall = sc.nextInt();
    
    if (Årstall % 100 == 0)
    {
        int test = Årstall % 400;
        if (test == 0)
        {
            System.out.println("Skuddår!");
        }
        else
        {
            System.out.println("Ikke skuddår!");
        }
    }
    
    
    else
    {
        int testy = Årstall % 4;
        if (testy == 0)
        {
            System.out.println("Skuddår!");
        }
        
        else
        {
            System.out.println("Ikke skuddår!");
        }
    }
 }        
}
