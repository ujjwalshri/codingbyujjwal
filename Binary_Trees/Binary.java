package Binary_Trees;

import java.util.Scanner;

public class Binary {
	Binary(){
		
	}
	private static class Node{
		int val;
		Node left;
		Node right;
		Node(int val){
			this.val=val;
		}
	}
	private Node root;
	
	//inseting elements into the tree
	
	public void insert(Scanner scanner) {
		System.out.println("what value do you wanna add at root node");
		int value = scanner.nextInt();
		root=new Node(value);
		insert(scanner,root);
		
	}

	private void insert(Scanner scanner, Node node) {
		System.out.println("do you want to addd to the left of the "+ node.val );
		boolean left=scanner.nextBoolean();
		if(left) {
			System.out.println("enter the value you want to inser to the left");
			int val=scanner.nextInt();
			node.left=new Node(val);;
			insert(scanner,node.left);
		}
		System.out.println("do you want to addd to the right of the "+ node.val );
		boolean right=scanner.nextBoolean();
		if(right) {
			System.out.println("enter the value you want to inser to the right");
			int val=scanner.nextInt();
			node.right=new Node(val);;
			insert(scanner,node.right);

			
		}
		
	}

}
