package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private Label myLabel;
	@FXML
	private TextField myTextField;
	@FXML Button myButton;

	int age;
	
	public void submit(ActionEvent event)  {
		try {
			age= Integer.parseInt(myTextField.getText());
			if(age>=18) {
				myLabel.setText("you are now signed up!!");
			}else {
				myLabel.setText("You must be 18+!");
			}
			
			System.out.println(age);
		}
		catch(NumberFormatException e) {
			myLabel.setText("Enter only number's please");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
