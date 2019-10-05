/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibo_bmi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/**
 *
 * @author Ibrahim
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txt_drezhy, txt_kesh, tx3;

    @FXML
    private Label lbl_qalaw, lbl_zyada, lbl_asay, lbl_kam;

    @FXML
    public void me_anjaman() {
        double h = Double.parseDouble(txt_drezhy.getText());
        double w = Double.parseDouble(txt_kesh.getText());

        double dabash = w / (h * h);

         tx3.setText((int)(dabash)+"");

        if (dabash <= 18.5) {
            lbl_kam.setTextFill(Color.RED);
            lbl_asay.setTextFill(Color.BLACK);
            lbl_zyada.setTextFill(Color.BLACK);
            lbl_qalaw.setTextFill(Color.BLACK);

        } else if (dabash <= 24.9) {
            lbl_kam.setTextFill(Color.BLACK);
            lbl_asay.setTextFill(Color.RED);
            lbl_zyada.setTextFill(Color.BLACK);
            lbl_qalaw.setTextFill(Color.BLACK);
        } else if (dabash <= 29.5) {

            lbl_kam.setTextFill(Color.BLACK);
            lbl_asay.setTextFill(Color.BLACK);
            lbl_zyada.setTextFill(Color.RED);
            lbl_qalaw.setTextFill(Color.BLACK);
        } else if (dabash > 30) {

            lbl_kam.setTextFill(Color.BLACK);
            lbl_asay.setTextFill(Color.BLACK);
            lbl_zyada.setTextFill(Color.BLACK);
            lbl_qalaw.setTextFill(Color.RED);
        }
    }

    @FXML
    public void me_pakrdnawa() {
        tx3.setText("");
        txt_drezhy.setText("");
        txt_kesh.setText("");

    }

    @FXML
    public void me_darchun() {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
