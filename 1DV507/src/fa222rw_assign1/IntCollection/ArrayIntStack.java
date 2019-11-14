package fa222rw_assign1.IntCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack{

	public ArrayIntStack() {
		
	}

	@Override
	public void push(int n) {
		size++;
		if (size >= values.length) { // checks if array needs to update the lenght of the array
			resize();
		}
		values[size] = n; // then put in the new in to the array.
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		if (size > 0 ) {
		// takes the integer at size then decrease size integer.
		int temp = values[size--];
		return temp;
		}
		else {
			throw new IndexOutOfBoundsException("The stack is empty");
		}
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		if (size > 0) { // if the is empty then then there are no values in the array.
			return values[size]; 	// returns just the value of the last int in stack
		}
		else {
			throw new IndexOutOfBoundsException("The stack is empty");
		}
	}	
	

}
