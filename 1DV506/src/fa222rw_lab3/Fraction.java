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

	// konstruktor 2 d�r anv�ndaren har best�mt v�rden
	public Fraction(int numerator, int denominator) {
		if(denominator != 0) {
		this.numerator = numerator;
		this.denominator = denominator;
		}
		else {
			System.out.println("N�mnaren kan ej vara 0");
		}

	}

	// tar t�ljaren
	public int getNumerator() {
		return numerator;
	}
	
	// tar n�mnaren
	public int getdenominator() {
		return denominator;
	}

	// kollar ifall n�got av v�rdena �r negarivt 
	public boolean isnegative() {
		if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) {
			return true;
		}
		return false;
	}
	
	// (t1/n1)+(t2/n2) = (t1*n2+t2*n1)/(n1*n2) 
	// Adderar tv� br�k
	public Fraction add(Fraction f) {
		// om en av n�mnaren �r noll kan inte denna koden k�ras
		if (denominator != 0 && f.denominator != 0) {
			//om de �r n�mnaren �r lika stor
			if(denominator == f.denominator) {
				Fraction frac = new Fraction(f.numerator + numerator , denominator);
				frac.smallestDivisor();
				return frac;
			}
			// g�r det till lika n�mnare f�r att sedan addera t�ljarna
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
	// subtrahera br�ken
	public Fraction subtract(Fraction f) {
		// om en av n�mnaren �r noll kan inte denna koden k�ras
		if (denominator != 0 && f.denominator != 0) {
			//om de �r n�mnaren �r lika stor
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
	// multiplisera br�ken
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
	// dividera br�ken
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
	
	// �r de b�da br�ken lika return true. Annars return false
	public boolean isEqualTo(Fraction frac) {
		if (frac.numerator == numerator && frac.denominator == denominator ) {
			return true;
		}
		return false;
	}
	
	// tar fram den st�rsta gemensama delare. Har tagits ur boken av Liang.
	private int bigestDivisor(int n ,int d ) {
		int dev = 1;
		for (int i = 1; i <= n && i<= d; i++) {
			if (n % i == 0 && d % i == 0 ) {
				dev = i;
			}
		}
		return dev;
	}
	
	// tar den st�rsta gemensam n�mnaren och delar med br�ket.
	// F�r att f� det maximalt f�renklat 
	private void smallestDivisor() {
		int dev = bigestDivisor(numerator, denominator);
		numerator /= dev;
		denominator /= dev;
	}
	
	// l�gger in br�ket till en string 
	public String toString() {
		String str = numerator + "/" + denominator;
		return str;
	}

}
