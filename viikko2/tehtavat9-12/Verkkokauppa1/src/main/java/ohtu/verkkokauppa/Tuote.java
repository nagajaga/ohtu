package ohtu.verkkokauppa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Tuote implements TuoteInterface {
    private int id;
    private String nimi;
    private int hinta;


    public Tuote(int id, String nimi, int hinta) {
        this.id = id;
        this.nimi = nimi;
        this.hinta = hinta;
    }

    @Override
    public boolean equals(Object o) {
        Tuote t = (Tuote)o;
        
        return id==t.id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getHinta() {
        return hinta;
    }

    @Override
    public String toString() {
        return nimi;
    }            
    
}