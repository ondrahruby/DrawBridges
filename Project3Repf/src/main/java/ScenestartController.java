/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author andys
 */
public class ScenestartController implements Initializable {
    @FXML
    private AnchorPane paneone;
    @FXML
    Button manualbutton;
    @FXML
    Button simbutt;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("Loaded");
        
    }    

    @FXML
    private void handlemanualbutton(ActionEvent event) throws Exception {
        Parent rooter = FXMLLoader.load(getClass().getResource("/fxml/drawbridgefirst.fxml"));
        Scene sceno = new Scene(rooter);
        Stage stago = (Stage)((Node)event.getSource()).getScene().getWindow();
        stago.setTitle("Manual");
        stago.setScene(sceno);
        stago.show();
        
        
        
        
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); //remove the old window
//        stage.close();
//        //Open the index one
//        FXMLLoader requestedScene = new FXMLLoader(getClass().getResource("/fxml/drawbridgefirst.fxml"));
//        Stage window;
//        Scene scene = new Scene(requestedScene.load());
//        window = new Stage();
//        window.setTitle("Manual");
//        window.setScene(scene);
//        window.show();
        
    
//        Stage appStage=(Stage)manualbutton.getScene().getWindow();
//        Parent root=FXMLLoader.load(getClass().getResource("/fxml/drawbridgefirst.fxml"));
//        Scene scene=new Scene(root);
//        appStage.setScene(scene);
//        appStage.show();
//    }
//    
         
        
        
        
      
        //stage = (Stage) startbutton.getScene().getWindow();
        /*AnchorPane layout = FXMLLoader.load(getClass().getResource("/fxml/drawbridgefirst.fxml"));
        paneone.getChildren().setAll(layout);*/
    }
    
    @FXML
     private void handleSimButt(ActionEvent event) throws Exception {
        Parent rooters = FXMLLoader.load(getClass().getResource("/fxml/drawbridgeStateSim.fxml"));
        Scene scenos = new Scene(rooters);
        Stage stagos = (Stage)((Node)event.getSource()).getScene().getWindow();
        stagos.setTitle("simulation");
        stagos.setScene(scenos);
        stagos.show();
         
//        Stage stage = new Stage();
//        Parent root;
//        
//        root = FXMLLoader.load(getClass().getResource("/fxml/drawbridgeStateSim.fxml"));
//        Scene scene = new Scene(root);
//        stage.setTitle("Simulation");
//        stage.setScene(scene);
//        stage.show();
        
      
        //stage = (Stage) startbutton.getScene().getWindow();
        /*AnchorPane layout = FXMLLoader.load(getClass().getResource("/fxml/drawbridgefirst.fxml"));
        paneone.getChildren().setAll(layout);*/
    }
    
    
}
