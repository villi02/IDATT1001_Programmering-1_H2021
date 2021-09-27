public class Brøk
{
    private int teller;
    private int nevner;

    public Brøk(int teller, int nevner)
    {
        if (nevner == 0)
        {
            throw new IllegalArgumentException("nevner kan ikke være lik 0");
        }
        
        this.teller = teller;
        this.nevner = nevner;


    }

    public Brøk(int teller)
    {
        this.teller = teller;
        this.nevner = 1;
    }

    public void  multiplisere(int teller1, int nevner1)
    {
        this.teller = teller * teller1;
        this.nevner = nevner * nevner1;
    }

    public void dividere(int teller2, int nevner2)
    {
        this.teller = teller / teller2;
        this.nevner = nevner / nevner2;
    }

    public void addere(int addTeller, int addNevner)
    {
        if (nevner == addNevner)
        {
            this.teller += addTeller;
        }

        else
        {
            int tempNevner = nevner;
            int tempTeller = teller;
            this.nevner = nevner * addNevner;
            this.teller = teller * addNevner;
            addNevner = addNevner * tempNevner;
            addTeller = addTeller * tempTeller;

            this.nevner += addNevner;
            this.teller += addTeller;

        }
    }
        public void subtrahere(int subTeller, int subNevner)
        {
            if (nevner == subNevner)
            {
                teller += subTeller;
            } else {
                int tempNevner = nevner;
                int tempTeller = teller;
                this.nevner = nevner * subNevner;
                this.teller = teller * subNevner;
                subNevner = subNevner * tempNevner;
                subTeller = subTeller * tempTeller;

                this.nevner -= subNevner;
                this.teller -= subTeller;

            }
        }
        public void forkort()
            {
                for (int i = nevner; i >= 0; i--)
                {
                    if (nevner % i == 0 && teller % i == 0)
                    {
                        if (i > 0)
                        {
                            this.nevner = nevner / i;
                            this.teller = teller / i;
                            break;
                        }
                    }
                }
            }

    public int getNevner()
    {
        return this.nevner;
    }

    public int getTeller()
    {
        return this.teller;
    }
}

