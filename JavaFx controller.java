package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class Controller {
    //@FXML private Button btn1;
    @FXML
    private Label nom;
    @FXML
    private Label age;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private TextArea txt1;
    @FXML
    private TextArea txt2;

    @FXML
    protected void imprimir (ActionEvent evento) {
        String nom=txt1.getText();
        lbl4.setText(nom);
        String valor = txt2.getText();
        int age = Integer.parseInt(valor);

        if (age >= 18) {
            lbl3.setText("Tu puedes votar");
        }
        else if (age< 18){
            lbl3.setText("Tu no puedes votar");
        }



    }
}