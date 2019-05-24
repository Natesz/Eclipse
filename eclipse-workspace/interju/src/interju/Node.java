package interju;

public class Node{
	private int data;
	private Node left;
	private Node right;
	
	int getData() {
		return data;
	}
	
	void setData(int data) {
		this.data=data;
	}
	
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
}
