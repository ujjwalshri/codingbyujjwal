package StacksandQueues;

public class CustomStack {
	protected int[]data;
	private static final int default_size=10;
	private int ptr=-1;
	 public CustomStack(){
		this(default_size);
	}
	public CustomStack(int size){
		this.data = new int[size];
	}
	public void push(int val) {
		ptr++;
		if(isfull()) {
			System.out.println("this stack is full the val cannot be inserted");
			return;
		}
		data[ptr]=val;
	}
	public boolean isfull() {
		
		// TODO Auto-generated method stub
		return ptr==data.length-1;
	}
	public int pop() {
		if(isempty()) {
			return -1;
		}
		
		return data[ptr--];
	}
	public boolean isempty() {
		// TODO Auto-generated method stub
		return ptr==-1;
	}
	public int peek() {
		return data[ptr];
	}
	

}
