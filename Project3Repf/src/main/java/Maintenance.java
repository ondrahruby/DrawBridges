
import java.util.concurrent.TimeUnit;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andys
 */
public class Maintenance implements BridgeState {
    @FXML
    public TextField textb;
    
    @Override
    public void next(Bridge pkg) {
        System.out.println("The Bridge is in maintenance!");
    }
 
    @Override
    public void prev(Bridge pkg) {
        System.out.println("The Bridge is in maintenance!");
    }

    public void printStatus() throws InterruptedException{
        textb.setText("The Bridge is in maintenance!");
        System.out.println("The Bridge is in maintenance!");
        TimeUnit.SECONDS.sleep(2);
    }
}