/**
 * 
 */
package piCal;

/**
 * @author Fredrik
 *
 */
public class Block {
	private int m;
	private int v;
	private int w;
	private int x;
	
	public Block(int m, int v, int w, int x) {
		this.m = m;
		this.v = v;
		this.w = w;
		this.x = x;	
	}
	public int getX() {
		return x;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public boolean collide(Block b) {
		return this.x + this.w >= b.x;
	}
	public void velocity(Block b) {
		int tmp = this.v;
		this.v = ((this.m-b.m)/(this.m + b.m))*this.v+ ((2*b.m)/(this.m + b.m))*b.v;
		b.v = ((b.m-this.m)/(this.m + b.m))*b.v + ((2*this.m)/(this.m + b.m))*tmp;
	}
	public boolean wallHit() {
		return this.x <= 0;
	}
	public void revV() {
		this.v = -this.v;
	}
	public void update() {
		this.x += this.v;
	}
}
