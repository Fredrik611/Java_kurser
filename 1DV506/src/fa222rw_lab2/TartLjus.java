/**
 * 
 */
package fa222rw_lab2;

/**
 * @author Fredrik
 *
 */
public class TartLjus {

	
	public static void main(String[] args) {
		int box = 0;
		int totbox = 0;
		int ljus = 0;
		
		for (int i = 0; i <= 100; i++) {
			
			if (ljus - i > 0) {
				ljus -= i;
			}
			else {
				// lägger till fler boxar tills ljus är större än åldern
				while (ljus < i) {
					ljus += 24;
					box++;
					totbox++;
				}
				ljus -= i;
				System.out.println("Before birthday " + i + " buy " + box );
			}
			box = 0;
		}
		System.out.println("Totalt antal paket: " + totbox + " Remaining candels: " + ljus);
	}
}


