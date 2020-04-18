
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
public class Up implements BridgeState {
    @FXML
    public TextField textb;
    @Override
    public void next(Bridge pkg) {
        pkg.setState(new Down());
    }
 
    @Override
    public void prev(Bridge pkg) {
        textb.setText("The Bridge is down.");
        System.out.println("The Bridge is down.");
    }
 
    @Override
    public void printStatus() throws InterruptedException{
        textb.setText("The boat approached and pressed the button");
        System.out.println("The boat approached and pressed the button");
        TimeUnit.SECONDS.sleep(2);
        textb.setText("The Bridge is going up!");
        System.out.println("The Bridge is going up!");
        TimeUnit.SECONDS.sleep(2);
    }
    
}
