/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author andys
 */
public class DrawbridgefirstController implements Initializable {
    
    @FXML
    public TextField texta;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        texta.setText("Boat approached and pressed the button");
    }

    @FXML
    public void upbuttclick(ActionEvent actionEvent) {
        texta.setText("Bridge is going up!");


    }

    @FXML
    public void downbuttclick(ActionEvent actionEvent) {
        texta.setText("Bridge is going down!");
    }

    @FXML
    public void maintbuttclick(ActionEvent actionEvent) {
        texta.setText("Bridge is in maintenance!");
    }
}
