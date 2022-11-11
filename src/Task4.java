import java.awt.*;
import java.awt.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
public class Controller {
    // opprett heltalls array med prisene pr. sone
    @FXML
    private Label lblResultat, lblFeilSoner, lblFeilAntall;
    @FXML
    private TextField txtAntall, txtSoner;
    @FXML
    private CheckBox chkRabatt;

    @FXML
    private void btnBeregn(ActionEvent event) {
        //helltallsArrayet
        int [] priser = {36,59,82,105,128};
//viser kun til logikk og ikke selve FXML så mye
        int innAntall = Integer.parseInt(txtAntall.getText());
        int innsoner = Integer.parseInt(txtSoner.getText());
        boolean rabatt = chkRabatt.isSelected();

        try {
            int pris =  priser[innsoner -1];

            int sum = innsoner * innAntall;

            if (rabatt == true) { //kan bli simplisfisert, men det kan være lurt å skrive sånn som dette for sensoren sin skyld
                sum = sum/2;
                lblResultat.setText("Din pris ble: " + sum);
            }

        } catch (Exception e){
            System.out.println("Det er noe feil i input " +e);
            lblResultat.setText("Det er noe feil i input " +e);
        }
//Skriv koden din her

    }
}

public class Task4 {
    public static void main(String[] args) {

    }
}
