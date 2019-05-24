package interju;

/*class Node{
	private int data;
	private Node left;
	private Node right;
	
	Node getLeft() {
		return left;
	}
	
	void setLeft(Node left) {
		this.left=left;
	}
	
	Node getRight() {
		return right;
	}
	
	void setRight(Node right) {
		this.right=right;
	}
	
	
	public String toString() {
		return "a node data: " + data;
	}
}*/

/*
class BST{
	
	public Node createNewNode(int k) {
		Node a = new Node();
		a.setLeft(null);
		a.setRight(null);
		a.setData(k);
		return a;
	}
	
	public Node Insert(Node node, int val) {
		if(node == null) {
			return createNewNode(val);
		}
		
		if(val < node.getData()) {
			node.setLeft(Insert(node.getLeft(),val));
		}else if(val > node.getData()) {
			node.setRight(Insert(node.getRight(),val));
		}
		
		return node;
	}
	
	public void inOrderTraversal(Node focusNode) {
		
		if(focusNode != null) {
			
			inOrderTraversal(focusNode.getLeft());
			System.out.println(focusNode);
			inOrderTraversal(focusNode.getRight());
			
		}
	}
}*/

public class BSTApp {
	public static void main(String args[]) {
		BST a = new BST();
		Node root = null;
		
		
		
		root = a.Insert(root, 8);
		
		
		a.iterativeInorder(root);
		
		Node n9= new Node();
		n9.setData(9);
		root.setLeft(n9);
		a.iterativeInorder(root);
		/*root = a.Insert(root, 1);
		root = a.Insert(root, 15);*/
		
		//a.iterativeInorder(root);
		//a.inOrderTraversal(root);
	}
}
