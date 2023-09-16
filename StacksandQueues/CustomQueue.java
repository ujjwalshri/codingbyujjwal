package StacksandQueues;

public class CustomQueue {
	protected int []data;
	private int end=0;
	public CustomQueue(int size) {
		
		this.data = new int[size];
		
	}
	
	public void insert(int val) {
		if(isfull()) {
			
		}
		data[end]=val;
		end++;
	}
    public int remove() throws Exception {
    	if(isempty()) {
    		throw new Exception("fdhossh");
    	}
    	
    	
    	for(int i=1;i<end;i++) {
    		data[i-1]=data[i];
    	}
    	int removed = data[0];
    	for(int i=1;i<end;i++) {
    		data[i-1]=data[i];
    	}
    	return removed;
    }
    private boolean isempty() {
		// TODO Auto-generated method stub
		return end==0;
	}

	public void display() {
    	for(int i=0;i<end;i++) {
    		System.out.println(data[i]+" <-");
    	}
    	System.out.println("END");
    }

	private boolean isfull() {
		// TODO Auto-generated method stub
		return end==data.length;
	}
	

}
