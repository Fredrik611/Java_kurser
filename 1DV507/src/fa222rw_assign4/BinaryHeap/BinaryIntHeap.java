/**
 * 
 */
package fa222rw_assign4.BinaryHeap;

/**
 * @author Fredrik
 *
 */
public class BinaryIntHeap {
	private int[] arr = new int[8];
	private int size = 0;
	public BinaryIntHeap() {
	}
	// Constructs an empty heap
	public void insert(int n) {
		size++;
		if (size >= arr.length) {
			resize();
		}
		arr[size] = n;
		shiftUp(size);	
	} 
	
	private void shiftUp(int index) {
		int parent = index/2;
		if (arr[index] > arr[parent] && index != 1) {
			int tmp = arr[index];
			arr[index] = arr[parent];
			arr[parent] = tmp;
			shiftUp(parent);
		}
	}
	private void resize() {
		int[] tmparr = new int[arr.length*2];
		for (int i = 0; i < arr.length; i++) {
			tmparr[i] = arr[i];
		}
		arr = tmparr;
	}
	public int pullHighest() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		else {
			int tmp = arr[1];
			arr[1] = arr[size];
			size--;
			shiftDown(1);
			return tmp;
		}
	}    // Return and remove element with highest priority
	private void shiftDown(int index) {
		int tmp;
		int left = index*2;
		int right = index*2+1;
		if (arr[left] >= arr[right] && arr[index] < arr[left]) {
			 tmp = arr[index];
			 arr[index] = arr[left];
			 arr[left] = tmp;
			 shiftDown(left);
		}
		else if (arr[right] > arr[left] && arr[index] < arr[right]) {
			tmp = arr[index];
			arr[index] = arr[right];
			arr[right] = tmp;
			shiftDown(right);
		}
	}
	public String toString() {
		String str = "";
		for (int i = 1; i <= size; i++) {
			str += arr[i] + " ";
		}
		return str;
	}
	public int size() {
		return size;
	}        // Current heap size
	public boolean isEmpty() {
		return size == 0;
	}
	
}
