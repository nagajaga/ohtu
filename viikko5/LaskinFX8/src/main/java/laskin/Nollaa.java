/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

/**
 *
 * @author joel
 */
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        tuloskentta.clear();
        syotekentta.clear();
        sovellus.nollaa();
        undo.disableProperty().set(true);
        nollaa.disableProperty().set(true);
    }

    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
