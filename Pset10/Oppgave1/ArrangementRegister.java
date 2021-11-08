import java.util.Collections;
import java.util.Comparator;
import java.text.MessageFormat;
import java.util.ArrayList;

public class ArrangementRegister {

    private int nrArg = 0;
    public ArrayList<Arrangement> arrangementer;

    public ArrangementRegister(){
        arrangementer = new ArrayList<Arrangement>();
    }

    public void nyArrangement(int argNr, String navn, String sted, String arrangør, String type, long dato)
    {
        Arrangement nyarrangement = new Arrangement(argNr, navn, sted, arrangør, type, dato);
        arrangementer.add(nyarrangement);
        nrArg++;
    }

    public ArrayList<Arrangement> finneArgPåSted(String sted) {

        ArrayList<Arrangement> argPåSted = new ArrayList<Arrangement>();
        for (int i = 0; i < nrArg; i++) {
            if (arrangementer.get(i).getSted().equals(sted)) {
                argPåSted.add(arrangementer.get(i));
            }
        }
        if (argPåSted.isEmpty())
        {
            throw new IllegalArgumentException("Ingen arrangementer ved " + sted);
        }
        else {
            return argPåSted;
        }
    }
    public ArrayList<Arrangement> finneVedDato(long dato)
        {
            ArrayList<Arrangement> vedDato = new ArrayList<Arrangement>();
            int match = 0;
            for (int i = 0; i < nrArg; i++){
                if (arrangementer.get(i).getDato() == dato){
                    vedDato.add(arrangementer.get(i));
                    match++;
                }
            }
            if (match == 0){
                throw new IllegalArgumentException("Ingen arrangementer på oppgitt tidspukt");
            }
            else{
                return vedDato;
            }
        }

        public ArrayList<Arrangement> finneMellomDato(long start, long slutt)
        {
            if (start > slutt){
                throw new IllegalArgumentException("Sluttdatoen må være ETTER startdatoen");
            }
            ArrayList<Arrangement> mellomDato = new ArrayList<Arrangement>();
            for (int i = 0; i < arrangementer.size(); i++)
            {
                if (arrangementer.get(i).getDato() >= start && arrangementer.get(i).getDato() <= slutt){
                    mellomDato.add(arrangementer.get(i));
                }
            }
            Comparator<Arrangement> sortTid = (Arrangement arg1, Arrangement arg2) -> (int) arg1.getDato() - (int)arg2.getDato();
            Collections.sort(mellomDato, sortTid);
            return mellomDato;
        }

        public void printAlle(ArrayList<Arrangement> arglist){
        if (arglist.size() > 0){
            for (int i = 0; i < arglist.size(); i++){
                System.out.println(arglist.get(i).toString());
            }
        }
        else{
            System.out.println("Fant ingen arrangementer");
        }

        }

        public ArrayList<Arrangement> sorterEtterTid(ArrayList<Arrangement> ar1)
        {
            //Comparator.comparing(Arrangement::getSted).thenComparing(Arrangement::getDato);
            Comparator<Arrangement> sorterTid = (Arrangement arg1, Arrangement arg2) -> (int) arg1.getDato() - (int) arg2.getDato();
            ArrayList<Arrangement> argTid = ar1;
            Collections.sort(argTid, sorterTid);
            return argTid;
        }

        public ArrayList<Arrangement> sorterEtterSted(ArrayList<Arrangement> ar1)
        {
            Comparator<Arrangement> sorterSted = (Arrangement arg1, Arrangement arg2) -> arg1.getSted().compareTo(arg2.getSted());
            ArrayList<Arrangement> argSted = ar1;
            Collections.sort(argSted, sorterSted);
            return argSted;
        }

        public ArrayList<Arrangement> sorterEtterType(ArrayList<Arrangement> ar1)
        {
            Comparator<Arrangement> sorterType = (Arrangement arg1, Arrangement arg2) -> arg1.getType().compareTo(arg2.getType());
            ArrayList<Arrangement> argType = ar1;
            Collections.sort(argType, sorterType);
            return argType;
        }
}

