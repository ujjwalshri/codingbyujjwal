package StacksandQueues;

public class DyanamicStack extends CustomStack{
	public DyanamicStack() {
		super();
	}
	public DyanamicStack(int size) {
		super(size);
	}
	@Override
	public void push(int val) {
		//O(n) time complexity
		// TODO Auto-generated method stub
		if(this.isfull()) {
			//double the array
			int [] temp = new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			data=temp;
			 super.push(val);
		}
	}
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return super.pop();
	}
	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return super.peek();
	}
	

}
