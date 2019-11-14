package fa222rw_assign3.count_words;

import java.util.Iterator;


public class HashWordSet implements WordSet{
	// size of array.
	private int size =  0;
	// The buckets
	private Node[] buckets = new Node[8];

	// Iterator
	public Iterator<Word> iterator() {
		
		return new WordIterator();
	}
	
	// adds a word object to the hash array.
	public void add(Word word) {
		// get's the position which bucket the word is going into.
		int pos = getBucketPos(word);
		// makes the first node the first in the list in the bucket
		Node node = buckets[pos];
		// checks that the word is not in the list.
		while (node != null) {
			if (node.value.equals(word)) {
				// if the word exists just return nothing
				return;
			}
			else
				node = node.next;
		}
		// adds the word to the bucket 
		node = new Node(word);
		node.next = buckets[pos];
		buckets[pos] = node;
		// increase the size.
		size++;
		// if the size ia to big rehash to the node. 
		if(size == buckets.length)
			reHash();
			
		
	}

	
	private void reHash() {
		// makes a temp array with all the buckets.
		Node[] temp = buckets;
		// extends the bucket length by two
		buckets = new Node[2* temp.length];
		// resets the size
		size= 0;
		// adds everything in temp to the new buckets array.
		for (Node i : temp) {
			if (i == null) {
				continue;
			} 
				while (i != null) {
					add(i.value);
					i = i.next;
				}
		}
	}
	
	public boolean contains(Word word) {
		// finds the bucket the word should be in
		Node node = buckets[getBucketPos(word)];
		// checks if the word is in the list.
		while (node != null) {
			if(node.value.equals(word)) {
				// if it exist return true.
				return true;
			}
			else 
				node = node.next;
		}
		// the word is not there. 
		return false;
	}
	
	// returns the size.
	public int size() {
		return size;
	}
	// a basic hashih method that get the buckets position.
	private int getBucketPos(Word hash) {
		int pos = hash.hashCode();
		// if the postion for some reason is negativ makes it positiv. 
		if (pos < 0) {
			pos = -pos;
		}
		return pos % buckets.length;
	}
	private class WordIterator implements Iterator<Word>{
		private int index = 0;
		private Node node = buckets[index];
		@Override
		public boolean hasNext() {
			// if node or the value is null increase the index and start to check that. 
			if (node == null || node.value == null) {
				while (node == null && index != buckets.length-1) {
				node = buckets[++index];
				}
			}

			return index < buckets.length -1|| node != null;
		}

		@Override
		public Word next() {
			// take out the word value and go to the next node
			Word obj = node.value;
			node = node.next;
			
			// return the word.
			return obj;
		}
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
		
	}
	//our private inner node class
	private class Node {
		Word value;
		Node next = null;
		
		public Node(Word word) {value = word;}
		
		public String toString(){return value.toString();}
	}
}
