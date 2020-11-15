package app2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

public class ViewController {
    @FXML
    private HBox hbox;

    @FXML
    void onClickb1(ActionEvent event) {
    	 hbox.setStyle("-fx-background-color: yellow;");
    }

    @FXML
    void onClickb2(ActionEvent event) {
    	 hbox.setStyle("-fx-background-color: green;");
    }

    @FXML
    void onClickb3(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void onClickb4(ActionEvent event) {
   	 hbox.setStyle("-fx-background-color: pink;");
    }

}

