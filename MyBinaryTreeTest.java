package binaryseach;

/**
 * Implementation of binary search tree and different test cases
 */
public class MyBinaryTreeTest {

	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		System.out.println("size of tree is " + myBinaryTree.getSize());
		myBinaryTree.getNodes();
		System.out.println();
		myBinaryTree.search(63);

	}

}