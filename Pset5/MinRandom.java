public class MinRandom
{
    private int nedreint;
    private int ovreint;
    private int nestetall;
    private double nestedouble;
    private double nedredouble;
    private double ovredouble;

    public int nesteHeltall(int nedre, int ovre)
    {
        java.util.Random tallet = new java.util.Random();
        do
        {
            nestetall = tallet.nextInt(ovre);
        } while(nestetall < nedre);
        return nestetall;
    }

    public double nesteDesimaltall(double nedre, double ovre)
    {
        java.util.Random tallet = new java.util.Random();
        do
        {
            double tall = tallet.nextDouble();
            nestedouble = tall * ovre;
        } while (nestedouble < nedre);
        return nestedouble;
    }
}
