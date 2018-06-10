package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    //Kalkulator

    double liczba;
    double realnyWynik = 0;

    @FXML
    private Button dzielenie;

    @FXML
    private Button dodawanie;

    @FXML
    private Button odejmowanie;

    @FXML
    private Button mnozenie;

    @FXML
    private Button kasuj;

    @FXML
    private Button wynik;

    @FXML
    private Label historia1;

    @FXML
    private Label historia2;

    @FXML
    private Label historia3;

    @FXML
    private TextField wyswietlacz;


    @FXML
    void przycisniecieKlawiszaDodawanie() {
        liczba = Double.valueOf(wyswietlacz.getText());
        realnyWynik += liczba;
        wyswietlacz.setText("");

    }

    @FXML
    void przycisniecieKlawiszaDzielenie() {
         liczba = Double.valueOf(wyswietlacz.getText());
    }

    @FXML
    void przycisniecieKlawiszaKasuj() {
        wyswietlacz.setText("");
    }

    @FXML
    void przycisniecieKlawiszaMnozenie() {

    }

    @FXML
    void przycisniecieKlawiszaOdejmowanie() {

    }

    @FXML
    void przycisniecieKlawiszaWynik() {
        wyswietlacz.setText(String.valueOf(realnyWynik));

    }


}
