package fa222rw_assign2;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Snowman extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		Pane snowman = new Pane();
		
		// a rectangle with the color blue with a height 350 and width 640.
		Rectangle  sky = new Rectangle();
		sky.setHeight(350);
		sky.setWidth(640);
		sky.setFill(Color.BLUE);
		
		// a circle with the color yellow with a diameter 60. that represent the sun.
		Circle sun = new Circle(560, 100, 60);
		sun.setFill(Color.YELLOW);
		
		// a circle with the color white and a diameter 50. that represent the the bottom part ball of the snowman.
		Circle ball1 = new Circle(320, 300, 50);
		ball1.setFill(Color.WHITE);
		// a circle with the color white and a diameter 40. that represent the the middle part ball of the snowman. 
		Circle ball2 = new Circle(320, 220, 40);
		ball2.setFill(Color.WHITE);
		// a circle with the color white and a diameter 30. that represent the the top part ball of the snowman.
		Circle ball3 = new Circle(320, 160, 30);
		ball3.setFill(Color.WHITE);
		
		// three circles with the color black and diameter 5. that represent the buttons on the snowman
		Circle button1 = new Circle(320, 200 , 5);
		button1.setFill(Color.BLACK);
		Circle button2 = new Circle(320, 220 , 5);
		button2.setFill(Color.BLACK);
		Circle button3 = new Circle(320, 240 , 5);
		button3.setFill(Color.BLACK);
		
		// two circles with the color black and diameter 4. That represent the eyes of the snowman
		Circle eye1 = new Circle(310, 156, 4);
		Circle eye2 = new Circle(330, 156, 4);

		// a Line that represent the mouth of the snowman
		Line mouth = new Line(330,175,310,175);
		mouth.setStrokeWidth(3.0);
		
		// puts all the shapes in the the group
		snowman.getChildren().addAll(sky, sun, ball1, ball2, ball3, button1, button2, button3, eye1, eye2, mouth);
		// a scene that put the group in it 
		Scene scene = new Scene(snowman, 640, 480);
		primaryStage.setTitle("Snowman");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

}
