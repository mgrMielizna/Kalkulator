package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    //Kalkulator

    //Double liczba = 0 ;

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
    private TextField wyswietlacz;
    //public static Integer getText(Integer);

    @FXML
    void przycisniecieKlawisza(ActionEvent event) {
        if (event.getSource()==kasuj) {
            wyswietlacz.setText("");
        }
        
    }
}