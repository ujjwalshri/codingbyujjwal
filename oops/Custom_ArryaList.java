package oops;

import java.util.Arrays;

public class Custom_ArryaList {
	
	 private int[]data; 
	 



	private static int DEFAULT_SIZE;
	 private int size=0;
	 //we have to intialize our data array in the constructor
	 Custom_ArryaList(int num){
		 this.data=new int[this.DEFAULT_SIZE=num];
	 }
	 
	 public void add(int num) {
		 if(isfull()) {
			 resize();
		 }
		 data[size++]=num;
	 }
	private void resize() {
		int[]temp=new int[data.length *2];
		for(int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		data=temp;
		// TODO Auto-generated method stub
		
	}
	private boolean isfull() {
		if(size==DEFAULT_SIZE) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	public int size() {
		return size;
	}
	public void insert(int value) {
		data[size++]=value;
	}
	public int get(int index) {
		return data[index];
	}
	public void setIndex(int index,int value) {
		data[index]=value;
		
	}
	public String toString() {
		return "{"+ Arrays.toString(data)+ "}"+" size"+size;
	}
	
	
	
	public static void main(String[] args) {
		Custom_ArryaList list= new Custom_ArryaList(10);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		list.add(1212);
		System.out.println(list.size());
	    
		
		list.setIndex(0, 89898989);
		System.out.println(list.toString());
		
		
		
	
		
		
	}

	public static void main(String[] args) {
		
		list.add(1212);
				list.add(1212);
				list.add(1212);
				list.add(1212);
				list.add(1212);
				list.add(1212);
				list.add(1212);
	}


}
