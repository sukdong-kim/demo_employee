package app2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class ViewController3 {

    @FXML
    private VBox vbox;

    @FXML
    void onClickm1(ActionEvent event) {
    	vbox.setStyle("-fx-background-color: yellow;");
    }

    @FXML
    void onClickm2(ActionEvent event) {
    	vbox.setStyle("-fx-background-color: green;");
    }

    @FXML
    void onClickm3(ActionEvent event) {
    	vbox.setStyle("-fx-background-color: pink;");
    }

    @FXML
    void onClickm4(ActionEvent event) {
    	vbox.setStyle("-fx-background-color: brown;");
    }

    @FXML
    void onClickm5(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void onClickm6(ActionEvent event) {
    	System.out.println(" Color display on the canvas");
    }

}
