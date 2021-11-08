import java.util.ArrayList;
import java.util.Scanner;

public class w10oppgave1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrangementRegister register = new ArrangementRegister();
        int valg1;
        int argNr = 0;
        do {
            System.out.println("Hva vil du gjøre?");
            System.out.println("1: Lage et nytt arrangement? (Må bli gjort første gangen)");
            System.out.println("2: Finne arrangementer på et gitt sted?");
            System.out.println("3: Finne arrangementer på et gitt tidspunkt?");
            System.out.println("4: Finne alle arrangementer innenfor et tidsintervall? (Printer ut sortert etter tid)");
            System.out.println("5: Få liste av alle arrangementer sortert etter ditt valg?");
            System.out.println("6: Avslutte?");
            valg1 = sc.nextInt();
            switch(valg1){
                case 1:
                    System.out.println("navn:");
                    String denneTellesIkke = sc.nextLine();
                    String Navn = sc.nextLine();
                    System.out.println(Navn);


                    System.out.println("Sted:");
                    String sted = sc.nextLine();

                    System.out.println("Arrangør:");
                    String arrangør = sc.nextLine();
                    System.out.println("Type:");
                    String type = sc.nextLine();
                    System.out.println("Dato (YYYYMMDDTTMM):");
                    long dato = sc.nextLong();
                    register.nyArrangement(argNr, Navn, sted, arrangør, type, dato);
                    argNr++;
                    break;

                case 2:
                    System.out.println("Sted:");
                    String telssikke = sc.nextLine();
                    String lokalisering = sc.nextLine();
                    System.out.println(lokalisering);
                    ArrayList<Arrangement> argmtr = register.finneArgPåSted(lokalisering);
                    register.printAlle(argmtr);
                    break;

                case 3:
                    System.out.println("Dato (YYYYMMDDTTMM):");
                    long tidspunkt = sc.nextLong();
                    ArrayList<Arrangement> argmtrdato = register.finneVedDato(tidspunkt);
                    register.printAlle(argmtrdato);
                    break;

                case 4:
                    System.out.println("Start (YYYYMMDDTTMM):");
                    long start = sc.nextLong();
                    System.out.println("Slutt (YYYYMMDDTTMM):");
                    long slutt = sc.nextLong();
                    ArrayList<Arrangement> argmtrmellomdato = register.finneMellomDato(start, slutt);
                    register.printAlle(argmtrmellomdato);
                    break;

                case 5:
                    System.out.println("1: Sted");
                    System.out.println("2: Type");
                    System.out.println("3: Tidspunkt");
                    int valg2 = sc.nextInt();
                    switch(valg2){
                        case 1:
                            ArrayList<Arrangement> sortSted =  register.sorterEtterSted(register.arrangementer);
                            register.printAlle(sortSted);
                            break;
                        case 2:
                            ArrayList<Arrangement> sortType = register.sorterEtterType(register.arrangementer);
                            register.printAlle(sortType);
                            break;
                        case 3:
                            ArrayList<Arrangement> sortTid = register.sorterEtterTid(register.arrangementer);
                            register.printAlle(sortTid);
                            break;
                    }
            }

        } while(valg1 != 6);
        sc.close();
        System.exit(0);

        }
}

