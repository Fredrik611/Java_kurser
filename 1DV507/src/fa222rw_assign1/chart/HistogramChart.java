/**
 * 
 */
package fa222rw_assign1.chart;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler.LegendPosition;


/**
 * @author Fredrik
 *
 */
public class HistogramChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] hist = histogram(args);
		
		// Create Chart
		CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Histogram").xAxisTitle("Interval").yAxisTitle("Number of times").build();

		// Customize Chart
		chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
		chart.getStyler().setHasAnnotations(true);
		// Adds values to the graf 
		chart.addSeries("Histogram", new int[] {1,2,3,4,5,6,7,8,9,10}, hist);
		
		// Render the graf
		new SwingWrapper<CategoryChart>(chart).displayChart();
		
		// Create pie Chart
		 PieChart pieChart = new PieChartBuilder().width(800).height(600).title("Histogram Pie chart").build();
		 for (int i = 0; i < hist.length; i++) {
			 // adds all the values to the pie chart
			 pieChart.addSeries( i*1 +"1 - "+(i+1) + "0", hist[i]);
		}
		 // Render the graf
		 new SwingWrapper<PieChart>(pieChart).displayChart();
	}
	
	
	public static int[] histogram(String[] args) {
		int[] histogram = {0,0,0,0,0,0,0,0,0,0}; // array with the different intervals
		int number = 0;							 // just a temporary value
		
		String temp = "";						 // a temporary string
		try {
			File fil = new File(args[0]); 
			Scanner scan = new Scanner(fil);
			
			while (scan.hasNext()) {
				
				temp = scan.nextLine();
				if (temp.length() <= 0) { // check so the line isn't empty
					scan.close();
					throw new InputMismatchException("Text file is contains invilid data");
				}
				
				for (int i = 0; i < temp.length(); i++) { // checks so there isn't something that is not a number
					if (!(temp.charAt(i)>= '0' && temp.charAt(i) <= '9' ) )  {
						scan.close();
						throw new InputMismatchException("Text file is contains invilid data"); // if there is it throws an exception
					}
				}
				
				number = Integer.parseInt(temp); // parses the value to an int
				
				for (int i = 0; i < histogram.length; i++) {
					// checks if the number is in a interval
					if (number >= i*10+1 && number <= (i+1)*10) {
						
						histogram[i]++;
					}
					
				}

			}
			
			scan.close();

		} 
		// if the file was not found
		catch (IOException e) {
			
			e.printStackTrace();
		}
		// if there are a string in the file
		catch (InputMismatchException e) {
			System.out.print(e.getMessage());
		}
		return histogram;
		
		

	}

}
