/**
 * 
 */
package fa222rw_assign1.chart;

import java.util.ArrayList;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

/**
 * @author Fredrik
 *
 */
public class SinMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// builds the chart 
		XYChart chart = new XYChartBuilder().width(800).height((int) (2*Math.PI)).build(); 
		
		// arrays with the x and y values
		ArrayList<Double> X = new ArrayList<Double>();
		ArrayList<Double> Y = new ArrayList<Double>();
		
		// makes the values and adds to all both of the arrays. 
		for (double i = 0; i < 2*Math.PI; i += 0.0001) {
			X.add(i);
			double yValue = (1 + i/Math.PI)*Math.cos(i)*Math.cos(40*i);
			Y.add(yValue);
		}
		// adds to the chart
		chart.addSeries("Gaussian Blob", X, Y);
		// Then renders it. 
	    new SwingWrapper(chart).displayChart();

	}

}
