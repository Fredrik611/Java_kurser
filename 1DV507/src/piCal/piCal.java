/**
 * 
 */
package piCal;

/**
 * @author Fredrik
 *
 */
public class piCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cnt = 0;
		int digits = 2;
		int m2 = (int) Math.pow(100, digits-1);
		Block b1 = new Block(m2,-1,1,50);
		Block b2 = new Block(1,0,1,30);
		
		for (int i = 0; i < 10000; i++) {
			b1.update();
			b2.update();
			if(b2.collide(b1)) {
				b2.velocity(b1);
				cnt++;
			}
			if(b2.wallHit()) {
				b2.revV();
				cnt++;
			}
			System.out.println("b1: " + b1.getX() + " b2: " + b2.getX());
			
		}
		System.out.println(cnt);
	}

}
