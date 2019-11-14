package fa222rw_assign3.RunningSanta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RunningSanta extends Application {
	//Santa's running speed
	static int x_speed = 5;
	// Used for sprite uppdates. To keep track of what sprit is to be shown.
	static int imagecnt = 1;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// gets all the images of santa running in one array
		ArrayList<Image> run = setRunImages();
		// Imageview of santa
		final ImageView santaview = new ImageView(run.get(0));
		// setting santa so he isn't to large. 
		santaview.setFitWidth(150);
		santaview.setPreserveRatio(true);
		// santa's start position
		santaview.setX(0);
		santaview.setY(400);
		// setting santa's rotationaxis to y axis so when he turns around we can just rotate his sprite 180 degrees.
		santaview.setRotationAxis(Rotate.Y_AXIS);

		// pane where everything is in.
		final Pane root = new Pane();
		
		// adding santa to the pane
			root.getChildren().add(santaview);
			
		// the Image of the backgorund getting set. 
		Image back = new Image(new FileInputStream("C:\\Users\\Fredrik\\eclipse-workspace\\java_kurser\\1DV507\\src\\fa222rw_assign3\\RunningSanta\\BG\\BG.png"));
		BackgroundImage backgroundImage = new BackgroundImage(back, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
		Background background = new Background(backgroundImage);
		root.setBackground(background);
		
		
		
		// The keyframe uppdates every 10 millis.
		KeyFrame k = new KeyFrame(Duration.millis(10), event -> {
			
			// uppdate santa's position with x_speed which is 5.
			santaview.setX(santaview.getX() +x_speed);
			
			// uppdate the image of santa. 
			santaview.setImage(run.get(imagecnt++));
			// when there are no more spites to go thru it resets.
			if (imagecnt == 11) {
				imagecnt = 0;
			}
			
			// when santa's hit one of the bordes he turns around.
			if (santaview.getX()<= 0 || santaview.getX() >= 1000 - santaview.getFitWidth()) {
				 x_speed = -x_speed;
			}
			// this is which way santa is facing. So facing the right way. 
			if (x_speed < 0 ) 
				 santaview.setRotate(180);
			else
				 santaview.setRotate(0);
		});
		// timeline drives the keyframe. It keeps going until the window is closed.
		Timeline t = new Timeline(k);
		t.setCycleCount(Timeline.INDEFINITE);
		t.play();
		
		// get's the images of the ground santa is running on. 
		ArrayList<ImageView> ground = setGroundImages();
		
		// the hbox that all the ground images i placed in. 
		HBox box = new HBox();
		// adding all the ground to hbox.
		for (ImageView i : ground) {
			box.getChildren().add(i);
		}
		// adding the hboc to root.
		root.getChildren().add(box);
		// padding it so it's at the bottom. 
		box.setPadding(new Insets(490,0,0,0));
		
		// scene with the size 1000x600
		Scene scene = new Scene(root,1000,600);
		arg0.setScene(scene);
		arg0.show();

		
	}
	
	private ArrayList<Image> setRunImages() {
		ArrayList<Image> temp = new ArrayList<Image>();
		for (int i = 1; i <= 11; i++) {
			try {
				temp.add(new Image(new FileInputStream("C:\\Users\\Fredrik\\eclipse-workspace\\java_kurser\\1DV507\\src\\fa222rw_assign3\\RunningSanta\\png\\Run ("+i+").png")));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return temp;
	}
	private ArrayList<ImageView> setGroundImages(){
		ArrayList<ImageView> temp = new ArrayList();
		try {
			temp.add(new ImageView(new Image(new FileInputStream("C:\\Users\\Fredrik\\eclipse-workspace\\java_kurser\\1DV507\\src\\fa222rw_assign3\\RunningSanta\\Tiles\\1.png"))));
			for (int i = 0; i < 6; i++) {
				temp.add(new ImageView(new Image(new FileInputStream("C:\\Users\\Fredrik\\eclipse-workspace\\java_kurser\\1DV507\\src\\fa222rw_assign3\\RunningSanta\\Tiles\\2.png"))));
			}
			temp.add(new ImageView(new Image(new FileInputStream("C:\\Users\\Fredrik\\eclipse-workspace\\java_kurser\\1DV507\\src\\fa222rw_assign3\\RunningSanta\\Tiles\\3.png"))));
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return temp;
	}
}
