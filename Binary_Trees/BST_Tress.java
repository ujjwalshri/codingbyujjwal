package Binary_Trees;

public class BST_Tress {
	public BST_Tress() {
		
	}
	public class Node{
		private int val;
		private Node left;
		private Node right;
		private int height;
		public Node(int val) {
			this.val = val;
		}
	}
	private Node root;
	public int height(Node node) {
		if(node==null) {
			return -1;
		}
		return node.height;
	}
	public boolean isEmoty() {
		return root==null;
	}
	public void insert(int val) {
		root = insert(root,val);
	}
	private Node insert(Node node,int val) {
		if(node==null) {
			node = new Node(val);
			return node;
		}
		if(val<node.val) {
			node.left= insert(node.left,val);
		}
		if(val>node.val) {
			node.right=insert(node.right,val);
		}
		node.height= Math.max(height(node.left), height(node.right))+1;
		
	
		return node;
	}
	public boolean balanced() {
		return balanced(root);
	}
	private boolean balanced(Node node) {
		if(node==null) {
			return  true;
		}
		return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
	}
	public void display() {
		display(this.root,"Root node:");
	}
	private void display(Node node, String string) {
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		System.out.println(string+" "+node.val);
		display(node.left,"Left child of :"+node.val);
		
	   display(node.right,"right child of node"+node.val);
		
	}
	public void populate(int []arr) {
		for(int i=0;i<arr.length;i++) {
			insert(arr[i]);
		}
	}

}
