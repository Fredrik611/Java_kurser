/**
 * 
 */
package fa222rw_lab3;

/**
 * @author Fredrik
 *
 */
public class FractionMain {
	public static void main(String[] args) {
		// skapar två bråk
		Fraction f1 = new Fraction(25,125);
		Fraction f2 = new Fraction(1,100);
		
		// kollar ifall f1 är negativt
		System.out.println("Is the fraction negative: " + f1.isnegative());
		System.out.println("______________");
		// kollar om f1 och f2 är samma bråk
		System.out.println("Is " +f1.toString()+" Equal to " + f2.toString() + " : "+ f1.isEqualTo(f2));
		
		// adderar f1 och f2. Sparar det i f3
		Fraction f3 = f1.add(f2);
		System.out.println("______________");
		System.out.println(f1.toString() + " plus " +f2.toString() +" is equal to "+f3.toString());
		
		// subtrahera f1 och f2. Sparar det i f4 
		Fraction f4 = f1.subtract(f2);
		System.out.println("______________");
		System.out.println(f1.toString() + " minus " +f2.toString() +" is equal to "+f4.toString());
		
		// multiplisera f1 och f2. Sparar det i f5 
		Fraction f5 = f1.mulitply(f2);
		System.out.println("______________");
		System.out.println(f1.toString() + " multiplied by " + f2.toString() + " is equal to " + f5.toString()); 
		
		// dividera f1 och f2. Sparar det i f6 
		System.out.println("______________");
		Fraction f6 = f1.divide(f2);
		System.out.println(f1.toString() + " divided by " + f2.toString() + " is equal to " + f6.toString());
	}
}
