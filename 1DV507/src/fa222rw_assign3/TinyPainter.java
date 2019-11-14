/**
 * 
 */
package fa222rw_assign3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * @author Fredrik
 *
 */
public class TinyPainter extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// hbox with two comboboxes and a Colorpicker. Sits at the top.
		HBox combo = new HBox();
		// have all the types
		final ComboBox<String> type = new ComboBox<>();
		// handles the sizes
		final ComboBox<Integer> size = new ComboBox<>();
		// handles the color
		final ColorPicker colorPicker = new ColorPicker();
		
		
		// adding the combo boxes to the hbox
		combo.getChildren().addAll(type,size,colorPicker);
		combo.setPadding(new Insets(10));
		combo.setPrefHeight(10);
		
		// adds the drawingtools to the combobox 
		type.getItems().addAll("Line" , "Dot" , "Rectangle" , "Circle");
		
		// adds the size to the combobox
		for (int i = 1; i <= 40; i += 3) {
			size.getItems().add(i);
		}
		
		// set's the first option as default. 
		type.getSelectionModel().selectFirst();
		size.getSelectionModel().selectFirst();
		
		// canvas of that is drawn on.
		Canvas canvas = new Canvas(500,700);
		// used to draw on the canvas. It works by draw calls to canvas using a buffer.
		GraphicsContext gp;
		gp = canvas.getGraphicsContext2D();
		
		// the different drawing tools.
		Line line = new Line();
		Rectangle rec = new Rectangle();
		Circle circ = new Circle();
		
		// when mouse is pressed this code runs
		canvas.setOnMousePressed(e-> {
			// if line is selected.
			if (type.getValue().equals("Line")) {
				// sets the color to gp 
				gp.setStroke(colorPicker.getValue());
				// sets the color to gp
				gp.setLineWidth(size.getValue());
				
				// registers the mouse coordinates.
                line.setStartX(e.getX());
                line.setStartY(e.getY());
                
			}
			// if the rectangle option is selected
			else if (type.getValue().equals("Rectangle")) {
				// sets the color to gp. Both the border and the center. 
				gp.setStroke(colorPicker.getValue());
				gp.setFill(colorPicker.getValue());
				// registers the mouse coordinates.
				rec.setX(e.getX());
				rec.setY(e.getY());
			}
			else if(type.getValue().equals("Circle")) {
				// sets the color to gp. Both the border and the center.
				gp.setStroke(colorPicker.getValue());
                gp.setFill(colorPicker.getValue());
                // registers the mouse coordinates.
                circ.setCenterX(e.getX());
                circ.setCenterY(e.getY());
			}
			else if(type.getValue().equals("Dot")) {
				// sets the color to gp. Both the border and the center.
				gp.setStroke(colorPicker.getValue());
				gp.setFill(colorPicker.getValue());
				// registers the mouse coordinates
				rec.setX(e.getX());
				rec.setY(e.getY());
				// renders the rectangle to the canvas.
				gp.strokeRect(rec.getX(),rec.getY(),(double)size.getValue(),(double)size.getValue());
				gp.fillRect(rec.getX(),rec.getY(),(double)size.getValue(),(double)size.getValue());
			}
		});
		// this code runs on release 
		canvas.setOnMouseReleased(e->{
			// if line is selected.
			if(type.getValue().equals("Line")) {
				// registers the mouse coordinates. Where line shall stop
				line.setEndX(e.getX());
				line.setEndY(e.getY());
				// renders the line with start and end coordinates. 
				gp.strokeLine(line.getStartX(), line.getStartY(),line.getEndX(), line.getEndY());
			}
			// If the rectangle option is selected
			else if(type.getValue().equals("Rectangle")) {
				// this makes that width is never negative. 
				if (e.getX() < rec.getX()) 
					rec.setWidth(rec.getX()- e.getX());
				else
					rec.setWidth(e.getX()- rec.getX());
				
				// this makes that height is never negative. 
				if (e.getY() < rec.getY()) 
					rec.setHeight(rec.getY()- e.getY());
				else
					rec.setHeight(e.getY()- rec.getY());
				
				// makes that where your mousebutton is when released the rectangle is rendered to the tip of the mouse
				if (rec.getX() > e.getX()) {
					rec.setX(e.getX());
				}
				if (rec.getY() > e.getY()) {
					rec.setY(e.getY());
				}
				// renders the rectangle both the border and the center. 
				gp.strokeRect(rec.getX(), rec.getY(), rec.getWidth(), rec.getHeight());
				gp.fillRect(rec.getX(), rec.getY(), rec.getWidth(), rec.getHeight());
			
			}
			// if the circle option is selected
			else if(type.getValue().equals("Circle")) {
				// this makes that radius is never negative.
				if (e.getX() < circ.getCenterX()) 
					circ.setRadius(circ.getCenterX()- e.getX());
				else
					circ.setRadius(e.getX()- circ.getCenterX());
				
				// makes that where your mousebutton is when released the rectangle is rendered to the tip of the mouse
				if (circ.getCenterX() > e.getX()) {
					circ.setCenterX(e.getX());
				}
				if (circ.getCenterY() > e.getY()) {
					circ.setCenterY(e.getY());
				}
				
				// renders the circle both the border and the center.
				gp.strokeOval(circ.getCenterX(), circ.getCenterY(), circ.getRadius(), circ.getRadius());
				gp.fillOval(circ.getCenterX(), circ.getCenterY(), circ.getRadius(), circ.getRadius());
			}
		});
		// adds all combo hbox to the top and canvas to the center
		BorderPane pane = new BorderPane();
		pane.setTop(combo);
		pane.setCenter(canvas);
		// set the scene. 
		Scene prim = new Scene(pane, 700,700);
		arg0.setScene(prim);
		arg0.setTitle("Tiny painter");
		arg0.show();
	}
	

}
