import javax.swing.*;
import java.util.ArrayList;

/**
 * register som inneholder eiendommer
 */
public class PropertyRegister {

    /**
     * lager ny arraylist for å bruke til klientprogrammet
     */
    public ArrayList<Property> properties = new ArrayList<Property>();

    /**
     * lager ny eiendom basert på følgende parametere:
     * @param kommuneNr
     * @param kommuneNavn
     * @param gårdsNr
     * @param bruksNr
     * @param brukNavn
     * @param areal
     * @param eier
     * @return
     */
    public Property newProperty(int kommuneNr, String kommuneNavn, int gårdsNr, int bruksNr, String brukNavn, double areal, String eier){
        Property newPropery = new Property( kommuneNr, kommuneNavn, gårdsNr, bruksNr, brukNavn, areal, eier);
        this.properties.add(newPropery);
        return newPropery;
    }

    /**
     * fjerner eiendom hvis den er lik eiendommen som er input
     * @param property
     */
    public void removeProperty(Property property)
    {
        this.properties.removeIf(property::equals);
    }

    /**
     * returnerer antall eiendommer, som er det samme som størrelsen til arraylisten med alle eiendommene
     * @return
     */
    public int amountProperties()
    {
        return this.properties.size();
    }

    /**
     * finner eiendom i henhold til kommunenr, gårdsnr og bruksnr samtidig
     * @param kommuneNr
     * @param gårdsNr
     * @param bruksNr
     * @return
     */
    public ArrayList<Property> findProperty(int kommuneNr, int gårdsNr, int bruksNr)
    {
        ArrayList<Property> found = new ArrayList<Property>();
        for (Property property : this.properties) {
            //this.properties.get(i).getKommuneNr() == kommuneNr && this.properties.get(i).getGårdsNr() == gårdsNr && this.properties.get(i).getBruksNr() == bruksNr
            //This solution needs testing
            if (property.getPropertyId().equals(makeId(kommuneNr,gårdsNr,bruksNr))){
                found.add(property);
            }
        }
        return found;
    }

    /**
     * lager "ID'en" til eiendommen som oppgaven etterspurte
     * @param kommuneNr
     * @param gårdsNr
     * @param bruksNr
     * @return
     */
    public String makeId(int kommuneNr, int gårdsNr, int bruksNr)
    {
        return kommuneNr + "-" + gårdsNr + "/" + bruksNr;
    }

    /**
     * finner gjennomsnittsarealet
     * @return
     */
    public double avgArea(){
        double sum = 0;
        for (Property property : this.properties) {
            sum += property.getAreal();
        }
        return sum/this.properties.size();
    }

    /**
     * finner eiendommer basert på gårdsnr
     * @param gårdsNr
     * @return
     */
    public ArrayList<Property> getByGårdsNr(int gårdsNr)
    {
        ArrayList<Property> found = new ArrayList<>();
        for (Property property : this.properties) {
            if (property.getGårdsNr() == gårdsNr) {
                found.add(property);
            }
        }
        return found;
    }


}
