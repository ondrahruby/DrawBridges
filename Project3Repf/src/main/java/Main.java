import javafx.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.awt.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;



public class Main extends Application{
    

    public static void main(String[] args){

        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/scenestart.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("DrawBridge");
        primaryStage.setScene(scene);
        primaryStage.show();
        /*
        window = primaryStage;
    new Scene(root, 700,500)

        window.setTitle("DrawBridge");
        this.button = new Button("Start");
        AnchorPane apane = new AnchorPane();
        apane.getChildren().add(button);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Drawbridgefirst.display();
                window.close();
            }
        });

        Scene scene = new Scene(apane, 700,500);
        primaryStage.setScene(scene);
        primaryStage.show();*/
        /*
        button.setOnAction(e -> System.out.println("Done"));

        StackPane pane = new StackPane();
        //AnchorPane apane = new AnchorPane();
        //apane.getChildren().add(button);
        pane.getChildren().add(button);
        Scene scene = new Scene(pane, 300,250);
        primaryStage.setScene(scene);
        primaryStage.show();*/

    }


}
