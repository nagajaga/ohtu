package ohtu.verkkokauppa;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ostoskori {


    ArrayList<TuoteInterface> tuotteet = new ArrayList<>();

    public void lisaa(TuoteInterface t) {
        tuotteet.add(t);
    }

    public void poista(TuoteInterface t) {
        tuotteet.remove(t);
    }

    public int hinta() {
        int hinta = 0;

        for (TuoteInterface tuote : tuotteet) {
            hinta += tuote.getHinta();
        }

        return hinta;
    }
}