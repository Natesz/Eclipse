package interju;
import java.util.Stack;

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
	
	public void iterativeInorder(Node focusNode) {
		if(focusNode==null) return;
		Stack<Node> s = new Stack<Node>();
		
		while(true) {
			if(focusNode!=null) {
				s.push(focusNode);
				focusNode=focusNode.getLeft();
			}else {
				if(s.isEmpty()) break;
				focusNode=s.pop();
				System.out.println(focusNode);
				focusNode=focusNode.getRight();
				
			}
		}
	}
}

