public class Spiller
{
    
    private int sumPoeng;
    private String name;

    public Spiller(String name){
        this.name = name;
        this.sumPoeng = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getSumPoeng()
    {
        
        return sumPoeng;
    }

    public int kastTerningen()
    {
        java.util.Random terning = new java.util.Random();
        int terningkast = terning.nextInt(6);
        if (terningkast == 1)
        {
            sumPoeng = 0;
        }
        else
        {
        sumPoeng += terningkast;
        }
        return terningkast;
    }

    public boolean erFerdig(int sluttverdi)
    {
        return this.sumPoeng >= sluttverdi;
    }
}