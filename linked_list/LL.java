package linked_list;

public class LL {
	private Node head;
	private Node tail;
	private int size;
	
	
	public LL() {
		
		this.size = 0;
	}
	//insert in the linked list using recursion
	public void insertRec(int val,int index) {
		head=insert(val,index,head);
	}
	private Node insert(int val,int index,Node node) {
		if(index==0) {
			Node temp= new Node(val,node);
			size++;
			return temp;
		}
		node.next=insert(val,index-1,node.next);
		return node;
		
		
	}
	
	//to find the reference to the node pointing to a particular value
	public Node find(int val) {
		Node temp=head;
		while(temp!=null) {
			if(temp.value==val) {
				return temp;
			}
			temp=temp.next;
		}
		return null;
	}
	public int deleteFirst() {
		int val= head.value;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		return val;
		
	}
	
	//to delete a value at a particular index
	public int delete(int index) {
		if(index==0) {
			return deleteFirst();
		}
		if(index==size-1) {
			return deleteLast();
		}
		Node prev= get(index-1);
		int val=prev.next.value;
		prev.next=prev.next.next;
		return val;
	}
	
	public Node get(int index) {
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondlast=get(size-2);
		int val=tail.value;
		tail=secondlast;
		tail.next=null;
		
		return val;
	}
	public int size() {
		return size;
	}
	public void insert(int val, int index) {
		if(index>size) {
			System.out.println("invalid index given");
			return;
		}
		if(index==0) {
			insertFirst(val);
			
		}
		if(index==size) {
			append(val);
		}
		Node temp= head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node node = new Node(val,temp.next);
		temp.next=node;
		size++;
	}
	public void append(int val) {
		Node node = new Node(val);
		if(tail==null) {
			insertFirst(val);
			return;
		}
		
		tail.next=node;
		tail=node;
		size++;
	}
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size+=1;
	}
	public void display() {
		Node temp= head;
		while(temp!=null) {
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println("END");
		
	}


	private class Node{
		private int value;
		private Node next;
		public Node(int value) {
			
			this.value = value;
		}
		public Node(int value, Node next) {
			
			this.value = value;
			this.next = next;
		}
		
		
		
	}

}
