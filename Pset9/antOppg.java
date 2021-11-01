public class antOppg {

    private Student student;
    private int antOppg = 0;


    public antOppg(Student student, int antOppg){
        this.student = student;
        this.antOppg = antOppg;

    }

    public String getNavn(){
        return student.getNavn();
    }

    public int getAntOppg(){
        return student.getAntOppg();
    }
}
