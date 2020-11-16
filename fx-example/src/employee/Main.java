package employee;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	private static Stage primaryStage;
	private static BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;						
			this.primaryStage.setTitle("Employee app");
			
			showMainView();		
			showMainItems();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void showMainView() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/MainView.fxml"));
			mainLayout = loader.load();
			Scene scene = new Scene(mainLayout,800,600);
			primaryStage.setScene(scene);
			primaryStage.show();
	
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	public static void showMainItems() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
			BorderPane mainItems = loader.load();
			mainLayout.setCenter(mainItems);
		} catch(Exception e) {
			e.printStackTrace();
		}			
	}

	public static void showElectricalScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("electrical/ElectricalDept.fxml"));
		BorderPane electricalDept = loader.load();
		mainLayout.setCenter(electricalDept);
	}
	
	public static void showMechanicalScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mechinical/MechanicalDept.fxml"));
		BorderPane mechanicalDept = loader.load();
		mainLayout.setCenter(mechanicalDept);
	}
	
	public static void showAddStage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/AddNewEmployee.fxml"));
		BorderPane addNewEmployee = loader.load();
		
		Stage addDialogStage = new Stage();
		addDialogStage.setTitle("Add New Employee");
		addDialogStage.initModality(Modality.WINDOW_MODAL);
		addDialogStage.initOwner(primaryStage);
		Scene scene = new Scene(addNewEmployee);
		addDialogStage.setScene(scene);
		addDialogStage.showAndWait();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
