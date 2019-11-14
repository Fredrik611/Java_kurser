/**
 * 
 */
package fa222rw_lab3;

/**
 * @author Fredrik
 *
 */
public class Fraction {
	private int numerator;
	private int denominator;

	// konstruktor
	public Fraction() {
		numerator = 1;
		denominator = 1;
	}

	// konstruktor 2 där användaren har bestämt värden
	public Fraction(int numerator, int denominator) {
		if(denominator != 0) {
		this.numerator = numerator;
		this.denominator = denominator;
		}
		else {
			System.out.println("Nämnaren kan ej vara 0");
		}

	}

	// tar täljaren
	public int getNumerator() {
		return numerator;
	}
	
	// tar nämnaren
	public int getdenominator() {
		return denominator;
	}

	// kollar ifall något av värdena är negarivt 
	public boolean isnegative() {
		if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) {
			return true;
		}
		return false;
	}
	
	// (t1/n1)+(t2/n2) = (t1*n2+t2*n1)/(n1*n2) 
	// Adderar två bråk
	public Fraction add(Fraction f) {
		// om en av nämnaren är noll kan inte denna koden köras
		if (denominator != 0 && f.denominator != 0) {
			//om de är nämnaren är lika stor
			if(denominator == f.denominator) {
				Fraction frac = new Fraction(f.numerator + numerator , denominator);
				frac.smallestDivisor();
				return frac;
			}
			// gör det till lika nämnare för att sedan addera täljarna
			int n = (numerator * f.denominator) +(f.numerator * denominator);
			int d = (denominator*f.denominator);
			Fraction frac = new Fraction(n,d);
			frac.smallestDivisor();
			return frac;
		}
		else {
			System.out.println("can't add with 0 in the denominator");
			return this;
		}
	}
	
	// (t1/n1)-(t2/n2) = (t1*n2-t2*n1)/(n1*n2) 
	// subtrahera bråken
	public Fraction subtract(Fraction f) {
		// om en av nämnaren är noll kan inte denna koden köras
		if (denominator != 0 && f.denominator != 0) {
			//om de är nämnaren är lika stor
			if(denominator == f.denominator) {
				Fraction frac = new Fraction(f.numerator - numerator , denominator);
				frac.smallestDivisor();
				return frac;
			}
			
			int n = (numerator * f.denominator) -(f.numerator * denominator);
			int d = (denominator*f.denominator);
			Fraction frac = new Fraction(n,d);
			frac.smallestDivisor();
			return frac;
		}
		else {
			System.out.println("can't add with 0 in the denominator");
			return this;
		}
	}
	
	// (t1/n1)*(t2/n2) = (t1*t2)/(n1*n2)
	// multiplisera bråken
	public Fraction mulitply(Fraction f) {
		if (denominator != 0 && f.denominator != 0) {
			Fraction frac = new Fraction(f.numerator * numerator,f.denominator * denominator);
			frac.smallestDivisor();
			return frac;
		}
		else {
			System.out.println("can't multiply with 0 in the denominator");
			return this;
		}
	}
	
	// (t1/n1)/(t2/n2) = (t1*n2)/(t2*n1)
	// dividera bråken
	public Fraction divide(Fraction f) {
		if (denominator != 0 && f.denominator != 0) {
		Fraction frac = new Fraction(f.numerator*f.denominator , denominator * f.numerator);
		frac.smallestDivisor();
		return frac;
		}
		else {
			System.out.println("can't divide with 0 in the denominator");
			return this;
		}
	}
	
	// är de båda bråken lika return true. Annars return false
	public boolean isEqualTo(Fraction frac) {
		if (frac.numerator == numerator && frac.denominator == denominator ) {
			return true;
		}
		return false;
	}
	
	// tar fram den största gemensama delare. Har tagits ur boken av Liang.
	private int bigestDivisor(int n ,int d ) {
		int dev = 1;
		for (int i = 1; i <= n && i<= d; i++) {
			if (n % i == 0 && d % i == 0 ) {
				dev = i;
			}
		}
		return dev;
	}
	
	// tar den största gemensam nämnaren och delar med bråket.
	// För att få det maximalt förenklat 
	private void smallestDivisor() {
		int dev = bigestDivisor(numerator, denominator);
		numerator /= dev;
		denominator /= dev;
	}
	
	// lägger in bråket till en string 
	public String toString() {
		String str = numerator + "/" + denominator;
		return str;
	}

}
