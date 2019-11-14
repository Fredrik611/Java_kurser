package fa222rw_assign3.count_words;

import java.util.Iterator;

public class TreeWordSet implements WordSet {
	// the top of the tree
	private BST root = null;
	int size = 0;
	@Override
	public Iterator<Word> iterator() {
		
		return new TreeWordIterator();
	}
	
	// add function 
	@Override
	public void add(Word word) {
		// if it is the first item add the word to the root. 
		if (root == null) {
			size++;
			root = new BST(word);
		}
		// else start the recurtion method.
		else 
			root.add(word);

	}
	// checks if a word is in the tree
	@Override
	public boolean contains(Word word) {
		BST contains = new BST(word);
		return contains.contains(word);
	}
	// returns size.
	@Override
	public int size() {	
		return size;
	}
	private class TreeWordIterator implements Iterator<Word> {
		// the start 
		private BST next = root;
		public TreeWordIterator() {
			// if tree is empty return nothing.
			if (next == null) {
				return;
			}
			// goes to the furthers left as possible. 
			while (next.left != null) {
				next = next.left;
			}
		}
		@Override
		public boolean hasNext() {
			return next != null;
		}

		@Override
		public Word next() {
		     BST r = next;

		     // If you can walk right, walk right, then fully left.
		     // otherwise, walk up until you come from left.
		     if(next.right != null) {
		        next = next.right;
		        while (next.left != null)
		            next = next.left;
		        return r.value;
		     }
		     
		        while(true) {
		            if(next.parent == null) {
		                next = null;
		                return r.value;
		            }
		            if(next.parent.left == next) {
		               next = next.parent;
		               return r.value;
		            }
		            next = next.parent;
		        }
		     }
	}
	
	private class BST{
		// word object
		Word value;
		BST right = null;
		BST left = null;
		// only used in iterator.
		BST parent = null;
		
		BST(Word word) {
			value = word;
		}
		void add(Word word) {
			// compares the word lexicographically. 
			if (value.compareTo(word) > 0) {
				// if the node to the left is null add the word to it. 
				if (left == null) {
					size++;
					left = new BST(word);
					left.parent = this;
				}
				// of the node is not null start the add function again.
				else 
					left.add(word);
			}
			// compares the word lexicographically 
			else if (value.compareTo(word) < 0) {
				// if the node to the right is null add the word to it.
				if (right == null) {
					size++;
					right = new BST(word);
					right.parent = this;
				}
				// of the node is not null start the add function again.
				else 
					right.add(word);
			}
			
		}
		boolean contains(Word word) {
			// compares the words 
			if (value.compareTo(word) < 0) {
				// if left is null the word is not existing. (if the node is left it has gone thru the rest of the tree where the word could be.)
				if (left == null) 
					return false;
				// if left has a value it start to compare with the left node.
				else  
					left.contains(word);
			}
			// same as the as the code before.
			else if (value.compareTo(word) > 0) {
				if (right == null) 
					return false;
				else 
					right.contains(word);
			}
			// if this code comes here it the word exists in this node. (compareTo returns 0)
			return true;
		}
		}
	}

