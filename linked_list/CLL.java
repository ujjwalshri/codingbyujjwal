package linked_list;

public class CLL {
	public CLL() {
		this.head = null;
		this.tail = null;
	}

	private Node head;
	private Node tail;
	
	public void insert(int val) {
		Node node= new Node(val);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		tail.next=node;
		node.next=head;
		tail=node;
	}
	public void display() {
		Node temp=head;
		if(head!=null) {
			do {
				System.out.print(temp.val+"->");
				temp=temp.next;
			}while(temp!=head);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private class Node{
		private int val;
		private Node next;
		public Node(int val) {
			
			this.val = val;
		}
		
	}

}
