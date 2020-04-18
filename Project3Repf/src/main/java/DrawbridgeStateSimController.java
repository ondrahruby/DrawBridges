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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author andys
 */
public class DrawbridgeStateSimController implements Initializable {
    @FXML
    public TextField textb;
    
    Bridge bridge = new Bridge();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        

    }
    @FXML
    public void simbuttStart(ActionEvent actionevent) throws InterruptedException{
        bridge.printStatus();
        bridge.nextState();
        bridge.printStatus();
       
        
    }
    
    @FXML
    public void maintbuttHandle(ActionEvent actionevent) throws InterruptedException{
        Maintenance m = new Maintenance();
        bridge.setState(m);
        bridge.printStatus();
        
    }

    
    
}
