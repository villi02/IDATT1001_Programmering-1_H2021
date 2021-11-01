import java.util.Scanner;
import java.text.MessageFormat;
public class w9oppgave1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valg1;
        int studNr = 0;
        Student studentNr[] = new Student[69];

        System.out.println("Antall plasser i klassen:");
        int plasser = sc.nextInt();
        Oppgaveoversikt oversikt = new Oppgaveoversikt(plasser);

        do{
            System.out.println("Hva vil du gjøre?\n" + "1: Lage ny student? (må gjøres første gangen)\n" + "2: Øke antall oppgaver en student har gjort?\n" + "3: Skrive ut liste med navn, antall oppgaver gjort og (student nr) til alle studentene?\n" + "4: Finne antall studenter?\n" + "5: Avslutte?\n");
            valg1 = sc.nextInt();
            switch (valg1){
                case 1:
                    System.out.println("Antall oppgaver gjort fra før:");
                    int antOppg = sc.nextInt();

                    System.out.println("Hele navnet:");
                    String bull = sc.nextLine();
                    String navn = sc.nextLine();

                    oversikt.nyStudent(navn, antOppg);
                    studentNr[studNr] = new Student(navn, antOppg);

                    studNr++;
                    break;

                case 2:
                    System.out.println("Hvilken student vil du endre på? OBS skriv vedien i parantesen");

                    for (int i = 0; i < oversikt.getAntStud(); i++)
                    {
                        if (studentNr[i] == null){
                            continue;
                        }

                        else {
                            System.out.println(oversikt.toString(i) + MessageFormat.format(" ({0})", i));
                        }
                    }
                    int studentValgNr = sc.nextInt();

                    System.out.println("Hvor mange oppgaver vil du øke med?");
                    int økning = sc.nextInt();

                    oversikt.okAntallOppgStud(studentValgNr, økning);

                    System.out.println("Ny verdi for " + oversikt.getNavn(studentValgNr) + ": " + oversikt.getAntOppg(studentValgNr));
                    break;

                case 3:
                    for (int i = 0; i < oversikt.getAntStud(); i++)
                    {
                        if (studentNr[i] == null){
                            continue;
                        }

                        else {
                            System.out.println(oversikt.toString(i) + MessageFormat.format(" ({0})", i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Antall studenter: " + oversikt.getAntStud());
                    break;

                case 5:
                    sc.close();
                    System.exit(0);
                    break;
            }


        } while (valg1 < 5);

        sc.close();
        System.exit(0);
    }
}
