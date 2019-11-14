package fa222rw_assign2.yathzee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Yathzee extends Application{
	// roll count
	private int cnt = 0;
	// keeps track of what 
	private int[] result = new int[5];
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		// random function for dice roll
		Random rand = new Random();
		
		GridPane pane = new GridPane();
		//Styling things 
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(20,20,20,20));
		pane.setHgap(20);
		pane.setVgap(10);
		
		// dice image
		Image dice = new Image(new FileInputStream("C:\\Users\\Fredrik\\eclipse-workspace\\java_kurser\\1DV507\\src\\fa222rw_assign2\\yathzee\\dice-png.png"));
		// ImageView that shows one of the faces of the dice
		ImageView dice1 = new ImageView(dice);
		// styling for the image. 
		dice1.setViewport(new Rectangle2D(12,11,200,200));
		dice1.setFitWidth(100);
		dice1.setPreserveRatio(true);
		
		// same as dice1
		ImageView dice2 = new ImageView(dice);
		dice2.setViewport(new Rectangle2D(235,11,200,200));
		dice2.setFitWidth(100);
		dice2.setPreserveRatio(true);
		
		// same as dice1
		ImageView dice3 = new ImageView(dice);
		dice3.setViewport(new Rectangle2D(458,11,200,200));
		dice3.setFitWidth(100);
		dice3.setPreserveRatio(true);
		
		// same as dice1
		ImageView dice4 = new ImageView(dice);
		dice4.setViewport(new Rectangle2D(12,233,200,200));
		dice4.setFitWidth(100);
		dice4.setPreserveRatio(true);
		
		// same as dice1
		ImageView dice5 = new ImageView(dice);
		dice5.setViewport(new Rectangle2D(237,233,200,200));
		dice5.setFitWidth(100);
		dice5.setPreserveRatio(true);
		
		// adds all the ImageView object to the gridpane
		pane.add(dice1,0,0);
		pane.add(dice2,1,0);
		pane.add(dice3,2,0);
		pane.add(dice4,3,0);
		pane.add(dice5,4,0);
		
		// CheckBoxes that that starts of being disable until the first roll is made.
		// Used to save a dice roll
		CheckBox keep1 = new CheckBox();
		keep1.setDisable(true);
		CheckBox keep2 = new CheckBox();
		keep2.setDisable(true);
		CheckBox keep3 = new CheckBox();
		keep3.setDisable(true);
		CheckBox keep4 = new CheckBox();
		keep4.setDisable(true);
		CheckBox keep5 = new CheckBox();
		keep5.setDisable(true);
		// adds the checkbox to the grid under the corresponding dice. 
		pane.add(keep1,0,1);
		pane.add(keep2,1,1);
		pane.add(keep3,2,1);
		pane.add(keep4,3,1);
		pane.add(keep5,4,1);
		
		// button used to roll the dice
		Button roll = new Button("Roll");
		pane.add(roll,0,2);
		
		// text box used for information like how many rolls you have left and the later displays the result.
		Text txtbox = new Text("You have 3 roll(s) left!");
		pane.add(txtbox,1,2);

		// Code starts when button is pressed
		roll.setOnAction(e -> {
			// if it is the first roll makes all the checkboxes not disable 
			if (cnt == 0) {
				keep1.setDisable(false);
				keep2.setDisable(false);
				keep3.setDisable(false);
				keep4.setDisable(false);
				keep5.setDisable(false);
			}
			
			cnt++;
			
			// if the check boxes is not selected the roll the dice
			if (!keep1.isSelected()) {
				dice1.setViewport(uppdateImage(1+rand.nextInt(6), 1));				
			}

			if (!keep2.isSelected()) {
				dice2.setViewport(uppdateImage(1+rand.nextInt(6),2));
			}
			
			if (!keep3.isSelected()) {
				dice3.setViewport(uppdateImage(1+rand.nextInt(6),3));
			}
			
			if (!keep4.isSelected()) {
				dice4.setViewport(uppdateImage(1+rand.nextInt(6),4));
			}
			
			if (!keep5.isSelected()) {
				dice5.setViewport(uppdateImage(1+rand.nextInt(6),5));
			}
			
			// if the last roll is made then disable the button and show result.
			if (cnt == 3) {
				roll.setDisable(true);
				showResult(txtbox);
			}
			// displays the remaining rolls.
			else {
				txtbox.setText("You have " + (3-cnt) + "roll(s) left!");
			}
			
		});
		// builds upp a scene with the pane and then show it on the screen.
		Scene scene = new Scene(pane,800,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Yahtzee");
		primaryStage.show();
	}
	
	private void showResult(Text txtbox) {
		// a method that check if their is any kind of pair. 
		int pair = pairOfSomeKind();
		
		// if all the dice is the same run this code
		if(pair == 5) {
			txtbox.setText("Yahtzee!");
		}
		// if four out of the five dices is the same run this code.
		else if(pair == 4) {
			txtbox.setText("Four of a kind pair");
		}
		// if three out of the five dices is the same and the other two is also the same run this code.
		else if(pair == 3 && isFullHouse()){
			txtbox.setText("Full House!");
		}
		// if three out of five dices is the same run this code.
		else if(pair == 3) {
			txtbox.setText("Three of a kind pair");
		}
		// if it's a large straight run this code 
		else if(straight(2)) {
			txtbox.setText("Large Straight");
		}
		// if it's a small straight run this code
		else if(straight(1)) {
			txtbox.setText("Small Straight");
		}
		// if there is a pair of two run this code.
		else if(pair == 2) {
			txtbox.setText("Two of a kind pair");
		}
	}
	

	private boolean straight(int straight) {
		// sort the result array
		Arrays.sort(result);
		// than it checks that is i + 1 or 2 (depending on which straight it checking for)is equal to the array index i  
		for (int i = 0; i < result.length; i++) {
			// if it not the same value return false
			if (i+straight != result[i]) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isFullHouse() {
		// temp count that keeps track of all how many their is that is the same 
		int tmpcnt = 0;
		// loops through 1-6 and checks if their is two of a kind. 
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < result.length; j++) {
				if (i == result[j]) {
					tmpcnt++;
				}
			}
			// if their is return true
			if (tmpcnt == 2) {
				return true;
			}
			tmpcnt = 0;
		}
		return false;
	}
	// checks for the largest kind of pair in the array 
	private int pairOfSomeKind() {
		int tmp = 0;
		int largestPair = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < result.length; j++) {
				if (i == result[j]) {
					tmp++;
				}
			}
			// if their is more of a kind replace the largestpair with tmp
			if(tmp > largestPair) {
				largestPair = tmp;
			}
			// and reset the tmp
			tmp = 0;
		}
		return largestPair;
	}
	
	// code used when a roll event is happening 
	private Rectangle2D uppdateImage(int diceface, int diceindex) {
		// the new number that's comes in and places it in the array.
		result[diceindex-1] = diceface;
		// a switch case that takes the number you rolled and returns a new rectangle2d that highlights that diceface in the picture
		switch (diceface) {
		case 1:
			return new Rectangle2D(12,11,200,200); 
			
		case 2:
			return new Rectangle2D(235,11,200,200);

		case 3:
			return new Rectangle2D(458,11,200,200);
		
		case 4:
			return new Rectangle2D(12,233,200,200);
		case 5: 
			return new Rectangle2D(237,233,200,200);
		
		case 6:
			return new Rectangle2D(458,233,200,200);
		default:
			return null;
		}
		
	}
}
