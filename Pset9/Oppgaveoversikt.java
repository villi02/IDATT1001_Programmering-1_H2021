public class Oppgaveoversikt {

    private Student studenter[];
    private int antStud = 0;


    public Oppgaveoversikt(int plasser){
        this.studenter = new Student[plasser];
    }

    public void nyStudent(String navn, int antOppg){
    Student nyStudent = new Student(navn, antOppg);
    this.studenter[antStud] = nyStudent;
    antStud++;
     
    }

    public int getAntStud() {
        return this.antStud;
    }

     public int getAntOppg(int studnr){
        return this.studenter[studnr].getAntOppg();
    }

    public void okAntallOppgStud(int studnr, int okning)
    {
        this.studenter[studnr].økAntOppg(okning);
    }

    public String toString(int studnr){
       return this.studenter[studnr].toString();

    }

    public String getNavn(int studnr){
        return this.studenter[studnr].getNavn();
    }
}
