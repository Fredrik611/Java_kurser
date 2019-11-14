package fa222rw_assign2;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class CompoundInterest extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		
		// A gridpane and some syling for the gridpane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.4));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		// a label that says CompoundInterest and has a different font and fontsize.  
		Label title = new Label();
		title.setText("CompoundInterest");
		title.setFont(new Font("Comfortaa", 20));
		// adds the label over a few grid spaces
		pane.add(title,0,0,2,1);
		
		// adds a label start amount to the grid
		pane.add(new Label("Start amount"),0,1);
		// a textbox that the user type the start amount.
		final TextField start = new TextField();
		pane.add(start,1,1);
		
		pane.add(new Label("Interest"),0,2);
		// a textbox that the user types the interest
		final TextField interest = new TextField();
		pane.add(interest, 1,2);
		
		pane.add(new Label("Number of Years"),0,3);
		// a textbox that the user types the number of years
		final TextField years = new TextField();
		pane.add(years, 1,3);
		
		// a button that that triggers an event
		Button calc = new Button("Calculate");
		pane.add(calc,0,4);
		
		// the button trigger event 
		calc.setOnAction(e -> {
			// checks that any of the text boxes is not empty
			if (start.getText().equals("") || interest.getText().equals("") || years.getText().equals("")) {
				// displays a error messageBox that warns the user to that all fields must be filled  
				Alert error = new Alert(AlertType.ERROR, "Fill in all fields", new ButtonType("OK"));
				error.showAndWait();;
			}
			else {
				// calculates the coumpound interset.
				int startint =	Integer.parseInt(start.getText());
				double interestint = 1 + Double.parseDouble(interest.getText()) /100;
				int yearsint =  Integer.parseInt(years.getText());
				double total = startint*Math.pow(interestint,yearsint);
				// rounds the answer and then displays it in a new label.
				total = Math.round(total);
				String str = "In total that will be: " + total; 
				pane.add(new Label(str),0,5);
			}
		});
		
		// makes a scene with the pane in it and displays that scene 
		Scene scene = new Scene(pane,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
	


