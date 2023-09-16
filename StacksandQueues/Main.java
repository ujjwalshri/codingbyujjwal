package StacksandQueues;

public class Main {
	public static void main(String[] args) {
		CustomStack stack = new CustomStack(6);
		stack.push(65);
		stack.push(65);
		stack.push(65);
		stack.push(65);
		stack.push(65);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
