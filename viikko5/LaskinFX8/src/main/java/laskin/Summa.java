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

public class Summa extends Komento {

    int edellinen;

    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);

    }

    @Override
    public void suorita() {
        edellinen = Integer.parseInt(syotekentta.getText());
        sovellus.plus(Integer.parseInt(syotekentta.getText()));
        tuloskentta.setText("" + sovellus.tulos());
        syotekentta.clear();
        nollaa.disableProperty().set(false);
        undo.disableProperty().set(false);
    }

    @Override
    public void peru() {
        sovellus.miinus(edellinen);
        tuloskentta.setText("" + sovellus.tulos());
        syotekentta.clear();
        nollaa.disableProperty().set(false);
        undo.disableProperty().set(true);
    }

}