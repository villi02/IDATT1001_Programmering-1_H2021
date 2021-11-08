import java.text.MessageFormat;
public class Arrangement {

    private int argNr;
    private long dato;
    private String sted;
    private String navn;
    private String arrangør;
    private String type;

    public Arrangement(int argNr, String navn, String sted, String arrangør, String type, long dato)
    {
        this.argNr = argNr;
        this.navn = navn;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;
        this.dato = dato;
    }

    public int getArgNr() {
        return argNr;
    }

    public String getNavn() {
        return navn;
    }

    public String getSted() {
        return sted;
    }

    public String getArrangør() {
        return arrangør;
    }

    public String getType() {
        return type;
    }

    public long getDato() {
        return dato;
    }


    public String toString(){
        return "Id: " + this.argNr + ", navn: " + this.navn + ", sted: " + this.sted + ", arrangør: " + this.arrangør + ", type: " + this.type + ", dato: " + this.dato;
    }
}
