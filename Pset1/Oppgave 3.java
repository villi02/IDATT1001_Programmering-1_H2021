import java.util.Scanner;

class Oppgave3 {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Sekunder:");
    int sekunder = sc.nextInt();
    int timer = sekunder / 3600;
    sekunder = sekunder - timer * 3600;
    int minutter = sekunder / 60;
    sekunder = sekunder - minutter * 60;
    int sluttSekunder = sekunder;

    System.out.println("Timer:" + timer);
    System.out.println("minutter:" + minutter);
    System.out.println("sekunder:" + sluttSekunder);
 }    
}
