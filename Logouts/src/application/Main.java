package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			primaryStage.setOnCloseRequest(event->{
				event.consume();
				logout(primaryStage);
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
public void logout(Stage stage) {
		
		Alert alert= new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("Your about to logout");
		alert.setContentText("Do you want to save before exiting");
		
		if(alert.showAndWait().get()==ButtonType.OK) {
			
			System.out.println("You successfully logged out!");
			stage.close();}
		}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	

	

	
}
