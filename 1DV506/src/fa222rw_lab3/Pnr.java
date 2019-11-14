/**
 * 
 */
package fa222rw_lab3;

/**
 * @author Fredrik
 *
 */
public class Pnr {

	public static void main(String[] args) {
		String pnr = "990802-8179";
		String pnr2 = "990802-8179";
		// 1

		System.out.println("Fodelse datum: " + getFirstPart(pnr));
		System.out.println("Fyra sista " + getSecondPart(pnr));

		// 2
		System.out.println("is female: " + isFemale(pnr));

		// 3
		System.out.println("Are Equal: " + areEqual(pnr, pnr2));
		
		//4 
		System.out.println("is correct: " + isCorrect(pnr));
	}

	// 1
	// tar de fyra sista
	private static int getSecondPart(String pnr) {

		int secondPart = Integer.parseInt(pnr.substring(7, 11));

		return secondPart;
	}
	
	// tar fördelsedatum
	private static int getFirstPart(String pnr) {

		int FirstPart = Integer.parseInt(pnr.substring(0, 6));

		return FirstPart;
	}

	// 2
	// är det kviniligt pnr
	private static boolean isFemale(String pnr) {
		if (pnr.charAt(9) % 2 == 0) {
			return true;
		}
		return false;
	}

	// 3
	// är det samma 
	private static boolean areEqual(String pnr1, String pnr2) {
		if(pnr1.length() == pnr2.length()){
			for (int i = 0; i < pnr1.length(); i++) {
				if (pnr1.charAt(i) != pnr2.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	//4 
	private static boolean isCorrect(String pnr) {
		// en array där alla tal sparas
		int[] number = new int[9];
		int sum = 0;
		int temp = 0;
		// hämtar de olika delarna i pnr
		int firstpart = getFirstPart(pnr);
		int secondpart = getSecondPart(pnr);
		// lägger in den första delen i arrayn
		for (int i = 0; i < number.length-3; i++) {
			number[i] = (int) (firstpart / Math.pow(10, 5-i));
			firstpart -= (int) (number[i] * Math.pow(10, 5-i));
		}
		// lägger in den andra delen i arrayn
		for (int i = number.length-4 ; i < number.length; i++) {
			number[i] = (int) (secondpart / Math.pow(10, 8-i));
			secondpart -= (int) (number[i] * Math.pow(10, 8-i));
		}
		
		// gångrar varanan med element i arrayn med 2
		for (int i = 0 ; i < number.length ; i++) {
			if ( number[i] % 2 == 0 || i == 0) {
				number[i] *= 2;
			}
			
		}
		// kollar siffersumman av alla talen 
		 for (int i : number) {
			
			if (i/10 > 0) {
				temp = i/10;
				sum += temp;
				i -= temp*10;
				sum += i;
			}
			else {
				sum += i;
			}
		}
		 // kollar det sista talet i de sista fyra om de är lika med varandra.
		if (sum % 10 == getSecondPart(pnr) % 10) {
			return true;
		}
		
		return false;
	}
}
