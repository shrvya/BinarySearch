package binaryseach;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	/**
	 * method to add a key to the binary search tree key element to be added returns
	 * nothing
	 */
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	/**
	 * method containing steps of insertion current node where the element is to be
	 * added key element to be added return root of the tree
	 */
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	/**
	 * method to get the number of elements return size of the tree
	 */
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	/**
	 * Method which actually consisting of steps current current root return size of
	 * the tree
	 */
	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	/**
	 * method to print the elements
	 */
	public void getNodes() {
		this.printNodes(root);
	}

	/**
	 * prints the elements in inorder fashion root root of the tree
	 */
	private void printNodes(MyBinaryNode<K> root) {
		if (root == null)
			return;
		printNodes(root.left);
		System.out.print(root.key + " ");
		printNodes(root.right);
	}

	/**
	 * method to search for a key key element to be searched
	 */
	public void search(K key) {
		this.searchNodes(key, root);
	}

	/**
	 * actual method to implement search operation key element to be searched root
	 * position of last search
	 */
	private void searchNodes(K key, MyBinaryNode<K> root) {
		if (root == null) {
			System.out.println("Key not found");
			return;
		}
		int compareResult = key.compareTo(root.key);
		if (compareResult == 0)
			System.out.println(key + " is found");
		else if (compareResult < 0)
			searchNodes(key, root.left);
		else
			searchNodes(key, root.right);
	}

}