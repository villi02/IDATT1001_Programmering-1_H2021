import java.util.Scanner;

class w2Oppgave2 {

public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);
    double prisA = 35.90;
    int mengdeA = 450;
    double prisB = 39.50;
    int mengdeB = 500;

    double prisPrKgA = prisA / mengdeA;
    double prisPrKgB = prisB / mengdeB;

    if (prisPrKgA > prisPrKgB)
    {
        System.out.println("B er billigere!");
    }
    else
    {
        System.out.println("A er billigere!");
    }
 }
}
