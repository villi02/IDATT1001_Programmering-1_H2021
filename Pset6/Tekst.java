public class Tekst
{
    String teksten;
    int antallTegn[] = new int[31];
    int forskjellige = 0;
    int mangler = 0;
    int antallbokstaver = 0;
    double prosentbok = 0;
    int mestantall = 0;
    int mest[] = new int[30];
    public Tekst(String tekstenn)
    {
        this.teksten = tekstenn.toLowerCase();
    }
     
    
    public void regnAntall()
    {
        int lenght = teksten.length();
        for (int i = 0; i < lenght; i++)
        {
            if (Character.isLetter(teksten.charAt(i)))
            {
                antallTegn[teksten.charAt(i) - 97]++;
            }
            else
            {
                antallTegn[30]++;
            }
        }
        for (int i = 0; i < 30; i++)
        {
            antallbokstaver += antallTegn[i];
        }
    }

    public int bokstaverTotalt()
    {
        int bokstaverTot = 0;
        for (int i = 0; i < 30; i++)
        {
            bokstaverTot += antallTegn[i];
        }
        return bokstaverTot;
    }

    public int getAntallforekomster(int i)
    {
        return antallTegn[i];
    }

    public int antallForskjellige()
    {
        for (int i = 0; i < 30; i++)
        {
            if (antallTegn[i] != 0)
            {
                forskjellige++;
            }

        }
        return forskjellige;
    }

    public double getProsentTegn()
    {
        prosentbok = antallTegn[30] / antallbokstaver;
        return prosentbok;
    }

    public int[] mestAv()
    {
        for (int i = 0; i < 30; i++)
        {
            if (antallTegn[i] > mestantall)
            {
                mestantall = antallTegn[i];
            }
        }
        for (int i = 0; i < 30; i++)
        {
            if (antallTegn[i] == mestantall)
            {
                mest[i] = i + 97;
            }
        }
        return mest;
    }
}