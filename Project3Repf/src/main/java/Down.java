import java.awt.Frame;
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
public class Down implements BridgeState {
    @FXML
    public TextField textb;
    
    @Override
    public void next(Bridge pkg) {
        System.out.println("The Bridge is down!");
    }
 
    @Override
    public void prev(Bridge pkg) {
        pkg.setState(new Up());
    }
 
    @Override
    public void printStatus() throws InterruptedException {
        textb.setText("The boat passed through");
        System.out.println("The boat passed through");
        TimeUnit.SECONDS.sleep(2);
        textb.setText("The Bridge is going down!");
        System.out.println("The Bridge is going down!");
        TimeUnit.SECONDS.sleep(2);
    }
}
