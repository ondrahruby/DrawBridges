import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Drawbridgefirst {
    @FXML
    Button upbutton;
    @FXML
    Button downbutton;
    @FXML
    Button manitenance;
    @FXML
    TextArea texta;
/*
    public static void display(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Drawbridge First");
        window.setMinWidth(250);



        AnchorPane layout = new AnchorPane();

        //BorderPane layout = new BorderPane();
        //VBox buttons = new VBox();
        layout.getChildren().addAll(upbutton, downbutton, maintenance, texta);
        /*HBox hboxa = new HBox();
        hboxa.getChildren().add(texta);
        layout.setLeft(buttons);
        layout.setBottom(hboxa);*//*
        Scene scene = new Scene(layout, 700, 500);
        window.setScene(scene);
        window.showAndWait();

    }*/
}
