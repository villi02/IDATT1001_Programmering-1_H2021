/**
 * TODO
 */
public class Property {
    private int kommuneNr, gårdsNr, bruksNr;
    private double areal;
    private String kommuneNavn, brukNavn, eier;

    /**
     * Creates a new property.
     * @param kommuneNr a
     * @param kommuneNavn a
     * @param gårdsNr a
     * @param bruksNr a
     * @param brukNavn a
     * @param areal a
     * @param eier a
     */
    public Property(int kommuneNr, String kommuneNavn, int gårdsNr, int bruksNr, String brukNavn, double areal, String eier)
    {
        this.kommuneNr = kommuneNr;
        this.kommuneNavn = kommuneNavn;
        this.gårdsNr = gårdsNr;
        this.bruksNr = bruksNr;
        this.brukNavn = brukNavn;
        this.areal = areal;
        this.eier = eier;
    }

    public int getKommuneNr() {
        return kommuneNr;
    }

    public String getKommuneNavn() {
        return kommuneNavn;
    }

    public int getGårdsNr() {
        return gårdsNr;
    }

    public int getBruksNr() {
        return bruksNr;
    }

    public String getBrukNavn() {
        return brukNavn;
    }

    public double getAreal() {
        return areal;
    }

    public String getEier() {
        return eier;
    }

    public void setEier(String eier) {
        this.eier = eier;
    }

    public void setBrukNavn(String brukNavn) {
        this.brukNavn = brukNavn;
    }

    public void setBruksNr(int bruksNr) {
        this.bruksNr = bruksNr;
    }

    /**
     * returnerer eiendoms "ID'en" som var etterspurt i oppgaveteksten
     * @return
     */
    public String getPropertyId()
    {
        return this.kommuneNr + "-" + this.gårdsNr + "/" + bruksNr;
    }

    /**
     * returnerer alle opplysningene til en eiendom i en string
     * @return
     */
    public String toString()
    {
        return kommuneNr + ", " + kommuneNavn + ", " + gårdsNr + ", " + bruksNr + ", " + brukNavn + ", " + areal + ", " + eier;
    }
}

